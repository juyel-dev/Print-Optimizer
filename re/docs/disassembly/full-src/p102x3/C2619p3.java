package p102x3;

import B3.o;
import O3.e;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.SettingsKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;

/* JADX INFO: renamed from: x3.p3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2619p3 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2619p3 f15395o = new C2619p3();

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-531739839, iIntValue, -1, "com.notescrafter.ui.screens.ComposableSingletons$ToDoScreenKt.lambda-2.<anonymous> (ToDoScreen.kt:164)");
            }
            IconKt.m1877Iconww6aTOc(SettingsKt.getSettings(Icons.INSTANCE.getDefault()), "Manage Exams", (Modifier) null, Color.Companion.m3957getGray0d7_KjU(), composer, 3120, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
