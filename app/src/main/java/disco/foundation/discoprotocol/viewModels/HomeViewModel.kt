package disco.foundation.discoprotocol.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import disco.foundation.discoprotocol.R
import disco.foundation.discoprotocol.api.RequestStatus
import disco.foundation.discoprotocol.data.ProtoDataStoreManager
import disco.foundation.discoprotocol.utils.singleArgViewModelFactory
import kotlinx.coroutines.launch

class HomeViewModel(private val manager: ProtoDataStoreManager) : ViewModel() {

    companion object {
        val FACTORY = singleArgViewModelFactory(::HomeViewModel)
    }

    var liveEvent: MutableLiveData<RequestStatus> = MutableLiveData()
    var errorMsg: Int? = null

    fun getEvent(){
        viewModelScope.launch {
            liveEvent.postValue(RequestStatus.LOADING)
            clearOldData()
            val currentEvent = manager.getCurrentEvent()
            if (currentEvent?.eventId?.isEmpty() == true){
                errorMsg = R.string.need_setup_event
                liveEvent.postValue(RequestStatus.ERROR)
            } else{
                liveEvent.postValue(RequestStatus.SUCCESS)
            }
        }
    }

    private suspend fun clearOldData(){
        manager.clearCurrentTicket()
        manager.clearCurrentBalance()
    }

}
