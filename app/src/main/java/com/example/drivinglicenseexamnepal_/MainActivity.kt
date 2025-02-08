package com.example.drivinglicenseexamnepal_

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.drivinglicenseexamnepal_.ui.screen.home_screen.HomeScreen
import com.example.drivinglicenseexamnepal_.ui.screen.study_mode_screen.CategoryScreen
import com.example.drivinglicenseexamnepal_.ui.screen.study_mode_screen.StudyScreen
import com.example.drivinglicenseexamnepal_.ui.theme.DrivingLicenseExamNepal_Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DrivingLicenseExamNepal_Theme {
                //HomeScreen()
                //CategoryScreen()
                StudyScreen()
            }
        }
    }
}