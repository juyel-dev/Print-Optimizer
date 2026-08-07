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

/* JADX INFO: renamed from: x3.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2522j2 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2522j2 f15206o = new C2522j2();

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1829107141, iIntValue, -1, "com.notescrafter.ui.screens.ComposableSingletons$PrintAddressesScreenKt.lambda-2.<anonymous> (PrintAddressesScreen.kt:327)");
            }
            TextKt.m2432Text4IGK_g("00000 00000", (Modifier) null, Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 390, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
