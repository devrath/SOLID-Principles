package com.istudio.solid_principles.utils.usecase_message_service

// Low-level module implementing the MessageService
class EmailService : MessageService {
    override fun sendMessage(message: String) {
        println("Sending email: $message")
    }
}