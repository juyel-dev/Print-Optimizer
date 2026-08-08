
package com.juyel.printreadyai.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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

data class PassPlan(
    val id: String,
    val name: String,
    val duration: String,
    val days: String,
    val rate: String,
    val price: String,
    val badge: String?,
    val color: Color,
    val flow: String,
    val prints: String,
    val app: String
)

@Composable
fun PremiumScreen(nav: NavHostController) {
    val plans = listOf(
        PassPlan("monthly", "Silver Pass", "1 Month", "30 Days", "₹0.6 / DAY", "₹19", "Essential", Color(0xFF94A3B8), "Standard speed\nUp to 5 MB limit", "B&W: ₹1.25\nColor: ₹3.35", "Free access\nStandard speed"),
        PassPlan("half_yearly", "Gold Pass", "6 Months", "180 Days", "₹0.5 / DAY", "₹99", "Most Popular", Color(0xFFF59E0B), "Fast speed\nNo size limits", "Save 8%\nB&W: ₹1.15\nColor: ₹3.00", "Pass synced\nAd-free"),
        PassPlan("annual", "Platinum Pass", "1 Year", "365 Days", "₹0.5 / DAY", "₹179", "Best Value", Color(0xFF3B82F6), "Priority queue\nNo size limits", "Save 17%\nB&W: ₹1.05\nColor: ₹2.75", "Pass synced\nAd-free"),
        PassPlan("lifetime", "Diamond Pass", "Lifetime", "Forever Access", "PERPETUAL", "₹499", "One-time", Color(0xFFA855F7), "Ultra-priority\nBatch uploads\nVIP Beta Access", "Save 35%\nB&W: ₹0.89\nColor: ₹1.99", "Pass synced\nAd-free")
    )

    var selectedPlan by remember { mutableStateOf(plans[1]) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AppColors.Background)
            .verticalScroll(rememberScrollState())
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Brush.verticalGradient(listOf(AppColors.Accent.copy(alpha = 0.15f), Color.Transparent)))
                .padding(16.dp)
                .padding(top = 24.dp)
        ) {
            Column {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    IconButton(onClick = { nav.popBackStack() }) {
                        Icon(Icons.AutoMirrored.Outlined.ArrowBack, "Back", tint = AppColors.TextPrimary)
                    }
                    Text(
                        "COMMUNITY PASS",
                        style = MaterialTheme.typography.labelLarge.copy(fontWeight = FontWeight.Bold, letterSpacing = 1.5.sp),
                        color = AppColors.Accent
                    )
                }
                Spacer(Modifier.height(8.dp))
                Text(
                    "Choose your ",
                    style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Light),
                    color = AppColors.TextPrimary
                )
                Text(
                    "Pass",
                    style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Bold),
                    color = AppColors.TextPrimary
                )
                Spacer(Modifier.height(8.dp))
                Text(
                    "Support PrintReady AI and unlock unlimited processing power.",
                    style = MaterialTheme.typography.bodyMedium,
                    color = AppColors.TextSecondary
                )
                Spacer(Modifier.height(16.dp))
                Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                    Badge(Icons.Outlined.VerifiedUser, "Secure")
                    Badge(Icons.Outlined.FlashOn, "Instant")
                    Badge(Icons.Outlined.WorkspacePremium, "Premium")
                }
            }
        }

        Spacer(Modifier.height(24.dp))
        
        Column(modifier = Modifier.padding(horizontal = 16.dp)) {
            plans.forEach { plan ->
                PlanCard(plan, plan == selectedPlan) { selectedPlan = plan }
                Spacer(Modifier.height(12.dp))
            }
        }

        Spacer(Modifier.height(24.dp))
        
        Column(modifier = Modifier.padding(horizontal = 16.dp)) {
            Text(
                "Your Printing Rates",
                style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold),
                color = AppColors.TextPrimary
            )
            Spacer(Modifier.height(12.dp))
            RatesGrid(selectedPlan)
        }

        Spacer(Modifier.height(32.dp))

        Button(
            onClick = { /* TODO: Razorpay integration */ },
            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp).height(56.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = selectedPlan.color)
        ) {
            Text("Subscribe to " + selectedPlan.name, fontWeight = FontWeight.Bold, fontSize = 16.sp)
        }

        Spacer(Modifier.height(48.dp))
    }
}

@Composable
fun Badge(icon: ImageVector, text: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Icon(icon, contentDescription = null, tint = AppColors.TextSecondary, modifier = Modifier.size(14.dp))
        Text(text, style = MaterialTheme.typography.labelSmall.copy(fontWeight = FontWeight.Bold, letterSpacing = 1.sp), color = AppColors.TextSecondary)
    }
}

@Composable
fun PlanCard(plan: PassPlan, isSelected: Boolean, onClick: () -> Unit) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .border(
                width = if (isSelected) 2.dp else 1.dp,
                color = if (isSelected) plan.color else AppColors.TextSecondary.copy(alpha = 0.1f),
                shape = RoundedCornerShape(16.dp)
            )
            .clip(RoundedCornerShape(16.dp))
            .background(if (isSelected) plan.color.copy(alpha = 0.08f) else AppColors.Surface.copy(alpha = 0.04f)),
        onClick = onClick
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .size(32.dp)
                        .background(plan.color.copy(alpha = 0.2f), RoundedCornerShape(8.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(Icons.Outlined.Check, contentDescription = null, tint = plan.color, modifier = Modifier.size(18.dp))
                }
                Spacer(Modifier.width(12.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text(plan.name, style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold), color = AppColors.TextPrimary)
                    Text(plan.duration, style = MaterialTheme.typography.bodySmall, color = AppColors.TextSecondary)
                }
                if (plan.badge != null) {
                    Box(
                        modifier = Modifier
                            .background(plan.color.copy(alpha = 0.2f), RoundedCornerShape(8.dp))
                            .padding(horizontal = 8.dp, vertical = 4.dp)
                    ) {
                        Text(plan.badge.uppercase(), style = MaterialTheme.typography.labelSmall.copy(fontWeight = FontWeight.Bold), color = plan.color)
                    }
                }
            }
            Spacer(Modifier.height(12.dp))
            Row(verticalAlignment = Alignment.Bottom) {
                Text(plan.price, style = MaterialTheme.typography.headlineMedium.copy(fontWeight = FontWeight.Bold), color = AppColors.TextPrimary)
                Spacer(Modifier.width(4.dp))
                Text(plan.rate, style = MaterialTheme.typography.bodySmall, color = AppColors.TextSecondary, modifier = Modifier.padding(bottom = 4.dp))
            }
        }
    }
}

@Composable
fun RatesGrid(plan: PassPlan) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(AppColors.Surface.copy(alpha = 0.06f), RoundedCornerShape(16.dp))
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        RateRow("FLOW", plan.flow, plan.color)
        HorizontalDivider(color = AppColors.TextSecondary.copy(alpha = 0.1f))
        RateRow("PRINTS", plan.prints, plan.color)
        HorizontalDivider(color = AppColors.TextSecondary.copy(alpha = 0.1f))
        RateRow("TOOLS", "Free\nNo restrictions", plan.color)
        HorizontalDivider(color = AppColors.TextSecondary.copy(alpha = 0.1f))
        RateRow("ANDROID APP", plan.app, plan.color)
    }
}

@Composable
fun RateRow(category: String, value: String, color: Color) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            category,
            style = MaterialTheme.typography.labelLarge.copy(fontWeight = FontWeight.Bold, letterSpacing = 1.sp),
            color = color,
            modifier = Modifier.width(100.dp)
        )
        Text(
            value,
            style = MaterialTheme.typography.bodyMedium,
            color = AppColors.TextPrimary
        )
    }
}
