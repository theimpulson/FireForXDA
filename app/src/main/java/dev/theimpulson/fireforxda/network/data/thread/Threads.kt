package dev.theimpulson.fireforxda.network.data.thread

import dev.theimpulson.fireforxda.network.data.common.Pagination

data class Threads(
    val pagination: Pagination = Pagination(),
    val threads: List<Thread> = emptyList()
)