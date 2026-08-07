package p102x3;

import B3.o;
import O3.e;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.DeleteKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;

/* JADX INFO: renamed from: x3.v3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2714v3 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2714v3 f15633o = new C2714v3();

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-414368332, iIntValue, -1, "com.notescrafter.ui.screens.ComposableSingletons$ToDoScreenKt.lambda-9.<anonymous> (ToDoScreen.kt:723)");
            }
            IconKt.m1877Iconww6aTOc(DeleteKt.getDelete(Icons.INSTANCE.getDefault()), "Delete Task", SizeKt.m713size3ABfNKs(Modifier.Companion, Dp.m6403constructorimpl(16)), Color.m3926copywmQWz5c$default(Color.Companion.m3961getRed0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), composer, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
