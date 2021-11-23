package dev.theimpulson.fireforxda.network

import dev.theimpulson.fireforxda.network.data.Alerts
import dev.theimpulson.fireforxda.network.data.Me
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
}