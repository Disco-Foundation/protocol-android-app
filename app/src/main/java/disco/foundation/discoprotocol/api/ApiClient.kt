package disco.foundation.discoprotocol.api

import disco.foundation.discoprotocol.api.models.*
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import java.math.BigInteger

interface ApiClient {
    @GET("wearable/{wId}/{eId}")
    suspend fun getWearableInfo(
        @Path("wId") wearableId: BigInteger,
        @Path("eId") eventId: String
    ): Response<WearableInfoResponse>

    @POST("purchase")
    suspend fun purchase(@Body requestBody: PurchaseRequestBody): Response<PurchaseResponse>

}



