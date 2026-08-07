package p102x3;

import B3.o;
import O3.e;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.ArrowUpwardKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import p107y3.a;

/* JADX INFO: loaded from: classes2.dex */
public final class U5 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14491o;

    public U5(int i5) {
        this.f14491o = i5;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-540936086, iIntValue, -1, "com.notescrafter.ui.screens.JpgToPdfScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (JpgToPdfScreen.kt:786)");
            }
            IconKt.m1877Iconww6aTOc(ArrowUpwardKt.getArrowUpward(Icons.Outlined.INSTANCE), "Up", SizeKt.m713size3ABfNKs(Modifier.Companion, Dp.m6403constructorimpl(16)), this.f14491o > 0 ? a.f15978a : a.q, composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
