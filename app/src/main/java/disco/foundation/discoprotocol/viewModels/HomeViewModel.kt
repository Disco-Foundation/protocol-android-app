package disco.foundation.discoprotocol.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import disco.foundation.discoprotocol.api.RequestStatus
import disco.foundation.discoprotocol.data.ProtoDataStoreManager
import disco.foundation.discoprotocol.models.DiscoEvent
import disco.foundation.discoprotocol.utils.EVENT_ID
import disco.foundation.discoprotocol.utils.singleArgViewModelFactory
import kotlinx.coroutines.launch

class HomeViewModel(private val manager: ProtoDataStoreManager) : ViewModel() {

    companion object {
        val FACTORY = singleArgViewModelFactory(::HomeViewModel)
    }

    var liveEvent: MutableLiveData<RequestStatus> = MutableLiveData()

    fun getEvent(){
        liveEvent.value = RequestStatus.LOADING
        viewModelScope.launch {
            clearOldData()
            val newEvent = DiscoEvent(EVENT_ID)
            manager.setCurrentEvent(newEvent)
            liveEvent.value = RequestStatus.SUCCESS
        }
    }

    private suspend fun clearOldData(){
        manager.clearCurrentTicket()
        manager.clearCurrentBalance()
    }

}
