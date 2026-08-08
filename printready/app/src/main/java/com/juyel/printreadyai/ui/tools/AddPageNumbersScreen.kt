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
fun AddPageNumbersScreen(nav: NavHostController) {
    val context = LocalContext.current
    var selectedFile by remember { mutableStateOf<Uri?>(null) }
    var position by remember { mutableStateOf("bottom-center") }
    var startFrom by remember { mutableStateOf("1") }
    
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
                "Add Page Numbers",
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
                        Icon(Icons.Outlined.FormatListNumbered, null, tint = Color.White, modifier = Modifier.size(28.dp))
                    }
                    Spacer(Modifier.height(12.dp))
                    Text(
                        if (selectedFile == null) "Select PDF" else "PDF Selected",
                        fontWeight = FontWeight.SemiBold,
                        color = AppColors.TextPrimary
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
                            "Position",
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.SemiBold,
                            color = AppColors.TextPrimary
                        )
                        
                        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                            FilterChip(
                                selected = position == "bottom-center",
                                onClick = { position = "bottom-center" },
                                label = { Text("Bottom") }
                            )
                            FilterChip(
                                selected = position == "top-center",
                                onClick = { position = "top-center" },
                                label = { Text("Top") }
                            )
                            FilterChip(
                                selected = position == "bottom-right",
                                onClick = { position = "bottom-right" },
                                label = { Text("Right") }
                            )
                        }
                        
                        OutlinedTextField(
                            value = startFrom,
                            onValueChange = { startFrom = it },
                            label = { Text("Start from page number") },
                            modifier = Modifier.fillMaxWidth()
                        )
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
            Icon(Icons.Outlined.FormatListNumbered, null, modifier = Modifier.size(20.dp))
            Spacer(Modifier.width(8.dp))
            Text("Add Page Numbers", fontWeight = FontWeight.Bold)
        }
    }
}
