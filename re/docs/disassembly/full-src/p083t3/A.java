package p083t3;

import B3.o;
import O3.c;
import O3.e;
import androidx.compose.material3.SnackbarHostKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.TextUnitKt;
import com.google.android.gms.internal.ads.AbstractC1421mz;
import java.util.List;
import p107y3.a;

/* JADX INFO: loaded from: classes2.dex */
public final class A implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13008o;
    public final /* synthetic */ Object p;

    public /* synthetic */ A(Object obj, int i5) {
        this.f13008o = i5;
        this.p = obj;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13008o) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                if ((iIntValue & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-586012491, iIntValue, -1, "com.notescrafter.NotesCrafterContent.<anonymous>.<anonymous> (MainActivity.kt:451)");
                    }
                    SnackbarHostKt.SnackbarHost((SnackbarHostState) this.p, null, null, composer, 0, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if ((iIntValue2 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1911333324, iIntValue2, -1, "com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfCropScreen.kt:997)");
                    }
                    TextKt.m2432Text4IGK_g((String) this.p, (Modifier) null, a.p, TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer2, 3456, 0, 131058);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            default:
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if ((iIntValue3 & 3) == 2 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(141333210, iIntValue3, -1, "com.notescrafter.ui.screens.PreviewScreen.<anonymous>.<anonymous>.<anonymous> (PreviewScreen.kt:308)");
                    }
                    TextKt.m2432Text4IGK_g(AbstractC1421mz.h(((List) this.p).size() + 1, "e.g., "), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
        }
        return o.f154a;
    }
}
