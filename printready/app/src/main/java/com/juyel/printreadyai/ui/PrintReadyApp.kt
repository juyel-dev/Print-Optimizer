package com.juyel.printreadyai.ui

import android.net.Uri
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Folder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.WorkspacePremium
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

object Routes {
    const val HOME = "home"
    const val FLOW = "flow"
    const val CONTACT = "contact"
    const val LIBRARY = "library"
    const val PREMIUM = "premium"
    const val SETTINGS = "settings"
    fun soon(title: String) = "soon/" + Uri.encode(title)
}

private data class Tab(val route: String, val label: String, val icon: ImageVector)

private val bottomTabs = listOf(
    Tab(Routes.CONTACT, "Contact", Icons.Outlined.Email),
    Tab(Routes.LIBRARY, "Library", Icons.Outlined.Folder),
    Tab(Routes.HOME, "Home", Icons.Outlined.Home),
    Tab(Routes.PREMIUM, "Premium", Icons.Outlined.WorkspacePremium),
    Tab(Routes.SETTINGS, "Settings", Icons.Outlined.Settings)
)

@Composable
fun PrintReadyApp() {
    val nav = rememberNavController()
    Scaffold(bottomBar = { BottomBar(nav) }) { padding ->
        NavHost(
            navController = nav,
            startDestination = Routes.HOME,
            modifier = Modifier.padding(padding)
        ) {
            composable(Routes.HOME) { HomeScreen(nav) }
            composable(Routes.FLOW) { ConvertScreen(nav) }
            composable(Routes.CONTACT) { ComingSoonScreen("Contact") }
            composable(Routes.LIBRARY) { ComingSoonScreen("Library") }
            composable(Routes.PREMIUM) { ComingSoonScreen("Premium") }
            composable(Routes.SETTINGS) { ComingSoonScreen("Settings") }
            composable("soon/{title}") { entry ->
                ComingSoonScreen(entry.arguments?.getString("title") ?: "Coming Soon")
            }
        }
    }
}

@Composable
private fun BottomBar(nav: NavHostController) {
    val backStack by nav.currentBackStackEntryAsState()
    val currentDestination = backStack?.destination
    NavigationBar {
        bottomTabs.forEach { tab ->
            val selected = currentDestination?.hierarchy?.any { it.route == tab.route } == true
            NavigationBarItem(
                selected = selected,
                onClick = {
                    if (tab.route == Routes.HOME) {
                        nav.navigate(Routes.HOME) {
                            popUpTo(nav.graph.findStartDestination().id) { saveState = true }
                            launchSingleTop = true
                            restoreState = true
                        }
                    } else {
                        nav.navigate(tab.route) {
                            popUpTo(Routes.HOME) { saveState = true }
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                },
                icon = { Icon(tab.icon, contentDescription = tab.label) },
                label = { Text(tab.label) }
            )
        }
    }
}
