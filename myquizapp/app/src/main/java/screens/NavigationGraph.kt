package com.example.myquizapp.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.NavType
import androidx.navigation.navArgument
import com.example.myquizapp.screens.homescreen.HomeScreen
import com.example.myquizapp.screens.quizscreen.QuizScreen
import com.example.myquizapp.screens.result.ResultScreen

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(navController)
        }
        composable("quiz") {
            QuizScreen(navController)
        }
        composable(
            route = "result/{correct}/{incorrect}",
            arguments = listOf(
                navArgument("correct") { type = NavType.IntType },
                navArgument("incorrect") { type = NavType.IntType }
            )
        ) { backStackEntry ->
            val correct = backStackEntry.arguments?.getInt("correct") ?: 0
            val incorrect = backStackEntry.arguments?.getInt("incorrect") ?: 0
            ResultScreen(navController, correct, incorrect)
        }
    }
}
