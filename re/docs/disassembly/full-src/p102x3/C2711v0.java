package p102x3;

import B3.o;
import O3.e;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.SkipNextKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import p107y3.a;

/* JADX INFO: renamed from: x3.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2711v0 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2711v0 f15630o = new C2711v0();

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1733043141, iIntValue, -1, "com.notescrafter.ui.screens.ComposableSingletons$PdfAddPageNumbersScreenKt.lambda-15.<anonymous> (PdfAddPageNumbersScreen.kt:1141)");
            }
            IconKt.m1877Iconww6aTOc(SkipNextKt.getSkipNext(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(Modifier.Companion, Dp.m6403constructorimpl(18)), a.f15980c, composer, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
