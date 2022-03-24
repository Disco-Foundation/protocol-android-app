package disco.foundation.discoprotocol.viewModels

import android.annotation.SuppressLint
import android.graphics.Bitmap
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import disco.foundation.discoprotocol.R
import disco.foundation.discoprotocol.api.RequestStatus
import disco.foundation.discoprotocol.data.ProtoDataStoreManager
import disco.foundation.discoprotocol.utils.singleArgViewModelFactory
import disco.foundation.discoprotocol.utils.solana.actions.waitingForTransaction
import com.google.gson.Gson
import com.google.zxing.BarcodeFormat
import com.google.zxing.MultiFormatWriter
import com.google.zxing.WriterException
import com.solana.Solana
import com.solana.core.Account
import com.solana.core.PublicKey
import com.solana.networking.NetworkingRouter
import com.solana.networking.RPCEndpoint
import disco.foundation.discoprotocol.api.RequestResult
import disco.foundation.discoprotocol.api.models.*
import disco.foundation.discoprotocol.utils.ACCEPTED_MINT
import disco.foundation.discoprotocol.utils.ModuleType
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ReadQrViewModel(private val manager: ProtoDataStoreManager) : ViewModel() {

    companion object {
        val FACTORY = singleArgViewModelFactory(::ReadQrViewModel)
    }
    private val solana = Solana(NetworkingRouter(RPCEndpoint.devnetSolana))
    private var _module: ModuleType = ModuleType.CHECK_IN

    var link: MutableLiveData<String> = MutableLiveData()
    var waitingStatus: MutableLiveData<RequestStatus> = MutableLiveData()
    var rechargeText: MutableLiveData<String?> = MutableLiveData()

    var module: ModuleType
        get() = _module
        set(value){
            _module = value
        }

    // UI Text
    fun getTextBoxResource(): Int {
        return when(module) {
            ModuleType.CHECK_IN -> R.string.sign_transaction
            else -> R.string.sign_transaction_amount
        }
    }

    fun getSuccessText(): Int {
        return when(module) {
            ModuleType.CHECK_IN -> R.string.check_in_successful
            ModuleType.RECHARGE -> R.string.recharge_successful
            else -> R.string.purchase_successful
        }
    }

    // copy this method to your class
    @SuppressLint("ResourceAsColor")
    fun generateQRCode(text: String, color: Int): Bitmap {
        val width = 500
        val height = 500
        val bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
        val codeWriter = MultiFormatWriter()
        try {
            val bitMatrix = codeWriter.encode(text, BarcodeFormat.QR_CODE, width, height)
            for (x in 0 until width) {
                for (y in 0 until height) {
                    bitmap.setPixel(x, y, if (bitMatrix[x, y]) R.color.background else color)
                }
            }
        } catch (e: WriterException) { println( "generateQRCode: ${e.message}") }
        return bitmap
    }

    fun startTransaction(){
        when(module){
            ModuleType.CHECK_IN -> generateCheckingTransaction()
            ModuleType.RECHARGE -> generateRechargeTransaction()
            else -> {}
        }
    }


    private fun generateCheckingTransaction(){
        viewModelScope.launch {
            waitingStatus.postValue(RequestStatus.LOADING)

            val currentEvent = manager.getCurrentEvent()
            val currentTicket = manager.getCurrentTicket()
            val reference = Account().publicKey

            val requestInstruction = CheckInRequestBodyInstruction(
                PIN = currentTicket.pin,
                wearableId = currentTicket.wearableId,
                eventId = currentEvent?.eventId ?: ""
            )
            val requestAction = ActionType.CHECKIN.toString()
            val requestBody = CheckInRequestBody(
                action = requestAction,
                instruction = requestInstruction,
                reference = reference.toBase58()
            )

            link.postValue(Gson().toJson(requestBody))
            startWaitingTransaction(reference)
        }
    }

    private suspend fun startWaitingTransaction(referencePublicKey: PublicKey) {
        withContext(Dispatchers.IO) {
            val response =
                waitingForTransaction(solana, referencePublicKey)
            if (response != null) {
                viewModelScope.launch {
                    if (response is RequestResult.Error) {
                        waitingStatus.postValue(RequestStatus.ERROR)
                    } else {
                        waitingStatus.postValue(RequestStatus.SUCCESS)
                    }
                }
            } else {
                waitingStatus.postValue(RequestStatus.ERROR)
            }
        }
    }

    private fun generateRechargeTransaction(){
       viewModelScope.launch {
           val currentEvent = manager.getCurrentEvent()
           val currentTicket = manager.getCurrentTicket()
           val currentBalance = manager.getCurrentBalance()
           val reference = Account().publicKey

           val requestData = RechargeInstructionDataBody(
               amount = currentBalance.amount,
               wearableId = currentTicket.wearableId,
               eventId = currentEvent?.eventId ?: ""
           )
           val requestBody = RechargeInstructionBody(
               ActionType.RECHARGE.toString(),
               instruction = requestData,
               reference = reference.toBase58()
           )

           rechargeText.postValue("We'll charge you ${currentBalance.amount} $ACCEPTED_MINT")

           link.postValue(Gson().toJson(requestBody))
           startWaitingTransaction(reference)
       }
    }
}