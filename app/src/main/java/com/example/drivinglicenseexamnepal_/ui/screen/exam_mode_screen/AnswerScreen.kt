package com.example.drivinglicenseexamnepal_.ui.screen.exam_mode_screen

import com.example.drivinglicenseexamnepal_.data.constants.Mode
import com.example.drivinglicenseexamnepal_.data.model.Question
import com.example.drivinglicenseexamnepal_.ui.component.QuestionComponent
import com.example.drivinglicenseexamnepal_.ui.theme.LightBackgroundColor
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun AnswerScreen(
    questions: List<Question>,
    selectedAnswers: List<Int?>,
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = LightBackgroundColor)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp)
        ) {

            LazyColumn(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(24.dp)
            ) {
                items(questions.size) { index ->

                    val question = questions.getOrNull(index)
                    val selectedAnswer = selectedAnswers.getOrNull(index)

                    if (question != null && selectedAnswer != null) {
                        val isCorrect = selectedAnswer == question.correctOptionIndex - 1

                        QuestionComponent(
                            questionNumber = index + 1,
                            questionText = question.questionText,
                            options = listOf(
                                question.optionA,
                                question.optionB,
                                question.optionC,
                                question.optionD
                            ),
                            selectedAnswer = selectedAnswer,
                            correctAnswer = question.correctOptionIndex - 1,
                            onAnswerSelected = {}, // No selection allowed in results
                            mode = Mode.RESULT_MODE
                        )
                    }
                }
            }

        }
    }
}

@Preview
@Composable
fun AnswerScreenPreview() {
    AnswerScreen(
        questions = listOf(
            Question(
                questionText = "जेब्रा क्रसिङ केका लागि प्रयोग गरिन्छ?",
                optionA = "उभिन",
                optionB = "पैदल यात्रीले बाटो काट्न",
                optionC = "गाडी रोक्न",
                optionD = "गाडी कुदाउन",
                correctOptionIndex = 1
            ),
            Question(
                questionText = "बढी उकालोमा सवारी चलाउँदा कुन गियरमा चलाउनु पर्छ?",
                optionA = "एक गियरमा",
                optionB = "दुई गियरमा",
                optionC = "तीन गियरमा",
                optionD = "चार गियरमा",
                correctOptionIndex = 0
            )
        ),
        selectedAnswers = listOf(1, 2),
    )
}
