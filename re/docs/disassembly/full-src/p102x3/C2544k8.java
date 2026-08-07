package p102x3;

import O3.f;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.o;
import p076s.b;
import p097w3.j;

/* JADX INFO: renamed from: x3.k8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2544k8 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MutableState f15247o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f15248r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f15249s;

    public C2544k8(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5) {
        this.f15247o = mutableState;
        this.p = mutableState2;
        this.q = mutableState3;
        this.f15248r = mutableState4;
        this.f15249s = mutableState5;
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
                ComposerKt.traceEventStart(-250015600, iIntValue, -1, "com.notescrafter.ui.screens.PdfInvertScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfInvertScreen.kt:713)");
            }
            Modifier.Companion companion = Modifier.Companion;
            j.a(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1195699637, true, new C2528j8(this.f15247o, this.p, this.q, this.f15248r, this.f15249s), composer, 54), composer, 196614, 30);
            if (b.q(24, companion, composer, 6)) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
