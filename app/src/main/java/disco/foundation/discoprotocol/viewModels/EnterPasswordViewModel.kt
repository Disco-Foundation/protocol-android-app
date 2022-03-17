package disco.foundation.discoprotocol.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import disco.foundation.discoprotocol.R
import disco.foundation.discoprotocol.api.ApiAdapter
import disco.foundation.discoprotocol.api.RequestStatus
import disco.foundation.discoprotocol.api.models.PurchaseRequestBody
import disco.foundation.discoprotocol.components.TicketInfoType
import disco.foundation.discoprotocol.data.ProtoDataStoreManager
import disco.foundation.discoprotocol.models.DiscoTicket
import disco.foundation.discoprotocol.utils.*
import kotlinx.coroutines.launch

class EnterPasswordViewModel(private val manager: ProtoDataStoreManager) : ViewModel() {

    companion object {
        val FACTORY = singleArgViewModelFactory(::EnterPasswordViewModel)
    }

    var ticket: MutableLiveData<DiscoTicket> = MutableLiveData()
    var saving: MutableLiveData<RequestStatus> = MutableLiveData()
    var loading: MutableLiveData<RequestStatus> = MutableLiveData()
    var purchaseText: MutableLiveData<String?> = MutableLiveData()

    private var _module: ModuleType = ModuleType.RECHARGE
    var module
        get() = _module
        set(value) {
            _module = value
        }

    fun getInfoCardType(): TicketInfoType {
        return when (module) {
            ModuleType.CHECK_IN -> TicketInfoType.PARTIAL_ID
            else -> TicketInfoType.PARTIAL_BALANCE
        }
    }

    fun getTextBoxText(): Int {
        return when(module) {
            ModuleType.CHECK_IN -> R.string.enter_password
            else -> R.string.enter_wearable_pwd
        }
    }

    val confirmPwdDescription = R.string.confirm_password

    fun shouldAskConfirmation(): Boolean {
        return when(module){
            ModuleType.CHECK_IN -> true
            else -> false
        }
    }

    fun goHomeAfter(): Boolean {
        return false
    }

    fun getProcessingText(): Int {
        return when(module){
            ModuleType.CHECK_IN -> R.string.securing_wearable
            else -> R.string.processing
        }
    }

    fun getSuccessProcessingText(): Int {
        return when(module){
            ModuleType.CHECK_IN -> R.string.wearable_secured
            ModuleType.RECHARGE -> R.string.recharge_successful
            else -> R.string.purchase_successful
        }
    }

    fun loadTicket(){
        when(module){
            ModuleType.CHECK_IN -> loadTicketFromStore()
            else -> loadTicketFromApi()
        }
    }

    private fun loadTicketFromStore(){
        loading.postValue(RequestStatus.LOADING)
        viewModelScope.launch {
            ticket.postValue(manager.getCurrentTicket())
            loading.postValue(RequestStatus.SUCCESS)
        }
    }

    private fun loadTicketFromApi(){
        loading.postValue(RequestStatus.LOADING)
        viewModelScope.launch {
            val event = manager.getCurrentEvent()
            val currentTicket = manager.getCurrentTicket()
            val currentBalance = manager.getCurrentBalance()

            purchaseText.postValue("We'll charge you ${currentBalance.amount} $ACCEPTED_MINT")

            val response = ApiAdapter.apiClient.getWearableInfo(
                currentTicket.wearableId,
                    event.publicKey).body()

            if (response != null) {
                val newTicket = DiscoTicket(
                    id = response.wearable.pubKey,
                    wearableId = currentTicket.wearableId,
                    ownerAddress = response.wearable.wearableVaultPubKey,
                    balance = response.wearable.balance.twoDecimalDouble(),
                    secured = true
                )
                manager.setCurrentTicket(newTicket)
                ticket.postValue(newTicket)
                loading.postValue(RequestStatus.SUCCESS)

            } else {  loading.postValue(RequestStatus.ERROR) }
        }
    }

    fun checkValidPassword(value: String){
        saving.postValue(RequestStatus.LOADING)
        viewModelScope.launch {
            val currentTicket = ticket.value
            if (currentTicket != null) {
                currentTicket.pin = value
                currentTicket.secured = true

                val event = manager.getCurrentEvent()
                val currentBalance = manager.getCurrentBalance()

                val requestBody = PurchaseRequestBody(
                    amount = currentBalance.amount,
                    pin = value,
                    wearableId = currentTicket.wearableId,
                    eventId = event.publicKey
                )

                val response = ApiAdapter.apiClient.purchase(requestBody).body()
                if(response?.status == true){
                    currentTicket.balance = currentTicket.balance - currentBalance.amount
                    manager.setCurrentTicket(currentTicket)
                    saving.postValue(RequestStatus.SUCCESS)
                } else {
                    saving.postValue(RequestStatus.ERROR)
                }

            } else {
                saving.postValue(RequestStatus.ERROR)
            }
        }
    }

    fun saveNewPassword(value: String){
        saving.postValue(RequestStatus.LOADING)
        viewModelScope.launch {
            val currentTicket = manager.getCurrentTicket()
            currentTicket.pin = value
            manager.setCurrentTicket(currentTicket)
            saving.postValue(RequestStatus.SUCCESS)
        }
    }

    fun clearData(){
        loading.value = RequestStatus.NOTHING
        saving.value = RequestStatus.NOTHING
    }
}

