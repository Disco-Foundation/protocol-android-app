package disco.foundation.discoprotocol.utils.solana.actions

import disco.foundation.discoprotocol.utils.CHECK_IN_AMOUNT_TO_DEBIT
import disco.foundation.discoprotocol.utils.solana.types.PayUrlParams
import com.solana.core.Account
import com.solana.core.PublicKey

// temporal
val MERCHANT_VAULT_ADDRESS = "13i3zyFbtcjEfVuNVR2y21MLHhBabxXbiM8YCqxpTf3E"

private fun encodeUrl(payUrlObj: PayUrlParams): String {
    return "solana:" + payUrlObj.recipient.toBase58() + "?amount=" + payUrlObj.amount.toString() + "&reference=" + payUrlObj.reference?.get(0)?.toBase58() + "&label=" + payUrlObj.label + "&memo=" + payUrlObj.memo
}

fun encodeCheckInUrl(): Pair<String, PublicKey> {
    val ecommerce = PublicKey(MERCHANT_VAULT_ADDRESS)
    val amount = CHECK_IN_AMOUNT_TO_DEBIT
    val randomRefPubKey = Account().publicKey
    val label = "Disco Check-In Transaction"
    val message = "NFT entrance verification payment"
    val memo = "verification"

    val payUrlObj = PayUrlParams(
        ecommerce,
        amount,
        null,
        listOf(randomRefPubKey),
        label,
        message,
        memo
    )

    val solanaPayUrl = encodeUrl(payUrlObj)

    return Pair(solanaPayUrl,randomRefPubKey)
}
