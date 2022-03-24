package disco.foundation.discoprotocol.models

import com.google.gson.annotations.SerializedName

data class DiscoEvent(
    @SerializedName("eventId") var eventId: String,
    @SerializedName("eventName") var name: String = "",
)
