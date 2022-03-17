package disco.foundation.discoprotocol.utils.solana.actions

import disco.foundation.discoprotocol.utils.solana.utils.parseSignatureList
import com.solana.Solana
import com.solana.api.getAccountInfo
import com.solana.api.getConfirmedTransaction
import com.solana.api.getSignaturesForAddress
import com.solana.core.PublicKey
import com.solana.models.buffer.AccountInfo


fun checkUserTicket(solana: Solana, signature: String, onFoundCb: (ticketsFound: List<String>) -> Unit) {
    solana.api.getConfirmedTransaction(signature) {
        val transaction = it
        var clientAddress: String

        transaction.onSuccess { confirmedTransaction ->
            clientAddress = confirmedTransaction.transaction?.message?.accountKeys?.get(0).toString()

            checkNftFromAccount(solana, clientAddress) { userNFTs ->
                onFoundCb(userNFTs)

                userNFTs.forEach {
                    nft ->
                        println(nft)
                        solana.api.getSignaturesForAddress(PublicKey(nft)) {
                            result ->

                                result.onSuccess { signaturesList ->
                                    val metadataAddress = parseSignatureList(signaturesList)?.get(signaturesList.size -1)?.signature as String
                                    val parameterMap: MutableMap<String, Any?> = HashMap()

                                    parameterMap["encoding"] = "base64"

                                    // Make a pull request to github repo solana Kotlin
                                    solana.api.getConfirmedTransaction(metadataAddress) {
                                        result ->
                                            result.onSuccess {
                                                account ->
                                                    println(account)

                                                    solana.api.getAccountInfo(PublicKey("J1y5ED7bpfgNvsBzYZpohiiA95YoNuyL8eWrjVQWSFSa"), additionalParams = parameterMap, AccountInfo::class.java) {
                                                        account ->
                                                            account.onSuccess {  }

                                                    }
                                            }

                                    }
                                }
                        }
                }
            }
        }
    }
}