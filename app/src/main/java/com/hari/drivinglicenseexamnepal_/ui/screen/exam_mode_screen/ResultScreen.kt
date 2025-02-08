package com.hari.drivinglicenseexamnepal_.ui.screen.exam_mode_screen


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hari.drivinglicenseexamnepal_.R
import com.hari.drivinglicenseexamnepal_.ui.theme.BlueBackgroundColor
import com.hari.drivinglicenseexamnepal_.ui.theme.ButtonColor
import com.hari.drivinglicenseexamnepal_.ui.theme.ButtonColorLightBlue
import com.hari.drivinglicenseexamnepal_.ui.theme.LightBackgroundColor


@Composable
fun ResultScreen(
    correctAnswer: Int,
    size: Int,
    navigateToExam: () -> Unit,
    navigateToHome: () -> Unit,
    navigateToAnswer: () -> Unit,
) {

    val state = rememberScrollState()

    Column(
        modifier = Modifier.background(color = BlueBackgroundColor)
    ) {
        Card(
            colors = CardDefaults.cardColors(
                containerColor = LightBackgroundColor
            ),
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(state)
            ) {
                BoxResult(correctAnswer, size, navigateToExam)

                Column(verticalArrangement = Arrangement.Bottom) {
                    Button(
                        onClick = navigateToAnswer,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp)
                            .height(50.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = ButtonColor
                        ),
                        shape = RoundedCornerShape(16.dp)
                    ) {
                        Text(
                            text = "Show Answer",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }

                    Button(
                        onClick = navigateToHome,
                        colors = ButtonDefaults.buttonColors(
                            containerColor = ButtonColor
                        ),
                        shape = RoundedCornerShape(16.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                            .height(50.dp)
                    ) {
                        Text(
                            text = "Close",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                }
            }
        }
    }
}


@Composable
fun BoxResult(
    correctAnswer: Int,
    size: Int,
    navigateToExam: () -> Unit,
    ) {

    Column(modifier = Modifier.padding(16.dp)) {
        Card(
            colors = CardDefaults.cardColors(
                containerColor = BlueBackgroundColor
            ),
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxSize(0.4f)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxSize()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.balloons),
                    contentDescription = "",
                    modifier = Modifier.size(160.dp)
                )

                Spacer(modifier = Modifier.height(32.dp))

                Button(
                    onClick = navigateToExam,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = ButtonColorLightBlue
                    ),
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(50.dp)
                ) {

                    Text(
                        text = "Play Again",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Column(modifier = Modifier.padding(8.dp)) {

            Row {
                TextResult(title = "CORRECT", value = "$correctAnswer")
                Spacer(modifier = Modifier.weight(1f))
                TextResult(title = "INCORRECT", value = "${size - correctAnswer}")

            }
            Spacer(modifier = Modifier.height(24.dp))

            Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth()) {
                TextResult(
                    title = "RESULT",
                    value = "${if (correctAnswer == 0) 0 else (correctAnswer * 100) / size}%"
                )
            }
        }
    }
}

@Composable
fun TextResult(
    title: String,
    value: String,
    modifier: Modifier = Modifier
) {

    Column(horizontalAlignment = Alignment.CenterHorizontally) {

        Text(
            text = title,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.black),
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = value,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
        )
    }
}

@Preview
@Composable
private fun QuizResultScreenPreview() {

    ResultScreen(correctAnswer = 1, size = 5, {}, {}, {})
    //BoxResult()
    //TextResult(title = "title", value = "value")

}