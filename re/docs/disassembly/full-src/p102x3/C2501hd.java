package p102x3;

import O3.f;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.o;
import p097w3.j;

/* JADX INFO: renamed from: x3.hd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2501hd implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f15163o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ State f15164r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f15165s;

    public C2501hd(String str, MutableState mutableState, MutableState mutableState2, State state, MutableState mutableState3) {
        this.f15163o = str;
        this.p = mutableState;
        this.q = mutableState2;
        this.f15164r = state;
        this.f15165s = mutableState3;
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
                ComposerKt.traceEventStart(1822535855, iIntValue, -1, "com.notescrafter.ui.screens.PrintOrderShippingScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:2805)");
            }
            j.a(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(717609066, true, new C2485gd(this.f15163o, this.p, this.q, ((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenWidthDp < 380, this.f15164r, this.f15165s), composer, 54), composer, 196614, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
