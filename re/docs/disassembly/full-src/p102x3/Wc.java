package p102x3;

import B3.o;
import O3.a;
import O3.e;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;

/* JADX INFO: loaded from: classes2.dex */
public final class Wc implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f14610o;
    public final /* synthetic */ a p;
    public final /* synthetic */ String q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ State f14611r;

    public Wc(boolean z3, a aVar, String str, State state) {
        this.f14610o = z3;
        this.p = aVar;
        this.q = str;
        this.f14611r = state;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1789471823, iIntValue, -1, "com.notescrafter.ui.screens.PrintOrderShippingScreen.<anonymous>.<anonymous> (PrintOrderScreens.kt:2459)");
            }
            float f5 = 24;
            SurfaceKt.m2282SurfaceT9BRK9s(BorderKt.m220borderxT4_qwU(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m6403constructorimpl(1), Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m957RoundedCornerShapea9UjIt4$default(Dp.m6403constructorimpl(f5), Dp.m6403constructorimpl(f5), 0.0f, 0.0f, 12, null)), null, p107y3.a.f15993v, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(35222988, true, new Vc(this.f14610o, this.p, this.q, this.f14611r), composer, 54), composer, 12583296, 122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
