# 16 — Live Chat, Community & Community Pass

> App: **com.notescrafter.app** v4.0.8 · Compose
> Source: `p003a2/a.java` (LiveChatScreen.kt), `p102x3/r.java`
> (CommunityScreen.kt), `p102x3/AbstractC2583n.java` (CommunityPassScreen.kt)

## 1. LiveChatScreen (`LiveChatScreen.kt:23`, `p003a2/a.java:274`)

Route `live-chat` (p083t3/C2315v back-dispatch; routed with `contact-us` in
the shared header back handler `p097w3/d`).

Bare-bones shell:

```
LiveChatScreen(onNavigateBack)
└─ Scaffold(
     topBar = TopAppBar(back IconButton, title "Live Chat Support" white)
     content = static placeholder AbstractC2616p0.f15392c
   )
```

- Title text **"Live Chat Support"** (`C2568m0` — top app bar colors
  `p107y3.a.e`, white title)
- Back button = `AbstractC2616p0.f15391b` (`C2584n0`)
- Content = a **static singleton** (`C2600o0`) — no chat transport, no
  WebSocket/HTTP messaging, no message list in the app. No
  `/api/chat*` endpoint exists anywhere in the binary.

**Conclusion: the "Live Chat" entry point is a stub** — it renders a fixed
placeholder behind a chat-styled top bar; real chat is not wired up in this
build.

## 2. CommunityScreen (`CommunityScreen.kt:88`, `p102x3/r.java`)

Route `community` (bottom nav/header). Intro copy:

> "Connect with us on your favorite platforms. Get updates, share feedback,
> and be part of the NotesCrafter community."

- List of **SocialCard** (`CommunityScreen.kt:308`): items built from
  `C2646qe(name, tagline, icon?, url)` — e.g.
  **"Telegram"** — "Join our Telegram group for instant updates and community
  chat" (plus the other platforms)
- **CommunityStat** (`CommunityScreen.kt:369`): social-proof stat chips
- Footer: "Have questions or want to get in touch directly?" → Contact Us

Tapping a card opens the external platform link (deep intent, no webview).

## 3. CommunityPassScreen (`CommunityPassScreen.kt:149`, `AbstractC2583n.java`)

A huge file (7000+ lines) holding the whole membership/landing surface:

| Kt line | Composable | Role |
|---|---|---|
| 149 | `CommunityPassScreen` | root |
| 561 | `PassCard` | single tier card |
| 728 | `ComparisonTable` | side-by-side tier comparison |

Copy:
- **"COMMUNITY PASS"** badge (10sp, black on accent)
- **"Support NotesCrafter and unlock unlimited processing power."**
- **"Compare each Community Pass tier and see what you unlock."** +
  **"Scroll to compare"** (40% alpha hint — the table is horizontally
  scrollable)

The root observes `AuthManager` state (`authManager.f13538x` = the cached
rates table) and shows a **"Sign In with Google"** gate (`C2518ie` worker:
*"Sign in with Google to sync your Community Pass memberships, manage
shipping addresses…"*) when logged out — see 17-auth-google-signin-addresses.md.

Same gate appears on:
- `SettingsScreen` (`C2518ie` also carries the SettingsScreen trace)
- `PrintLandingScreen` (PRINTS; `Ib.java` — "Sync Your Cart", L.java:2886)
- checkout EDD block (`Mb.java` — "Sign in to see estimated delivery date
  for your pincode.")
