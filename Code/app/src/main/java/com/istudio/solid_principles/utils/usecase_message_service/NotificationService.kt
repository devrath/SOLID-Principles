package com.istudio.solid_principles.utils.usecase_message_service

// High-level module depending on the abstraction (MessageService)
class NotificationService (private val messageService: MessageService) {
    fun sendNotification(message: String) {
        // Using the abstraction to send a message
        messageService.sendMessage(message)
    }
}
