package disco.foundation.discoprotocol.api.models

import com.google.gson.annotations.SerializedName
import java.math.BigInteger

data class PurchaseResponse(
    @SerializedName("status") val status: Boolean
)

data class PurchaseRequestBody(
    @SerializedName("amount") val amount: Double,
    @SerializedName("PIN") val pin: String,
    @SerializedName("wearableId") val wearableId: BigInteger,
    @SerializedName("eventId") val eventId: String,
)
