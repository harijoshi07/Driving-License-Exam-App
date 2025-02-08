package com.example.drivinglicenseexamnepal_.ui.screen.study_mode_screen

import com.example.drivinglicenseexamnepal_.R
import com.example.drivinglicenseexamnepal_.data.constants.Mode
import com.example.drivinglicenseexamnepal_.data.model.Question
import com.example.drivinglicenseexamnepal_.ui.component.QuestionComponent
import com.example.drivinglicenseexamnepal_.ui.theme.LightBackgroundColor
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.drivinglicenseexamnepal_.data.questions.getBikeQuestionsA


@Composable
fun StudyScreen(
    questions: List<Question> = getBikeQuestionsA()
) {
    var selectedAnswers by remember { mutableStateOf<List<Int?>>(List(questions.size) { null }) }

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
            // Question list
            LazyColumn(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(24.dp)
            ) {
                items(questions.size) { index ->
                    QuestionComponent(
                        questionNumber = index + 1,
                        questionText = questions[index].questionText,
                        questionImageId = questions[index].questionImageId,
                        options = listOf(
                            questions[index].optionA,
                            questions[index].optionB,
                            questions[index].optionC,
                            questions[index].optionD
                        ),
                        selectedAnswer = selectedAnswers[index],
                        correctAnswer = questions[index].correctOptionIndex - 1,
                        onAnswerSelected = { answer ->
                            selectedAnswers = selectedAnswers.mapIndexed { i, _ ->
                                if (i == index) answer else selectedAnswers[i]
                            }
                        },
                        mode = Mode.STUDY_MODE
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                }
            }
        }
    }
}


@Preview
@Composable
fun StudyModeScreenPreview() {
    StudyScreen(
        questions = listOf(
            Question(
                questionImageId = R.drawable.img,
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
            ),
            Question(
                questionText = "ओभरटेक गर्दा कुन साइडबाट गर्नुपर्छ?",
                optionA = "बायाँ साइडबाट",
                optionB = "दायाँ साइडबाट",
                optionC = "दुबै साइडबाट",
                optionD = "माथिका सबै",
                correctOptionIndex = 1
            ),
            Question(
                questionText = "निम्नमध्ये सवारी चालकको कर्तव्य कुन हो?",
                optionA = "हिफाजतका साथ सवारी चलाउने",
                optionB = "ट्राफिक नियम पालना गर्ने",
                optionC = "निर्धारित कार्य नगर्ने",
                optionD = "माथिका सबै",
                correctOptionIndex = 3
            ),
            Question(
                questionText = "गुडिरहेको मोटरसाइकललाई एक्कासी रोक्नुपर्यो भने के गर्नु पर्छ?",
                optionA = "दुबै ब्रेकलाई एकै पटक थिच्ने",
                optionB = "पछाडिको ब्रेक बेस्सरी थिच्ने",
                optionC = "इन्जिन अफ गर्ने",
                optionD = "गियर डाउन गर्ने",
                correctOptionIndex = 0
            )
        ),
    )
}