package com.deepakjetpackcompose.portfolioapp.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.deepakjetpackcompose.portfolioapp.ui.theme.PortfolioAppTheme
import com.deepakjetpackcompose.portfolioapp.util.ProjectComponent
import com.deepakjetpackcompose.portfolioapp.R
import com.deepakjetpackcompose.portfolioapp.util.LastScroll
import com.deepakjetpackcompose.portfolioapp.util.lumiTech
import com.deepakjetpackcompose.portfolioapp.util.lumibot
import com.deepakjetpackcompose.portfolioapp.util.newsTech
import com.deepakjetpackcompose.portfolioapp.util.newsapp
import com.deepakjetpackcompose.portfolioapp.util.project1
import com.deepakjetpackcompose.portfolioapp.util.techProject1


@Composable
fun ProjectScreen(navController: NavController,modifier: Modifier = Modifier) {
    PortfolioAppTheme {
        Column (modifier = Modifier.fillMaxWidth()
            .background(MaterialTheme.colorScheme.surfaceContainerLow)
            .verticalScroll(rememberScrollState())
            .padding(16.dp)){
            Spacer(Modifier.height(40.dp))
            ProjectComponent(title = "AI Powered Notes App",
                img = R.drawable.ainotes,
                desc = project1,
                techStack = techProject1
            )
            Spacer(Modifier.height(70.dp))
            ProjectComponent(
                title = "News Pulse",
                img = R.drawable.project1,
                desc = newsapp,
                techStack = newsTech
            )
            Spacer(Modifier.height(70.dp))
            ProjectComponent(
                title = "LumiBot",
                img = R.drawable.lumibot,
                desc = lumibot,
                techStack = lumiTech
            )
            Spacer(Modifier.height(70.dp))
            LastScroll()

        }
    }

}