package com.example.drivinglicenseexamnepal_.data.questions

import com.example.drivinglicenseexamnepal_.R
import com.example.drivinglicenseexamnepal_.data.model.Question


fun getCommonQuestions(): List<Question>{

    val quizQuestions6 = listOf(
        Question(
            questionText = "जेब्रा क्रसमा गाडी पुग्दा हरियो बत्ती बलेमा के गर्नु पर्छ?",
            optionA = "सरासर अगाडि बढ्ने",
            optionB = "सवारी रोक्ने",
            optionC = "सवारी अगाडि बढाउन तयारी अवस्थामा रहने",
            optionD = "माथिका सबै",
            correctOptionIndex = 1
        ),
        Question(
            questionText = "जेब्रा क्रसमा गाडी पुग्दा पहेंलो बत्ती बलेमा के गर्नु पर्छ?",
            optionA = "सरासर अघि बढ्ने",
            optionB = "सवारी रोक्ने",
            optionC = "सवारी अगाडि बढाउन तयारी अवस्थामा रहने",
            optionD = "माथिका सबै",
            correctOptionIndex = 3
        ),
        Question(
            questionText = "गति शून्य रेखाले के संकेत गर्छ?",
            optionA = "गाडी रोक्ने",
            optionB = "गाडीको गति कम गर्ने",
            optionC = "गाडी फर्काउने",
            optionD = "गाडी तिब्र गतिमा चलाउने",
            correctOptionIndex = 1
        ),
        Question(
            questionText = "जेब्रा क्रसमा गाडी पुग्दा रातो बत्ती बलेमा के गर्नु पर्छ?",
            optionA = "सरासर अघि बढ्ने",
            optionB = "सवारी रोक्ने",
            optionC = "सवारी अगाडि बढाउन तयारी अवस्थामा रहने",
            optionD = "माथिका सबै",
            correctOptionIndex = 2
        ),
        Question(
            questionText = "सवारी साधनको पछाडिको रातो बत्ती बलेमा के बुझिन्छ?",
            optionA = "गियर परिवर्तन गरेको",
            optionB = "साइड दिएको",
            optionC = "ब्रेक लगाइएको",
            optionD = "स्पीड बढाउन लागेको",
            correctOptionIndex = 3
        ),
        Question(
            questionText = "तीनकुने (त्रिभुज) आकारको ट्राफिक चिन्हले के जनाउँछ?",
            optionA = "सूचनामूलक",
            optionB = "सचेतनामूलक",
            optionC = "प्रतिबन्धात्मक",
            optionD = "माथिका सबै",
            correctOptionIndex = 2
        ),
        Question(
            questionText = "चौकुने (आयात वा वर्गाकार) आकारको ट्राफिक चिन्हले के जनाउँछ?",
            optionA = "सूचनामूलक",
            optionB = "सचेतनामूलक",
            optionC = "प्रतिबन्धात्मक",
            optionD = "माथिका सबै",
            correctOptionIndex = 1
        ),
        Question(
            questionText = "वृताकार आकारको ट्राफिक चिन्हले के जनाउँछ?",
            optionA = "सूचनामूलक",
            optionB = "सचेतनामूलक",
            optionC = "प्रतिबन्धात्मक",
            optionD = "माथिका सबै",
            correctOptionIndex = 3
        ),
        Question(
            questionText = "सडकको रेखाङ्कन किन गरिन्छ?",
            optionA = "सवारी सहज बनाउन",
            optionB = "सडक राम्रो पार्न",
            optionC = "जरिवाना गर्न",
            optionD = "माथिका सबै",
            correctOptionIndex = 1
        ),
        Question(
            questionText = "सडकको रेखाङ्कन गर्न तलकामध्ये कुन रङ्को प्रयोग गरिँदैन?",
            optionA = "सेतो",
            optionB = "पहेंलो",
            optionC = "रातो",
            optionD = "कालो",
            correctOptionIndex = 3
        ),
        Question(
            questionText = "जेब्र क्रसिङ्गको रेखाङ्कन गर्न कुन रङ्को प्रयोग गरिँदैन?",
            optionA = "पहेंलो",
            optionB = "कालो",
            optionC = "सेतो",
            optionD = "माथिका कुनै पनि होइन",
            correctOptionIndex = 1
        ),
        Question(
            questionText = "सडकको मध्य भागमा कोरिएको लगातार सेतो रेखाले के जनाउँछ?",
            optionA = "रेखा क्रस गर्न नसकिने",
            optionB = "रेखा क्रस गर्न सकिने",
            optionC = "माथिका दुवै",
            optionD = "माथिका कुनै पनि होइन",
            correctOptionIndex = 1
        ),
        Question(
            questionText = "ट्राफिक लाइटमा कति किसिमका रङ्गीन बत्तिहरू हुन्छन्?",
            optionA = "२ किसिमका",
            optionB = "३ किसिमका",
            optionC = "४ किसिमका",
            optionD = "५ किसिमका",
            correctOptionIndex = 2
        ),
        Question(
            questionText = "ट्राफिकले दिने इशारा कसका लागि हुन्छ?",
            optionA = "सवारी चालकका लागि",
            optionB = "पैदल यात्रुका लागि",
            optionC = "पैदलयात्री र सवारी चालकका लागि",
            optionD = "कुनै पनि होइन",
            correctOptionIndex = 3
        ),
        Question(
            questionText = "ट्राफिक बत्तिको रङ्ग निम्नमध्ये कुन होइन?",
            optionA = "पहेंलो",
            optionB = "रातो",
            optionC = "हरियो",
            optionD = "कालो",
            correctOptionIndex = 4
        ),
        Question(
            questionText = "अटोमेटिक ट्राफिक संकेत भनेको के हो?",
            optionA = "सडक छेउमा राखिएको चिन्ह",
            optionB = "सडकमा राखिएको विद्युतिय बत्ती",
            optionC = "ट्राफिक प्रहरी गर्ने संकेत",
            optionD = "कुनै पनि होइन",
            correctOptionIndex = 2
        ),
        Question(
            questionText = "ट्राफिक चिन्हको पालना गर्नु कसको कर्तव्य हो?",
            optionA = "सवारी चालकको",
            optionB = "पैदल यात्रीको",
            optionC = "ठूला सवारीको",
            optionD = "माथिका सबै",
            correctOptionIndex = 4
        ),
        Question(
            questionText = "ट्राफिक संकेत भनेको के हो?",
            optionA = "सवारी चालकले दिने संकेत",
            optionB = "प्रहरीले दिने संकेत",
            optionC = "सडक नियम पालन गर्न राखिएको संकेत",
            optionD = "माथिका सबै",
            correctOptionIndex = 3
        ),
        Question(
            questionText = "अन्तराष्ट्रिय ट्राफिक चिन्ह कति प्रकारका हुन्छन्?",
            optionA = "दुई प्रकारका",
            optionB = "तीन प्रकारका",
            optionC = "चार प्रकारका",
            optionD = "निश्चित छैन",
            correctOptionIndex = 2
        ),
        Question(
            questionText = "लेन छुट्याउने संकेत सडकको कुन भागमा कोरिएको हुन्छ?",
            optionA = "दायाँतिरको छेउमा",
            optionB = "बायाँतिरको छेउमा",
            optionC = "सडकको बीचमा",
            optionD = "जहाँ कोरे पनि हुन्छ",
            correctOptionIndex = 3
        ),
        Question(
            questionText = "राजमार्गमा दिशा संकेत गर्न राखिएको बोर्डको रङ कस्तो हुन्छ?",
            optionA = "हरियो",
            optionB = "रातो",
            optionC = "रातो",
            optionD = "कालो",
            correctOptionIndex = 1
        ),
        Question(
            questionText = "लेनलाइन र जेब्रा क्रसिङलाई के पनि भनिन्छ?",
            optionA = "सडक मार्किङ",
            optionB = "ट्राफिक मार्किङ",
            optionC = "हटस्पोट",
            optionD = "माथिका सबै",
            correctOptionIndex = 1
        ),
        Question(
            questionText = "प्रतिबन्धात्मक ट्राफिक चिन्ह कस्तो आकारको हुन्छ?",
            optionA = "गोलाकार",
            optionB = "त्रिभुजाकार",
            optionC = "वर्गाकार",
            optionD = "आयताकार",
            correctOptionIndex = 1
        ),
        Question(
            questionText = "चौबाटोमा ट्राफिक लाइट किन राखिन्छ?",
            optionA = "चालकले रातो बाटो देखोस् भनेर",
            optionB = "ट्राफिक कन्ट्रोल गर्न",
            optionC = "सवारी मोड्न",
            optionD = "सवारी पार्क गर्न",
            correctOptionIndex = 2
        ),
        Question(
            questionText = "तलकामध्ये सडकमा ट्राफिक कन्ट्रोल के ले गर्दैन?",
            optionA = "ट्राफिक प्रहरी",
            optionB = "यातायात व्यवस्था विभाग",
            optionC = "सडक रेखा",
            optionD = "ट्राफिक संकेत",
            correctOptionIndex = 2
        ),
        //images from here
        Question(
            questionImageId = R.drawable.img,
            optionA = "वर्गाकार",
            optionB = "आयातकार",
            optionC = "पार्किङ स्थल",
            optionD = "अस्पताल",
            correctOptionIndex = 3
        ),
        Question(
            questionImageId = R.drawable.img_1,
            optionA = "एकतर्फी बाटो",
            optionB = "दुईतर्फी बाटो",
            optionC = "पूर्वतर्फ",
            optionD = "पश्चिमतर्फ",
            correctOptionIndex = 1
        ),
        Question(
            questionImageId = R.drawable.img_2,
            optionA = "पसल",
            optionB = "वर्क सप",
            optionC = "घर",
            optionD = "पार्किङ स्थल",
            correctOptionIndex = 2
        ),
        Question(
            questionImageId = R.drawable.img_3,
            optionA = "धार्मिक क्षेत्र",
            optionB = "आवास क्षेत्र",
            optionC = "अस्पताल",
            optionD = "प्राथमिक उपचार",
            correctOptionIndex = 4
        ),
        Question(
            questionImageId = R.drawable.img_4,
            optionA = "उकालो बाटो",
            optionB = "एकतर्फी बाटो",
            optionC = "उभिने ठाउँ",
            optionD = "दायाँ मोड",
            correctOptionIndex = 3
        ),
        Question(
            questionImageId = R.drawable.img_5,
            optionA = "टेलिफोन",
            optionB = "इन्टरनेट",
            optionC = "टुल",
            optionD = "प्रहरी",
            correctOptionIndex = 1
        ),
        Question(
            questionImageId = R.drawable.img_6,
            optionA = "टेलिफोन सेवा",
            optionB = "ट्रक सेवा",
            optionC = "टी-जक्सन",
            optionD = "बाटो समाप्त",
            correctOptionIndex = 4
        ),
        Question(
            questionImageId = R.drawable.img_7,
            optionA = "पैदल यात्रिको बाटो",
            optionB = "विद्यालय",
            optionC = "प्रहरी",
            optionD = "वियोगको बाटो",
            correctOptionIndex = 1
        ),
        Question(
            questionImageId = R.drawable.img_8,
            optionA = "गाडी राख्ने ठाउँ",
            optionB = "अस्पताल",
            optionC = "मेसिन",
            optionD = "पेट्रोल पम्प",
            correctOptionIndex = 4
        ),
        Question(
            questionImageId = R.drawable.img_9,
            optionA = "विश्राम स्थल",
            optionB = "रिफ्रेस सेन्टर",
            optionC = "बास बस्ने ठाउँ",
            optionD = "अस्पताल",
            correctOptionIndex = 3
        ),
        Question(
            questionImageId = R.drawable.img_10,
            optionA = "विश्राम स्थल",
            optionB = "अस्पताल",
            optionC = "आवास क्षेत्र",
            optionD = "बास बस्ने ठाउँ",
            correctOptionIndex = 2
        ),
        Question(
            questionImageId = R.drawable.img_11,
            optionA = "घर",
            optionB = "मन्दिर",
            optionC = "जलपान",
            optionD = "विद्यालय",
            correctOptionIndex = 3
        ),
        Question(
            questionImageId = R.drawable.img_12,
            optionA = "पैदल यात्री र साईकलको बाटो",
            optionB = "विद्यालय",
            optionC = "केटाकेटी",
            optionD = "भीडभाड हुने क्षेत्र",
            correctOptionIndex = 1
        ),
        Question(
            questionImageId = R.drawable.img_13,
            optionA = "साइकल मर्मत",
            optionB = "साइकलको बाटो",
            optionC = "साइकल निषेध",
            optionD = "साइकल यात्री",
            correctOptionIndex = 2
        ),
        Question(
            questionImageId = R.drawable.img_14,
            optionA = "पार्किङ निषेध",
            optionB = "बस बिसौनी",
            optionC = "बस पार्क",
            optionD = "पार्किङ स्थल",
            correctOptionIndex = 2
        ),
        Question(
            questionImageId = R.drawable.img_15,
            optionA = "वन क्षेत्र",
            optionB = "मन्दिर",
            optionC = "वनभोज स्थल",
            optionD = "विद्यालय",
            correctOptionIndex = 3
        ),
        Question(
            questionImageId = R.drawable.img_16,
            optionA = "जेब्र्रा क्रस",
            optionB = "विश्राम स्थल",
            optionC = "पार्किङ स्थल",
            optionD = "विद्यालय",
            correctOptionIndex = 1
        ),
        Question(
            questionImageId = R.drawable.img_17,
            optionA = "चिल्लो ठाउँ",
            optionB = "उछिन्ने ठाउँ",
            optionC = "अत्यन्त जरुरी अवस्थामा रहने",
            optionD = "वन क्षेत्र",
            correctOptionIndex = 3
        ),
        Question(
            questionImageId = R.drawable.img_18,
            optionA = "सडक छेउका रेखाहरु",
            optionB = "कच्ची सडक",
            optionC = "सडक",
            optionD = "पार्किङ",
            correctOptionIndex = 1
        ),
        Question(
            questionImageId = R.drawable.img_19,
            optionA = "कालो पत्रे सडक",
            optionB = "उछिन्ने ठाउँ",
            optionC = "सडकबीचका रेखाहरु",
            optionD = "रोकिने ठाउँ",
            correctOptionIndex = 3
        ),
        Question(
            questionImageId = R.drawable.img_20,
            optionA = "प्रवेश निषेध",
            optionB = "पार्किङ निषेध",
            optionC = "उछिन्न निषेध",
            optionD = "रोकिन निषेध",
            correctOptionIndex = 4
        ),
        Question(
            questionImageId = R.drawable.img_21,
            optionA = "प्रवेश निषेध",
            optionB = "पार्किङ निषेध",
            optionC = "पार्किङ स्थल",
            optionD = "पब्लिक निषेध",
            correctOptionIndex = 2
        ),
        Question(
            questionImageId = R.drawable.img_22,
            optionA = "प्रवेश निषेध",
            optionB = "दायाँ मोड्न निषेध",
            optionC = "पार्किङ स्थल",
            optionD = "रोकिने ठाउँ",
            correctOptionIndex = 1
        ),
        Question(
            questionImageId = R.drawable.img_23,
            optionA = "पार्किङ निषेध",
            optionB = "उछिन्ने ठाउँ",
            optionC = "पार्किङ स्थल",
            optionD = "दायाँ मोड्न निषेध",
            correctOptionIndex = 4
        ),
        Question(
            questionImageId = R.drawable.img_24,
            optionA = "पार्किङ निषेध",
            optionB = "वायाँ मोड्न निषेध",
            optionC = "पार्किङ स्थल",
            optionD = "दाहिने मोड",
            correctOptionIndex = 2
        ),
        Question(
            questionImageId = R.drawable.img_25,
            optionA = "दायाँ मोड्न निषेध",
            optionB = "वायाँ मोड्न निषेध",
            optionC = "यू-टर्न निषेध",
            optionD = "उछिन्ने ठाउँ",
            correctOptionIndex = 3
        ),
        Question(
            questionImageId = R.drawable.img_26,
            optionA = "पार्किङ निषेध",
            optionB = "अधिकतम गति सीमा",
            optionC = "पार्किङ स्थल",
            optionD = "जाने ठाउँ",
            correctOptionIndex = 2
        ),
        Question(
            questionImageId = R.drawable.img_27,
            optionA = "पार्किङ",
            optionB = "उछिन्ने ठाउँ",
            optionC = "सवारी चौडाई सीमित",
            optionD = "विद्यालय",
            correctOptionIndex = 3
        ),
        Question(
            questionImageId = R.drawable.img_28,
            optionA = "उछिन्न निषेध",
            optionB = "उछिन्ने ठाउँ",
            optionC = "एकतर्फी बाटो",
            optionD = "दुईतर्फी बाटो",
            correctOptionIndex = 1
        ),
        Question(
            questionImageId = R.drawable.img_29,
            optionA = "मोड्न निषेध",
            optionB = "घुम्ती",
            optionC = "गति सीमा समाप्त",
            optionD = "हर्न निषेध",
            correctOptionIndex = 4
        ),
        Question(
            questionImageId = R.drawable.img_30,
            optionA = "रोक",
            optionB = "रोक, हेर र जाऊँ",
            optionC = "पार्किङ स्थल",
            optionD = "सिधा मात्र जाऊ",
            correctOptionIndex = 2
        ),
        Question(
            questionImageId = R.drawable.img_31,
            optionA = "पार्किङ निषेध",
            optionB = "उछिन्ने ठाउँ",
            optionC = "पार्किङ स्थल",
            optionD = "गति सीमा समाप्त",
            correctOptionIndex = 4
        ),
        Question(
            questionImageId = R.drawable.img_32,
            optionA = "सिधा जान निषेध",
            optionB = "सिधा मात्र जाऊ",
            optionC = "रोकिने ठाउँ",
            optionD = "अगाडि गएर वायाँ मोड",
            correctOptionIndex = 2
        ),
        Question(
            questionImageId = R.drawable.img_33,
            optionA = "सिधा मात्र जाऊ",
            optionB = "कुनै तिरबाट जाऊ",
            optionC = "अगाडि गएर बायाँ मोड",
            optionD = "गति सीमा समाप्त",
            correctOptionIndex = 3
        ),
        Question(
            questionImageId = R.drawable.img_34,
            optionA = "कुनै तिरबाट जाऊ",
            optionB = "दायाँ बायाँ सिधा जाऊ",
            optionC = "बायाँ मोड",
            optionD = "दायाँ मोड",
            correctOptionIndex = 1
        ),
        Question(
            questionImageId = R.drawable.img_35,
            optionA = "दायाँ मोड",
            optionB = "सानो गोल घुम्ती दायाँबाट आउनेलाई जान देऊ",
            optionC = "घुमेर जाऊ",
            optionD = "दायाँ घुम्ती",
            correctOptionIndex = 2
        ),
        Question(
            questionImageId = R.drawable.img_36,
            optionA = "सवारी भार सीमा",
            optionB = "एक्सल भार सीमा",
            optionC = "सवारी लम्बाई सीमा",
            optionD = "सवारी चौडाई सीमा",
            correctOptionIndex = 1
        ),
        Question(
            questionImageId = R.drawable.img_37,
            optionA = "दायाँ मोड",
            optionB = "सिधा अगाडि",
            optionC = "बायाँ मोड",
            optionD = "बायाँ मोड",
            correctOptionIndex = 3
        ),
        Question(
            questionImageId = R.drawable.img_38,
            optionA = "बायाँ घुम्ती",
            optionB = "बायाँ च्याप",
            optionC = "बायाँ मोड",
            optionD = "दायाँ मोड",
            correctOptionIndex = 2
        ),
        Question(
            questionImageId = R.drawable.img_39,
            optionA = "एकतर्फी सवारी",
            optionB = "दुईतर्फी सवारी",
            optionC = "सिधा अगाडि बढ",
            optionD = "अगाडि जाऊ",
            correctOptionIndex = 1
        ),
        Question(
            questionImageId = R.drawable.img_40,
            optionA = "रोकेर बस्ने",
            optionB = "पार्किङलाइट बाल्ने",
            optionC = "लगातार हर्न बजाउने",
            optionD = "माथिका सबै",
            correctOptionIndex = 3
        ),
        Question(
            questionImageId = R.drawable.img_41,
            optionA = "ट्रक निषेध",
            optionB = "सवारी निषेध",
            optionC = "नो पार्किङ",
            optionD = "सवारी काट्ने ठाउँ",
            correctOptionIndex = 1
        ),
        Question(
            questionImageId = R.drawable.img_42,
            optionA = "सवारी उचाइ सीमा",
            optionB = "सवारी लम्बाइ सीमा",
            optionC = "सवारी चौडाइ सीमा",
            optionD = "१० मिटर मात्र अगाडि जाउ",
            correctOptionIndex = 2
        ),
        Question(
            questionImageId = R.drawable.img_43,
            optionA = "सवारी चौडाइ सीमा",
            optionB = "ठीक ४.४ मिटरको सवारी हुनुपर्छ",
            optionC = "एक्सल भार सीमा",
            optionD = "सवारी उचाइ सीमा",
            correctOptionIndex = 4
        ),
        Question(
            questionImageId = R.drawable.img_44,
            optionA = "सवारी चौडाइ सीमा",
            optionB = "एक्सल भार सीमा",
            optionC = "सवारी उचाइ सीमा",
            optionD = "सवारी लम्बाइ सीमा",
            correctOptionIndex = 2
        ),
        Question(
            questionImageId = R.drawable.img_45,
            optionA = "वयल गाडा निषेध",
            optionB = "सवारी निषेध",
            optionC = "सवारी वजन सीमा",
            optionD = "गाडा मात्र प्रवेश",
            correctOptionIndex = 1
        ),
        Question(
            questionImageId = R.drawable.img_46,
            optionA = "वृत्त",
            optionB = "गोलो घुम्तीमा जाउ",
            optionC = "जाने ठाउँ",
            optionD = "जाउ (अस्थाई चिन्ह)",
            correctOptionIndex = 4
        ),
        Question(
            questionImageId = R.drawable.img_47,
            optionA = "वाई-जक्सन",
            optionB = "टी-जक्सन",
            optionC = "बाटो समाप्त",
            optionD = "टर्न टु टी",
            correctOptionIndex = 2
        ),
        Question(
            questionImageId = R.drawable.img_48,
            optionA = "ढुंगा खस्ने ठाउँ",
            optionB = "बाटोमा काम हुँदै",
            optionC = "खतरा",
            optionD = "सुरक्षित ठाउँ",
            correctOptionIndex = 3
        ),
        Question(
            questionImageId = R.drawable.img_49,
            optionA = "अगाडि दुईतर्फी बाटो सीधा",
            optionB = "दोहोरो बाटो",
            optionC = "अगाडि बाट सवारी आउन सक्छ",
            optionD = "एकतर्फी बाटो",
            correctOptionIndex = 1
        ),
        Question(
            questionImageId = R.drawable.img_50,
            optionA = "अगाडि दुईतर्फी बाटो सीधा",
            optionB = "अगाडि बाट सवारी आउन सक्छ",
            optionC = "अगाडि दुईतर्फी बाटो",
            optionD = "एकतर्फी बाटो",
            correctOptionIndex = 3
        ),
        Question(
            questionImageId = R.drawable.img_51,
            optionA = "बायाँ मोड",
            optionB = "दायाँ मोड",
            optionC = "घुम्ती",
            optionD = "गोलो घुम्ती",
            correctOptionIndex = 2
        ),
        Question(
            questionImageId = R.drawable.img_52,
            optionA = "दायाँ मोड",
            optionB = "दायाँ पूरा मोड",
            optionC = "बायाँ मोड",
            optionD = "घुम्ती",
            correctOptionIndex = 2
        ),
        Question(
            questionImageId = R.drawable.img_53,
            optionA = "साँघुरो पुल",
            optionB = "साँघुरो बाटो",
            optionC = "एकतर्फी बाटो",
            optionD = "दुईतर्फी बाटो",
            correctOptionIndex = 1
        ),
        Question(
            questionImageId = R.drawable.img_54,
            optionA = "चिप्लो बाटो",
            optionB = "पहाडको उकालो",
            optionC = "बढी उकालो",
            optionD = "उठेको बाटो",
            correctOptionIndex = 3
        ),
        Question(
            questionImageId = R.drawable.img_55,
            optionA = "खतरनाक दबेको बाटो",
            optionB = "खतरनाक उठेको बाटो",
            optionC = "ओरालो बाटो",
            optionD = "सीधा अगाडि जाऊ",
            correctOptionIndex = 1
        ),
        Question(
            questionImageId = R.drawable.img_56,
            optionA = "साँघुरो पुल",
            optionB = "दुई तिरबाट साँघुरिएको सडक",
            optionC = "साँघुरो बाटो",
            optionD = "एकतर्फी बाटो",
            correctOptionIndex = 2
        ),
        Question(
            questionImageId = R.drawable.img_57,
            optionA = "पहिरो झर्ने ठाउँ",
            optionB = "बढी उकालो",
            optionC = "नदी किनार",
            optionD = "खतरनाक भीर",
            correctOptionIndex = 1
        ),
        Question(
            questionImageId = R.drawable.img_58,
            optionA = "देब्रे तिरबाट साँघुरिएको सडक",
            optionB = "उछिन्ने ठाउँ",
            optionC = "दाहिने तिरबाट साँघुरिएको सडक",
            optionD = "जाने ठाउँ",
            correctOptionIndex = 3
        ),
        Question(
            questionImageId = R.drawable.img_59,
            optionA = "एस जक्सन",
            optionB = "उछिन्ने ठाउँ",
            optionC = "मोड",
            optionD = "दोहोरो मोड पहिलो बायाँ",
            correctOptionIndex = 4
        ),
        Question(
            questionImageId = R.drawable.img_60,
            optionA = "वाई जक्सन",
            optionB = "टी- जक्सन",
            optionC = "शाखा बाटो",
            optionD = "जाने ठाउँ",
            correctOptionIndex = 1
        ),
        Question(
            questionImageId = R.drawable.img_61,
            optionA = "बायाँ मोड",
            optionB = "बायाँबाट सवारी आउन सक्छ",
            optionC = "बायाँ घुम्ती",
            optionD = "दायाँ सवारी",
            correctOptionIndex = 2
        ),
        Question(
            questionImageId = R.drawable.img_62,
            optionA = "दायाँबाट सवारी आउन सक्छ",
            optionB = "उभिने ठाउँ",
            optionC = "पार्किङ स्थल",
            optionD = "जाने ठाउँ",
            correctOptionIndex = 1
        ),
        Question(
            questionImageId = R.drawable.img_63,
            optionA = "कच्ची बाटो",
            optionB = "प्रहरी पोष्ट",
            optionC = "चौबाटो",
            optionD = "गोल घुम्ती",
            correctOptionIndex = 4
        ),
        Question(
            questionImageId = R.drawable.img_64,
            optionA = "सवारी चौडाई सीमा",
            optionB = "अगाडि उचाई सीमा",
            optionC = "सवारी एक्सल भार सीमा",
            optionD = "सवारी लम्बाई सीमा",
            correctOptionIndex = 2
        ),
        Question(
            questionImageId = R.drawable.img_65,
            optionA = "अस्पताल",
            optionB = "चौर तिर सडक",
            optionC = "चौबाटो अगाडि शाखा सडक",
            optionD = "चौबाटो अगाडि मूल सडक",
            correctOptionIndex = 4
        ),
        Question(
            questionImageId = R.drawable.img_66,
            optionA = "चौबाटो अगाडि मूल सडक",
            optionB = "चौबाटो अगाडि शाखा सडक",
            optionC = "चौर तिर सडक",
            optionD = "दायाँ बायाँ जाऊ",
            correctOptionIndex = 2
        ),
        Question(
            questionImageId = R.drawable.img_67,
            optionA = "बढी ओरालो",
            optionB = "बढी उकालो",
            optionC = "दुर्घटना क्षेत्र",
            optionD = "ट्रक मात्र",
            correctOptionIndex = 1
        ),
        Question(
            questionImageId = R.drawable.img_68,
            optionA = "राष्ट्रिय निकुञ्ज",
            optionB = "संरक्षण क्षेत्र",
            optionC = "पाल्तु जनावर",
            optionD = "जनावर निषेध",
            correctOptionIndex = 3
        ),
        Question(
            questionImageId = R.drawable.img_69,
            optionA = "विमानस्थल",
            optionB = "कम उचाईमा विमानहरू",
            optionC = "अगाडिबाट विमान आउन सक्छ",
            optionD = "तीब्र गति",
            correctOptionIndex = 2
        ),
        Question(
            questionImageId = R.drawable.img_70,
            optionA = "उकालो",
            optionB = "ओरालो",
            optionC = "उठेको बाटो",
            optionD = "खाल्डा",
            correctOptionIndex = 3
        ),
        Question(
            questionImageId = R.drawable.img_71,
            optionA = "बायाँ शाखा सडक",
            optionB = "देब्रे तिर जाऊ",
            optionC = "दायाँ शाखा सडक",
            optionD = "अगाडि बढ",
            correctOptionIndex = 3
        ),
        Question(
            questionImageId = R.drawable.img_72,
            optionA = "एकपछि अर्को दोबाटोहरू",
            optionB = "बायाँ मोड",
            optionC = "दायाँ मोड",
            optionD = "अगाडि सिधा जाऊ",
            correctOptionIndex = 1
        ),
        Question(
            questionImageId = R.drawable.img_73,
            optionA = "गति सीमा समाप्त",
            optionB = "दोहोरो सडक समाप्त",
            optionC = "एकतर्फी बाटो",
            optionD = "दुईतर्फी बाटो",
            correctOptionIndex = 2
        ),
        Question(
            questionImageId = R.drawable.img_74,
            optionA = "सडक पोल",
            optionB = "डेकोरेटिभ लाइट",
            optionC = "ट्राफिक लाइट",
            optionD = "क्याट्स आई",
            correctOptionIndex = 3
        ),
        Question(
            questionImageId = R.drawable.img_75,
            optionA = "जंगली जनावर",
            optionB = "घना जंगल",
            optionC = "राष्ट्रिय निकुञ्ज",
            optionD = "बाघ",
            correctOptionIndex = 1
        ),
        Question(
            questionImageId = R.drawable.img_76,
            optionA = "जेब्राक्रसिङ",
            optionB = "अगाडि बाटोमा पैदल यात्री",
            optionC = "केटाकेटीहरू",
            optionD = "विद्यालय क्षेत्र",
            correctOptionIndex = 2
        ),
        Question(
            questionImageId = R.drawable.img_77,
            optionA = "नदीको किनारा",
            optionB = "बढी ओरालो",
            optionC = "बढी उकालो",
            optionD = "सवारीको भार मापन",
            correctOptionIndex = 1
        ),
        Question(
            questionImageId = R.drawable.img_78,
            optionA = "नदी किनार",
            optionB = "रेलमार्ग",
            optionC = "रेल अगाडि गेट नभएको",
            optionD = "खतरनाक बाटो",
            correctOptionIndex = 3
        ),
        Question(
            questionImageId = R.drawable.img_79,
            optionA = "बाटोमा काम हुँदै",
            optionB = "सडक सरसफाई",
            optionC = "उकालो बाटो",
            optionD = "ओरालो बाटो",
            correctOptionIndex = 1
        ),
        Question(
            questionImageId = R.drawable.img_80,
            optionA = "प्रवेश निषेध",
            optionB = "पटके काट्ने ठाउँ",
            optionC = "जाँच चौकी",
            optionD = "तौल पुल",
            correctOptionIndex = 3
        ),
        Question(
            questionImageId = R.drawable.img_81,
            optionA = "अगाडि बाटोमा पैदल यात्री",
            optionB = "बालबालिकाहरू",
            optionC = "जेब्राक्रसिङ",
            optionD = "विद्यालय क्षेत्र",
            correctOptionIndex = 2
        ),
        Question(
            questionImageId = R.drawable.img_82,
            optionA = "बाँया तिर तिखो मोड",
            optionB = "बाँया मोड",
            optionC = "दाँया मोड",
            optionD = "ओरालो बाटो",
            correctOptionIndex = 1
        ),
        Question(
            questionImageId = R.drawable.img_83,
            optionA = "दाँया मोड",
            optionB = "बाँया मोड",
            optionC = "तिखो मोड (अस्थाई बाटो)",
            optionD = "ओरालो बाटो",
            correctOptionIndex = 3
        ),
        Question(
            questionImageId = R.drawable.img_84,
            optionA = "टी-जक्सन (दाँया र बाँया मोड)",
            optionB = "वाई-जक्सन",
            optionC = "तिखो मोड",
            optionD = "बाँया तिर तिखो मोड",
            correctOptionIndex = 1
        )
    )

    return quizQuestions6
}
