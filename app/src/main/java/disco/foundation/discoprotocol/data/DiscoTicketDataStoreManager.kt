package disco.foundation.discoprotocol.data

import android.content.Context
import disco.foundation.discoprotocol.ProtoDiscoTicket
import disco.foundation.discoprotocol.models.DiscoTicket
import disco.foundation.discoprotocol.models.TicketStatus
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.withContext
import java.lang.Exception
import java.util.*

class DiscoTicketDataStoreManager (context: Context){

    private val ticketDatastore = context.discoTicketDataStore

    suspend fun saveTicket(ticket: DiscoTicket){
        withContext(Dispatchers.IO){
            try {
                ticketDatastore.updateData {
                    ticket.toProtoTicket()
                }
            } catch (e: Exception){
                e.printStackTrace()
            }
        }
    }

    suspend fun getTicket() : DiscoTicket? {
        return withContext(Dispatchers.IO) {
            try {
                val data = ticketDatastore.data.first()
                withContext(Dispatchers.Main) { data.toTicket() }
            } catch (e: Exception) {
                e.printStackTrace()
                withContext(Dispatchers.Main) { null }
            }
        }
    }

    suspend fun clear(){
        withContext(Dispatchers.IO) {
            ticketDatastore.updateData {
                it.toBuilder().clear().build()
            }
        }
    }

    private fun ProtoDiscoTicket.toTicket(): DiscoTicket {
        return DiscoTicket(
            id= this.publicKey,
            type = this.ticketType,
            status = getStatusFromProtoStatus(this.status),
            checkInDate = Date(this.checkInDate),
            wearableId = this.wearableID.toBigInteger(),
            ownerAddress = this.ownerID,
            balance = this.balance,
            pin = this.pin
        )
    }

    private fun DiscoTicket.toProtoTicket(): ProtoDiscoTicket {
        return ProtoDiscoTicket.newBuilder()
            .setPublicKey(this.id)
            .setWearableID(this.wearableId.toString())
            .setStatus(getProtoStatusFromStatus(this.status))
            .setOwnerID(this.ownerAddress)
            .setCheckInDate(this.checkInDate.toString())
            .setBalance(this.balance)
            .setTicketType(this.type)
            .setPin(this.pin)
            .build()
    }

    private fun getProtoStatusFromStatus(status: TicketStatus): ProtoDiscoTicket.Status{
        return when (status) {
            TicketStatus.VERIFIED -> {
                ProtoDiscoTicket.Status.VERIFIED
            } else -> {
                ProtoDiscoTicket.Status.PENDING
            }
        }
    }

    private fun getStatusFromProtoStatus(status: ProtoDiscoTicket.Status): TicketStatus {
        return when (status) {
            ProtoDiscoTicket.Status.VERIFIED -> {
                TicketStatus.VERIFIED
            }
            else -> {
                TicketStatus.PENDING
            }
        }
    }

}