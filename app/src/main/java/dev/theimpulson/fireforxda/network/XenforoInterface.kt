package dev.theimpulson.fireforxda.network

import dev.theimpulson.fireforxda.network.data.Alerts
import dev.theimpulson.fireforxda.network.data.Me
import retrofit2.http.GET
import retrofit2.http.Query

interface XenforoInterface {
    companion object {
        const val BASE_URL = "https://forum.xda-developers.com/api/"
    }

    @GET("me/")
    suspend fun getCurrentUser(): Me

    @GET("alerts/")
    suspend fun getAlerts(
        @Query("page") page: Int? = null,
        @Query("cutoff") cutoff: Int? = null,
        @Query("unviewed") unviewed: Boolean? = null,
        @Query("unread") unread: Boolean? = null
    ): Alerts
}