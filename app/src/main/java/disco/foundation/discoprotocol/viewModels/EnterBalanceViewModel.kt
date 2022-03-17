package disco.foundation.discoprotocol.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import disco.foundation.discoprotocol.utils.ModuleType
import disco.foundation.discoprotocol.R
import disco.foundation.discoprotocol.api.RequestStatus
import disco.foundation.discoprotocol.data.ProtoDataStoreManager
import disco.foundation.discoprotocol.models.DiscoBalance
import disco.foundation.discoprotocol.utils.singleArgViewModelFactory
import disco.foundation.discoprotocol.utils.twoDecimalDouble
import kotlinx.coroutines.launch

class EnterBalanceViewModel(private val manager: ProtoDataStoreManager) : ViewModel() {

    companion object {
        val FACTORY = singleArgViewModelFactory(::EnterBalanceViewModel)
    }

    private var _module: ModuleType = ModuleType.RECHARGE
    var saving: MutableLiveData<RequestStatus> = MutableLiveData()

    var module
        get() = _module
        set(value) {
            _module = value
        }

    fun getTextBoxText(): Int {
        return when(module) {
            ModuleType.RECHARGE -> R.string.enter_amount
            else -> R.string.enter_amount_purchase
        }
    }

    fun saveBalance(amount: Double){
        saving.value = RequestStatus.LOADING
        viewModelScope.launch {
            manager.setCurrentBalance(
                DiscoBalance(amount = amount.twoDecimalDouble())
            )
            saving.postValue(RequestStatus.SUCCESS)
        }
    }

    fun clearData(){
        saving.value = RequestStatus.NOTHING
    }

}