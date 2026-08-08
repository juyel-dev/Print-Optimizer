package com.juyel.printreadyai.core

import android.content.ContentValues
import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.pdf.PdfRenderer
import android.graphics.RectF
import android.os.Environment
import android.provider.MediaStore
import android.provider.OpenableColumns
import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ensureActive
import kotlinx.coroutines.withContext
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import kotlin.coroutines.coroutineContext

/**
 * Document pipeline: render -> enhance (native) -> sheet layout -> JPEG-80 -> PDF-1.4.
 * Same behaviour as the reference implementation: quality DPI ratios 1.38/2.77/4.16,
 * RAM gate (HIGH kept only when >=100MB free, LOW when <50MB), System.gc() every 5
 * sheets, OOM downgrade + retry (max 3), per-page filter skip on OOM, 1cm A4 margin
 * (none for ORIGINAL size), black 2px separation lines (portrait only), 30px page
 * numbers at sheet bottom, ORIGINAL sheets sized from the first page, JPEG quality 80.
 */
object PdfEngine {

    const val JPEG_QUALITY = 80
    private const val MEMORY_GATE_BYTES = 50L * 1024 * 1024
    private const val MEMORY_GATE_LOW_MB = 50L
    private const val MEMORY_GATE_HIGH_MB = 100L
    private const val MAX_OOM_RETRIES = 3
    private const val GC_EVERY_SHEETS = 5
    private const val SEPARATOR_PX = 2
    private const val PAGE_NUMBER_PX = 30
    private const val A4_PT_W = 595.28
    private const val A4_PT_H = 841.89
    private const val CM_PT = 28.35f

    enum class Mode { CONVERT, MERGE }

    data class Progress(val done: Int, val total: Int, val stage: String)

    private data class NativePage(val width: Int, val height: Int, val jpeg: ByteArray) {
        override fun equals(other: Any?) = other is NativePage &&
            width == other.width && height == other.height && jpeg.contentEquals(other.jpeg)
        override fun hashCode(): Int = 31 * (31 * width + height) + jpeg.contentHashCode()
    }

    private val ratios = listOf(Quality.HIGH.ratio, Quality.MEDIUM.ratio, Quality.LOW.ratio)

    private class RetryState(initialRatio: Float) {
        var ratio = initialRatio
        var retries = 0
    }

    /** Runs the pipeline; returns the MediaStore uri of the written PDF as a String. */
    suspend fun process(
        context: Context,
        mode: Mode,
        items: List<PageItem>,
        filter: FilterSettings,
        output: OutputSettings,
        onProgress: (Progress) -> Unit
    ): String = withContext(Dispatchers.IO) {
        require(items.isNotEmpty()) { "No pages selected" }

        // RE (flow.md §4): CONVERT names output "<basename>_processed.pdf".
        val name = if (mode == Mode.MERGE) {
            "Merged_%s.pdf".format(SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(Date()))
        } else {
            "%s_processed.pdf".format(sourceBaseName(context, items.first().sourceUri))
        }
        val outUri = context.contentResolver.insert(
            MediaStore.Files.getContentUri(MediaStore.VOLUME_EXTERNAL_PRIMARY),
            ContentValues().apply {
                put(MediaStore.Files.FileColumns.DISPLAY_NAME, name)
                put(MediaStore.Files.FileColumns.MIME_TYPE, "application/pdf")
                put(
                    MediaStore.Files.FileColumns.RELATIVE_PATH,
                    Environment.DIRECTORY_DOCUMENTS + "/PrintReady"
                )
            }
        ) ?: throw IOException("Could not create output file")

        retryPipeline(context, items, filter, output, gatedRatio(output.quality, freeBytes()), onProgress, outUri)
    }

    /**
     * RAM-based quality gate (same as the reference): only HIGH requests are
     * adjusted - plenty of free memory keeps HIGH, scarce memory drops to
     * LOW, everything in between uses MEDIUM. Explicit LOW/MEDIUM picks win.
     */
    private fun gatedRatio(requested: Quality, freeBytes: Long): Float {
        if (requested != Quality.HIGH) return requested.ratio
        val freeMb = freeBytes / (1024 * 1024)
        return when {
            freeMb >= MEMORY_GATE_HIGH_MB -> Quality.HIGH.ratio
            freeMb < MEMORY_GATE_LOW_MB -> Quality.LOW.ratio
            else -> Quality.MEDIUM.ratio
        }
    }

    private suspend fun retryPipeline(
        context: Context,
        items: List<PageItem>,
        filter: FilterSettings,
        output: OutputSettings,
        initialRatio: Float,
        onProgress: (Progress) -> Unit,
        outUri: android.net.Uri
    ): String {
        val state = RetryState(initialRatio)
        while (true) {
            try {
                runPipeline(context, items, filter, output, state.ratio, onProgress, outUri)
                return outUri.toString()
            } catch (oom: OutOfMemoryError) {
                if (state.retries >= MAX_OOM_RETRIES) {
                    throw IOException("Not enough memory to process this document", oom)
                }
                state.retries++
                state.ratio = nextLowerRatio(state.ratio)
                System.gc()
            }
        }
    }

    private suspend fun runPipeline(
        context: Context,
        items: List<PageItem>,
        filter: FilterSettings,
        output: OutputSettings,
        ratio: Float,
        onProgress: (Progress) -> Unit,
        outUri: android.net.Uri
    ) {
        val resolver = context.contentResolver
        val pagesPerSheet = output.pagesPerSheet
        val sheetBase = sheetBaseSize(context, items.first(), output, ratio)

        // Write PDF via native writer into app-private temp file, then copy to MediaStore.
        val tempFile = File(context.filesDir, "printready_tmp_${System.currentTimeMillis()}.pdf")
        try {
            val handle = Engine.initPdfWriter(tempFile.absolutePath)
            if (handle == 0L) throw IOException("Failed to initialize native PDF writer at ${tempFile.absolutePath}")

            val writerPages = ArrayList<NativePage>(items.size)
            var sheetBitmap: Bitmap? = null
            var sheetCanvas: Canvas? = null
            var cellIndex = 0
            var sheetsDone = 0

            fun beginSheet(): Bitmap {
                val (sw, sh) = sheetBase
                return Bitmap.createBitmap(sw, sh, Bitmap.Config.ARGB_8888).also {
                    it.eraseColor(Color.WHITE)
                }
            }

            fun flushSheet() {
                val sb = sheetBitmap ?: return
                if (output.addPageNumbers) {
                    val text = Paint(Paint.ANTI_ALIAS_FLAG).apply {
                        color = Color.BLACK
                        textSize = PAGE_NUMBER_PX.toFloat()
                        textAlign = Paint.Align.CENTER
                    }
                    sheetCanvas!!.drawText(
                        (sheetsDone + 1).toString(),
                        sb.width / 2f,
                        sb.height - 40f,
                        text
                    )
                }
                flushBitmap(sb, writerPages)
                sheetBitmap = null
                sheetCanvas = null
                cellIndex = 0
                sheetsDone++
                if (sheetsDone % GC_EVERY_SHEETS == 0) System.gc()
            }

            for ((index, item) in items.withIndex()) {
                coroutineContext.ensureActive()
                onProgress(Progress(index, items.size, "Processing page ${index + 1} of ${items.size}"))

                val rendered = renderEnhancedPage(context, item, ratio, filter)

                if (cellIndex == 0) {
                    sheetBitmap = beginSheet()
                    sheetCanvas = Canvas(sheetBitmap!!)
                }
                drawOnSheet(sheetCanvas!!, sheetBitmap!!, rendered, cellIndex, output)
                cellIndex++
                if (cellIndex >= pagesPerSheet) flushSheet()
                rendered.recycle()

                if (freeBytes() < MEMORY_GATE_BYTES) {
                    System.gc()
                }
            }
            if (cellIndex > 0) flushSheet()

            if (writerPages.isEmpty()) throw IOException("No pages were produced")
            var finalized = false
            try {
                for (page in writerPages) {
                    val ok = Engine.writePageNative(handle, page.jpeg, page.width, page.height)
                    if (!ok) throw IOException("Failed to write page (${page.width}x${page.height})")
                }
            } finally {
                finalized = Engine.finishPdfWriter(handle)
            }
            if (!finalized) throw IOException("Failed to finalize native PDF writer")

            // Copy temp file bytes to MediaStore OutputStream
            resolver.openOutputStream(outUri).use { outStream ->
                if (outStream == null) throw IOException("Cannot open MediaStore output stream")
                tempFile.inputStream().use { it.copyTo(outStream) }
            }
        } finally {
            if (tempFile.exists()) tempFile.delete()
        }
    }

    // ------------------------------------------------------------------
    // page pipeline

    /** Sheet dimensions in pixels: ORIGINAL = first selected page x ratio, A4 = 595x842 x ratio. */
    private fun sheetBaseSize(
        context: Context,
        first: PageItem,
        output: OutputSettings,
        ratio: Float
    ): Pair<Int, Int> {
        if (output.documentSize == PageSize.ORIGINAL) {
            val fd = context.contentResolver.openFileDescriptor(first.sourceUri, "r")
                ?: throw IOException("Cannot open source file")
            fd.use { pfd ->
                val renderer = PdfRenderer(pfd)
                renderer.use { r ->
                    val p = r.openPage(first.originalPageIndex)
                    p.use { pg ->
                        return (pg.width * ratio).toInt().coerceAtLeast(1) to
                            (pg.height * ratio).toInt().coerceAtLeast(1)
                    }
                }
            }
        }
        val landscape = output.orientation == Orientation.LANDSCAPE
        val w = if (landscape) A4_PT_H else A4_PT_W
        val h = if (landscape) A4_PT_W else A4_PT_H
        return (w * ratio).toInt() to (h * ratio).toInt()
    }

    private fun renderEnhancedPage(
        context: Context,
        item: PageItem,
        ratio: Float,
        filter: FilterSettings
    ): Bitmap {
        val fd = context.contentResolver.openFileDescriptor(item.sourceUri, "r")
            ?: throw IOException("Cannot open source file")
        fd.use { pfd ->
            val renderer = PdfRenderer(pfd)
            renderer.use { r ->
                if (item.originalPageIndex >= r.pageCount) {
                    throw IOException("Page ${item.originalPageIndex + 1} not found")
                }
                val page = r.openPage(item.originalPageIndex)
                page.use { p ->
                    val w = (p.width * ratio).toInt().coerceAtLeast(1)
                    val h = (p.height * ratio).toInt().coerceAtLeast(1)
                    val bmp = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888)
                    p.render(bmp, null, null, PdfRenderer.Page.RENDER_MODE_FOR_DISPLAY)
                    return try {
                        enhance(bmp, filter, item.edits)
                    } catch (oom: OutOfMemoryError) {
                        Log.w("PdfEngine", "OOM during page processing. Skipping filters to save crash.")
                        System.gc()
                        bmp
                    }
                }
            }
        }
    }

    private fun enhance(bmp: Bitmap, filter: FilterSettings, edits: List<PageEdit>): Bitmap {
        val colorFilter = filter.invertColors || filter.grayscale || filter.clearBackground || filter.blackAndWhite
        if (!colorFilter && !filter.removeLogo && edits.isEmpty()) return bmp
        val w = bmp.width
        val h = bmp.height
        val pixels = IntArray(w * h)
        bmp.getPixels(pixels, 0, w, 0, 0, w, h)

        // RE pipeline order (flow.md §4): per-page edits -> processPage -> removeLogo
        for (edit in edits) {
            when (edit.op) {
                EditOp.INVERT_RECT -> Engine.invertRegion(pixels, w, h, edit.left, edit.top, edit.w, edit.h)
                EditOp.INVERT_OVAL -> Engine.invertRegionOval(pixels, w, h, edit.left, edit.top, edit.w, edit.h)
                EditOp.MASK_RECT -> Engine.fillRegion(pixels, w, h, edit.left, edit.top, edit.w, edit.h, edit.color)
                EditOp.MASK_OVAL -> Engine.fillRegionOval(pixels, w, h, edit.left, edit.top, edit.w, edit.h, edit.color)
            }
        }
        if (colorFilter) {
            Engine.processPage(
                pixels, w, h,
                filter.invertColors,
                filter.grayscale,
                filter.clearBackground,
                filter.blackAndWhite,
                filter.backgroundThreshold
            )
        }
        // RE: single logo box; shape "circle" or "rectangle" (p087u3.b)
        if (filter.removeLogo && filter.logoBox != null) {
            val box = filter.logoBox
            Engine.removeLogo(
                pixels, w, h,
                box.left, box.top, box.width(), box.height(),
                filter.logoShape == "circle"
            )
        }
        bmp.setPixels(pixels, 0, w, 0, 0, w, h)
        return bmp
    }

    private fun drawOnSheet(
        canvas: Canvas,
        sheet: Bitmap,
        page: Bitmap,
        cellIndex: Int,
        output: OutputSettings
    ) {
        val cols = output.nupColumns
        val rows = output.nupRows
        val margin = if (output.documentSize == PageSize.ORIGINAL) 0f
        else sheet.width / 595f * CM_PT
        val contentW = sheet.width - 2 * margin
        val contentH = sheet.height - 2 * margin
        val cellW = contentW / cols
        val cellH = contentH / rows
        val col = cellIndex % cols
        val row = cellIndex / cols

        val scale = minOf(cellW / page.width, cellH / page.height)
        val drawW = page.width * scale
        val drawH = page.height * scale
        val left = margin + col * cellW + (cellW - drawW) / 2
        val top = margin + row * cellH + (cellH - drawH) / 2

        val paint = Paint(Paint.FILTER_BITMAP_FLAG or Paint.ANTI_ALIAS_FLAG)
        canvas.drawBitmap(
            page, null,
            RectF(left, top, left + drawW, top + drawH),
            paint
        )

        // RE: 2px black STROKE between cells (only if addSeparationLines and not ORIGINAL)
            // (orientation is irrelevant in RE — see flow.md §Separation lines)
            if (output.addSeparationLines && output.documentSize != PageSize.ORIGINAL) {
            val line = Paint().apply {
                color = 0xFF000000.toInt()
                strokeWidth = SEPARATOR_PX.toFloat()
            }
            for (i in 1 until cols) {
                val x = margin + i * cellW
                canvas.drawLine(x, margin, x, margin + contentH, line)
            }
            for (j in 1 until rows) {
                val y = margin + j * cellH
                canvas.drawLine(margin, y, margin + contentW, y, line)
            }
        }
    }

    private fun flushBitmap(bmp: Bitmap, out: MutableList<NativePage>) {
        out.add(NativePage(bmp.width, bmp.height, jpeg(bmp)))
        bmp.recycle()
    }

    private fun jpeg(bmp: Bitmap): ByteArray {
        val baos = ByteArrayOutputStream()
        bmp.compress(Bitmap.CompressFormat.JPEG, JPEG_QUALITY, baos)
        return baos.toByteArray()
    }

    private fun freeBytes(): Long {
        val rt = Runtime.getRuntime()
        return rt.freeMemory() + (rt.maxMemory() - rt.totalMemory())
    }


    private fun sourceBaseName(context: Context, uri: android.net.Uri): String {
        var display: String? = null
        try {
            context.contentResolver.query(uri, null, null, null, null)?.use { c ->
                val idx = c.getColumnIndex(OpenableColumns.DISPLAY_NAME)
                if (idx >= 0 && c.moveToFirst()) display = c.getString(idx)
            }
        } catch (_: Exception) {
        }
        val n = display ?: return "Document"
        val dot = n.lastIndexOf('.')
        return if (dot > 0) n.substring(0, dot) else n
    }

    private fun nextLowerRatio(current: Float): Float {
        val i = ratios.indexOfFirst { it <= current }
        return ratios[(i + 1).coerceAtMost(ratios.lastIndex)]
    }
}
