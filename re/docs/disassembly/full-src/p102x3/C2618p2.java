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

/* JADX INFO: renamed from: x3.p2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2618p2 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2618p2 f15394o = new C2618p2();

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(647412615, iIntValue, -1, "com.notescrafter.ui.screens.ComposableSingletons$PrintAddressesScreenKt.lambda-8.<anonymous> (PrintAddressesScreen.kt:535)");
            }
            TextKt.m2432Text4IGK_g("Are you sure you want to delete this address?", (Modifier) null, Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 390, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
