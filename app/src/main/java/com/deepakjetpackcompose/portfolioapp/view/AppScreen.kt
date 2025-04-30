package com.deepakjetpackcompose.portfolioapp.view

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.deepakjetpackcompose.portfolioapp.navigation.NavigationDestination
import com.deepakjetpackcompose.portfolioapp.navigation.NavigationHelper
import com.deepakjetpackcompose.portfolioapp.ui.theme.Comic
import com.deepakjetpackcompose.portfolioapp.util.TopBar
import com.deepakjetpackcompose.portfolioapp.viewmodel.DarkViewModel
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppScreen(darkViewModel: DarkViewModel,modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    val sheetState = rememberModalBottomSheetState()
    val scope = rememberCoroutineScope()
    var showSheet by remember { mutableStateOf(false) }
    val isDark by darkViewModel.isDarkMode.collectAsState()

    Scaffold(
        topBar = {
            TopBar(modifier = Modifier.statusBarsPadding(),
                onClick = {showSheet=true})
        }
    ) { paddingValues ->
            Box(modifier = Modifier.padding(paddingValues)) {
                NavigationHelper(darkViewModel = darkViewModel, navController = navController)
                if (showSheet) {
                    ModalBottomSheet(
                        onDismissRequest = { showSheet = false },
                        sheetState = sheetState
                    ) {
                        Column(Modifier.fillMaxWidth().padding(24.dp),
                            horizontalAlignment = Alignment.CenterHorizontally) {
                            Row (verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween,
                                modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp, vertical = 20.dp)
                                    .clickable {
                                        navController.navigate(NavigationDestination.Home.route) {
                                            popUpTo(0)
                                        }
                                        scope.launch { sheetState.hide(); showSheet = false }
                                    }){
                                Text("Home", Modifier,
                                    fontSize = 20.sp,
                                    fontFamily = Comic,
                                    color = MaterialTheme.colorScheme.onSurface)

                                Icon(
                                    imageVector = Icons.Default.KeyboardArrowRight,
                                    contentDescription = null,
                                    tint = MaterialTheme.colorScheme.onSurface
                                )
                            }

                            Divider()
                            Spacer(Modifier.height(12.dp))
                            Row (verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween,
                                modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp, vertical = 20.dp)
                                    .clickable {
                                        navController.navigate(NavigationDestination.About.route) {
                                            popUpTo(0)
                                        }
                                        scope.launch { sheetState.hide(); showSheet = false }
                                    }){
                                Text("Abouts", Modifier,
                                    fontSize = 20.sp,
                                    fontFamily = Comic,
                                    color = MaterialTheme.colorScheme.onSurface)

                                Icon(
                                    imageVector = Icons.Default.KeyboardArrowRight,
                                    contentDescription = null,
                                    tint = MaterialTheme.colorScheme.onSurface
                                )
                            }
                            Divider()
                            Spacer(Modifier.height(12.dp))
                            Row (verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween,
                                modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp, vertical = 20.dp)
                                    .clickable {
                                        navController.navigate(NavigationDestination.Projects.route) {
                                            popUpTo(0)
                                        }
                                        scope.launch { sheetState.hide(); showSheet = false }
                                    }){
                                Text("Projects", Modifier,
                                    fontSize = 20.sp,
                                    fontFamily = Comic,
                                    color = MaterialTheme.colorScheme.onSurface)

                                Icon(
                                    imageVector = Icons.Default.KeyboardArrowRight,
                                    contentDescription = null,
                                    tint = MaterialTheme.colorScheme.onSurface
                                )
                            }
                            Divider()
                            Spacer(Modifier.height(12.dp))
                            Row(verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween,
                                modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp, vertical = 20.dp)
                                    .clickable(onClick = {
                                        darkViewModel.toggleDarkMode()
                                    })) {
                                Text(text = if(isDark){
                                    "Light mode"
                                }else{
                                    "Dark Mode"
                                },
                                    fontSize = 20.sp,
                                    fontFamily = Comic,
                                    color = MaterialTheme.colorScheme.onSurface)

                                Icon(imageVector = Icons.Default.KeyboardArrowRight,
                                    contentDescription = null,
                                    tint=MaterialTheme.colorScheme.onSurface)
                            }
                            Spacer(Modifier.height(12.dp))
                        }
                    }
                }
            }
        }


    }
