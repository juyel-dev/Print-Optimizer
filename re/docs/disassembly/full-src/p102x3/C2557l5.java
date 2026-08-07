package p102x3;

import C3.v;
import O3.a;
import O3.c;
import O3.f;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.notescrafter.app.R;
import kotlin.jvm.internal.o;
import p076s.b;

/* JADX INFO: renamed from: x3.l5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2557l5 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a f15284o;

    public C2557l5(a aVar) {
        this.f15284o = aVar;
    }

    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ColumnScope ProductContainer = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(ProductContainer, "$this$ProductContainer");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(319849660, iIntValue, -1, "com.notescrafter.ui.screens.GlobalHomeScreen.<anonymous>.<anonymous>.<anonymous> (GlobalHomeScreen.kt:112)");
            }
            Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.showcase_image, composer, 0);
            Modifier.Companion companion = Modifier.Companion;
            float f5 = 12;
            ImageKt.Image(painterPainterResource, "Flow Showcase Video Placeholder", b.e(f5, b.g(SizeKt.m701heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(150), 0.0f, 2, null), f5), Dp.m6403constructorimpl(1), Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null)), (Alignment) null, ContentScale.Companion.getCrop(), 0.0f, (ColorFilter) null, composer, 24624, 104);
            float f6 = 14;
            b.m(f6, companion, composer, 6);
            TextKt.m2432Text4IGK_g("An intelligent multi-step workflow designed to enhance dark lecture slides into perfect printable notes, create study-ready notes in seconds.", (Modifier) null, p107y3.a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(18), 0, false, 0, 0, (c) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 390, 6, 64506);
            b.m(f6, companion, composer, 6);
            AbstractC2684t5.e("Start Processing", "Upload dark slides and download printable notes", "Free Access", v.S(Color.m3917boximpl(p107y3.a.f15978a), Color.m3917boximpl(p107y3.a.f15979b)), this.f15284o, composer, 3510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
