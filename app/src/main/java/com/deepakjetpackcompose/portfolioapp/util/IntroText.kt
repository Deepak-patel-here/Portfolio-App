package com.deepakjetpackcompose.portfolioapp.util

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.deepakjetpackcompose.portfolioapp.ui.theme.Comic
import com.deepakjetpackcompose.portfolioapp.ui.theme.PortfolioAppTheme

@Preview
@Composable
fun IntroText(modifier: Modifier = Modifier) {
    PortfolioAppTheme {
        Column {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    "I am ",
                    fontSize = 30.sp,
                    fontFamily = Comic,
                    color = MaterialTheme.colorScheme.onSurface
                )
                Text(
                    "Deepak Patel.",
                    color = MaterialTheme.colorScheme.primary,
                    fontSize = 30.sp,
                    fontFamily = Comic
                )
            }

            Text("Android Developer",
                fontSize = 30.sp,
                fontFamily = Comic,
                color = MaterialTheme.colorScheme.onSurface
                )
        }
    }

}