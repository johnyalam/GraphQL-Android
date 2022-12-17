package com.johnyalam.graphqlandroid.presentation

sealed class Screen(val route: String) {
    object LaunchListScreen: Screen("launch_list_screen")
    object LaunchDetailsScreen: Screen("launch_details_screen")
}