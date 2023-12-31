package com.istudio.solid_principles.utils.usecase_software

class Developer(private val name: String) : Tasks.Workable {
    override fun work() {
        println("$name is working")
    }
}