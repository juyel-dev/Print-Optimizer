package p102x3;

import B3.o;
import O3.e;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.unit.Dp;
import p107y3.a;

/* JADX INFO: renamed from: x3.z6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2781z6 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ImageVector f15800o;

    public C2781z6(ImageVector imageVector) {
        this.f15800o = imageVector;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1261035100, iIntValue, -1, "com.notescrafter.ui.screens.TinyControlIcon.<anonymous> (LogoSelectionScreen.kt:546)");
            }
            IconKt.m1877Iconww6aTOc(this.f15800o, (String) null, SizeKt.m713size3ABfNKs(Modifier.Companion, Dp.m6403constructorimpl(28)), a.f15990o, composer, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
