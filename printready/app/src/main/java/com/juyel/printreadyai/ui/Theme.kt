package com.juyel.printreadyai.ui

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

object AppColors {
    val Background = Color(0xFF0A0A0F)
    val Surface = Color(0xFF121218)
    val Border = Color(0xFF27272A)
    val Accent = Color(0xFFA855F7)
    val TextPrimary = Color(0xFFF4F4F5)
    val TextSecondary = Color(0xFFA1A1AA)
    val Success = Color(0xFF22C55E)
    val Error = Color(0xFFEF4444)
    
    // Aliases for compatibility
    val Bg = Background
    val Danger = Error
    
    // Brand gradient
    val Gradient = listOf(Color(0xFFA855F7), Color(0xFFEC4899))
}

private val DarkScheme = darkColorScheme(
    primary = AppColors.Accent,
    background = AppColors.Background,
    surface = AppColors.Surface,
    surfaceVariant = AppColors.Surface,
    onPrimary = Color.White,
    onBackground = AppColors.TextPrimary,
    onSurface = AppColors.TextPrimary,
    outline = AppColors.Border,
    outlineVariant = AppColors.Border,
    secondaryContainer = AppColors.Surface,
    surfaceContainer = AppColors.Surface,
    surfaceContainerHigh = AppColors.Surface,
    surfaceContainerHighest = AppColors.Surface
)

private val LightScheme = lightColorScheme(
    primary = AppColors.Accent,
    background = Color(0xFFF4F4F5),
    surface = Color.White,
    onPrimary = Color.White,
    onBackground = Color(0xFF18181B),
    onSurface = Color(0xFF18181B)
)

@Composable
fun PrintReadyTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = if (isSystemInDarkTheme()) DarkScheme else LightScheme,
        content = content
    )
}
