package p102x3;

import O3.a;
import O3.f;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.notescrafter.PrintOrderViewModel;
import kotlin.jvm.internal.o;
import p097w3.j;

/* JADX INFO: renamed from: x3.dd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2437dd implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ State f14941o;
    public final /* synthetic */ a p;
    public final /* synthetic */ PrintOrderViewModel q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ State f14942r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ State f14943s;
    public final /* synthetic */ State t;
    public final /* synthetic */ State u;

    public C2437dd(State state, a aVar, PrintOrderViewModel printOrderViewModel, State state2, State state3, State state4, State state5) {
        this.f14941o = state;
        this.p = aVar;
        this.q = printOrderViewModel;
        this.f14942r = state2;
        this.f14943s = state3;
        this.t = state4;
        this.u = state5;
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
                ComposerKt.traceEventStart(-1139632240, iIntValue, -1, "com.notescrafter.ui.screens.PrintOrderShippingScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:2585)");
            }
            j.a(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(2050408267, true, new C2421cd(this.f14941o, this.p, this.q, this.f14942r, this.f14943s, this.t, this.u), composer, 54), composer, 196614, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
