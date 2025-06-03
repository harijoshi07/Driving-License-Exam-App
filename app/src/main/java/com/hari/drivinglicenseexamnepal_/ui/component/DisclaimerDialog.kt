package com.hari.drivinglicenseexamnepal_.ui.component

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.window.DialogProperties
import com.hari.drivinglicenseexamnepal_.ui.theme.BlueBackgroundColor
import com.hari.drivinglicenseexamnepal_.ui.theme.LightBackgroundColor

@Composable
fun DisclaimerDialog(
    onDismiss: () -> Unit
) {
    AlertDialog(
        onDismissRequest = { },
        title = {
            Text(
                text = "Welcome!",
                fontWeight = FontWeight.SemiBold
            )
        },
        text = {
            Text(
                text = "We're glad to have you. " +
                    "This app is designed to help you prepare for your driving license exam " +
                    "with question set available in dotm website and is not affiliated" +
                        "with any government entity. Best of luck! ",
                textAlign = TextAlign.Justify
            )
        },
        confirmButton = {
            Button(
                onClick = onDismiss,
                colors = ButtonDefaults.buttonColors(
                    containerColor = BlueBackgroundColor
                )
            ) {
                Text("Get Started")
            }
        },
        properties = DialogProperties(
            dismissOnBackPress = false,  // Prevent back button dismiss
            dismissOnClickOutside = false  // Prevent outside taps
        ),
        containerColor = LightBackgroundColor
    )
}