package com.istudio.solid_principles.utils.usecase_payment

class DebitCard : Payment {
    override fun processPayment(int: Int): String {
        // Logic for processing the payment of debit card
        return "Result of acknowledgement"
    }

}