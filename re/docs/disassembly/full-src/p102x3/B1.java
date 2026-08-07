package p102x3;

import B3.o;
import O3.e;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.outlined.RotateRightKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import p107y3.a;

/* JADX INFO: loaded from: classes2.dex */
public final class B1 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final B1 f13787o = new B1();

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1456147440, iIntValue, -1, "com.notescrafter.ui.screens.ComposableSingletons$PdfOrganizeScreenKt.lambda-9.<anonymous> (PdfOrganizeScreen.kt:1038)");
            }
            IconKt.m1877Iconww6aTOc(RotateRightKt.getRotateRight(Icons.AutoMirrored.Outlined.INSTANCE), "Rotate", SizeKt.m713size3ABfNKs(Modifier.Companion, Dp.m6403constructorimpl(13)), a.f15978a, composer, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
