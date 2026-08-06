package com.juyel.printreadyai.ui

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.pdf.PdfRenderer
import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.ArrowBack
import androidx.compose.material.icons.outlined.OpenInNew
import androidx.compose.material.icons.outlined.Share
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Slider
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.juyel.printreadyai.core.DocumentSize
import com.juyel.printreadyai.core.FilterSettings
import com.juyel.printreadyai.core.OutputSettings
import com.juyel.printreadyai.core.PageItem
import com.juyel.printreadyai.core.PdfEngine
import com.juyel.printreadyai.core.Quality
import com.juyel.printreadyai.core.Orientation
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.foundation.Image
import kotlin.math.roundToInt

private data class LogoBox(
    var left: Float = 0.05f,
    var top: Float = 0.05f,
    var w: Float = 0.40f,
    var h: Float = 0.15f,
    var circle: Boolean = false
)

@Composable
fun ConvertScreen(nav: NavHostController) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()

    var uri by remember { mutableStateOf<Uri?>(null) }
    var pageCount by remember { mutableIntStateOf(0) }
    var selected by remember { mutableStateOf(setOf<Int>()) }
    var preview by remember { mutableStateOf<Bitmap?>(null) }

    var invert by remember { mutableStateOf(false) }
    var grayscale by remember { mutableStateOf(false) }
    var clearBg by remember { mutableStateOf(false) }
    var threshold by remember { mutableIntStateOf(180) }
    var bw by remember { mutableStateOf(false) }
    var removeLogo by remember { mutableStateOf(false) }
    val logo1 = remember { mutableStateOf(LogoBox()) }
    val logo2 = remember { mutableStateOf(LogoBox(circle = true)) }

    var quality by remember { mutableStateOf(Quality.HIGH) }
    var sizeMode by remember { mutableStateOf(DocumentSize.ORIGINAL) }
    var rows by remember { mutableIntStateOf(1) }
    var cols by remember { mutableIntStateOf(1) }
    var orientation by remember { mutableStateOf(Orientation.PORTRAIT) }
    var pageNumbers by remember { mutableStateOf(false) }
    var sepLines by remember { mutableStateOf(false) }

    var busy by remember { mutableStateOf(false) }
    var progress by remember { mutableStateOf(0f) }
    var progressText by remember { mutableStateOf("") }
    var resultUri by remember { mutableStateOf<String?>(null) }
    var error by remember { mutableStateOf<String?>(null) }

    val picker = rememberLauncherForActivityResult(ActivityResultContracts.OpenDocument()) { u ->
        u ?: return@rememberLauncherForActivityResult
        scope.launch {
            val count = countPages(context, u)
            uri = u
            pageCount = count
            selected = (0 until count).toSet()
            preview = renderPreview(context, u, 640)
        }
    }

    if (resultUri != null) {
        ResultDialog(resultUri!!) {
            resultUri = null
        }
    }
    if (error != null) {
        AlertDialog(
            onDismissRequest = { error = null },
            title = { Text("Conversion failed") },
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
                Text("Convert", style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.Bold)
            }
        }

        item {
            Card(
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
            ) {
                Column(Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
                    if (uri == null) {
                        Text("Choose a dark PDF to convert", color = AppColors.TextSecondary)
                        Button(
                            onClick = { picker.launch(arrayOf("application/pdf")) },
                            colors = ButtonDefaults.buttonColors(containerColor = AppColors.Accent)
                        ) {
                            Text("Pick PDF")
                        }
                    } else {
                        Text("Document loaded: $pageCount pages", color = AppColors.TextPrimary)
                        OutlinedButton(
                            onClick = { picker.launch(arrayOf("application/pdf")) },
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text("Choose another file")
                        }
                    }
                }
            }
        }

        if (uri != null) {
            item { SectionTitle("Pages") }
            item {
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    TextButton(onClick = { selected = (0 until pageCount).toSet() }) { Text("All") }
                    TextButton(onClick = { selected = emptySet() }) { Text("None") }
                }
                PageChips(pageCount, selected) { idx ->
                    selected = if (idx in selected) selected - idx else selected + idx
                }
            }

            item { SectionTitle("Enhancements") }
            item {
                Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                    ToggleRow("Invert colors", invert) { invert = it }
                    ToggleRow("Grayscale", grayscale) { grayscale = it }
                    ToggleRow("Clear background", clearBg) { clearBg = it }
                    if (clearBg) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text("Sensitivity", style = MaterialTheme.typography.bodySmall, color = AppColors.TextSecondary)
                            Spacer(Modifier.width(12.dp))
                            Slider(
                                value = threshold.toFloat(),
                                onValueChange = { threshold = it.roundToInt() },
                                valueRange = 0f..255f,
                                modifier = Modifier.weight(1f)
                            )
                            Text("$threshold", color = AppColors.TextPrimary)
                        }
                    }
                    ToggleRow("Black & white", bw) { bw = it }
                }
            }

            item { SectionTitle("Logo removal") }
            item {
                Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    ToggleRow("Remove logos", removeLogo) { removeLogo = it }
                    if (removeLogo && preview != null) {
                        LogoEditor(preview!!, logo1, logo2)
                    }
                }
            }

            item { SectionTitle("Output") }
            item {
                Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                    Text("Quality", style = MaterialTheme.typography.bodySmall, color = AppColors.TextSecondary)
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        Quality.entries.forEach { q ->
                            FilterChip(
                                selected = quality == q,
                                onClick = { quality = q },
                                label = { Text(q.label) }
                            )
                        }
                    }
                    Spacer(Modifier.height(4.dp))
                    Text("Paper size", style = MaterialTheme.typography.bodySmall, color = AppColors.TextSecondary)
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        FilterChip(
                            selected = sizeMode == DocumentSize.ORIGINAL,
                            onClick = { sizeMode = DocumentSize.ORIGINAL },
                            label = { Text("Original page size") }
                        )
                        FilterChip(
                            selected = sizeMode == DocumentSize.N_UP,
                            onClick = { sizeMode = DocumentSize.N_UP },
                            label = { Text("A4 sheets") }
                        )
                    }
                    if (sizeMode == DocumentSize.N_UP) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text("Columns", color = AppColors.TextSecondary)
                            Spacer(Modifier.weight(1f))
                            StepButton("-") { cols = (cols - 1).coerceAtLeast(1) }
                            Text(" $cols ", fontWeight = FontWeight.Bold)
                            StepButton("+") { cols = (cols + 1).coerceAtMost(3) }
                            Spacer(Modifier.width(20.dp))
                            Text("Rows", color = AppColors.TextSecondary)
                            Spacer(Modifier.weight(1f))
                            StepButton("-") { rows = (rows - 1).coerceAtLeast(1) }
                            Text(" $rows ", fontWeight = FontWeight.Bold)
                            StepButton("+") { rows = (rows + 1).coerceAtMost(3) }
                        }
                        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                            FilterChip(
                                selected = orientation == Orientation.PORTRAIT,
                                onClick = { orientation = Orientation.PORTRAIT },
                                label = { Text("Portrait") }
                            )
                            FilterChip(
                                selected = orientation == Orientation.LANDSCAPE,
                                onClick = { orientation = Orientation.LANDSCAPE },
                                label = { Text("Landscape") }
                            )
                        }
                    }
                    ToggleRow("Page numbers", pageNumbers) { pageNumbers = it }
                    ToggleRow("Separation lines", sepLines) { sepLines = it }
                }
            }

            item {
                Button(
                    onClick = {
                        if (selected.isEmpty()) return@Button
                        busy = true
                        progress = 0f
                        scope.launch {
                            try {
                                val items = selected.sorted().map { PageItem(uri!!, it) }
                                val boxes = mutableListOf<Pair<android.graphics.RectF, String>>()
                                if (logo1.value.w > 0.02f && logo1.value.h > 0.02f) {
                                    boxes.add(android.graphics.RectF(
                                        logo1.value.left, logo1.value.top,
                                        logo1.value.left + logo1.value.w, logo1.value.top + logo1.value.h
                                    ) to (if (logo1.value.circle) "circle" else "square"))
                                }
                                if (logo2.value.w > 0.02f && logo2.value.h > 0.02f) {
                                    boxes.add(android.graphics.RectF(
                                        logo2.value.left, logo2.value.top,
                                        logo2.value.left + logo2.value.w, logo2.value.top + logo2.value.h
                                    ) to (if (logo2.value.circle) "circle" else "square"))
                                }
                                val filter = FilterSettings(
                                    invertColors = invert,
                                    grayscale = grayscale,
                                    clearBackground = clearBg,
                                    blackAndWhite = bw,
                                    backgroundThreshold = threshold,
                                    removeLogo = removeLogo && boxes.isNotEmpty(),
                                    logoBoxes = boxes
                                )
                                val output = OutputSettings(
                                    quality = quality,
                                    documentSize = sizeMode,
                                    orientation = orientation,
                                    nupRows = rows,
                                    nupColumns = cols,
                                    addPageNumbers = pageNumbers,
                                    addSeparationLines = sepLines
                                )
                                val res = PdfEngine.process(
                                    context, PdfEngine.Mode.CONVERT, items, filter, output
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
                    modifier = Modifier.fillMaxWidth(),
                    enabled = selected.isNotEmpty() && !busy,
                    colors = ButtonDefaults.buttonColors(containerColor = AppColors.Accent),
                    shape = RoundedCornerShape(14.dp)
                ) {
                    Text(if (busy) "Working..." else "Convert ${selected.size} page${if (selected.size == 1) "" else "s"}")
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

@Composable
private fun SectionTitle(text: String) {
    Text(
        text,
        style = MaterialTheme.typography.titleSmall,
        fontWeight = FontWeight.SemiBold,
        color = AppColors.TextPrimary
    )
}

@Composable
private fun ToggleRow(label: String, value: Boolean, onChange: (Boolean) -> Unit) {
    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
        Text(label, style = MaterialTheme.typography.bodyMedium, color = AppColors.TextPrimary)
        Spacer(Modifier.weight(1f))
        Switch(checked = value, onCheckedChange = onChange)
    }
}

@Composable
private fun StepButton(label: String, onClick: () -> Unit) {
    OutlinedButton(onClick = onClick, contentPadding = androidx.compose.foundation.layout.PaddingValues(8.dp)) {
        Text(label)
    }
}

@Composable
private fun PageChips(pageCount: Int, selected: Set<Int>, onToggle: (Int) -> Unit) {
    Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
        val chunked = (0 until pageCount).toList().chunked(12)
        chunked.forEach { chunk ->
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp), modifier = Modifier.fillMaxWidth()) {
                chunk.forEach { idx ->
                    FilterChip(
                        selected = idx in selected,
                        onClick = { onToggle(idx) },
                        label = { Text((idx + 1).toString()) }
                    )
                }
            }
        }
    }
}

@Composable
private fun LogoEditor(preview: Bitmap, logo1: androidx.compose.runtime.MutableState<LogoBox>, logo2: androidx.compose.runtime.MutableState<LogoBox>) {
    val previewW = preview.width
    val previewH = preview.height
    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(240.dp)
                .padding(4.dp)
        ) {
            Image(
                bitmap = preview.asImageBitmap(),
                contentDescription = "Page preview",
                contentScale = ContentScale.Fit,
                modifier = Modifier.matchParentSize()
            )
            val slots = listOf(
                Pair(logo1, "Logo 1"),
                Pair(logo2, "Logo 2")
            )
            slots.forEach { (slot, label) ->
                val px = { v: Float -> v * previewW }
                val box = slot.value
                Box(
                    modifier = Modifier
                        .offset { IntOffset(px(box.left).toInt(), px(box.top).toInt()) }
                        .size(width = (box.w * previewW).toInt().dp, height = (box.h * previewH).toInt().dp)
                        .border(2.dp, AppColors.Accent)
                        .pointerInput(slot.value) {
                            detectDragGestures { change, drag ->
                                change.consume()
                                box.left = (box.left + drag.x / previewW).coerceIn(0f, 1f - box.w)
                                box.top = (box.top + drag.y / previewH).coerceIn(0f, 1f - box.h)
                            }
                        }
                ) {
                    Text(
                        label,
                        fontSize = androidx.compose.ui.unit.TextUnit.Unspecified,
                        color = Color.White,
                        modifier = Modifier
                            .align(Alignment.TopStart)
                            .background(AppColors.Accent)
                            .padding(2.dp)
                    )
                    Box(
                        modifier = Modifier
                            .align(Alignment.BottomEnd)
                            .size(16.dp)
                            .background(Color.White)
                            .pointerInput(slot.value) {
                                detectDragGestures { change, drag ->
                                    change.consume()
                                    box.w = (box.w + drag.x / previewW).coerceIn(0.02f, 1f - box.left)
                                    box.h = (box.h + drag.y / previewH).coerceIn(0.02f, 1f - box.top)
                                }
                            }
                    )
                }
            }
        }
        Text(
            "Drag boxes over logos; drag the white corner to resize. Toggle shape:",
            style = MaterialTheme.typography.bodySmall,
            color = AppColors.TextSecondary,
            modifier = Modifier.padding(horizontal = 12.dp, vertical = 4.dp)
        )
        Row(Modifier.padding(horizontal = 12.dp, vertical = 8.dp), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            listOf(Pair(logo1, "Logo 1"), Pair(logo2, "Logo 2")).forEach { (slot, label) ->
                TextButton(onClick = { slot.value = slot.value.copy(circle = !slot.value.circle) }) {
                    Text("$label: ${if (slot.value.circle) "Circle" else "Square"}")
                }
            }
        }
    }
}

private suspend fun countPages(context: android.content.Context, uri: Uri): Int = withContext(Dispatchers.IO) {
    val fd = context.contentResolver.openFileDescriptor(uri, "r") ?: return@withContext 0
    fd.use { pfd ->
        PdfRenderer(pfd).use { it.pageCount }
    }
}

private suspend fun renderPreview(context: android.content.Context, uri: Uri, targetWidth: Int): Bitmap? =
    withContext(Dispatchers.IO) {
        val fd = context.contentResolver.openFileDescriptor(uri, "r") ?: return@withContext null
        fd.use { pfd ->
            PdfRenderer(pfd).use { r ->
                if (r.pageCount == 0) return@withContext null
                val page = r.openPage(0)
                page.use { p ->
                    val scale = targetWidth.toFloat() / p.width
                    val w = (p.width * scale).toInt()
                    val h = (p.height * scale).toInt()
                    val bmp = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888)
                    p.render(bmp, null, null, PdfRenderer.Page.RENDER_MODE_FOR_DISPLAY)
                    bmp
                }
            }
        }
    }
