package p102x3;

import B3.o;
import O3.e;
import X3.InterfaceC0200y;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import com.notescrafter.PrintOrderViewModel;
import p107y3.a;

/* JADX INFO: loaded from: classes2.dex */
public final class Gc implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0200y f14004o;
    public final /* synthetic */ PrintOrderViewModel p;
    public final /* synthetic */ State q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f14005r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f14006s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ MutableState u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ State f14007v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ double f14008w;

    public Gc(InterfaceC0200y interfaceC0200y, PrintOrderViewModel printOrderViewModel, State state, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, State state2, double d4) {
        this.f14004o = interfaceC0200y;
        this.p = printOrderViewModel;
        this.q = state;
        this.f14005r = mutableState;
        this.f14006s = mutableState2;
        this.t = mutableState3;
        this.u = mutableState4;
        this.f14007v = state2;
        this.f14008w = d4;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(702530225, iIntValue, -1, "com.notescrafter.ui.screens.PrintOrderCheckoutScreen.<anonymous>.<anonymous> (PrintOrderScreens.kt:3477)");
            }
            float f5 = 24;
            SurfaceKt.m2282SurfaceT9BRK9s(BorderKt.m220borderxT4_qwU(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m6403constructorimpl(1), Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m957RoundedCornerShapea9UjIt4$default(Dp.m6403constructorimpl(f5), Dp.m6403constructorimpl(f5), 0.0f, 0.0f, 12, null)), null, a.f15993v, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1468673932, true, new Fc(this.f14004o, this.p, this.q, this.f14005r, this.f14006s, this.t, this.u, this.f14007v, this.f14008w), composer, 54), composer, 12583296, 122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
