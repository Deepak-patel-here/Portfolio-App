package com.deepakjetpackcompose.portfolioapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.deepakjetpackcompose.portfolioapp.view.AboutMeScreen
import com.deepakjetpackcompose.portfolioapp.view.MainScreen
import com.deepakjetpackcompose.portfolioapp.view.ProjectScreen

@Composable
fun NavigationHelper(navController: NavHostController,modifier: Modifier = Modifier) {

    NavHost(navController = navController, startDestination = NavigationDestination.Home.route ) {
        composable (route = NavigationDestination.Home.route){
            MainScreen()
        }
        composable (route = NavigationDestination.About.route){
            AboutMeScreen()
        }
        composable (route = NavigationDestination.Projects.route){
            ProjectScreen()
        }
    }

}