package com.istudio.solid_principles.principles.single_responsibility

import androidx.lifecycle.ViewModel
import com.istudio.solid_principles.utils.usecase_user_functions.SaveUserData
import com.istudio.solid_principles.utils.usecase_user_functions.User
import com.istudio.solid_principles.utils.usecase_user_functions.UserAuthenticator
import com.istudio.solid_principles.utils.usecase_user_functions.UserManager
import javax.inject.Inject

class SingleResponsibilityDemoVm  @Inject constructor( ) : ViewModel() {

    fun demo() {

        val user = User(username = "Mahesh","@123")

        // Performing registration functionality
        val userManager = UserManager()
        userManager.register(user)

        // Performing Authenticating functionality
        val authenticator = UserAuthenticator()
        authenticator.login(user)
        authenticator.logOut(user)

        // Saving user credentials
        val userData = SaveUserData()
        userData.saveToDatabase(user)

    }

}