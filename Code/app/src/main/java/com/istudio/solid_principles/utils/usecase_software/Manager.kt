package com.istudio.solid_principles.utils.usecase_software

class Manager(private val name: String) : Tasks.Eatable {
    override fun eat() {
        println("$name is eating")
    }
}