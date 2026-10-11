package com.example.mod2p2

data class ChatMessage(
    val id: Long,
    val text: String,
    val isUser: Boolean,
    val timestamp: Long
)