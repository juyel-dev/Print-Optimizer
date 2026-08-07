package p102x3;

import B3.o;
import O3.e;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.CloseKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import p107y3.a;

/* JADX INFO: loaded from: classes2.dex */
public final class N1 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final N1 f14215o = new N1();

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(56637576, iIntValue, -1, "com.notescrafter.ui.screens.ComposableSingletons$PdfToJpgScreenKt.lambda-10.<anonymous> (PdfToJpgScreen.kt:820)");
            }
            IconKt.m1877Iconww6aTOc(CloseKt.getClose(Icons.Outlined.INSTANCE), "Clear", SizeKt.m713size3ABfNKs(Modifier.Companion, Dp.m6403constructorimpl(16)), a.f15990o, composer, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
