package p102x3;

import B3.o;
import O3.e;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.SearchKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;

/* JADX INFO: renamed from: x3.f3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2459f3 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2459f3 f14986o = new C2459f3();

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1517165223, iIntValue, -1, "com.notescrafter.ui.screens.ComposableSingletons$QuickToolsScreenKt.lambda-2.<anonymous> (QuickToolsScreen.kt:102)");
            }
            IconKt.m1877Iconww6aTOc(SearchKt.getSearch(Icons.Outlined.INSTANCE), "Search", (Modifier) null, 0L, composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
