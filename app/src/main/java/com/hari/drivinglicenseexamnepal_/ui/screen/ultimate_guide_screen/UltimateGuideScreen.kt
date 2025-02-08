package com.hari.drivinglicenseexamnepal_.ui.screen.ultimate_guide_screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.Lightbulb
import androidx.compose.material.icons.outlined.Lightbulb
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hari.drivinglicenseexamnepal_.data.constants.phases
import com.hari.drivinglicenseexamnepal_.ui.theme.ButtonColor
import com.hari.drivinglicenseexamnepal_.ui.theme.LightBackgroundColor

@Composable
fun UltimateGuideScreen() {


    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = LightBackgroundColor, RoundedCornerShape(topStartPercent = 12, topEndPercent = 12))
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxSize().padding(top = 24.dp),
            contentPadding = PaddingValues(16.dp)
        ) {
            items(phases) { phase ->
                ExpandableCard(
                    icon = Icons.Outlined.Lightbulb,
                    // icon = Icons.Default.Lightbulb,
                    title = phase.title,
                    subtitle = phase.subtitle
                ) {
                    phase.steps.forEach { (description, subPoints) ->
                        PhaseStep(description = description, subPoints = subPoints)
                    }
                }
            }
        }

    }

}

@Composable
fun PhaseStep(description: String, subPoints: List<String>? = null) {
    Column(modifier = Modifier.padding(bottom = 12.dp)) {
        Text(
            text = description,
            fontSize = 16.sp,
            modifier = Modifier.padding(4.dp)
        )
        subPoints?.forEach { point ->
            Text(
                text = "• $point",
                fontSize = 14.sp,
                modifier = Modifier.padding(start = 24.dp, bottom = 4.dp)
            )
        }
    }
}


@Composable
fun ExpandableCard(
    icon: ImageVector,
    title: String,
    subtitle: String,
    content: @Composable () -> Unit
) {
    var isExpanded by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.cardElevation(2.dp),
        border = BorderStroke(width = 0.5.dp, color = ButtonColor ),
        colors = CardDefaults.cardColors(
            containerColor = LightBackgroundColor
        )
    ) {
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { isExpanded = !isExpanded }
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Icon
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    modifier = Modifier.size(40.dp),
                    tint = ButtonColor
                )

                Spacer(modifier = Modifier.width(16.dp))

                // Title and Subtitle Column
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = title,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                    Text(
                        text = subtitle,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.Gray
                    )
                }

                // Arrow Icon
                Icon(
                    imageVector = if (isExpanded) Icons.Default.KeyboardArrowUp else Icons.Default.KeyboardArrowDown,
                    contentDescription = if (isExpanded) "Collapse" else "Expand",
                    tint = ButtonColor
                )
            }

            // Expandable Content
            if (isExpanded) {
                content()
            }
        }
    }
}


@Preview
@Composable
private fun CardPreview() {
    ExpandableCard(
        icon = Icons.Default.Lightbulb,
        title = "Phase I",
        subtitle = "Form Filling"
    ) {
        Text(
            text = "This is the detailed explanation for the form filling process.",
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            style = MaterialTheme.typography.bodyLarge
        )
    }
}


@Preview(showBackground = true)
@Composable
private fun PreviewScreen() {
    UltimateGuideScreen()

}
