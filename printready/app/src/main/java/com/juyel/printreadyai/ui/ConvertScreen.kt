package com.juyel.printreadyai.ui

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Color as AndroidColor
import android.graphics.RectF
import android.graphics.pdf.PdfRenderer
import android.net.Uri
import android.provider.OpenableColumns
import androidx.activity.compose.BackHandler
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.ArrowBack
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.AutoFixHigh
import androidx.compose.material.icons.outlined.Bolt
import androidx.compose.material.icons.outlined.Check
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material.icons.outlined.CloudUpload
import androidx.compose.material.icons.outlined.Contrast
import androidx.compose.material.icons.outlined.ContentCut
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material.icons.outlined.Download
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.FilterNone
import androidx.compose.material.icons.outlined.GridView
import androidx.compose.material.icons.outlined.InvertColors
import androidx.compose.material.icons.outlined.MergeType
import androidx.compose.material.icons.outlined.OpenInNew
import androidx.compose.material.icons.outlined.Refresh
import androidx.compose.material.icons.outlined.Reorder
import androidx.compose.material.icons.outlined.Security
import androidx.compose.material.icons.outlined.Share
import androidx.compose.material.icons.outlined.Tonality
import androidx.compose.material.icons.outlined.VerticalSplit
import androidx.compose.material.icons.outlined.FormatListNumbered
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Slider
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.juyel.printreadyai.core.DocumentSize
import com.juyel.printreadyai.core.FilterSettings
import com.juyel.printreadyai.core.Orientation
import com.juyel.printreadyai.core.OutputSettings
import com.juyel.printreadyai.core.PageItem
import com.juyel.printreadyai.core.PdfEngine
import com.juyel.printreadyai.core.Quality
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.math.roundToInt

// ---------- Data ----------
private data class PdfDoc(val uri: Uri, val name: String, val size: Long, val pageCount: Int)
private data class FlowPage(val docUri: Uri, val pageIndex: Int, val isSelected: Boolean = true, val thumbnail: Bitmap? = null)
private data class FlowResult(val outputUri: String, val originalSize: Long, val processedSize: Long, val pageCount: Int)
private data class LogoRegion(val left: Float = 0.05f, val top: Float = 0.05f, val w: Float = 0.4f, val h: Float = 0.15f)

private fun formatSize(bytes: Long): String = when {
    bytes >= 1_000_000_000 -> "%.2f GB".format(bytes / 1e9)
    bytes >= 1_000_000 -> "%.2f MB".format(bytes / 1e6)
    bytes >= 1000 -> "%.2f KB".format(bytes / 1000.0)
    else -> "$bytes B"
}

private val brandBrush = Brush.linearGradient(listOf(Color(0xFFA855F7), Color(0xFFEC4899)))

// ---------- Top bar ----------
@Composable
private fun FlowTopBar(title: String, onBack: (() -> Unit)? = null) {
    Row(
        modifier = Modifier.fillMaxWidth().padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (onBack != null) {
            IconButton(onClick = onBack) {
                Icon(Icons.AutoMirrored.Outlined.ArrowBack, contentDescription = "Back", tint = AppColors.TextPrimary)
            }
            Spacer(Modifier.width(4.dp))
        }
        Text(
            text = title,
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            color = AppColors.TextPrimary
        )
    }
}

// ---------- Main ----------
@Composable
fun ConvertScreen(nav: NavHostController) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()

    var state by remember { mutableIntStateOf(-1) }
    val docs = remember { mutableStateListOf<PdfDoc>() }
    val pages = remember { mutableStateListOf<FlowPage>() }
    var processing by remember { mutableStateOf(false) }
    var progress by remember { mutableStateOf(0f) }
    var progressInfo by remember { mutableStateOf("") }
    var progressCounts by remember { mutableStateOf(0 to 0) }
    var result by remember { mutableStateOf<FlowResult?>(null) }
    var errorMsg by remember { mutableStateOf<String?>(null) }
    var downloading by remember { mutableStateOf(false) }

    var lastItems by remember { mutableStateOf<List<PageItem>>(emptyList()) }
    var lastFilter by remember { mutableStateOf<FilterSettings>(FilterSettings()) }
    var lastOutput by remember { mutableStateOf<OutputSettings>(OutputSettings()) }

    val prefs = remember { context.getSharedPreferences("enhance_prefs", android.content.Context.MODE_PRIVATE) }
    var invert by remember { mutableStateOf(prefs.getBoolean("invert_colors", true)) }
    var clearBg by remember { mutableStateOf(prefs.getBoolean("clear_background", true)) }
    var grayscale by remember { mutableStateOf(prefs.getBoolean("grayscale", false)) }
    var bw by remember { mutableStateOf(prefs.getBoolean("black_and_white", false)) }
    var threshold by remember { mutableIntStateOf(prefs.getInt("background_threshold", 180)) }
    var quality by remember {
        mutableStateOf(runCatching { Quality.valueOf(prefs.getString("quality", "HIGH") ?: "HIGH") }.getOrDefault(Quality.HIGH))
    }
    var sizeMode by remember {
        mutableStateOf(if ((prefs.getString("document_size", "A4") ?: "A4") == "ORIGINAL") DocumentSize.ORIGINAL else DocumentSize.N_UP)
    }
    var orientation by remember {
        mutableStateOf(runCatching { Orientation.valueOf(prefs.getString("orientation", "PORTRAIT") ?: "PORTRAIT") }.getOrDefault(Orientation.PORTRAIT))
    }
    var rows by remember { mutableIntStateOf(prefs.getInt("nup_rows", 3).coerceAtLeast(1)) }
    var cols by remember { mutableIntStateOf(prefs.getInt("nup_cols", 1).coerceAtLeast(1)) }
    var sepLines by remember { mutableStateOf(prefs.getBoolean("add_separation_lines", false)) }
    var pageNumbers by remember { mutableStateOf(prefs.getBoolean("add_page_numbers", true)) }
    var removeLogo by remember { mutableStateOf(false) }
    val logoRegion = remember { mutableStateOf(LogoRegion()) }
    var logoCircle by remember { mutableStateOf(false) }

    LaunchedEffect(invert, clearBg, grayscale, bw, threshold, quality, sizeMode, orientation, rows, cols, sepLines, pageNumbers) {
        prefs.edit()
            .putBoolean("invert_colors", invert)
            .putBoolean("clear_background", clearBg)
            .putBoolean("grayscale", grayscale)
            .putBoolean("black_and_white", bw)
            .putInt("background_threshold", threshold)
            .putString("quality", quality.name)
            .putString("document_size", if (sizeMode == DocumentSize.ORIGINAL) "ORIGINAL" else "A4")
            .putString("orientation", orientation.name)
            .putInt("nup_rows", rows)
            .putInt("nup_cols", cols)
            .putBoolean("add_separation_lines", sepLines)
            .putBoolean("add_page_numbers", pageNumbers)
            .apply()
    }

    BackHandler(enabled = state > -1) {
        state = when (state) {
            0 -> -1
            2 -> 0
            3 -> 2
            4 -> 3
            6 -> 4
            else -> state
        }
    }

    val picker = rememberLauncherForActivityResult(ActivityResultContracts.GetMultipleContents()) { uris ->
        scope.launch { uris.forEach { uri -> loadDoc(context, uri)?.let { docs.add(it) } } }
    }

    Surface(modifier = Modifier.fillMaxSize(), color = AppColors.Bg) {
        when (state) {
            -1 -> FlowLanding(onStart = { state = 0 })
            0 -> FlowUpload(
                docs = docs,
                onRemove = { docs.remove(it) },
                onPick = { picker.launch("application/pdf") },
                onContinue = {
                    scope.launch {
                        pages.clear()
                        docs.forEach { d -> repeat(d.pageCount) { i -> pages.add(FlowPage(d.uri, i)) } }
                        state = 2
                        renderThumbnails(context, pages)
                    }
                },
                onBack = { state = -1 }
            )
            2 -> FlowReorder(pages = pages, onBack = { state = 0 }, onContinue = { state = 3 })
            3 -> FlowPreview(pages = pages, onBack = { state = 2 }, onContinue = { state = 4 })
            4 -> FlowEnhance(
                pages = pages,
                invert = invert, onInvert = { invert = it },
                clearBg = clearBg, onClearBg = { clearBg = it },
                grayscale = grayscale, onGrayscale = { grayscale = it },
                bw = bw, onBw = { bw = it },
                threshold = threshold, onThreshold = { threshold = it },
                quality = quality, onQuality = { quality = it },
                sizeMode = sizeMode, onSizeMode = { sizeMode = it },
                orientation = orientation, onOrientation = { orientation = it },
                rows = rows, onRows = { rows = it.coerceIn(1, 3) },
                cols = cols, onCols = { cols = it.coerceIn(1, 3) },
                sepLines = sepLines, onSepLines = { sepLines = it },
                pageNumbers = pageNumbers, onPageNumbers = { pageNumbers = it },
                removeLogo = removeLogo, onRemoveLogo = { removeLogo = it },
                logoRegion = logoRegion,
                logoCircle = logoCircle,
                onLogoCircle = { logoCircle = it },
                onBack = { state = 3 },
                onProcess = {
                    val items = pages.filter { it.isSelected }.map { PageItem(it.docUri, it.pageIndex) }
                    if (items.isEmpty()) { errorMsg = "Please select at least one page."; return@FlowEnhance }
                    val boxes = if (removeLogo) {
                        val r = logoRegion.value
                        listOf(RectF(r.left, r.top, r.left + r.w, r.top + r.h) to if (logoCircle) "circle" else "square")
                    } else emptyList()
                    val filter = FilterSettings(
                        invertColors = invert,
                        grayscale = grayscale,
                        clearBackground = clearBg,
                        blackAndWhite = bw,
                        backgroundThreshold = threshold,
                        removeLogo = removeLogo,
                        logoBoxes = boxes
                    )
                    val output = OutputSettings(
                        quality = quality,
                        documentSize = if (sizeMode == DocumentSize.ORIGINAL) DocumentSize.ORIGINAL else DocumentSize.N_UP,
                        orientation = orientation,
                        nupRows = rows,
                        nupColumns = cols,
                        addPageNumbers = pageNumbers,
                        addSeparationLines = sepLines
                    )
                    lastItems = items; lastFilter = filter; lastOutput = output
                    state = 5
                    processing = true
                    scope.launch {
                        try {
                            val originalSize = docs.sumOf { it.size }
                            val outUri = PdfEngine.process(context, PdfEngine.Mode.CONVERT, items, filter, output) { p ->
                                progress = if (p.total > 0) p.done.toFloat() / p.total else 0f
                                progressInfo = p.stage
                                progressCounts = p.done to p.total
                            }
                            val processedSize = querySize(context, Uri.parse(outUri))
                            result = FlowResult(outUri, originalSize, processedSize, items.size)
                            state = 6
                        } catch (e: Exception) {
                            errorMsg = e.message ?: "Unknown error"
                            state = 4
                        } finally { processing = false }
                    }
                }
            )
            5 -> FlowProcessing(progress, progressCounts, progressInfo)
            6 -> result?.let {
                FlowSuccess(
                    result = it,
                    onBack = { state = 4 },
                    onView = { openView(context, it.outputUri) },
                    onShare = { openShare(context, it.outputUri) },
                    onDownload = {
                        downloading = true
                        scope.launch {
                            try {
                                val outUri = PdfEngine.process(context, PdfEngine.Mode.CONVERT, lastItems, lastFilter, lastOutput) { p ->
                                    progress = if (p.total > 0) p.done.toFloat() / p.total else 0f
                                    progressInfo = p.stage
                                    progressCounts = p.done to p.total
                                }
                                val ps = querySize(context, Uri.parse(outUri))
                                result = it.copy(outputUri = outUri, processedSize = ps)
                            } finally { downloading = false }
                        }
                    },
                    onProcessAnother = {
                        state = -1
                        docs.clear()
                        pages.clear()
                        result = null
                        progress = 0f
                    },
                    downloading = downloading
                )
            } ?: FlowLanding(onStart = { state = 0 })
        }

        errorMsg?.let { msg ->
            androidx.compose.material3.AlertDialog(
                onDismissRequest = { errorMsg = null },
                title = { Text("Error") },
                text = { Text(msg) },
                confirmButton = { TextButton(onClick = { errorMsg = null }) { Text("OK") } }
            )
        }
    }
}

// ---------- Helpers ----------
private fun queryDisplayName(ctx: android.content.Context, uri: Uri): String? = try {
    ctx.contentResolver.query(uri, null, null, null, null)?.use { c ->
        val idx = c.getColumnIndex(OpenableColumns.DISPLAY_NAME)
        if (idx >= 0 && c.moveToFirst()) c.getString(idx) else null
    }
} catch (t: Throwable) { null }

private fun querySize(ctx: android.content.Context, uri: Uri): Long = try {
    ctx.contentResolver.openFileDescriptor(uri, "r")?.use { it.statSize } ?: 0L
} catch (t: Throwable) { 0L }

private suspend fun countPages(ctx: android.content.Context, uri: Uri): Int = withContext(Dispatchers.IO) {
    try {
        val fd = ctx.contentResolver.openFileDescriptor(uri, "r") ?: return@withContext 0
        fd.use { PdfRenderer(it).use { r -> r.pageCount } }
    } catch (t: Throwable) { 0 }
}

private suspend fun renderThumb(ctx: android.content.Context, uri: Uri, index: Int, width: Int): Bitmap? = withContext(Dispatchers.IO) {
    try {
        val fd = ctx.contentResolver.openFileDescriptor(uri, "r") ?: return@withContext null
        fd.use { pfd ->
            PdfRenderer(pfd).use { r ->
                if (index >= r.pageCount) return@withContext null
                r.openPage(index).use { p ->
                    val scale = width.toFloat() / p.width
                    val w = (p.width * scale).toInt().coerceAtLeast(1)
                    val h = (p.height * scale).toInt().coerceAtLeast(1)
                    val bmp = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888)
                    bmp.eraseColor(AndroidColor.WHITE)
                    p.render(bmp, null, null, PdfRenderer.Page.RENDER_MODE_FOR_DISPLAY)
                    bmp
                }
            }
        }
    } catch (t: Throwable) { null }
}

private suspend fun renderThumbnails(ctx: android.content.Context, pages: MutableList<FlowPage>) {
    pages.indices.forEach { i ->
        val pg = pages[i]
        val bmp = renderThumb(ctx, pg.docUri, pg.pageIndex, 160)
        if (bmp != null) pages[i] = pg.copy(thumbnail = bmp)
    }
}

private suspend fun loadDoc(ctx: android.content.Context, uri: Uri): PdfDoc? = withContext(Dispatchers.IO) {
    val name = queryDisplayName(ctx, uri) ?: "document.pdf"
    val size = ctx.contentResolver.openFileDescriptor(uri, "r")?.use { it.statSize } ?: 0L
    val count = countPages(ctx, uri)
    if (count <= 0) null else PdfDoc(uri, name, size, count)
}

private fun openView(ctx: android.content.Context, uri: String) {
    val intent = Intent(Intent.ACTION_VIEW).apply {
        setDataAndType(Uri.parse(uri), "application/pdf")
        addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
    }
    runCatching { ctx.startActivity(intent) }
}

private fun openShare(ctx: android.content.Context, uri: String) {
    val intent = Intent(Intent.ACTION_SEND).apply {
        type = "application/pdf"
        putExtra(Intent.EXTRA_STREAM, Uri.parse(uri))
        addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
    }
    runCatching { ctx.startActivity(Intent.createChooser(intent, "Share PDF")) }
}

// ---------- State -1: Landing ----------
@Composable
private fun FlowLanding(onStart: () -> Unit) {
    val steps = listOf(
        Triple("Upload PDF", "No server upload required.", Icons.Outlined.CloudUpload),
        Triple("Preview & Edit", "Select pages to keep.", Icons.Outlined.Edit),
        Triple("Enhance", "Invert colors & clean background.", Icons.Outlined.AutoFixHigh),
        Triple("Layout", "Multiple slides per page.", Icons.Outlined.GridView),
        Triple("Process", "On-device processing.", Icons.Outlined.Bolt),
        Triple("Download", "Print-ready PDF.", Icons.Outlined.Download)
    )
    val chips = listOf(
        Icons.Outlined.Bolt to "Lightning Fast",
        Icons.Outlined.Security to "Complete Privacy",
        Icons.Outlined.OpenInNew to "Print-Optimized",
        Icons.Outlined.Download to "No Installation",
        Icons.Outlined.Check to "Save Ink & Paper",
        Icons.Outlined.CheckCircle to "100% Free"
    )

    Column(
        modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(Modifier.height(20.dp))
        Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
            Surface(shape = RoundedCornerShape(999.dp), color = Color.Transparent, modifier = Modifier.border(1.dp, brandBrush, RoundedCornerShape(999.dp))) {
                Row(Modifier.padding(horizontal = 12.dp, vertical = 6.dp), verticalAlignment = Alignment.CenterVertically) {
                    Icon(Icons.Outlined.AutoFixHigh, null, tint = AppColors.Accent, modifier = Modifier.size(14.dp))
                    Spacer(Modifier.width(6.dp))
                    Text("AI-Inspired Document Processing", fontSize = 11.sp, fontWeight = FontWeight.SemiBold, color = AppColors.TextPrimary)
                }
            }
            Surface(shape = RoundedCornerShape(999.dp), color = Color.Transparent, modifier = Modifier.border(1.dp, AppColors.Accent.copy(alpha = 0.4f), RoundedCornerShape(999.dp))) {
                Row(Modifier.padding(horizontal = 10.dp, vertical = 6.dp), verticalAlignment = Alignment.CenterVertically) {
                    Icon(Icons.Outlined.FavoriteBorder, null, tint = AppColors.Accent, modifier = Modifier.size(14.dp))
                    Spacer(Modifier.width(6.dp))
                    Text("Free Forever", fontSize = 11.sp, fontWeight = FontWeight.SemiBold, color = AppColors.TextPrimary)
                }
            }
        }

        Spacer(Modifier.height(40.dp))
        Text(
            "Make Your Notes",
            fontSize = 38.sp,
            fontWeight = FontWeight.ExtraBold,
            color = AppColors.TextPrimary,
            textAlign = TextAlign.Center
        )
        Text(
            "Printable",
            fontSize = 44.sp,
            fontWeight = FontWeight.ExtraBold,
            color = AppColors.Accent,
            textAlign = TextAlign.Center
        )
        Text(
            "Convert dark slides & PDFs into clean, ink-saving printable notes.",
            fontSize = 14.sp,
            color = AppColors.TextSecondary,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 8.dp)
        )

        Spacer(Modifier.height(32.dp))
        Button(
            onClick = onStart,
            colors = ButtonDefaults.buttonColors(containerColor = AppColors.Accent),
            shape = RoundedCornerShape(16.dp),
            contentPadding = PaddingValues(horizontal = 24.dp, vertical = 14.dp)
        ) {
            Icon(Icons.Outlined.CloudUpload, null, Modifier.size(20.dp))
            Spacer(Modifier.width(8.dp))
            Text("Start Processing", fontWeight = FontWeight.Bold)
        }

        Spacer(Modifier.height(44.dp))
        Text("How It Works", style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Bold, color = AppColors.TextPrimary)
        Spacer(Modifier.height(16.dp))
        steps.forEachIndexed { i, (title, sub, icon) ->
            Row(
                modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier.size(36.dp).clip(CircleShape).background(brandBrush),
                    contentAlignment = Alignment.Center
                ) {
                    Text("${i + 1}", fontWeight = FontWeight.Bold, color = Color.White)
                }
                Spacer(Modifier.width(12.dp))
                Column(Modifier.weight(1f)) {
                    Text(title, fontWeight = FontWeight.SemiBold, color = AppColors.TextPrimary)
                    Text(sub, style = MaterialTheme.typography.bodySmall, color = AppColors.TextSecondary)
                }
                Icon(icon, null, tint = AppColors.Accent, modifier = Modifier.size(22.dp))
            }
        }

        Spacer(Modifier.height(32.dp))
        Text("Why Choose Us?", style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Bold, color = AppColors.TextPrimary)
        Spacer(Modifier.height(16.dp))
        chips.chunked(2).forEach { row ->
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                row.forEach { (icon, label) ->
                    Card(
                        shape = RoundedCornerShape(14.dp),
                        colors = CardDefaults.cardColors(containerColor = AppColors.Surface),
                        modifier = Modifier.weight(1f)
                    ) {
                        Row(Modifier.padding(12.dp), verticalAlignment = Alignment.CenterVertically) {
                            Icon(icon, null, tint = AppColors.Accent, modifier = Modifier.size(18.dp))
                            Spacer(Modifier.width(8.dp))
                            Text(label, fontSize = 12.sp, fontWeight = FontWeight.SemiBold, color = AppColors.TextPrimary)
                        }
                    }
                }
            }
            Spacer(Modifier.height(10.dp))
        }
        Spacer(Modifier.height(40.dp))
    }
}

// ---------- State 0: Upload ----------
@Composable
private fun FlowUpload(
    docs: List<PdfDoc>,
    onRemove: (PdfDoc) -> Unit,
    onPick: () -> Unit,
    onContinue: () -> Unit,
    onBack: () -> Unit
) {
    val tiles = listOf(
        Triple(Icons.Outlined.Reorder, "Reorder", "Organize pages"),
        Triple(Icons.Outlined.Edit, "Edit Pages", "Modify content"),
        Triple(Icons.Outlined.ContentCut, "Remove Logo", "Clean pages"),
        Triple(Icons.Outlined.Tonality, "Grayscale", "Save ink"),
        Triple(Icons.Outlined.VerticalSplit, "Separators", "Add lines"),
        Triple(Icons.Outlined.FormatListNumbered, "Page No", "Add numbering"),
        Triple(Icons.Outlined.MergeType, "Merge PDFs", "Combine files"),
        Triple(Icons.Outlined.InvertColors, "Invert Colors", "Dark to Light"),
        Triple(Icons.Outlined.AutoFixHigh, "Clear Background", "Remove noise"),
        Triple(Icons.Outlined.GridView, "Multiple Slides", "Grid layout"),
        Triple(Icons.Outlined.Delete, "Remove Slides", "Delete pages"),
        Triple(Icons.Outlined.Contrast, "Black & White", "High contrast")
    )

    Column(Modifier.fillMaxSize()) {
        FlowTopBar("Upload Files", onBack)
        LazyColumn(
            modifier = Modifier.weight(1f),
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            item {
                Text("Select PDF files from your device to begin processing.", color = AppColors.TextSecondary, modifier = Modifier.padding(bottom = 10.dp))
            }
            item {
                Card(
                    shape = RoundedCornerShape(18.dp),
                    colors = CardDefaults.cardColors(containerColor = AppColors.Surface),
                    modifier = Modifier.fillMaxWidth().clickable(onClick = onPick)
                ) {
                    Column(
                        modifier = Modifier.fillMaxWidth().padding(24.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Box(
                            modifier = Modifier.size(52.dp).clip(CircleShape).background(brandBrush),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(Icons.Outlined.CloudUpload, null, tint = Color.White, modifier = Modifier.size(26.dp))
                        }
                        Spacer(Modifier.height(12.dp))
                        Text("Tap to select PDF files", fontWeight = FontWeight.SemiBold, color = AppColors.TextPrimary)
                        Text("All processing happens on your device", style = MaterialTheme.typography.bodySmall, color = AppColors.TextSecondary)
                    }
                }
            }
            if (docs.isEmpty()) {
                item {
                    Card(
                        shape = RoundedCornerShape(16.dp),
                        colors = CardDefaults.cardColors(containerColor = AppColors.Surface),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(Modifier.padding(16.dp).fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                            Stat("300k+", "Files Processed")
                            Stat("50k+", "Students Helped")
                            Stat("5k+", "Thank You")
                        }
                    }
                }
            }
            if (docs.isNotEmpty()) {
                item {
                    Text("Selected files", fontWeight = FontWeight.SemiBold, color = AppColors.TextPrimary, modifier = Modifier.padding(top = 4.dp))
                }
                items(docs) { d ->
                    Card(
                        shape = RoundedCornerShape(14.dp),
                        colors = CardDefaults.cardColors(containerColor = AppColors.Surface),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(Modifier.padding(12.dp), verticalAlignment = Alignment.CenterVertically) {
                            Icon(Icons.Outlined.FilterNone, null, tint = AppColors.Accent, modifier = Modifier.size(22.dp))
                            Spacer(Modifier.width(10.dp))
                            Column(Modifier.weight(1f)) {
                                Text(d.name, fontWeight = FontWeight.SemiBold, color = AppColors.TextPrimary, maxLines = 1, overflow = TextOverflow.Ellipsis)
                                Text("${formatSize(d.size)} · ${d.pageCount} pages", style = MaterialTheme.typography.bodySmall, color = AppColors.TextSecondary)
                            }
                            IconButton(onClick = { onRemove(d) }) {
                                Icon(Icons.Outlined.Delete, null, tint = AppColors.Danger)
                            }
                        }
                    }
                }
            }
            item {
                Text("What you can do", fontWeight = FontWeight.SemiBold, color = AppColors.TextPrimary, modifier = Modifier.padding(top = 6.dp))
            }
            item {
                Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    tiles.chunked(2).forEach { row ->
                        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                            row.forEach { (icon, title, sub) ->
                                Card(
                                    shape = RoundedCornerShape(14.dp),
                                    colors = CardDefaults.cardColors(containerColor = AppColors.Surface),
                                    modifier = Modifier.weight(1f)
                                ) {
                                    Column(Modifier.padding(12.dp)) {
                                        Icon(icon, null, tint = AppColors.Accent, modifier = Modifier.size(20.dp))
                                        Spacer(Modifier.height(6.dp))
                                        Text(title, fontSize = 13.sp, fontWeight = FontWeight.SemiBold, color = AppColors.TextPrimary)
                                        Text(sub, fontSize = 11.sp, color = AppColors.TextSecondary)
                                    }
                                }
                            }
                        }
                    }
                }
            }
            item { Spacer(Modifier.height(20.dp)) }
        }
        Button(
            onClick = onContinue,
            enabled = docs.isNotEmpty(),
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = AppColors.Accent)
        ) {
            Text("Continue", fontWeight = FontWeight.Bold)
        }
    }
}

@Composable
private fun Stat(value: String, label: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(value, fontSize = 18.sp, fontWeight = FontWeight.Bold, color = AppColors.Accent)
        Text(label, fontSize = 11.sp, color = AppColors.TextSecondary)
    }
}

// ---------- State 2: Reorder ----------
@Composable
private fun FlowReorder(pages: MutableList<FlowPage>, onBack: () -> Unit, onContinue: () -> Unit) {
    var picked by remember { mutableIntStateOf(-1) }
    Column(Modifier.fillMaxSize()) {
        FlowTopBar("Reorder Pages", onBack)
        Text(
            "Tap a page then tap another to swap. Use the check to include/exclude.",
            style = MaterialTheme.typography.bodySmall,
            color = AppColors.TextSecondary,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp)
        )
        LazyVerticalGrid(
            columns = GridCells.Fixed(3),
            contentPadding = PaddingValues(horizontal = 12.dp, vertical = 8.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.weight(1f)
        ) {
            itemsIndexed(pages) { idx, page ->
                val isPicked = idx == picked
                Column(
                    modifier = Modifier
                        .clip(RoundedCornerShape(12.dp))
                        .background(AppColors.Surface)
                        .border(
                            width = if (isPicked) 2.dp else 0.dp,
                            color = if (isPicked) AppColors.Accent else Color.Transparent,
                            shape = RoundedCornerShape(12.dp)
                        )
                        .clickable {
                            if (picked == -1) picked = idx
                            else if (picked == idx) picked = -1
                            else {
                                val a = pages[picked]; val b = pages[idx]
                                pages[picked] = b; pages[idx] = a
                                picked = -1
                            }
                        }
                        .padding(8.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(140.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color.White)
                    ) {
                        page.thumbnail?.let { Image(it.asImageBitmap(), null, contentScale = ContentScale.Fit, modifier = Modifier.matchParentSize()) }
                            ?: Box(Modifier.matchParentSize(), contentAlignment = Alignment.Center) {
                                CircularProgressIndicator(strokeWidth = 2.dp, modifier = Modifier.size(20.dp))
                            }
                        Row(
                            modifier = Modifier.align(Alignment.TopEnd).padding(4.dp),
                            horizontalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            Icon(
                                if (page.isSelected) Icons.Outlined.CheckCircle else Icons.Outlined.Check,
                                null,
                                tint = if (page.isSelected) AppColors.Accent else AppColors.TextSecondary,
                                modifier = Modifier.size(20.dp).clickable {
                                    pages[idx] = page.copy(isSelected = !page.isSelected)
                                }
                            )
                        }
                    }
                    Spacer(Modifier.height(6.dp))
                    Text("Page ${idx + 1}", fontSize = 12.sp, fontWeight = FontWeight.SemiBold, color = AppColors.TextPrimary, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
                    if (!page.isSelected) {
                        Text("Excluded", fontSize = 10.sp, color = AppColors.Danger, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
                    }
                }
            }
        }
        Button(
            onClick = onContinue,
            enabled = pages.any { it.isSelected },
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = AppColors.Accent)
        ) {
            Text("Continue", fontWeight = FontWeight.Bold)
        }
    }
}

// ---------- State 3: Preview ----------
@Composable
private fun FlowPreview(pages: MutableList<FlowPage>, onBack: () -> Unit, onContinue: () -> Unit) {
    val selected = pages.count { it.isSelected }
    Column(Modifier.fillMaxSize()) {
        FlowTopBar("Preview & Edit", onBack)
        Row(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            FilledTonalButton(onClick = {
                pages.indices.forEach { i -> pages[i] = pages[i].copy(isSelected = true) }
            }) { Text("All") }
            Spacer(Modifier.width(6.dp))
            OutlinedButton(onClick = {
                pages.indices.forEach { i -> pages[i] = pages[i].copy(isSelected = false) }
            }) { Text("None") }
            Spacer(Modifier.weight(1f))
            Text("$selected / ${pages.size} selected", color = AppColors.TextSecondary)
        }
        LazyVerticalGrid(
            columns = GridCells.Fixed(3),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.weight(1f)
        ) {
            itemsIndexed(pages) { idx, page ->
                Column(
                    modifier = Modifier
                        .clip(RoundedCornerShape(12.dp))
                        .background(AppColors.Surface)
                        .clickable {
                            pages[idx] = page.copy(isSelected = !page.isSelected)
                        }
                        .padding(8.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(140.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color.White)
                    ) {
                        page.thumbnail?.let {
                            Image(
                                it.asImageBitmap(),
                                null,
                                contentScale = ContentScale.Fit,
                                modifier = Modifier.matchParentSize().let { m ->
                                    if (!page.isSelected) m.graphicsLayer { alpha = 0.35f } else m
                                }
                            )
                        } ?: Box(Modifier.matchParentSize(), contentAlignment = Alignment.Center) {
                            CircularProgressIndicator(strokeWidth = 2.dp, modifier = Modifier.size(20.dp))
                        }
                        if (page.isSelected) {
                            Box(
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(4.dp)
                                    .size(22.dp)
                                    .clip(CircleShape)
                                    .background(AppColors.Accent),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(Icons.Outlined.Check, null, tint = Color.White, modifier = Modifier.size(14.dp))
                            }
                        }
                    }
                    Spacer(Modifier.height(6.dp))
                    Text("Page ${idx + 1}", fontSize = 12.sp, fontWeight = FontWeight.SemiBold, color = AppColors.TextPrimary, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
                }
            }
        }
        Button(
            onClick = onContinue,
            enabled = selected > 0,
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = AppColors.Accent)
        ) {
            Text("Continue to Enhance", fontWeight = FontWeight.Bold)
        }
    }
}

// ---------- State 4: Enhance ----------
@Composable
private fun FlowEnhance(
    pages: List<FlowPage>,
    invert: Boolean, onInvert: (Boolean) -> Unit,
    clearBg: Boolean, onClearBg: (Boolean) -> Unit,
    grayscale: Boolean, onGrayscale: (Boolean) -> Unit,
    bw: Boolean, onBw: (Boolean) -> Unit,
    threshold: Int, onThreshold: (Int) -> Unit,
    quality: Quality, onQuality: (Quality) -> Unit,
    sizeMode: DocumentSize, onSizeMode: (DocumentSize) -> Unit,
    orientation: Orientation, onOrientation: (Orientation) -> Unit,
    rows: Int, onRows: (Int) -> Unit,
    cols: Int, onCols: (Int) -> Unit,
    sepLines: Boolean, onSepLines: (Boolean) -> Unit,
    pageNumbers: Boolean, onPageNumbers: (Boolean) -> Unit,
    removeLogo: Boolean, onRemoveLogo: (Boolean) -> Unit,
    logoRegion: androidx.compose.runtime.MutableState<LogoRegion>,
    logoCircle: Boolean,
    onLogoCircle: (Boolean) -> Unit,
    onBack: () -> Unit,
    onProcess: () -> Unit
) {
    val context = LocalContext.current
    var previewBmp by remember { mutableStateOf<Bitmap?>(null) }
    val firstPage = pages.firstOrNull()
    LaunchedEffect(firstPage) {
        if (firstPage != null) {
            previewBmp = renderThumb(context, firstPage.docUri, firstPage.pageIndex, 640)
        }
    }

    Column(Modifier.fillMaxSize()) {
        FlowTopBar("Enhance", onBack)
        LazyColumn(
            modifier = Modifier.weight(1f),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            item { SectionTitle("Filters") }
            item {
                Card(shape = RoundedCornerShape(16.dp), colors = CardDefaults.cardColors(containerColor = AppColors.Surface), modifier = Modifier.fillMaxWidth()) {
                    Column(Modifier.padding(14.dp), verticalArrangement = Arrangement.spacedBy(4.dp)) {
                        ToggleRow("Invert colors", invert, onInvert)
                        ToggleRow("Clear background", clearBg, onClearBg)
                        if (clearBg) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text("Sensitivity", style = MaterialTheme.typography.bodySmall, color = AppColors.TextSecondary)
                                Spacer(Modifier.width(8.dp))
                                Slider(
                                    value = threshold.toFloat(),
                                    onValueChange = { onThreshold(it.roundToInt()) },
                                    valueRange = 0f..255f,
                                    modifier = Modifier.weight(1f)
                                )
                                Text("$threshold", color = AppColors.TextPrimary)
                            }
                        }
                        ToggleRow("Grayscale", grayscale, onGrayscale)
                        ToggleRow("Black & white", bw, onBw)
                    }
                }
            }
            item { SectionTitle("Logo removal") }
            item {
                Card(shape = RoundedCornerShape(16.dp), colors = CardDefaults.cardColors(containerColor = AppColors.Surface), modifier = Modifier.fillMaxWidth()) {
                    Column(Modifier.padding(14.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                        ToggleRow("Remove logos", removeLogo, onRemoveLogo)
                        if (removeLogo && previewBmp != null) {
                            LogoEditor(previewBmp!!, logoRegion, logoCircle, onLogoCircle)
                        }
                    }
                }
            }
            item { SectionTitle("Output") }
            item {
                Card(shape = RoundedCornerShape(16.dp), colors = CardDefaults.cardColors(containerColor = AppColors.Surface), modifier = Modifier.fillMaxWidth()) {
                    Column(Modifier.padding(14.dp), verticalArrangement = Arrangement.spacedBy(10.dp)) {
                        Text("Quality", style = MaterialTheme.typography.bodySmall, color = AppColors.TextSecondary)
                        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                            Quality.entries.forEach { q ->
                                FilterChip(selected = quality == q, onClick = { onQuality(q) }, label = { Text(q.label) })
                            }
                        }
                        Spacer(Modifier.height(4.dp))
                        Text("Paper size", style = MaterialTheme.typography.bodySmall, color = AppColors.TextSecondary)
                        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                            FilterChip(selected = sizeMode == DocumentSize.N_UP, onClick = { onSizeMode(DocumentSize.N_UP) }, label = { Text("A4") })
                            FilterChip(selected = sizeMode == DocumentSize.ORIGINAL, onClick = { onSizeMode(DocumentSize.ORIGINAL) }, label = { Text("Original") })
                        }
                        if (sizeMode == DocumentSize.N_UP) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text("Columns", color = AppColors.TextSecondary)
                                Spacer(Modifier.weight(1f))
                                StepButton("−") { onCols(cols - 1) }
                                Text(" $cols ", fontWeight = FontWeight.Bold)
                                StepButton("+") { onCols(cols + 1) }
                                Spacer(Modifier.width(20.dp))
                                Text("Rows", color = AppColors.TextSecondary)
                                Spacer(Modifier.weight(1f))
                                StepButton("−") { onRows(rows - 1) }
                                Text(" $rows ", fontWeight = FontWeight.Bold)
                                StepButton("+") { onRows(rows + 1) }
                            }
                            Spacer(Modifier.height(4.dp))
                            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                                FilterChip(selected = orientation == Orientation.PORTRAIT, onClick = { onOrientation(Orientation.PORTRAIT) }, label = { Text("Portrait") })
                                FilterChip(selected = orientation == Orientation.LANDSCAPE, onClick = { onOrientation(Orientation.LANDSCAPE) }, label = { Text("Landscape") })
                            }
                            ToggleRow("Separation lines", sepLines, onSepLines)
                        }
                        ToggleRow("Page numbers", pageNumbers, onPageNumbers)
                    }
                }
            }
            item { Spacer(Modifier.height(20.dp)) }
        }
        Button(
            onClick = onProcess,
            enabled = pages.any { it.isSelected },
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = AppColors.Accent)
        ) {
            Text("Process File", fontWeight = FontWeight.Bold)
        }
    }
}

@Composable
private fun SectionTitle(text: String) {
    Text(text, style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.SemiBold, color = AppColors.TextPrimary)
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
    OutlinedButton(onClick = onClick, contentPadding = PaddingValues(8.dp)) {
        Text(label)
    }
}

@Composable
private fun LogoEditor(preview: Bitmap, region: androidx.compose.runtime.MutableState<LogoRegion>, circle: Boolean, onCircle: (Boolean) -> Unit) {
    val previewW = preview.width
    val previewH = preview.height
    Card(shape = RoundedCornerShape(16.dp), colors = CardDefaults.cardColors(containerColor = AppColors.Surface)) {
        Box(modifier = Modifier.fillMaxWidth().height(240.dp).padding(4.dp)) {
            Image(bitmap = preview.asImageBitmap(), contentDescription = "Preview", contentScale = ContentScale.Fit, modifier = Modifier.matchParentSize())
            val r = region.value
            Box(
                modifier = Modifier
                    .offset { IntOffset((r.left * previewW).toInt(), (r.top * previewH).toInt()) }
                    .size(width = (r.w * previewW).toInt().dp, height = (r.h * previewH).toInt().dp)
                    .border(2.dp, AppColors.Accent, if (circle) CircleShape else RoundedCornerShape(4.dp))
                    .pointerInput(r) {
                        detectDragGestures { change, drag ->
                            change.consume()
                            region.value = r.copy(
                                left = (r.left + drag.x / previewW).coerceIn(0f, 1f - r.w),
                                top = (r.top + drag.y / previewH).coerceIn(0f, 1f - r.h)
                            )
                        }
                    }
            ) {
                Text(
                    "Logo",
                    fontSize = 10.sp,
                    color = Color.White,
                    modifier = Modifier.align(Alignment.TopStart).background(AppColors.Accent).padding(horizontal = 4.dp, vertical = 1.dp)
                )
                Box(
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .size(14.dp)
                        .background(Color.White)
                        .pointerInput(r) {
                            detectDragGestures { change, drag ->
                                change.consume()
                                region.value = r.copy(
                                    w = (r.w + drag.x / previewW).coerceIn(0.05f, 1f - r.left),
                                    h = (r.h + drag.y / previewH).coerceIn(0.05f, 1f - r.top)
                                )
                            }
                        }
                )
            }
        }
        Text(
            "Drag the box over the logo; drag the white corner to resize.",
            style = MaterialTheme.typography.bodySmall,
            color = AppColors.TextSecondary,
            modifier = Modifier.padding(horizontal = 12.dp, vertical = 4.dp)
        )
        Row(Modifier.padding(horizontal = 12.dp, vertical = 8.dp)) {
            TextButton(onClick = { onCircle(!circle) }) {
                Text("Shape: ${if (circle) "Circle" else "Square"}")
            }
        }
    }
}

// ---------- State 5: Processing ----------
@Composable
private fun FlowProcessing(progress: Float, counts: Pair<Int, Int>, stage: String) {
    val (done, total) = counts
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Card(
            shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(containerColor = AppColors.Surface),
            modifier = Modifier.fillMaxWidth().padding(24.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth().padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                CircularProgressIndicator(
                    progress = { progress },
                    modifier = Modifier.size(52.dp),
                    color = AppColors.Accent,
                    strokeWidth = 5.dp
                )
                Spacer(Modifier.height(20.dp))
                Text("Processing…", style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Bold, color = AppColors.TextPrimary)
                Spacer(Modifier.height(8.dp))
                LinearProgressIndicator(
                    progress = { progress },
                    modifier = Modifier.fillMaxWidth().height(6.dp),
                    color = AppColors.Accent,
                    trackColor = AppColors.TextSecondary.copy(alpha = 0.2f)
                )
                Spacer(Modifier.height(10.dp))
                Text(
                    if (total > 0) "Page $done of $total (${(progress * 100).roundToInt()}%)" else "Preparing…",
                    style = MaterialTheme.typography.bodyMedium,
                    color = AppColors.TextSecondary
                )
                if (stage.isNotEmpty()) {
                    Text(stage, style = MaterialTheme.typography.bodySmall, color = AppColors.TextSecondary)
                }
            }
        }
    }
}

// ---------- State 6: Success ----------
@Composable
private fun FlowSuccess(
    result: FlowResult,
    onBack: () -> Unit,
    onView: () -> Unit,
    onShare: () -> Unit,
    onDownload: () -> Unit,
    onProcessAnother: () -> Unit,
    downloading: Boolean
) {
    Column(Modifier.fillMaxSize()) {
        FlowTopBar("Processing Complete", onBack)
        LazyColumn(
            modifier = Modifier.weight(1f),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            item {
                Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                    Box(
                        modifier = Modifier.size(72.dp).clip(CircleShape).background(AppColors.Success.copy(alpha = 0.18f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(Icons.Outlined.CheckCircle, null, tint = AppColors.Success, modifier = Modifier.size(42.dp))
                    }
                    Spacer(Modifier.height(12.dp))
                    Text("Processing Complete", style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.Bold, color = AppColors.TextPrimary)
                }
            }
            item {
                Card(shape = RoundedCornerShape(18.dp), colors = CardDefaults.cardColors(containerColor = AppColors.Surface), modifier = Modifier.fillMaxWidth()) {
                    Column(Modifier.padding(18.dp)) {
                        SummaryRow("Original size", formatSize(result.originalSize))
                        Spacer(Modifier.height(6.dp))
                        SummaryRow("Processed size", formatSize(result.processedSize))
                        Spacer(Modifier.height(6.dp))
                        SummaryRow("Pages processed", "${result.pageCount}")
                        if (result.originalSize > 0 && result.processedSize > 0) {
                            val savedPct = (1f - result.processedSize.toFloat() / result.originalSize.toFloat()).coerceAtLeast(0f)
                            Spacer(Modifier.height(6.dp))
                            SummaryRow("Saved", "${(savedPct * 100).roundToInt()}%")
                        }
                    }
                }
            }
        }
        Column(Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Button(
                    onClick = onView,
                    modifier = Modifier.weight(1f),
                    shape = RoundedCornerShape(14.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = AppColors.Accent)
                ) {
                    Icon(Icons.Outlined.OpenInNew, null, Modifier.size(16.dp))
                    Spacer(Modifier.width(6.dp))
                    Text("View File")
                }
                Button(
                    onClick = onShare,
                    modifier = Modifier.weight(1f),
                    shape = RoundedCornerShape(14.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = AppColors.Accent)
                ) {
                    Icon(Icons.Outlined.Share, null, Modifier.size(16.dp))
                    Spacer(Modifier.width(6.dp))
                    Text("Share File")
                }
            }
            Button(
                onClick = onDownload,
                enabled = !downloading,
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(14.dp)
            ) {
                if (downloading) {
                    CircularProgressIndicator(strokeWidth = 2.dp, modifier = Modifier.size(16.dp), color = Color.White)
                    Spacer(Modifier.width(8.dp))
                    Text("Downloading…")
                } else {
                    Icon(Icons.Outlined.Download, null, Modifier.size(16.dp))
                    Spacer(Modifier.width(6.dp))
                    Text("Download Another Copy")
                }
            }
            OutlinedButton(
                onClick = onProcessAnother,
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(14.dp)
            ) {
                Icon(Icons.Outlined.Refresh, null, Modifier.size(16.dp))
                Spacer(Modifier.width(6.dp))
                Text("Process Another File")
            }
        }
    }
}

@Composable
private fun SummaryRow(label: String, value: String) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text(label, style = MaterialTheme.typography.bodyMedium, color = AppColors.TextSecondary)
        Spacer(Modifier.weight(1f))
        Text(value, style = MaterialTheme.typography.bodyMedium, fontWeight = FontWeight.Bold, color = AppColors.TextPrimary)
    }
}
