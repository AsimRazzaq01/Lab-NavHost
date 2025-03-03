package com.example.lab_navhost

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun MainScreen(navController: NavHostController, modifier: Modifier =Modifier){

    Column {
        Text(text = "Main Screen", fontSize = 40.sp)
        Button(onClick = {
            navController.navigate("MyInfoScreen")
        }
        ) {
            Text(text = "go to my info Screen")
        }

    }



}





