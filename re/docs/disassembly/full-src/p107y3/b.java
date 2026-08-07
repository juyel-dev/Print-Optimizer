package p107y3;

import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import kotlin.jvm.internal.o;
import p102x3.C2445e5;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ColorScheme f15997a;

    static {
        long j5 = a.f15978a;
        long j6 = a.f15990o;
        long j7 = a.f15981d;
        long j8 = a.f15980c;
        long j9 = a.e;
        long j10 = a.g;
        f15997a = ColorSchemeKt.m1645darkColorSchemeCXl9yA$default(j5, j6, j7, j6, 0L, j8, j9, j10, j6, a.f15984i, j9, 0L, 0L, j9, j6, a.f15982f, j6, j10, a.p, 0L, 0L, 0L, a.f15986k, j6, 0L, 0L, a.f15991r, a.f15992s, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -214427632, 15, null);
    }

    public static final void a(ComposableLambda content, Composer composer, int i5) {
        int i6;
        o.f(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(470200895);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changedInstance(content) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i6 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(470200895, i6, -1, "com.notescrafter.ui.theme.NotesCrafterTheme (Theme.kt:32)");
            }
            MaterialThemeKt.MaterialTheme(f15997a, null, c.f15998a, content, composerStartRestartGroup, ((i6 << 9) & 7168) | 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2445e5(content, i5, 5));
        }
    }
}
