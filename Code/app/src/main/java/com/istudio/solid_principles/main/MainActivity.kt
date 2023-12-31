package com.istudio.solid_principles.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.istudio.solid_principles.R
import com.istudio.solid_principles.main.selection.ModuleDemo
import com.istudio.solid_principles.main.selection.ModuleSelectionScreen
import com.istudio.solid_principles.principles.dependency_inversion.DependencyInversionDemo
import com.istudio.solid_principles.principles.interface_segregation.InterfaceSegrigationDemo
import com.istudio.solid_principles.principles.liskov_substitution.LiskovSubstitutionDemo
import com.istudio.solid_principles.principles.open_closed.OpenClosedDemo
import com.istudio.solid_principles.principles.single_responsibility.SingleResponsibilityDemo
import com.istudio.solid_principles.ui.theme.SolidPrinciplesTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SolidPrinciplesTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    Scaffold(
                        topBar = {
                            Toolbar()
                        },
                        content = {
                            // Content of your screen goes here
                            val navController = rememberNavController()

                            NavHost(
                                modifier = Modifier.padding(it),
                                navController = navController,
                                startDestination = ModuleDemo.DemoSelection.rout
                            ) {
                                // Selection Screen
                                composable(ModuleDemo.DemoSelection.rout) {
                                    ModuleSelectionScreen(navController = navController)
                                }
                                // PRINCIPLE: Single Responsibility
                                composable(ModuleDemo.SingleResponsibilityPrincipleDemo.rout) {
                                    SingleResponsibilityDemo(navController = navController)
                                }
                                // PRINCIPLE: Open Closed
                                composable(ModuleDemo.OpenClosedPrincipleDemo.rout) {
                                    OpenClosedDemo(navController = navController)
                                }
                                // PRINCIPLE: Liskov Substitution
                                composable(ModuleDemo.LiskovSubstitutionPrincipleDemo.rout) {
                                    LiskovSubstitutionDemo(navController = navController)
                                }
                                // PRINCIPLE: Interface Segregation
                                composable(ModuleDemo.InterfaceSegrigationPrincipleDemo.rout) {
                                    InterfaceSegrigationDemo(navController = navController)
                                }
                                // PRINCIPLE: Dependency Inversion
                                composable(ModuleDemo.DepenedencyInversionPrincipleDemo.rout) {
                                    DependencyInversionDemo(navController = navController)
                                }
                            }
                        }
                    )
                }
            }
        }
    }


    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun Toolbar() {
        TopAppBar(
            title = {
                Text(
                    text = stringResource(id = R.string.app_name),
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            },
            navigationIcon = {
                IconButton(onClick = { /* Handle navigation icon click */ }) {
                    Icon(imageVector = Icons.Default.Face, contentDescription = null)
                }
            },
            modifier = Modifier.background(color = MaterialTheme.colorScheme.primary)
        )
    }
}