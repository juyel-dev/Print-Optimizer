package p102x3;

import B3.o;
import O3.e;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.PlayArrowKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import p107y3.a;

/* JADX INFO: renamed from: x3.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2695u0 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2695u0 f15580o = new C2695u0();

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1168990746, iIntValue, -1, "com.notescrafter.ui.screens.ComposableSingletons$PdfAddPageNumbersScreenKt.lambda-13.<anonymous> (PdfAddPageNumbersScreen.kt:1122)");
            }
            IconKt.m1877Iconww6aTOc(PlayArrowKt.getPlayArrow(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(Modifier.Companion, Dp.m6403constructorimpl(18)), a.f15980c, composer, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
