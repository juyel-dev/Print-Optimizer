package p102x3;

import C3.v;
import O3.f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import com.notescrafter.PrintOrderViewModel;
import kotlin.jvm.internal.o;
import p076s.b;
import p097w3.j;
import p107y3.a;

/* JADX INFO: renamed from: x3.jd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2533jd implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ State f15231o;
    public final /* synthetic */ PrintOrderViewModel p;
    public final /* synthetic */ String q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ double f15232r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ State f15233s;
    public final /* synthetic */ State t;
    public final /* synthetic */ State u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ double f15234v;

    public C2533jd(State state, PrintOrderViewModel printOrderViewModel, String str, double d4, State state2, State state3, State state4, double d5) {
        this.f15231o = state;
        this.p = printOrderViewModel;
        this.q = str;
        this.f15232r = d4;
        this.f15233s = state2;
        this.t = state3;
        this.u = state4;
        this.f15234v = d5;
    }

    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LazyItemScope item = (LazyItemScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(item, "$this$item");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(489736654, iIntValue, -1, "com.notescrafter.ui.screens.PrintOrderShippingScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:3027)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM699height3ABfNKs = SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(2));
            Brush.Companion companion2 = Brush.Companion;
            Color.Companion companion3 = Color.Companion;
            BoxKt.Box(BackgroundKt.background$default(modifierM699height3ABfNKs, Brush.Companion.m3876horizontalGradient8A3gB4$default(companion2, v.S(Color.m3917boximpl(companion3.m3962getTransparent0d7_KjU()), Color.m3917boximpl(Color.m3926copywmQWz5c$default(a.f15979b, 0.5f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3917boximpl(companion3.m3962getTransparent0d7_KjU())), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composer, 6);
            b.m(0, companion, composer, 6);
            j.a(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-615190135, true, new C2517id(this.f15231o, this.p, this.q, this.f15232r, this.f15233s, this.t, this.u, this.f15234v), composer, 54), composer, 196614, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
