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

/* JADX INFO: renamed from: x3.u6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2701u6 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ImageVector f15589o;

    public C2701u6(ImageVector imageVector) {
        this.f15589o = imageVector;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1233699349, iIntValue, -1, "com.notescrafter.ui.screens.FineTuneControls.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LogoSelectionScreen.kt:531)");
            }
            IconKt.m1877Iconww6aTOc(this.f15589o, "Resize Mode", SizeKt.m713size3ABfNKs(Modifier.Companion, Dp.m6403constructorimpl(24)), a.f15978a, composer, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
