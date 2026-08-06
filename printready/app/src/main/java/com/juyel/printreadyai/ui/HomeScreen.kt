package com.juyel.printreadyai.ui

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Build
import androidx.compose.material.icons.outlined.FlashOn
import androidx.compose.material.icons.outlined.Note
import androidx.compose.material.icons.outlined.PlayCircle
import androidx.compose.material.icons.outlined.Print
import androidx.compose.material.icons.outlined.Security
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(nav: NavHostController) {
    val scrollState = rememberScrollState()
    val brandGradient = Brush.linearGradient(
        listOf(Color(0xFFA855F7), Color(0xFFEC4899))
    )
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .statusBarsPadding()
            .verticalScroll(scrollState)
            .padding(top = 80.dp)
    ) {
        Box(modifier = Modifier.fillMaxWidth().padding(horizontal = 24.dp, vertical = 16.dp)) {
            Icon(
                imageVector = Icons.Outlined.Print,
                contentDescription = "Prints",
                tint = MaterialTheme.colorScheme.onBackground,
                modifier = Modifier.align(Alignment.CenterEnd).size(28.dp).clickable { nav.navigate(Routes.MY_ORDERS) }
            )
        }

        Column(modifier = Modifier.padding(horizontal = 24.dp)) {
            Text(
                text = "PrintReady AI",
                fontSize = 40.sp,
                fontWeight = FontWeight.ExtraBold,
                brush = brandGradient,
                lineHeight = 44.sp
            )
            Spacer(Modifier.height(12.dp))
            Text(
                text = "Reimagining the Student\nLearning Experience",
                style = MaterialTheme.typography.titleMedium,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onBackground
            )
        }

        Spacer(Modifier.height(40.dp))

        Column(
            modifier = Modifier.padding(horizontal = 24.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            ProductContainer(
                title = "FLOW",
                subtitle = "AI-Inspired Document Processing",
                accentBrush = brandGradient,
                icon = Icons.Outlined.PlayCircle,
                onClick = { nav.navigate(Routes.FLOW) }
            )
            ProductContainer(
                title = "PRINTS",
                subtitle = "Notebook Print Orders",
                accentColor = Color(0xFF5A2A2B),
                icon = Icons.Outlined.Note,
                onClick = { nav.navigate(Routes.PRINTS) }
            )
            ProductContainer(
                title = "TOOLS",
                subtitle = "Quick PDF Utilities",
                accentColor = Color(0xFF2E4057),
                icon = Icons.Outlined.Build,
                onClick = { nav.navigate(Routes.TOOLS) }
            )
        }

        Spacer(Modifier.height(40.dp))

        Row(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 24.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            TrustBadge(
                icon = Icons.Outlined.Security,
                title = "100% Secure",
                subtitle = "Processed Locally",
                modifier = Modifier.weight(1f)
            )
            TrustBadge(
                icon = Icons.Outlined.FlashOn,
                title = "Lightning Fast",
                subtitle = "Offline Capabilities",
                modifier = Modifier.weight(1f)
            )
        }

        Spacer(Modifier.height(40.dp))
    }
}

@Composable
private fun ProductContainer(
    title: String,
    subtitle: String,
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    onClick: () -> Unit,
    accentBrush: Brush? = null,
    accentColor: Color = Color.Transparent
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()
    val scale by animateFloatAsState(if (isPressed) 0.98f else 1.0f, label = "card_scale")

    val borderBrush = accentBrush ?: Brush.linearGradient(listOf(accentColor.copy(alpha = 0.25f), accentColor.copy(alpha = 0.25f)))
    
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .scale(scale)
            .clip(RoundedCornerShape(16.dp))
            .background(if (accentBrush != null) Color.White.copy(alpha = 0.05f) else accentColor.copy(alpha = 0.1f))
            .border(1.dp, borderBrush, RoundedCornerShape(16.dp))
            .clickable(interactionSource = interactionSource, indication = null, onClick = onClick)
            .padding(20.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = icon,
                contentDescription = title,
                tint = if (accentBrush != null) Color.White else accentColor,
                modifier = Modifier.size(32.dp)
            )
            Spacer(Modifier.size(16.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = title,
                    style = MaterialTheme.typography.headlineMedium,
                    fontWeight = FontWeight.ExtraBold,
                    color = if (accentBrush != null) Color.White else accentColor
                )
                Text(
                    text = subtitle,
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.7f)
                )
            }
        }
    }
}

@Composable
private fun TrustBadge(icon: androidx.compose.ui.graphics.vector.ImageVector, title: String, subtitle: String, modifier: Modifier = Modifier) {
    val brandGradient = Brush.linearGradient(listOf(Color(0xFFA855F7), Color(0xFFEC4899)))
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Box(
            modifier = Modifier
                .size(24.dp)
                .clip(CircleShape)
                .background(brandGradient),
            contentAlignment = Alignment.Center
        ) {
            Icon(icon, contentDescription = title, tint = Color.White, modifier = Modifier.size(14.dp))
        }
        Column {
            Text(title, style = MaterialTheme.typography.labelMedium, fontWeight = FontWeight.Bold, color = MaterialTheme.colorScheme.onBackground)
            Text(subtitle, style = MaterialTheme.typography.labelSmall, color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.6f))
        }
    }
}
