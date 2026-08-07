package p102x3;

import B3.o;
import O3.e;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.ArrowDownwardKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import p107y3.a;

/* JADX INFO: loaded from: classes2.dex */
public final class V5 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14511o;
    public final /* synthetic */ MutableState p;

    public V5(int i5, MutableState mutableState) {
        this.f14511o = i5;
        this.p = mutableState;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(187843361, iIntValue, -1, "com.notescrafter.ui.screens.JpgToPdfScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (JpgToPdfScreen.kt:798)");
            }
            IconKt.m1877Iconww6aTOc(ArrowDownwardKt.getArrowDownward(Icons.Outlined.INSTANCE), "Down", SizeKt.m713size3ABfNKs(Modifier.Companion, Dp.m6403constructorimpl(16)), this.f14511o < ((List) this.p.getValue()).size() + (-1) ? a.f15978a : a.q, composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
