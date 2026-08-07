package p102x3;

import B3.o;
import O3.c;
import O3.e;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;

/* JADX INFO: renamed from: x3.o2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2602o2 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2602o2 f15365o = new C2602o2();

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1040411560, iIntValue, -1, "com.notescrafter.ui.screens.ComposableSingletons$PrintAddressesScreenKt.lambda-7.<anonymous> (PrintAddressesScreen.kt:534)");
            }
            TextKt.m2432Text4IGK_g("Delete Address", (Modifier) null, Color.Companion.m3964getWhite0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 196998, 0, 131034);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
