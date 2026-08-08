# PrintReady AI

**PrintReady AI: Dark PDF to Notes** — Convert dark lecture slides and PDFs into clean, ink-saving printable notes. 100% on-device, offline, free.

Single-activity Jetpack Compose app, Kotlin + a hand-written C engine (NDK/JNI) for page processing, and a from-scratch PDF-1.4 writer. No third-party PDF or image libraries.

## Build

Requirements: JDK 17, Android SDK (platforms;android-35, build-tools;35.0.0, ndk;27.2.12479018), CMake 3.22.1 (auto-installed by AGP).

```
local.properties:  sdk.dir=<path to Android SDK>
./gradlew assembleDebug          # unsigned debug APK
./gradlew assembleRelease        # signed release APK (needs keystore.properties, see below)
```

### Signing (local only, never committed)

```
keystore/printready-release.jks          # generated with keytool, kept out of git
printready/keystore.properties          # storeFile/storePassword/keyAlias/keyPassword
```

The keystore and `keystore.properties` are intentionally not in the repository. Re-create locally before releasing.

## Structure

```
app/src/main/
  cpp/engine.c              Native page engine (invert, Rec.601 grayscale, clear-bg,
                            adaptive B&W, region fill/remove/invert) — own implementation
  cpp/CMakeLists.txt
  cpp/pdf_writer.c         Native PDF-1.4 writer (DCTDecode pages, xref, trailer) — no libraries
  java/com/juyel/printreadyai/
    MainActivity.kt         Single activity
    PrintReadyApp.kt
    core/Engine.kt          JNI bridge
    core/Settings.kt        FilterSettings / OutputSettings / Quality / Orientation
    core/PageItem.kt
    core/PdfEngine.kt       Pipeline: render -> enhance -> sheet layout -> JPEG-80 -> native write
    util/FeatureFlags.kt    Coming Soon / ad slots
    util/Prefs.kt
    ui/...                  Compose UI: bottom nav, Home, Convert, Merge, Contact, Settings
```

## Screens & navigation

Bottom bar: **Contact · Library · Home · Premium · Settings** (Library/Premium behind `FeatureFlags`, showing Coming Soon).

- **Home** — hero, Convert CTA, Tools grid (Merge PDF live; Compress/Images/Page Numberer coming soon), feature strip. Ad/banner slots reserved via flags.
- **Convert** — pick a PDF (SAF) → select pages → enhancements (invert, grayscale, clear background w/ sensitivity, B&W, up to 2 logo-removal boxes with drag handles) → output options (quality Low/Med/High, original size or A4 N-up with rows/columns, orientation, page numbers, separation lines) → progress → Share / Open.
- **Merge** — pick several PDFs (SAF multi-select), order + remove, merge into one file.
- Output is saved to `Documents/PrintReady/` via MediaStore (no storage permission needed on API 29+; legacy write permission declared for 24–28).

## Engine behaviour (port of the documented reference algorithms)

- Quality render ratios: Low 1.38 (~100 DPI), Medium 2.77 (~200 DPI), High 4.16 (~300 DPI)
- Clear-background: mean RGB ≤ threshold (default 180) → ×1.2 boost, else pure white
- Adaptive B&W: Rec.601 luma → gamma 0.6 → ±10px window mean threshold with −10 bias
- Memory: gate at 50 MB free (gc), `System.gc()` every 5 sheets, OOM → lower quality retry (max 3)
- Sheets: A4 595×842 pt fallback, 2px separation lines, 30px page numbers, JPEG quality 80
- Output PDF: each page = full-page JPEG-80 (DCTDecode) XObject, page box = pixel dimensions

## Verify the build

```
aapt dump badging app/build/outputs/apk/release/app-release.apk
apksigner verify --print-certs app/build/outputs/apk/release/app-release.apk
```

## Play Store listing

See [`playstore-listing.md`](playstore-listing.md).
