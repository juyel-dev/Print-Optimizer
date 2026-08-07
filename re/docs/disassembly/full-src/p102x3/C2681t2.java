package p102x3;

import B3.o;
import O3.e;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;

/* JADX INFO: renamed from: x3.t2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2681t2 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2681t2 f15543o = new C2681t2();

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(211147696, iIntValue, -1, "com.notescrafter.ui.screens.ComposableSingletons$PrintLandingScreenKt.lambda-2.<anonymous> (PrintLandingScreen.kt:489)");
            }
            IconKt.m1877Iconww6aTOc(CloseKt.getClose(Icons.Filled.INSTANCE), "Close Dialog", SizeKt.m713size3ABfNKs(Modifier.Companion, Dp.m6403constructorimpl(14)), Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), composer, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
