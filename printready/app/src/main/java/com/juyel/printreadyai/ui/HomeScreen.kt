package com.juyel.printreadyai.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AutoFixHigh
import androidx.compose.material.icons.outlined.Bolt
import androidx.compose.material.icons.outlined.Brush
import androidx.compose.material.icons.outlined.CloudOff
import androidx.compose.material.icons.outlined.MergeType
import androidx.compose.material.icons.outlined.PictureAsPdf
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.juyel.printreadyai.ui.AppColors

@Composable
fun HomeScreen(nav: NavHostController) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        contentPadding = androidx.compose.foundation.layout.PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item { HeroCard() }
        item { ConvertCta(nav) }
        item {
            Text("Tools", style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.SemiBold)
        }
        item {
            ToolsGrid(nav)
        }
        item {
            Text("Why PrintReady AI", style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.SemiBold)
        }
        item { FeatureRow() }
        item { Spacer(Modifier.height(8.dp)) }
    }
}

@Composable
private fun HeroCard() {
    Card(
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = Color.Transparent)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    Brush.linearGradient(
                        listOf(Color(0xFF1E1B2E), Color(0xFF0E0E16))
                    )
                )
                .padding(20.dp)
        ) {
            Column {
                Text(
                    "PrintReady AI",
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold,
                    color = AppColors.TextPrimary
                )
                Spacer(Modifier.height(6.dp))
                Text(
                    "Convert dark lecture slides and PDFs into clean, ink-saving printable notes.",
                    fontSize = 14.sp,
                    color = AppColors.TextSecondary
                )
            }
        }
    }
}

@Composable
private fun ConvertCta(nav: NavHostController) {
    Surface(
        shape = RoundedCornerShape(20.dp),
        color = AppColors.Accent.copy(alpha = 0.12f),
        modifier = Modifier
            .fillMaxWidth()
            .clickable { nav.navigate(Routes.CONVERT) }
    ) {
        Column(Modifier.padding(18.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(Icons.Outlined.PictureAsPdf, null, tint = AppColors.Accent)
                Spacer(Modifier.size(10.dp))
                Text(
                    "Convert PDF",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.SemiBold,
                    color = AppColors.TextPrimary
                )
            }
            Spacer(Modifier.height(6.dp))
            Text(
                "Turn dark PDFs into clean notes — instantly, on device.",
                style = MaterialTheme.typography.bodySmall,
                color = AppColors.TextSecondary
            )
            Spacer(Modifier.height(14.dp))
            Button(
                onClick = { nav.navigate(Routes.CONVERT) },
                colors = ButtonDefaults.buttonColors(containerColor = AppColors.Accent),
                shape = RoundedCornerShape(14.dp)
            ) {
                Icon(Icons.Outlined.AutoFixHigh, null, Modifier.size(18.dp))
                Spacer(Modifier.size(8.dp))
                Text("Start Converting", fontWeight = FontWeight.SemiBold)
            }
        }
    }
}

private data class ToolItem(val name: String, val desc: String, val icon: ImageVector, val route: String?, val soon: Boolean = false)

private val tools = listOf(
    ToolItem("Merge PDF", "Combine multiple PDFs into one", Icons.Outlined.MergeType, Routes.MERGE),
    ToolItem("Compress PDF", "Reduce PDF file size", Icons.Outlined.Brush, null, soon = true),
    ToolItem("PDF to Images", "Export pages as images", Icons.Outlined.Bolt, null, soon = true),
    ToolItem("Page Numberer", "Add numbers to pages", Icons.Outlined.PictureAsPdf, null, soon = true)
)

@Composable
private fun ToolsGrid(nav: NavHostController) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
        modifier = Modifier.height(320.dp)
    ) {
        items(tools) { tool ->
            ToolCard(tool, nav)
        }
    }
}

@Composable
private fun ToolCard(tool: ToolItem, nav: NavHostController) {
    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = if (tool.soon) MaterialTheme.colorScheme.surface.copy(alpha = 0.5f)
            else MaterialTheme.colorScheme.surface
        ),
        modifier = Modifier
            .fillMaxWidth()
            .clickable(enabled = tool.route != null && !tool.soon) { tool.route?.let { nav.navigate(it) } }
    ) {
        Column(Modifier.padding(14.dp)) {
            Icon(
                tool.icon,
                null,
                tint = if (tool.soon) AppColors.TextSecondary.copy(alpha = 0.5f) else AppColors.Accent
            )
            Spacer(Modifier.height(10.dp))
            Text(
                tool.name,
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.SemiBold,
                color = if (tool.soon) AppColors.TextSecondary.copy(alpha = 0.7f) else AppColors.TextPrimary
            )
            Spacer(Modifier.height(2.dp))
            Text(
                if (tool.soon) "Coming soon" else tool.desc,
                style = MaterialTheme.typography.bodySmall,
                color = AppColors.TextSecondary
            )
        }
    }
}

@Composable
private fun FeatureRow() {
    Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
        FeatureItem(Icons.Outlined.Brush, "Ink-saving output", "Background cleared, text boosted — print less, read more.")
        FeatureItem(Icons.Outlined.Bolt, "Fast native engine", "C-accelerated page processing keeps conversion instant.")
        FeatureItem(Icons.Outlined.CloudOff, "100% offline", "Your documents never leave your device.")
    }
}

@Composable
private fun FeatureItem(icon: ImageVector, title: String, desc: String) {
    Card(
        shape = RoundedCornerShape(14.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
    ) {
        Row(Modifier.padding(14.dp), verticalAlignment = Alignment.CenterVertically) {
            Icon(icon, null, tint = AppColors.Accent, modifier = Modifier.size(22.dp))
            Spacer(Modifier.size(12.dp))
            Column {
                Text(title, style = MaterialTheme.typography.bodyMedium, fontWeight = FontWeight.SemiBold, color = AppColors.TextPrimary)
                Text(desc, style = MaterialTheme.typography.bodySmall, color = AppColors.TextSecondary)
            }
        }
    }
}
