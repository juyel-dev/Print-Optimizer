package p102x3;

import B3.o;
import O3.e;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.MoreVertKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import p107y3.a;

/* JADX INFO: loaded from: classes2.dex */
public final class L implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final L f14145o = new L();

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1913774856, iIntValue, -1, "com.notescrafter.ui.screens.ComposableSingletons$DownloadsScreenKt.lambda-7.<anonymous> (DownloadsScreen.kt:379)");
            }
            IconKt.m1877Iconww6aTOc(MoreVertKt.getMoreVert(Icons.Filled.INSTANCE), "More options", SizeKt.m713size3ABfNKs(Modifier.Companion, Dp.m6403constructorimpl(20)), a.p, composer, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
