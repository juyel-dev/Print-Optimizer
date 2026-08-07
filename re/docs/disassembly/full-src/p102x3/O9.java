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

/* JADX INFO: loaded from: classes2.dex */
public final class O9 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MutableState f14267o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f14268r;

    public O9(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4) {
        this.f14267o = mutableState;
        this.p = mutableState2;
        this.q = mutableState3;
        this.f14268r = mutableState4;
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
                ComposerKt.traceEventStart(-1041214930, iIntValue, -1, "com.notescrafter.ui.screens.PdfToJpgScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfToJpgScreen.kt:765)");
            }
            Modifier.Companion companion = Modifier.Companion;
            j.a(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1676835159, true, new N9(this.f14267o, this.p, this.q, this.f14268r), composer, 54), composer, 196614, 30);
            if (b.q(24, companion, composer, 6)) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
