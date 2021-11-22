package dev.theimpulson.fireforxda.network

import dev.theimpulson.fireforxda.network.data.Me
import javax.inject.Inject

class XenforoRepository @Inject constructor(
    private val xenforoInterface: XenforoInterface
) {

    suspend fun getCurrentUser(): Me {
        return xenforoInterface.getCurrentUser()
    }
}