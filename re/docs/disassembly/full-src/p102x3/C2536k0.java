package p102x3;

import B3.o;
import O3.e;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.DeleteKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;

/* JADX INFO: renamed from: x3.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2536k0 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2536k0 f15236o = new C2536k0();

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-647563102, iIntValue, -1, "com.notescrafter.ui.screens.ComposableSingletons$JpgToPdfScreenKt.lambda-9.<anonymous> (JpgToPdfScreen.kt:809)");
            }
            IconKt.m1877Iconww6aTOc(DeleteKt.getDelete(Icons.Outlined.INSTANCE), "Remove", SizeKt.m713size3ABfNKs(Modifier.Companion, Dp.m6403constructorimpl(16)), ColorKt.Color(4293870660L), composer, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
