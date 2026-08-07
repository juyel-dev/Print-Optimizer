package p102x3;

import O3.c;
import O3.f;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: x3.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2523j3 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2523j3 f15207o = new C2523j3();

    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RowScope OutlinedButton = (RowScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(OutlinedButton, "$this$OutlinedButton");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(501053377, iIntValue, -1, "com.notescrafter.ui.screens.ComposableSingletons$ReorderScreenKt.lambda-4.<anonymous> (ReorderScreen.kt:223)");
            }
            TextKt.m2432Text4IGK_g("Back", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 196614, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
