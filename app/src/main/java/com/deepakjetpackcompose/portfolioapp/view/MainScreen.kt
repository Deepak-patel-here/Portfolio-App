package com.deepakjetpackcompose.portfolioapp.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.deepakjetpackcompose.portfolioapp.ui.theme.PortfolioAppTheme
import com.deepakjetpackcompose.portfolioapp.util.DownLoadButton
import com.deepakjetpackcompose.portfolioapp.util.IntroText
import com.deepakjetpackcompose.portfolioapp.util.LastScroll
import com.deepakjetpackcompose.portfolioapp.util.ProjectButton
import com.deepakjetpackcompose.portfolioapp.util.ProjectIntro
import com.deepakjetpackcompose.portfolioapp.util.ShortIntro
import com.deepakjetpackcompose.portfolioapp.util.SkillText
import com.deepakjetpackcompose.portfolioapp.util.SummaryText
import com.deepakjetpackcompose.portfolioapp.util.TopBar

@PreviewLightDark
@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    PortfolioAppTheme {
        Scaffold(
            topBar = {
                TopBar(modifier = Modifier.statusBarsPadding())
            }
        ) {innerPadding->
            Column (modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.surfaceContainerLow)
                .padding(innerPadding)
                .padding(horizontal = 16.dp)
                .verticalScroll(rememberScrollState())
            ){
                Box(modifier = Modifier.align(Alignment.CenterHorizontally).padding(top = 20.dp)){
                    Column (modifier= Modifier,
                        horizontalAlignment = Alignment.CenterHorizontally){
                        Spacer(Modifier.height(30.dp))
                        IntroText()
                        Spacer(Modifier.height(15.dp))
                        SummaryText()
                        Spacer(Modifier.height(25.dp))
                        Column (modifier=modifier.fillMaxWidth(),
                            horizontalAlignment = Alignment.CenterHorizontally){
                            ProjectButton()
                            Spacer(Modifier.height(10.dp))
                            DownLoadButton()
                            Spacer(Modifier.height(20.dp))
                            ShortIntro()
                            Spacer(Modifier.height(50.dp))
                            SkillText()
                            Spacer(Modifier.height(50.dp))
                            ProjectIntro()
                            Spacer(Modifier.height(30.dp))
                            LastScroll()
                        }
                    }

                }

            }
        }
    }
    
}