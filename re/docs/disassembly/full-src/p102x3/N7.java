package p102x3;

import B3.o;
import O3.e;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.ChevronRightKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import p107y3.a;

/* JADX INFO: loaded from: classes2.dex */
public final class N7 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MutableState f14223o;
    public final /* synthetic */ MutableState p;

    public N7(MutableState mutableState, MutableState mutableState2) {
        this.f14223o = mutableState;
        this.p = mutableState2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1336166607, iIntValue, -1, "com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfCropScreen.kt:956)");
            }
            IconKt.m1877Iconww6aTOc(ChevronRightKt.getChevronRight(Icons.Outlined.INSTANCE), "Next Page", SizeKt.m713size3ABfNKs(Modifier.Companion, Dp.m6403constructorimpl(16)), ((Number) this.f14223o.getValue()).intValue() < AbstractC2416c8.b(this.p) ? a.f15990o : a.q, composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
