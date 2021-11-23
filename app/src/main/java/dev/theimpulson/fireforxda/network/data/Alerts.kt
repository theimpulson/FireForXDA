package dev.theimpulson.fireforxda.network.data

data class Alerts(
    val alerts: List<UserAlert> = emptyList(),
    val pagination: Pagination = Pagination()
)