package com.deepakjetpackcompose.portfolioapp.view

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.deepakjetpackcompose.portfolioapp.navigation.NavigationDestination
import com.deepakjetpackcompose.portfolioapp.navigation.NavigationHelper
import com.deepakjetpackcompose.portfolioapp.util.TopBar
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppScreen(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    val sheetState = rememberModalBottomSheetState()
    val scope = rememberCoroutineScope()
    var showSheet by remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            TopBar(modifier = Modifier.statusBarsPadding(),
                onClick = {showSheet=true})
        }
    ) { paddingValues ->
            Box(modifier = Modifier.padding(paddingValues)) {

                // 🧭 Navigation Content
                NavigationHelper(navController = navController)

                // ⬆️ Bottom Sheet shown conditionally
                if (showSheet) {
                    ModalBottomSheet(
                        onDismissRequest = { showSheet = false },
                        sheetState = sheetState
                    ) {
                        Column(Modifier.fillMaxWidth().padding(24.dp)) {
                            Text("🏠 Home", Modifier.clickable {
                                navController.navigate(NavigationDestination.Home.route) {
                                    popUpTo(0)
                                }
                                scope.launch { sheetState.hide(); showSheet = false }
                            })
                            Spacer(Modifier.height(12.dp))
                            Text("ℹ️ About", Modifier.clickable {
                                navController.navigate(NavigationDestination.About.route) {
                                    popUpTo(0)
                                }
                                scope.launch { sheetState.hide(); showSheet = false }
                            })
                            Spacer(Modifier.height(12.dp))
                            Text("📁 Projects", Modifier.clickable {
                                navController.navigate(NavigationDestination.Projects.route) {
                                    popUpTo(0)
                                }
                                scope.launch { sheetState.hide(); showSheet = false }
                            })
                        }
                    }
                }
            }
        }


    }
