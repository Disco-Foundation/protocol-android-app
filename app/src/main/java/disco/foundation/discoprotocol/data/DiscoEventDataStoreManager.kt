package disco.foundation.discoprotocol.data

import android.content.Context
import disco.foundation.discoprotocol.ProtoDiscoEvent
import disco.foundation.discoprotocol.models.DiscoEvent
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.withContext
import java.lang.Exception

class DiscoEventDataStoreManager(context: Context){

    private val eventDatastore = context.discoEventDataStore

    suspend fun saveEvent(event: DiscoEvent){
        withContext(Dispatchers.IO){
            try {
                eventDatastore.updateData {
                    event.toProtoDiscoEvent()
                }
            } catch (e: Exception){
                e.printStackTrace()
            }
        }
    }

    suspend fun getEvent() : DiscoEvent? {
        return withContext(Dispatchers.IO) {
            try {
                val data = eventDatastore.data.first()
                withContext(Dispatchers.Main) { data.toDiscoEvent() }
            } catch (e: Exception) {
                e.printStackTrace()
                withContext(Dispatchers.Main) { null }
            }
        }
    }

    suspend fun clear(){
        withContext(Dispatchers.IO) {
            eventDatastore.updateData {
                it.toBuilder().clear().build()
            }
        }
    }

    private fun ProtoDiscoEvent.toDiscoEvent(): DiscoEvent {
        return DiscoEvent(this.publicKey, this.name)
    }

    private fun DiscoEvent.toProtoDiscoEvent(): ProtoDiscoEvent {
        return ProtoDiscoEvent.newBuilder()
            .setName(this.name)
            .setPublicKey(this.publicKey)
            .build()
    }
}