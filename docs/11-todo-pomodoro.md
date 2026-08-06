# 11 — To-Do, Exams & Pomodoro (dashboard tab deep-dive)

> App: **com.notescrafter.app** v4.0.8 · Compose · Routes: `dashboard` (To-Do tab),
> `pomodoro-setup`, `pomodoro-timer`
> Source: `p102x3/Ye.java` (ToDoScreen.kt), `p102x3/Ja.java` (PomodoroTimerScreen.kt),
> `p102x3/AbstractC2642qa.java` (PomodoroSetupScreen.kt), `com.notescrafter.utils/*`

The **To-Do** destination of the bottom nav is a full productivity surface:
tasks, exam countdowns, an analog clock, a calendar widget, and a Pomodoro
timer with a setup wizard.

---

## 1. Storage — `ToDoManager` (`com/notescrafter/utils/ToDoManager.java`)

No Room (the bundled Room library is unused). Everything lives in
**SharedPreferences** `notescrafter_todo_prefs` as Gson JSON arrays:

| Key | Type | Contents |
|---|---|---|
| `tasks_list` | `ToDoItem[]` | task list |
| `exams_list` | `ExamItem[]` | exam list |

- `getTasks()` / `getExams()` — `fromJson`, entries with `text`/`name == null`
  are dropped; empty list on parse error
- `saveTasks()` / `saveExams()` — `toJson` → `putString().apply()`

### Models
- **`ToDoItem`** `(id: Long = System.currentTimeMillis(), text: String, isDone: Boolean = false)` — mutable `isDone`
- **`ExamItem`** `(id: Long = System.currentTimeMillis(), name: String, dateMillis: Long)` — immutable

---

## 2. ToDoScreen (`ToDoScreen.kt:69` root, `p102x3/Ye.f`)

State: `ToDoManager(context)` + `tasks`, `exams` (loaded once), task input
text, `showDatePicker` flag.

Layout: `Box(16dp padding)` → **`LazyColumn`** (`spacedBy(20dp)`,
`verticalPadding(top 32 / bottom 100)`):

1. **AnalogClock** (`ToDoScreen.kt:841`, `Ye.a`) — canvas-drawn clock, white
2. **CalendarWidget** (`ToDoScreen.kt:735`, `Ye.b`) — month grid (today
   highlighted, current-month days colored), rendered in a "glass card";
   fontScale clamped to **1.1**
3. **Add-task row** — OutlinedTextField + add button (`Qe` worker, teal
   accent `0xFF00A3C8`-family color 4283215696)
4. **Exams section**:
   - empty → placeholder item (`Re`)
   - else **ManageExamsContent** (`ToDoScreen.kt:376`, `Ye.d`):
     - "Track Your Exam" header (white bold titleLarge)
     - "Add New Exam" (gray 12sp) → OutlinedTextField (name)
     - Button "Pick date" → **native `DatePickerDialog`** (midnight-normalized
       `dateMillis`)
     - Button "Add Exam" (teal 4283215696)
     - divider, "Your Exams", then exam rows (scrollable column):
       `NAME` bold white ellipsized + `MMM dd` gray 12sp + delete IconButton
     - **ExamCardItem** (`ToDoScreen.kt:489`, `Ye.c`): days-until-exam
       computed on midnight-normalized dates; `days <= 0` → urgent with
       **pulsing alpha** (infinite repeatable 0.04→0.12, 1500 ms tween,
       Reverse); fontScale clamped 1.15
5. **Tasks section** (`We` header) + task rows, sorted with `u.D0(list, N3(5))`
   (done → bottom)
6. **TaskItemMinimal** (`ToDoScreen.kt:629`, `Ye.e`):
   - `animateColorAsState` checkbox fill (accent when done, transparent else)
   - `animateFloatAsState`: text alpha 1.0/0.0, delete-icon **-45° rotation**
     when done (tween 300 ms FastOutSlowIn), checkbox scale
   - row alpha 0.04 idle / 0.01 done; padding 4dp
   - tap → toggle, delete icon → remove
7. Date-picker dialog opens inline (`mutableState5`), wrapped in a Surface
   with an "Add" button (`C2579mb`, ToDoScreen.kt:359)

---

## 3. Pomodoro setup (`PomodoroSetupScreen.kt`, `AbstractC2642qa`)

- **PomodoroStepItem** (`PomodoroSetupScreen.kt:670`) — numbered step card
  (title + icon + subtitle + value) via shared `j.a` glass-card helper
- **SettingRow** (`PomodoroSetupScreen.kt:542`) — labeled steppers
- **4 preset accent colors** (constants):
  - `0xFF00B24A` (green), `0xFF4D9FEA`-ish (blue), `0xFFE03E3A` (red),
    `0xFF43832D` (dark green) — chosen before starting
- Start → worker `p083t3/K` sets the 4 session-local values (work / short
  break / long break minutes + accent color) and navigates to
  `pomodoro-timer`
- **Not persisted** — durations live in hoisted composition state in the nav
  dispatcher (`L.java`), passed to the timer; leaving the screen loses them

---

## 4. Pomodoro timer (`PomodoroTimerScreen.kt:65` root, `p102x3/Ja.java`)

### Screen behavior
- `DisposableEffect`: forces **landscape** (`setRequestedOrientation(6)`) and
  re-tints status + navigation bars to `accent × 0.12/0.12/0.15`; restored on
  dispose (`Ha`)
- Mode enum **`EnumC2386aa`**: `FOCUS(0)`, `SHORT_BREAK(1)`, `LONG_BREAK(2)`
  with labels "Focus Session" / "Short Break" / "Long Break"
- Durations: `mode.ordinal → minutes × 60` seconds (0→work, 1→short, 2→long)
- Countdown: `LaunchedEffect(mode, remaining, isRunning)` →
  `C2769ya` decrements `remaining` each second while running
- Display: `String.format("%02d:%02d", remaining/60, remaining%60)`
- Progress ring: `Canvas.drawArc(-90° … 360°)` track + progress arc
  `progress = 1 − remaining/total` (Stroke)
- Accent red (`0xFFE03E3A`) → dark mode text `0xFF2A1515`-ish; else white;
  secondary text white 65%

### Controls
- **ControlButton** (`PomodoroTimerScreen.kt:602`) — circular icon+label
  buttons (imports material-icons **Pause**/Play, Reset, etc.)
- **playPauseScale**: `animateFloatAsState(isRunning ? 1.08 : 1.0, spring(0.5, 200))`
  — the play/pause button swells while running
- **"Clear All"** TextButton (11sp, `PomodoroTimerScreen.kt:430`) — clears the
  task list
- **Integrated task picker**: loads `ToDoManager` + tasks; pick a task to
  associate with the focus session (`TimerTaskItem`) — timer and task list on
  one screen

### Transitions
- `pomodoro-setup` → (K worker) → `pomodoro-timer`
- Back via `C2315v(5, …)` (back-dispatch, pomodoro-setup case)
- Analytics: routes map to `Pomodoro_Setup_Screen` / `Pomodoro_Timer_Screen`
  (doc 10)

---

## 5. Bottom line

- Fully **local** productivity suite — only SharedPreferences (Gson JSON), no
  network, no Room, no WorkManager jobs
- Setup values are **ephemeral** (composition state), tasks/exams persist
- Timer is intentionally immersive: landscape + recolored system bars
- The To-Do tab (`dashboard`) is otherwise the only bottom-nav destination
  without an API dependency (unlike My Orders / Contact / Home)
