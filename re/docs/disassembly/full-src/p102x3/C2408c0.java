package p102x3;

import O3.f;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.o;
import p076s.b;

/* JADX INFO: renamed from: x3.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2408c0 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2408c0 f14855o = new C2408c0();

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
                ComposerKt.traceEventStart(996907338, iIntValue, -1, "com.notescrafter.ui.screens.ComposableSingletons$JpgToPdfScreenKt.lambda-10.<anonymous> (JpgToPdfScreen.kt:992)");
            }
            if (b.q(12, Modifier.Companion, composer, 6)) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
