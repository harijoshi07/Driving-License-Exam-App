package com.example.drivinglicenseexamnepal_.ui.component

import com.example.drivinglicenseexamnepal_.data.constants.topBarTitle
import com.example.drivinglicenseexamnepal_.navigation.Screen
import com.example.drivinglicenseexamnepal_.ui.theme.BlueBackgroundColor
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavBackStackEntry


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
    navBackStackEntry: NavBackStackEntry?,
    navigateBack: () -> Unit,
) {

    val title = navBackStackEntry?.destination?.route ?: Screen.Home.route

    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(rememberTopAppBarState())

    if (title == Screen.Home.route) {
        HomeTopBar(scrollBehavior)
    } else {
        GeneralTopBar(title, scrollBehavior, navigateBack)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeTopBar(scrollBehavior: TopAppBarScrollBehavior, modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = "Driving License Exam Nepal",//
                //text = "सवारी सञ्चालन सम्बन्धी ज्ञान",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                maxLines = 1,
                color = Color.White
            )
        },
        /*
        navigationIcon = {

            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Default.Sort,
                    contentDescription = null,
                    tint = Color.White
                )
            }
        },

        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Default.FavoriteBorder,
                    contentDescription = null,
                    tint = Color.White
                )
            }
        },
        */
        scrollBehavior = scrollBehavior,

        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = BlueBackgroundColor
            //containerColor = LightBackgroundColor
        )
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GeneralTopBar(
    title: String,
    scrollBehavior: TopAppBarScrollBehavior,
    navigateBack: () -> Unit,
) {

    CenterAlignedTopAppBar(
        title = {
            Text(
                text = topBarTitle[title] ?: "",
                //text = "सवारी सञ्चालन सम्बन्धी ज्ञान",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                maxLines = 1,
                color = Color.White
            )
        },
        navigationIcon = {
            IconButton(onClick = navigateBack) {
                Icon(
                    imageVector = Icons.Default.ArrowBackIosNew,
                    contentDescription = null,
                    tint = Color.White
                )
            }
        },
        scrollBehavior = scrollBehavior,

        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = BlueBackgroundColor
        )
    )

}


//@Preview
//@Composable
//private fun TopBarPreview() {
//    TopBar()
//}