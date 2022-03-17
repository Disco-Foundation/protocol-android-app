package disco.foundation.discoprotocol.utils.solana.actions

import com.solana.Solana
import com.solana.actions.getTokenWallets
import com.solana.core.PublicKey

// temp
val tickets = listOf<String>("EpBTTJ3rpYTafy5Hn5z3KhErgyZ6f9tN8eQQgRnVW1wH","J3fr2UJbaf4J7sFgBm3iMVX26FxbV9sj2FN4E9uCMZV4","GFSEmsQf2oxds5zFVLTYxB1LWQGMR6VqRRbwQL44Pt1x","624YoZSJRrBJnvpQpKA9RPRYvYvNAEWH3GBxFpXixr5W","6feckwJFreSycPNvNVGMctQQNqUXJ3eJbdfJtAeFCREZ","CPvjBdyGWQVxmYywfKWiF9jHtZqgAeemgMNWzFHNDLWT","HkDSixqaZjaHZ8vTPf1DnxqKaqJLEGE91EpViFSc7oCs")

fun checkNftFromAccount(solana: Solana, publicKey: String, onFoundCb: (ticketsFound: List<String>) -> Unit) {
    try {
        solana.action.getTokenWallets(PublicKey(publicKey)) { listWallets ->
            listWallets.onSuccess { res ->
                val userNFTs = mutableListOf<String>()
                res.forEach { wallet ->
                    val walletAmount = wallet.lamports
                    val walletAddress = wallet.token.address

                    if ((walletAddress in tickets) && (walletAmount != 0.toLong()) ) {
                        userNFTs.add(walletAddress)
                    }
                }

                onFoundCb(userNFTs)
            }

        }

    } catch (e: Error) {
        println("Account not found")
        println(e)
    }
}