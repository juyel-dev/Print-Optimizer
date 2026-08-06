package com.juyel.printreadyai.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.Assignment
import androidx.compose.material.icons.outlined.Chat
import androidx.compose.material.icons.outlined.Checklist
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Settings
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
    const val PRINTS = "prints"
    const val TOOLS = "tools"
    const val CONTACT = "contact-us"
    const val DASHBOARD = "dashboard"
    const val MY_ORDERS = "my-orders"
    const val SETTINGS = "settings"
}

private data class Tab(val route: String, val label: String, val icon: ImageVector)

private val bottomTabs = listOf(
    Tab(Routes.CONTACT, "Contact", Icons.Outlined.Chat),
    Tab(Routes.DASHBOARD, "To-Do", Icons.Outlined.Checklist),
    Tab(Routes.HOME, "Home", Icons.Outlined.Home),
    Tab(Routes.MY_ORDERS, "My Orders", Icons.AutoMirrored.Outlined.Assignment),
    Tab(Routes.SETTINGS, "Setting", Icons.Outlined.Settings)
)

@Composable
fun PrintReadyApp() {
    val nav = rememberNavController()
    Scaffold(
        bottomBar = { BottomBar(nav) }
    ) { padding ->
        NavHost(
            navController = nav,
            startDestination = Routes.HOME,
            modifier = Modifier.padding(padding)
        ) {
            composable(Routes.HOME) { HomeScreen(nav) }
            composable(Routes.FLOW) { ConvertScreen(nav) }
            composable(Routes.TOOLS) { MergeScreen(nav) }
            composable(Routes.CONTACT) { ContactScreen(nav) }
            composable(Routes.DASHBOARD) { ComingSoonScreen("To-Do") }
            composable(Routes.MY_ORDERS) { ComingSoonScreen("My Orders") }
            composable(Routes.SETTINGS) { SettingsScreen(nav) }
            composable(Routes.PRINTS) { ComingSoonScreen("Prints") }
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
