package disco.foundation.discoprotocol.data

import android.content.Context
import disco.foundation.discoprotocol.models.DiscoBalance
import disco.foundation.discoprotocol.ProtoDiscoBalance
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.withContext
import java.lang.Exception

class DiscoBalanceStoreManager(context: Context){

    private val balanceDatastore = context.discoBalanceDataStore

    suspend fun saveBalance(product: DiscoBalance){
        withContext(Dispatchers.IO){
            try {
                balanceDatastore.updateData {
                    product.toProtoProduct()
                }
            } catch (e: Exception){
                e.printStackTrace()
            }
        }
    }

    suspend fun getBalance() : DiscoBalance? {
        return withContext(Dispatchers.IO) {
            try {
                val data = balanceDatastore.data.first()
                withContext(Dispatchers.Main) {
                    data.toDiscoBalance() }
            } catch (e: Exception) {
                e.printStackTrace()
                withContext(Dispatchers.Main) { null }
            }
        }
    }


    suspend fun clear(){
        withContext(Dispatchers.IO) {
            balanceDatastore.updateData {
                it.toBuilder().clear().build()
            }
        }
    }


    private fun ProtoDiscoBalance.toDiscoBalance(): DiscoBalance {
        return DiscoBalance(this.amount, this.mint )
    }

    private fun DiscoBalance.toProtoProduct(): ProtoDiscoBalance {
        return ProtoDiscoBalance.newBuilder()
            .setAmount(this.amount)
            .setMint(this.mint)
            .build()
    }


}