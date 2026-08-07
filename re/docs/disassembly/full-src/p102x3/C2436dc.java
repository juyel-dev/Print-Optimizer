package p102x3;

import N0.C0135c;
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
import java.util.List;
import kotlin.jvm.internal.o;
import p035i0.b;

/* JADX INFO: renamed from: x3.dc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2436dc implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ State f14934o;
    public final /* synthetic */ State p;
    public final /* synthetic */ State q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ State f14935r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f14936s;
    public final /* synthetic */ List t;
    public final /* synthetic */ List u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ State f14937v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ State f14938w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ PrintOrderViewModel f14939x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ MutableState f14940y;

    public C2436dc(a aVar, MutableState mutableState, State state, State state2, State state3, State state4, State state5, State state6, PrintOrderViewModel printOrderViewModel, List list, List list2) {
        this.f14934o = state;
        this.p = state2;
        this.q = state3;
        this.f14935r = state4;
        this.f14936s = aVar;
        this.t = list;
        this.u = list2;
        this.f14937v = state5;
        this.f14938w = state6;
        this.f14939x = printOrderViewModel;
        this.f14940y = mutableState;
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
                ComposerKt.traceEventStart(-17108259, iIntValue, -1, "com.notescrafter.ui.screens.PrintMyOrdersScreen.<anonymous> (PrintMyOrdersScreen.kt:164)");
            }
            Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), paddingValues), Dp.m6403constructorimpl(20), 0.0f, 2, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_4 = Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(16));
            composer.startReplaceGroup(1238832118);
            boolean zChanged = composer.changed(this.f14934o) | composer.changed(this.p) | composer.changed(this.q);
            final State state = this.f14935r;
            boolean zChanged2 = zChanged | composer.changed(state) | composer.changed(this.f14936s) | composer.changedInstance(this.t) | composer.changedInstance(this.u) | composer.changed(this.f14937v) | composer.changed(this.f14938w) | composer.changedInstance(this.f14939x);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged2 || objRememberedValue == Composer.Companion.getEmpty()) {
                final MutableState mutableState = this.f14940y;
                final PrintOrderViewModel printOrderViewModel = this.f14939x;
                final List list = this.t;
                final List list2 = this.u;
                final State state2 = this.f14934o;
                final State state3 = this.p;
                final State state4 = this.q;
                final a aVar = this.f14936s;
                final State state5 = this.f14937v;
                final State state6 = this.f14938w;
                objRememberedValue = new c() { // from class: x3.Wb
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // O3.c
                    public final Object invoke(Object obj4) {
                        LazyListScope LazyColumn = (LazyListScope) obj4;
                        o.f(LazyColumn, "$this$LazyColumn");
                        State state7 = state3;
                        State state8 = state2;
                        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1622916407, true, new Yb(state8, state7)), 3, null);
                        List list3 = AbstractC2452ec.f14975a;
                        if (((Boolean) state4.getValue()).booleanValue()) {
                            LazyListScope.item$default(LazyColumn, null, null, AbstractC2777z2.f15796a, 3, null);
                        } else {
                            boolean zIsEmpty = ((List) state.getValue()).isEmpty();
                            a aVar2 = aVar;
                            if (zIsEmpty) {
                                LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1299669061, true, new Zb(aVar2, state8)), 3, null);
                            } else {
                                List list4 = list;
                                List list5 = list2;
                                MutableState mutableState2 = mutableState;
                                LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(435243173, true, new C2388ac(list4, list5, mutableState2)), 3, null);
                                List list6 = o.b((String) mutableState2.getValue(), "confirmed") ? list4 : list5;
                                if (list6.isEmpty()) {
                                    LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1459250090, true, new C2404bc(aVar2, mutableState2, state8)), 3, null);
                                } else {
                                    LazyColumn.items(list6.size(), new b(3, new C0135c(13), list6), new V3(list6, 8), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new C2417c9(list6, printOrderViewModel, state5, state6, 1)));
                                    LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1486402177, true, new C2420cc(aVar2, state8)), 3, null);
                                }
                            }
                        }
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
