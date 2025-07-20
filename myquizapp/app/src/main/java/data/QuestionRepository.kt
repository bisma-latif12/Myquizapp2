package com.example.myquizapp.data

object QuestionRepository {
    fun getQuestions(): List<Question> {
        return listOf(
            Question(
                id = 1,
                question = "What does CPU stand for?",
                options = listOf("Central Process Unit", "Central Processing Unit", "Computer Personal Unit", "Control Processing Unit"),
                correctAnswerIndex = 1
            ),
            Question(
                id = 2,
                question = "Which language is primarily used for Android app development?",
                options = listOf("Swift", "Kotlin", "JavaScript", "Ruby"),
                correctAnswerIndex = 1
            ),
            Question(
                id = 3,
                question = "What is the time complexity of binary search?",
                options = listOf("O(n)", "O(log n)", "O(n^2)", "O(1)"),
                correctAnswerIndex = 1
            ),
            Question(
                id = 4,
                question = "Which of these is a NoSQL database?",
                options = listOf("MySQL", "PostgreSQL", "MongoDB", "Oracle"),
                correctAnswerIndex = 2
            ),
            Question(
                id = 5,
                question = "What does HTML stand for?",
                options = listOf("Hyper Trainer Marking Language", "Hyper Text Markup Language", "Hyper Text Markdown Language", "High Text Markup Language"),
                correctAnswerIndex = 1
            ),
            Question(
                id = 6,
                question = "Who is known as the father of Computer Science?",
                options = listOf("Alan Turing", "Bill Gates", "Charles Babbage", "Steve Jobs"),
                correctAnswerIndex = 0
            ),
            Question(
                id = 7,
                question = "Which of these is not an OOP concept?",
                options = listOf("Encapsulation", "Abstraction", "Recursion", "Inheritance"),
                correctAnswerIndex = 2
            ),
            Question(
                id = 8,
                question = "Which protocol is used to transfer web pages?",
                options = listOf("HTTP", "FTP", "SMTP", "TCP"),
                correctAnswerIndex = 0
            ),
            Question(
                id = 9,
                question = "What does IDE stand for?",
                options = listOf("Integrated Development Environment", "Internal Data Entry", "Internet Development Extension", "Input Device Emulator"),
                correctAnswerIndex = 0
            ),
            Question(
                id = 10,
                question = "Which data structure uses FIFO (First In First Out)?",
                options = listOf("Stack", "Queue", "Array", "Tree"),
                correctAnswerIndex = 1
            )
        )
    }
}
