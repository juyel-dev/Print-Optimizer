package com.juyel.printreadyai.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.ArrowBack
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

private val brandGradient = listOf(Color(0xFFA855F7), Color(0xFFEC4899))

// Replicated from old app AboutUsScreen.kt (AbstractC2471g) + new app identity
@Composable
fun AboutUsScreen(nav: NavHostController) {
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
                "About PrintReady AI",
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.ExtraBold,
                color = AppColors.TextPrimary
            )
            Spacer(Modifier.height(6.dp))
            Text(
                "Free, privacy-first PDF tools that work entirely on your device",
                style = MaterialTheme.typography.bodyMedium,
                color = AppColors.TextSecondary
            )
        }

        Spacer(Modifier.height(24.dp))

        // Our Mission (placeholder)
        SectionCard("Our Mission") {
            Text(
                "[Placeholder — Our Mission]\n\nWrite the mission statement for PrintReady AI here. Describe why the app exists and what problem it solves for users.",
                style = MaterialTheme.typography.bodyMedium,
                color = AppColors.TextSecondary
            )
        }

        Spacer(Modifier.height(16.dp))

        // Our Story (placeholder)
        SectionCard("Our Story") {
            Text(
                "[Placeholder — Our Story]\n\nWrite the story of PrintReady AI here. Describe the journey, the team, and how the app came to be.",
                style = MaterialTheme.typography.bodyMedium,
                color = AppColors.TextSecondary
            )
        }

        Spacer(Modifier.height(24.dp))

        // Stat cards
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            StatCard("100%", "Free", Modifier.weight(1f))
            StatCard("Offline", "Processing", Modifier.weight(1f))
        }
        Spacer(Modifier.height(12.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            StatCard("Zero", "Data Collection", Modifier.weight(1f))
            StatCard("No", "Login Required", Modifier.weight(1f))
        }

        Spacer(Modifier.height(32.dp))

        // What We Do
        SectionHeader("What We Do")
        Column(
            modifier = Modifier.padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            ValueRow(Icons.Outlined.Bolt, "Native Processing",
                "All PDF processing happens locally on your device using native C code. No servers, no uploads.")
            ValueRow(Icons.Outlined.Public, "Open & Transparent",
                "Our approach is open. We don't collect or store your data.")
            ValueRow(Icons.Outlined.RocketLaunch, "Works Offline",
                "PrintReady AI works perfectly without internet. Process PDFs anywhere, anytime.")
        }

        Spacer(Modifier.height(32.dp))

        // Powered by Modern Technology
        SectionHeader("Powered by Modern Technology")
        Column(
            modifier = Modifier.padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            TechRow("Native C", "Processing Engine")
            TechRow("Jetpack Compose", "Modern UI")
            TechRow("PdfRenderer", "Rendering")
            TechRow("Android Security", "Sandboxed")
        }

        Spacer(Modifier.height(32.dp))

        // Our Core Values
        SectionHeader("Our Core Values")
        Column(
            modifier = Modifier.padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            ValueRow(Icons.Outlined.VerifiedUser, "Privacy First", "Your files never leave your device.")
            ValueRow(Icons.Outlined.Bolt, "Lightning Fast", "Instant processing without uploads.")
            ValueRow(Icons.Outlined.Lightbulb, "Accessible", "Free tools for everyone, everywhere.")
        }

        Spacer(Modifier.height(24.dp))
    }
}

@Composable
private fun SectionCard(title: String, content: @Composable ColumnScope.() -> Unit) {
    Column(modifier = Modifier.padding(horizontal = 16.dp)) {
        Text(
            title,
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = AppColors.TextPrimary,
            modifier = Modifier.padding(bottom = 8.dp, start = 4.dp)
        )
        Card(
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = AppColors.Surface)
        ) {
            Column(modifier = Modifier.padding(16.dp), content = content)
        }
    }
}

@Composable
private fun SectionHeader(title: String) {
    Text(
        title,
        style = MaterialTheme.typography.titleMedium,
        fontWeight = FontWeight.Bold,
        color = AppColors.TextPrimary,
        modifier = Modifier.padding(horizontal = 20.dp, vertical = 8.dp)
    )
}

@Composable
private fun StatCard(value: String, label: String, modifier: Modifier = Modifier) {
    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = AppColors.Surface),
        modifier = modifier
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                value,
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.ExtraBold,
                color = AppColors.Accent
            )
            Spacer(Modifier.height(4.dp))
            Text(
                label,
                style = MaterialTheme.typography.bodySmall,
                color = AppColors.TextSecondary,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
private fun ValueRow(icon: ImageVector, title: String, text: String) {
    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = AppColors.Surface)
    ) {
        Row(modifier = Modifier.padding(16.dp)) {
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(AppColors.Accent.copy(alpha = 0.12f)),
                contentAlignment = Alignment.Center
            ) {
                Icon(icon, contentDescription = title, tint = AppColors.Accent, modifier = Modifier.size(22.dp))
            }
            Spacer(Modifier.width(14.dp))
            Column {
                Text(title, style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.SemiBold, color = AppColors.TextPrimary)
                Spacer(Modifier.height(3.dp))
                Text(text, style = MaterialTheme.typography.bodySmall, color = AppColors.TextSecondary)
            }
        }
    }
}

@Composable
private fun TechRow(title: String, tagline: String) {
    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = AppColors.Surface)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 14.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(title, style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.SemiBold, color = AppColors.TextPrimary, modifier = Modifier.weight(1f))
            Text(tagline, style = MaterialTheme.typography.bodySmall, color = AppColors.TextSecondary)
        }
    }
}
