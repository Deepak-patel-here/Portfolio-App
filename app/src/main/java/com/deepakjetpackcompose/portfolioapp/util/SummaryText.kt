package com.deepakjetpackcompose.portfolioapp.util

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.deepakjetpackcompose.portfolioapp.ui.theme.Comic

@Preview
@Composable
fun SummaryText(modifier: Modifier = Modifier) {

    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                "This is my portfolio and resume, where you can explore my projects, skills, and approach to creating seamless Android experiences.",
                fontSize = 20.sp,
                color = MaterialTheme.colorScheme.onSurface,
                fontFamily = Comic,
                textAlign = TextAlign.Center // <-- important for centering multiline text
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                "Thanks for checking it out!",
                fontSize = 20.sp,
                color = MaterialTheme.colorScheme.onSurface,
                fontFamily = Comic,
                textAlign = TextAlign.Center
            )
        }
    }


}