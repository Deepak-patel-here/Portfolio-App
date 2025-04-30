package com.deepakjetpackcompose.portfolioapp.util

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.deepakjetpackcompose.portfolioapp.Skill
import com.deepakjetpackcompose.portfolioapp.ui.theme.Comic

@Composable
fun AboutSkill(skills:List<Skill>, modifier: Modifier = Modifier) {
    Column(modifier = Modifier
        .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            "My Skills",
            fontSize = 35.sp,
            color = MaterialTheme.colorScheme.primary,
            fontFamily = Comic
        )
        SkillPrompt(skills)
    }
    
}