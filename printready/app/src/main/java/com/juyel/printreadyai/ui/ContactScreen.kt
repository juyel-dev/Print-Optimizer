package com.juyel.printreadyai.ui

import android.content.Intent
import android.net.Uri
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

private val brandGradient = listOf(Color(0xFFA855F7), Color(0xFFEC4899))

private data class ContactItem(
    val icon: ImageVector,
    val title: String,
    val subtitle: String,
    val color: Color,
    val action: () -> Unit
)

private data class SocialItem(
    val name: String,
    val icon: ImageVector,
    val color: Color
)

@Composable
fun ContactScreen(nav: NavHostController) {
    val context = LocalContext.current
    
    val phone = "8597514472"
    val email = "myself.juyel.dev@gmail.com"
    
    val contactItems = listOf(
        ContactItem(
            icon = Icons.Outlined.Phone,
            title = "Call Us",
            subtitle = phone,
            color = Color(0xFF22C55E),
            action = {
                val intent = Intent(Intent.ACTION_DIAL).apply {
                    data = Uri.parse("tel:$phone")
                }
                runCatching { context.startActivity(intent) }
            }
        ),
        ContactItem(
            icon = Icons.Outlined.Whatsapp,
            title = "WhatsApp",
            subtitle = phone,
            color = Color(0xFF25D366),
            action = {
                val intent = Intent(Intent.ACTION_VIEW).apply {
                    data = Uri.parse("https://wa.me/91$phone")
                }
                runCatching { 
                    context.startActivity(intent) 
                }.onFailure {
                    Toast.makeText(context, "WhatsApp not installed", Toast.LENGTH_SHORT).show()
                }
            }
        ),
        ContactItem(
            icon = Icons.Outlined.Email,
            title = "Email Us",
            subtitle = email,
            color = Color(0xFFEA4335),
            action = {
                val intent = Intent(Intent.ACTION_SENDTO).apply {
                    data = Uri.parse("mailto:$email")
                    putExtra(Intent.EXTRA_SUBJECT, "PrintReady AI Support")
                }
                runCatching { context.startActivity(intent) }
            }
        )
    )
    
    val socialItems = listOf(
        SocialItem("Instagram", Icons.Outlined.Instagram, Color(0xFFE1306C)),
        SocialItem("X (Twitter)", Icons.Outlined.Share, Color(0xFF1DA1F2)),
        SocialItem("Telegram", Icons.Outlined.Send, Color(0xFF0088CC))
    )
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AppColors.Bg)
            .verticalScroll(rememberScrollState())
    ) {
        // Top bar
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { nav.navigateUp() }) {
                Icon(Icons.AutoMirrored.Outlined.ArrowBack, "Back", tint = AppColors.TextPrimary)
            }
            Spacer(Modifier.width(4.dp))
            Text(
                "Contact Us",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = AppColors.TextPrimary
            )
        }
        
        // Hero section
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp, vertical = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .clip(CircleShape)
                    .background(Brush.linearGradient(brandGradient)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    Icons.Outlined.SupportAgent,
                    null,
                    tint = Color.White,
                    modifier = Modifier.size(40.dp)
                )
            }
            
            Spacer(Modifier.height(16.dp))
            
            Text(
                "Get in Touch",
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold,
                color = AppColors.TextPrimary
            )
            
            Spacer(Modifier.height(8.dp))
            
            Text(
                "We're here to help! Reach out through any of the channels below.",
                style = MaterialTheme.typography.bodyMedium,
                color = AppColors.TextSecondary,
                modifier = Modifier.padding(horizontal = 16.dp)
            )
        }
        
        Spacer(Modifier.height(24.dp))
        
        // Contact methods
        Text(
            "Contact Methods",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.SemiBold,
            color = AppColors.TextPrimary,
            modifier = Modifier.padding(horizontal = 20.dp, vertical = 8.dp)
        )
        
        Column(
            modifier = Modifier.padding(horizontal = 20.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            contactItems.forEach { item ->
                ContactCard(item)
            }
        }
        
        Spacer(Modifier.height(32.dp))
        
        // Social links
        Text(
            "Follow Us",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.SemiBold,
            color = AppColors.TextPrimary,
            modifier = Modifier.padding(horizontal = 20.dp, vertical = 8.dp)
        )
        
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            socialItems.forEach { social ->
                SocialCard(social) {
                    Toast.makeText(context, "Coming soon!", Toast.LENGTH_SHORT).show()
                }
            }
        }
        
        Spacer(Modifier.height(32.dp))
        
        // Business hours
        Card(
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = AppColors.Surface),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        ) {
            Column(
                modifier = Modifier.padding(20.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        Icons.Outlined.Schedule,
                        null,
                        tint = AppColors.Accent,
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(Modifier.width(8.dp))
                    Text(
                        "Business Hours",
                        style = MaterialTheme.typography.titleSmall,
                        fontWeight = FontWeight.Bold,
                        color = AppColors.TextPrimary
                    )
                }
                
                Spacer(Modifier.height(4.dp))
                
                HoursRow("Monday - Friday", "9:00 AM - 6:00 PM")
                HoursRow("Saturday", "10:00 AM - 4:00 PM")
                HoursRow("Sunday", "Closed")
            }
        }
        
        Spacer(Modifier.height(40.dp))
    }
}

@Composable
private fun ContactCard(item: ContactItem) {
    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = AppColors.Surface),
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = item.action)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(56.dp)
                    .clip(CircleShape)
                    .background(item.color.copy(alpha = 0.15f)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    item.icon,
                    null,
                    tint = item.color,
                    modifier = Modifier.size(28.dp)
                )
            }
            
            Spacer(Modifier.width(16.dp))
            
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    item.title,
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold,
                    color = AppColors.TextPrimary
                )
                Spacer(Modifier.height(2.dp))
                Text(
                    item.subtitle,
                    style = MaterialTheme.typography.bodyMedium,
                    color = AppColors.TextSecondary
                )
            }
            
            Icon(
                Icons.Outlined.ChevronRight,
                null,
                tint = AppColors.TextSecondary,
                modifier = Modifier.size(24.dp)
            )
        }
    }
}

@Composable
private fun SocialCard(social: SocialItem, onClick: () -> Unit) {
    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = AppColors.Surface),
        modifier = Modifier
            .weight(1f)
            .height(100.dp)
            .clickable(onClick = onClick)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .background(social.color.copy(alpha = 0.15f)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    social.icon,
                    null,
                    tint = social.color,
                    modifier = Modifier.size(20.dp)
                )
            }
            Spacer(Modifier.height(8.dp))
            Text(
                social.name,
                style = MaterialTheme.typography.labelMedium,
                fontWeight = FontWeight.SemiBold,
                color = AppColors.TextPrimary
            )
        }
    }
}

@Composable
private fun HoursRow(day: String, time: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            day,
            style = MaterialTheme.typography.bodyMedium,
            color = AppColors.TextSecondary
        )
        Text(
            time,
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.SemiBold,
            color = AppColors.TextPrimary
        )
    }
}
