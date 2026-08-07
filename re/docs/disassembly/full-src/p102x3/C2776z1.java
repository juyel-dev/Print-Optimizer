package p102x3;

import O3.c;
import O3.f;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.ContentCopyKt;
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
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.internal.o;
import p107y3.a;

/* JADX INFO: renamed from: x3.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2776z1 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2776z1 f15795o = new C2776z1();

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
                ComposerKt.traceEventStart(-352182478, iIntValue, -1, "com.notescrafter.ui.screens.ComposableSingletons$PdfOrganizeScreenKt.lambda-7.<anonymous> (PdfOrganizeScreen.kt:880)");
            }
            ImageVector contentCopy = ContentCopyKt.getContentCopy(Icons.Outlined.INSTANCE);
            long j5 = a.f15978a;
            Modifier.Companion companion = Modifier.Companion;
            IconKt.m1877Iconww6aTOc(contentCopy, "Duplicate", SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(16)), j5, composer, 3504, 0);
            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion, Dp.m6403constructorimpl(4)), composer, 6);
            TextKt.m2432Text4IGK_g("Duplicate", (Modifier) null, j5, TextUnitKt.getSp(12), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 200070, 0, 131026);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
