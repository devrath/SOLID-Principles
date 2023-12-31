package com.istudio.solid_principles.utils.usecase_bird

class Sparrow(private val name : String) : Bird(name) {
    override fun move(){
        println("$name is able to fly in the sky")
    }
}