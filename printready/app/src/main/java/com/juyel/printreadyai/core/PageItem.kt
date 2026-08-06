package com.juyel.printreadyai.core

import android.net.Uri

/** One page inside the pipeline: source file + original index in that file. */
data class PageItem(
    val sourceUri: Uri,
    val originalPageIndex: Int
)
