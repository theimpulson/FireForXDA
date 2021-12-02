package dev.theimpulson.fireforxda.network.data.alert

import dev.theimpulson.fireforxda.network.data.common.Pagination

data class Alerts(
    val alerts: List<UserAlert> = emptyList(),
    val pagination: Pagination = Pagination()
)