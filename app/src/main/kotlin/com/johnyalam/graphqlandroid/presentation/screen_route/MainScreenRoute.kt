package com.johnyalam.graphqlandroid.presentation.screen_route

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.johnyalam.graphqlandroid.presentation.Screen
import com.johnyalam.graphqlandroid.presentation.launch_details.LaunchDetailsScreen
import com.johnyalam.graphqlandroid.presentation.launch_list.LaunchListScreen

@Composable
fun MainScreenRoute() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.LaunchListScreen.route){
        composable(route = Screen.LaunchListScreen.route){
            LaunchListScreen(navController)
        }
        composable(route = Screen.LaunchDetailsScreen.route+"/{launchId}"){ navBackStackEntry ->
            run {
                val launchId = navBackStackEntry.arguments?.getString("launchId")
                launchId?.let { LaunchDetailsScreen(it, navController) }
            }
        }
    }
}