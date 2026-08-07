package com.juyel.printreadyai.ui

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
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
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.AutoFixHigh
import androidx.compose.material.icons.outlined.Download
import androidx.compose.material.icons.outlined.GridView
import androidx.compose.material.icons.outlined.Memory
import androidx.compose.material.icons.outlined.UploadFile
import androidx.compose.material.icons.outlined.Visibility
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
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

private val BrandPurple = Color(0xFFA855F7)
private val BrandIndigo = Color(0xFF6366F1)
private val FreeGreenA = Color(0xFF22C55E)
private val FreeGreenB = Color(0xFF059669)
private val BrandGradient = listOf(BrandPurple, BrandIndigo)

private data class Step(val icon: ImageVector, val title: String, val subtitle: String)

private val steps = listOf(
    Step(Icons.Outlined.UploadFile, "Upload PDF", "No server upload required."),
    Step(Icons.Outlined.Visibility, "Preview & Edit", "Select pages to keep."),
    Step(Icons.Outlined.AutoFixHigh, "Enhance", "Invert colors & clean background."),
    Step(Icons.Outlined.GridView, "Layout", "Multiple slides per page."),
    Step(Icons.Outlined.Memory, "Process", "Local on-device processing."),
    Step(Icons.Outlined.Download, "Download", "Print-ready PDF.")
)

private val features = listOf(
    "Lightning Fast", "Complete Privacy",
    "Print-Optimized", "No Installation",
    "Save Ink & Paper", "100% Free"
)

@Composable
fun LandingScreen(nav: NavHostController) {
    val transition = rememberInfiniteTransition(label = "landing")
    val pulse by transition.animateFloat(
        initialValue = 1f,
        targetValue = 1.03f,
        animationSpec = infiniteRepeatable(tween(1200, easing = LinearEasing), RepeatMode.Reverse),
        label = "pulse"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .statusBarsPadding()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(Modifier.height(8.dp))
        Row(Modifier.fillMaxWidth()) {
            Icon(
                Icons.Outlined.ArrowBack, "Back",
                tint = AppColors.TextSecondary,
                modifier = Modifier
                    .size(38.dp)
                    .clip(CircleShape)
                    .background(AppColors.Surface)
                    .clickable { nav.navigateUp() }
                    .padding(8.dp)
            )
        }
        Spacer(Modifier.height(20.dp))
        FreeForeverBadge()
        Spacer(Modifier.height(14.dp))
        AIBadge()
        Spacer(Modifier.height(26.dp))
        Text(
            text = buildAnnotatedString {
                withStyle(SpanStyle(color = Color.White)) { append("Make Your Notes\n") }
                withStyle(SpanStyle(brush = Brush.linearGradient(BrandGradient))) { append("Printable") }
            },
            fontSize = 42.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            lineHeight = 48.sp
        )
        Spacer(Modifier.height(26.dp))
        StartProcessingButton(pulse) { nav.navigate(Routes.FLOW_UPLOAD) }
        Spacer(Modifier.height(48.dp))
        ShowcaseCard()
        Spacer(Modifier.height(32.dp))
        Text(
            "How It Works",
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(Modifier.height(18.dp))
        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
            steps.forEach { StepItem(it) }
        }
        Spacer(Modifier.height(32.dp))
        Text(
            "Why Choose Us?",
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(Modifier.height(18.dp))
        for (rowStart in features.indices step 2) {
            Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                FeatureChip(features[rowStart], Modifier.weight(1f))
                FeatureChip(features[rowStart + 1], Modifier.weight(1f))
            }
            if (rowStart < features.size - 2) Spacer(Modifier.height(12.dp))
        }
        Spacer(Modifier.height(40.dp))
    }
}

@Composable
private fun FreeForeverBadge() {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(50))
            .background(Brush.horizontalGradient(listOf(FreeGreenA, FreeGreenB)))
            .padding(horizontal = 18.dp, vertical = 8.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Filled.Favorite, null, tint = Color.White, modifier = Modifier.size(16.dp))
            Spacer(Modifier.width(8.dp))
            Text("Free Forever", style = MaterialTheme.typography.labelLarge,
                fontWeight = FontWeight.Bold, color = Color.White)
        }
    }
}

@Composable
private fun AIBadge() {
    Box(
        modifier = Modifier
            .shadow(12.dp, RoundedCornerShape(50))
            .clip(RoundedCornerShape(50))
            .background(Brush.linearGradient(BrandGradient))
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Text("AI-Inspired Document Processing",
            style = MaterialTheme.typography.bodyMedium,
            color = Color.White.copy(alpha = 0.95f))
    }
}

@Composable
private fun StartProcessingButton(pulse: Float, onClick: () -> Unit) {
    val interactionSource = remember { MutableInteractionSource() }
    val pressed by interactionSource.collectIsPressedAsState()
    val scale by animateFloatAsState(if (pressed) 0.96f else pulse, label = "pulse_scale")
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .scale(scale)
            .shadow(16.dp, RoundedCornerShape(16.dp))
            .clip(RoundedCornerShape(16.dp))
            .background(Brush.horizontalGradient(BrandGradient))
            .clickable(interactionSource = interactionSource, indication = null, onClick = onClick)
            .padding(horizontal = 22.dp, vertical = 16.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Outlined.UploadFile, null, tint = Color.White, modifier = Modifier.size(24.dp))
            Spacer(Modifier.width(12.dp))
            Text("Start Processing", style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold, color = Color.White)
            Spacer(Modifier.weight(1f))
            Icon(Icons.AutoMirrored.Filled.ArrowForward, null, tint = Color.White, modifier = Modifier.size(20.dp))
        }
    }
}

@Composable
private fun ShowcaseCard() {
    Box(
        modifier = Modifier
            .fillMaxWidth(0.9f)
            .aspectRatio(1.7778f)
            .clip(RoundedCornerShape(24.dp))
            .background(Brush.linearGradient(listOf(Color(0xFF201533), Color(0xFF3B2C55), Color(0xFF16223A))))
            .border(1.dp, Brush.linearGradient(listOf(BrandPurple.copy(alpha = 0.3f), Color.Transparent)),
                RoundedCornerShape(24.dp)),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Box(
                modifier = Modifier
                    .size(56.dp)
                    .clip(CircleShape)
                    .background(Brush.linearGradient(BrandGradient)),
                contentAlignment = Alignment.Center
            ) {
                Icon(Icons.Outlined.AutoFixHigh, null, tint = Color.White, modifier = Modifier.size(26.dp))
            }
            Spacer(Modifier.height(14.dp))
            Text("Dark PDF \u2192 Print-Ready Notes", color = Color.White,
                fontWeight = FontWeight.SemiBold, fontSize = 15.sp)
            Spacer(Modifier.height(4.dp))
            Text("Invert \u00b7 Clean \u00b7 Layout \u00b7 Export",
                color = Color.White.copy(alpha = 0.6f), fontSize = 12.sp)
        }
    }
}

@Composable
private fun StepItem(step: Step) {
    GlassCard(Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(42.dp)
                    .clip(CircleShape)
                    .background(Brush.linearGradient(BrandGradient)),
                contentAlignment = Alignment.Center
            ) {
                Icon(step.icon, null, tint = Color.White, modifier = Modifier.size(20.dp))
            }
            Spacer(Modifier.width(14.dp))
            Column {
                Text(step.title, fontWeight = FontWeight.Bold, color = Color.White, fontSize = 15.sp)
                Spacer(Modifier.height(2.dp))
                Text(step.subtitle, color = AppColors.TextSecondary, fontSize = 13.sp)
            }
        }
    }
}

@Composable
private fun FeatureChip(label: String, modifier: Modifier) {
    GlassCard(modifier) {
        Box(Modifier.padding(horizontal = 10.dp, vertical = 14.dp), contentAlignment = Alignment.Center) {
            Text(label, color = Color.White, fontWeight = FontWeight.SemiBold,
                fontSize = 13.sp, textAlign = TextAlign.Center)
        }
    }
}

@Composable
private fun GlassCard(modifier: Modifier, content: @Composable () -> Unit) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(16.dp))
            .background(Color.White.copy(alpha = 0.05f))
            .border(1.dp, Color.White.copy(alpha = 0.08f), RoundedCornerShape(16.dp))
    ) {
        content()
    }
}
