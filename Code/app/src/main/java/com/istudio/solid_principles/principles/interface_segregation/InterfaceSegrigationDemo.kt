package com.istudio.solid_principles.principles.interface_segregation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.istudio.solid_principles.ui.composables.AppButton

@Composable
fun InterfaceSegrigationDemo(navController: NavHostController) {

    val viewModel: InterfaceSegrigationDemoVm = hiltViewModel()

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        AppButton(text = "Demo", onClick = {
            viewModel.demo()
        })

    }

}