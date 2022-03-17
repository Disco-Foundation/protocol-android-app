package disco.foundation.discoprotocol.viewModels

import android.nfc.Tag
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import disco.foundation.discoprotocol.utils.ModuleType
import disco.foundation.discoprotocol.api.RequestStatus
import disco.foundation.discoprotocol.data.ProtoDataStoreManager
import disco.foundation.discoprotocol.utils.toBigIntegerString
import disco.foundation.discoprotocol.utils.singleArgViewModelFactory
import kotlinx.coroutines.launch

class ReadNfcViewModel(private val manager: ProtoDataStoreManager) : ViewModel() {

    companion object {
        val FACTORY = singleArgViewModelFactory(::ReadNfcViewModel)
    }

    private var _module: ModuleType = ModuleType.CHECK_IN
    var loading: MutableLiveData<RequestStatus> = MutableLiveData()

    var module: ModuleType
        get() = _module
        set(value){
            _module = value
        }

    private fun byteArrayToStr(arr: ByteArray?): String {
        if (arr == null) {
            return ""
        }
        val sb = StringBuilder(arr.size * 3 + 3)
        for (i in arr.indices) {
            sb.append(String.format("%02X ", arr[i]))
        }
        return sb.toString()
    }

    fun readDiscoveredTag(tag: Tag?) {
        // read Tag ID
        loading.postValue(RequestStatus.LOADING)
        val tagIDString: String = byteArrayToStr(tag?.id).filterNot { it.isWhitespace() }
        handleTagAction(tagIDString.toBigIntegerString())
    }

    private fun handleTagAction(id: String){
        saveWearableId(id)
    }

    private fun saveWearableId(id: String){
        viewModelScope.launch {
            val currentTicket = manager.getCurrentTicket()
            currentTicket.wearableId = id.toBigInteger()

            manager.setCurrentTicket(currentTicket)
            loading.postValue(RequestStatus.SUCCESS)
        }
    }

    fun clearData() {
        loading.postValue(RequestStatus.NOTHING)
    }
}