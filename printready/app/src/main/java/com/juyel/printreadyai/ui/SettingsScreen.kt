package com.juyel.printreadyai.ui

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.ArrowForwardIos
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

private val brandGradient = listOf(Color(0xFFA855F7), Color(0xFFEC4899))

@Composable
fun SettingsScreen(nav: NavHostController) {
    val context = LocalContext.current
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AppColors.Bg)
            .verticalScroll(rememberScrollState())
            .padding(top = 80.dp, bottom = 24.dp)
    ) {
        // Header
        Column(
            modifier = Modifier.padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                "Settings & Info",
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.ExtraBold,
                color = AppColors.TextPrimary
            )
            Text(
                "Manage your profile, preferences, and view legal guidelines.",
                style = MaterialTheme.typography.bodyMedium,
                color = AppColors.TextSecondary
            )
        }
        
        Spacer(Modifier.height(24.dp))
        
        // Logo + App info card (from old app structure)
        Card(
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = AppColors.Surface),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .size(64.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .background(Brush.linearGradient(brandGradient)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        Icons.Outlined.Print,
                        contentDescription = "PrintReady AI Logo",
                        tint = Color.White,
                        modifier = Modifier.size(32.dp)
                    )
                }
                
                Spacer(Modifier.height(16.dp))
                
                Text(
                    "PrintReady AI",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                    color = AppColors.TextPrimary
                )
                
                Spacer(Modifier.height(4.dp))
                
                Text(
                    "PrintReady AI for Android",
                    style = MaterialTheme.typography.bodySmall,
                    color = AppColors.TextSecondary
                )
                
                Spacer(Modifier.height(4.dp))
                
                Text(
                    "© 2026 PrintReady AI. All rights reserved.",
                    style = MaterialTheme.typography.bodySmall,
                    color = AppColors.TextSecondary.copy(alpha = 0.6f)
                )
            }
        }
        
        Spacer(Modifier.height(24.dp))
        
        // ===== ACCOUNT SECTION =====
        SettingsSection(title = "Account") {
            SettingsItem(
                icon = Icons.Outlined.Person,
                title = "Profile",
                subtitle = "View and manage your account profile. This section will display your user information once Firebase authentication is integrated.",
                onClick = { /* TODO: Navigate to Profile screen */ }
            )
            SettingsItem(
                icon = Icons.Outlined.Notifications,
                title = "Notifications",
                subtitle = "Manage your notification preferences. Configure which updates and alerts you want to receive from the app.",
                onClick = { /* TODO: Navigate to Notification settings */ }
            )
            SettingsItem(
                icon = Icons.Outlined.Logout,
                title = "Sign Out",
                subtitle = "Sign out of your account. Currently a placeholder - Firebase authentication will be added in future updates.",
                onClick = { /* TODO: Sign out from Firebase */ }
            )
        }
        
        Spacer(Modifier.height(24.dp))
        
        // ===== PRODUCT SECTION =====
        SettingsSection(title = "Product") {
            SettingsItem(
                icon = Icons.Outlined.Star,
                title = "Rate Us",
                subtitle = "Enjoying PrintReady AI? Rate us on the Play Store to support our development and help other users find the app.",
                onClick = { /* TODO: Open Play Store listing */ }
            )
            SettingsItem(
                icon = Icons.Outlined.Share,
                title = "Share App",
                subtitle = "Share PrintReady AI with friends and colleagues who need document processing and PDF enhancement tools.",
                onClick = { /* TODO: Launch share Intent */ }
            )
            SettingsItem(
                icon = Icons.Outlined.Feedback,
                title = "Send Feedback",
                subtitle = "Have suggestions or found a bug? Let us know how we can improve the app and add new features you need.",
                onClick = { /* TODO: Open email composer */ }
            )
            SettingsItem(
                icon = Icons.Outlined.NewReleases,
                title = "What's New",
                subtitle = "See the latest features, improvements, and bug fixes in the most recent updates to PrintReady AI.",
                onClick = { /* TODO: Navigate to changelog */ }
            )
        }
        
        Spacer(Modifier.height(24.dp))
        
        // ===== COMPANY SECTION =====
        SettingsSection(title = "Company") {
            SettingsItem(
                icon = Icons.Outlined.Info,
                title = "About Us",
                subtitle = "Learn about PrintReady AI, our mission to simplify document processing, and the team behind the app.",
                onClick = { /* TODO: Navigate to About screen */ }
            )
            SettingsItem(
                icon = Icons.Outlined.Email,
                title = "Contact Us",
                subtitle = "Get in touch with our support team for any questions, assistance, or business inquiries.",
                onClick = { nav.navigate(Routes.CONTACT) }
            )
            SettingsItem(
                icon = Icons.Outlined.Language,
                title = "Blog",
                subtitle = "Read our latest articles, tips, and updates about document processing and productivity.",
                onClick = { /* TODO: Open blog in browser */ }
            )
            SettingsItem(
                icon = Icons.Outlined.People,
                title = "Our Team",
                subtitle = "Meet the developers and designers who built PrintReady AI and are working to make it better every day.",
                onClick = { /* TODO: Navigate to Team screen */ }
            )
        }
        
        Spacer(Modifier.height(24.dp))
        
        // ===== LEGAL SECTION =====
        SettingsSection(title = "Legal") {
            SettingsItem(
                icon = Icons.Outlined.PrivacyTip,
                title = "Privacy Policy",
                subtitle = "Learn how we collect, use, and protect your data. We respect your privacy and process all documents locally on your device.",
                onClick = { /* TODO: Navigate to Privacy Policy screen */ }
            )
            SettingsItem(
                icon = Icons.Outlined.Gavel,
                title = "Terms of Service",
                subtitle = "Read our terms and conditions for using PrintReady AI and its various document processing features.",
                onClick = { /* TODO: Navigate to Terms screen */ }
            )
            SettingsItem(
                icon = Icons.Outlined.Description,
                title = "Licence",
                subtitle = "View the open-source licences, third-party attributions, and legal information for this application.",
                onClick = { /* TODO: Navigate to Licence screen */ }
            )
            SettingsItem(
                icon = Icons.Outlined.Cookie,
                title = "Cookie Policy",
                subtitle = "Understand how we use cookies and similar technologies to improve your experience with PrintReady AI.",
                onClick = { /* TODO: Navigate to Cookie Policy screen */ }
            )
        }
        
        Spacer(Modifier.height(32.dp))
        
        // Footer
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                "Made with ❤️ for document processing",
                style = MaterialTheme.typography.bodySmall,
                color = AppColors.TextSecondary
            )
            Spacer(Modifier.height(8.dp))
            Text(
                "Version 1.0.0",
                style = MaterialTheme.typography.bodySmall,
                color = AppColors.TextSecondary.copy(alpha = 0.6f)
            )
        }
    }
}

@Composable
private fun SettingsSection(
    title: String,
    content: @Composable ColumnScope.() -> Unit
) {
    Column(
        modifier = Modifier.padding(horizontal = 16.dp)
    ) {
        Text(
            title,
            style = MaterialTheme.typography.titleSmall,
            fontWeight = FontWeight.Bold,
            color = AppColors.Accent,
            modifier = Modifier.padding(bottom = 12.dp, start = 4.dp)
        )
        
        Card(
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = AppColors.Surface)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                content = content
            )
        }
    }
}

@Composable
private fun SettingsItem(
    icon: ImageVector,
    title: String,
    subtitle: String,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            icon,
            contentDescription = title,
            tint = AppColors.Accent,
            modifier = Modifier.size(24.dp)
        )
        
        Spacer(Modifier.width(16.dp))
        
        Column(modifier = Modifier.weight(1f)) {
            Text(
                title,
                style = MaterialTheme.typography.titleSmall,
                fontWeight = FontWeight.SemiBold,
                color = AppColors.TextPrimary
            )
            
            Spacer(Modifier.height(4.dp))
            
            Text(
                subtitle,
                style = MaterialTheme.typography.bodySmall,
                color = AppColors.TextSecondary,
                lineHeight = 16.sp
            )
        }
        
        Spacer(Modifier.width(8.dp))
        
        Icon(
            Icons.AutoMirrored.Outlined.ArrowForwardIos,
            contentDescription = "Navigate",
            tint = AppColors.TextSecondary.copy(alpha = 0.5f),
            modifier = Modifier.size(16.dp)
        )
    }
    
    HorizontalDivider(
        color = AppColors.TextSecondary.copy(alpha = 0.1f),
        modifier = Modifier.padding(horizontal = 16.dp)
    )
}
