package p083t3;

import B3.o;
import O3.e;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.DownloadKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import p107y3.a;

/* JADX INFO: renamed from: t3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2276b implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2276b f13148o = new C2276b();

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(461344090, iIntValue, -1, "com.notescrafter.ComposableSingletons$MainActivityKt.lambda-2.<anonymous> (MainActivity.kt:1144)");
            }
            IconKt.m1877Iconww6aTOc(DownloadKt.getDownload(Icons.Outlined.INSTANCE), "Downloads", (Modifier) null, a.f15990o, composer, 3120, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
