package p102x3;

import O3.f;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.o;
import p076s.b;
import p097w3.j;
import p107y3.a;

/* JADX INFO: loaded from: classes2.dex */
public final class V1 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final V1 f14507o = new V1();

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
                ComposerKt.traceEventStart(-1176755842, iIntValue, -1, "com.notescrafter.ui.screens.ComposableSingletons$PdfToJpgScreenKt.lambda-9.<anonymous> (PdfToJpgScreen.kt:721)");
            }
            Modifier.Companion companion = Modifier.Companion;
            b.m(20, companion, composer, 6);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            long j5 = a.f15984i;
            j.a(modifierFillMaxWidth$default, Color.m3926copywmQWz5c$default(j5, 0.03f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(j5, 0.15f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, W1.f14560h, composer, 197046, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
