package p102x3;

import C3.v;
import O3.a;
import O3.c;
import O3.e;
import O3.f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.notescrafter.app.R;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: x3.r5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2652r5 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f15486o;
    public final /* synthetic */ ComposableLambda p;
    public final /* synthetic */ String q;

    public C2652r5(long j5, ComposableLambda composableLambda, String str) {
        this.f15486o = j5;
        this.p = composableLambda;
        this.q = str;
    }

    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BoxScope GlassCard = (BoxScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(GlassCard, "$this$GlassCard");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-194940375, iIntValue, -1, "com.notescrafter.ui.screens.ProductContainer.<anonymous> (GlobalHomeScreen.kt:350)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Brush.Companion companion2 = Brush.Companion;
            Color colorM3917boximpl = Color.m3917boximpl(Color.m3926copywmQWz5c$default(this.f15486o, 0.04f, 0.0f, 0.0f, 0.0f, 14, null));
            Color.Companion companion3 = Color.Companion;
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(BackgroundKt.background$default(modifierFillMaxWidth$default, Brush.Companion.m3884verticalGradient8A3gB4$default(companion2, v.S(colorM3917boximpl, Color.m3917boximpl(companion3.m3962getTransparent0d7_KjU())), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), Dp.m6403constructorimpl(20));
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion4 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion4.getStart(), composer, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM668padding3ABfNKs);
            ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
            a constructor = companion5.getConstructor();
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
            e eVarG = p035i0.a.g(companion5, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion4.getCenterVertically(), composer, 48);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default2);
            a constructor2 = companion5.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer);
            e eVarG2 = p035i0.a.g(companion5, composerM3407constructorimpl2, measurePolicyRowMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_app_logo_foreground, composer, 0), (String) null, PaddingKt.m668padding3ABfNKs(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(32)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion3.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(4)), (Alignment) null, ContentScale.Companion.getFit(), 0.0f, (ColorFilter) null, composer, 24624, 104);
            androidx.compose.foundation.text.modifiers.a.q(10, companion, composer, 6);
            Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composer, 0);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierWeight$default);
            a constructor3 = companion5.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer);
            e eVarG3 = p035i0.a.g(companion5, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl3, currentCompositionLocalMap3);
            if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
            }
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion5.getSetModifier());
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i5 = MaterialTheme.$stable;
            TextStyle titleSmall = materialTheme.getTypography(composer, i5).getTitleSmall();
            FontWeight.Companion companion6 = FontWeight.Companion;
            TextKt.m2432Text4IGK_g("NotesCrafter", (Modifier) null, companion3.m3964getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, titleSmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? titleSmall.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? titleSmall.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(14), (16645977 & 4) != 0 ? titleSmall.spanStyle.getFontWeight() : companion6.getBold(), (16645977 & 8) != 0 ? titleSmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? titleSmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? titleSmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? titleSmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? titleSmall.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? titleSmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? titleSmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? titleSmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? titleSmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? titleSmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? titleSmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? titleSmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? titleSmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? titleSmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? titleSmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? titleSmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? titleSmall.platformStyle : null, (16645977 & 1048576) != 0 ? titleSmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? titleSmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? titleSmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? titleSmall.paragraphStyle.getTextMotion() : null), composer, 390, 0, 65530);
            TextStyle labelSmall = materialTheme.getTypography(composer, i5).getLabelSmall();
            TextKt.m2432Text4IGK_g(this.q, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall.spanStyle.m5841getColor0d7_KjU() : this.f15486o, (16645977 & 2) != 0 ? labelSmall.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(8), (16645977 & 4) != 0 ? labelSmall.spanStyle.getFontWeight() : companion6.getExtraBold(), (16645977 & 8) != 0 ? labelSmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1.5d), (16645977 & Fields.RotationX) != 0 ? labelSmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall.paragraphStyle.getTextMotion() : null), composer, 0, 0, 65534);
            composer.endNode();
            composer.endNode();
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(16)), composer, 6);
            this.p.invoke(columnScopeInstance, composer, 6);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
