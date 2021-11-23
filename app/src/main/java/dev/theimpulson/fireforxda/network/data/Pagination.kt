package dev.theimpulson.fireforxda.network.data

data class Pagination(
    val current_page: Int = 0,
    val last_page: Int = 0,
    val per_page: Int = 0,
    val shown: Int = 0,
    val total: Int = 0
)