package com.istudio.solid_principles.utils.usecase_software

interface Tasks {
    interface Workable {
        fun work()
    }
    interface Eatable {
        fun eat()
    }
}