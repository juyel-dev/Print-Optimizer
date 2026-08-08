package com.juyel.printreadyai.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.ArrowBack
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

private val brandGradient = listOf(Color(0xFFA855F7), Color(0xFFEC4899))

data class QuickTool(
    val id: String,
    val title: String,
    val description: String,
    val icon: ImageVector,
    val category: String,
    val route: String
)

private val tools = listOf(
    QuickTool("merge-pdf", "Merge PDF", "Combine multiple PDFs into one document", Icons.Outlined.MergeType, "PDF Tools", "pdf-merge"),
    QuickTool("split-pdf", "Split PDF", "Split a PDF into multiple documents", Icons.Outlined.ContentCut, "PDF Tools", "pdf-split"),
    QuickTool("compress-pdf", "Compress PDF", "Reduce PDF file size", Icons.Outlined.Compress, "PDF Tools", "pdf-compress"),
    QuickTool("add-page-numbers", "Add Page Numbers", "Add page numbers to your PDF", Icons.Outlined.FormatListNumbered, "PDF Tools", "pdf-add-page-numbers"),
    QuickTool("organize-pdf", "Organize PDF", "Rearrange, rotate, or delete pages", Icons.Outlined.Reorder, "PDF Tools", "pdf-organize"),
    QuickTool("crop-pdf", "Crop PDF", "Crop pages to remove margins", Icons.Outlined.Crop, "PDF Tools", "pdf-crop"),
    QuickTool("invert-pdf", "Invert PDF", "Invert colors of PDF pages", Icons.Outlined.InvertColors, "PDF Tools", "pdf-invert"),
    QuickTool("pdf-to-jpg", "PDF to JPG", "Convert PDF pages to JPG images", Icons.Outlined.Image, "Image Tools", "pdf-to-jpg"),
    QuickTool("jpg-to-pdf", "JPG to PDF", "Convert JPG images to PDF", Icons.Outlined.PictureAsPdf, "Image Tools", "jpg-to-pdf"),
    QuickTool("pomodoro", "Pomodoro Timer", "Focus timer with breaks", Icons.Outlined.Timer, "Focus", "pomodoro-setup")
)

private val categories = listOf("All", "PDF Tools", "Image Tools", "Focus")

@Composable
fun ToolsScreen(nav: NavHostController) {
    var selectedCategory by remember { mutableStateOf("All") }
    var searchQuery by remember { mutableStateOf("") }
    
    val filteredTools = tools.filter { tool ->
        val matchesCategory = selectedCategory == "All" || tool.category == selectedCategory
        val matchesSearch = searchQuery.isEmpty() || 
            tool.title.contains(searchQuery, ignoreCase = true) ||
            tool.description.contains(searchQuery, ignoreCase = true)
        matchesCategory && matchesSearch
    }
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AppColors.Bg)
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
                "Quick Tools",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = AppColors.TextPrimary
            )
        }
        
        // Header
        Text(
            "Everything you need - One tap away",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.SemiBold,
            color = AppColors.TextPrimary,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )
        
        // Search
        OutlinedTextField(
            value = searchQuery,
            onValueChange = { searchQuery = it },
            placeholder = { Text("Search tools...") },
            leadingIcon = { Icon(Icons.Outlined.Search, null, tint = AppColors.TextSecondary) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            shape = RoundedCornerShape(12.dp),
            singleLine = true
        )
        
        // Category chips
        LazyColumn(
            modifier = Modifier.weight(1f)
        ) {
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 8.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    categories.forEach { category ->
                        FilterChip(
                            selected = selectedCategory == category,
                            onClick = { selectedCategory = category },
                            label = { Text(category) }
                        )
                    }
                }
            }
            
            // Tools grid grouped by category
            val groupedTools = filteredTools.groupBy { it.category }
            groupedTools.forEach { (category, categoryTools) ->
                if (selectedCategory == "All") {
                    item {
                        Text(
                            category,
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.Bold,
                            color = AppColors.TextPrimary,
                            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                        )
                    }
                }
                
                item {
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(2),
                        contentPadding = PaddingValues(horizontal = 16.dp),
                        verticalArrangement = Arrangement.spacedBy(12.dp),
                        horizontalArrangement = Arrangement.spacedBy(12.dp),
                        modifier = Modifier.height(((categoryTools.size / 2 + categoryTools.size % 2) * 180).dp)
                    ) {
                        items(categoryTools) { tool ->
                            ToolCard(tool) { nav.navigate(tool.route) }
                        }
                    }
                }
                
                item { Spacer(Modifier.height(16.dp)) }
            }
        }
    }
}

@Composable
private fun ToolCard(tool: QuickTool, onClick: () -> Unit) {
    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = AppColors.Surface),
        modifier = Modifier
            .fillMaxWidth()
            .height(160.dp)
            .clickable(onClick = onClick)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            // Icon with gradient border
            Box(
                modifier = Modifier
                    .size(48.dp)
                    .clip(CircleShape)
                    .background(Brush.linearGradient(brandGradient.map { it.copy(alpha = 0.15f) }))
                    .border(2.dp, Brush.linearGradient(brandGradient), CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    tool.icon,
                    contentDescription = tool.title,
                    tint = AppColors.Accent,
                    modifier = Modifier.size(24.dp)
                )
            }
            
            // Title
            Text(
                tool.title,
                style = MaterialTheme.typography.titleSmall,
                fontWeight = FontWeight.Bold,
                color = AppColors.TextPrimary,
                maxLines = 1
            )
            
            // Description
            Text(
                tool.description,
                style = MaterialTheme.typography.bodySmall,
                color = AppColors.TextSecondary,
                maxLines = 2,
                modifier = Modifier.weight(1f)
            )
            
            // Open button
            Surface(
                shape = RoundedCornerShape(8.dp),
                color = AppColors.Accent.copy(alpha = 0.1f),
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        "Open",
                        style = MaterialTheme.typography.labelMedium,
                        fontWeight = FontWeight.Bold,
                        color = AppColors.Accent
                    )
                    Spacer(Modifier.width(4.dp))
                    Icon(
                        Icons.Outlined.ArrowForward,
                        null,
                        tint = AppColors.Accent,
                        modifier = Modifier.size(14.dp)
                    )
                }
            }
        }
    }
}
