package com.hari.drivinglicenseexamnepal_.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Category : Screen("category/{vehicleType}")
    object Study : Screen("study/{vehicleType}/{categoryTitle}")
    object Exam : Screen("quiz/{vehicleType}")
    object Result : Screen("result")
    object Answer : Screen("answer")
    object UltimateGuide: Screen("ultimate_guide")
}
