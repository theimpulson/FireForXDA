package dev.theimpulson.fireforxda.network

import dev.theimpulson.fireforxda.network.data.Me
import dev.theimpulson.fireforxda.network.data.User
import retrofit2.http.GET

interface XenforoInterface {
    companion object {
        const val BASE_URL = "https://forum.xda-developers.com/api/"
    }

    @GET("me/")
    suspend fun getCurrentUser(): Me
}