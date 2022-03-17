package disco.foundation.discoprotocol.data

import android.content.Context
import disco.foundation.discoprotocol.models.DiscoBalance
import disco.foundation.discoprotocol.models.DiscoEvent
import disco.foundation.discoprotocol.models.DiscoTicket
import disco.foundation.discoprotocol.utils.EVENT_ID

class ProtoDataStoreManager(context: Context){

    /*  Disco Event Data Store Manager  */
    private val discoEventDatastore = DiscoEventDataStoreManager(context)

    /* Disco Ticket Data Store Manager  */
    private val discoTicketDatastore = DiscoTicketDataStoreManager(context)

    /* Disco Balance Data Store Manager */
    private val discoBalanceDataStore = DiscoBalanceStoreManager(context)

    suspend fun getCurrentEvent(): DiscoEvent {
        return discoEventDatastore.getEvent() ?: DiscoEvent(EVENT_ID)
    }

    suspend fun setCurrentEvent(event: DiscoEvent){
        discoEventDatastore.saveEvent(event)
    }

    suspend fun getCurrentTicket(): DiscoTicket {
        return discoTicketDatastore.getTicket() ?: DiscoTicket()
    }

    suspend fun setCurrentTicket(ticket: DiscoTicket){
        discoTicketDatastore.saveTicket(ticket)
    }

    suspend fun clearCurrentTicket(){
        discoTicketDatastore.clear()
    }

    suspend fun getCurrentBalance(): DiscoBalance {
        return discoBalanceDataStore.getBalance() ?: DiscoBalance()
    }

    suspend fun setCurrentBalance(balance: DiscoBalance){
        discoBalanceDataStore.saveBalance(balance)
    }

    suspend fun clearCurrentBalance(){
        discoBalanceDataStore.clear()
    }
}