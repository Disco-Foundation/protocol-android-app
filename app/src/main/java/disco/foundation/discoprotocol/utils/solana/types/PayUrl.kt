package disco.foundation.discoprotocol.utils.solana.types

import com.solana.core.PublicKey
import java.math.BigDecimal

data class PayUrlParams (
    val recipient: PublicKey,
    val amount: BigDecimal,
    val splToken: PublicKey?,
    val reference: List<PublicKey>?,
    val label: String?,
    val message: String?,
    val memo: String?
)