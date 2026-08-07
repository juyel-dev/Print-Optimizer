package p102x3;

import C3.v;
import O3.c;
import O3.g;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.text.modifiers.a;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: x3.d3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2427d3 implements g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2427d3 f14904o = new C2427d3();

    @Override // O3.g
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        AnimatedContentScope AnimatedContent = (AnimatedContentScope) obj;
        int iIntValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        o.f(AnimatedContent, "$this$AnimatedContent");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(877684473, iIntValue2, -1, "com.notescrafter.ui.screens.ComposableSingletons$ProcessingScreenKt.lambda-2.<anonymous> (ProcessingScreen.kt:156)");
        }
        String strK = a.k(iIntValue, "%");
        TextStyle headlineSmall = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getHeadlineSmall();
        TextKt.m2432Text4IGK_g(strK, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, headlineSmall.m5915copyNs73l9s(Brush.Companion.m3878linearGradientmHitzGk$default(Brush.Companion, v.S(Color.m3917boximpl(p107y3.a.f15978a), Color.m3917boximpl(p107y3.a.f15979b)), 0L, 0L, 0, 14, (Object) null), (33554430 & 2) != 0 ? headlineSmall.spanStyle.getAlpha() : 0.0f, (33554430 & 4) != 0 ? headlineSmall.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (33554430 & 8) != 0 ? headlineSmall.spanStyle.getFontWeight() : null, (33554430 & 16) != 0 ? headlineSmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (33554430 & 32) != 0 ? headlineSmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (33554430 & 64) != 0 ? headlineSmall.spanStyle.getFontFamily() : null, (33554430 & Fields.SpotShadowColor) != 0 ? headlineSmall.spanStyle.getFontFeatureSettings() : null, (33554430 & Fields.RotationX) != 0 ? headlineSmall.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (33554430 & Fields.RotationY) != 0 ? headlineSmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (33554430 & Fields.RotationZ) != 0 ? headlineSmall.spanStyle.getTextGeometricTransform() : null, (33554430 & Fields.CameraDistance) != 0 ? headlineSmall.spanStyle.getLocaleList() : null, (33554430 & Fields.TransformOrigin) != 0 ? headlineSmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (33554430 & Fields.Shape) != 0 ? headlineSmall.spanStyle.getTextDecoration() : null, (33554430 & Fields.Clip) != 0 ? headlineSmall.spanStyle.getShadow() : null, (33554430 & Fields.CompositingStrategy) != 0 ? headlineSmall.spanStyle.getDrawStyle() : null, (33554430 & 65536) != 0 ? headlineSmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (33554430 & Fields.RenderEffect) != 0 ? headlineSmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (33554430 & 262144) != 0 ? headlineSmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (524288 & 33554430) != 0 ? headlineSmall.paragraphStyle.getTextIndent() : null, (33554430 & 1048576) != 0 ? headlineSmall.platformStyle : null, (33554430 & 2097152) != 0 ? headlineSmall.paragraphStyle.getLineHeightStyle() : null, (33554430 & 4194304) != 0 ? headlineSmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (33554430 & 8388608) != 0 ? headlineSmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (33554430 & 16777216) != 0 ? headlineSmall.paragraphStyle.getTextMotion() : null), composer, 196608, 0, 65502);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return B3.o.f154a;
    }
}
