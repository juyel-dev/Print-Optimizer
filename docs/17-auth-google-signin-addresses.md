# 17 — Google Sign-In & the address book

> App: **com.notescrafter.app** v4.0.8 · Compose
> Source: `p092v3/h.java` (AuthManager), `p092v3/d.java` (login POST),
> `p102x3/AbstractC2595nb.java` (PrintAddressesScreen.kt),
> `p092v3/w.java` (address fetch), `p083t3/C2295k0.java` (address delete),
> `p083t3/S0.java` (set default)

## 1. AuthManager (`p092v3/h.java`) — Google Sign-In via CredentialManager

Singleton (`f13520z`). Constructor reads **`auth_prefs`**:

| Key | Type | Default |
|---|---|---|
| `is_logged_in` | bool | false |
| `is_premium` | bool | false |
| `user_name` / `user_email` / `user_photo` | string | null |
| `subscription_plan` | string | null |
| `remaining_days` | int | 0 |
| `print_first_login_at` | string | null |
| `first_order_diamond_deal_eligible` | bool | false |
| `jwt` / `fcm_token` | string | null (login/logout only) |

Plus an in-memory **per-page price table** (B&W / Color):

| Plan | B&W | Color |
|---|---|---|
| guest | 1.25 | 3.35 |
| monthly | 1.15 | 3.00 |
| half_yearly | 1.05 | 2.75 |
| annual | 0.99 | 2.35 |
| lifetime | 0.89 | 1.99 |

On init: worker `a(this)` (fetch rates) and, if logged in, worker `b(this)`
(refresh profile).

### Sign-in flow — `b(context)` (Google ID credential)

1. sets `signingIn` flag (`u`) = true
2. builds a `GetCredentialRequest` (`p106y2.a` + `n`) with a **Google ID**
   option → `I.e.a(context, request)` = **CredentialManager.getCredential**
   (androidx.credentials / play-services-auth)
3. validates the returned credential type ==
   `com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL`
   (else `"Unexpected credential type"`)
4. extracts the **idToken** from the credential bundle
   (`o4.d.f(bundle).f15977c`)
5. logs `"Got Google idToken, sending to backend..."` → calls `a(idToken)`

Errors: `J.c` (cancellation) → `"Sign-in cancelled by user"`; other → 
`"Sign-in failed: <msg>"` / `"Unexpected error during sign-in"` — all reset
the flag.

### Login exchange — `a(idToken)` (`p092v3/d.java`)

```
POST https://notescrafter.com/api/auth/mobile
body: {"idToken": "<google-id-token>"}
→ { success, data: { jwt, user: {name, email, …}, has_active_subscription } }
```

On success persists `jwt`, `user_name`, `user_email` (+ rest) into
`auth_prefs`. The JWT is the Bearer token for every protected
`notescrafter.com/api/print/*` call and the FCM registration.

### Logout — `c()`

If `jwt` + `fcm_token` present → DELETE `api/notifications/register` with
Bearer JWT (worker `k`), then **`auth_prefs.edit().clear()`** + reset all
state values. Logs `"Signed out"`.

### Auth-gated routes

Root dispatcher (`p083t3/L.java`) pattern: logged out → `S.d(title,
"Sign in with Google to …", …)` gate screen, e.g.:

- `my-addresses` → "My Addresses" / "Sign in with Google to manage your
  delivery addresses."
- cart sync → "Sync Your Cart" / "…to sync your cart, manage shipping
  addresses, and order prints."

## 2. Address book — `PrintAddressesScreen.kt` (`AbstractC2595nb.java`)

Components: screen root (`PrintAddressesScreen`, trace 998502562),
**AddressCard** (`kt:575`), **AddressField** (`kt:1149`, used ~8× in the
form). Empty states: **"My Addresses"** header, **"No addresses saved yet"**
(white 18sp), *"Add your first shipping address to start ordering your custom
notes."*

### Address model `v` (`p092v3/v.java`)

`id, first_name, last_name, full_name, phone, flat_house, area_street,
landmark, city, state, pincode, address_type, is_verified, is_default`

### API surface (all `/api/print/shipping-addresses/`)

| Call | Method | Worker |
|---|---|---|
| list | GET `shipping-addresses` (parse `data[]` → `List<v>`) | `p083t3/C2295k0` → `p092v3/w` |
| add/update | POST `shipping-addresses` | (checkout form submit) |
| delete | not implemented in this build | — |
| set default | POST `shipping-addresses/<id>/default` | `p083t3/S0` |
| pincode lookup | (check-edd/pincode) | `p092v3/w` case 1 → `h(city, state)` or `"Pincode not serviceable"` |

The checkout screens consume `AddressCard` via `p083t3/C2294k`; the Enhance
flow embeds an address field (`AbstractC2595nb.e(state, false)` from
`p083t3/C2306q`). Addresses are **server-side** (no local cache) — a logged-out
user sees the sign-in gate instead.
