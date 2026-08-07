package p102x3;

import B3.o;
import O3.e;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ArrowBackKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;

/* JADX INFO: loaded from: classes2.dex */
public final class C2 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2 f13837o = new C2();

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1115713094, iIntValue, -1, "com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-11.<anonymous> (PrintOrderScreens.kt:2556)");
            }
            IconKt.m1877Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.INSTANCE.getDefault()), "Back", (Modifier) null, Color.Companion.m3964getWhite0d7_KjU(), composer, 3120, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
