package com.example.drivinglicenseexamnepal_

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.drivinglicenseexamnepal_.navigation.AppNavigation
import com.example.drivinglicenseexamnepal_.ui.theme.DrivingLicenseExamNepal_Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DrivingLicenseExamNepal_Theme {

                AppNavigation()
            }
        }
    }
}