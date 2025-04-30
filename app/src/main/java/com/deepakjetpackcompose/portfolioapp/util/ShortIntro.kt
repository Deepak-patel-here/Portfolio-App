package com.deepakjetpackcompose.portfolioapp.util

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.deepakjetpackcompose.portfolioapp.ui.theme.PortfolioAppTheme
import com.deepakjetpackcompose.portfolioapp.R
import com.deepakjetpackcompose.portfolioapp.navigation.NavigationDestination
import com.deepakjetpackcompose.portfolioapp.ui.theme.Comic
import com.deepakjetpackcompose.portfolioapp.viewmodel.DarkViewModel


@Composable
fun ShortIntro(navController: NavController,modifier: Modifier = Modifier) {


        Column (modifier= Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.surfaceContainerHighest, shape = RoundedCornerShape(10.dp))
            .clip(RoundedCornerShape(10.dp))
            .padding(horizontal = 16.dp, vertical = 10.dp)
        ){
            Card (modifier=Modifier.padding(5.dp),
                shape = RoundedCornerShape(10.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            ){
                Column (modifier= Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally){
                    Image(
                        painter = painterResource(R.drawable.mypicture),
                        contentDescription = null,
                        contentScale = ContentScale.Fit
                    )
                }
            }
            Spacer(Modifier.height(30.dp))
            Text("About Me",
                fontSize = 26.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = Comic,
                color = MaterialTheme.colorScheme.onSurface
            )
            Spacer(Modifier.height(15.dp))
            Text("$abouts",
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = Comic,
                color = MaterialTheme.colorScheme.onSurface

            )

            Spacer(Modifier.height(30.dp))
            OutlinedButton(onClick = {
                navController.navigate(NavigationDestination.About.route)
            },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent
                ),
                border = BorderStroke(width = 1.dp, color = MaterialTheme.colorScheme.onSurface)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("More about me",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = Comic,
                        color = MaterialTheme.colorScheme.onSurface)
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowRight,
                        contentDescription = null,
                        tint= MaterialTheme.colorScheme.onSurface
                    )
                }
            }


        }


}