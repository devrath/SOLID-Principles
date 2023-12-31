package com.istudio.solid_principles.principles.liskov_substitution

import androidx.lifecycle.ViewModel
import com.istudio.solid_principles.utils.example_usecase_bird.Ostrich
import com.istudio.solid_principles.utils.example_usecase_bird.Sparrow
import javax.inject.Inject

class LiskovSubstitutionDemoVm  @Inject constructor( ) : ViewModel() {

    fun demo() {

        val sparrow = Sparrow("JackSparrow")
        sparrow.move()

        val ostrich = Ostrich("MrOstrich")
        ostrich.move()
    }

}