# 07 — Global home screen (landing)

The app's landing screen: brand hero + three product containers (FLOW, PRINTS, TOOLS) + trust badges. Pure UI, zero server calls.

## Composition

`GlobalHomeScreen` (GlobalHomeScreen.kt:52, `p102x3/AbstractC2684t5`) — root `RouteScope` composable; signature:

```
fun GlobalHomeScreen(
    onNavigateToFlow: () -> Unit,
    onNavigateToPrints: () -> Unit,
    onNavigateToTools: () -> Unit,
    modifier: Modifier = Modifier
)
```

Layout (Column, scrollable, top padding 80.dp, zero horizontal padding):

```
┌──────────────────────────────┐
│ ✦ brand-bar (top-right icon) │
│                              │
│  NotesCrafter   (hero, gradient)│
│  Reimagining the Student     │
│  Learning Experience         │
│                              │
│  [ FLOW ]  ← ProductContainer│
│  [ PRINTS]                   │
│  [ TOOLS ]                   │
│                              │
│  ⛨ 100% Secure  ⚡ Lightning │
│    Processed Locally   Fast  │
│    Offline Capabilities      │
└──────────────────────────────┘
```

### Hero

- Title **"NotesCrafter"** — `headlineLarge` style, 40.sp, `FontWeight.ExtraBold`, filled with a **gradient brush** from `p107y3.a.f15978a` → `f15979b` (the app's brand gradient pair used across FLOW branding)
- Tagline **"Reimagining the Student Learning Experience"** — `titleMedium`, 18.sp, `FontWeight.Bold`, color `f15990o`

### Product containers (`ProductContainer`, GlobalHomeScreen.kt:337)

Three cards, each a Box with:
- `clip` + `background` (RoundedCornerShape 16.dp, **60% white** over the accent), `border` 1.dp (accent at 25% alpha)
- press-scale animation: `animateFloatAsState(isPressed → 0.98f : 1.0f)` — animation label **`"card_scale"`** (spring, stiffness default, damping 0.0 → snappy)
- click → respective `onNavigateTo*` callback

| Card | Accent color (ARGB) | Gradient? |
|---|---|---|
| FLOW | brand gradient (`f15978a`→`f15979b`) | yes |
| PRINTS | `#FF5A2A2B` (0x4279286145) | solid |
| TOOLS | `#FF75A2B`… `0x4294286859` | solid |

Inside: product name `headlineMedium`, extraBold, accent color; sub-line + a trailing chevron icon; FLOW shows the brand logo composable; PRINTS shows the Notebook icon; TOOLS the Build icon.

### Tool grid (`ToolGridItem`, GlobalHomeScreen.kt:512)

Two-column `FlowRow` of tool chips: each a 36.dp circle (white 5% fill, 1.dp border white 10%) with a 16.dp accent icon (`Color(0xFFFCBF49)`-ish tint per item) + label `titleSmall`, bold, centered, 10.sp letter-spacing. Backs the **TOOLS** card content; FLOW card instead hosts its FLOW feature badges.

### Web-style CTA (`WebStyleCTA`, GlobalHomeScreen.kt:418)

Under the hero — a wide pressable strip (title + subtitle + badge `str2`), scale animation **`"cta_scale"`** (0.98f pressed), and it **overrides `LocalDensity` fontScale = 1.3f** for its content (stylized, more compact typography). Used for the FLOW call-to-action banner.

### Trust badges (`BrandFeatureBadge`, GlobalHomeScreen.kt:552)

Row of four badges; each = icon in a 24.dp rounded-swatch (brand gradient tint) + two text lines:

| Icon | Title | Subtitle |
|---|---|---|
| Security | 100% Secure | Processed Locally |
| FlashOn | Lightning Fast | Offline Capabilities |

## State & side effects

- **No network, no state hoisting** — stateless screen; only parameters are the three navigation lambdas.
- Nav bar: bottom `NavigationBar` showing only the current-destination marker (icon + label, e.g. home chip), `RouteScope` wiring provides the lambda plumbing (the "home" destination is the landing).

## Routes from home

| Callback | Router destination | Screen |
|---|---|---|
| `onNavigateToFlow` | `"flow"` | FLOW: feature tour / marketing flow |
| `onNavigateToPrints` | `"prints"` | PRINTS: notebook upload order flow |
| `onNavigateToTools` | `"tools"` | TOOLS: tool registry home |

## Files

- `p102x3/AbstractC2684t5.java` — GlobalHomeScreen.kt (screen, hero, containers)
- `p102x3/C2668s5.java` — WebStyleCTA content composable lambda
- `p083t3/S.java` — scaffold/home wiring (`RouteScope`)
- `p083t3/L.java` — central string-based router (`home` → GlobalHomeScreen)
- `p107y3/a.java` — design tokens (brand gradient `f15978a/f15979b`, text colors `f15990o`)

## Recipe: adding a product entry

1. Add a `ProductContainer` block in `GlobalHomeScreen` body with the accent color + icon + name.
2. Wire a new `onNavigateToX` lambda in the signature and in the scaffold (S.java).
3. Register `"x"` route + destination in `L.java` router.
4. (Optional) give the card a gradient via `Brush.linearGradient(brandGradient)`.
