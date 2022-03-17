package disco.foundation.discoprotocol.models

import java.io.Serializable
import disco.foundation.discoprotocol.R
import java.math.BigInteger
import java.util.*

data class DiscoTicket (
    var id: String = "",
    val type: String ="GOLD VIP ticket",
    var status: TicketStatus = TicketStatus.PENDING,
    val checkInDate: Date = Date(),
    var wearableId: BigInteger = BigInteger.ZERO,
    var ownerAddress: String = "",
    var balance: Double = 0.0,
    var secured: Boolean = true,
    var pin: String = ""
): Serializable


enum class TicketRowType {
    TICKET { override fun getIcon(color: Int) = getTicketIcon(color)},
    CHECK_IN { override fun getIcon(color: Int)= getCheckIcon(color)},
    WEARABLE { override fun getIcon(color: Int) = getIdIcon(color) },
    OWNER { override fun getIcon(color: Int) = getOwnerIcon(color) },
    BALANCE { override fun getIcon(color: Int) = getBalanceIcon(color) },
    SECURED { override fun getIcon(color: Int) = getSecuredIcon(color) };

    open fun getIcon(color: Int): Int {
        return R.drawable.blue_check
    }

    open fun getTicketIcon(color: Int): Int {
        return when(color){
            R.color.neon_blue -> R.drawable.blue_ticket
            R.color.neon_green -> R.drawable.green_ticket
            R.color.neon_pink -> R.drawable.pink_ticket
            R.color.neon_purple -> R.drawable.purple_ticket
            else -> {  R.drawable.blue_ticket }
        }
    }

    open fun getCheckIcon(color: Int): Int {
        return when(color){
            R.color.neon_blue -> R.drawable.blue_check
            R.color.neon_green -> R.drawable.green_check
            R.color.neon_pink -> R.drawable.pink_check
            R.color.neon_purple -> R.drawable.purple_check
            else -> {  R.drawable.blue_check }
        }
    }

    open fun getIdIcon(color: Int): Int {
        return when(color){
            R.color.neon_blue -> R.drawable.blue_id
            R.color.neon_green -> R.drawable.green_id
            R.color.neon_pink -> R.drawable.pink_id
            R.color.neon_purple -> R.drawable.purple_id
            else -> {  R.drawable.blue_id }
        }
    }

    open fun getOwnerIcon(color: Int): Int {
        return when(color){
            R.color.neon_blue -> R.drawable.blue_owner
            R.color.neon_green -> R.drawable.green_owner
            R.color.neon_pink -> R.drawable.pink_owner
            R.color.neon_purple -> R.drawable.purple_owner
            else -> {  R.drawable.blue_owner }
        }
    }

    open fun getSecuredIcon(color: Int): Int {
        return when(color){
            R.color.neon_blue -> R.drawable.blue_key
            R.color.neon_green -> R.drawable.green_key
            R.color.neon_pink -> R.drawable.pink_key
            R.color.neon_purple -> R.drawable.purple_key
            else -> {  R.drawable.blue_key }
        }
    }

    open fun getBalanceIcon(color: Int): Int {
        return when(color){
            R.color.neon_blue -> R.drawable.blue_balance
            R.color.neon_green -> R.drawable.green_balance
            R.color.neon_pink -> R.drawable.pink_balance
            R.color.neon_purple -> R.drawable.purple_balance
            else -> {  R.drawable.blue_balance }
        }
    }
}

enum class TicketStatus {
    PENDING,
    VERIFIED
}