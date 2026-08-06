# 12 — Downloads & the upload source picker

> App: **com.notescrafter.app** v4.0.8 · Compose
> Source: `p102x3/X3.java` (DownloadsScreen.kt), `p102x3/O3.java` (file loader),
> `p083t3/D.java` (view/share/delete actions), `p102x3/Fd.java` (reprocess),
> `p102x3/Gd.java` (PdfSourcePickerDialog, PrintOrderScreens.kt)

Everything the Flow produces lands in **app-private external storage**:

```
getExternalFilesDir(null)/NotesCrafterFiles/   <- only *.pdf files are listed
```

No MediaStore, no public Downloads folder, no content provider except
`FileProvider` (authority `<packageName>.provider`) used only to hand the file
to other apps.

---

## 1. DownloadsScreen (`DownloadsScreen.kt:58`, `X3.b`)

Route: home step `-1` (root dispatcher `p083t3/L.java:620`). Pure stateless UI —
all file work happens in callbacks injected by the dispatcher.

### State (remembered in the root)

| State | Type | Purpose |
|---|---|---|
| `mutableState` | `List<H3>` (default `C.f167o`) | file list, loaded once |
| `mutableState2` | `File?` | rename-dialog target (`!= null` → dialog shown) |
| `mutableState3` | `File?` | delete-dialog target (`!= null` → dialog shown) |
| `mutableState4` | `String` | rename text-field value (prefill = file name) |

### Loader — `O3.java` (LaunchedEffect keyed on context)

Scans `NotesCrafterFiles/`, keeps `file.isFile() && extension == "pdf"`
(`M3.a.y`), maps each to **`H3(file, name, length, lastModified)`**, sorts
**newest first** (`u.D0(list, N3(0))`), pushes into `mutableState`.

### Layout

1. Header row: back `IconButton` + **"My Downloads"** (headlineMedium **bold**,
   onSurface) + subtitle **"All your processed PDFs are stored here"**
   (bodyMedium gray), `Spacer 24dp`
2. Empty state (`list.isEmpty()`): centered `Icons.Outlined.FolderOpen`
   **64dp** gray + **"No downloads yet"** (titleMedium) + **"Process your
   first PDF to see it here"** (bodyMedium, centered)
3. List: **LazyColumn** `spacedBy(12dp)` (`weight(1f)`), items via the merged
   worker `I3.java` (case 0 = items builder) → `W3` → `X3.a`

### DownloadedFileItem (`DownloadsScreen.kt:309`, `X3.a`)

Card (`j.a` = ripple Card) → content `M3`:

```
[Description icon 28dp]  Name (bodyMedium, medium, ellipsis 1 line)
                         "1.2 MB · MMM dd, yyyy HH:mm"  (bodySmall gray)
                         [share btn 36dp]  [rename btn]  [delete btn]
```

- Size format: `<1024` → `"N B"`, `<1048576` → `"N KB"`, else `"%.1f MB"`
- Date: `SimpleDateFormat("MMM dd, yyyy HH:mm", Locale.getDefault())`
- Cell wiring (`W3` case 0): card onClick + share go through `T3(handler, h5,
  mode)` (invokes handler with the `File`); rename through `U3(0, renameName,
  renameTarget, h5)`; delete through `n4.l` (sets `mutableState3 = file`).

### Actions — `p083t3/D.java` (injected by `L.java`)

| Case | Handler | Behavior |
|---|---|---|
| 0 | onFileClick | `ACTION_VIEW`, `type application/pdf`, FileProvider uri, `FLAG_GRANT_READ`, catch → Toast **"Error opening PDF"** |
| 1 | onFileShare | `ACTION_SEND`, `type application/pdf`, `EXTRA_STREAM` = FileProvider uri, `Intent.createChooser(..., "Share PDF")`, catch → Toast **"Error sharing PDF"** |
| 2 | onFileDelete | `file.delete()` → Toast **"File deleted"** |

### Rename dialog (`Q3` content, dismiss `I(10, state2)`)

- Title **"Rename File"** (titleLarge bold), hint **"Enter new name for the
  file"**, `OutlinedTextField` (30%-black borders, bound to `mutableState4`)
- **Cancel** (`O.f14237a`) → set `mutableState2 = null`; **OK** → `P3` case 0:
  `renameTo(parent / name[+".pdf" if missing])`, then the in-memory `H3` entry
  is replaced (file/size/date preserved) and the list state updated.

### Delete dialog (`S3` content, dismiss `I(11, state3)`)

- **"Delete File"** (titleLarge bold) + `"Are you sure you want to delete
  "<name>"? This action cannot be undone."`
- **Cancel** → dismiss; **Delete** (`O.f14240d`) → `R3`: `onFileDelete(file)`
  + remove the entry from the in-memory list + dismiss.

---

## 2. PdfSourcePickerDialog (`PrintOrderScreens.kt:759`, `Gd.h`)

The Upload screen's file picker. When open:

- `remember { }` (evaluated once) scans `NotesCrafterFiles/` for `*.pdf`,
  sorted **oldest first** (`N3(3)`)
- `AlertDialog` (dismiss = `Bb(6)` → collapse flag false)
- Row of stored PDFs; tapping one invokes the merged worker **`I3.java`
  (case 1)** → `Gd.w(openFlag, false)` closes the dialog + launches **`Fd`**

### Fd — "reprocess this file" coroutine

```
Uri → openFileDescriptor → PdfRenderer.getPageCount()
  count <= 0      → Cd (invalid PDF dialog)
  count < 20      → Dd (too few pages)
  count > 250     → Ed (too many pages)
  else            → Gd.z(uri) = display name
                   new m(id=UUID, name, pages, BW, ...)  appended to VM list
                   PrintOrderViewModel.q()/e()  (advance flow)
                   PrintOrderViewModel.f(uri)    (copy into NotesCrafterFiles)
                   PrintOrderViewModel.s(file, id) → process
```

So tapping a stored download re-enters the whole processing flow with a fresh
BW print job — the Download list is effectively a "reprocess" source too.
