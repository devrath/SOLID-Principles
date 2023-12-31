package com.istudio.solid_principles.utils.example_usecase_bird

class Ostrich(private val name : String) : Bird(name) {
    override fun move() {
        println("$name is not able to fly, But it is able to run")
    }
}