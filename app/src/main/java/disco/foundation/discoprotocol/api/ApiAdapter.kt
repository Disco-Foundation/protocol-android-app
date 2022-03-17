package disco.foundation.discoprotocol.api

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object ApiAdapter {
    private const val BASE_URL = "https://api.disco.foundation/api/"

    val apiClient: ApiClient = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(createClient())
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(ApiClient::class.java)
}

fun createClient(): OkHttpClient{
    val okHttpClient = OkHttpClient().newBuilder()
    okHttpClient
        .connectTimeout(25000,TimeUnit.MILLISECONDS)
        .readTimeout(25000, TimeUnit.MILLISECONDS)
        .writeTimeout(25000, TimeUnit.MILLISECONDS)

    return okHttpClient.build()
}

