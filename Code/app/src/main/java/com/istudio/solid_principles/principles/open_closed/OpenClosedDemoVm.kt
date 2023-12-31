package com.istudio.solid_principles.principles.open_closed

import androidx.lifecycle.ViewModel
import com.istudio.solid_principles.principles.open_closed.utils.CreditCard
import com.istudio.solid_principles.principles.open_closed.utils.PaymentProcessor
import javax.inject.Inject

class OpenClosedDemoVm  @Inject constructor( ) : ViewModel() {

    fun demo() {
        // Amount to pay
        val amountToPay = 100

        // We shall assume that we are paying via credit card
        val creditCardPayment = CreditCard()
        // Payment processor is used to process the payments
        val paymentProcessor = PaymentProcessor()

        // Add the payment method
        paymentProcessor.addPaymentMethod(creditCardPayment)
        // Process the payment
        paymentProcessor.processPayment(amountToPay)

    }

}