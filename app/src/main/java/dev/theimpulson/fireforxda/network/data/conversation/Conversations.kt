package dev.theimpulson.fireforxda.network.data.conversation

import dev.theimpulson.fireforxda.network.data.common.Pagination

data class Conversations(
    val conversations: List<Conversation> = emptyList(),
    val pagination: Pagination = Pagination()
)