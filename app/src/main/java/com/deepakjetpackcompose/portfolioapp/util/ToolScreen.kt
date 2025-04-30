package com.deepakjetpackcompose.portfolioapp.util


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
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
import com.deepakjetpackcompose.portfolioapp.R
import com.deepakjetpackcompose.portfolioapp.ui.theme.Comic
import com.deepakjetpackcompose.portfolioapp.ui.theme.PortfolioAppTheme

@PreviewLightDark
@Composable
fun ToolScreen(modifier: Modifier = Modifier) {
    PortfolioAppTheme {
        Column (modifier= Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally){
            Text(
                "Tools I Master",
                color = MaterialTheme.colorScheme.primary,
                fontFamily = Comic,
                fontSize = 35.sp
            )

            Spacer(Modifier.height(70.dp))
            ToolTemplate(img = R.drawable.android, tool = "Android Studio", desc = android,i=4)

            Spacer(Modifier.height(40.dp))
            ToolTemplate(img = R.drawable.programming, tool = "Intellij Idea", desc = intellij,i=3)

        }
    }

}


@Composable
fun ToolTemplate(img:Int,tool:String,desc:String,i:Int,modifier: Modifier = Modifier) {
    Card(modifier = Modifier
        .border(
            BorderStroke(0.5.dp, MaterialTheme.colorScheme.onSurface),
            shape = RoundedCornerShape(12.dp)
        ),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.Transparent
        )) {
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
            Text(tool,
                color = MaterialTheme.colorScheme.primary,
                fontFamily = Comic,
                fontSize = 30.sp

                )
            Spacer(Modifier.height(30.dp))
            Text(desc,
                color = MaterialTheme.colorScheme.onSurface,
                fontFamily = Comic,
                fontSize = 20.sp,
                fontWeight = FontWeight.Thin,
                modifier = Modifier.align(Alignment.CenterHorizontally).padding(horizontal = 30.dp),
                textAlign = TextAlign.Center)
            Spacer(Modifier.height(30.dp))

            Row (verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
                horizontalArrangement = Arrangement.Center){
                for(k in 1..5){
                    Icon(
                        painter = painterResource(
                            if(k<=i){
                                R.drawable.star
                            }else{
                                R.drawable.hollowstar
                            }
                        ),
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.primary,
                        modifier = Modifier.size(30.dp)
                    )
                    Spacer(Modifier.width(20.dp))
                }
            }

        }
    }

}