package com.istudio.solid_principles.principles.open_closed.utils

class PaymentProcessor {

    private val paymentMethods : MutableList<Payment> = arrayListOf()

    /**
     * Add a new payment method
     */
    fun addPaymentMethod(payment : Payment){
        paymentMethods.add(payment)
    }

    /**
     * Process the payment
     */
    fun processPayment(amount : Int){

        for (payment in paymentMethods){
            val result = payment.processPayment(amount);
            println(result)
        }

    }

}