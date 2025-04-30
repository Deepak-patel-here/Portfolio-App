package com.deepakjetpackcompose.portfolioapp.util

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Divider
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.deepakjetpackcompose.portfolioapp.R
import com.deepakjetpackcompose.portfolioapp.ui.theme.Comic
import com.deepakjetpackcompose.portfolioapp.ui.theme.PortfolioAppTheme

@PreviewLightDark
@Composable
fun TopBar(modifier: Modifier = Modifier) {
    PortfolioAppTheme {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .height(60.dp)
                .background(MaterialTheme.colorScheme.surfaceContainerLow)
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                "Portfolio",
                color = MaterialTheme.colorScheme.onSurface,
                fontFamily = Comic,
                fontWeight = FontWeight.Bold,
                fontSize = 26.sp
            )
            IconButton(onClick = {}) {
                Image(
                    painter = painterResource(R.drawable.menuport),
                    contentDescription = null,
                    modifier = Modifier
                        .size(25.dp),
                    colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.onSurface)
                )
            }

        }
    }

}