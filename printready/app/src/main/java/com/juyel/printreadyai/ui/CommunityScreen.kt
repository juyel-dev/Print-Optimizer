package com.juyel.printreadyai.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.ArrowBack
import androidx.compose.material.icons.automirrored.outlined.ArrowForwardIos
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

// Replicated from old app CommunityScreen.kt (p102x3/r.java)
// Links replaced with placeholders per new-app requirements
private data class SocialPlatform(
    val name: String,
    val tagline: String,
    val icon: ImageVector,
    val brandColor: Color,
    val link: String // placeholder
)

private val platforms = listOf(
    SocialPlatform("Telegram", "Join our Telegram group for instant updates and community chat",
        Icons.Outlined.Send, Color(0xFF0088CC), "https://example.com/telegram"),
    SocialPlatform("YouTube", "Subscribe for tutorials, demos, and feature showcases",
        Icons.Outlined.PlayCircle, Color(0xFFFF0000), "https://example.com/youtube"),
    SocialPlatform("Discord", "Join our Discord community to chat with the team and other users",
        Icons.Outlined.Chat, Color(0xFF5865F2), "https://example.com/discord"),
    SocialPlatform("Twitter/X", "Follow us on Twitter for the latest updates and announcements",
        Icons.Outlined.AlternateEmail, Color(0xFFE7E9EA), "https://example.com/twitter"),
    SocialPlatform("Reddit", "Join discussions and share feedback with our Reddit community",
        Icons.Outlined.Forum, Color(0xFFFF4500), "https://example.com/reddit"),
    SocialPlatform("Instagram", "Follow us on Instagram for behind-the-scenes content and updates",
        Icons.Outlined.CameraAlt, Color(0xFFE4405F), "https://example.com/instagram")
)

@Composable
fun CommunityScreen(nav: NavHostController) {
    val context = LocalContext.current

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
                "Join Our Community",
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.ExtraBold,
                color = AppColors.TextPrimary
            )
            Spacer(Modifier.height(6.dp))
            Text(
                "Connect with us on your favorite platforms. Get updates, share feedback, and be part of the PrintReady AI community.",
                style = MaterialTheme.typography.bodyMedium,
                color = AppColors.TextSecondary
            )
        }

        Spacer(Modifier.height(24.dp))

        // Social cards
        Column(
            modifier = Modifier.padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            platforms.forEach { platform ->
                SocialCard(platform) {
                    // Placeholder: links are not wired in the new app yet.
                    android.widget.Toast.makeText(context, "Link placeholder: " + platform.name, android.widget.Toast.LENGTH_SHORT).show()
                }
            }
        }

        Spacer(Modifier.height(32.dp))

        // Footer -> Contact Us
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                "Have questions or want to get in touch directly?",
                style = MaterialTheme.typography.bodyMedium,
                color = AppColors.TextSecondary
            )
            Spacer(Modifier.height(12.dp))
            Button(onClick = { nav.navigate(Routes.CONTACT) }) {
                Text("Contact Us", fontWeight = FontWeight.SemiBold)
            }
        }
    }
}

@Composable
private fun SocialCard(platform: SocialPlatform, onClick: () -> Unit) {
    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = AppColors.Surface),
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(46.dp)
                    .clip(RoundedCornerShape(14.dp))
                    .background(platform.brandColor.copy(alpha = 0.15f)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    platform.icon,
                    contentDescription = platform.name,
                    tint = platform.brandColor,
                    modifier = Modifier.size(24.dp)
                )
            }
            Spacer(Modifier.width(14.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(platform.name, style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.SemiBold, color = AppColors.TextPrimary)
                Spacer(Modifier.height(2.dp))
                Text(platform.tagline, style = MaterialTheme.typography.bodySmall, color = AppColors.TextSecondary)
            }
            Icon(
                Icons.AutoMirrored.Outlined.ArrowForwardIos,
                contentDescription = null,
                tint = AppColors.TextSecondary.copy(alpha = 0.5f),
                modifier = Modifier.size(16.dp)
            )
        }
    }
}
