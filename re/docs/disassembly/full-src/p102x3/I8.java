package p102x3;

import O3.f;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.o;
import p076s.b;
import p097w3.j;

/* JADX INFO: loaded from: classes2.dex */
public final class I8 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MutableState f14088o;
    public final /* synthetic */ int p;
    public final /* synthetic */ long q;

    public I8(MutableState mutableState, int i5, long j5) {
        this.f14088o = mutableState;
        this.p = i5;
        this.q = j5;
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
                ComposerKt.traceEventStart(1661909527, iIntValue, -1, "com.notescrafter.ui.screens.PdfMergeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfMergeScreen.kt:646)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f5 = 8;
            j.a(PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, Dp.m6403constructorimpl(f5), 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(716225490, true, new H8(this.f14088o, this.p, this.q), composer, 54), composer, 196614, 30);
            if (b.q(f5, companion, composer, 6)) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
