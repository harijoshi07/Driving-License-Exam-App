package com.hari.drivinglicenseexamnepal_.data.constants

data class Phase(val title: String, val subtitle: String, val steps: List<Pair<String, List<String>?>>)

val phases = listOf(
    Phase(
        "Phase I", "Online Form", listOf(
            "1. Visit the official website:" to listOf(
                "For Bagmati and Pokhara: applydlnew.dotm.gov.np",
                "For other regions: applydl.dotm.gov.np"
            ),
            "2. Fill the form carefully with the mobile number registered in your name. Double-check all details to ensure there are no errors." to null,
            "3. Choose the Transport Office where you want to visit." to null,
            "4. Select a visit date that fits your schedule." to null
        )
    ),
    Phase(
        "Phase II", "Office Visit", listOf(
            "1. What you need for the office visit:" to listOf(
                "Application form",
                "Original citizenship (ALWAYS carry original citizenship when visiting any Government Office)",
                "Medical report confirming blood group (get it from your nearest hospital as it'll cost you less money)"
            ),
            "2. What you DON'T need:" to listOf(
                "don't attach passport-sized photo in application form, leave it empty",
                " don't buy and attach the ticket they sell"
            ),
            "3. Process:" to listOf(
                "Biometric: Finger print and photo will be taken.",
                "Eye Check: ",
                "Final Stage: Pay Rs. 500 for written test and trial."
            )
        )
    ),
    Phase(
        "Phase III", "Written Exam", listOf(

            "1. Checklist for Exam Day:" to listOf(
                "Admit card",
                "Original citizenship",
            ),

            "2. Exam Details:" to listOf(
                "Languages: Nepali or English.",
                "There will be 25 questions asked",
                "You'll need to answer minimum of 15 questions correctly to pass",
                "Exam duration will be 30 minutes",
                "If you want to take the exam in English, you must submit a form for that beforehand.",
                "Result will be published on same day in facebook page/website of transportation office within 5 pm."
            ),
            "3. If you fail:" to listOf(
                "Wait 90 days before reapplying.",
                "You must retake the written exam."
            )
        )
    ),
    Phase(
        "Phase IV", "Trial Exam", listOf(
            "1. Checklist for Trial Day:" to listOf(
                "Admit card",
                "Original citizenship",
                "Wear shoes (no slippers allowed)",
                "Around 300 rupees as trail fee to the trail centre."
            ),
            "2. Key Tips:" to listOf(
                "Go a day before or early in the morning of trail day to practice in the trial centre where your trial exam will happen.",
                "This will highly boost your confidence as you'll get familiar with vehicles and place",
            ),
            "3. If you pass:" to listOf(
                "Visit the Transport Office after a week taking your admit card.",
                "Pay Rs. 1500 and collect tax receipts (Green and Red).",
                "Keep them safe and use them as your License until it'll be printed digitally.",
                "You can check dotm website if your license has been printed digitally or not."
            ),
            "4. If you fail:" to listOf(
                "You have two more attempts.",
                "For retrial, visit on the 3rd day after failing and pay Rs. 500.",
                "If you fail all 3 attempts, restart the process (biometrics not needed, eye check required)."
            )
        )
    )
)