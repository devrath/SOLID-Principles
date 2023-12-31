package com.istudio.solid_principles.principles.interface_segregation

import androidx.lifecycle.ViewModel
import com.istudio.solid_principles.utils.usecase_software.Developer
import com.istudio.solid_principles.utils.usecase_software.Manager
import javax.inject.Inject

class InterfaceSegrigationDemoVm  @Inject constructor( ) : ViewModel() {

    fun demo() {
        val manager = Manager("Jackson")
        manager.eat()
        val programmer = Developer("Arnold")
        programmer.work()
    }

}