package com.example.drivinglicenseexamnepal_.ui.screen.home_screen

import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.*
import com.example.drivinglicenseexamnepal_.R
import com.example.drivinglicenseexamnepal_.data.constants.Mode
import com.example.drivinglicenseexamnepal_.data.constants.VehicleType
import com.example.drivinglicenseexamnepal_.ui.theme.ButtonColor
import com.example.drivinglicenseexamnepal_.ui.theme.ButtonColorUnselected
import com.example.drivinglicenseexamnepal_.ui.theme.CardColor
import com.example.drivinglicenseexamnepal_.ui.theme.LightBackgroundColor


@Composable
fun HomeScreen(
    navigateToCategory: (String) -> Unit,
    navigateToQuiz: (String) -> Unit,
    navigateToUltimateGuide: () -> Unit,
) {

    var selectedMode by remember { mutableStateOf("Study Mode") }
    val state = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                LightBackgroundColor,
                shape = RoundedCornerShape(topStartPercent = 8, topEndPercent = 8)
            )
            .padding(horizontal = 32.dp)
            .verticalScroll(state),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Spacer(Modifier.height(4.dp))

        Box(
            modifier = Modifier
                .background(
                    color = CardColor,
                    shape = RoundedCornerShape(12.dp)
                )
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                HomeScreenButton(
                    text = "Study Mode",
                    isSelected = selectedMode == "Study Mode",
                    onClick = { selectedMode = "Study Mode" },
                )
                HomeScreenButton(
                    text = "Exam Mode",
                    isSelected = selectedMode == "Exam Mode",
                    onClick = { selectedMode = "Exam Mode" },
                )
            }
        }

        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            // Vehicle cards
            HomeScreenCard(
                title = "Bike - Scooter",
                subtitle = "Category A - K",
                icon = R.drawable.bike,
                onClick = {
                    if (selectedMode == "Study Mode") navigateToCategory(VehicleType.BIKE)
                    else navigateToQuiz(VehicleType.BIKE)
                }
            )
            HomeScreenCard(
                title = "Car",
                subtitle = "Category B",
                icon = R.drawable.car,
                onClick = {
                    if (selectedMode == "Study Mode") navigateToCategory(VehicleType.CAR)
                    else navigateToQuiz(VehicleType.CAR)
                }
            )

            UltimateGuideCard(navigateToUltimateGuide = navigateToUltimateGuide)
        }
    }
}

@Composable
fun HomeScreenButton(
    text: String,
    isSelected: Boolean,
    onClick: () -> Unit,
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = if (isSelected) ButtonColor else ButtonColorUnselected
        ),
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier
            .padding(horizontal = 4.dp)
    ) {
        Text(
            text = text,
            color = if (isSelected) Color.White else ButtonColor
        )
    }
}

@Composable
fun HomeScreenCard(
    title: String,
    subtitle: String,
    @DrawableRes icon: Int,
    onClick: () -> Unit
) {
    Card(
        onClick = onClick, // Use onClick here for better integration
        colors = CardDefaults.cardColors(containerColor = CardColor),
        border = BorderStroke(width = 0.25.dp, color = ButtonColor),
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
        ) {
            Column {
                Text(
                    text = title,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Text(
                    text = subtitle,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Light,
                    color = Color.DarkGray
                )
            }

            Spacer(modifier = Modifier.width(16.dp))

            Icon(
                painter = painterResource(id = icon),
                contentDescription = title,
                tint = Color.Unspecified,
                modifier = Modifier
                    .height(160.dp)
                    .width(260.dp)
            )
        }

    }


}


@Composable
fun UltimateGuideCard(navigateToUltimateGuide: () -> Unit) {

    Card(
        colors = CardDefaults.cardColors(containerColor = CardColor),
        shape = RoundedCornerShape(12.dp),
        border = BorderStroke(width = 0.25.dp, color = ButtonColor),
        onClick = navigateToUltimateGuide
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(12.dp)
        ) {
            Text(
                text = "YOUR ULTIMATE GUIDE:",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Text(
                text = "from filling the form and preparing for the exam to getting your license in hand, all explained step by step.",
                fontSize = 14.sp,
                color = Color.Black,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Button(
                onClick = navigateToUltimateGuide,
                colors = ButtonDefaults.buttonColors(containerColor = ButtonColor)
            ) {
                Text(
                    text = "Let's Start",
                    color = Color.White
                )
            }
        }
    }

}

@Preview(showBackground = true, heightDp = 800)
@Composable
private fun PreviewHomeScreen() {
    HomeScreen({}, {}, {})
}
