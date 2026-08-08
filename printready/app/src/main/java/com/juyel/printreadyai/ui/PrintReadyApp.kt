package com.juyel.printreadyai.ui

import android.net.Uri
import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.Assignment
import androidx.compose.material.icons.outlined.Chat
import androidx.compose.material.icons.outlined.Checklist
import androidx.compose.material.icons.outlined.Download
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.juyel.printreadyai.ui.tools.*

object Routes {
    const val HOME = "home"
    const val FLOW = "flow"
    const val TOOLS = "tools"
    const val CONTACT = "contact"
    const val LIBRARY = "library"
    const val PREMIUM = "premium"
    const val SETTINGS = "settings"

    // Info hub routes (replicated from old app)
    const val FEATURES = "features"
    const val ABOUT_US = "about-us"
    const val COMMUNITY = "community"
    const val HELP = "help"
    const val PRIVACY_POLICY = "privacy-policy"
    const val TERMS_OF_SERVICE = "terms-of-service"
    const val REFUND_POLICY = "refund-policy"
    const val SHIPPING_POLICY = "shipping-policy"

    fun soon(title: String) = "soon/" + Uri.encode(title)
}

private val brandGradient = listOf(Color(0xFFA855F7), Color(0xFFEC4899))

data class NavItem(val route: String, val label: String, val icon: ImageVector)

private val bottomTabs = listOf(
    NavItem(Routes.CONTACT, "Contact", Icons.Outlined.Chat),
    NavItem(Routes.LIBRARY, "Library", Icons.Outlined.Checklist),
    NavItem(Routes.HOME, "Home", Icons.Outlined.Home),
    NavItem(Routes.PREMIUM, "Premium", Icons.AutoMirrored.Outlined.Assignment),
    NavItem(Routes.SETTINGS, "Settings", Icons.Outlined.Settings)
)

@Composable
fun PrintReadyApp() {
    val nav = rememberNavController()
    var currentRoute by remember { mutableStateOf(Routes.HOME) }
    
    Scaffold(
        topBar = {
            if (!isToolScreen(currentRoute)) {
                AppHeader(currentRoute, nav)
                SubHeaderTabs(currentRoute) { route ->
                    currentRoute = route
                    nav.navigate(route) {
                        popUpTo(nav.graph.findStartDestination().id) { saveState = true }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            }
        },
        bottomBar = {
            if (!isToolScreen(currentRoute) && !isHiddenOnFlow(currentRoute)) {
                BottomBar(nav, currentRoute) { route ->
                    currentRoute = route
                }
            }
        }
    ) { padding ->
        NavHost(
            navController = nav,
            startDestination = Routes.HOME,
            modifier = Modifier.padding(padding)
        ) {
            // Main screens
            composable(Routes.HOME) { HomeScreen(nav) }
            composable(Routes.FLOW) { ConvertScreen(nav) }
            composable(Routes.TOOLS) { ToolsScreen(nav) }
            composable(Routes.CONTACT) { ContactScreen(nav) }
            composable(Routes.LIBRARY) { LibraryScreen(nav) }
            composable(Routes.PREMIUM) { ComingSoonScreen("Premium") }
            composable(Routes.SETTINGS) { SettingsScreen(nav) }
            composable("ai") { ComingSoonScreen("AI") }

            // Info hub screens (replicated from old app)
            composable(Routes.FEATURES) { FeaturesScreen(nav) }
            composable(Routes.ABOUT_US) { AboutUsScreen(nav) }
            composable(Routes.COMMUNITY) { CommunityScreen(nav) }
            composable(Routes.HELP) { HelpCenterScreen(nav) }
            composable(Routes.PRIVACY_POLICY) { LegalScreen(nav, "Privacy Policy", "Review how we handle and protect your data") }
            composable(Routes.TERMS_OF_SERVICE) { LegalScreen(nav, "Terms of Service", "Read our standard terms and user guidelines") }
            composable(Routes.REFUND_POLICY) { LegalScreen(nav, "Refund Policy", "Learn about our donation and print refund terms") }
            composable(Routes.SHIPPING_POLICY) { LegalScreen(nav, "Shipping Policy", "Timelines and logistics rules for print delivery") }
            
            // Tool screens
            composable("pdf-merge") { MergePdfScreen(nav) }
            composable("pdf-split") { SplitPdfScreen(nav) }
            composable("pdf-compress") { CompressPdfScreen(nav) }
            composable("pdf-add-page-numbers") { AddPageNumbersScreen(nav) }
            composable("pdf-organize") { OrganizePdfScreen(nav) }
            composable("pdf-crop") { CropPdfScreen(nav) }
            composable("pdf-invert") { InvertPdfScreen(nav) }
            composable("pdf-to-jpg") { PdfToJpgScreen(nav) }
            composable("jpg-to-pdf") { JpgToPdfScreen(nav) }
            composable("pomodoro-setup") { PomodoroScreen(nav) }
            
            // Coming soon
            composable("soon/{title}") { entry ->
                ComingSoonScreen(entry.arguments?.getString("title") ?: "Coming Soon")
            }
        }
    }
}

private fun isToolScreen(route: String?): Boolean {
    return route?.startsWith("pdf-") == true || 
           route?.startsWith("jpg-") == true || 
           route?.startsWith("pomodoro-") == true
}

private fun isHiddenOnFlow(route: String?): Boolean {
    return route == Routes.FLOW
}

@Composable
private fun AppHeader(currentRoute: String?, nav: NavHostController) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .statusBarsPadding()
            .padding(16.dp, 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(Brush.linearGradient(brandGradient)),
            contentAlignment = Alignment.Center
        ) {
            Icon(Icons.Outlined.Home, null, tint = Color.White, modifier = Modifier.size(20.dp))
        }
        
        Spacer(Modifier.width(10.dp))
        
        Text(
            "PrintReady AI",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            color = AppColors.Accent
        )
        
        Spacer(Modifier.weight(1f))
        
        if (currentRoute?.startsWith("print-") == true) {
            IconButton(onClick = { nav.navigate("print-order-upload") }) {
                Icon(Icons.Outlined.ShoppingCart, "Cart", tint = AppColors.TextSecondary)
            }
        }
        
        if (currentRoute?.startsWith("print-") == true) {
            IconButton(onClick = { nav.navigate(Routes.FLOW) }) {
                Icon(Icons.Outlined.Download, "Download", tint = AppColors.TextSecondary)
            }
        }
    }
}

@Composable
private fun SubHeaderTabs(currentRoute: String?, onTabSelected: (String) -> Unit) {
    val tabs = listOf(
        Triple(Routes.FLOW, "FLOW", "Flow"),
        Triple("ai", "AI", "AI"),
        Triple(Routes.TOOLS, "TOOLS", "Tools")
    )
    
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        tabs.forEach { (route, label, _) ->
            val isActive = currentRoute == route
            
            Surface(
                shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp),
                color = if (isActive) AppColors.Surface.copy(alpha = 0.08f) else Color.Transparent,
                modifier = Modifier
                    .weight(1f)
                    .clickable { onTabSelected(route) }
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 12.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        label,
                        style = MaterialTheme.typography.labelLarge,
                        fontWeight = if (isActive) FontWeight.Bold else FontWeight.Medium,
                        color = if (isActive) AppColors.TextPrimary else AppColors.TextSecondary.copy(alpha = 0.5f),
                        letterSpacing = 1.5.sp
                    )
                    
                    Spacer(Modifier.height(8.dp))
                    
                    Box(
                        modifier = Modifier
                            .width(if (isActive) 18.dp else 9.dp)
                            .height(3.dp)
                            .clip(CircleShape)
                            .background(
                                if (isActive) Brush.linearGradient(brandGradient)
                                else Brush.linearGradient(listOf(Color.Transparent))
                            )
                    )
                }
            }
        }
    }
}

@Composable
private fun BottomBar(nav: NavHostController, currentRoute: String?, onRouteChange: (String) -> Unit) {
    val backStack by nav.currentBackStackEntryAsState()
    val currentDestination = backStack?.destination
    
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .navigationBarsPadding()
    ) {
        NavigationBar(
            containerColor = Color.Transparent,
            modifier = Modifier.fillMaxWidth()
        ) {
            bottomTabs.forEach { tab ->
                val isActive = when (tab.route) {
                    Routes.HOME -> currentRoute in listOf("home", "flow", "how-to-print", "tools", "print-price-calculator")
                    Routes.SETTINGS -> currentRoute in listOf("settings", "my-addresses", "community-pass")
                    Routes.CONTACT -> currentRoute == Routes.CONTACT
                    else -> currentDestination?.hierarchy?.any { it.route == tab.route } == true
                }
                
                val iconColor by animateColorAsState(
                    targetValue = if (isActive) brandGradient[0] else AppColors.TextSecondary,
                    label = "iconColor"
                )
                
                NavigationBarItem(
                    selected = isActive,
                    onClick = {
                        onRouteChange(tab.route)
                        nav.navigate(tab.route) {
                            popUpTo(nav.graph.findStartDestination().id) { saveState = true }
                            launchSingleTop = true
                            restoreState = true
                        }
                    },
                    icon = { Icon(tab.icon, contentDescription = tab.label, tint = iconColor) },
                    label = { 
                        Text(
                            tab.label, 
                            color = iconColor,
                            style = MaterialTheme.typography.labelSmall
                        ) 
                    },
                    colors = NavigationBarItemDefaults.colors(
                        indicatorColor = Color.Transparent
                    )
                )
            }
        }
    }
}
