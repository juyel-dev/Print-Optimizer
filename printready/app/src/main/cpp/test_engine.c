/*
 * Host test for engine.c filter functions
 * Compile: gcc -DPRINTREADY_HOST_TEST -std=c99 -Wall -Wextra -o test_engine test_engine.c -lm
 * Run: ./test_engine
 *
 * Tests all 4 stages of the pixel processing pipeline + region operations.
 */

#ifndef PRINTREADY_HOST_TEST
#define PRINTREADY_HOST_TEST
#endif
#include "engine.c"   /* pulls in the static functions + test wrappers */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

static int pass_count = 0;
static int fail_count = 0;

#define CHECK(cond, name) do { \
    if (cond) { \
        printf("  [PASS] %s\n", name); \
        pass_count++; \
    } else { \
        printf("  [FAIL] %s\n", name); \
        fail_count++; \
    } \
} while(0)

/* Helper: create ARGB pixel */
static uint32_t argb(int a, int r, int g, int b) {
    return ((uint32_t)a << 24) | ((uint32_t)r << 16) | ((uint32_t)g << 8) | (uint32_t)b;
}

/* Helper: extract RGB from pixel */
static void get_rgb(uint32_t p, int *r, int *g, int *b) {
    *r = (p >> 16) & 0xFF;
    *g = (p >> 8) & 0xFF;
    *b = p & 0xFF;
}

static int get_alpha(uint32_t p) {
    return (p >> 24) & 0xFF;
}

/* ========== Stage 1: Invert (RGB only, alpha preserved) ========== */
static void test_invert_stage(void) {
    printf("\n== Stage 1: Invert ==\n");
    uint32_t pixels[4] = {
        argb(0x80, 0x00, 0x00, 0x00),  /* black, alpha=128 */
        argb(0xFF, 0xFF, 0xFF, 0xFF),  /* white, alpha=255 */
        argb(0x40, 0xAA, 0xBB, 0xCC),  /* gray-ish, alpha=64 */
        argb(0x00, 0x10, 0x20, 0x30),  /* dark, alpha=0 */
    };
    test_invert(pixels, 4);

    int r, g, b;
    get_rgb(pixels[0], &r, &g, &b);
    CHECK(r == 0xFF && g == 0xFF && b == 0xFF, "black -> white (RGB inverted)");
    CHECK(get_alpha(pixels[0]) == 0x80, "black pixel alpha preserved (0x80)");

    get_rgb(pixels[1], &r, &g, &b);
    CHECK(r == 0 && g == 0 && b == 0, "white -> black (RGB inverted)");
    CHECK(get_alpha(pixels[1]) == 0xFF, "white pixel alpha preserved (0xFF)");

    get_rgb(pixels[2], &r, &g, &b);
    CHECK(r == 0x55 && g == 0x44 && b == 0x33, "gray inverted correctly");
    CHECK(get_alpha(pixels[2]) == 0x40, "gray pixel alpha preserved (0x40)");

    CHECK(get_alpha(pixels[3]) == 0x00, "zero alpha preserved");
}

/* ========== Stage 2: Grayscale (Rec.601) ========== */
static void test_grayscale_stage(void) {
    printf("\n== Stage 2: Grayscale (Rec.601) ==\n");

    /* Pure red -> luma = 299*255/1000 = 76 */
    uint32_t red = argb(0xFF, 255, 0, 0);
    test_grayscale(&red, 1);
    int r, g, b;
    get_rgb(red, &r, &g, &b);
    CHECK(r == g && g == b, "grayscale: R=G=B");
    CHECK(r == 76, "red -> luma 76 (Rec.601)");
    CHECK(get_alpha(red) == 0xFF, "alpha preserved after grayscale");

    /* Pure green -> luma = 587*255/1000 = 149 */
    uint32_t green = argb(0x80, 0, 255, 0);
    test_grayscale(&green, 1);
    get_rgb(green, &r, &g, &b);
    CHECK(r == 149 && g == 149 && b == 149, "green -> luma 149");
    CHECK(get_alpha(green) == 0x80, "alpha preserved (green)");

    /* Pure blue -> luma = 114*255/1000 = 29 */
    uint32_t blue = argb(0x00, 0, 0, 255);
    test_grayscale(&blue, 1);
    get_rgb(blue, &r, &g, &b);
    CHECK(r == 29, "blue -> luma 29");
    CHECK(get_alpha(blue) == 0x00, "alpha preserved (zero alpha)");

    /* White -> luma = 255 */
    uint32_t white = argb(0xFF, 255, 255, 255);
    test_grayscale(&white, 1);
    get_rgb(white, &r, &g, &b);
    CHECK(r == 255, "white -> luma 255");
}

/* ========== Stage 3: Clear Background ========== */
static void test_clear_bg_stage(void) {
    printf("\n== Stage 3: Clear Background ==\n");

    /* Light pixel (avg=200, threshold=180): should become white */
    uint32_t light = argb(0xFF, 200, 200, 200);
    test_clear_bg(&light, 1, 180);
    int r, g, b;
    get_rgb(light, &r, &g, &b);
    CHECK(r == 255 && g == 255 && b == 255, "light pixel (avg>threshold) -> white");
    CHECK(get_alpha(light) == 0xFF, "alpha preserved (light)");

    /* Dark pixel (avg=100, threshold=180): should brighten 1.2x -> 120 */
    uint32_t dark = argb(0x80, 100, 100, 100);
    test_clear_bg(&dark, 1, 180);
    get_rgb(dark, &r, &g, &b);
    CHECK(r == 120 && g == 120 && b == 120, "dark pixel (avg<=threshold) -> 1.2x brightened");
    CHECK(get_alpha(dark) == 0x80, "alpha preserved (dark)");

    /* Very bright (avg=240): should saturate to 255 */
    uint32_t bright = argb(0xFF, 240, 240, 240);
    test_clear_bg(&bright, 1, 180);
    get_rgb(bright, &r, &g, &b);
    CHECK(r == 255, "bright pixel saturates to 255");

    /* At threshold boundary (avg=180): brighten (since <= threshold) */
    uint32_t boundary = argb(0xFF, 180, 180, 180);
    test_clear_bg(&boundary, 1, 180);
    get_rgb(boundary, &r, &g, &b);
    CHECK(r == 216, "at threshold: brightens (180*1.2=216)");
}

/* ========== Stage 4: Adaptive B&W ========== */
static void test_bw_stage(void) {
    printf("\n== Stage 4: Adaptive B&W ==\n");

    /* Simple 10x10 image: top half white, bottom half black */
    int w = 10, h = 10;
    uint32_t *img = (uint32_t *)malloc(w * h * sizeof(uint32_t));
    for (int y = 0; y < h; y++) {
        for (int x = 0; x < w; x++) {
            if (y < h / 2) {
                img[y * w + x] = argb(0xFF, 255, 255, 255);  /* white */
            } else {
                img[y * w + x] = argb(0x80, 0, 0, 0);  /* black, alpha=128 */
            }
        }
    }

    test_bw(img, w, h);

    /* After B&W: top should be white (0xFF), bottom should be black (0x00) */
    int top_white = 1, bottom_black = 1;
    for (int y = 0; y < h / 2; y++) {
        int r, g, b;
        get_rgb(img[y * w + w/2], &r, &g, &b);
        if (r != 0xFF || g != 0xFF || b != 0xFF) top_white = 0;
    }
    for (int y = h / 2; y < h; y++) {
        int r, g, b;
        get_rgb(img[y * w + w/2], &r, &g, &b);
        if (r != 0 || g != 0 || b != 0) bottom_black = 0;
    }
    CHECK(top_white, "top half (originally white) -> white after B&W");
    CHECK(bottom_black, "bottom half (originally black) -> black after B&W");

    /* Alpha preservation in B&W */
    int alpha_preserved = 1;
    for (int y = h / 2; y < h; y++) {
        if (get_alpha(img[y * w + w/2]) != 0x80) alpha_preserved = 0;
    }
    CHECK(alpha_preserved, "alpha preserved through B&W (0x80)");

    free(img);
}

/* ========== Region operations ========== */
static void test_region_ops(void) {
    printf("\n== Region Operations ==\n");

    int w = 20, h = 20;
    uint32_t *img = (uint32_t *)malloc(w * h * sizeof(uint32_t));
    for (int i = 0; i < w * h; i++) img[i] = argb(0xFF, 0, 0, 0);  /* all black */

    /* Fill rect in center */
    test_fill_rect(img, w, 5, 5, 15, 15, argb(0xFF, 255, 0, 0));
    int r, g, b;
    get_rgb(img[10 * w + 10], &r, &g, &b);
    CHECK(r == 255 && g == 0 && b == 0, "fill_rect: center is red");
    get_rgb(img[0], &r, &g, &b);
    CHECK(r == 0, "fill_rect: corner unchanged");

    /* Invert the same rect */
    test_invert_rect(img, w, 5, 5, 15, 15);
    get_rgb(img[10 * w + 10], &r, &g, &b);
    CHECK(r == 0 && g == 255 && b == 255, "invert_rect: red -> cyan");

    /* Reset and test oval */
    for (int i = 0; i < w * h; i++) img[i] = argb(0xFF, 255, 255, 255);  /* all white */
    test_fill_oval(img, w, 5, 5, 15, 15, argb(0xFF, 255, 0, 0));

    /* Center of oval should be red (inside ellipse) */
    get_rgb(img[10 * w + 10], &r, &g, &b);
    CHECK(r == 255 && g == 0 && b == 0, "fill_oval: center is red");

    /* Corner should still be white (outside oval) */
    get_rgb(img[0], &r, &g, &b);
    CHECK(r == 255 && g == 255 && b == 255, "fill_oval: corner unchanged (outside)");

    free(img);
}

int main(void) {
    printf("== engine.c host test suite ==\n");

    test_invert_stage();
    test_grayscale_stage();
    test_clear_bg_stage();
    test_bw_stage();
    test_region_ops();

    printf("\n== RESULTS ==\n");
    printf("PASS: %d\n", pass_count);
    printf("FAIL: %d\n", fail_count);

    if (fail_count == 0) {
        printf("\n✅ ALL TESTS PASSED\n");
        return 0;
    } else {
        printf("\n❌ SOME TESTS FAILED\n");
        return 1;
    }
}
