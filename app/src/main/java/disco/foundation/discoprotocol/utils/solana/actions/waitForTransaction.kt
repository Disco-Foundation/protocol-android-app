package disco.foundation.discoprotocol.utils.solana.actions

import disco.foundation.discoprotocol.api.RequestResult
import com.solana.core.PublicKey
import com.solana.models.SignatureInformation
import com.solana.Solana
import com.solana.api.getSignaturesForAddress

fun onTxSignatureFound(result: Result<List<SignatureInformation>>): RequestResult<Boolean>? {
    result.onSuccess { res ->
        return if (res.isNotEmpty()) {
            println("---------------- REQUEST SUCCESSFUL  --------------")
            println(res)
            RequestResult.Success(true)
        } else {
            RequestResult.Loading()
        }
    }
    result.onFailure { err ->
        println("---------------- REQUEST FAIL --------------")
        println(err)
        return RequestResult.Error("Error", false)
    }

    return RequestResult.Loading()
}


fun waitingForTransaction(solana: Solana, reference: PublicKey): RequestResult<Boolean>? {
    var response: RequestResult<Boolean>? = RequestResult.Loading()
    while (response is  RequestResult.Loading) {
        solana.api.getSignaturesForAddress(reference, onComplete = {
                result ->
                response = onTxSignatureFound(result)
        })
        println("waiting 3 seconds")
        Thread.sleep(3_000)
    }
    return response
}