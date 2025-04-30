package com.deepakjetpackcompose.portfolioapp.util

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.deepakjetpackcompose.portfolioapp.R
import com.deepakjetpackcompose.portfolioapp.ui.theme.Comic


@Composable
fun ProjectComponent(title:String,img:Int,desc:String,techStack:String,modifier: Modifier = Modifier) {
    Column (horizontalAlignment = Alignment.CenterHorizontally){
        Text(title,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = Comic,
            color = MaterialTheme.colorScheme.onSurface)
        Spacer(Modifier.height(50.dp))
        ProjectCard(img = img)
        Spacer(Modifier.height(30.dp))
        Text(text=desc,
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            fontFamily = Comic,
            color = MaterialTheme.colorScheme.onSurface
        )
        Spacer(Modifier.height(30.dp))
        Text("Tech Stack: ",
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            fontFamily = Comic,
            color = MaterialTheme.colorScheme.onSurface)
        Spacer(Modifier.height(20.dp))
        Text(techStack,
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            fontFamily = Comic,
            color = MaterialTheme.colorScheme.onSurface)

    }
    
}