package com.juyel.printreadyai.ui.tools

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.juyel.printreadyai.ui.AppColors
import kotlinx.coroutines.delay

private val brandGradient = listOf(Color(0xFFA855F7), Color(0xFFEC4899))

@Composable
fun PomodoroScreen(nav: NavHostController) {
    var workDuration by remember { mutableStateOf(25) }
    var breakDuration by remember { mutableStateOf(5) }
    var isRunning by remember { mutableStateOf(false) }
    var currentTime by remember { mutableStateOf(25 * 60) }
    var isWorkSession by remember { mutableStateOf(true) }
    
    LaunchedEffect(isRunning) {
        while (isRunning && currentTime > 0) {
            delay(1000)
            currentTime--
            if (currentTime == 0) {
                // Switch between work and break
                isWorkSession = !isWorkSession
                currentTime = if (isWorkSession) workDuration * 60 else breakDuration * 60
            }
        }
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
                "Pomodoro Timer",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = AppColors.TextPrimary
            )
        }
        
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            // Timer display
            Box(
                modifier = Modifier
                    .size(250.dp)
                    .clip(CircleShape)
                    .background(
                        if (isWorkSession) 
                            Brush.linearGradient(listOf(Color(0xFFEF4444), Color(0xFFDC2626)))
                        else 
                            Brush.linearGradient(listOf(Color(0xFF22C55E), Color(0xFF16A34A)))
                    ),
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        if (isWorkSession) "Work" else "Break",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Spacer(Modifier.height(8.dp))
                    Text(
                        "${currentTime / 60}:${(currentTime % 60).toString().padStart(2, '0')}",
                        fontSize = 56.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }
            }
            
            // Settings
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
                        "Timer Settings",
                        style = MaterialTheme.typography.titleSmall,
                        fontWeight = FontWeight.SemiBold,
                        color = AppColors.TextPrimary
                    )
                    
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("Work Duration (min)", color = AppColors.TextSecondary)
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            IconButton(onClick = { if (workDuration > 1) workDuration-- }) {
                                Icon(Icons.Outlined.Remove, null, tint = AppColors.Accent)
                            }
                            Text(
                                "$workDuration",
                                fontWeight = FontWeight.Bold,
                                color = AppColors.TextPrimary,
                                modifier = Modifier.width(40.dp)
                            )
                            IconButton(onClick = { if (workDuration < 60) workDuration++ }) {
                                Icon(Icons.Outlined.Add, null, tint = AppColors.Accent)
                            }
                        }
                    }
                    
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("Break Duration (min)", color = AppColors.TextSecondary)
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            IconButton(onClick = { if (breakDuration > 1) breakDuration-- }) {
                                Icon(Icons.Outlined.Remove, null, tint = AppColors.Accent)
                            }
                            Text(
                                "$breakDuration",
                                fontWeight = FontWeight.Bold,
                                color = AppColors.TextPrimary,
                                modifier = Modifier.width(40.dp)
                            )
                            IconButton(onClick = { if (breakDuration < 30) breakDuration++ }) {
                                Icon(Icons.Outlined.Add, null, tint = AppColors.Accent)
                            }
                        }
                    }
                }
            }
            
            // Tips
            Card(
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = AppColors.Surface),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(Icons.Outlined.Lightbulb, null, tint = AppColors.Accent, modifier = Modifier.size(20.dp))
                        Spacer(Modifier.width(8.dp))
                        Text(
                            "Tips",
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.SemiBold,
                            color = AppColors.TextPrimary
                        )
                    }
                    Text(
                        "• Work for 25 minutes, then take a 5-minute break\n" +
                        "• After 4 work sessions, take a longer break (15-30 min)\n" +
                        "• Stay focused during work sessions\n" +
                        "• Use breaks to stretch or walk",
                        style = MaterialTheme.typography.bodySmall,
                        color = AppColors.TextSecondary
                    )
                }
            }
        }
        
        // Control buttons
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Button(
                onClick = { 
                    isRunning = !isRunning
                    if (!isRunning) {
                        // Reset to work session
                        currentTime = workDuration * 60
                        isWorkSession = true
                    }
                },
                modifier = Modifier.weight(1f),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = if (isRunning) AppColors.Danger else AppColors.Accent
                )
            ) {
                Icon(
                    if (isRunning) Icons.Outlined.Pause else Icons.Outlined.PlayArrow,
                    null,
                    modifier = Modifier.size(20.dp)
                )
                Spacer(Modifier.width(8.dp))
                Text(
                    if (isRunning) "Pause" else "Start",
                    fontWeight = FontWeight.Bold
                )
            }
            
            Button(
                onClick = { 
                    isRunning = false
                    currentTime = workDuration * 60
                    isWorkSession = true
                },
                modifier = Modifier.weight(1f),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = AppColors.Surface)
            ) {
                Icon(Icons.Outlined.Refresh, null, modifier = Modifier.size(20.dp))
                Spacer(Modifier.width(8.dp))
                Text("Reset", fontWeight = FontWeight.Bold)
            }
        }
    }
}
