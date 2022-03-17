package disco.foundation.discoprotocol.api.models

import com.google.gson.annotations.SerializedName

data class WearableInfoDataResponse(
    @SerializedName("pubKey") val pubKey: String,
    @SerializedName("wearableVaultPubKey") val wearableVaultPubKey: String,
    @SerializedName("balance") val balance: Double
)

data class WearableInfoResponse(
    @SerializedName("wearable") val wearable: WearableInfoDataResponse
)