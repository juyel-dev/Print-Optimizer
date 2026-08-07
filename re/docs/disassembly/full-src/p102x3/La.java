package p102x3;

import B3.o;
import O3.e;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.RefreshKt;
import androidx.compose.material.icons.outlined.EditKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;

/* JADX INFO: loaded from: classes2.dex */
public final class La implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f14175o;

    public La(boolean z3) {
        this.f14175o = z3;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1642924261, iIntValue, -1, "com.notescrafter.ui.screens.PageThumbnail.<anonymous>.<anonymous> (PreviewScreen.kt:723)");
            }
            boolean z3 = this.f14175o;
            IconKt.m1877Iconww6aTOc(z3 ? RefreshKt.getRefresh(Icons.INSTANCE.getDefault()) : EditKt.getEdit(Icons.Outlined.INSTANCE), z3 ? "Reset Page" : "Edit Page", SizeKt.m713size3ABfNKs(Modifier.Companion, Dp.m6403constructorimpl(18)), Color.Companion.m3964getWhite0d7_KjU(), composer, 3456, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
