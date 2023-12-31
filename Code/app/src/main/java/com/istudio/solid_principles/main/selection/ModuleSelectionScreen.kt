package com.istudio.solid_principles.main.selection

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.istudio.solid_principles.ui.composables.AppButton

@Composable
fun ModuleSelectionScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize().padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {

        Spacer(modifier = Modifier.height(16.dp))

        AppButton(text = "Single Responsibility", onClick = {

        })

        Spacer(modifier = Modifier.height(16.dp))

        AppButton(text = "Open Closed", onClick = {

        })

        Spacer(modifier = Modifier.height(16.dp))

        AppButton(text = "Liskov Substitution", onClick = {

        })

        Spacer(modifier = Modifier.height(16.dp))

        AppButton(text = "Interface Segregation", onClick = {

        })

        Spacer(modifier = Modifier.height(16.dp))

        AppButton(text = "Dependency Inversion", onClick = {

        })

    }
}