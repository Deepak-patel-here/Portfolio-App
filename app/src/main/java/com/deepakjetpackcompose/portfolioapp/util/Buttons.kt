package com.deepakjetpackcompose.portfolioapp.util

import android.content.Context
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.deepakjetpackcompose.portfolioapp.ui.theme.Comic
import com.deepakjetpackcompose.portfolioapp.ui.theme.PortfolioAppTheme
import com.deepakjetpackcompose.portfolioapp.R


@Composable
fun ProjectButton(onClick:()->Unit,modifier: Modifier = Modifier) {

        Box() {
            Button(
                onClick = {onClick()},
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = MaterialTheme.colorScheme.onSurface
                ),

            ) {
                Text("View Project",
                    fontFamily = Comic,
                    fontSize = 20.sp,
                    color = MaterialTheme.colorScheme.onPrimary
                )
            }
        }


}


@Composable
fun DownLoadButton(context: Context,modifier: Modifier = Modifier) {

        Box() {
            OutlinedButton(
                onClick = {
                    downloadResume(context = context, fileUrl ="https://drive.google.com/uc?export=download&id=1AjkawlJh2frc6mPq6DwQjbO1oHY2jaSS")
                },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent
                ),
                border = BorderStroke(width = 1.dp, color = MaterialTheme.colorScheme.onSurface)
            ) {
                Row {
                    Image(
                        painter = painterResource(R.drawable.download),
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.onSurface),
                        modifier= Modifier.size(20.dp)

                    )
                    Spacer(Modifier.width(10.dp))
                    Text("Resume",
                        color = MaterialTheme.colorScheme.onSurface,
                        fontFamily = Comic,
                        fontSize = 20.sp
                    )
                }

            }

    }

}