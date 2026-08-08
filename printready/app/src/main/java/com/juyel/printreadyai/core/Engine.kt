package com.juyel.printreadyai.core

/**
 * JNI bridge to the native engine (src/main/cpp/engine.c).
 * Own implementation of the documented enhancement algorithms.
 */
object Engine {
    init {
        System.loadLibrary("printready_engine")
    }

    external fun processPage(
        pixels: IntArray,
        width: Int,
        height: Int,
        invert: Boolean,
        grayscale: Boolean,
        clearBackground: Boolean,
        blackAndWhite: Boolean,
        threshold: Int
    ): Int

    external fun removeLogo(
        pixels: IntArray,
        width: Int,
        height: Int,
        left: Float,
        top: Float,
        w: Float,
        h: Float,
        isCircle: Boolean
    )

    external fun fillRegion(
        pixels: IntArray,
        width: Int,
        height: Int,
        left: Float,
        top: Float,
        w: Float,
        h: Float,
        color: Int
    )

    external fun fillRegionOval(
        pixels: IntArray,
        width: Int,
        height: Int,
        left: Float,
        top: Float,
        w: Float,
        h: Float,
        color: Int
    )

    external fun invertRegion(
        pixels: IntArray,
        width: Int,
        height: Int,
        left: Float,
        top: Float,
        w: Float,
        h: Float
    )

    external fun invertRegionOval(
        pixels: IntArray,
        width: Int,
        height: Int,
        left: Float,
        top: Float,
        w: Float,
        h: Float
    )

    external fun initPdfWriter(path: String): Long

    external fun writePageNative(
        handle: Long,
        jpegBytes: ByteArray,
        width: Int,
        height: Int
    ): Boolean

    external fun finishPdfWriter(handle: Long): Boolean
}
