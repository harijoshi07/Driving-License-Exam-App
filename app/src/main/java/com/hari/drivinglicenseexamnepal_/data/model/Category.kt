package com.hari.drivinglicenseexamnepal_.data.model


import com.hari.drivinglicenseexamnepal_.R

data class Category(
    val title: String,
    val noOfQuestions: String,
    val painterId: Int
)


val itemCategory = listOf(
    Category(title = "सवारी सञ्चालन", noOfQuestions = "130 questions", painterId = R.drawable.cateogyr_drive),
    Category(title = "सवारी कानुन", noOfQuestions = "90 questions", painterId = R.drawable.category_law_rules),
    Category(title = "प्राविधिक ज्ञान", noOfQuestions = "80 questions", painterId = R.drawable.category_repair),
    Category(title = "वातावरण प्रदूषण", noOfQuestions = "30 questions", painterId = R.drawable.category_pollution),
    Category(title = "दुर्घटना सचेतना", noOfQuestions = "60 questions", painterId = R.drawable.category_accident),
    Category(title = "ट्राफिक संकेत", noOfQuestions = "110 questions", painterId = R.drawable.category_traffic_rules)
)