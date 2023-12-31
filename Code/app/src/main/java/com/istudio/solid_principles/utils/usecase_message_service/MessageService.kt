package com.istudio.solid_principles.utils.usecase_message_service

// Abstraction representing a messaging service
interface MessageService {
    fun sendMessage(message: String)
}