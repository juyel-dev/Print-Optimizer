package p102x3;

import O3.c;
import O3.f;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.internal.o;
import p076s.b;

/* JADX INFO: loaded from: classes2.dex */
public final class Q implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Q f14302o = new Q();

    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RowScope Button = (RowScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(Button, "$this$Button");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-599870471, iIntValue, -1, "com.notescrafter.ui.screens.ComposableSingletons$EditPageScreenKt.lambda-3.<anonymous> (EditPageScreen.kt:636)");
            }
            ImageVector check = CheckKt.getCheck(Icons.INSTANCE.getDefault());
            Color.Companion companion = Color.Companion;
            long jM3964getWhite0d7_KjU = companion.m3964getWhite0d7_KjU();
            Modifier.Companion companion2 = Modifier.Companion;
            IconKt.m1877Iconww6aTOc(check, (String) null, SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(14)), jM3964getWhite0d7_KjU, composer, 3504, 0);
            TextKt.m2432Text4IGK_g("Apply", (Modifier) null, b.a(4, companion2, composer, 6, companion), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 3462, 0, 131058);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
