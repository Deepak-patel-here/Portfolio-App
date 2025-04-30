package com.deepakjetpackcompose.portfolioapp.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.deepakjetpackcompose.portfolioapp.R
import com.deepakjetpackcompose.portfolioapp.Skill
import com.deepakjetpackcompose.portfolioapp.ui.theme.Comic
import com.deepakjetpackcompose.portfolioapp.ui.theme.PortfolioAppTheme
import com.deepakjetpackcompose.portfolioapp.util.ApiSkill2
import com.deepakjetpackcompose.portfolioapp.util.ClickableEmail
import com.deepakjetpackcompose.portfolioapp.util.Di
import com.deepakjetpackcompose.portfolioapp.util.Firebase
import com.deepakjetpackcompose.portfolioapp.util.SkillText
import com.deepakjetpackcompose.portfolioapp.util.abouts
import com.deepakjetpackcompose.portfolioapp.util.emailId
import com.deepakjetpackcompose.portfolioapp.util.fullAbouts
import com.deepakjetpackcompose.portfolioapp.util.responsiveSkill1
import com.deepakjetpackcompose.portfolioapp.util.room
import com.deepakjetpackcompose.portfolioapp.util.versionSkill3

@PreviewLightDark
@Composable
fun AboutMeScreen(modifier: Modifier = Modifier) {
    PortfolioAppTheme {
        Column (modifier = Modifier.fillMaxWidth()
            .background(MaterialTheme.colorScheme.surfaceContainerLow)
            .verticalScroll(rememberScrollState())
            .padding(16.dp)){
            Card (modifier=Modifier.padding(5.dp),
                shape = RoundedCornerShape(10.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            ){
                Column (modifier= Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally){
                    Image(
                        painter = painterResource(R.drawable.mypicture),
                        contentDescription = null,
                        contentScale = ContentScale.Fit
                    )
                }
            }
            Spacer(Modifier.height(30.dp))
            Text("Deepak Patel",
                fontSize = 35.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = Comic,
                color = MaterialTheme.colorScheme.onSurface
            )
            Spacer(Modifier.height(15.dp))
            Text(
                fullAbouts,
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = Comic,
                color = MaterialTheme.colorScheme.onSurface

            )
            Spacer(Modifier.height(15.dp))
            ClickableEmail(email = emailId)
            Spacer(Modifier.height(70.dp))
            SkillText(
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
                    ),
                    Skill(
                        img = R.drawable.database,
                        skill = "Room Database",
                        desc = room
                    ),
                    Skill(
                        img = R.drawable.dagger,
                        skill = "Dependency injection",
                        desc = Di
                    ),
                    Skill(
                        img = R.drawable.fire,
                        skill = "Firebase",
                        desc = Firebase
                    )
                )
            )


        }
    }

}