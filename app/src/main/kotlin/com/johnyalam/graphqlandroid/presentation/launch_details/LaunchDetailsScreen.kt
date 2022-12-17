package com.johnyalam.graphqlandroid.presentation.launch_details

import androidx.compose.foundation.text.ClickableText
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.AnnotatedString
import androidx.navigation.NavController

@Composable
fun LaunchDetailsScreen(
    launchId : String,
    navController: NavController
) {
    ClickableText(
        text = AnnotatedString("Go back to previous screen ${launchId}"),
        onClick = {
            run {
                navController.popBackStack()
            }
        })

}


