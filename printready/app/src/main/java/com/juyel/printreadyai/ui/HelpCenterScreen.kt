package com.juyel.printreadyai.ui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

private data class Faq(val id: String, val question: String, val answer: String, val category: String)

// Replicated 100% from old app HelpCenterScreen.kt (D5.java), rebranded to PrintReady AI
private val faqs = listOf(
    Faq("what-is-notescrafter", "What is PrintReady AI?", "PrintReady AI is a powerful mobile app that enhances and merges PDFs. Transform dark lecture slides to print-ready documents, merge multiple PDFs, remove backgrounds, and optimize for printing - all locally on your device.", "general"),
    Faq("is-it-really-free", "Is PrintReady AI really free?", "Yes! 100% free forever. We are supported by short ads to keep the service running without any subscription fees.", "general"),
    Faq("how-to-print-online-lecture-notes", "How does it work?", "Select your PDF file, choose enhancement options (invert colors, remove background, grayscale, merge PDFs), and tap process. Everything happens on your device - no servers involved.", "general"),
    Faq("no-account-needed", "Do I need to create an account?", "Nope! No account, no login, no signup required. Just open the app and start processing PDFs immediately.", "general"),
    Faq("file-upload", "Are my files uploaded to your servers?", "No. Your files never leave your device. All processing happens locally within the app. We cannot see, access, or store your PDFs.", "privacy"),
    Faq("data-collection", "What data do you collect?", "We collect anonymous usage statistics and crash logs to improve the app. We use AdMob to serve ads, which may collect anonymous data as per Google's policies.", "privacy"),
    Faq("privacy-verify", "How can I verify my files aren't uploaded?", "You can verify this by checking your data usage. Since no document data leaves your device, it's completely secure.", "privacy"),
    Faq("supported-formats", "What file formats are supported?", "PDF files. Most standard PDFs work great, though very large files (100MB+) may take longer depending on your device's memory.", "processing"),
    Faq("processing-time", "How long does processing take?", "Most PDFs process in seconds. Time depends on file size, page count, and your device's processing power. Newer phones will process faster.", "processing"),
    Faq("merge-pdfs", "Can I merge multiple PDFs?", "Yes! Select multiple PDF files from your storage and they'll be combined into one document. All processing happens locally on your device.", "processing"),
    Faq("jpeg2000-issue", "What does the JPEG2000 warning mean?", "Some PDFs contain specialized images that might be harder to process. We detect this automatically. If you see this, try using standard enhancement options.", "technical"),
    Faq("browser-compatibility", "What devices are supported?", "PrintReady AI works on most modern Android devices. Keep your Android OS updated for the best performance and security.", "technical"),
    Faq("offline-use", "Can I use PrintReady AI offline?", "An internet connection is required to verify the free version and load ads. However, the actual document processing logic still runs locally on your device for privacy.", "technical"),
    Faq("poor-quality", "The output quality isn't good. How to improve it?", "Start with high-quality PDFs (avoid low-resolution scans). Try different enhancement combinations. For very dark slides, use \"Invert Colors\". For busy backgrounds, try \"Remove Background\".", "troubleshooting"),
    Faq("processing-slow", "Processing is slow. What can I do?", "Large PDFs or complex pages take longer. Try closing other background apps to free up memory or processing fewer files at once.", "troubleshooting"),
    Faq("browser-crash", "The app crashes or freezes. Help!", "Very large PDFs (100MB+) or hundreds of pages can use a lot of memory. Try splitting the PDF into smaller files or restarting the app to free up resources.", "troubleshooting")
)

private val categories = listOf(
    "all" to "All",
    "general" to "General Questions",
    "processing" to "PDF Processing",
    "privacy" to "Privacy & Security",
    "technical" to "Technical Issues",
    "troubleshooting" to "Troubleshooting"
)

@Composable
fun HelpCenterScreen(nav: NavHostController) {
    var query by remember { mutableStateOf("") }
    var selectedCategory by remember { mutableStateOf("all") }
    var expandedFaq by remember { mutableStateOf<String?>(null) }

    val filteredFaqs = faqs.filter { faq ->
        val matchesCategory = selectedCategory == "all" || faq.category == selectedCategory
        val matchesQuery = query.isBlank() ||
            faq.question.contains(query, ignoreCase = true) ||
            faq.answer.contains(query, ignoreCase = true)
        matchesCategory && matchesQuery
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AppColors.Bg)
            .verticalScroll(rememberScrollState())
            .padding(top = 48.dp, bottom = 24.dp)
    ) {
        IconButton(
            onClick = { nav.navigateUp() },
            modifier = Modifier.padding(start = 8.dp)
        ) {
            Icon(Icons.AutoMirrored.Outlined.ArrowBack, "Back", tint = AppColors.TextPrimary)
        }

        // Header
        Column(modifier = Modifier.padding(horizontal = 16.dp)) {
            Text(
                "Help Center",
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.ExtraBold,
                color = AppColors.TextPrimary
            )
            Spacer(Modifier.height(6.dp))
            Text(
                "Find answers to common questions and get help with using PrintReady AI",
                style = MaterialTheme.typography.bodyMedium,
                color = AppColors.TextSecondary
            )
        }

        Spacer(Modifier.height(20.dp))

        // Search bar
        OutlinedTextField(
            value = query,
            onValueChange = { query = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            placeholder = { Text("Search help articles...") },
            leadingIcon = { Icon(Icons.Outlined.Search, contentDescription = null, tint = AppColors.TextSecondary) },
            singleLine = true,
            shape = RoundedCornerShape(14.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = AppColors.Accent,
                unfocusedBorderColor = AppColors.Border,
                focusedContainerColor = AppColors.Surface,
                unfocusedContainerColor = AppColors.Surface,
                cursorColor = AppColors.Accent
            )
        )

        Spacer(Modifier.height(16.dp))

        // Category chips
        Row(
            modifier = Modifier
                .horizontalScroll(rememberScrollState())
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            categories.forEach { (key, label) ->
                val isSelected = selectedCategory == key
                Surface(
                    shape = RoundedCornerShape(20.dp),
                    color = if (isSelected) AppColors.Accent else AppColors.Surface,
                    modifier = Modifier.clickable { selectedCategory = key }
                ) {
                    Text(
                        label,
                        modifier = Modifier.padding(horizontal = 14.dp, vertical = 8.dp),
                        style = MaterialTheme.typography.bodySmall,
                        fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                        color = if (isSelected) Color.White else AppColors.TextSecondary
                    )
                }
            }
        }

        Spacer(Modifier.height(20.dp))

        // FAQ list
        Column(
            modifier = Modifier.padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            if (filteredFaqs.isEmpty()) {
                Text(
                    "No results found.",
                    style = MaterialTheme.typography.bodyMedium,
                    color = AppColors.TextSecondary,
                    modifier = Modifier.padding(vertical = 24.dp)
                )
            }
            filteredFaqs.forEach { faq ->
                FaqCard(
                    faq = faq,
                    expanded = expandedFaq == faq.id,
                    onToggle = { expandedFaq = if (expandedFaq == faq.id) null else faq.id }
                )
            }
        }

        Spacer(Modifier.height(24.dp))
    }
}

@Composable
private fun FaqCard(faq: Faq, expanded: Boolean, onToggle: () -> Unit) {
    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = AppColors.Surface),
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onToggle() }
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    faq.question,
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.SemiBold,
                    color = AppColors.TextPrimary,
                    modifier = Modifier.weight(1f)
                )
                Icon(
                    if (expanded) Icons.Outlined.ExpandLess else Icons.Outlined.ExpandMore,
                    contentDescription = null,
                    tint = AppColors.Accent
                )
            }
            AnimatedVisibility(visible = expanded) {
                Column {
                    Spacer(Modifier.height(10.dp))
                    Text(
                        faq.answer,
                        style = MaterialTheme.typography.bodySmall,
                        color = AppColors.TextSecondary
                    )
                }
            }
        }
    }
}
