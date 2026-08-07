package p102x3;

import O3.c;
import O3.f;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.material3.MaterialTheme;
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
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.o;
import p107y3.a;

/* JADX INFO: loaded from: classes2.dex */
public final class Sd implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f14436o;

    public Sd(String str) {
        this.f14436o = str;
    }

    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LazyGridItemScope item = (LazyGridItemScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(item, "$this$item");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2059914698, iIntValue, -1, "com.notescrafter.ui.screens.QuickToolsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuickToolsScreen.kt:129)");
            }
            TextStyle titleMedium = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleMedium();
            float f5 = 8;
            TextKt.m2432Text4IGK_g(this.f14436o, PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, Dp.m6403constructorimpl(f5), 0.0f, Dp.m6403constructorimpl(f5), 5, null), a.f15978a, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, titleMedium, composer, 197040, 0, 65496);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
