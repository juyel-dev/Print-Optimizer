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
import java.util.List;

/* JADX INFO: renamed from: x3.qd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2645qd implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ State f15452o;
    public final /* synthetic */ int p;
    public final /* synthetic */ boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ double f15453r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f15454s;
    public final /* synthetic */ int t;
    public final /* synthetic */ boolean u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f15455v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a f15456w;

    public C2645qd(double d4, int i5, int i6, a aVar, State state, String str, boolean z3, boolean z4, boolean z5) {
        this.f15452o = state;
        this.p = i5;
        this.q = z3;
        this.f15453r = d4;
        this.f15454s = str;
        this.t = i6;
        this.u = z4;
        this.f15455v = z5;
        this.f15456w = aVar;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(597418162, iIntValue, -1, "com.notescrafter.ui.screens.PrintOrderUploadScreen.<anonymous>.<anonymous> (PrintOrderScreens.kt:161)");
            }
            State state = this.f15452o;
            if (!((List) state.getValue()).isEmpty()) {
                long j5 = p107y3.a.f15993v;
                float f5 = 24;
                Modifier modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m6403constructorimpl(1), Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m957RoundedCornerShapea9UjIt4$default(Dp.m6403constructorimpl(f5), Dp.m6403constructorimpl(f5), 0.0f, 0.0f, 12, null));
                boolean z3 = this.f15455v;
                a aVar = this.f15456w;
                SurfaceKt.m2282SurfaceT9BRK9s(modifierM220borderxT4_qwU, null, j5, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1998732776, true, new C2629pd(this.f15453r, this.p, this.t, aVar, state, this.f15454s, this.q, this.u, z3), composer, 54), composer, 12583296, 122);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
