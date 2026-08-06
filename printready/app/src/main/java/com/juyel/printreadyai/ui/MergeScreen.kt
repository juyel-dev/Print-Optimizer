package com.juyel.printreadyai.ui

import android.net.Uri
import android.provider.OpenableColumns
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.ArrowBack
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.DeleteOutline
import androidx.compose.material.icons.outlined.PictureAsPdf
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.juyel.printreadyai.core.FilterSettings
import com.juyel.printreadyai.core.OutputSettings
import com.juyel.printreadyai.core.PageItem
import com.juyel.printreadyai.core.PdfEngine
import com.juyel.printreadyai.core.Quality
import com.juyel.printreadyai.core.DocumentSize
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

private data class MergeFile(val uri: Uri, val name: String, val pageCount: Int)

@Composable
fun MergeScreen(nav: NavHostController) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()

    var files by remember { mutableStateOf(listOf<MergeFile>()) }
    var busy by remember { mutableStateOf(false) }
    var progress by remember { mutableStateOf(0f) }
    var progressText by remember { mutableStateOf("") }
    var resultUri by remember { mutableStateOf<String?>(null) }
    var error by remember { mutableStateOf<String?>(null) }

    val picker = rememberLauncherForActivityResult(ActivityResultContracts.OpenMultipleDocuments()) { uris ->
        scope.launch {
            val loaded = withContext(Dispatchers.IO) {
                uris.map { u ->
                    val name = queryName(context, u)
                    val count = countPages(context, u)
                    MergeFile(u, name, count)
                }
            }
            files = files + loaded
        }
    }

    if (resultUri != null) {
        ResultDialog(resultUri!!) { resultUri = null }
    }
    if (error != null) {
        AlertDialog(
            onDismissRequest = { error = null },
            title = { Text("Merge failed") },
            text = { Text(error ?: "") },
            confirmButton = { TextButton(onClick = { error = null }) { Text("OK") } }
        )
    }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        contentPadding = androidx.compose.foundation.layout.PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        item {
            Row(verticalAlignment = Alignment.CenterVertically) {
                IconButton(onClick = { nav.popBackStack() }) {
                    Icon(Icons.AutoMirrored.Outlined.ArrowBack, "Back")
                }
                Text("Merge PDF", style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.Bold)
            }
        }
        item {
            OutlinedButton(
                onClick = { picker.launch(arrayOf("application/pdf")) },
                modifier = Modifier.fillMaxWidth()
            ) {
                Icon(Icons.Outlined.Add, null, Modifier.size(18.dp))
                Spacer(Modifier.width(6.dp))
                Text("Add PDFs")
            }
        }
        if (files.isNotEmpty()) {
            item {
                Text(
                    "${files.size} file${if (files.size == 1) "" else "s"} · ${files.sumOf { it.pageCount }} pages",
                    style = MaterialTheme.typography.bodySmall,
                    color = AppColors.TextSecondary
                )
            }
            items(files, key = { it.uri.toString() }) { file ->
                Card(
                    shape = RoundedCornerShape(14.dp),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
                ) {
                    Row(
                        Modifier.padding(12.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(Icons.Outlined.PictureAsPdf, null, tint = AppColors.Accent)
                        Spacer(Modifier.width(10.dp))
                        Column(Modifier.weight(1f)) {
                            Text(
                                file.name,
                                style = MaterialTheme.typography.bodyMedium,
                                fontWeight = FontWeight.Medium,
                                color = AppColors.TextPrimary,
                                maxLines = 1
                            )
                            Text(
                                "${file.pageCount} page${if (file.pageCount == 1) "" else "s"}",
                                style = MaterialTheme.typography.bodySmall,
                                color = AppColors.TextSecondary
                            )
                        }
                        IconButton(
                            onClick = { files = files - file },
                            modifier = Modifier
                                .size(32.dp)
                                .clickable { files = files - file }
                        ) {
                            Icon(Icons.Outlined.DeleteOutline, "Remove", tint = AppColors.Error)
                        }
                    }
                }
            }
            item {
                Button(
                    onClick = {
                        busy = true
                        scope.launch {
                            try {
                                val items = files.flatMap { f ->
                                    (0 until f.pageCount).map { PageItem(f.uri, it) }
                                }
                                val res = PdfEngine.process(
                                    context,
                                    PdfEngine.Mode.MERGE,
                                    items,
                                    FilterSettings(),
                                    OutputSettings(
                                        quality = Quality.HIGH,
                                        documentSize = DocumentSize.ORIGINAL,
                                        addPageNumbers = false,
                                        addSeparationLines = false
                                    )
                                ) { p ->
                                    progress = if (p.total > 0) p.done.toFloat() / p.total else 0f
                                    progressText = p.stage
                                }
                                resultUri = res
                            } catch (e: Exception) {
                                error = e.message ?: "Unknown error"
                            } finally {
                                busy = false
                            }
                        }
                    },
                    enabled = files.isNotEmpty() && !busy,
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(containerColor = AppColors.Accent),
                    shape = RoundedCornerShape(14.dp)
                ) {
                    Text(if (busy) "Working..." else "Merge ${files.sumOf { it.pageCount }} pages")
                }
            }
            if (busy) {
                item {
                    Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
                        LinearProgressIndicator(
                            progress = { progress },
                            modifier = Modifier.fillMaxWidth(),
                            color = AppColors.Accent
                        )
                        Text(progressText, style = MaterialTheme.typography.bodySmall, color = AppColors.TextSecondary)
                    }
                }
            }
        }
    }
}

private suspend fun queryName(context: android.content.Context, uri: Uri): String = withContext(Dispatchers.IO) {
    var name = "document"
    context.contentResolver.query(uri, null, null, null, null)?.use { cursor ->
        if (cursor.moveToFirst()) {
            val idx = cursor.getColumnIndex(OpenableColumns.DISPLAY_NAME)
            if (idx >= 0) name = cursor.getString(idx) ?: "document"
        }
    }
    name
}

private suspend fun countPages(context: android.content.Context, uri: Uri): Int = withContext(Dispatchers.IO) {
    val fd = context.contentResolver.openFileDescriptor(uri, "r") ?: return@withContext 0
    fd.use { pfd ->
        android.graphics.pdf.PdfRenderer(pfd).use { it.pageCount }
    }
}
