package com.example.myquizapp.screens.result

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun ResultScreen(navController: NavController, correct: Int, incorrect: Int) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Your Quiz Result!", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(16.dp))
        Text("Correct Answers: $correct", fontSize = 18.sp)
        Text("Incorrect Answers: $incorrect", fontSize = 18.sp)

        Spacer(modifier = Modifier.height(32.dp))

        Button(onClick = {
            navController.navigate("home") {
                popUpTo("home") { inclusive = true }
            }
        }) {
            Text("Try Again")
        }
    }
}
