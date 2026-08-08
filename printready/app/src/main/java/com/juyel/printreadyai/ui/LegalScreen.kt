package com.juyel.printreadyai.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

/**
 * Legal document screen. Structure replicated from the old app's legal pages;
 * body content is a placeholder to be filled in later (committed to the repo).
 *
 * Used for routes: privacy-policy, terms-of-service, refund-policy, shipping-policy
 */
@Composable
fun LegalScreen(nav: NavHostController, title: String, subtitle: String) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AppColors.Bg)
            .verticalScroll(rememberScrollState())
            .padding(top = 48.dp, bottom = 24.dp)
    ) {
        IconButton(
            onClick = { nav.navigateUp() },
            modifier = Modifier.padding(start = 8.dp)
        ) {
            Icon(Icons.AutoMirrored.Outlined.ArrowBack, "Back", tint = AppColors.TextPrimary)
        }

        // Header
        Column(modifier = Modifier.padding(horizontal = 16.dp)) {
            Text(
                title,
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.ExtraBold,
                color = AppColors.TextPrimary
            )
            Spacer(Modifier.height(6.dp))
            Text(
                subtitle,
                style = MaterialTheme.typography.bodyMedium,
                color = AppColors.TextSecondary
            )
        }

        Spacer(Modifier.height(24.dp))

        // Placeholder content card
        Card(
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = AppColors.Surface),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            Column(modifier = Modifier.padding(20.dp)) {
                Text(
                    "[Placeholder]",
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold,
                    color = AppColors.Accent
                )
                Spacer(Modifier.height(12.dp))
                Text(
                    "The full $title content will be written here. " +
                    "This is a placeholder — the actual legal text will be added " +
                    "directly to the repository in a later commit.",
                    style = MaterialTheme.typography.bodyMedium,
                    color = AppColors.TextSecondary
                )
                Spacer(Modifier.height(16.dp))
                Text(
                    "Last updated: —",
                    style = MaterialTheme.typography.bodySmall,
                    color = AppColors.TextSecondary.copy(alpha = 0.6f)
                )
            }
        }

        Spacer(Modifier.height(24.dp))
    }
}
