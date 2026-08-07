package p102x3;

import B3.o;
import O3.a;
import O3.e;
import X3.InterfaceC0200y;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import com.notescrafter.PrintOrderViewModel;

/* JADX INFO: loaded from: classes2.dex */
public final class Tc implements e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ String f14460A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ State f14461B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ double f14462C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ State f14463D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ State f14464E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final /* synthetic */ State f14465F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final /* synthetic */ double f14466G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final /* synthetic */ State f14467H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final /* synthetic */ double f14468I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final /* synthetic */ State f14469J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final /* synthetic */ MutableState f14470K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final /* synthetic */ State f14471L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Modifier f14472o;
    public final /* synthetic */ InterfaceC0200y p;
    public final /* synthetic */ PrintOrderViewModel q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ State f14473r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f14474s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ MutableState u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MutableState f14475v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ State f14476w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ double f14477x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ a f14478y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ String f14479z;

    public Tc(Modifier modifier, InterfaceC0200y interfaceC0200y, PrintOrderViewModel printOrderViewModel, State state, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, State state2, double d4, a aVar, String str, String str2, State state3, double d5, State state4, State state5, State state6, double d6, State state7, double d7, State state8, MutableState mutableState5, State state9) {
        this.f14472o = modifier;
        this.p = interfaceC0200y;
        this.q = printOrderViewModel;
        this.f14473r = state;
        this.f14474s = mutableState;
        this.t = mutableState2;
        this.u = mutableState3;
        this.f14475v = mutableState4;
        this.f14476w = state2;
        this.f14477x = d4;
        this.f14478y = aVar;
        this.f14479z = str;
        this.f14460A = str2;
        this.f14461B = state3;
        this.f14462C = d5;
        this.f14463D = state4;
        this.f14464E = state5;
        this.f14465F = state6;
        this.f14466G = d6;
        this.f14467H = state7;
        this.f14468I = d7;
        this.f14469J = state8;
        this.f14470K = mutableState5;
        this.f14471L = state9;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-231646100, iIntValue, -1, "com.notescrafter.ui.screens.PrintOrderCheckoutScreen.<anonymous> (PrintOrderScreens.kt:3471)");
            }
            ScaffoldKt.m2141ScaffoldTvnljyQ(WindowInsetsPadding_androidKt.imePadding(SizeKt.fillMaxSize$default(this.f14472o, 0.0f, 1, null)), null, ComposableLambdaKt.rememberComposableLambda(702530225, true, new Gc(this.p, this.q, this.f14473r, this.f14474s, this.t, this.u, this.f14475v, this.f14476w, this.f14477x), composer, 54), null, null, 0, Color.Companion.m3962getTransparent0d7_KjU(), 0L, WindowInsetsKt.m738WindowInsetsa9UjIt4$default(Dp.m6403constructorimpl(0), 0.0f, 0.0f, 0.0f, 14, null), ComposableLambdaKt.rememberComposableLambda(-1203225989, true, new Sc(this.f14478y, this.f14473r, this.q, this.f14479z, this.f14460A, this.f14461B, this.f14462C, this.f14463D, this.f14464E, this.f14465F, this.f14466G, this.f14477x, this.f14467H, this.f14468I, this.f14469J, this.f14470K, this.f14474s, this.f14471L, this.t), composer, 54), composer, 806879616, 186);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
