package p102x3;

import O3.c;
import O3.f;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.AddKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.o;
import p107y3.a;

/* JADX INFO: renamed from: x3.i3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2507i3 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2507i3 f15173o = new C2507i3();

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
                ComposerKt.traceEventStart(-731611462, iIntValue, -1, "com.notescrafter.ui.screens.ComposableSingletons$ReorderScreenKt.lambda-3.<anonymous> (ReorderScreen.kt:151)");
            }
            ImageVector add = AddKt.getAdd(Icons.Filled.INSTANCE);
            long j5 = a.f15978a;
            Modifier.Companion companion = Modifier.Companion;
            IconKt.m1877Iconww6aTOc(add, (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(18)), j5, composer, 3504, 0);
            androidx.compose.foundation.text.modifiers.a.q(4, companion, composer, 6);
            TextKt.m2432Text4IGK_g("Add More PDFs", (Modifier) null, j5, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 390, 0, 65530);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
