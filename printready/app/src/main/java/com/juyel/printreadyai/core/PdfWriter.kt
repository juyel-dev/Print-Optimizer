package com.juyel.printreadyai.core

import java.io.OutputStream

/**
 * Minimal PDF-1.4 writer: each page is a full-page DCTDecode (JPEG) XObject,
 * drawn with `q W 0 0 H 0 0 cm /Im0 Do Q`. Written from scratch — no
 * third-party PDF library. Page dimensions in points equal the pixel
 * dimensions of the rendered page (same behaviour as the reference writer).
 */
object PdfWriter {

    private const val HEADER = "%PDF-1.4\n"
    private const val EOF_MARKER = "%%EOF"

    data class Page(val widthPx: Int, val heightPx: Int, val jpegBytes: ByteArray)

    fun write(stream: OutputStream, pages: List<Page>) {
        CountingStream(stream).use { out ->
            val offsets = ArrayList<Long>()
            out.write(HEADER.toByteArray(Charsets.ISO_8859_1))

            // 1: catalog
            offsets.add(out.pos())
            out.obj(1, "<< /Type /Catalog /Pages 2 0 R >>")

            // 2: pages tree
            offsets.add(out.pos())
            val kids = (0 until pages.size).joinToString(" ") { "${it * 3 + 3} 0 R" }
            out.obj(2, "<< /Type /Pages /Kids [$kids] /Count ${pages.size} >>")

            for ((i, page) in pages.withIndex()) {
                val pageObj = i * 3 + 3
                val imageObj = pageObj + 1
                val contentObj = pageObj + 2

                // page object
                offsets.add(out.pos())
                out.obj(
                    pageObj,
                    "<< /Type /Page /Parent 2 0 R /MediaBox [0 0 ${page.widthPx} ${page.heightPx}] " +
                        "/Resources << /XObject << /Im0 $imageObj 0 R >> >> /Contents $contentObj 0 R >>"
                )

                // image xobject
                offsets.add(out.pos())
                val dict =
                    "<< /Type /XObject /Subtype /Image /Width ${page.widthPx} /Height ${page.heightPx} " +
                        "/ColorSpace /DeviceRGB /BitsPerComponent 8 /Filter /DCTDecode /Length ${page.jpegBytes.size} >>"
                out.write("$imageObj 0 obj\n".toByteArray(Charsets.ISO_8859_1))
                out.write(dict.toByteArray(Charsets.ISO_8859_1))
                out.write("\nstream\n".toByteArray(Charsets.ISO_8859_1))
                out.write(page.jpegBytes)
                out.write("\nendstream\nendobj\n".toByteArray(Charsets.ISO_8859_1))

                // content stream
                offsets.add(out.pos())
                val content = "q ${page.widthPx} 0 0 ${page.heightPx} 0 0 cm /Im0 Do Q"
                out.write("$contentObj 0 obj\n".toByteArray(Charsets.ISO_8859_1))
                out.write("<< /Length ${content.length} >>\nstream\n".toByteArray(Charsets.ISO_8859_1))
                out.write(content.toByteArray(Charsets.ISO_8859_1))
                out.write("\nendstream\nendobj\n".toByteArray(Charsets.ISO_8859_1))
            }

            // xref
            val xrefPos = out.pos()
            val sb = StringBuilder("xref\n0 ${offsets.size + 1}\n")
            sb.append("0000000000 65535 f \n")
            for (off in offsets) sb.append("%010d 00000 n \n".format(off))
            out.write(sb.toString().toByteArray(Charsets.ISO_8859_1))
            out.write("trailer\n<< /Size ${offsets.size + 1} /Root 1 0 R >>\nstartxref\n$xrefPos\n%%EOF\n".toByteArray(Charsets.ISO_8859_1))
        }
    }

    private class CountingStream(delegate: OutputStream) : OutputStream() {
        private val inner = delegate
        private var position = 0L
        fun pos(): Long = position
        override fun write(b: Int) {
            inner.write(b)
            position++
        }
        override fun write(b: ByteArray, off: Int, len: Int) {
            inner.write(b, off, len)
            position += len
        }
        override fun flush() = inner.flush()
        override fun close() = inner.close()
    }

    private fun OutputStream.obj(number: Int, body: String) {
        val payload = "$number 0 obj\n$body\nendobj\n"
        write(payload.toByteArray(Charsets.ISO_8859_1))
    }

    fun byteCount(pages: List<Page>): Long {
        var total = HEADER.length.toLong()
        total += 100 // catalog + pages tree approximations
        for (page in pages) {
            total += 300L + page.jpegBytes.size
        }
        return total + 64
    }
}
