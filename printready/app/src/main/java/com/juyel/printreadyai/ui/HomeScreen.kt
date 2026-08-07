package com.juyel.printreadyai.ui

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.AccountTree
import androidx.compose.material.icons.outlined.AllInclusive
import androidx.compose.material.icons.outlined.AutoAwesome
import androidx.compose.material.icons.outlined.AutoFixHigh
import androidx.compose.material.icons.outlined.Bolt
import androidx.compose.material.icons.outlined.Brush
import androidx.compose.material.icons.outlined.Build
import androidx.compose.material.icons.outlined.Compress
import androidx.compose.material.icons.outlined.ContentCut
import androidx.compose.material.icons.outlined.Crop
import androidx.compose.material.icons.outlined.FilterNone
import androidx.compose.material.icons.outlined.GridView
import androidx.compose.material.icons.outlined.MergeType
import androidx.compose.material.icons.outlined.NewReleases
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Print
import androidx.compose.material.icons.outlined.RotateRight
import androidx.compose.material.icons.outlined.Security
import androidx.compose.material.icons.outlined.SwapHoriz
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import kotlinx.coroutines.delay

// ---------- Brand ----------
private val brandGradient = listOf(Color(0xFFA855F7), Color(0xFF6366F1))

// ---------- Data ----------
private data class Banner(val title: String, val subtitle: String, val icon: ImageVector, val colors: List<Color>)

private val banners = listOf(
    Banner("Print Smarter, Save Paper", "Optimize every page before you print", Icons.Outlined.Print,
        listOf(Color(0xFF7C3AED), Color(0xFF6366F1))),
    Banner("AI-Powered Print Optimization", "Clean, ink-friendly output in seconds", Icons.Outlined.AutoFixHigh,
        listOf(Color(0xFF2BA8A0), Color(0xFF22C55E))),
    Banner("100% Private • Free Forever", "Everything stays on your device", Icons.Outlined.Security,
        listOf(Color(0xFFF59E0B), Color(0xFFEF4444)))
)

private data class ToolItem(val name: String, val icon: ImageVector)

private val popularTools = listOf(
    ToolItem("Merge PDF", Icons.Outlined.MergeType),
    ToolItem("Split PDF", Icons.Outlined.ContentCut),
    ToolItem("Compress PDF", Icons.Outlined.Compress),
    ToolItem("Crop Pages", Icons.Outlined.Crop),
    ToolItem("Rotate Pages", Icons.Outlined.RotateRight),
    ToolItem("Extract Pages", Icons.Outlined.FilterNone),
    ToolItem("Image ↔ PDF", Icons.Outlined.SwapHoriz),
    ToolItem("Watermark", Icons.Outlined.Brush)
)

private data class NewsItem(val icon: ImageVector, val title: String, val desc: String)

private val whatsNew = listOf(
    NewsItem(Icons.Outlined.NewReleases, "New Tool Added", "Watermark support is here"),
    NewsItem(Icons.Outlined.Bolt, "Faster Processing", "Up to 2x faster engine"),
    NewsItem(Icons.Outlined.AutoAwesome, "Better AI Suggestions", "Smarter print optimization"),
    NewsItem(Icons.Outlined.Build, "Bug Fixes", "Smoother, more stable app")
)

private data class TrustItem(val icon: ImageVector, val title: String)

private val trustItems = listOf(
    TrustItem(Icons.Outlined.Security, "Private Processing"),
    TrustItem(Icons.Outlined.Bolt, "Fast Performance"),
    TrustItem(Icons.Outlined.Print, "Print Ready Output"),
    TrustItem(Icons.Outlined.AllInclusive, "Free Forever")
)

// ---------- Screen ----------
@Composable
fun HomeScreen(nav: NavHostController) {
    var currentBanner by remember { mutableStateOf(0) }

    // Auto-scroll every 4.5s
    LaunchedEffect(Unit) {
        while (true) {
            delay(4500)
            currentBanner = (currentBanner + 1) % banners.size
        }
    }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        contentPadding = PaddingValues(bottom = 24.dp)
    ) {
        item { HomeHeader(nav) }
        item {
            HeroBanner(
                current = currentBanner,
                onNext = { currentBanner = (currentBanner + 1) % banners.size },
                onPrev = { currentBanner = (currentBanner - 1 + banners.size) % banners.size }
            )
        }
        item { BannerDots(currentBanner) }
        item { ChipNav(nav) }
        item { SectionHeader("Popular Tools", action = "View All →") { nav.navigate(Routes.soon("Tools")) } }
        item {
            LazyRow(
                contentPadding = PaddingValues(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(popularTools) { tool ->
                    PopularToolCard(tool) { nav.navigate(Routes.soon(tool.name)) }
                }
            }
        }
        item { SectionHeader("What's New") }
        item {
            LazyRow(
                contentPadding = PaddingValues(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(whatsNew) { news -> NewsCard(news) }
            }
        }
        item { Spacer(Modifier.height(16.dp)) }
        item { TrustCard() }
    }
}

// ---------- 1. Header ----------
@Composable
private fun HomeHeader(nav: NavHostController) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(Brush.linearGradient(brandGradient)),
            contentAlignment = Alignment.Center
        ) {
            Icon(Icons.Outlined.Print, null, tint = Color.White, modifier = Modifier.size(20.dp))
        }
        Spacer(Modifier.width(10.dp))
        Text(
            "PrintReady AI",
            fontSize = 19.sp,
            fontWeight = FontWeight.Bold,
            brush = Brush.linearGradient(brandGradient)
        )
        Spacer(Modifier.weight(1f))
        HeaderIconButton(Icons.Outlined.Notifications) { nav.navigate(Routes.soon("Notifications")) }
        Spacer(Modifier.width(8.dp))
        HeaderIconButton(Icons.Outlined.AccountCircle) { nav.navigate(Routes.soon("Profile")) }
    }
}

@Composable
private fun HeaderIconButton(icon: ImageVector, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .size(38.dp)
            .clip(CircleShape)
            .background(AppColors.Surface)
            .clickable(onClick = onClick),
        contentAlignment = Alignment.Center
    ) {
        Icon(icon, null, tint = AppColors.TextSecondary, modifier = Modifier.size(20.dp))
    }
}

// ---------- 2. Hero Banner ----------
@Composable
private fun HeroBanner(current: Int, onNext: () -> Unit, onPrev: () -> Unit) {
    var dragAccum by remember { mutableStateOf(0f) }
    Crossfade(targetState = current) { index ->
        val banner = banners[index]
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .height(150.dp)
                .clip(RoundedCornerShape(20.dp))
                .background(Brush.linearGradient(banner.colors))
                .pointerInput(Unit) {
                    detectHorizontalDragGestures(
                        onDragEnd = {
                            if (dragAccum < -60) onNext()
                            else if (dragAccum > 60) onPrev()
                            dragAccum = 0f
                        },
                        onDragCancel = { dragAccum = 0f },
                        onHorizontalDrag = { _, dragAmount -> dragAccum += dragAmount }
                    )
                }
                .padding(20.dp)
        ) {
            Icon(
                banner.icon, null,
                tint = Color.White.copy(alpha = 0.22f),
                modifier = Modifier.size(72.dp).align(Alignment.TopEnd)
            )
            Column(Modifier.align(Alignment.BottomStart)) {
                Text(banner.title, fontSize = 19.sp, fontWeight = FontWeight.Bold, color = Color.White)
                Spacer(Modifier.height(4.dp))
                Text(banner.subtitle, fontSize = 13.sp, color = Color.White.copy(alpha = 0.85f))
            }
        }
    }
}

@Composable
private fun BannerDots(current: Int) {
    Row(
        modifier = Modifier.fillMaxWidth().padding(top = 12.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        banners.indices.forEach { i ->
            val active = i == current
            Box(
                modifier = Modifier
                    .height(6.dp)
                    .width(if (active) 18.dp else 6.dp)
                    .clip(CircleShape)
                    .background(if (active) AppColors.Accent else AppColors.TextSecondary.copy(alpha = 0.3f))
            )
            if (i < banners.size - 1) Spacer(Modifier.width(6.dp))
        }
    }
}

// ---------- 3. Chip Navigation ----------
@Composable
private fun ChipNav(nav: NavHostController) {
    Row(
        modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 14.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        NavChip(Icons.Outlined.AccountTree, "Workflow", Modifier.weight(1f)) { nav.navigate(Routes.FLOW) }
        NavChip(Icons.Outlined.AutoFixHigh, "AI", Modifier.weight(1f)) { nav.navigate(Routes.soon("AI")) }
        NavChip(Icons.Outlined.GridView, "Tools", Modifier.weight(1f)) { nav.navigate(Routes.soon("Tools")) }
    }
}

@Composable
private fun NavChip(icon: ImageVector, label: String, modifier: Modifier, onClick: () -> Unit) {
    Surface(
        shape = RoundedCornerShape(14.dp),
        color = AppColors.Surface,
        modifier = modifier.clickable(onClick = onClick)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth().padding(vertical = 12.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(icon, null, tint = AppColors.Accent, modifier = Modifier.size(22.dp))
            Spacer(Modifier.height(6.dp))
            Text(label, fontSize = 12.sp, fontWeight = FontWeight.SemiBold, color = AppColors.TextPrimary)
        }
    }
}

// ---------- Section header ----------
@Composable
private fun SectionHeader(title: String, action: String? = null, onAction: (() -> Unit)? = null) {
    Row(
        modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(title, style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.SemiBold, color = AppColors.TextPrimary)
        Spacer(Modifier.weight(1f))
        if (action != null) {
            Text(
                action,
                fontSize = 13.sp,
                fontWeight = FontWeight.SemiBold,
                color = AppColors.Accent,
                modifier = Modifier.clickable(enabled = onAction != null, onClick = { onAction?.invoke() })
            )
        }
    }
}

// ---------- 4. Popular Tools ----------
@Composable
private fun PopularToolCard(tool: ToolItem, onClick: () -> Unit) {
    Column(
        modifier = Modifier
            .width(88.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(AppColors.Surface)
            .clickable(onClick = onClick)
            .padding(vertical = 14.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(AppColors.Accent.copy(alpha = 0.14f)),
            contentAlignment = Alignment.Center
        ) {
            Icon(tool.icon, null, tint = AppColors.Accent, modifier = Modifier.size(20.dp))
        }
        Spacer(Modifier.height(8.dp))
        Text(
            tool.name,
            fontSize = 11.sp,
            fontWeight = FontWeight.Medium,
            color = AppColors.TextPrimary,
            textAlign = TextAlign.Center,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.padding(horizontal = 6.dp)
        )
    }
}

// ---------- 5. What's New ----------
@Composable
private fun NewsCard(item: NewsItem) {
    Column(
        modifier = Modifier
            .width(172.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(AppColors.Surface)
            .padding(14.dp)
    ) {
        Box(
            modifier = Modifier
                .size(36.dp)
                .clip(CircleShape)
                .background(AppColors.Accent.copy(alpha = 0.14f)),
            contentAlignment = Alignment.Center
        ) {
            Icon(item.icon, null, tint = AppColors.Accent, modifier = Modifier.size(18.dp))
        }
        Spacer(Modifier.height(10.dp))
        Text(item.title, fontSize = 13.sp, fontWeight = FontWeight.SemiBold, color = AppColors.TextPrimary)
        Spacer(Modifier.height(3.dp))
        Text(item.desc, fontSize = 12.sp, color = AppColors.TextSecondary)
    }
}

// ---------- 6. Trust Card ----------
@Composable
private fun TrustCard() {
    Card(
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = AppColors.Surface),
        modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp)
    ) {
        Column(Modifier.padding(18.dp)) {
            Text("Why PrintReady AI?", style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Bold, color = AppColors.TextPrimary)
            Spacer(Modifier.height(14.dp))
            Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                TrustRow(trustItems[0], Modifier.weight(1f))
                TrustRow(trustItems[1], Modifier.weight(1f))
            }
            Spacer(Modifier.height(12.dp))
            Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                TrustRow(trustItems[2], Modifier.weight(1f))
                TrustRow(trustItems[3], Modifier.weight(1f))
            }
        }
    }
}

@Composable
private fun TrustRow(item: TrustItem, modifier: Modifier) {
    Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
        Box(
            modifier = Modifier
                .size(30.dp)
                .clip(CircleShape)
                .background(AppColors.Accent.copy(alpha = 0.14f)),
            contentAlignment = Alignment.Center
        ) {
            Icon(item.icon, null, tint = AppColors.Accent, modifier = Modifier.size(16.dp))
        }
        Spacer(Modifier.width(8.dp))
        Text(item.title, fontSize = 12.sp, fontWeight = FontWeight.SemiBold, color = AppColors.TextPrimary)
    }
}
