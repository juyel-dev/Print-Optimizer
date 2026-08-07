package com.juyel.printreadyai.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Construction
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

/**
 * Generic placeholder for not-yet-implemented destinations.
 * Used by Bottom Nav items (Contact, Library, Premium, Settings) and
 * by "soon/{title}" routes for tool placeholders.
 */
@Composable
fun ComingSoonScreen(title: String) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(
            Icons.Outlined.Construction,
            contentDescription = null,
            tint = AppColors.Accent,
            modifier = Modifier.size(56.dp)
        )
        Spacer(Modifier.height(16.dp))
        Text(
            "$title — Coming Soon",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            color = AppColors.TextPrimary
        )
        Spacer(Modifier.height(8.dp))
        Text(
            "This section is on its way.",
            style = MaterialTheme.typography.bodyMedium,
            color = AppColors.TextSecondary
        )
    }
}
