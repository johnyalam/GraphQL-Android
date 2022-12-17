package com.johnyalam.graphqlandroid.presentation.launch_details

import androidx.compose.foundation.text.ClickableText
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.AnnotatedString
import androidx.navigation.NavController
import com.johnyalam.graphqlandroid.presentation.Screen

@Composable
fun LaunchDetailsScreen(
    launchId : String,
    navController: NavController
) {
    LaunchDetailsItem(launchId,
    onItemClick = {
        navController.popBackStack()
    })

}


