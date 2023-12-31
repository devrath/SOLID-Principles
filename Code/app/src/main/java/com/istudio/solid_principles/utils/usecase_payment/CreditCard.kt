package com.istudio.solid_principles.utils.usecase_payment

class CreditCard : Payment {
    override fun processPayment(int: Int): String {
        // Logic for processing the payment of credit card
        return "Result of acknowledgement"
    }

}