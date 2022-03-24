package disco.foundation.discoprotocol.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.gson.Gson
import disco.foundation.discoprotocol.api.RequestStatus
import disco.foundation.discoprotocol.models.DiscoEvent
import disco.foundation.discoprotocol.data.ProtoDataStoreManager
import disco.foundation.discoprotocol.utils.singleArgViewModelFactory
import kotlinx.coroutines.launch

class ReadQRCameraViewModel(private val manager: ProtoDataStoreManager) : ViewModel() {
    companion object {
        val FACTORY = singleArgViewModelFactory(::ReadQRCameraViewModel)
    }

    var loading: MutableLiveData<RequestStatus> = MutableLiveData()

    fun setupEvent(value: String){
        loading.postValue(RequestStatus.LOADING)
        viewModelScope.launch {
            var gson = Gson()
            try {
                val newEvent = gson.fromJson(value, DiscoEvent::class.java)
                if (newEvent != null) {
                    manager.setCurrentEvent(newEvent)
                    loading.postValue(RequestStatus.SUCCESS)
                } else {
                    loading.postValue(RequestStatus.ERROR)
                }
            } catch (e: Exception){
                loading.postValue(RequestStatus.ERROR)
            }
        }
    }
}