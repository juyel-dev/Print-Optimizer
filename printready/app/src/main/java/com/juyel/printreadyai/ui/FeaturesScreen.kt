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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

private data class Feature(val icon: ImageVector, val title: String, val subtitle: String)

// Replicated from old app FeaturesScreen.kt (AbstractC2493h5)
private val features = listOf(
    Feature(Icons.Outlined.List, "Reorder", "Organize pages"),
    Feature(Icons.Outlined.Edit, "Edit Pages", "Modify content"),
    Feature(Icons.Outlined.AutoFixHigh, "Remove Logo", "Clean pages"),
    Feature(Icons.Outlined.Contrast, "Grayscale", "Save ink"),
    Feature(Icons.Outlined.ViewColumn, "Separators", "Add lines"),
    Feature(Icons.Outlined.FormatListNumbered, "Page No", "Add numbering"),
    Feature(Icons.Outlined.CallMerge, "Merge PDFs", "Combine files"),
    Feature(Icons.Outlined.InvertColors, "Invert Colors", "Dark to Light"),
    Feature(Icons.Outlined.CleaningServices, "Clear Background", "Remove noise"),
    Feature(Icons.Outlined.GridView, "Multiple Slides", "Grid layout"),
    Feature(Icons.Outlined.DeleteSweep, "Remove Slides", "Delete pages"),
    Feature(Icons.Outlined.FilterBAndW, "Black & White", "High contrast")
)

@Composable
fun FeaturesScreen(nav: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AppColors.Bg)
            .verticalScroll(rememberScrollState())
            .padding(top = 48.dp, bottom = 24.dp)
    ) {
        // Back button
        IconButton(
            onClick = { nav.navigateUp() },
            modifier = Modifier.padding(start = 8.dp)
        ) {
            Icon(Icons.AutoMirrored.Outlined.ArrowBack, "Back", tint = AppColors.TextPrimary)
        }

        // Header
        Column(modifier = Modifier.padding(horizontal = 16.dp)) {
            Text(
                "Features",
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.ExtraBold,
                color = AppColors.TextPrimary
            )
            Spacer(Modifier.height(6.dp))
            Text(
                "Everything you need to master your documents",
                style = MaterialTheme.typography.bodyMedium,
                color = AppColors.TextSecondary
            )
        }

        Spacer(Modifier.height(24.dp))

        // Feature cards
        Column(
            modifier = Modifier.padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            features.forEach { feature ->
                FeatureCard(feature)
            }
        }
    }
}

@Composable
private fun FeatureCard(feature: Feature) {
    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = AppColors.Surface)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(44.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(AppColors.Accent.copy(alpha = 0.12f)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    feature.icon,
                    contentDescription = feature.title,
                    tint = AppColors.Accent,
                    modifier = Modifier.size(24.dp)
                )
            }
            Spacer(Modifier.width(16.dp))
            Column {
                Text(
                    feature.title,
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.SemiBold,
                    color = AppColors.TextPrimary
                )
                Spacer(Modifier.height(2.dp))
                Text(
                    feature.subtitle,
                    style = MaterialTheme.typography.bodySmall,
                    color = AppColors.TextSecondary
                )
            }
        }
    }
}
