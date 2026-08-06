package p083t3;

import B3.o;
import M0.b;
import O3.e;
import android.content.Context;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import com.notescrafter.PrintOrderViewModel;
import p092v3.h;

/* JADX INFO: loaded from: classes2.dex */
public final class M implements e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ b f13061A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ State f13062B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ State f13063C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ MutableState f13064D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ MutableState f13065E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final /* synthetic */ MutableState f13066F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final /* synthetic */ MutableState f13067G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final /* synthetic */ MutableState f13068H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final /* synthetic */ State f13069I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final /* synthetic */ MutableState f13070J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final /* synthetic */ State f13071K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final /* synthetic */ State f13072L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final /* synthetic */ State f13073M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final /* synthetic */ State f13074N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final /* synthetic */ State f13075O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final /* synthetic */ State f13076P;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13077o;
    public final /* synthetic */ Y p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ State f13078r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SnackbarHostState f13079s;
    public final /* synthetic */ b t;
    public final /* synthetic */ PrintOrderViewModel u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ h f13080v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f13081w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Context f13082x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ State f13083y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ State f13084z;

    public M(int i5, Y y4, MutableState mutableState, State state, SnackbarHostState snackbarHostState, b bVar, PrintOrderViewModel printOrderViewModel, h hVar, String str, Context context, State state2, State state3, b bVar2, State state4, State state5, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, State state6, MutableState mutableState7, State state7, State state8, State state9, State state10, State state11, State state12) {
        this.f13077o = i5;
        this.p = y4;
        this.q = mutableState;
        this.f13078r = state;
        this.f13079s = snackbarHostState;
        this.t = bVar;
        this.u = printOrderViewModel;
        this.f13080v = hVar;
        this.f13081w = str;
        this.f13082x = context;
        this.f13083y = state2;
        this.f13084z = state3;
        this.f13061A = bVar2;
        this.f13062B = state4;
        this.f13063C = state5;
        this.f13064D = mutableState2;
        this.f13065E = mutableState3;
        this.f13066F = mutableState4;
        this.f13067G = mutableState5;
        this.f13068H = mutableState6;
        this.f13069I = state6;
        this.f13070J = mutableState7;
        this.f13071K = state7;
        this.f13072L = state8;
        this.f13073M = state9;
        this.f13074N = state10;
        this.f13075O = state11;
        this.f13076P = state12;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1221691119, iIntValue, -1, "com.notescrafter.NotesCrafterContent.<anonymous> (MainActivity.kt:449)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
            long jM3962getTransparent0d7_KjU = Color.Companion.m3962getTransparent0d7_KjU();
            Y y4 = this.p;
            MutableState mutableState = this.q;
            State state = this.f13078r;
            ScaffoldKt.m2141ScaffoldTvnljyQ(modifierFillMaxSize$default, ComposableLambdaKt.rememberComposableLambda(602780083, true, new C2319x(this.f13077o, y4, mutableState, state), composer, 54), ComposableLambdaKt.rememberComposableLambda(-2139099852, true, new C2323z(mutableState, state), composer, 54), ComposableLambdaKt.rememberComposableLambda(-586012491, true, new A(this.f13079s, 0), composer, 54), null, 0, jM3962getTransparent0d7_KjU, 0L, null, ComposableLambdaKt.rememberComposableLambda(250111230, true, new L(this.t, this.u, this.f13080v, y4, this.f13081w, this.f13082x, this.f13083y, this.f13084z, this.f13061A, mutableState, this.f13062B, this.f13063C, this.f13064D, this.f13065E, this.f13066F, this.f13067G, this.f13068H, this.f13069I, state, this.f13070J, this.f13071K, this.f13072L, this.f13073M, this.f13074N, this.f13075O, this.f13076P), composer, 54), composer, 806882742, 432);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
