package p102x3;

import O3.c;
import O3.f;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.ShareKt;
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

/* JADX INFO: renamed from: x3.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2440e0 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2440e0 f14949o = new C2440e0();

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
                ComposerKt.traceEventStart(-1379375096, iIntValue, -1, "com.notescrafter.ui.screens.ComposableSingletons$JpgToPdfScreenKt.lambda-3.<anonymous> (JpgToPdfScreen.kt:525)");
            }
            ImageVector share = ShareKt.getShare(Icons.Outlined.INSTANCE);
            Color.Companion companion = Color.Companion;
            long jM3964getWhite0d7_KjU = companion.m3964getWhite0d7_KjU();
            Modifier.Companion companion2 = Modifier.Companion;
            IconKt.m1877Iconww6aTOc(share, (String) null, SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(16)), jM3964getWhite0d7_KjU, composer, 3504, 0);
            TextKt.m2432Text4IGK_g("Share PDF", (Modifier) null, b.a(8, companion2, composer, 6, companion), TextUnitKt.getSp(13), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 200070, 0, 131026);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
