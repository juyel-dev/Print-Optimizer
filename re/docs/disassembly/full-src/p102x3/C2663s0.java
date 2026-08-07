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

/* JADX INFO: renamed from: x3.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2663s0 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2663s0 f15514o = new C2663s0();

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1707327855, iIntValue, -1, "com.notescrafter.ui.screens.ComposableSingletons$PdfAddPageNumbersScreenKt.lambda-1.<anonymous> (PdfAddPageNumbersScreen.kt:385)");
            }
            IconKt.m1877Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Outlined.INSTANCE), "Back", (Modifier) null, a.f15990o, composer, 3120, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
