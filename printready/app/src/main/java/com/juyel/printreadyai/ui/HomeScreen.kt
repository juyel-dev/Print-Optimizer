package com.juyel.printreadyai.ui

import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.juyel.printreadyai.ui.sponsor.SponsorCarousel

private val brandGradient = listOf(Color(0xFFA855F7), Color(0xFFEC4899))

@Composable
fun HomeScreen(nav: NavHostController) {
    val scrollState = rememberScrollState()
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(top = 80.dp, bottom = 24.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        // Hero section
        HeroSection()
        
        // Product containers
        ProductContainers(nav)
        
        // Trust badges
        TrustBadges()
    }
}

@Composable
private fun HeroSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        // App name with gradient
        Text(
            text = "PrintReady AI",
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.ExtraBold,
            color = AppColors.Accent,
            modifier = Modifier.fillMaxWidth()
        )
        
        // Tagline
        Text(
            text = "Reimagining the Document Processing Experience",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = AppColors.TextSecondary,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Composable
private fun ProductContainers(nav: NavHostController) {
    Column(
        modifier = Modifier.padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        ProductContainer(
            title = "FLOW",
            subtitle = "AI-Powered Document Enhancement",
            icon = Icons.Outlined.AutoFixHigh,
            gradient = brandGradient,
            onClick = { nav.navigate(Routes.FLOW) },
            showCarousel = true,
            carouselPrefix = "flow",
            fallbackDrawable = com.juyel.printreadyai.R.drawable.sponsor_flow
        )
        
        ProductContainer(
            title = "AI",
            subtitle = "Smart Document Processing",
            icon = Icons.Outlined.SmartToy,
            color = Color(0xFF5A2A2B),
            onClick = { nav.navigate("ai") },
            showCarousel = true,
            carouselPrefix = "ai",
            fallbackDrawable = com.juyel.printreadyai.R.drawable.sponsor_ai
        )
        
        ProductContainer(
            title = "TOOLS",
            subtitle = "PDF & Document Utilities",
            icon = Icons.Outlined.Build,
            color = Color(0xFF75A2B),
            onClick = { nav.navigate(Routes.TOOLS) },
            showCarousel = true,
            carouselPrefix = "tools",
            fallbackDrawable = com.juyel.printreadyai.R.drawable.sponsor_tools
        )
    }
}

@Composable
private fun ProductContainer(
    title: String,
    subtitle: String,
    icon: ImageVector,
    gradient: List<Color>? = null,
    color: Color? = null,
    onClick: () -> Unit,
    showCarousel: Boolean = false,
    carouselPrefix: String? = null,
    @androidx.annotation.DrawableRes fallbackDrawable: Int = 0
) {
    var isPressed by remember { mutableStateOf(false) }
    val scale by animateFloatAsState(
        targetValue = if (isPressed) 0.98f else 1.0f,
        animationSpec = spring(stiffness = Spring.StiffnessDefault, dampingRatio = 0.0f),
        label = "card_scale"
    )
    
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(
                if (gradient != null) Brush.linearGradient(gradient)
                else color!!.copy(alpha = 0.6f)
            )
            .border(
                width = 1.dp,
                color = AppColors.Accent.copy(alpha = 0.25f),
                shape = RoundedCornerShape(16.dp)
            )
            .scale(scale)
    ) {
        // Header row (clickable to navigate)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .pointerInput(Unit) {
                    detectTapGestures(
                        onPress = {
                            isPressed = true
                            tryAwaitRelease()
                            isPressed = false
                        },
                        onTap = { onClick() }
                    )
                }
                .padding(20.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    icon,
                    contentDescription = title,
                    tint = Color.White,
                    modifier = Modifier.size(48.dp)
                )
                
                Spacer(Modifier.width(16.dp))
                
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = title,
                        style = MaterialTheme.typography.headlineMedium,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.White
                    )
                    
                    Spacer(Modifier.height(4.dp))
                    
                    Text(
                        text = subtitle,
                        style = MaterialTheme.typography.bodyMedium,
                        color = Color.White.copy(alpha = 0.9f)
                    )
                }
                
                Icon(
                    Icons.Outlined.ChevronRight,
                    contentDescription = "Navigate",
                    tint = Color.White.copy(alpha = 0.7f),
                    modifier = Modifier.size(32.dp)
                )
            }
        }
        
        // Sponsor carousel (below header, inside the card)
        if (showCarousel && carouselPrefix != null && fallbackDrawable != 0) {
            SponsorCarousel(
                prefix = carouselPrefix,
                fallbackDrawable = fallbackDrawable,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp)
            )
        }
    }
}

@Composable
private fun TrustBadges() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        TrustBadge(
            icon = Icons.Outlined.Security,
            title = "100% Secure",
            subtitle = "Processed Locally"
        )
        
        TrustBadge(
            icon = Icons.Outlined.FlashOn,
            title = "Lightning Fast",
            subtitle = "Offline Capabilities"
        )
    }
}

@Composable
private fun TrustBadge(icon: ImageVector, title: String, subtitle: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Box(
            modifier = Modifier
                .size(40.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(Brush.linearGradient(brandGradient).copy(alpha = 0.15f)),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                icon,
                contentDescription = title,
                tint = AppColors.Accent,
                modifier = Modifier.size(24.dp)
            )
        }
        
        Column {
            Text(
                text = title,
                style = MaterialTheme.typography.labelMedium,
                fontWeight = FontWeight.Bold,
                color = AppColors.TextPrimary
            )
            
            Text(
                text = subtitle,
                style = MaterialTheme.typography.labelSmall,
                color = AppColors.TextSecondary
            )
        }
    }
}
