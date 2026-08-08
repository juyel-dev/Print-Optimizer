
package com.juyel.printreadyai.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun SettingsScreen(nav: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AppColors.Background)
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {
        Text(
            "Settings & Info",
            style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Bold),
            color = AppColors.TextPrimary
        )
        Spacer(Modifier.height(4.dp))
        Text(
            "Manage your profile, preferences, and view legal guidelines.",
            style = MaterialTheme.typography.bodyMedium,
            color = AppColors.TextSecondary
        )
        
        Spacer(Modifier.height(24.dp))
        
        // Logo / Brand Section
        Surface(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            color = AppColors.Surface.copy(alpha = 0.06f)
        ) {
            Column(
                modifier = Modifier.padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .size(64.dp)
                        .background(AppColors.Accent.copy(alpha = 0.1f), CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        Icons.Outlined.Print, // or any relevant logo icon
                        contentDescription = "PrintReady AI Logo",
                        tint = AppColors.Accent,
                        modifier = Modifier.size(32.dp)
                    )
                }
                Spacer(Modifier.height(12.dp))
                Text("PrintReady AI for Android", style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold), color = AppColors.TextPrimary)
                Spacer(Modifier.height(4.dp))
                Text("© 2026 PrintReady AI. All rights reserved.", style = MaterialTheme.typography.bodySmall, color = AppColors.TextSecondary)
            }
        }

        Spacer(Modifier.height(24.dp))

        SettingsSection("Account") {
            SettingsItem(Icons.Outlined.Person, "Profile", "Manage your account details") { /* nav.navigate("profile") */ }
            SettingsItem(Icons.Outlined.Logout, "Sign Out", "Disconnect your account") { /* authManager.signOut() */ }
        }

        SettingsSection("Product") {
            SettingsItem(Icons.Outlined.Star, "Rate Us", "Love the app? Give us a rating!") { /* Open Play Store */ }
            SettingsItem(Icons.Outlined.Share, "Share App", "Share with your friends") { /* Share Intent */ }
            SettingsItem(Icons.Outlined.Feedback, "Feedback", "Report bugs or suggest features") { /* Open Email */ }
        }

        SettingsSection("Company") {
            SettingsItem(Icons.Outlined.Info, "About Us", "Learn more about our mission") { /* nav.navigate("about-us") */ }
            SettingsItem(Icons.Outlined.ContactSupport, "Contact Us", "Get in touch with our team") { nav.navigate(Routes.CONTACT) }
            SettingsItem(Icons.Outlined.Article, "Blog", "Read our latest articles") { /* Open Blog */ }
        }

        SettingsSection("Legal") {
            SettingsItem(Icons.Outlined.PrivacyTip, "Privacy Policy", "How we handle your data") { /* Open Privacy */ }
            SettingsItem(Icons.Outlined.Gavel, "Terms of Service", "Rules for using the app") { /* Open Terms */ }
            SettingsItem(Icons.Outlined.ReceiptLong, "Refund Policy", "Our refund guidelines") { /* Open Refund */ }
            SettingsItem(Icons.Outlined.LocalShipping, "Shipping Policy", "Delivery information") { /* Open Shipping */ }
        }
        
        Spacer(Modifier.height(32.dp))
    }
}

@Composable
fun SettingsSection(title: String, content: @Composable ColumnScope.() -> Unit) {
    Column(modifier = Modifier.padding(vertical = 8.dp)) {
        Text(
            title.uppercase(),
            style = MaterialTheme.typography.labelLarge.copy(fontWeight = FontWeight.Bold, letterSpacing = 1.sp),
            color = AppColors.Accent,
            modifier = Modifier.padding(bottom = 8.dp, start = 4.dp)
        )
        Surface(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            color = AppColors.Surface.copy(alpha = 0.06f)
        ) {
            Column(modifier = Modifier.padding(vertical = 8.dp), content = content)
        }
    }
}

@Composable
fun SettingsItem(icon: ImageVector, title: String, subtitle: String, onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }
            .padding(horizontal = 16.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            icon,
            contentDescription = null,
            tint = AppColors.Accent,
            modifier = Modifier.size(24.dp)
        )
        Spacer(Modifier.width(16.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(title, style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.SemiBold), color = AppColors.TextPrimary)
            Text(subtitle, style = MaterialTheme.typography.bodySmall, color = AppColors.TextSecondary)
        }
        Icon(
            Icons.Outlined.ChevronRight,
            contentDescription = null,
            tint = AppColors.TextSecondary.copy(alpha = 0.5f),
            modifier = Modifier.size(20.dp)
        )
    }
}
