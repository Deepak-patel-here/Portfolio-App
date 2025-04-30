package com.deepakjetpackcompose.portfolioapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.deepakjetpackcompose.portfolioapp.ui.theme.PortfolioAppTheme
import com.deepakjetpackcompose.portfolioapp.view.AboutMeScreen
import com.deepakjetpackcompose.portfolioapp.view.AppScreen
import com.deepakjetpackcompose.portfolioapp.view.MainScreen
import com.deepakjetpackcompose.portfolioapp.viewmodel.DarkViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            val darkViewModel: DarkViewModel by viewModels()
            val isDark = darkViewModel.isDarkMode.collectAsState()
            PortfolioAppTheme (darkTheme = isDark.value){
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AppScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

