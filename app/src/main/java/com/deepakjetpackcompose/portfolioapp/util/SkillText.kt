package com.deepakjetpackcompose.portfolioapp.util

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.deepakjetpackcompose.portfolioapp.ui.theme.Comic
import com.deepakjetpackcompose.portfolioapp.R
import com.deepakjetpackcompose.portfolioapp.ui.theme.PortfolioAppTheme

@Preview
@Composable
fun SkillText(modifier: Modifier = Modifier) {

    PortfolioAppTheme {
        Column(modifier = Modifier
            .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Box(modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)) {
                Text(
                    "My Skills",
                    fontSize = 35.sp,
                    color = MaterialTheme.colorScheme.primary,
                    fontFamily = Comic
                )
            }
            Spacer(Modifier.height(30.dp))
            BoxSkill(img = R.drawable.iphone, skill = "Responsive UI",responsiveSkill1)
            Spacer(Modifier.height(30.dp))
            BoxSkill(img = R.drawable.code, skill = "Api Integration",ApiSkill2)
            Spacer(Modifier.height(30.dp))
            BoxSkill(img = R.drawable.github, skill = "Version Control",versionSkill3)
            Spacer(Modifier.height(40.dp))
            SkillButton(onClick = {}, name = "More Skills")
        }
    }

}


@Composable
fun BoxSkill(img:Int,skill:String,desc:String,modifier: Modifier = Modifier) {

    Box(modifier = Modifier
        .fillMaxWidth()
        .background(MaterialTheme.colorScheme.surfaceContainerHighest, shape = RoundedCornerShape(10.dp))
        .clip(shape = RoundedCornerShape(10.dp))
        .padding(24.dp)
        ){
        Column {
            Image(
                painter = painterResource(img),
                contentDescription = null,
                modifier=Modifier.size(50.dp),
                colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.primary)
            )

            Spacer(Modifier.height(40.dp))
            Text(skill,
                fontSize = 24.sp,
                color = MaterialTheme.colorScheme.onSurface,
                fontFamily = Comic)

            Spacer(Modifier.height(40.dp))
            Text(desc,
                fontSize = 20.sp,
                color = MaterialTheme.colorScheme.onSurface,
                fontFamily = Comic)

        }
    }
    
}


@Composable
fun SkillButton(onClick:()->Unit,name:String,modifier: Modifier = Modifier) {
    Box(modifier= Modifier.fillMaxWidth(),

    ){
        Button(onClick = {onClick()},
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.primary
            )
        ) {
            Row(){
                Text(name,
                    fontSize = 20.sp,
                    color = MaterialTheme.colorScheme.onPrimary,
                    fontFamily = Comic)

                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.onPrimary
                )
            }
        }
    }
    
}