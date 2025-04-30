package com.deepakjetpackcompose.portfolioapp.navigation

sealed class NavigationDestination(val route: String) {
    object Home : NavigationDestination("home")
    object About : NavigationDestination("about")
    object Projects : NavigationDestination("projects")
}