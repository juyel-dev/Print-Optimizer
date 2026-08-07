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
import p107y3.a;

/* JADX INFO: renamed from: x3.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2537k1 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2537k1 f15237o = new C2537k1();

    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RowScope TextButton = (RowScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(TextButton, "$this$TextButton");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1533436440, iIntValue, -1, "com.notescrafter.ui.screens.ComposableSingletons$PdfMergeScreenKt.lambda-3.<anonymous> (PdfMergeScreen.kt:466)");
            }
            TextKt.m2432Text4IGK_g("Merge More Files", (Modifier) null, a.f15978a, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 196998, 0, 131034);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
