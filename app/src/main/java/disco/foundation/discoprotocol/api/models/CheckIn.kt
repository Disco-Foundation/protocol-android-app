package disco.foundation.discoprotocol.api.models

import com.google.gson.annotations.SerializedName
import java.math.BigInteger

data class CheckInRequestBodyInstruction(
    @SerializedName("PIN") val PIN: String,
    @SerializedName("wId") val wearableId: BigInteger,
    @SerializedName("eId") val eventId: String
)

data class CheckInRequestBody(
    @SerializedName("action") val action: String,
    @SerializedName("inst") val instruction: CheckInRequestBodyInstruction,
    @SerializedName("ref") val reference: String,
)

data class CheckInResponse(
    @SerializedName("wearable") val wearable: WearableResponse
)

data class WearableResponse(
    @SerializedName("authority") val authority: String,
    @SerializedName("pin") val pin: Int,
    @SerializedName("wearableId") val wearableId: BigInteger,
    @SerializedName("wearableVault") val wearableVault: String,
    @SerializedName("wearableBump") val wearableBump: Int,
    @SerializedName("wearableVaultBump") val wearableVaultBump: Int,
    @SerializedName("publicKey") val publicKey: String
)

enum class ActionType {
    CHECKIN,
    RECHARGE
}