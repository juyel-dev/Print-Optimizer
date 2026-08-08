/*
 * PrintReady AI — Native PDF-1.4 Writer
 * ======================================
 * From-scratch PDF writer, stdio only, no third-party libs.
 * Matches RE behavior of libnotescrafter-native.so:
 *   - PDF-1.4 header
 *   - Each page = JPEG embedded as /DCTDecode Image XObject
 *   - Content stream: "q W 0 0 H 0 0 cm /Im0 Do Q"
 *   - xref table + trailer at close
 *   - Bad dimensions → log error + return false (no crash)
 *
 * Object numbering (per page i, 0-indexed):
 *   obj 1            = Pages (written at close)
 *   obj 2            = Catalog (written at close)
 *   obj (3 + 3*i)    = Image XObject
 *   obj (4 + 3*i)    = Content stream
 *   obj (5 + 3*i)    = Page object
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdint.h>

#ifdef __ANDROID__
#include <android/log.h>
#define LOG_TAG "PrintReadyNative"
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR, LOG_TAG, __VA_ARGS__)
#define LOGI(...) __android_log_print(ANDROID_LOG_INFO, LOG_TAG, __VA_ARGS__)
#else
/* Host-test mode: log to stderr */
#define LOGE(...) do { fprintf(stderr, "[ERROR] "); fprintf(stderr, __VA_ARGS__); fprintf(stderr, "\n"); } while(0)
#define LOGI(...) do { fprintf(stderr, "[INFO]  "); fprintf(stderr, __VA_ARGS__); fprintf(stderr, "\n"); } while(0)
#endif

/* ================================================================
 *  Pure-C Core API (host-testable, no JNI dependency)
 * ================================================================ */

#define INITIAL_OBJ_CAPACITY 256

typedef struct {
    FILE*  file;
    long*  offsets;     /* xref byte-offsets, 1-indexed */
    int    capacity;    /* allocated size of offsets[] */
    int    next_obj;    /* next object number to assign */
    int    num_pages;
    int    closed;
} PdfWriter;

/* Ensure offsets[] can hold object number `n` (1-indexed). */
static int ensure_capacity(PdfWriter* w, int n) {
    if (n < w->capacity) return 1;
    int new_cap = w->capacity;
    while (new_cap <= n) new_cap *= 2;
    long* tmp = (long*)realloc(w->offsets, (size_t)new_cap * sizeof(long));
    if (!tmp) {
        LOGE("pdf_writer: realloc failed for %d objects", new_cap);
        return 0;
    }
    w->offsets = tmp;
    w->capacity = new_cap;
    return 1;
}

/* Record current file position as the offset for object `obj_num`. */
static void record_offset(PdfWriter* w, int obj_num) {
    if (ensure_capacity(w, obj_num)) {
        w->offsets[obj_num] = ftell(w->file);
    }
}

/*
 * Open a new PDF file and write the header.
 * Returns writer handle, or NULL on failure.
 */
PdfWriter* pdf_writer_open(const char* path) {
    if (!path || !path[0]) {
        LOGE("pdf_writer_open: null/empty path");
        return NULL;
    }

    FILE* f = fopen(path, "wb");
    if (!f) {
        LOGE("pdf_writer_open: cannot open '%s' for writing", path);
        return NULL;
    }

    PdfWriter* w = (PdfWriter*)calloc(1, sizeof(PdfWriter));
    if (!w) {
        fclose(f);
        LOGE("pdf_writer_open: out of memory");
        return NULL;
    }

    w->file     = f;
    w->capacity = INITIAL_OBJ_CAPACITY;
    w->offsets  = (long*)calloc((size_t)w->capacity, sizeof(long));
    if (!w->offsets) {
        fclose(f);
        free(w);
        LOGE("pdf_writer_open: offsets alloc failed");
        return NULL;
    }

    /* Object numbers 1 (Pages) and 2 (Catalog) are reserved;
     * page objects start at 3. */
    w->next_obj  = 3;
    w->num_pages = 0;
    w->closed    = 0;

    /* PDF header */
    fwrite("%PDF-1.4\n", 1, 9, f);
    /* Binary comment (tells viewers this is a binary PDF) */
    fwrite("%\xE2\xE3\xCF\xD3\n", 1, 5, f);

    LOGI("pdf_writer_open: '%s' opened", path);
    return w;
}

/*
 * Append one page. `jpeg` is raw JPEG bytes (from Bitmap.compress),
 * width/height are pixel dimensions of the rendered sheet.
 * Returns 1 on success, 0 on failure.
 */
int pdf_writer_add_jpeg_page(PdfWriter* w, const uint8_t* jpeg,
                              size_t jpeg_len, int width, int height) {
    if (!w || w->closed || !w->file) {
        LOGE("writePage: invalid writer handle");
        return 0;
    }
    if (width <= 0 || height <= 0) {
        LOGE("writePage: bad dimensions %dx%d", width, height);
        return 0;
    }
    if (!jpeg || jpeg_len == 0) {
        LOGE("writePage: null/empty JPEG data");
        return 0;
    }

    FILE* f = w->file;

    int img_obj  = w->next_obj;      /* Image XObject */
    int cont_obj = img_obj + 1;      /* Content stream */
    int page_obj = img_obj + 2;      /* Page object */
    w->next_obj  = page_obj + 1;

    /* --- Image XObject (JPEG) --- */
    record_offset(w, img_obj);
    fprintf(f, "%d 0 obj\n", img_obj);
    fprintf(f, "<< /Type /XObject /Subtype /Image /Width %d /Height %d "
               "/ColorSpace /DeviceRGB /BitsPerComponent 8 "
               "/Filter /DCTDecode /Length %zu >>\n",
            width, height, jpeg_len);
    fprintf(f, "stream\n");
    if (fwrite(jpeg, 1, jpeg_len, f) != jpeg_len) {
        LOGE("writePage: JPEG write failed");
        return 0;
    }
    fprintf(f, "\nendstream\nendobj\n\n");

    /* --- Content stream: draw image full-page --- */
    record_offset(w, cont_obj);
    /* Content: "q W 0 0 H 0 0 cm /Im0 Do Q" */
    int content_len = snprintf(NULL, 0, "q %d 0 0 %d 0 0 cm /Im0 Do Q",
                               width, height);
    fprintf(f, "%d 0 obj\n", cont_obj);
    fprintf(f, "<< /Length %d >>\n", content_len);
    fprintf(f, "stream\n");
    fprintf(f, "q %d 0 0 %d 0 0 cm /Im0 Do Q", width, height);
    fprintf(f, "\nendstream\nendobj\n\n");

    /* --- Page object --- */
    record_offset(w, page_obj);
    fprintf(f, "%d 0 obj\n", page_obj);
    fprintf(f, "<< /Type /Page /Parent 1 0 R "
               "/MediaBox [0 0 %d %d] "
               "/Resources << /XObject << /Im0 %d 0 R >> >> "
               "/Contents %d 0 R >>\n",
            width, height, img_obj, cont_obj);
    fprintf(f, "endobj\n\n");

    w->num_pages++;
    return 1;
}

/*
 * Finalize: write Pages tree, Catalog, xref table, trailer.
 * Returns 1 on success, 0 on failure.
 */
int pdf_writer_close(PdfWriter* w) {
    if (!w || w->closed) {
        LOGE("pdf_writer_close: invalid or already-closed writer");
        return 0;
    }
    w->closed = 1;

    if (w->num_pages == 0) {
        LOGE("pdf_writer_close: no pages written");
        if (w->file) fclose(w->file);
        free(w->offsets);
        free(w);
        return 0;
    }

    FILE* f = w->file;

    /* --- Object 1: Pages (Kids list) --- */
    record_offset(w, 1);
    fprintf(f, "1 0 obj\n<< /Type /Pages /Kids [");
    for (int i = 0; i < w->num_pages; i++) {
        int page_obj = 5 + (3 * i);  /* page objects: 5, 8, 11, ... */
        fprintf(f, "%d 0 R", page_obj);
        if (i < w->num_pages - 1) fprintf(f, " ");
    }
    fprintf(f, "] /Count %d >>\nendobj\n\n", w->num_pages);

    /* --- Object 2: Catalog --- */
    record_offset(w, 2);
    fprintf(f, "2 0 obj\n<< /Type /Catalog /Pages 1 0 R >>\nendobj\n\n");

    /* --- xref table --- */
    int total_objs = w->next_obj;  /* objects 1..(next_obj-1) */
    long xref_offset = ftell(f);
    fprintf(f, "xref\n");
    fprintf(f, "0 %d\n", total_objs);
    fprintf(f, "0000000000 65535 f \n");
    for (int i = 1; i < total_objs; i++) {
        fprintf(f, "%010ld 00000 n \n", w->offsets[i]);
    }

    /* --- trailer --- */
    fprintf(f, "trailer\n");
    fprintf(f, "<< /Size %d /Root 2 0 R >>\n", total_objs);
    fprintf(f, "startxref\n");
    fprintf(f, "%ld\n", xref_offset);
    fprintf(f, "%%%%EOF\n");

    fflush(f);
    int ok = (ferror(f) == 0);
    fclose(f);

    LOGI("pdf_writer_close: %d pages written", w->num_pages);

    free(w->offsets);
    free(w);
    return ok ? 1 : 0;
}

/* ================================================================
 *  JNI Wrappers (Android only)
 * ================================================================ */

#ifndef PRINTREADY_HOST_TEST

#include <jni.h>

/*
 * Called as: Engine.initPdfWriter(path)
 * Returns: handle (long), or 0 on failure.
 */
JNIEXPORT jlong JNICALL
Java_com_juyel_printreadyai_core_Engine_initPdfWriter(
        JNIEnv* env, jclass clazz, jstring jpath) {
    (void)clazz;
    if (!jpath) {
        LOGE("JNI initPdfWriter: null path");
        return 0;
    }
    const char* path = (*env)->GetStringUTFChars(env, jpath, NULL);
    if (!path) return 0;

    PdfWriter* w = pdf_writer_open(path);
    (*env)->ReleaseStringUTFChars(env, jpath, path);

    return (jlong)(intptr_t)w;  /* NULL → 0 */
}

/*
 * Called as: Engine.writePageNative(handle, jpegBytes, w, h)
 * Returns: true on success.
 */
JNIEXPORT jboolean JNICALL
Java_com_juyel_printreadyai_core_Engine_writePageNative(
        JNIEnv* env, jclass clazz, jlong handle,
        jbyteArray jjpeg, jint width, jint height) {
    (void)clazz;
    PdfWriter* w = (PdfWriter*)(intptr_t)handle;
    if (!w || w->closed) {
        LOGE("JNI writePageNative: bad handle");
        return JNI_FALSE;
    }
    if (!jjpeg) {
        LOGE("JNI writePageNative: null jpeg array");
        return JNI_FALSE;
    }

    jsize len = (*env)->GetArrayLength(env, jjpeg);
    jbyte* bytes = (*env)->GetByteArrayElements(env, jjpeg, NULL);
    if (!bytes) return JNI_FALSE;

    int ok = pdf_writer_add_jpeg_page(w, (const uint8_t*)bytes,
                                       (size_t)len, width, height);

    (*env)->ReleaseByteArrayElements(env, jjpeg, bytes, JNI_ABORT);
    return ok ? JNI_TRUE : JNI_FALSE;
}

/*
 * Called as: Engine.finishPdfWriter(handle)
 * Returns: true on success. Handle is always freed.
 */
JNIEXPORT jboolean JNICALL
Java_com_juyel_printreadyai_core_Engine_finishPdfWriter(
        JNIEnv* env, jclass clazz, jlong handle) {
    (void)env;
    (void)clazz;
    PdfWriter* w = (PdfWriter*)(intptr_t)handle;
    if (!w) {
        LOGE("JNI finishPdfWriter: null handle");
        return JNI_FALSE;
    }
    int ok = pdf_writer_close(w);
    return ok ? JNI_TRUE : JNI_FALSE;
}

#endif /* PRINTREADY_HOST_TEST */
