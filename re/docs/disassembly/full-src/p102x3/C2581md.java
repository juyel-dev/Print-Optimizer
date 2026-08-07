package p102x3;

import O3.a;
import O3.c;
import O3.e;
import Y3.d;
import android.content.Context;
import android.util.Log;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import com.notescrafter.PrintOrderViewModel;
import java.util.List;
import kotlin.jvm.internal.o;
import p076s.b;
import p083t3.C2306q;
import p087u3.q;
import p087u3.v;

/* JADX INFO: renamed from: x3.md, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2581md implements e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ State f15321A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ State f15322B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ String f15323C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ double f15324D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ State f15325E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final /* synthetic */ State f15326F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final /* synthetic */ double f15327G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final /* synthetic */ MutableState f15328H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final /* synthetic */ MutableState f15329I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final /* synthetic */ MutableState f15330J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final /* synthetic */ State f15331K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final /* synthetic */ MutableState f15332L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Modifier f15333o;
    public final /* synthetic */ PrintOrderViewModel p;
    public final /* synthetic */ State q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Context f15334r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f15335s;
    public final /* synthetic */ a t;
    public final /* synthetic */ String u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a f15336v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a f15337w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ State f15338x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ State f15339y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ State f15340z;

    public C2581md(Modifier modifier, PrintOrderViewModel printOrderViewModel, State state, Context context, boolean z3, a aVar, String str, a aVar2, a aVar3, State state2, State state3, State state4, State state5, State state6, String str2, double d4, State state7, State state8, double d5, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, State state9, MutableState mutableState4) {
        this.f15333o = modifier;
        this.p = printOrderViewModel;
        this.q = state;
        this.f15334r = context;
        this.f15335s = z3;
        this.t = aVar;
        this.u = str;
        this.f15336v = aVar2;
        this.f15337w = aVar3;
        this.f15338x = state2;
        this.f15339y = state3;
        this.f15340z = state4;
        this.f15321A = state5;
        this.f15322B = state6;
        this.f15323C = str2;
        this.f15324D = d4;
        this.f15325E = state7;
        this.f15326F = state8;
        this.f15327G = d5;
        this.f15328H = mutableState;
        this.f15329I = mutableState2;
        this.f15330J = mutableState3;
        this.f15331K = state9;
        this.f15332L = mutableState4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1884755284, iIntValue, -1, "com.notescrafter.ui.screens.PrintOrderShippingScreen.<anonymous> (PrintOrderScreens.kt:2454)");
            }
            Modifier modifierImePadding = WindowInsetsPadding_androidKt.imePadding(SizeKt.fillMaxSize$default(this.f15333o, 0.0f, 1, null));
            long jM3962getTransparent0d7_KjU = Color.Companion.m3962getTransparent0d7_KjU();
            WindowInsets windowInsetsM738WindowInsetsa9UjIt4$default = WindowInsetsKt.m738WindowInsetsa9UjIt4$default(Dp.m6403constructorimpl(0), 0.0f, 0.0f, 0.0f, 14, null);
            State state = this.q;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1789471823, true, new Wc(this.f15335s, this.t, this.u, state), composer, 54);
            MutableState mutableState = this.f15329I;
            MutableState mutableState2 = this.f15330J;
            a aVar = this.f15336v;
            a aVar2 = this.f15337w;
            State state2 = this.f15338x;
            PrintOrderViewModel printOrderViewModel = this.p;
            State state3 = this.f15339y;
            State state4 = this.f15340z;
            State state5 = this.f15321A;
            String str = this.u;
            ScaffoldKt.m2141ScaffoldTvnljyQ(modifierImePadding, null, composableLambdaRememberComposableLambda, null, null, 0, jM3962getTransparent0d7_KjU, 0L, windowInsetsM738WindowInsetsa9UjIt4$default, ComposableLambdaKt.rememberComposableLambda(729841915, true, new C2549kd(this.f15324D, this.f15327G, aVar, aVar2, this.f15328H, mutableState, mutableState2, state, state2, state3, state4, state5, this.f15322B, this.f15325E, this.f15326F, printOrderViewModel, str, this.f15323C), composer, 54), composer, 806879616, 186);
            final MutableState mutableState3 = this.f15329I;
            if (((Boolean) mutableState3.getValue()).booleanValue()) {
                MutableState mutableState4 = this.f15328H;
                String str2 = (String) mutableState4.getValue();
                List list = (List) this.f15331K.getValue();
                q qVar = (q) state.getValue();
                final MutableState mutableState5 = this.f15330J;
                q qVar2 = (q) mutableState5.getValue();
                boolean zBooleanValue = ((Boolean) this.f15332L.getValue()).booleanValue();
                composer.startReplaceGroup(1501306498);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.Companion;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Bb(5, mutableState3);
                    composer.updateRememberedValue(objRememberedValue);
                }
                a aVar3 = (a) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(1501308505);
                final PrintOrderViewModel printOrderViewModel2 = this.p;
                boolean zChangedInstance = composer.changedInstance(printOrderViewModel2);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    final int i5 = 0;
                    objRememberedValue2 = new c() { // from class: x3.Uc
                        @Override // O3.c
                        public final Object invoke(Object obj3) {
                            switch (i5) {
                                case 0:
                                    v addr = (v) obj3;
                                    o.f(addr, "addr");
                                    printOrderViewModel2.n(addr);
                                    Gd.v(mutableState3, false);
                                    break;
                                default:
                                    String pin = (String) obj3;
                                    o.f(pin, "pin");
                                    C2622p6 c2622p6 = new C2622p6(mutableState3, 1);
                                    PrintOrderViewModel printOrderViewModel3 = printOrderViewModel2;
                                    printOrderViewModel3.getClass();
                                    Log.d("PrintOrderViewModel", "lookupPincodeForTemp called with ".concat(pin));
                                    printOrderViewModel3.f10891c.g(pin, new d(3, printOrderViewModel3, c2622p6));
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                c cVar = (c) objRememberedValue2;
                composer.endReplaceGroup();
                composer.startReplaceGroup(1501313120);
                boolean zChanged = composer.changed(state);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new C2306q(mutableState4, state, mutableState5, 10);
                    composer.updateRememberedValue(objRememberedValue3);
                }
                a aVar4 = (a) objRememberedValue3;
                Object objK = b.k(composer, 1501318107);
                if (objK == companion.getEmpty()) {
                    objK = new C2435db(5, mutableState5);
                    composer.updateRememberedValue(objK);
                }
                c cVar2 = (c) objK;
                composer.endReplaceGroup();
                composer.startReplaceGroup(1501321478);
                boolean zChangedInstance2 = composer.changedInstance(printOrderViewModel2) | composer.changedInstance(this.f15334r);
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Za(this.p, this.f15332L, this.f15330J, this.f15334r, this.f15329I, 1);
                    composer.updateRememberedValue(objRememberedValue4);
                }
                a aVar5 = (a) objRememberedValue4;
                composer.endReplaceGroup();
                composer.startReplaceGroup(1501374318);
                boolean zChangedInstance3 = composer.changedInstance(printOrderViewModel2);
                Object objRememberedValue5 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue5 == companion.getEmpty()) {
                    final int i6 = 1;
                    objRememberedValue5 = new c() { // from class: x3.Uc
                        @Override // O3.c
                        public final Object invoke(Object obj3) {
                            switch (i6) {
                                case 0:
                                    v addr = (v) obj3;
                                    o.f(addr, "addr");
                                    printOrderViewModel2.n(addr);
                                    Gd.v(mutableState5, false);
                                    break;
                                default:
                                    String pin = (String) obj3;
                                    o.f(pin, "pin");
                                    C2622p6 c2622p6 = new C2622p6(mutableState5, 1);
                                    PrintOrderViewModel printOrderViewModel3 = printOrderViewModel2;
                                    printOrderViewModel3.getClass();
                                    Log.d("PrintOrderViewModel", "lookupPincodeForTemp called with ".concat(pin));
                                    printOrderViewModel3.f10891c.g(pin, new d(3, printOrderViewModel3, c2622p6));
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue5);
                }
                composer.endReplaceGroup();
                Gd.b(str2, list, qVar, qVar2, zBooleanValue, aVar3, cVar, aVar4, cVar2, aVar5, (c) objRememberedValue5, composer, 100859904, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
