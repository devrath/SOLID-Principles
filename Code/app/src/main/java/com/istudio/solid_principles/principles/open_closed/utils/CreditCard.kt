package com.istudio.solid_principles.principles.open_closed.utils

class CreditCard : Payment {
    override fun processPayment(int: Int): String {
        // Logic for processing the payment of credit card
        return "Result of acknowledgement"
    }

}