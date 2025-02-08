package com.example.drivinglicenseexamnepal_.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.drivinglicenseexamnepal_.ui.screen.exam_mode_screen.AnswerScreen
import com.example.drivinglicenseexamnepal_.ui.screen.exam_mode_screen.ExamModeScreen
import com.example.drivinglicenseexamnepal_.ui.screen.exam_mode_screen.ResultScreen
import com.example.drivinglicenseexamnepal_.ui.screen.home_screen.HomeScreen
import com.example.drivinglicenseexamnepal_.ui.screen.study_mode_screen.CategoryScreen
import com.example.drivinglicenseexamnepal_.ui.screen.study_mode_screen.StudyScreen
import com.example.drivinglicenseexamnepal_.ui.screen.ultimate_guide_screen.UltimateGuideScreen
import com.example.drivinglicenseexamnepal_.ui.theme.BlueBackgroundColor

@Composable
fun AppNavigation() {

    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { },
        containerColor = BlueBackgroundColor
        //containerColor = LightBackgroundColor
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(Screen.Home.route) {
                HomeScreen()
            }

            composable(Screen.Category.route) {
                CategoryScreen()
            }

            composable(Screen.Study.route) {
                StudyScreen()
            }

            composable(Screen.Exam.route) {

                ExamModeScreen()
            }

            composable(Screen.Result.route){
                ResultScreen(correctAnswer = 2, size = 5)
            }

            composable(Screen.Answer.route){
                AnswerScreen(questions = listOf(), selectedAnswers = listOf())
            }

            composable(Screen.UltimateGuide.route){
                UltimateGuideScreen()
            }


        }

    }
}
