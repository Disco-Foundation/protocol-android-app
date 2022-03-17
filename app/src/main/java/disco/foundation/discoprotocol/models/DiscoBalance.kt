package disco.foundation.discoprotocol.models

import disco.foundation.discoprotocol.utils.ACCEPTED_MINT
import java.io.Serializable

data class DiscoBalance @JvmOverloads constructor(
    var amount: Double = 0.0,
    val mint: String = ACCEPTED_MINT): Serializable
