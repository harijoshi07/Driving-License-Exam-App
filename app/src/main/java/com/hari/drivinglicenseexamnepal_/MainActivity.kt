package com.hari.drivinglicenseexamnepal_

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.hari.drivinglicenseexamnepal_.navigation.AppNavigation
import com.hari.drivinglicenseexamnepal_.ui.component.AppPreferences
import com.hari.drivinglicenseexamnepal_.ui.component.DisclaimerDialog
import com.hari.drivinglicenseexamnepal_.ui.theme.DrivingLicenseExamNepal_Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        installSplashScreen()
        enableEdgeToEdge()

        var showWelcomeDialog by mutableStateOf(AppPreferences.isFirstLaunch(applicationContext))

        setContent {
            DrivingLicenseExamNepal_Theme {

                Box(Modifier.fillMaxSize()){
                    AppNavigation()

                    if (showWelcomeDialog){
                        DisclaimerDialog(
                            onDismiss = {
                                showWelcomeDialog = false
                                AppPreferences.setFirstLaunchDone(applicationContext)
                            }
                        )
                    }
                }
            }
        }
    }
}