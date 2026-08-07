package p102x3;

import B3.o;
import O3.e;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.DeleteKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;

/* JADX INFO: loaded from: classes2.dex */
public final class H implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final H f14010o = new H();

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-314316421, iIntValue, -1, "com.notescrafter.ui.screens.ComposableSingletons$DownloadsScreenKt.lambda-11.<anonymous> (DownloadsScreen.kt:436)");
            }
            IconKt.m1877Iconww6aTOc(DeleteKt.getDelete(Icons.Filled.INSTANCE), (String) null, (Modifier) null, Color.Companion.m3961getRed0d7_KjU(), composer, 3120, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
