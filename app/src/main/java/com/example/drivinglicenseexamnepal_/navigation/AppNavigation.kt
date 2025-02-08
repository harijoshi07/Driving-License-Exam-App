package com.example.drivinglicenseexamnepal_.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.drivinglicenseexamnepal_.data.model.Question
import com.example.drivinglicenseexamnepal_.ui.component.TopBar
import com.example.drivinglicenseexamnepal_.ui.screen.exam_mode_screen.AnswerScreen
import com.example.drivinglicenseexamnepal_.ui.screen.exam_mode_screen.ExamModeScreen
import com.example.drivinglicenseexamnepal_.ui.screen.exam_mode_screen.ResultScreen
import com.example.drivinglicenseexamnepal_.ui.screen.home_screen.HomeScreen
import com.example.drivinglicenseexamnepal_.ui.screen.study_mode_screen.CategoryScreen
import com.example.drivinglicenseexamnepal_.ui.screen.study_mode_screen.StudyScreen
import com.example.drivinglicenseexamnepal_.ui.screen.ultimate_guide_screen.UltimateGuideScreen
import com.example.drivinglicenseexamnepal_.ui.theme.BlueBackgroundColor
import com.example.drivinglicenseexamnepal_.viewmodel.QuestionViewModel

@Composable
fun AppNavigation(viewModel: QuestionViewModel = viewModel()) {

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

            composable(Screen.Category.route) { backStackEntry ->
                val vehicleType = backStackEntry.arguments?.getString("vehicleType") ?: "bike"
                CategoryScreen(
                    navigateToStudy = { categoryTitle ->
                        navController.navigate(route = "study/$vehicleType/$categoryTitle")
                    }
                )
            }

            composable(Screen.Study.route) { backStackEntry ->
                val vehicleType = backStackEntry.arguments?.getString("vehicleType") ?: "bike"
                val categoryTitle = backStackEntry.arguments?.getString("categoryTitle") ?: ""
                val questions = if (vehicleType == "bike") {
                    viewModel.getBikeQuestionsByCategory(categoryTitle)
                } else {
                    viewModel.getCarQuestionsByCategory(categoryTitle)
                }
                StudyScreen(questions = questions)
            }

            composable(Screen.Exam.route) { backStackEntry ->
                val vehicleType = backStackEntry.arguments?.getString("vehicleType") ?: "bike"
                val quizQuestions = if (vehicleType == "bike") {
                    viewModel.getBikeQuizQuestions()
                } else {
                    viewModel.getCarQuizQuestions()
                }
                ExamModeScreen(
                    questions = quizQuestions,
                    navigateToResult = { questions, selectedAnswers ->
                        navController.currentBackStackEntry?.savedStateHandle?.apply {
                            set("questions", questions)
                            set("selectedAnswers", selectedAnswers.toList())
                        }
                        navController.navigate(Screen.Result.route)
                    }
                )
            }

            composable(Screen.Result.route) {
                val questions = navController.previousBackStackEntry
                    ?.savedStateHandle
                    ?.get<List<Question>>("questions") ?: emptyList()

                val selectedAnswers = navController.previousBackStackEntry
                    ?.savedStateHandle
                    ?.get<List<Int?>>("selectedAnswers") ?: emptyList()

                val correctCount = questions.indices.count {
                    selectedAnswers.getOrNull(it) == (questions[it].correctOptionIndex - 1)
                }

                ResultScreen(
                    correctAnswer = correctCount,
                    size = questions.size,
                    navigateToExam = {
                        navController.navigate(Screen.Exam.route)
                    },
                    navigateToHome = {
                        navController.popBackStack(Screen.Home.route, inclusive = false)
                    },
                    navigateToAnswer = {
                        navController.currentBackStackEntry?.savedStateHandle?.apply {
                            set("questions", questions)
                            set("selectedAnswers", selectedAnswers)
                        }
                        navController.navigate(Screen.Answer.route)
                    }
                )

            }

            composable(Screen.Answer.route) {
                val questions = navController.previousBackStackEntry
                    ?.savedStateHandle
                    ?.get<List<Question>>("questions") ?: emptyList()

                val selectedAnswers = navController.previousBackStackEntry
                    ?.savedStateHandle
                    ?.get<List<Int?>>("selectedAnswers") ?: emptyList()

                AnswerScreen(
                    questions = questions,
                    selectedAnswers = selectedAnswers
                )
            }

            composable(Screen.UltimateGuide.route) {
                UltimateGuideScreen()
            }


        }

    }
}
