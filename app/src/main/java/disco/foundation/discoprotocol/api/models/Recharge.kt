package disco.foundation.discoprotocol.api.models

import com.google.gson.annotations.SerializedName
import java.math.BigInteger

data class RechargeRequestBody(
    @SerializedName("PIN") val PIN: Int,
    @SerializedName("wearableId") val wearableId: String,
    @SerializedName("eventId") val eventId: String
)

data class RechargeInstructionBody(
    @SerializedName("action") val action: String,
    @SerializedName("inst") val instruction: RechargeInstructionDataBody,
    @SerializedName("ref") val reference: String,
)

data class RechargeInstructionDataBody(
    @SerializedName("amount") val amount: Double,
    @SerializedName("wId") val wearableId: BigInteger,
    @SerializedName("eId") val eventId: String,
)
