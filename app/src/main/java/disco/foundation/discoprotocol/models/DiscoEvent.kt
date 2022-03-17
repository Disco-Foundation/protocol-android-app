package disco.foundation.discoprotocol.models

import com.google.gson.annotations.SerializedName

data class DiscoEvent(
    @SerializedName("publicKey") var publicKey: String,
    @SerializedName("name") var name: String = "",
)
