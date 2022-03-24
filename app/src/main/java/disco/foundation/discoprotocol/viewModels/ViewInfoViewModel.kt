package disco.foundation.discoprotocol.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import disco.foundation.discoprotocol.api.ApiAdapter
import disco.foundation.discoprotocol.api.RequestStatus
import disco.foundation.discoprotocol.data.ProtoDataStoreManager
import disco.foundation.discoprotocol.models.DiscoTicket
import disco.foundation.discoprotocol.utils.ModuleType
import disco.foundation.discoprotocol.utils.singleArgViewModelFactory
import disco.foundation.discoprotocol.utils.twoDecimalDouble
import kotlinx.coroutines.launch

class ViewInfoViewModel(private val manager: ProtoDataStoreManager) : ViewModel() {

    companion object {
        val FACTORY = singleArgViewModelFactory(::ViewInfoViewModel)
    }

    var loading: MutableLiveData<RequestStatus> = MutableLiveData()
    var ticket: MutableLiveData<DiscoTicket> = MutableLiveData()
    private var _module: ModuleType = ModuleType.VIEW_INFO

    var module
        get() = _module
        set(value) {
            _module = value
        }

    fun loadTicketInfo(){
        loading.postValue(RequestStatus.LOADING)
        viewModelScope.launch {
            val currentEvent = manager.getCurrentEvent()
            val currentTicket = manager.getCurrentTicket()

            val response = ApiAdapter.apiClient.getWearableInfo(
                currentTicket.wearableId,
                currentEvent?.eventId ?: "").body()

            if (response != null) {
                try {
                    currentTicket.id = response.wearable.pubKey
                    currentTicket.ownerAddress = response.wearable.wearableVaultPubKey
                    currentTicket.balance = response.wearable.balance.twoDecimalDouble()
                    currentTicket.secured = true
                    manager.setCurrentTicket(currentTicket)

                    ticket.postValue(currentTicket)
                    loading.postValue(RequestStatus.SUCCESS)
                } catch (e: Exception){
                    loading.postValue(RequestStatus.ERROR)
                }
            } else {  loading.postValue(RequestStatus.ERROR) }
        }
    }

}
