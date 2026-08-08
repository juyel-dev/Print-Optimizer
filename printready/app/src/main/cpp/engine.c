#include <stdint.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

#ifdef PRINTREADY_HOST_TEST
/* Host test mode: no JNI/Android headers, provide minimal stubs */
#include <stdio.h>
#define TAG "PrintReadyNative"
#define LOGE(...) do { fprintf(stderr, "[ERROR] "); fprintf(stderr, __VA_ARGS__); fprintf(stderr, "\n"); } while(0)
#else
/* Android build mode */
#include <jni.h>
#include <android/log.h>
#define TAG "PrintReadyNative"
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR, TAG, __VA_ARGS__)
#endif

/*
 * Own implementation of the documented page-enhancement algorithms.
 * Pixel format: ARGB_8888 packed ints (0xAARRGGBB), alpha preserved.
 */

/* ---- Stage 1: invert RGB, alpha untouched (matches RE) ---- */
static void invert_pixels(uint32_t *p, size_t n) {
    for (size_t i = 0; i < n; i++) {
        *p = (*p ^ 0x00FFFFFFu);
        p++;
    }
}

/* ---- Stage 2: Rec.601 grayscale ---- */
static void grayscale_pixels(uint32_t *p, size_t n) {
    for (size_t i = 0; i < n; i++) {
        uint32_t v = *p;
        uint32_t r = (v >> 16) & 0xFF;
        uint32_t g = (v >> 8) & 0xFF;
        uint32_t b = v & 0xFF;
        uint32_t luma = (299u * r + 587u * g + 114u * b) / 1000u;
        *p = (v & 0xFF000000u) | (luma << 16) | (luma << 8) | luma;
        p++;
    }
}

/* ---- Stage 3: clear background ---- */
static void clear_bg_pixels(uint32_t *p, size_t n, int threshold) {
    for (size_t i = 0; i < n; i++) {
        uint32_t v = *p;
        uint32_t r = (v >> 16) & 0xFF;
        uint32_t g = (v >> 8) & 0xFF;
        uint32_t b = v & 0xFF;
        uint32_t avg = (r + g + b) / 3u;
        if (avg <= (uint32_t)threshold) {
            float nr = r * 1.2f;
            float ng = g * 1.2f;
            float nb = b * 1.2f;
            uint32_t rr = nr > 255.0f ? 255u : (uint32_t)nr;
            uint32_t gg = ng > 255.0f ? 255u : (uint32_t)ng;
            uint32_t bb = nb > 255.0f ? 255u : (uint32_t)nb;
            *p = (v & 0xFF000000u) | (rr << 16) | (gg << 8) | bb;
        } else {
            *p = (v & 0xFF000000u) | 0x00FFFFFFu;
        }
        p++;
    }
}

/* ---- Stage 4: adaptive black & white (gamma + integral image) ---- */
static void bw_pixels(uint32_t *pixels, int w, int h) {
    size_t n = (size_t)w * (size_t)h;
    unsigned char *luma = (unsigned char *)malloc(n);
    uint32_t *integral = (uint32_t *)malloc(n * sizeof(uint32_t));
    if (luma == NULL || integral == NULL) {
        free(luma);
        free(integral);
        return;
    }
    for (size_t i = 0; i < n; i++) {
        uint32_t v = pixels[i];
        uint32_t r = (v >> 16) & 0xFF;
        float f = (float)r / 255.0f;
        f = powf(f, 0.6f);
        luma[i] = (unsigned char)(255.0f * f);
    }
    /* row prefix sums */
    for (int y = 0; y < h; y++) {
        uint32_t rowSum = 0;
        for (int x = 0; x < w; x++) {
            rowSum += luma[y * w + x];
            integral[y * w + x] = rowSum;
        }
    }
    /* column accumulation -> summed area table */
    for (int x = 0; x < w; x++) {
        uint32_t colSum = 0;
        for (int y = 0; y < h; y++) {
            colSum += integral[y * w + x];
            integral[y * w + x] = colSum;
        }
    }
    for (int y = 0; y < h; y++) {
        int top = y - 10;    if (top < 0) top = 0;
        int bot = y + 10;    if (bot > h - 1) bot = h - 1;
        for (int x = 0; x < w; x++) {
            int left = x - 10;   if (left < 0) left = 0;
            int right = x + 10;  if (right > w - 1) right = w - 1;
            uint32_t area = (uint32_t)((right - left + 1) * (bot - top + 1));
            uint32_t sum = integral[bot * w + right];
            if (top > 0 && left > 0) sum += integral[(top - 1) * w + (left - 1)];
            if (top > 0) sum -= integral[(top - 1) * w + right];
            if (left > 0) sum -= integral[bot * w + (left - 1)];
            float mean = (float)sum / (float)area;
            uint32_t out = ((float)luma[y * w + x] >= mean - 10.0f) ? 0xFFu : 0x00u;
            pixels[y * w + x] = (pixels[y * w + x] & 0xFF000000u) | (out << 16) | (out << 8) | out;
        }
    }
    free(luma);
    free(integral);
}

/* ---- region helpers (normalized rect in [0..1]) ---- */
static void region_bounds(int w, int h, float l, float t, float rw, float rh,
                          int *x0, int *y0, int *x1, int *y1) {
    int ix0 = (int)(l * (float)w);
    int iy0 = (int)(t * (float)h);
    int ix1 = (int)((l + rw) * (float)w);
    int iy1 = (int)((t + rh) * (float)h);
    if (ix0 < 0) ix0 = 0;
    if (iy0 < 0) iy0 = 0;
    if (ix1 > w) ix1 = w;
    if (iy1 > h) iy1 = h;
    *x0 = ix0; *y0 = iy0; *x1 = ix1; *y1 = iy1;
}

static void fill_rect(uint32_t *pixels, int w, int x0, int y0, int x1, int y1, uint32_t color) {
    for (int y = y0; y < y1; y++) {
        uint32_t *row = pixels + (size_t)y * w;
        for (int x = x0; x < x1; x++) row[x] = color;
    }
}

static void fill_oval(uint32_t *pixels, int w, int x0, int y0, int x1, int y1, uint32_t color) {
    float cx = ((float)x0 + (float)x1) / 2.0f;
    float cy = ((float)y0 + (float)y1) / 2.0f;
    float rx = ((float)x1 - (float)x0) / 2.0f;
    float ry = ((float)y1 - (float)y0) / 2.0f;
    for (int y = y0; y < y1; y++) {
        uint32_t *row = pixels + (size_t)y * w;
        for (int x = x0; x < x1; x++) {
            float dx = ((float)x - cx) / rx;
            float dy = ((float)y - cy) / ry;
            if (dx * dx + dy * dy <= 1.0f) row[x] = color;
        }
    }
}

static void invert_rect(uint32_t *pixels, int w, int x0, int y0, int x1, int y1) {
    for (int y = y0; y < y1; y++) {
        uint32_t *row = pixels + (size_t)y * w;
        for (int x = x0; x < x1; x++) row[x] ^= 0x00FFFFFFu;
    }
}

static void invert_oval(uint32_t *pixels, int w, int x0, int y0, int x1, int y1) {
    float cx = ((float)x0 + (float)x1) / 2.0f;
    float cy = ((float)y0 + (float)y1) / 2.0f;
    float rx = ((float)x1 - (float)x0) / 2.0f;
    float ry = ((float)y1 - (float)y0) / 2.0f;
    for (int y = y0; y < y1; y++) {
        uint32_t *row = pixels + (size_t)y * w;
        for (int x = x0; x < x1; x++) {
            float dx = ((float)x - cx) / rx;
            float dy = ((float)y - cy) / ry;
            if (dx * dx + dy * dy <= 1.0f) row[x] ^= 0x00FFFFFFu;
        }
    }
}

#ifndef PRINTREADY_HOST_TEST
/* ============================ JNI ============================ */

JNIEXPORT jint JNICALL
Java_com_juyel_printreadyai_core_Engine_processPage(JNIEnv *env, jclass clazz,
    jintArray pixels, jint width, jint height,
    jboolean invert, jboolean grayscale, jboolean clearBg, jboolean bw, jint threshold) {
    jsize len = (*env)->GetArrayLength(env, pixels);
    if (len != (jsize)((int64_t)width * height)) {
        LOGE("bad dimensions %d vs %d", len, width * height);
        return 0;
    }
    uint32_t *p = (uint32_t *)(*env)->GetIntArrayElements(env, pixels, NULL);
    if (p == NULL) return 0;
    size_t n = (size_t)len;
    if (invert == JNI_TRUE) invert_pixels(p, n);
    if (grayscale == JNI_TRUE) grayscale_pixels(p, n);
    if (clearBg == JNI_TRUE) clear_bg_pixels(p, n, threshold);
    if (bw == JNI_TRUE) bw_pixels(p, width, height);
    (*env)->ReleaseIntArrayElements(env, pixels, (jint *)p, 0);
    return 1;
}

JNIEXPORT void JNICALL
Java_com_juyel_printreadyai_core_Engine_removeLogo(JNIEnv *env, jclass clazz,
    jintArray pixels, jint width, jint height,
    jfloat left, jfloat top, jfloat rw, jfloat rh, jboolean circle) {
    uint32_t *p = (uint32_t *)(*env)->GetIntArrayElements(env, pixels, NULL);
    if (p == NULL) return;
    int x0, y0, x1, y1;
    region_bounds(width, height, left, top, rw, rh, &x0, &y0, &x1, &y1);
    uint32_t white = 0xFFFFFFFFu;
    if (circle == JNI_TRUE) fill_oval(p, width, x0, y0, x1, y1, white);
    else fill_rect(p, width, x0, y0, x1, y1, white);
    (*env)->ReleaseIntArrayElements(env, pixels, (jint *)p, 0);
}

JNIEXPORT void JNICALL
Java_com_juyel_printreadyai_core_Engine_fillRegion(JNIEnv *env, jclass clazz,
    jintArray pixels, jint width, jint height,
    jfloat left, jfloat top, jfloat rw, jfloat rh, jint color) {
    uint32_t *p = (uint32_t *)(*env)->GetIntArrayElements(env, pixels, NULL);
    if (p == NULL) return;
    int x0, y0, x1, y1;
    region_bounds(width, height, left, top, rw, rh, &x0, &y0, &x1, &y1);
    fill_rect(p, width, x0, y0, x1, y1, (uint32_t)color);
    (*env)->ReleaseIntArrayElements(env, pixels, (jint *)p, 0);
}

JNIEXPORT void JNICALL
Java_com_juyel_printreadyai_core_Engine_fillRegionOval(JNIEnv *env, jclass clazz,
    jintArray pixels, jint width, jint height,
    jfloat left, jfloat top, jfloat rw, jfloat rh, jint color) {
    uint32_t *p = (uint32_t *)(*env)->GetIntArrayElements(env, pixels, NULL);
    if (p == NULL) return;
    int x0, y0, x1, y1;
    region_bounds(width, height, left, top, rw, rh, &x0, &y0, &x1, &y1);
    fill_oval(p, width, x0, y0, x1, y1, (uint32_t)color);
    (*env)->ReleaseIntArrayElements(env, pixels, (jint *)p, 0);
}

JNIEXPORT void JNICALL
Java_com_juyel_printreadyai_core_Engine_invertRegion(JNIEnv *env, jclass clazz,
    jintArray pixels, jint width, jint height,
    jfloat left, jfloat top, jfloat rw, jfloat rh) {
    uint32_t *p = (uint32_t *)(*env)->GetIntArrayElements(env, pixels, NULL);
    if (p == NULL) return;
    int x0, y0, x1, y1;
    region_bounds(width, height, left, top, rw, rh, &x0, &y0, &x1, &y1);
    invert_rect(p, width, x0, y0, x1, y1);
    (*env)->ReleaseIntArrayElements(env, pixels, (jint *)p, 0);
}

JNIEXPORT void JNICALL
Java_com_juyel_printreadyai_core_Engine_invertRegionOval(JNIEnv *env, jclass clazz,
    jintArray pixels, jint width, jint height,
    jfloat left, jfloat top, jfloat rw, jfloat rh) {
    uint32_t *p = (uint32_t *)(*env)->GetIntArrayElements(env, pixels, NULL);
    if (p == NULL) return;
    int x0, y0, x1, y1;
    region_bounds(width, height, left, top, rw, rh, &x0, &y0, &x1, &y1);
    invert_oval(p, width, x0, y0, x1, y1);
    (*env)->ReleaseIntArrayElements(env, pixels, (jint *)p, 0);
}


#endif /* JNI (Android only) */

/* ============================ HOST TEST API ============================
 * When compiled with -DPRINTREADY_HOST_TEST, these wrappers expose the
 * internal filter functions for gcc-based testing on the host machine.
 * Compile: gcc -DPRINTREADY_HOST_TEST -o test_engine test_engine.c -lm
 */
#ifdef PRINTREADY_HOST_TEST

#include <stdio.h>

void test_invert(uint32_t *p, size_t n) { invert_pixels(p, n); }
void test_grayscale(uint32_t *p, size_t n) { grayscale_pixels(p, n); }
void test_clear_bg(uint32_t *p, size_t n, int threshold) { clear_bg_pixels(p, n, threshold); }
void test_bw(uint32_t *p, int w, int h) { bw_pixels(p, w, h); }
void test_fill_rect(uint32_t *p, int w, int x0, int y0, int x1, int y1, uint32_t c) { fill_rect(p, w, x0, y0, x1, y1, c); }
void test_fill_oval(uint32_t *p, int w, int x0, int y0, int x1, int y1, uint32_t c) { fill_oval(p, w, x0, y0, x1, y1, c); }
void test_invert_rect(uint32_t *p, int w, int x0, int y0, int x1, int y1) { invert_rect(p, w, x0, y0, x1, y1); }
void test_invert_oval(uint32_t *p, int w, int x0, int y0, int x1, int y1) { invert_oval(p, w, x0, y0, x1, y1); }

#endif /* PRINTREADY_HOST_TEST */
