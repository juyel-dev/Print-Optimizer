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
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ensureActive
import kotlinx.coroutines.withContext
import java.io.ByteArrayOutputStream
import java.io.IOException
import java.io.OutputStream
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import kotlin.coroutines.coroutineContext

/**
 * Document pipeline: render -> enhance (native) -> sheet layout -> JPEG-80 -> PDF-1.4.
 * Same behaviour as the reference implementation: quality DPI ratios 1.38/2.77/4.16,
 * memory gate at 50MB free, System.gc() every 5 sheets, OOM downgrade + retry (max 3),
 * 2px separation lines, 30px page numbers, A4 595x842 fallback, JPEG quality 80.
 */
object PdfEngine {

    const val JPEG_QUALITY = 80
    private const val MEMORY_GATE_BYTES = 50L * 1024 * 1024
    private const val MAX_OOM_RETRIES = 3
    private const val GC_EVERY_SHEETS = 5
    private const val SEPARATOR_PX = 2
    private const val PAGE_NUMBER_PX = 30
    private const val A4_PT_W = 595.0
    private const val A4_PT_H = 842.0
    private const val SHEET_MARGIN_FRACTION = 0.03f

    enum class Mode { CONVERT, MERGE }

    data class Progress(val done: Int, val total: Int, val stage: String)

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

        val name = "%s_%s.pdf".format(
            if (mode == Mode.MERGE) "Merged" else "Converted",
            SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(Date())
        )
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

        retryPipeline(context, items, filter, output, output.quality.ratio, onProgress, outUri)
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
        val isNup = pagesPerSheet > 1

        resolver.openOutputStream(outUri).use { outStream ->
            val writerPages = ArrayList<PdfWriter.Page>(items.size)
            var sheetBitmap: Bitmap? = null
            var sheetCanvas: Canvas? = null
            var cellIndex = 0
            var sheetsDone = 0

            fun sheetSize(): Pair<Int, Int> {
                val landscape = output.orientation == Orientation.LANDSCAPE
                val w = (if (landscape) A4_PT_H else A4_PT_W) * ratio
                val h = (if (landscape) A4_PT_W else A4_PT_H) * ratio
                return w.toInt() to h.toInt()
            }

            fun beginSheet(): Bitmap {
                val (sw, sh) = sheetSize()
                return Bitmap.createBitmap(sw, sh, Bitmap.Config.ARGB_8888).also {
                    it.eraseColor(Color.WHITE)
                }
            }

            fun flushSheet() {
                val sb = sheetBitmap ?: return
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

                if (isNup) {
                    if (cellIndex == 0) {
                        sheetBitmap = beginSheet()
                        sheetCanvas = Canvas(sheetBitmap!!)
                    }
                    drawOnSheet(sheetCanvas!!, sheetBitmap!!, rendered, cellIndex, output, index + 1)
                    cellIndex++
                    if (cellIndex >= pagesPerSheet) flushSheet()
                } else {
                    flushBitmap(rendered, writerPages)
                    sheetsDone++
                    if (sheetsDone % GC_EVERY_SHEETS == 0) System.gc()
                }
                rendered.recycle()

                if (freeBytes() < MEMORY_GATE_BYTES) {
                    System.gc()
                }
            }
            if (isNup && cellIndex > 0) flushSheet()

            if (writerPages.isEmpty()) throw IOException("No pages were produced")
            PdfWriter.write(outStream!!, writerPages)
        }
    }

    // ------------------------------------------------------------------
    // page pipeline

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
                    return enhance(bmp, filter)
                }
            }
        }
    }

    private fun enhance(bmp: Bitmap, filter: FilterSettings): Bitmap {
        if (!filter.anyFilter && !filter.removeLogo) return bmp
        val w = bmp.width
        val h = bmp.height
        val pixels = IntArray(w * h)
        bmp.getPixels(pixels, 0, w, 0, 0, w, h)

        Engine.processPage(
            pixels, w, h,
            filter.invertColors,
            filter.grayscale,
            filter.clearBackground,
            filter.blackAndWhite,
            filter.backgroundThreshold
        )
        if (filter.removeLogo) {
            for ((box, shape) in filter.logoBoxes) {
                Engine.removeLogo(
                    pixels, w, h,
                    box.left, box.top, box.width(), box.height(),
                    shape == "circle"
                )
            }
        }
        bmp.setPixels(pixels, 0, w, 0, 0, w, h)
        return bmp
    }

    private fun drawOnSheet(
        canvas: Canvas,
        sheet: Bitmap,
        page: Bitmap,
        cellIndex: Int,
        output: OutputSettings,
        pageNumber: Int
    ) {
        val cols = output.nupColumns
        val rows = output.nupRows
        val margin = (sheet.width * SHEET_MARGIN_FRACTION).toInt()
        val contentW = sheet.width - 2 * margin
        val contentH = sheet.height - 2 * margin
        val cellW = contentW / cols
        val cellH = contentH / rows
        val col = cellIndex % cols
        val row = cellIndex / cols

        val scale = minOf(cellW.toFloat() / page.width, cellH.toFloat() / page.height)
        val drawW = (page.width * scale).toInt()
        val drawH = (page.height * scale).toInt()
        val left = margin + col * cellW + (cellW - drawW) / 2
        val top = margin + row * cellH + (cellH - drawH) / 2

        val paint = Paint(Paint.FILTER_BITMAP_FLAG or Paint.ANTI_ALIAS_FLAG)
        canvas.drawBitmap(
            page, null,
            RectF(left.toFloat(), top.toFloat(), (left + drawW).toFloat(), (top + drawH).toFloat()),
            paint
        )

        if (output.addSeparationLines) {
            val line = Paint().apply {
                color = 0xFF9E9E9E.toInt()
                strokeWidth = SEPARATOR_PX.toFloat()
            }
            if (col < cols - 1) {
                val x = margin + (col + 1) * cellW
                canvas.drawLine(
                    x.toFloat(), margin.toFloat(),
                    x.toFloat(), (margin + contentH).toFloat(), line
                )
            }
            if (row < rows - 1) {
                val y = margin + (row + 1) * cellH
                canvas.drawLine(
                    margin.toFloat(), y.toFloat(),
                    (margin + contentW).toFloat(), y.toFloat(), line
                )
            }
        }
        if (output.addPageNumbers) {
            val text = Paint(Paint.ANTI_ALIAS_FLAG).apply {
                color = Color.BLACK
                textSize = PAGE_NUMBER_PX.toFloat()
                textAlign = Paint.Align.CENTER
            }
            val baseline = top + drawH - PAGE_NUMBER_PX * 0.5f
            canvas.drawText(pageNumber.toString(), (left + drawW / 2).toFloat(), baseline, text)
        }
    }

    private fun flushBitmap(bmp: Bitmap, out: MutableList<PdfWriter.Page>) {
        out.add(PdfWriter.Page(bmp.width, bmp.height, jpeg(bmp)))
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

    private fun nextLowerRatio(current: Float): Float {
        val i = ratios.indexOfFirst { it <= current }
        return ratios[(i + 1).coerceAtMost(ratios.lastIndex)]
    }
}
