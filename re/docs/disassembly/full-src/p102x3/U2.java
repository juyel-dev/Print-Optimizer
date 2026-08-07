package p102x3;

import B3.o;
import O3.e;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.DeleteKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import p107y3.a;

/* JADX INFO: loaded from: classes2.dex */
public final class U2 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final U2 f14485o = new U2();

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-967870139, iIntValue, -1, "com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-7.<anonymous> (PrintOrderScreens.kt:1356)");
            }
            IconKt.m1877Iconww6aTOc(DeleteKt.getDelete(Icons.Outlined.INSTANCE), "Remove", (Modifier) null, a.p, composer, 3120, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
