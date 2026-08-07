package p102x3;

import B3.o;
import O3.e;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;

/* JADX INFO: renamed from: x3.u2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2697u2 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2697u2 f15582o = new C2697u2();

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(208837453, iIntValue, -1, "com.notescrafter.ui.screens.ComposableSingletons$PrintLandingScreenKt.lambda-3.<anonymous> (PrintLandingScreen.kt:1772)");
            }
            IconKt.m1877Iconww6aTOc(CloseKt.getClose(Icons.INSTANCE.getDefault()), "Close Fullscreen", (Modifier) null, Color.Companion.m3964getWhite0d7_KjU(), composer, 3120, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
