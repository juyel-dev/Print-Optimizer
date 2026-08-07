package p102x3;

import C3.v;
import O3.a;
import O3.c;
import O3.e;
import O3.f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.CheckKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import java.util.List;
import kotlin.jvm.internal.o;
import p076s.b;

/* JADX INFO: renamed from: x3.m9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2577m9 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MutableState f15315o;

    public C2577m9(MutableState mutableState) {
        this.f15315o = mutableState;
    }

    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LazyItemScope item = (LazyItemScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(item, "$this$item");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1303753733, iIntValue, -1, "com.notescrafter.ui.screens.PdfSplitScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfSplitScreen.kt:389)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, Dp.m6403constructorimpl(16), 1, null);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getCenterHorizontally(), composer, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM670paddingVpY3zN4$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            a constructor = companion3.getConstructor();
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
            e eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierClip = ClipKt.clip(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(96)), RoundedCornerShapeKt.getCircleShape());
            long j5 = p107y3.a.f15984i;
            Modifier modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(modifierClip, Color.m3926copywmQWz5c$default(j5, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(1), Color.m3926copywmQWz5c$default(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierM220borderxT4_qwU);
            a constructor2 = companion3.getConstructor();
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
            e eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierBackground$default = BackgroundKt.background$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(64)), RoundedCornerShapeKt.getCircleShape()), Brush.Companion.m3878linearGradientmHitzGk$default(Brush.Companion, v.S(Color.m3917boximpl(j5), Color.m3917boximpl(ColorKt.Color(4281652121L))), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierBackground$default);
            a constructor3 = companion3.getConstructor();
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
            e eVarG3 = p035i0.a.g(companion3, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl3, currentCompositionLocalMap3);
            if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
            }
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), "Success", SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(36)), Color.Companion.m3964getWhite0d7_KjU(), composer, 3504, 0);
            composer.endNode();
            composer.endNode();
            b.m(24, companion, composer, 6);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i5 = MaterialTheme.$stable;
            TextStyle headlineSmall = materialTheme.getTypography(composer, i5).getHeadlineSmall();
            FontWeight.Companion companion4 = FontWeight.Companion;
            TextStyle textStyleM5917copyp1EtxEg = headlineSmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineSmall.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? headlineSmall.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineSmall.spanStyle.getFontWeight() : companion4.getBold(), (16645977 & 8) != 0 ? headlineSmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineSmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineSmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineSmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineSmall.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineSmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineSmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineSmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineSmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineSmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineSmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineSmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineSmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineSmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineSmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineSmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineSmall.platformStyle : null, (16645977 & 1048576) != 0 ? headlineSmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineSmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineSmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineSmall.paragraphStyle.getTextMotion() : null);
            long j6 = p107y3.a.f15990o;
            TextAlign.Companion companion5 = TextAlign.Companion;
            TextKt.m2432Text4IGK_g("Split Completed!", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion5.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, textStyleM5917copyp1EtxEg, composer, 390, 0, 65018);
            float f5 = 8;
            b.m(f5, companion, composer, 6);
            String strK = androidx.compose.foundation.text.modifiers.a.k(((List) this.f15315o.getValue()).size(), " split files generated.");
            TextStyle bodyMedium = materialTheme.getTypography(composer, i5).getBodyMedium();
            long j7 = p107y3.a.p;
            TextKt.m2432Text4IGK_g(strK, (Modifier) null, j7, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion5.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, bodyMedium, composer, 384, 0, 65018);
            b.m(28, companion, composer, 6);
            TextStyle labelSmall = materialTheme.getTypography(composer, i5).getLabelSmall();
            TextKt.m2432Text4IGK_g("OUTPUT DOCUMENTS", PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f5), 7, null), j7, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? labelSmall.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(10), (16645977 & 4) != 0 ? labelSmall.spanStyle.getFontWeight() : companion4.getBold(), (16645977 & 8) != 0 ? labelSmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? labelSmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall.paragraphStyle.getTextMotion() : null), composer, 438, 0, 65528);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
