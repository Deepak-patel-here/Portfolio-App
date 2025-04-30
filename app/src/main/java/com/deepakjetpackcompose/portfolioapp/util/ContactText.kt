package com.deepakjetpackcompose.portfolioapp.util

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
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
fun ContactText(modifier: Modifier = Modifier) {

    Column (modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally){
        Text("Let's talk!",
            fontSize = 35.sp,
            fontFamily = Comic,
            color = MaterialTheme.colorScheme.primary
        )
        Spacer(Modifier.height(20.dp))
        Text("If you're interested in my work or have any questions, don't hesitate to write to me!",
            fontSize = 16.sp,
            fontFamily = Comic,
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onSurface
        )
    }

}