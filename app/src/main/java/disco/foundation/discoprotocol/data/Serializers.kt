package disco.foundation.discoprotocol.data

import android.content.Context
import androidx.datastore.core.CorruptionException
import androidx.datastore.core.DataStore
import androidx.datastore.core.Serializer
import androidx.datastore.dataStore
import disco.foundation.discoprotocol.*
import com.google.protobuf.InvalidProtocolBufferException
import java.io.InputStream
import java.io.OutputStream

object ProtoDiscoEventSerializer: Serializer<ProtoDiscoEvent> {
    override val defaultValue: ProtoDiscoEvent = ProtoDiscoEvent.getDefaultInstance()
    override suspend fun readFrom(input: InputStream): ProtoDiscoEvent {
        return try {
            ProtoDiscoEvent.parseFrom(input)
        } catch (exception: InvalidProtocolBufferException) {
            throw CorruptionException("Cannot read proto.", exception)
        }
    }

    override suspend fun writeTo(t: ProtoDiscoEvent, output: OutputStream) = t.writeTo(output)
}

object ProtoDiscoBalanceSerializer: Serializer<ProtoDiscoBalance> {
    override val defaultValue: ProtoDiscoBalance = ProtoDiscoBalance.getDefaultInstance()
    override suspend fun readFrom(input: InputStream): ProtoDiscoBalance {
        return try {
            ProtoDiscoBalance.parseFrom(input)
        } catch (exception: InvalidProtocolBufferException) {
            throw CorruptionException("Cannot read proto.", exception)
        }
    }

    override suspend fun writeTo(t: ProtoDiscoBalance, output: OutputStream) = t.writeTo(output)
}

object ProtoDiscoTicketSerializer: Serializer<ProtoDiscoTicket> {
    override val defaultValue: ProtoDiscoTicket = ProtoDiscoTicket.getDefaultInstance()
    override suspend fun readFrom(input: InputStream): ProtoDiscoTicket {
        return try {
            ProtoDiscoTicket.parseFrom(input)
        } catch (exception: InvalidProtocolBufferException) {
            throw CorruptionException("Cannot read proto.", exception)
        }
    }

    override suspend fun writeTo(t: ProtoDiscoTicket, output: OutputStream) = t.writeTo(output)
}

private const val EVENT_DATA_STORE_FILE_NAME = "event.pb"
val Context.discoEventDataStore: DataStore<ProtoDiscoEvent> by dataStore(
    fileName = EVENT_DATA_STORE_FILE_NAME,
    serializer = ProtoDiscoEventSerializer
)

private const val BALANCE_DATA_STORE_FILE_NAME = "balance.pb"
val Context.discoBalanceDataStore: DataStore<ProtoDiscoBalance> by dataStore(
    fileName = BALANCE_DATA_STORE_FILE_NAME,
    serializer = ProtoDiscoBalanceSerializer
)

private const val TICKET_DATA_STORE_FILE_NAME = "ticket.pb"
val Context.discoTicketDataStore: DataStore<ProtoDiscoTicket> by dataStore(
    fileName = TICKET_DATA_STORE_FILE_NAME,
    serializer = ProtoDiscoTicketSerializer
)
