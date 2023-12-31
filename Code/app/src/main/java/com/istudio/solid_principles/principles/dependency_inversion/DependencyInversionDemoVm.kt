package com.istudio.solid_principles.principles.dependency_inversion

import androidx.lifecycle.ViewModel
import com.istudio.solid_principles.utils.usecase_message_service.EmailService
import com.istudio.solid_principles.utils.usecase_message_service.NotificationService
import com.istudio.solid_principles.utils.usecase_message_service.SMSService
import javax.inject.Inject

class DependencyInversionDemoVm  @Inject constructor( ) : ViewModel() {

    fun demo() {
        // Using EmailService as the implementation of MessageService
        val emailService = EmailService()
        val emailNotificationService = NotificationService(emailService)
        emailNotificationService.sendNotification("Hello via email")

        // Using SMSService as the implementation of MessageService
        val smsService = SMSService()
        val smsNotificationService = NotificationService(smsService)
        smsNotificationService.sendNotification("Hello via SMS")
    }

}