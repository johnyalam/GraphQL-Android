package com.johnyalam.graphqlandroid.presentation.launch_list

import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.johnyalam.graphqlandroid.presentation.Screen

@Composable
fun LaunchListScreen(
    navController: NavController
) {
    Box(modifier = Modifier.fillMaxSize()){
        LazyColumn(modifier = Modifier.fillMaxSize()){
            // Add 5 items
            items(5) { index ->
                LaunchListItem(
                    item = index,
                    onItemClick = {
                        navController.navigate(Screen.LaunchDetailsScreen.route+"/${index}")
                        Log.d("ItemClick", "Your Clicked item is: $index")
                    }
                )

            }
        }
    }
}

