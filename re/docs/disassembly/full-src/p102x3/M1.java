package p102x3;

import B3.o;
import O3.e;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.outlined.ArrowBackKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import p107y3.a;

/* JADX INFO: loaded from: classes2.dex */
public final class M1 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final M1 f14186o = new M1();

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1755399211, iIntValue, -1, "com.notescrafter.ui.screens.ComposableSingletons$PdfToJpgScreenKt.lambda-1.<anonymous> (PdfToJpgScreen.kt:323)");
            }
            IconKt.m1877Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Outlined.INSTANCE), "Back", (Modifier) null, a.f15990o, composer, 3120, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
