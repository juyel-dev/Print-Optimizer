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
import java.util.List;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: x3.yd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2772yd implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a f15787o;
    public final /* synthetic */ State p;
    public final /* synthetic */ State q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f15788r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f15789s;
    public final /* synthetic */ PrintOrderViewModel t;
    public final /* synthetic */ String u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MutableState f15790v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MutableState f15791w;

    public C2772yd(int i5, a aVar, MutableState mutableState, MutableState mutableState2, State state, State state2, PrintOrderViewModel printOrderViewModel, String str, boolean z3) {
        this.f15787o = aVar;
        this.p = state;
        this.q = state2;
        this.f15788r = z3;
        this.f15789s = i5;
        this.t = printOrderViewModel;
        this.u = str;
        this.f15790v = mutableState;
        this.f15791w = mutableState2;
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
                ComposerKt.traceEventStart(-281563908, iIntValue, -1, "com.notescrafter.ui.screens.PrintOrderUploadScreen.<anonymous>.<anonymous> (PrintOrderScreens.kt:461)");
            }
            float f5 = 20;
            Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), paddingValues), Dp.m6403constructorimpl(f5), 0.0f, 2, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_4 = Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(f5));
            composer.startReplaceGroup(-466228571);
            boolean zChanged = composer.changed(this.f15787o);
            final State state = this.p;
            boolean zChanged2 = zChanged | composer.changed(state) | composer.changed(this.q) | composer.changed(this.f15788r) | composer.changed(this.f15789s) | composer.changedInstance(this.t) | composer.changed(this.u);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged2 || objRememberedValue == Composer.Companion.getEmpty()) {
                final MutableState mutableState = this.f15790v;
                final MutableState mutableState2 = this.f15791w;
                final boolean z3 = this.f15788r;
                final a aVar = this.f15787o;
                final State state2 = this.q;
                final int i5 = this.f15789s;
                final PrintOrderViewModel printOrderViewModel = this.t;
                final String str = this.u;
                objRememberedValue = new c() { // from class: x3.rd
                    @Override // O3.c
                    public final Object invoke(Object obj4) {
                        LazyListScope LazyColumn = (LazyListScope) obj4;
                        o.f(LazyColumn, "$this$LazyColumn");
                        State state3 = state;
                        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(426187496, true, new C2676sd(aVar, state3)), 3, null);
                        State state4 = state2;
                        if (((String) state4.getValue()) != null) {
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(850035565, true, new C2692td(state4)), 3, null);
                        }
                        if (z3) {
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1912247894, true, new C2708ud(i5)), 3, null);
                        }
                        boolean zIsEmpty = ((List) state3.getValue()).isEmpty();
                        MutableState mutableState3 = mutableState;
                        MutableState mutableState4 = mutableState2;
                        if (zIsEmpty) {
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1082598901, true, new C2724vd(mutableState3, mutableState4)), 3, null);
                        }
                        List list = (List) state3.getValue();
                        LazyColumn.items(list.size(), null, new V3(list, 10), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new C2756xd(list, printOrderViewModel, str, mutableState3, mutableState4)));
                        if (!((List) state3.getValue()).isEmpty()) {
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(252949908, true, new C2740wd(mutableState3, mutableState4)), 3, null);
                        }
                        LazyListScope.item$default(LazyColumn, null, null, X2.f14627c, 3, null);
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
