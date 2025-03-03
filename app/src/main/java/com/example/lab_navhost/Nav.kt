package com.example.lab_navhost

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun Nav(modifier: Modifier) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "MainScreen", modifier) {
        composable(route = "MainScreen") {
            MainScreen(navController, modifier)
        }
        composable(route = "MyInfoScreen") {
            MyInfoScreen(navController, modifier)
        }
    }
}