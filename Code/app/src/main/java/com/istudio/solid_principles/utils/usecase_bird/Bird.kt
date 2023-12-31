package com.istudio.solid_principles.utils.usecase_bird

abstract class Bird(private val name : String) {

    open fun move(){
        println("$name is flying")
    }

}