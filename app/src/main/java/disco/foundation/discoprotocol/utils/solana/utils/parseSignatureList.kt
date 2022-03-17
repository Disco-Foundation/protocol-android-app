package disco.foundation.discoprotocol.utils.solana.utils

import com.solana.models.SignatureInformation
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory

private val moshi: Moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

fun parseSignatureList(signaturesList: List<SignatureInformation>): List<SignatureInformation>? {
    val type = Types.newParameterizedType(List::class.java, SignatureInformation::class.java)
    val jsonAdapter: JsonAdapter<List<SignatureInformation>> = moshi.adapter(type)

    return jsonAdapter.fromJsonValue(signaturesList)
}