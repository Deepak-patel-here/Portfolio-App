package com.deepakjetpackcompose.portfolioapp.util

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.deepakjetpackcompose.portfolioapp.ui.theme.Comic
import com.deepakjetpackcompose.portfolioapp.R
import com.deepakjetpackcompose.portfolioapp.ui.theme.PortfolioAppTheme

@PreviewLightDark
@Composable
fun ProjectIntro(modifier: Modifier = Modifier) {
    PortfolioAppTheme {
        Column (horizontalAlignment = Alignment.CenterHorizontally){
            Text(
                "Some of my projects",
                fontSize = 30.sp,
                color = MaterialTheme.colorScheme.primary,
                fontFamily = Comic
            )
            Spacer(Modifier.height(40.dp))
            ProjectCard(R.drawable.project1)
            Spacer(Modifier.height(30.dp))
            ProjectCard(R.drawable.ainotes)
            Spacer(Modifier.height(30.dp))
            ProjectCard(R.drawable.reminder)
            Spacer(Modifier.height(30.dp))
            SkillButton(onClick = {}, name = "More Projects")
        }
    }
    
}


@Composable
fun ProjectCard(img:Int,modifier: Modifier = Modifier) {
    Card (modifier= Modifier){
        Image(
            painter = painterResource(img),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier= Modifier.fillMaxWidth().height(170.dp)
        )
    }
}