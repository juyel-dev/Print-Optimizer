package p102x3;

import B3.o;
import O3.e;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.outlined.ArrowForwardKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import p107y3.a;

/* JADX INFO: renamed from: x3.a9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2385a9 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14792o;
    public final /* synthetic */ MutableState p;

    public C2385a9(int i5, MutableState mutableState) {
        this.f14792o = i5;
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
                ComposerKt.traceEventStart(146798658, iIntValue, -1, "com.notescrafter.ui.screens.PdfOrganizeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfOrganizeScreen.kt:1076)");
            }
            IconKt.m1877Iconww6aTOc(ArrowForwardKt.getArrowForward(Icons.AutoMirrored.Outlined.INSTANCE), "Move Right", SizeKt.m713size3ABfNKs(Modifier.Companion, Dp.m6403constructorimpl(13)), this.f14792o < ((List) this.p.getValue()).size() + (-1) ? a.f15978a : a.q, composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
