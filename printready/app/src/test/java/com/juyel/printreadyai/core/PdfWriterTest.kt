package com.juyel.printreadyai.core

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import java.io.File

class PdfWriterTest {

    private fun fakeJpeg(size: Int, seed: Byte): ByteArray = ByteArray(size) { i -> (seed + i % 251).toByte() }

    @Test
    fun writesValidPdfStructure() {
        val jpeg1 = fakeJpeg(64, 0x01)
        val jpeg2 = fakeJpeg(96, 0x42)
        val pages = listOf(
            PdfWriter.Page(100, 200, jpeg1),
            PdfWriter.Page(300, 400, jpeg2)
        )

        val file = File.createTempFile("printready_test", ".pdf")
        try {
            file.outputStream().use { PdfWriter.write(it, pages) }
            val bytes = file.readBytes()

            // header + eof
            val text = String(bytes, Charsets.ISO_8859_1)
            assertTrue(text.startsWith("%PDF-1.4\n"))
            assertTrue(text.trimEnd().endsWith("%%EOF"))

            // object count: catalog + pages tree + 2 pages x (page, image, content) = 8
            val objCount = Regex("\\d+ 0 obj").findAll(text).count()
            assertEquals(8, objCount)

            // two jpeg streams + two content streams; jpeg bytes preserved exactly
            val streams = Regex("stream\n(.*?)\nendstream", RegexOption.DOT_MATCHES_ALL)
                .findAll(text).map { it.groupValues[1].toByteArray(Charsets.ISO_8859_1) }.toList()
            assertEquals(4, streams.size)
            assertTrue(streams.any { jpeg1.contentEquals(it) })
            assertTrue(streams.any { jpeg2.contentEquals(it) })

            // content streams reference the images
            assertTrue(text.contains("/Im0 Do Q"))
            assertTrue(text.contains("/Filter /DCTDecode"))
            assertTrue(text.contains("/MediaBox [0 0 100 200]"))
            assertTrue(text.contains("/MediaBox [0 0 300 400]"))
        } finally {
            file.delete()
        }
    }

    @Test
    fun xrefOffsetsPointAtObjectLines() {
        val pages = listOf(PdfWriter.Page(50, 60, fakeJpeg(32, 0x07)))
        val file = File.createTempFile("printready_xref", ".pdf")
        try {
            file.outputStream().use { PdfWriter.write(it, pages) }
            val text = String(file.readBytes(), Charsets.ISO_8859_1)

            val xrefStart = text.indexOf("xref\n")
            assertTrue(xrefStart > 0)

            // object count 4: catalog, pages, page, image, content = 5 actually
            // catalog(1) pages(2) page(3) image(4) content(5) => 5 objects
            val objPattern = Regex("^(\\d+) 0 obj$", RegexOption.MULTILINE)
            val objOffsets = objPattern.findAll(text).associate { it.groupValues[1] to it.range.first }

            val header = text.substring(xrefStart + 5).substringBefore("trailer")
            val lines = header.trim().lines()
            val count = lines[0].trim().split(" ")[1].toInt()
            assertEquals(objOffsets.size + 1, count)

            val entries = lines.drop(1).map { it.trim() }
            for (i in 1 until count) {
                val (offsetStr, flag) = entries[i].split(" ")
                assertEquals("00000", flag)
                val offset = offsetStr.toLong()
                // entry i corresponds to object number i
                assertEquals("$i 0 obj", text.substring(offset.toInt(), offset.toInt() + "$i 0 obj".length))
            }

            assertTrue(text.contains("startxref"))
        } finally {
            file.delete()
        }
    }

    @Test
    fun handlesEmptyPageListGracefully() {
        val file = File.createTempFile("printready_empty", ".pdf")
        try {
            file.outputStream().use { PdfWriter.write(it, emptyList()) }
            val text = String(file.readBytes(), Charsets.ISO_8859_1)
            assertTrue(text.contains("/Count 0"))
            assertTrue(text.trimEnd().endsWith("%%EOF"))
        } finally {
            file.delete()
        }
    }
}
