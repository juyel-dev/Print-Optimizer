package p102x3;

import O3.a;
import O3.c;
import O3.f;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.notescrafter.PrintOrderViewModel;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: x3.kd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2549kd implements f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ State f15254A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ State f15255B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ double f15256C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ MutableState f15257D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ MutableState f15258E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final /* synthetic */ MutableState f15259F;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a f15260o;
    public final /* synthetic */ State p;
    public final /* synthetic */ a q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ State f15261r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PrintOrderViewModel f15262s;
    public final /* synthetic */ State t;
    public final /* synthetic */ State u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ State f15263v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f15264w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ State f15265x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f15266y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ double f15267z;

    public C2549kd(double d4, double d5, a aVar, a aVar2, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, State state, State state2, State state3, State state4, State state5, State state6, State state7, State state8, PrintOrderViewModel printOrderViewModel, String str, String str2) {
        this.f15260o = aVar;
        this.p = state;
        this.q = aVar2;
        this.f15261r = state2;
        this.f15262s = printOrderViewModel;
        this.t = state3;
        this.u = state4;
        this.f15263v = state5;
        this.f15264w = str;
        this.f15265x = state6;
        this.f15266y = str2;
        this.f15267z = d4;
        this.f15254A = state7;
        this.f15255B = state8;
        this.f15256C = d5;
        this.f15257D = mutableState;
        this.f15258E = mutableState2;
        this.f15259F = mutableState3;
    }

    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PaddingValues paddingValues = (PaddingValues) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(paddingValues, "paddingValues");
        if ((iIntValue & 6) == 0) {
            iIntValue |= composer.changed(paddingValues) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(729841915, iIntValue, -1, "com.notescrafter.ui.screens.PrintOrderShippingScreen.<anonymous>.<anonymous> (PrintOrderScreens.kt:2523)");
            }
            float f5 = 20;
            Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), paddingValues), Dp.m6403constructorimpl(f5), 0.0f, 2, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_4 = Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(f5));
            composer.startReplaceGroup(881840083);
            boolean zChanged = composer.changed(this.f15260o);
            final State state = this.p;
            boolean zChanged2 = zChanged | composer.changed(state) | composer.changed(this.q) | composer.changed(this.f15261r) | composer.changedInstance(this.f15262s) | composer.changed(this.t) | composer.changed(this.u) | composer.changed(this.f15263v) | composer.changed(this.f15264w) | composer.changed(this.f15265x) | composer.changed(this.f15266y) | composer.changed(this.f15267z) | composer.changed(this.f15254A) | composer.changed(this.f15255B) | composer.changed(this.f15256C);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged2 || objRememberedValue == Composer.Companion.getEmpty()) {
                final double d4 = this.f15267z;
                final State state2 = this.f15254A;
                final a aVar = this.f15260o;
                final a aVar2 = this.q;
                final PrintOrderViewModel printOrderViewModel = this.f15262s;
                final State state3 = this.f15261r;
                final State state4 = this.t;
                final State state5 = this.u;
                final State state6 = this.f15263v;
                final String str = this.f15264w;
                final MutableState mutableState = this.f15257D;
                final MutableState mutableState2 = this.f15258E;
                final MutableState mutableState3 = this.f15259F;
                final State state7 = this.f15265x;
                final String str2 = this.f15266y;
                final State state8 = this.f15255B;
                final double d5 = this.f15256C;
                objRememberedValue = new c() { // from class: x3.Xc
                    @Override // O3.c
                    public final Object invoke(Object obj4) {
                        LazyListScope LazyColumn = (LazyListScope) obj4;
                        o.f(LazyColumn, "$this$LazyColumn");
                        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(834563303, true, new Yc(aVar)), 3, null);
                        State state9 = state;
                        State state10 = state5;
                        State state11 = state6;
                        a aVar3 = aVar2;
                        PrintOrderViewModel printOrderViewModel2 = printOrderViewModel;
                        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1139632240, true, new C2437dd(state9, aVar3, printOrderViewModel2, state3, state4, state10, state11)), 3, null);
                        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1822535855, true, new C2501hd(str, mutableState, mutableState2, state9, mutableState3)), 3, null);
                        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(489736654, true, new C2533jd(state7, printOrderViewModel2, str2, d4, state9, state2, state8, d5)), 3, null);
                        LazyListScope.item$default(LazyColumn, null, null, X2.p, 3, null);
                        return B3.o.f154a;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierM670paddingVpY3zN4$default, null, null, false, horizontalOrVerticalM548spacedBy0680j_4, null, null, false, (c) objRememberedValue, composer, 24576, 238);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
