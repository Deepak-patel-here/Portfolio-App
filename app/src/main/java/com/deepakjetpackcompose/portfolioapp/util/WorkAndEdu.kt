package com.deepakjetpackcompose.portfolioapp.util

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.deepakjetpackcompose.portfolioapp.ui.theme.Comic
import com.deepakjetpackcompose.portfolioapp.ui.theme.PortfolioAppTheme
import com.deepakjetpackcompose.portfolioapp.R

@PreviewLightDark
@Composable
fun WorkAndEdu(modifier: Modifier = Modifier) {
    PortfolioAppTheme {
        Column(modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Experience & Education",
                color = MaterialTheme.colorScheme.primary,
                fontFamily = Comic,
                fontSize = 35.sp)

            Spacer(Modifier.height(70.dp))
            WorkTemplate(img=R.drawable.education, task = "Education", desc = edu)
            Spacer(Modifier.height(40.dp))
            WorkTemplate(img=R.drawable.briefcase, task = "Work Experience", desc = work)

        }
    }
    
}


@Composable
fun WorkTemplate(img:Int,task:String,desc:String,modifier: Modifier = Modifier) {

    Card (modifier = Modifier
        .border(
            BorderStroke(0.5.dp, MaterialTheme.colorScheme.onSurface),
            shape = RoundedCornerShape(12.dp)
        ),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.Transparent
        )){
        Column (horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth().height(363.dp).padding(24.dp)){
            Spacer(Modifier.height(20.dp))
            Image(
                painter = painterResource(img),
                contentDescription = null,
                modifier=Modifier.size(50.dp),
                colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.primary)
            )

            Spacer(Modifier.height(30.dp))
            Text(task,
                color = MaterialTheme.colorScheme.primary,
                fontFamily = Comic,
                fontSize = 30.sp

            )
            Spacer(Modifier.height(30.dp))
            Text(desc,
                color = MaterialTheme.colorScheme.onSurface,
                fontFamily = Comic,
                fontSize = 14.sp,
                fontWeight = FontWeight.Thin,
                modifier = Modifier.align(Alignment.CenterHorizontally).padding(horizontal = 30.dp),
                textAlign = TextAlign.Center)

        }
    }
}