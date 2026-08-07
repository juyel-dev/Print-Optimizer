package p102x3;

import B3.o;
import O3.e;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import p076s.b;

/* JADX INFO: loaded from: classes2.dex */
public final class M2 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final M2 f14187o = new M2();

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1906956291, iIntValue, -1, "com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-22.<anonymous> (PrintOrderScreens.kt:4454)");
            }
            BoxKt.Box(BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.m699height3ABfNKs(SizeKt.m718width3ABfNKs(PaddingKt.m670paddingVpY3zN4$default(Modifier.Companion, 0.0f, Dp.m6403constructorimpl(12), 1, null), Dp.m6403constructorimpl(40)), Dp.m6403constructorimpl(4)), 2), Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
