package com.juyel.printreadyai.core

import android.graphics.RectF

/** Per-page enhancement settings (mirrors the documented filter model). */
data class FilterSettings(
    val invertColors: Boolean = false,
    val grayscale: Boolean = false,
    val clearBackground: Boolean = false,
    val blackAndWhite: Boolean = false,
    val backgroundThreshold: Int = 180,
    val removeLogo: Boolean = false,
    /** Normalized (0..1) logo regions paired with shape: "circle" or "square". */
    val logoBoxes: List<Pair<RectF, String>> = emptyList()
) {
    val anyFilter: Boolean
        get() = invertColors || grayscale || clearBackground || blackAndWhite
}

/** Output document size strategy. */
enum class DocumentSize { ORIGINAL, N_UP }

/** Output page quality tiers with their render scale ratios. */
enum class Quality(val ratio: Float, val label: String) {
    LOW(1.38f, "Low (~100 DPI)"),
    MEDIUM(2.77f, "Medium (~200 DPI)"),
    HIGH(4.16f, "High (~300 DPI)")
}

enum class Orientation { PORTRAIT, LANDSCAPE }

/** Output document settings (rows x cols grid, page numbers, separators). */
data class OutputSettings(
    val quality: Quality = Quality.HIGH,
    val documentSize: DocumentSize = DocumentSize.ORIGINAL,
    val orientation: Orientation = Orientation.PORTRAIT,
    val nupRows: Int = 1,
    val nupColumns: Int = 1,
    val addPageNumbers: Boolean = false,
    val addSeparationLines: Boolean = false
) {
    val pagesPerSheet: Int
        get() = if (documentSize == DocumentSize.ORIGINAL) 1 else nupRows * nupColumns
}
