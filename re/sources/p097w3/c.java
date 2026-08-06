package p097w3;

import B3.o;
import O3.e;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import p107y3.a;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r f13612o;
    public final /* synthetic */ boolean p;

    public c(r rVar, boolean z3) {
        this.f13612o = rVar;
        this.p = z3;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1432745838, iIntValue, -1, "com.notescrafter.ui.components.BottomNavBar.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BottomNavBar.kt:118)");
            }
            TextKt.m2432Text4IGK_g(this.f13612o.f13632a, OffsetKt.m629offsetVpY3zN4$default(Modifier.Companion, 0.0f, Dp.m6403constructorimpl(4), 1, null), this.p ? a.f15978a : a.q, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m6342getEllipsisgIe3tQ8(), false, 1, 0, (O3.c) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 48, 3120, 55288);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
