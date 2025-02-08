package com.example.drivinglicenseexamnepal_.ui.screen.study_mode_screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.drivinglicenseexamnepal_.data.model.Category
import com.example.drivinglicenseexamnepal_.data.model.itemCategory
import com.example.drivinglicenseexamnepal_.ui.theme.ButtonColor
import com.example.drivinglicenseexamnepal_.ui.theme.CategoryCardColor
import com.example.drivinglicenseexamnepal_.ui.theme.LightBackgroundColor

@Composable
fun CategoryScreen(
    navigateToStudy:(String)->Unit

) {

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 10.dp),
        shape = RoundedCornerShape(topStartPercent = 8, topEndPercent = 8),
        color = LightBackgroundColor
    ) {

        LazyVerticalGrid(
            modifier = Modifier
                .padding(8.dp)
                .padding(top = 10.dp)
                .fillMaxWidth(),
            columns = GridCells.Fixed(2)
        ) {
            items(itemCategory) { category ->
                CategoryCardItem(items = category, navigateToStudy = {navigateToStudy(category.title)})
            }
        }
    }
}

@Composable
fun CategoryCardItem(items: Category, navigateToStudy: () -> Unit) {

    Card(
        colors = CardDefaults.cardColors(
            containerColor = LightBackgroundColor //bluish
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .size(164.dp),
        shape = RoundedCornerShape(12),
        border = BorderStroke(width = 1.dp, color = ButtonColor),
        onClick = { navigateToStudy() }
    ) {

        Card(
            colors = CardDefaults.cardColors(
                containerColor = CategoryCardColor,
                contentColor = CategoryCardColor
            ),
            modifier = Modifier
                .fillMaxWidth()
                .size(112.dp),
            shape = RoundedCornerShape(bottomStartPercent = 8, bottomEndPercent = 8),

            border = BorderStroke(width = 1.dp, color = ButtonColor)
        ) {
            Image(
                painter = painterResource(id = items.painterId),
                contentDescription = null,
                contentScale = ContentScale.FillWidth
            )
        }

        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, top = 4.dp)
        ) {
            Text(
                text = items.title,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )

            Text(
                text = items.noOfQuestions,
                fontWeight = FontWeight.Light,
                fontSize = 12.sp
            )
        }
    }
}

@Preview
@Composable
private fun CategoryScreenPreview() {
    CategoryScreen({})
}