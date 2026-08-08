package com.juyel.printreadyai.ui.tools

import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
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
fun CropPdfScreen(nav: NavHostController) {
    var selectedFile by remember { mutableStateOf<Uri?>(null) }
    var marginPercent by remember { mutableStateOf(10) }
    var applyToAll by remember { mutableStateOf(true) }
    
    val picker = rememberLauncherForActivityResult(
        ActivityResultContracts.GetContent()
    ) { uri ->
        selectedFile = uri
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
                "Crop PDF",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = AppColors.TextPrimary
            )
        }
        
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Card(
                shape = RoundedCornerShape(18.dp),
                colors = CardDefaults.cardColors(containerColor = AppColors.Surface),
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { picker.launch("application/pdf") }
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
                        Icon(Icons.Outlined.Crop, null, tint = Color.White, modifier = Modifier.size(28.dp))
                    }
                    Spacer(Modifier.height(12.dp))
                    Text(
                        if (selectedFile == null) "Select PDF to Crop" else "PDF Selected",
                        fontWeight = FontWeight.SemiBold,
                        color = AppColors.TextPrimary
                    )
                    Text(
                        "Remove margins from pages",
                        style = MaterialTheme.typography.bodySmall,
                        color = AppColors.TextSecondary
                    )
                }
            }
            
            if (selectedFile != null) {
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
                            "Crop Margins",
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.SemiBold,
                            color = AppColors.TextPrimary
                        )
                        
                        Column {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text("Margin Size", color = AppColors.TextSecondary)
                                Text("$marginPercent%", color = AppColors.Accent, fontWeight = FontWeight.Bold)
                            }
                            Slider(
                                value = marginPercent.toFloat(),
                                onValueChange = { marginPercent = it.toInt() },
                                valueRange = 0f..30f,
                                modifier = Modifier.fillMaxWidth()
                            )
                        }
                        
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Checkbox(checked = applyToAll, onCheckedChange = { applyToAll = it })
                            Spacer(Modifier.width(8.dp))
                            Text("Apply to all pages", color = AppColors.TextPrimary)
                        }
                    }
                }
            }
        }
        
        Button(
            onClick = { /* Process */ },
            enabled = selectedFile != null,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = AppColors.Accent)
        ) {
            Icon(Icons.Outlined.Crop, null, modifier = Modifier.size(20.dp))
            Spacer(Modifier.width(8.dp))
            Text("Crop PDF", fontWeight = FontWeight.Bold)
        }
    }
}
