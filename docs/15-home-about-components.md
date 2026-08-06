# 15 — Home, Features, About & Edit-page components

> App: **com.notescrafter.app** v4.0.8 · Compose
> Source: `p102x3/AbstractC2574m6.java` (LandingScreen.kt),
> `p102x3/AbstractC2493h5.java` (FeaturesScreen.kt),
> `p102x3/AbstractC2684t5.java` (GlobalHomeScreen.kt),
> `p102x3/AbstractC2471g.java` (AboutUsScreen.kt),
> `p102x3/AbstractC2588n4.java` (EditPageScreen.kt)

## 1. FeaturesScreen (`FeaturesScreen.kt:31`, `AbstractC2493h5`)

Route `features` (Info hub):

- Header: **"Features"** (bottom padding) + **"Everything you need to master
  your documents"** (gray)
- List of **FeatureCard** (`FeaturesScreen.kt:83`) built from
  `C2429d5(icon, title, subtitle)` items — e.g.
  `(Icons.Default, "Reorder", "Organize pages")`, plus the enhancement
  features (invert / clear background / grayscale / B&W)
- `FeatureCard`: icon + title + subtitle row card

## 2. LandingScreen sections (`LandingScreen.kt:47`, `AbstractC2574m6`)

The pre-upload landing (flow step `-1`):

| Kt line | Composable | Content |
|---|---|---|
| 205 | (hero) | **"AI-Inspired Document Processing"** |
| 212 | `AIBadge` | "AI" badge chip |
| 283 | (features header) | **"Why Choose Us?"** |
| 312 | `HowItWorksSection` | **"How It Works"** (headlineLarge) + 3 `StepItem`s |
| 344 | `StepItem` | number + icon + title + caption |
| 371 | `FeaturesSection` | feature tiles |
| 406 | `FeatureCard` | per-feature card |
| 532 | (footer card) | **"Free Forever"** (white on tinted card) |
| 613 | CTA | **"Start Processing"** button |

`HowItWorksSection` steps (`C2693te` list): `(Upload icon, "Upload PDF", "No
server upload required.", 1)` + Process + Download steps — copy stresses
**on-device / no upload** processing. Scrolled via `Column + verticalScroll`.

## 3. GlobalHomeScreen (`GlobalHomeScreen.kt:52`, `AbstractC2684t5`)

Home tab container:

| Kt line | Composable | Content |
|---|---|---|
| 337 | `ProductContainer` | FLOW / PRINTS / TOOLS product cards (see 07-home-screen.md) |
| 418 | `WebStyleCTA` | gradient CTA pill |
| 512 | `ToolGridItem` | Quick-Tools grid cell |
| 552 | `BrandFeatureBadge` | trust badges row |

`BrandFeatureBadge` (`GlobalHomeScreen.kt:552`): Row of two badge items —
`(Security, "100% Secure", "Processed Locally")` and
`(FlashOn, "Lightning Fast", "Offline Capabilities")` — icon + bold title +
subtitle; badges animate with `animateFloatAsState` scale on a background
card (`b.e(16, scale(...))`).

## 4. AboutUsScreen (`AboutUsScreen.kt:26`, `AbstractC2471g`)

Route `about-us` (Info hub), `Column + verticalScroll`:

| Kt line | Composable | Content |
|---|---|---|
| 254 | `TechItem` | tech-stack rows (imports hint at `Bolt/Lightbulb/Public/RocketLaunch` icons) |
| 269 | `StatCard` | metric stat cards |
| 293 | `ValueItem` | core-value rows (`VerifiedUser`-style icon + title + text) |

## 5. EditPageScreen (`EditPageScreen.kt:66`, `AbstractC2588n4`)

The per-page manual edit screen (mask drawing; see 10-analytics-scrolling-touch.md
for the drag pipeline):

| Kt line | Composable | Role |
|---|---|---|
| 518 | `SelectionOverlay` | the draggable mask/selection box on the page |
| 663 | `ToolOption` | tool chip (Invert / Clear / Gray / B&W / Logo) |
| 715 | `HistoryButton` | undo-history affordance in the edit toolbar |
