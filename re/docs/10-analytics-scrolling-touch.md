# 10 — Analytics, Scrolling & Touch Deep-Dive

> App: **com.notescrafter.app** v4.0.8 · Jetpack Compose (obfuscated)
> Source: `NotesCrafter/jadx-out/sources` (packages p083t3 / p092v3 / p097w3 / p102x3 / com.notescrafter)

---

## 1. Analytics

### 1a. `AnalyticsManager` (`com/notescrafter/utils/AnalyticsManager.java`)

Singleton wrapper around Firebase Analytics. `initialize(ctx)` is called from
`MainActivity` (uses the internal measurement impl directly, so events are
queued even when the public `FirebaseAnalytics` handle is unavailable).

| Event | Params | Fired from |
|---|---|---|
| `screen_view` | `screen_name`, `screen_class` (same value) | screen tracker `p083t3/C2311t` (LaunchedEffect on route) |
| `cta_click` | `item_name`, `screen_source`, `content_type="button"` | navigation dispatcher `p083t3/L`, upload continue `C2290i`, enhance dialogs `C2306q` |
| `filter_toggle` | `filter_name`, `enabled` | enhance filter panel `p102x3/E4` |
| `handled_error` | `error_name`, `error_message` | `p083t3/J` (`"Subscribe_Intent_Failed"`) |
| raw `logEvent(name, bundle)` | any | future/custom use |

### 1b. Screen-name mapping (`p083t3/C2311t` — full route → event map)

| Route / state | `screen_view` name |
|---|---|
| `refund-policy` | `Refund_Policy_Screen` |
| `how-to-print` | `How_Print_Screen` |
| `community` | `Community_Screen` |
| `privacy-policy` | `Privacy_Policy_Screen` |
| `features` | `Features_Screen` |
| `help` | `Help_Center_Screen` |
| `terms-of-service` | `Terms_Service_Screen` |
| `shipping-policy` | `Shipping_Policy_Screen` |
| `pomodoro-setup` | `Pomodoro_Setup_Screen` |
| `pomodoro-timer` | `Pomodoro_Timer_Screen` |
| `contact-us` | `Contact_Us_Screen` |
| `settings` | `Settings_Screen` |
| `about-us` | `About_Us_Screen` |
| `home` (Flow step −1…6) | `Downloads_Screen` / `Landing_Screen` / `Upload_Screen` / `Reorder_Screen` / `Preview_Screen` / `Enhance_Screen` / `Processing_Screen` / `Success_Screen` |
| anything else | raw route string |

### 1c. CTA click inventory

- `"Start Processing"` → Landing_Screen
- `"Continue"` → Upload_Screen (`C2290i`) / Reorder_Screen / Preview_Screen
- `"Process_File"` → Enhance_Screen
- `"Process_Another"` → Success_Screen
- `"Quality_<QUALITY.name>"`, `"Size_<PAGESIZE.name>"` → Enhance_Screen (`C2306q`)

### 1d. Filter toggles (`p102x3/E4`)

`filter_toggle` with `filter_name`: **Invert_Colors**, **Clear_Background**,
**Grayscale**, **Black_White** + `enabled` boolean — logged on every toggle in
the Enhance filter panel.

### 1e. Firebase auto-collection (SDK-driven, not app code)

- `first_open`, `session_start`, `user_engagement`, app-instance ID — via
  `AppMeasurementReceiver/Service/JobService` + CCT datatransport
- `mcc_mnc` property from `TelephonyManager.getSimOperator()` (see doc 09)
- Firebase Installations (FID) for FCM targeting
- No Crashlytics, no custom user properties found

### 1f. Bonus: original Kotlin file names (Compose trace strings)

The composer traces leak the pre-obfuscation source names
(`com.notescrafter.ui.screens.*`). Notable screens not yet documented:
**ToDoScreen** (To-Do tab: `TaskItemMinimal`, `TimerTaskItem`, `AnalogClock`,
`CalendarWidget`), **PomodoroSetupScreen/PomodoroTimerScreen**,
**PrintOrderShippingScreen/PrintOrderCheckoutScreen/PrintOrderUploadScreen**,
**PdfCropScreen**, **LogoSelectionScreen**, **DownloadsScreen**,
**WeekendFlashSaleDialog**, **AddressBottomSheet**, **ReorderScreen**
(`ReorderableItem`), `PrintMyOrdersScreen.kt:560` (`OrderCardItem`),
`PomodoroSetupScreen.kt:67` (`PomodoroStepItem`).

---

## 2. Scrolling

### 2a. Two container styles

1. **`Column` + `verticalScroll(rememberScrollState())`** — whole-screen scroll:
   Landing (`AbstractC2574m6`), Settings (`AbstractC2598ne`), Home
   (`AbstractC2684t5`), About, Contact, legal pages (InfoPageScreen), community
   plans (`AbstractC2583n`), Preview/EditPage (`AbstractC2588n4`),
   `AbstractC2545k9`, `AbstractC2595nb`, `A6`, `Cc`, `C2467fb`.
2. **Lazy lists**:
   - Orders dashboard `PrintMyOrdersScreen` — LazyColumn of `OrderCardItem`
     (status chips, refund status, tracking/EDD card)
   - Quick Tools — `LazyVerticalGrid` (`p097w3/g` grid items, `Ud` registry)
   - Category/tag chip rows — LazyRow (`p097w3/g`)
   - EditPage page-number strip — `Row` + `horizontalScroll` (`p097w3/t`)

### 2b. What does NOT exist

- **No programmatic scrolling** — zero `scrollToItem` / `animateScrollToItem` /
  `scrollToPosition` anywhere; scroll state is never driven from code
- **No sticky headers** (`StickyHeader` absent)
- **No `NestedScrollConnection`** — no nested-scroll coordination
- **No infinite/endless lists** (no content-type based pagination)

### 2c. Pagers (swipe)

- `HorizontalPager` / `PagerState` used by **NativePDFPageSlider** (Preview
  page swiping: `p102x3/Ab`, `Cb`, `Db`, `Gd`, `Rb`, `C2707uc`, `C2786zb`) and
  the **NcfGallerySlider** (home gallery showcase)
- Pager workers: `p102x3/C2589n5`, `C2605o5`, `C2621p5`, `Ae`

### 2d. Decorative scrolling canvas

`p097w3/g` draws the hero's **dot-grid background** (`Canvas.drawPoints`, white
8% alpha, 1dp round-cap dots, grid scaled to the canvas) — a static pattern,
not interactive.

---

## 3. Touch

### 3a. The one custom gesture: mask drawing on `EditPageScreen`

`p102x3/AbstractC2588n4` ("Edit Page N", Cancel icon, OutlinedButton confirm) —
per-page manual edits. The selection overlay is drawn by **drag**:

- `C2524j4` attaches `pointerInput` (SuspendingPointerInputFilter)
- `C2508i4` runs `detectDragGestures(onDragStart, onDrag, onDragEnd)`:
  - **onDragStart** `C2476g4`: normalizes the touch offset to the canvas size
    (`x/width, y/height`) → records the first corner
  - **onDrag** `C2412c4`: updates the live rect between start and current point
  - **onDragEnd** `C2492h4`: `PointerInputChange.consume()` + commits the rect
- Result feeds the mask models (`p087u3/h`): `InvertRect`, `InvertOval`,
  `MaskRect(rect,color)`, `MaskOval(rect,color)` and the logo-removal box
  (`removeLogo` native call, circle/rect `ShapeOption`, `SelectionOverlay`,
  `LogoSelectionScreen`)

### 3b. Everything else is tap-driven

- Press-scale micro-interaction: `SettingsItem`/cards scale to **0.97** on
  press (`"click_scale"`), spring back on release — used app-wide (docs 04/08)
- Controls: `IconButton`, `OutlinedButton`, `TextButton`/`WebStyleCTA`,
  `FilterToggle`, `ToggleGroup`, `RadioButtonCustom`, `DropdownSelector`,
  checkboxes (ToDoScreen tasks), `TabButton` (FLOW/PRINTS/TOOLS pills)
- Reorder screen: `ReorderableItem` is static (per-item "Remove" action) — no
  drag-to-reorder anywhere in the app

### 3c. What does NOT exist

- **No haptics** — no `HapticFeedback` / `performHapticFeedback` in app code
- **No pinch-zoom** — Preview and EditPage have no `transformable`/
  `detectTransformGestures` (no `graphicsLayer` scale anywhere)
- **No long-press** (`detectTapGestures` with onLongPress absent), no
  `combinedClickable`, no drag-to-dismiss, no swipe-actions on list items

---

## Bottom line

- Analytics is modest and deliberate: 5 custom event types + Firebase
  auto-events; screen names are curated (`*_Screen`), not raw routes.
- Scrolling is plain and user-driven: Column+verticalScroll or Lazy lists,
  swipeable pagers on Preview/home showcase; no sticky/nested/programmatic
  scrolling.
- Touch is minimal: one purpose-built drag gesture (mask drawing) + tap
  controls with press-scale feedback; no haptics, zoom, or reorder gestures.
