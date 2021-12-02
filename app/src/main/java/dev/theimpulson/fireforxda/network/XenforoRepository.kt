package dev.theimpulson.fireforxda.network

import dev.theimpulson.fireforxda.network.data.alert.Alerts
import dev.theimpulson.fireforxda.network.data.conversation.Conversations
import dev.theimpulson.fireforxda.network.data.node.Nodes
import dev.theimpulson.fireforxda.network.data.thread.Threads
import dev.theimpulson.fireforxda.network.data.user.Me
import javax.inject.Inject

class XenforoRepository @Inject constructor(
    private val xenforoInterface: XenforoInterface
) {

    suspend fun getCurrentUser(): Me {
        return xenforoInterface.getCurrentUser()
    }

    suspend fun getAlerts(
        page: Int? = null,
        cutoff: Int? = null,
        unviewed: Boolean? = null,
        unread: Boolean? = null
    ): Alerts {
        return xenforoInterface.getAlerts(page, cutoff, unviewed, unread)
    }

    suspend fun getConversations(
        page: Int? = null,
        starter_id: Int? = null,
        receiver_id: Int? = null,
        starred: Boolean? = null,
        unread: Boolean? = null
    ): Conversations {
        return xenforoInterface.getConversations(
            page, starter_id, receiver_id, starred, unread
        )
    }

    suspend fun getNodes(): Nodes {
        return xenforoInterface.getNodes()
    }

    suspend fun getThreads(
        page: Int? = null,
        prefix_id: Int? = null,
        starter_id: Int? = null,
        last_days: Int? = null,
        unread: Boolean? = null,
        thread_type: String? = null,
        order: String? = null,
        direction: String? = null
    ): Threads {
        return xenforoInterface.getThreads(
            page,
            prefix_id,
            starter_id,
            last_days,
            unread,
            thread_type,
            order,
            direction
        )
    }
}