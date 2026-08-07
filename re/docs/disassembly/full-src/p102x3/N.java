package p102x3;

import B3.o;
import O3.e;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.EditKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import p107y3.a;

/* JADX INFO: loaded from: classes2.dex */
public final class N implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final N f14208o = new N();

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2031883694, iIntValue, -1, "com.notescrafter.ui.screens.ComposableSingletons$DownloadsScreenKt.lambda-9.<anonymous> (DownloadsScreen.kt:415)");
            }
            IconKt.m1877Iconww6aTOc(EditKt.getEdit(Icons.Outlined.INSTANCE), (String) null, (Modifier) null, a.p, composer, 3120, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
