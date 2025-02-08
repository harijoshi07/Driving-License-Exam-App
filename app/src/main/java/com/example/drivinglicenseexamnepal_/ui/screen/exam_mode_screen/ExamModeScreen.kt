package com.example.drivinglicenseexamnepal_.ui.screen.exam_mode_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.drivinglicenseexamnepal_.data.constants.Mode
import com.example.drivinglicenseexamnepal_.data.model.Question
import com.example.drivinglicenseexamnepal_.data.questions.getBikeQuestionsA
import com.example.drivinglicenseexamnepal_.ui.component.QuestionComponent
import com.example.drivinglicenseexamnepal_.ui.theme.ButtonColor
import com.example.drivinglicenseexamnepal_.ui.theme.LightBackgroundColor

@Composable
fun ExamModeScreen(
    questions: List<Question> = getBikeQuestionsA(),
    navigateToResult: (List<Question>, List<Int?>) -> Unit
) {
    val randomQuestions = remember { questions.take(5) }
    var currentQuestionIndex by remember { mutableIntStateOf(0) }
    val selectedAnswers =
        remember { mutableStateListOf<Int?>().apply { addAll(List(5) { null }) } }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = LightBackgroundColor)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            QuestionComponent(
                questionNumber = currentQuestionIndex + 1,
                questionText = randomQuestions[currentQuestionIndex].questionText,
                options = listOf(
                    randomQuestions[currentQuestionIndex].optionA,
                    randomQuestions[currentQuestionIndex].optionB,
                    randomQuestions[currentQuestionIndex].optionC,
                    randomQuestions[currentQuestionIndex].optionD
                ),
                selectedAnswer = selectedAnswers[currentQuestionIndex],
                correctAnswer = randomQuestions[currentQuestionIndex].correctOptionIndex - 1,
                onAnswerSelected = { answer ->
                    selectedAnswers[currentQuestionIndex] = answer
                },
                mode = Mode.QUIZ_MODE
            )

            Spacer(modifier = Modifier.weight(1f))

            if (currentQuestionIndex == randomQuestions.size - 1) {
                Button(
                    onClick = {
                        navigateToResult(randomQuestions, selectedAnswers.toList())
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = ButtonColor),
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp),
                ) {
                    Text(
                        text = "Submit",
                        color = Color.White,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            } else {
                Button(
                    onClick = {
                        if (currentQuestionIndex < randomQuestions.size - 1) currentQuestionIndex++
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = ButtonColor),
                    shape = RoundedCornerShape(16.dp),
                ) {
                    Text(
                        text = "Next",
                        color = Color.White,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}