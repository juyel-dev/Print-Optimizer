package p102x3;

import C3.v;
import O3.f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import com.notescrafter.PrintOrderViewModel;
import kotlin.jvm.internal.o;
import p097w3.j;
import p107y3.a;

/* JADX INFO: loaded from: classes2.dex */
public final class Rc implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PrintOrderViewModel f14382o;
    public final /* synthetic */ double p;
    public final /* synthetic */ State q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ State f14383r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ State f14384s;
    public final /* synthetic */ double t;
    public final /* synthetic */ double u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ double f14385v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MutableState f14386w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ State f14387x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ State f14388y;

    public Rc(PrintOrderViewModel printOrderViewModel, double d4, State state, State state2, State state3, double d5, double d6, double d7, MutableState mutableState, State state4, State state5) {
        this.f14382o = printOrderViewModel;
        this.p = d4;
        this.q = state;
        this.f14383r = state2;
        this.f14384s = state3;
        this.t = d5;
        this.u = d6;
        this.f14385v = d7;
        this.f14386w = mutableState;
        this.f14387x = state4;
        this.f14388y = state5;
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
                ComposerKt.traceEventStart(875564393, iIntValue, -1, "com.notescrafter.ui.screens.PrintOrderCheckoutScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:3904)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f5 = 20;
            Modifier modifierClip = ClipKt.clip(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), RoundedCornerShapeKt.m957RoundedCornerShapea9UjIt4$default(Dp.m6403constructorimpl(f5), Dp.m6403constructorimpl(f5), 0.0f, 0.0f, 12, null));
            Brush.Companion companion2 = Brush.Companion;
            Color.Companion companion3 = Color.Companion;
            BoxKt.Box(SizeKt.m699height3ABfNKs(BackgroundKt.background$default(modifierClip, Brush.Companion.m3876horizontalGradient8A3gB4$default(companion2, v.S(Color.m3917boximpl(companion3.m3962getTransparent0d7_KjU()), Color.m3917boximpl(Color.m3926copywmQWz5c$default(a.f15979b, 0.3f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3917boximpl(companion3.m3962getTransparent0d7_KjU())), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), Dp.m6403constructorimpl(1)), composer, 0);
            j.a(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1117534044, true, new Qc(this.f14382o, this.p, this.q, this.f14383r, this.f14384s, this.t, this.u, this.f14385v, this.f14386w, this.f14387x, this.f14388y), composer, 54), composer, 196614, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
