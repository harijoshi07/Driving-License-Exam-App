package com.example.drivinglicenseexamnepal_.data.model


data class Question(
    val questionText: String? = null, // The question text in Nepali
    val questionImageId: Int? = null, // The question as Image
    val optionA: String,
    val optionB: String,
    val optionC: String,
    val optionD: String,
    val correctOptionIndex: Int
)