package com.juyel.printreadyai.ui.tools

import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.juyel.printreadyai.ui.AppColors

private val brandGradient = listOf(Color(0xFFA855F7), Color(0xFFEC4899))

@Composable
fun JpgToPdfScreen(nav: NavHostController) {
    var selectedImages by remember { mutableStateOf<List<Uri>>(emptyList()) }
    var pageSize by remember { mutableStateOf("A4") }
    var orientation by remember { mutableStateOf("portrait") }
    
    val picker = rememberLauncherForActivityResult(
        ActivityResultContracts.GetMultipleContents()
    ) { uris ->
        selectedImages = uris
    }
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AppColors.Bg)
    ) {
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
                "JPG to PDF",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = AppColors.TextPrimary
            )
        }
        
        LazyColumn(
            modifier = Modifier
                .weight(1f)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item {
                Card(
                    shape = RoundedCornerShape(18.dp),
                    colors = CardDefaults.cardColors(containerColor = AppColors.Surface),
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { picker.launch("image/*") }
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(24.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Box(
                            modifier = Modifier
                                .size(56.dp)
                                .clip(RoundedCornerShape(12.dp))
                                .background(Brush.linearGradient(brandGradient)),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(Icons.Outlined.PictureAsPdf, null, tint = Color.White, modifier = Modifier.size(28.dp))
                        }
                        Spacer(Modifier.height(12.dp))
                        Text(
                            "Add Images",
                            fontWeight = FontWeight.SemiBold,
                            color = AppColors.TextPrimary
                        )
                        Text(
                            "Select JPG images to convert",
                            style = MaterialTheme.typography.bodySmall,
                            color = AppColors.TextSecondary
                        )
                    }
                }
            }
            
            if (selectedImages.isNotEmpty()) {
                item {
                    Text(
                        "Selected Images (${selectedImages.size})",
                        style = MaterialTheme.typography.titleSmall,
                        fontWeight = FontWeight.SemiBold,
                        color = AppColors.TextPrimary
                    )
                }
                
                items(selectedImages) { uri ->
                    Card(
                        shape = RoundedCornerShape(12.dp),
                        colors = CardDefaults.cardColors(containerColor = AppColors.Surface),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(Icons.Outlined.Image, null, tint = AppColors.Accent, modifier = Modifier.size(24.dp))
                            Spacer(Modifier.width(12.dp))
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    uri.lastPathSegment ?: "image.jpg",
                                    fontWeight = FontWeight.SemiBold,
                                    color = AppColors.TextPrimary,
                                    maxLines = 1
                                )
                                Text(
                                    "Image",
                                    style = MaterialTheme.typography.bodySmall,
                                    color = AppColors.TextSecondary
                                )
                            }
                            IconButton(onClick = {
                                selectedImages = selectedImages - uri
                            }) {
                                Icon(Icons.Outlined.Delete, null, tint = AppColors.Danger)
                            }
                        }
                    }
                }
                
                item {
                    Card(
                        shape = RoundedCornerShape(16.dp),
                        colors = CardDefaults.cardColors(containerColor = AppColors.Surface),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(
                            modifier = Modifier.padding(16.dp),
                            verticalArrangement = Arrangement.spacedBy(12.dp)
                        ) {
                            Text(
                                "PDF Settings",
                                style = MaterialTheme.typography.titleSmall,
                                fontWeight = FontWeight.SemiBold,
                                color = AppColors.TextPrimary
                            )
                            
                            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                                FilterChip(
                                    selected = pageSize == "A4",
                                    onClick = { pageSize = "A4" },
                                    label = { Text("A4") }
                                )
                                FilterChip(
                                    selected = pageSize == "letter",
                                    onClick = { pageSize = "letter" },
                                    label = { Text("Letter") }
                                )
                                FilterChip(
                                    selected = pageSize == "original",
                                    onClick = { pageSize = "original" },
                                    label = { Text("Original") }
                                )
                            }
                            
                            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                                FilterChip(
                                    selected = orientation == "portrait",
                                    onClick = { orientation = "portrait" },
                                    label = { Text("Portrait") }
                                )
                                FilterChip(
                                    selected = orientation == "landscape",
                                    onClick = { orientation = "landscape" },
                                    label = { Text("Landscape") }
                                )
                            }
                        }
                    }
                }
            }
        }
        
        Button(
            onClick = { /* Convert using Engine.initPdfWriter + writePageNative */ },
            enabled = selectedImages.isNotEmpty(),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = AppColors.Accent)
        ) {
            Icon(Icons.Outlined.PictureAsPdf, null, modifier = Modifier.size(20.dp))
            Spacer(Modifier.width(8.dp))
            Text("Convert to PDF", fontWeight = FontWeight.Bold)
        }
    }
}
