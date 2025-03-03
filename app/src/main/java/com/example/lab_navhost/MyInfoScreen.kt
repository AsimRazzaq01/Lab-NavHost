package com.example.lab_navhost

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun MyInfoScreen(navController: NavHostController, modifier: Modifier =Modifier){

    Column {
        Text(text = "My Info Screen", fontSize = 40.sp)
        Button(onClick = {
            navController.popBackStack()
        }) {
            Text(text = "go back to main Screen")
        }
    }

}
