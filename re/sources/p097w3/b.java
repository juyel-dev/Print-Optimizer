package p097w3;

import B3.o;
import O3.e;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import p107y3.a;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f13611o;
    public final /* synthetic */ r p;
    public final /* synthetic */ boolean q;

    public b(boolean z3, r rVar, boolean z4) {
        this.f13611o = z3;
        this.p = rVar;
        this.q = z4;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1503080881, iIntValue, -1, "com.notescrafter.ui.components.BottomNavBar.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BottomNavBar.kt:109)");
            }
            float fM6403constructorimpl = Dp.m6403constructorimpl(this.f13611o ? 32 : 24);
            r rVar = this.p;
            IconKt.m1877Iconww6aTOc(rVar.f13633b, rVar.f13632a, SizeKt.m713size3ABfNKs(Modifier.Companion, fM6403constructorimpl), this.q ? a.f15978a : a.q, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
