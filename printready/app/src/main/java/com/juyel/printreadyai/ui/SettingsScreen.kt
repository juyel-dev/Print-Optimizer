package com.juyel.printreadyai.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.ArrowForwardIos
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

private val brandGradient = listOf(Color(0xFFA855F7), Color(0xFFEC4899))

/**
 * Settings & Info screen.
 * Structure replicated from the old app SettingsScreen (AbstractC2598ne.java):
 *   Header -> Account -> Product -> Connect (renamed from Company) -> Legal -> footer.
 * Item titles/subtitles copied verbatim from the old app's section lambdas
 * (C2486ge / C2534je / C2550ke / C2566le), rebranded to PrintReady AI.
 */
@Composable
fun SettingsScreen(nav: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AppColors.Bg)
            .verticalScroll(rememberScrollState())
            .padding(top = 80.dp, bottom = 24.dp)
    ) {
        // Header (verbatim from old app)
        Column(modifier = Modifier.padding(horizontal = 16.dp)) {
            Text(
                "Settings & Info",
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.ExtraBold,
                color = AppColors.TextPrimary
            )
            Spacer(Modifier.height(6.dp))
            Text(
                "Manage your profile, preferences, and view legal guidelines.",
                style = MaterialTheme.typography.bodyMedium,
                color = AppColors.TextSecondary
            )
        }

        Spacer(Modifier.height(24.dp))

        // ===== ACCOUNT =====
        SettingsSection("Account") {
            SettingsItem(
                Icons.Outlined.Person, "Profile",
                "View and manage your account profile",
                onClick = { /* TODO: Firebase profile */ }
            )
            SettingsItem(
                Icons.Outlined.Notifications, "Notifications",
                "Manage your in-app notification preferences",
                onClick = { /* TODO: notification preferences */ }
            )
            SettingsItem(
                Icons.Outlined.Logout, "Sign Out",
                "Log out from your account safely",
                onClick = { /* TODO: Firebase sign out */ }
            )
        }

        Spacer(Modifier.height(24.dp))

        // ===== PRODUCT ===== (Features + My Downloads; print item removed)
        SettingsSection("Product") {
            SettingsItem(
                Icons.Outlined.Star, "Features",
                "Discover all the powerful capabilities of the app",
                onClick = { nav.navigate(Routes.FEATURES) }
            )
            SettingsItem(
                Icons.Outlined.Download, "My Downloads",
                "Access all your locally processed PDF documents",
                onClick = { nav.navigate(Routes.LIBRARY) }
            )
        }

        Spacer(Modifier.height(24.dp))

        // ===== CONNECT (renamed from Company) =====
        SettingsSection("Connect") {
            SettingsItem(
                Icons.Outlined.Groups, "Community",
                "Engage with other learners and contributors",
                onClick = { nav.navigate(Routes.COMMUNITY) }
            )
            SettingsItem(
                Icons.Outlined.Email, "Contact Us",
                "Reach out for support, queries or feedback",
                onClick = { nav.navigate(Routes.CONTACT) }
            )
            SettingsItem(
                Icons.Outlined.HelpOutline, "Help Center",
                "Find FAQs and answers to common issues",
                onClick = { nav.navigate(Routes.HELP) }
            )
            SettingsItem(
                Icons.Outlined.Info, "About Us",
                "Read about our mission and development team",
                onClick = { nav.navigate(Routes.ABOUT_US) }
            )
        }

        Spacer(Modifier.height(24.dp))

        // ===== LEGAL (100% same as old app, content placeholder) =====
        SettingsSection("Legal") {
            SettingsItem(
                Icons.Outlined.Security, "Privacy Policy",
                "Review how we handle and protect your data",
                onClick = { nav.navigate(Routes.PRIVACY_POLICY) }
            )
            SettingsItem(
                Icons.Outlined.Gavel, "Terms of Service",
                "Read our standard terms and user guidelines",
                onClick = { nav.navigate(Routes.TERMS_OF_SERVICE) }
            )
            SettingsItem(
                Icons.Outlined.ReceiptLong, "Refund Policy",
                "Learn about our donation and print refund terms",
                onClick = { nav.navigate(Routes.REFUND_POLICY) }
            )
            SettingsItem(
                Icons.Outlined.LocalShipping, "Shipping Policy",
                "Timelines and logistics rules for print delivery",
                onClick = { nav.navigate(Routes.SHIPPING_POLICY) }
            )
        }

        Spacer(Modifier.height(48.dp))

        // Footer (replicated from old app, rebranded)
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .size(56.dp)
                    .clip(CircleShape)
                    .background(Brush.linearGradient(brandGradient)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    Icons.Outlined.Print,
                    contentDescription = "PrintReady AI Logo",
                    tint = Color.White,
                    modifier = Modifier.size(28.dp)
                )
            }
            Spacer(Modifier.height(12.dp))
            Text(
                "PrintReady AI for Android",
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.SemiBold,
                color = AppColors.TextPrimary
            )
            Spacer(Modifier.height(4.dp))
            Text(
                "© 2026 PrintReady AI. All rights reserved.",
                style = MaterialTheme.typography.bodySmall,
                color = AppColors.TextSecondary
            )
        }
    }
}

@Composable
private fun SettingsSection(title: String, content: @Composable ColumnScope.() -> Unit) {
    Column(modifier = Modifier.padding(horizontal = 16.dp)) {
        Text(
            title.uppercase(),
            style = MaterialTheme.typography.labelLarge,
            fontWeight = FontWeight.Bold,
            letterSpacing = 1.5.sp,
            color = AppColors.TextSecondary.copy(alpha = 0.7f),
            modifier = Modifier.padding(bottom = 10.dp, start = 4.dp)
        )
        Card(
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = AppColors.Surface)
        ) {
            Column(modifier = Modifier.fillMaxWidth(), content = content)
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
            .padding(horizontal = 16.dp, vertical = 14.dp),
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
            Spacer(Modifier.height(2.dp))
            Text(
                subtitle,
                style = MaterialTheme.typography.bodySmall,
                color = AppColors.TextSecondary
            )
        }
        Icon(
            Icons.AutoMirrored.Outlined.ArrowForwardIos,
            contentDescription = null,
            tint = AppColors.TextSecondary.copy(alpha = 0.5f),
            modifier = Modifier.size(16.dp)
        )
    }
}
