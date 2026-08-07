package p102x3;

import O3.c;
import O3.f;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.modifiers.a;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.AddKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: x3.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2633q1 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2633q1 f15429o = new C2633q1();

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
                ComposerKt.traceEventStart(-1324683004, iIntValue, -1, "com.notescrafter.ui.screens.ComposableSingletons$PdfMergeScreenKt.lambda-9.<anonymous> (PdfMergeScreen.kt:919)");
            }
            ImageVector add = AddKt.getAdd(Icons.Outlined.INSTANCE);
            Modifier.Companion companion = Modifier.Companion;
            IconKt.m1877Iconww6aTOc(add, (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(18)), 0L, composer, 432, 8);
            a.q(8, companion, composer, 6);
            TextKt.m2432Text4IGK_g("Add More Files", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 196614, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
