package com.deepakjetpackcompose.portfolioapp.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import com.deepakjetpackcompose.portfolioapp.R
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
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.deepakjetpackcompose.portfolioapp.Skill
import com.deepakjetpackcompose.portfolioapp.navigation.NavigationDestination
import com.deepakjetpackcompose.portfolioapp.ui.theme.PortfolioAppTheme
import com.deepakjetpackcompose.portfolioapp.util.ApiSkill2
import com.deepakjetpackcompose.portfolioapp.util.DownLoadButton
import com.deepakjetpackcompose.portfolioapp.util.IntroText
import com.deepakjetpackcompose.portfolioapp.util.LastScroll
import com.deepakjetpackcompose.portfolioapp.util.ProjectButton
import com.deepakjetpackcompose.portfolioapp.util.ProjectIntro
import com.deepakjetpackcompose.portfolioapp.util.ShortIntro
import com.deepakjetpackcompose.portfolioapp.util.SkillText
import com.deepakjetpackcompose.portfolioapp.util.SummaryText
import com.deepakjetpackcompose.portfolioapp.util.TopBar
import com.deepakjetpackcompose.portfolioapp.util.responsiveSkill1
import com.deepakjetpackcompose.portfolioapp.util.versionSkill3
import com.deepakjetpackcompose.portfolioapp.viewmodel.DarkViewModel


@Composable
fun MainScreen(navController: NavController,modifier: Modifier = Modifier) {
    val context= LocalContext.current


        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.surfaceContainerLow)
                .padding(horizontal = 16.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Box(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(top = 20.dp)
            ) {
                Column(
                    modifier = Modifier,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Spacer(Modifier.height(30.dp))
                    IntroText()
                    Spacer(Modifier.height(15.dp))
                    SummaryText()
                    Spacer(Modifier.height(25.dp))
                    Column(
                        modifier = modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        ProjectButton(onClick={navController.navigate(NavigationDestination.Projects.route)})
                        Spacer(Modifier.height(10.dp))
                        DownLoadButton(context = context)
                        Spacer(Modifier.height(20.dp))
                        ShortIntro(navController=navController)
                        Spacer(Modifier.height(50.dp))
                        SkillText(navController=navController,
                            skills = listOf(
                                Skill(
                                    img = R.drawable.iphone,
                                    skill = "Responsive Ui",
                                    desc = responsiveSkill1
                                ),
                                Skill(
                                    img = R.drawable.code,
                                    skill = "Api Integration",
                                    desc = ApiSkill2
                                ),
                                Skill(
                                    img = R.drawable.github,
                                    skill = "Version Control",
                                    desc = versionSkill3
                                )
                            )
                        )
                        Spacer(Modifier.height(50.dp))
                        ProjectIntro(navController=navController)
                        Spacer(Modifier.height(30.dp))
                        LastScroll(navController)
                    }
                }

            }

        }



}