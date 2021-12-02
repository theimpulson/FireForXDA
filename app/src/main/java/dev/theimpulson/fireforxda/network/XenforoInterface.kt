package dev.theimpulson.fireforxda.network

import dev.theimpulson.fireforxda.network.data.alert.Alerts
import dev.theimpulson.fireforxda.network.data.conversation.Conversations
import dev.theimpulson.fireforxda.network.data.node.Nodes
import dev.theimpulson.fireforxda.network.data.thread.Threads
import dev.theimpulson.fireforxda.network.data.user.Me
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

    @GET("conversations/")
    suspend fun getConversations(
        @Query("page") page: Int? = null,
        @Query("starter_id") starter_id: Int? = null,
        @Query("receiver_id") receiver_id: Int? = null,
        @Query("starred") starred: Boolean? = null,
        @Query("unread") unread: Boolean? = null
    ): Conversations

    @GET("nodes/")
    suspend fun getNodes(): Nodes

    @GET("threads/")
    suspend fun getThreads(
        @Query("page") page: Int? = null,
        @Query("prefix_id") prefix_id: Int? = null,
        @Query("starter_id") starter_id: Int? = null,
        @Query("last_days") last_days: Int? = null,
        @Query("unread") unread: Boolean? = null,
        @Query("thread_type") thread_type: String? = null,
        @Query("order") order: String? = null,
        @Query("direction") direction: String? = null
    ): Threads
}