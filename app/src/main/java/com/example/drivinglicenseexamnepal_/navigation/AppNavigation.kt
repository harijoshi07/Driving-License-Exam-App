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
import com.example.drivinglicenseexamnepal_.ui.component.TopBar
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
        topBar = {
            TopBar(
                navBackStackEntry = navBackStackEntry,
                navigateBack = { navController.popBackStack() }
            )
        },
        containerColor = BlueBackgroundColor
        //containerColor = LightBackgroundColor
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(Screen.Home.route) {
                HomeScreen(
                    navigateToCategory = { vehicleType ->
                        navController.navigate(route = "category/$vehicleType")
                        //navController.navigate(route = Screen.Category.route)
                    },
                    navigateToQuiz = { vehicleType ->
                        navController.navigate(route = "category/$vehicleType")
                       //navController.navigate(route = Screen.Exam.route)
                    },
                    navigateToUltimateGuide = {
                        navController.navigate(route = Screen.UltimateGuide.route)
                    }
                )
            }

            composable(Screen.Category.route) {
                CategoryScreen(
                    navigateToStudy = {
                        navController.navigate(Screen.Study.route)
                    }
                )
            }

            composable(Screen.Study.route) {
                StudyScreen()
            }

            composable(Screen.Exam.route) {

                ExamModeScreen(
                    navigateToResult = {
                        navController.navigate(route = Screen.Result.route)
                    },
                )
            }

            composable(Screen.Result.route){
                ResultScreen(
                    correctAnswer = 2, size = 5,
                    navigateToExam = {
                        navController.navigate(Screen.Exam.route)
                    },
                    navigateToHome = {
                        navController.popBackStack(Screen.Home.route, inclusive = false)
                    },
                    navigateToAnswer = {
                        navController.navigate(Screen.Answer.route)
                    }
                )

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
