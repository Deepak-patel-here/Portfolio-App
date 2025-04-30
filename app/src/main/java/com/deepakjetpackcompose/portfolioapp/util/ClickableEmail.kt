package com.deepakjetpackcompose.portfolioapp.util

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.clickable
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.sp
import com.deepakjetpackcompose.portfolioapp.ui.theme.Comic
import androidx.core.net.toUri

@Composable
fun ClickableEmail(email:String,modifier: Modifier = Modifier) {

    val context = LocalContext.current

    Text(email,
        color = MaterialTheme.colorScheme.primary,
        fontSize = 18.sp,
        fontFamily = Comic,
        modifier = Modifier.clickable{
            val intent= Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:$email")
            }
            context.startActivity(intent)
        })

}