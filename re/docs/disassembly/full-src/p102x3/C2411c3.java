package p102x3;

import C3.v;
import O3.a;
import O3.c;
import O3.e;
import O3.g;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: x3.c3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2411c3 implements g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2411c3 f14858o = new C2411c3();

    @Override // O3.g
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        AnimatedContentScope AnimatedContent = (AnimatedContentScope) obj;
        String status = (String) obj2;
        Composer composer = (Composer) obj3;
        int iIntValue = ((Number) obj4).intValue();
        o.f(AnimatedContent, "$this$AnimatedContent");
        o.f(status, "status");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1372198817, iIntValue, -1, "com.notescrafter.ui.screens.ComposableSingletons$ProcessingScreenKt.lambda-1.<anonymous> (ProcessingScreen.kt:103)");
        }
        Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
        Modifier.Companion companion = Modifier.Companion;
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        a constructor = companion2.getConstructor();
        if (composer.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM3407constructorimpl = Updater.m3407constructorimpl(composer);
        e eVarG = p035i0.a.g(companion2, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
        if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
        }
        Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        TextStyle headlineMedium = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getHeadlineMedium();
        TextKt.m2432Text4IGK_g(status, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, headlineMedium.m5915copyNs73l9s(Brush.Companion.m3878linearGradientmHitzGk$default(Brush.Companion, v.S(Color.m3917boximpl(p107y3.a.f15978a), Color.m3917boximpl(p107y3.a.f15979b)), 0L, 0L, 0, 14, (Object) null), (33554430 & 2) != 0 ? headlineMedium.spanStyle.getAlpha() : 0.0f, (33554430 & 4) != 0 ? headlineMedium.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (33554430 & 8) != 0 ? headlineMedium.spanStyle.getFontWeight() : null, (33554430 & 16) != 0 ? headlineMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (33554430 & 32) != 0 ? headlineMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (33554430 & 64) != 0 ? headlineMedium.spanStyle.getFontFamily() : null, (33554430 & Fields.SpotShadowColor) != 0 ? headlineMedium.spanStyle.getFontFeatureSettings() : null, (33554430 & Fields.RotationX) != 0 ? headlineMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (33554430 & Fields.RotationY) != 0 ? headlineMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (33554430 & Fields.RotationZ) != 0 ? headlineMedium.spanStyle.getTextGeometricTransform() : null, (33554430 & Fields.CameraDistance) != 0 ? headlineMedium.spanStyle.getLocaleList() : null, (33554430 & Fields.TransformOrigin) != 0 ? headlineMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (33554430 & Fields.Shape) != 0 ? headlineMedium.spanStyle.getTextDecoration() : null, (33554430 & Fields.Clip) != 0 ? headlineMedium.spanStyle.getShadow() : null, (33554430 & Fields.CompositingStrategy) != 0 ? headlineMedium.spanStyle.getDrawStyle() : null, (33554430 & 65536) != 0 ? headlineMedium.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (33554430 & Fields.RenderEffect) != 0 ? headlineMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (33554430 & 262144) != 0 ? headlineMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (524288 & 33554430) != 0 ? headlineMedium.paragraphStyle.getTextIndent() : null, (33554430 & 1048576) != 0 ? headlineMedium.platformStyle : null, (33554430 & 2097152) != 0 ? headlineMedium.paragraphStyle.getLineHeightStyle() : null, (33554430 & 4194304) != 0 ? headlineMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (33554430 & 8388608) != 0 ? headlineMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (33554430 & 16777216) != 0 ? headlineMedium.paragraphStyle.getTextMotion() : null), composer, ((iIntValue >> 3) & 14) | 196608, 0, 64990);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return B3.o.f154a;
    }
}
