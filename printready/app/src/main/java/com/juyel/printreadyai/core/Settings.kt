package com.juyel.printreadyai.core

import android.graphics.RectF
import android.net.Uri
import androidx.compose.ui.graphics.Color
import java.io.Serializable

// =============================================================================
// Filter settings — matches RE's FilterSettings (p087u3.b) exactly.
// Defaults mirror the reference implementation verbatim.
// =============================================================================

/**
 * Per-page enhancement settings (mirrors RE FilterSettings, p087u3.b).
 *
 * Defaults (from RE):
 *   invertColors = true
 *   clearBackground = true
 *   grayscale = false
 *   blackAndWhite = false
 *   backgroundThreshold = 180
 *   removeLogo = false
 *   logoBox = null
 *   logoShape = "rectangle"
 */
data class FilterSettings(
    val invertColors: Boolean = true,
    val clearBackground: Boolean = true,
    val grayscale: Boolean = false,
    val blackAndWhite: Boolean = false,
    val backgroundThreshold: Int = 180,
    val removeLogo: Boolean = false,
    val logoBox: RectF? = null,
    val logoShape: String = "rectangle"
) : Serializable {
    val anyFilter: Boolean
        get() = invertColors || grayscale || clearBackground || blackAndWhite || removeLogo
}

// =============================================================================
// Page size — matches RE's PageSize enum (p087u3.a).
// =============================================================================
enum class PageSize {
    ORIGINAL, A4
}

// =============================================================================
// Quality — matches RE's Quality enum (p087u3.d).
// Stores target DPI; render ratio derived from DPI / 72 (PDF pt = 1/72 inch).
// RE ratio map: LOW 1.38, MEDIUM 2.77, HIGH 4.16 (matches DPI/72 approximately).
// =============================================================================
enum class Quality(val dpi: Int, val ratio: Float, val label: String) {
    LOW(72, 1.38f, "Low (~72 DPI)"),
    MEDIUM(150, 2.77f, "Medium (~150 DPI)"),
    HIGH(300, 4.16f, "High (~300 DPI)")
}

// =============================================================================
// Orientation — matches RE (p087u3.c).
// =============================================================================
enum class Orientation { PORTRAIT, LANDSCAPE }

// =============================================================================
// Output settings — matches RE's OutputSettings (p087u3.e).
//
// Defaults (from RE):
//   quality = HIGH
//   documentSize = A4
//   orientation = PORTRAIT
//   nupRows = 3, nupColumns = 1
//   addSeparationLines = false
//   addPageNumbers = true
// =============================================================================
data class OutputSettings(
    val quality: Quality = Quality.HIGH,
    val documentSize: PageSize = PageSize.A4,
    val orientation: Orientation = Orientation.PORTRAIT,
    val nupRows: Int = 3,
    val nupColumns: Int = 1,
    val addSeparationLines: Boolean = false,
    val addPageNumbers: Boolean = true
) {
    val pagesPerSheet: Int
        get() = if (documentSize == PageSize.ORIGINAL) 1 else nupRows * nupColumns
}

// =============================================================================
// Per-page edit ops — matches RE's sealed edit class (p087u3.h) exactly.
//   InvertRect -> native invertRegion      InvertOval -> native invertRegionOval
//   MaskRect   -> native fillRegion        MaskOval   -> native fillRegionOval
// Rect coords are normalized [0..1] page fractions.
// =============================================================================
enum class EditOp { INVERT_RECT, INVERT_OVAL, MASK_RECT, MASK_OVAL }

data class PageEdit(
    val op: EditOp,
    val left: Float,
    val top: Float,
    val w: Float,
    val h: Float,
    val color: Int = 0xFFFFFFFF.toInt() // used by MASK_RECT / MASK_OVAL
) : Serializable

// =============================================================================
// Page item in the pipeline — matches RE's PDFPage (p087u3.g).
// =============================================================================
data class PageItem(
    val sourceUri: Uri,
    val originalPageIndex: Int,
    val edits: List<PageEdit> = emptyList()
)
