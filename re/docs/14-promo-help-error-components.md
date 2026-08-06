# 14 — Promo, help, error & warning components

> App: **com.notescrafter.app** v4.0.8 · Compose
> Source: `p102x3/Rb.java` (PrintLandingScreen.kt), `p102x3/Qb/Ob/Pb.java`
> (flash-sale dialog internals), `p102x3/D5.java` (HelpCenterScreen.kt),
> `p102x3/AbstractC2397b5.java` (ErrorScreen.kt), `p102x3/Gd.java`
> (WarningBanner, PrintOrderScreens.kt)

## 1. WeekendFlashSaleDialog (`PrintLandingScreen.kt:388`)

Root (`Rb.java:2942`): raw `Dialog` (not Material3) with
`DialogProperties(false, false, false)` — **dismiss-on-outside disabled**.

Internals (three merged lambdas):

| File | Role |
|---|---|
| `Qb` | main content lambda (layout of the card) |
| `Pb` | promo card: `Brush` **gradient background**, scaled badge circle, and the title logic |
| `Ob` | inner row lambda |

Dynamic title (`Pb.java:227`):

```java
z3 ? "🎉 Weekend Flash Sale 🔥 Live Now" : "🕐 Upcoming 🔥 Saturday Flash Sale"
```

- `z3` = "is the sale live this weekend" flag (weekday vs Sat/Sun evaluation)
- title drawn in orange (`Color(0xFFFF9D3C)`-family, `4294677052`), black bold
- Card itself: gradient fill + `scale` animation on a circular badge

Part of the PRINTS landing surface (`PrintLandingScreen.kt:79`), shown when
the landing loads on a weekend.

## 2. AnimatedPromoBanner (`PrintLandingScreen.kt:289`, `Rb.java:142`)

- `Card` with `clickable` + `animateContentSize`
- **`AnimatedContent`** (`"promo_rotation"` transition, fade/slide) rotating
  through a numeric promo value (`numValueOf` = animated int state)
- Bottom-pinned on the PRINTS landing hero

## 3. HelpCenterScreen (`HelpCenterScreen.kt:45`, `D5.b`)

Info-hub screen (route `help`):

- State: search query `""`, category `"general"`, expanded FAQ `null`
- Header: **"Help Center"** (padding bottom) + **"Find answers to common
  questions and get help with using NotesCrafter"** (gray)
- Lazy list of **FAQCard**s, filtered by query + category

### FAQCard (`HelpCenterScreen.kt:334`, `D5.a`)

`(faq: C2413c5, expanded: Boolean, onToggle)` — question row + expand chevron;
`C2413c5` = FAQ item (question/answer/category).

## 4. ErrorScreen (`ErrorScreen.kt:23`, `AbstractC2397b5.a`)

```
ErrorScreen(errorMessage: String, onRetry: () -> Unit)
```

Full-size error card: message + retry action; used by screens that can fail
loading (orders dashboard, etc.).

## 5. WarningBanner (`PrintOrderScreens.kt:1182`, `Gd.java:2596`)

Used on checkout/upload screens for notice rows:

- `Card(fillMaxWidth)` tinted **8% of the accent color**
  (`copy(color, alpha 0.08f)` background)
- message + optional action (e.g. "pending payment" notices, page-count
  warnings)

---

### Placement map (PRINTS landing file `PrintLandingScreen.kt`)

For orientation, `Rb.java` holds the entire landing: `PrintHeroSection` (705),
`PrintFeaturesSection` (910) / `PrintFeatureCard` (967), `PrintHowItWorksSection`
(1019), `PrintStepCard` (1061), `PrintMadeForSection` (1125),
`PrintSocialProofSection` (1195) / `PrintReviewCard` (1236),
`PrintFaqSection` (1324) / `PrintFaqAccordionItem` (1392),
`NcfGallerySlider` (1451), `UnifiedShippingAndEddCard` (2219),
`PrintingRateCardGrid` (2382), `PrintSupportSection` (2573),
`AnimatedPromoBanner` (289), `WeekendFlashSaleDialog` (388).
