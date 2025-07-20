package com.example.myquizapp.screens.quizscreen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myquizapp.data.QuestionRepository
import kotlinx.coroutines.delay

@Composable
fun QuizScreen(navController: NavController) {
    val questions = QuestionRepository.getQuestions()
    var currentQuestionIndex by remember { mutableStateOf(0) }
    var selectedOptionIndex by remember { mutableStateOf(-1) }
    var correctAnswers by remember { mutableStateOf(0) }
    var timer by remember { mutableStateOf(10) }

    // ✅ Handle answer
    fun handleAnswer(selectedIndex: Int) {
        if (selectedIndex == questions[currentQuestionIndex].correctAnswerIndex) {
            correctAnswers++
        }
        selectedOptionIndex = -1
        if (currentQuestionIndex < questions.lastIndex) {
            currentQuestionIndex++
        } else {
            val incorrect = questions.size - correctAnswers
            navController.navigate("result/$correctAnswers/$incorrect")
        }
    }

    // ✅ Timer Logic
    LaunchedEffect(currentQuestionIndex) {
        timer = 10
        while (timer > 0) {
            delay(1000L)
            timer--
        }
        handleAnswer(-1) // auto move if time runs out
    }

    val question = questions[currentQuestionIndex]

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Text("Question ${currentQuestionIndex + 1} of ${questions.size}", fontSize = 18.sp)
        Spacer(modifier = Modifier.height(8.dp))
        Text("⏳ Time Left: $timer seconds", color = MaterialTheme.colorScheme.primary)

        Spacer(modifier = Modifier.height(24.dp))
        Text(text = question.question, fontSize = 20.sp)

        Spacer(modifier = Modifier.height(16.dp))
        question.options.forEachIndexed { index, option ->
            Button(
                onClick = { handleAnswer(index) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp)
            ) {
                Text(option)
            }
        }
    }
}
