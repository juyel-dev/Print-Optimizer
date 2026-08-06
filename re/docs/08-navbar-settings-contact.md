# 08 — Navigation chrome, Settings & Contact

How the app is navigated: the adaptive top bar (AppHeader + SubHeader tabs), the 5-destination **BottomNavBar**, and the two support hubs — **Settings & Info** and **Contact Us** — including every route, entry, and external link.

## Top bar (Scaffold topBar — MainActivity.kt:453)

The `Scaffold` (MainActivity.kt:449) topBar switches entirely on the current route (`C2319x`):

| Route group | Bar shown |
|---|---|
| Tool screens (`pomodoro-timer/setup`, `pdf-merge/split/compress/to-jpg/jpg-to-pdf/add-page-numbers/organize/crop/invert`) | **none** (immersive) |
| Print screens (`print-order-upload/shipping/checkout`, `my-orders`, `my-addresses`, `community-pass`) | compact **AppHeader only** (back-to-Flow download icon + cart) |
| `home`, `flow` + every other route | full **AppHeader + SubHeader tabs** |

### AppHeader (MainActivity.kt:1068)

Transparent full-width Row (statusBarsPadding, 16dp/12dp padding):

- 40dp circular **app logo** (`ic_app_logo_foreground`)
- **"NotesCrafter"** wordmark — `titleLarge`, bold, filled with the brand **gradient** (`f15978a → f15979b`)
- Spacer(weight 1) → **Cart icon button** (24dp, `f15990o`), with a 16dp **badge** (gradient circle, top-end offset −4,4) showing the cart item count when `> 0`; cart click → `print-order-upload`
- Print screens only: a trailing **Download icon button** (`f13154b`) → back to `flow` with `FlowViewModel.g(-1)`

### SubHeader tabs (MainActivity.kt:1158)

Three equal-width **pill tabs** — `FLOW` / `PRINTS` / `TOOLS` (labels `B3.h(label, route)`):

| Tab | Route |
|---|---|
| FLOW | `flow` |
| PRINTS | `how-to-print` |
| TOOLS | `tools` |

- Pill: `weight(1f)`, `clip` rounded **16dp top corners** (bottom 0 — melts into content), active pill = white **8%** background
- Label: `labelLarge`, 1.5sp letter-spacing — active: **Bold + white**; inactive: **Medium + white 50%**
- Active underline: **18×3dp gradient capsule** (brand gradient, circle shape); inactive: 9dp empty spacer
- Click → `C2290i(0, routeSetter, route)` → route switch; FLOW additionally resets FlowViewModel (`h()` + step 0)

## BottomNavBar (BottomNavBar.kt:65)

The real primary navigation. `p097w3.f.f13615a` = static 5-item list (`p097w3.r` = NavItem(icon, label, route)):

| # | Icon | Label | Route |
|---|---|---|---|
| 1 | Chat | Contact | `contact-us` |
| 2 | Checklist | To-Do | `dashboard` |
| 3 | Home | Home | `home` |
| 4 | Assignment (auto-mirrored) | My Orders | `my-orders` |
| 5 | Settings | Setting | `settings` |

- Rendered via `NavigationBar(container = transparent)` over a full-width box: `f15980c`-tone surface at **95%** alpha + 20dp **shadow** (black 50%); `navigationBarsPadding`
- Content `fontScale` clamped to **1.2×** via a local `Density` override
- Item colors: selected icon+label = brand **`f15978a`**, unselected = **`f15990o`** (NavigationBarItemDefaults)
- Click → `C2290i(3, routeSetter, NavItem)` → `route = item.route`
- **Active-state mapping** (an item highlights for more than its own route):
  - **Home** active on: `home`, `flow`, `how-to-print`, `tools`, `print-price-calculator`
  - **Setting** active on: `settings`, `my-addresses`, `community-pass`
  - **Contact** active on: `contact-us`, `live-chat`
  - To-Do / My Orders: exact route match
- Visibility (Scaffold bottomBar, MainActivity.kt:514): shown unless the route is a **tool screen**, a **print-order screen**, or a Flow state that hides it (hidden on `flow` states 2–5, i.e. reorder/preview/enhance/success; visible on `home` and flow states 0/1/6/−1)

## Settings & Info (`settings` → SettingsScreen.kt:44)

`AbstractC2598ne.b` — scrollable Column:

- Header: **"Settings & Info"** (displaySmall, bold) + *"Manage your profile, preferences, and view legal guidelines."*
- **Account** section (signed-in only):
  - **ProfileCard** (`C2486ge`) — GlassCard with plan-tinted background (plan color at 35% alpha) + plan gradient; avatar/name/email; plan badge:
    - `monthly` → "Silver Pass ✨" · `half_yearly` → "Gold Pass ✨" · `annual` → "Platinum Pass ✨" · `lifetime` → "Diamond Pass ✨" · other → "Active Pass ✨" · free → "Free Account"
    - Plan colors: monthly `0xFF4279286145`… (annual `4286680312`, lifetime `4280472558`, monthly `4287931320`, half_yearly `4294286859`); "N days left" countdown; **"No active pass (Tap to view plans)"**
  - Items: **Community Pass** → `community-pass`; **My Addresses** → `my-addresses`; **Sign Out**
- Guest instead sees a **Sync Your Account** card (`C2518ie`) → Google sign-in
- **Product** section (`C2534je`): Features · My Downloads (`downloads` → jumps Home + Flow step −1) · How to Print Notes (`how-to-print`)
- **Company** section (`C2550ke`): About Us (`about-us`) · Community (`community`) · Help Center (`help`) · Contact Us (`contact-us`)
- **Legal** section (`C2566le`): Privacy Policy · Terms of Service · Refund Policy · Shipping Policy — each opens the in-app **InfoPageScreen** (`F5.a(title, full-text)`, InfoPages.kt:19) with the legal body stored as constants
- Footer: 60dp logo (`ic_real_logo`), **"NotesCrafter for Android"**, "© 2026 NotesCrafter. All rights reserved."

`SettingsItem` (SettingsScreen.kt:580): 38dp rounded icon swatch (`j6` color, 10dp radius) + 20dp icon; title `bodyLarge` semibold `f15990o`; optional subtitle `bodySmall` `q`; trailing chevron (`Icons.AutoMirrored.Outlined.ArrowForwardIos`, `f15990o` at 40% alpha); 1dp white-5% divider when requested; press scale **0.97** (`"click_scale"`).

`SettingsSection` (SettingsScreen.kt:550): uppercase section title (`labelLarge`, bold, 1.5sp tracking, accent at 70% alpha).

## Contact Us (`contact-us` → ContactUsScreen.kt:42)

`p102x3.F3.b(onNavigateBack, onNavigateToHelp, onNavigateToLiveChat)`:

- Title **"Contact Us"** (headlineLarge, bold) + *"Have questions? We would love to hear from you. Select a support option below to connect with us instantly."*
- **Live Chat card** (`C3`): "Instant Live Support" → `live-chat` (in-app live chat screen `p003a2.a.b`)
- **Get in touch card** (`D3`, ContactUsScreen.kt:190) — `ContactMethodItem` rows (`F3.a`):
  | Icon | Title | Subtitle | Value | Action |
  |---|---|---|---|---|
  | Email | Email Support | Questions or feedback | support@notescrafter.com | `mailto:support@notescrafter.com` |
  | Chat | WhatsApp Support | Chat with us instantly | +91 6203770581 | `wa.me/916203770581?text=…` |
  | Phone | Phone Support | Voice call support | +91 6203770581 | `tel:+916203770581` |
  | Public | Social Media | Follow us for updates | @notescrafterapp | — |
  + Address row: **"Address" / "NotesCrafter\nwww.notescrafter.com"** (LocationOn swatch)
- **Help card** (`E3`, accent background): "Looking for quick answers?" / "Check out our FAQ section for instant answers to common questions." → `help`
- WhatsApp launch (`F3.c`): `https://api.whatsapp.com/send?phone=916203770581&text=Hi NotesCrafter, I need help with printing my notes. Can you please call/chat with me?` with `package=com.whatsapp`; fallback to `https://wa.me/…`; Toast **"WhatsApp is not installed on this device"**
- Back from Contact Us → `community`

## Related screens

| Route | Screen | Notes |
|---|---|---|
| `help` | HelpCenter | FAQ hub |
| `live-chat` | LiveChat | `p003a2.a.b` |
| `community` | Community (`r.a`) | back → `contact-us` |
| `about-us` | AboutUsScreen (AboutUsScreen.kt:26) | "About NotesCrafter" / "Free, privacy-first PDF tools that work entirely on your device" / What We Do · Powered by Modern Technology · Our Core Values + StatCard/TechItem/ValueItem |
| `info` | InfoPageScreen | "Information" / "Select a topic" topic index |
| `terms-of-service`, `privacy-policy`, `refund-policy`, `shipping-policy` | InfoPageScreen | full legal text embedded in router (Effective Date: May 15, 2026; operated by Nitish Kumar, Aurangabad, Bihar; Shiprocket partner; no-refund policy; files deleted 30 days after delivery) |
| `community-pass` | PassScreen (`AbstractC2583n`) | back → `settings` |
| auth gate | `S.d` (SignInRequiredScreen, MainActivity.kt:1235) | glass card with title + "Sign in with Google…" message, e.g. "My Addresses — Sign in with Google to manage your delivery addresses." |
| external | — | `https://notescrafter.in/pricing`, YouTube `https://www.youtube.com/@NotesCrafterApp?sub_confirmation=1` |

## Shared nav lambda toolbox

- `C2315v` (case → route): 2 `help`, 3/4 `live-chat`, 4/11/23 `contact-us`, 5 `dashboard`, 17/19/24/25/27 `how-to-print`, 22 `my-orders`, 26 `print-order-shipping`, 28 `print-order-upload`, default `print-order-checkout`
- `I`: 0 `contact-us`, 1/3/4/5 `how-to-print`, 2 `print-order-shipping`, 6/7/8 `settings`, 9 `community`
- `C2313u`: 0/1 → `flow` + FlowViewModel step −1; 2 → `flow` + reset (`h()` + step 0)
- `C2317w`: 0 tab click (flow → reset); 1 settings items (`downloads` → `home` + Flow step −1)
- `C2321y`: 0 = bottom-nav route setter
- `C2290i`: 0 tab click, 3 nav-item click (shared dispatcher)

## Files

- `p083t3/{S,M,C2319x,C2323z,C2321y,C2313u,C2317w,C2315v,I,J,C2290i,AbstractC2278c,C2274a,C2276b}.java`
- `p097w3/{f,e,d,b,c,r}.java` — BottomNavBar + NavItem
- `p102x3/{F3,C3,D3,E3}.java` — ContactUsScreen
- `p102x3/AbstractC2598ne.java` — SettingsScreen; `{C2486ge,C2518ie,C2534je,C2550ke,C2566le}.java` — section lambdas
- `p102x3/AbstractC2471g.java` — AboutUsScreen; `p102x3/F5.java` — InfoPages
