package p102x3;

import B3.o;
import O3.e;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.CloseKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;

/* JADX INFO: renamed from: x3.q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2634q2 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2634q2 f15430o = new C2634q2();

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(909860233, iIntValue, -1, "com.notescrafter.ui.screens.ComposableSingletons$PrintAddressesScreenKt.lambda-9.<anonymous> (PrintAddressesScreen.kt:945)");
            }
            IconKt.m1877Iconww6aTOc(CloseKt.getClose(Icons.Outlined.INSTANCE), "Close", (Modifier) null, Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), composer, 3120, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
