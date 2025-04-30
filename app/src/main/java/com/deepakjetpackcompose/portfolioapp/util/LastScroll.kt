package com.deepakjetpackcompose.portfolioapp.util

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.deepakjetpackcompose.portfolioapp.ui.theme.Comic

@PreviewLightDark
@Composable
fun LastScroll(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    Column(modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Divider(color = MaterialTheme.colorScheme.onSurface, modifier = Modifier.fillMaxWidth())
        Spacer(Modifier.height(20.dp))
        Text("Deepak Patel",
            fontSize = 26.sp,
            fontWeight = FontWeight.SemiBold,
            fontFamily = Comic,
            color = MaterialTheme.colorScheme.onSurface)
        Spacer(Modifier.height(30.dp),)
        Text("Home",
            fontSize = 26.sp,
            fontWeight = FontWeight.SemiBold,
            fontFamily = Comic,
            color = MaterialTheme.colorScheme.onSurface)
        Spacer(Modifier.height(30.dp),)
        Text("About Me",
            fontSize = 26.sp,
            fontWeight = FontWeight.SemiBold,
            fontFamily = Comic,
            color = MaterialTheme.colorScheme.primary)
        Spacer(Modifier.height(20.dp))
        Text("Projects",
            fontSize = 26.sp,
            fontWeight = FontWeight.SemiBold,
            fontFamily = Comic,
            color = MaterialTheme.colorScheme.onSurface)
        Spacer(Modifier.height(30.dp))
        Text("Contact Me",
            fontSize = 26.sp,
            fontWeight = FontWeight.SemiBold,
            fontFamily = Comic,
            color = MaterialTheme.colorScheme.primary)
        Spacer(Modifier.height(30.dp))
        Text("Linked In",
            fontSize = 26.sp,
            fontWeight = FontWeight.SemiBold,
            fontFamily = Comic,
            color = MaterialTheme.colorScheme.onSurface,
            modifier = Modifier.clickable(
                onClick = {
                    val intent=Intent(Intent.ACTION_VIEW,Uri.parse("https://www.linkedin.com/in/deepak-patel-555671282/"))
                    context.startActivity(intent)
                }
            ))
        Spacer(Modifier.height(50.dp))
    }

}