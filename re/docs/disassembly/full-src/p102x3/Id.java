package p102x3;

import C3.v;
import O3.a;
import O3.c;
import O3.e;
import O3.f;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
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
import java.util.Arrays;
import kotlin.jvm.internal.o;
import p076s.b;

/* JADX INFO: loaded from: classes2.dex */
public final class Id implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MutableState f14097o;

    public Id(MutableState mutableState) {
        this.f14097o = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
                ComposerKt.traceEventStart(-1045388119, iIntValue, -1, "com.notescrafter.ui.screens.PrintPriceCalculatorScreen.<anonymous>.<anonymous>.<anonymous> (PrintPriceCalculatorScreen.kt:430)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f5 = 16;
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(companion, Dp.m6403constructorimpl(f5));
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_4 = arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f5));
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_4, companion2.getStart(), composer, 6);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM668padding3ABfNKs);
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
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Color.Companion companion4 = Color.Companion;
            float f6 = 1;
            float f7 = 12;
            Modifier modifierM668padding3ABfNKs2 = PaddingKt.m668padding3ABfNKs(b.e(f5, b.f(f5, modifierFillMaxWidth$default, Color.m3926copywmQWz5c$default(companion4.m3964getWhite0d7_KjU(), 0.02f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f6), Color.m3926copywmQWz5c$default(companion4.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f7));
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composer, 48);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierM668padding3ABfNKs2);
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
            e eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            TextStyle labelSmall = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall();
            long sp = TextUnitKt.getSp(8);
            FontWeight.Companion companion5 = FontWeight.Companion;
            TextKt.m2432Text4IGK_g("SPINE THICKNESS SIMULATOR", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion4.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? labelSmall.spanStyle.m5842getFontSizeXSAIIZE() : sp, (16645977 & 4) != 0 ? labelSmall.spanStyle.getFontWeight() : companion5.getBlack(), (16645977 & 8) != 0 ? labelSmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1.5d), (16645977 & Fields.RotationX) != 0 ? labelSmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall.paragraphStyle.getTextMotion() : null), composer, 6, 0, 65534);
            b.m(f5, companion, composer, 6);
            MutableState mutableState = this.f14097o;
            State<Dp> stateM95animateDpAsStateAjpBEmI = AnimateAsStateKt.m95animateDpAsStateAjpBEmI(Dp.m6403constructorimpl(Math.max(2.0f, (((Number) mutableState.getValue()).floatValue() / 250.0f) * 40.0f)), null, "spine_anim", null, composer, 384, 10);
            Modifier modifierM699height3ABfNKs = SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(90));
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getCenter(), companion2.getCenterVertically(), composer, 54);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierM699height3ABfNKs);
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
            e eVarG3 = p035i0.a.g(companion3, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy, composerM3407constructorimpl3, currentCompositionLocalMap3);
            if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
            }
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            float f8 = 40;
            float f9 = 8;
            Modifier modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.background$default(SizeKt.fillMaxHeight$default(SizeKt.m718width3ABfNKs(companion, Dp.m6403constructorimpl(f8)), 0.0f, 1, null), Brush.Companion.m3878linearGradientmHitzGk$default(Brush.Companion, v.S(Color.m3917boximpl(Color.m3926copywmQWz5c$default(ColorKt.Color(4287837162L), 0.2f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3917boximpl(Color.m3926copywmQWz5c$default(ColorKt.Color(4283385573L), 0.2f, 0.0f, 0.0f, 0.0f, 14, null))), 0L, 0L, 0, 14, (Object) null), RoundedCornerShapeKt.m957RoundedCornerShapea9UjIt4$default(Dp.m6403constructorimpl(f9), 0.0f, 0.0f, Dp.m6403constructorimpl(f9), 6, null), 0.0f, 4, null), Dp.m6403constructorimpl(f6), Color.m3926copywmQWz5c$default(ColorKt.Color(4289222135L), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m957RoundedCornerShapea9UjIt4$default(Dp.m6403constructorimpl(f9), 0.0f, 0.0f, Dp.m6403constructorimpl(f9), 6, null));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, modifierM220borderxT4_qwU);
            a constructor4 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor4);
            } else {
                composer.useNode();
            }
            Composer composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer);
            e eVarG4 = p035i0.a.g(companion3, composerM3407constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl4, currentCompositionLocalMap4);
            if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
            }
            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            TextKt.m2432Text4IGK_g("Notes", RotateKt.rotate(companion, 90.0f), Color.m3926copywmQWz5c$default(ColorKt.Color(4290807036L), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(8), (FontStyle) null, companion5.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 200118, 0, 131024);
            composer.endNode();
            float f10 = 84;
            BoxKt.Box(b.e(0, BackgroundKt.m207backgroundbw27NRU$default(SizeKt.m699height3ABfNKs(SizeKt.m718width3ABfNKs(companion, stateM95animateDpAsStateAjpBEmI.getValue().m6417unboximpl()), Dp.m6403constructorimpl(f10)), Color.m3926copywmQWz5c$default(companion4.m3964getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f6), Color.m3926copywmQWz5c$default(companion4.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null)), composer, 0);
            Modifier modifierM699height3ABfNKs2 = SizeKt.m699height3ABfNKs(OffsetKt.m629offsetVpY3zN4$default(companion, Dp.m6403constructorimpl(-4), 0.0f, 2, null), Dp.m6403constructorimpl(f10));
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getSpaceBetween(), companion2.getStart(), composer, 6);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer, modifierM699height3ABfNKs2);
            a constructor5 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor5);
            } else {
                composer.useNode();
            }
            Composer composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer);
            e eVarG5 = p035i0.a.g(companion3, composerM3407constructorimpl5, measurePolicyColumnMeasurePolicy3, composerM3407constructorimpl5, currentCompositionLocalMap5);
            if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
            }
            p035i0.a.w(companion3, composerM3407constructorimpl5, modifierMaterializeModifier5, composer, 810422685);
            for (int i5 = 0; i5 < 6; i5++) {
                BoxKt.Box(BorderKt.m220borderxT4_qwU(BackgroundKt.background$default(SizeKt.m715sizeVpY3zN4(Modifier.Companion, Dp.m6403constructorimpl(f9), Dp.m6403constructorimpl(4)), Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(ColorKt.Color(4294688548L)), Color.m3917boximpl(ColorKt.Color(4292441862L))), 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShapeKt.getCircleShape(), 0.0f, 4, null), Dp.m6403constructorimpl(f6), Color.m3926copywmQWz5c$default(ColorKt.Color(4294759245L), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape()), composer, 0);
            }
            composer.endReplaceGroup();
            composer.endNode();
            Modifier.Companion companion6 = Modifier.Companion;
            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.m718width3ABfNKs(companion6, Dp.m6403constructorimpl(f8)), 0.0f, 1, null);
            Color.Companion companion7 = Color.Companion;
            BoxKt.Box(BorderKt.m220borderxT4_qwU(BackgroundKt.m206backgroundbw27NRU(modifierFillMaxHeight$default, Color.m3926copywmQWz5c$default(companion7.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m957RoundedCornerShapea9UjIt4$default(0.0f, Dp.m6403constructorimpl(f9), Dp.m6403constructorimpl(f9), 0.0f, 9, null)), Dp.m6403constructorimpl(f6), Color.m3926copywmQWz5c$default(companion7.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m957RoundedCornerShapea9UjIt4$default(0.0f, Dp.m6403constructorimpl(f9), Dp.m6403constructorimpl(f9), 0.0f, 9, null)), composer, 0);
            composer.endNode();
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f9)), composer, 6);
            String strZ = androidx.compose.foundation.text.modifiers.a.z("Thickness: ~", String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf((((double) ((Number) mutableState.getValue()).floatValue()) * 0.05d) + ((double) 2))}, 1)), " mm");
            long jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(companion7.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
            FontWeight.Companion companion8 = FontWeight.Companion;
            TextKt.m2432Text4IGK_g(strZ, (Modifier) null, jM3926copywmQWz5c$default, TextUnitKt.getSp(10), (FontStyle) null, companion8.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 200064, 0, 131026);
            composer.endNode();
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_5 = arrangement2.m548spacedBy0680j_4(Dp.m6403constructorimpl(f7));
            Alignment.Companion companion9 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_5, companion9.getStart(), composer, 6);
            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default2);
            ComposeUiNode.Companion companion10 = ComposeUiNode.Companion;
            a constructor6 = companion10.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor6);
            } else {
                composer.useNode();
            }
            Composer composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer);
            e eVarG6 = p035i0.a.g(companion10, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy4, composerM3407constructorimpl6, currentCompositionLocalMap6);
            if (composerM3407constructorimpl6.getInserting() || !o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG6);
            }
            Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier6, companion10.getSetModifier());
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            TextStyle labelSmall2 = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall();
            TextKt.m2432Text4IGK_g("INCLUDED BASE COSTS", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall2.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall2.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion7.m3964getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? labelSmall2.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall2.spanStyle.getFontWeight() : companion8.getBold(), (16645977 & 8) != 0 ? labelSmall2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall2.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1.5d), (16645977 & Fields.RotationX) != 0 ? labelSmall2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall2.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall2.paragraphStyle.getTextMotion() : null), composer, 6, 0, 65534);
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion9.getTop(), composer, 6);
            int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default3);
            a constructor7 = companion10.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor7);
            } else {
                composer.useNode();
            }
            Composer composerM3407constructorimpl7 = Updater.m3407constructorimpl(composer);
            e eVarG7 = p035i0.a.g(companion10, composerM3407constructorimpl7, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl7, currentCompositionLocalMap7);
            if (composerM3407constructorimpl7.getInserting() || !o.b(composerM3407constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG7);
            }
            Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier7, companion10.getSetModifier());
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            MeasurePolicy measurePolicyI = androidx.compose.foundation.text.modifiers.a.i(f9, arrangement2, companion9.getCenterVertically(), composer, 54);
            int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap8 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer, companion6);
            a constructor8 = companion10.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor8);
            } else {
                composer.useNode();
            }
            Composer composerM3407constructorimpl8 = Updater.m3407constructorimpl(composer);
            e eVarG8 = p035i0.a.g(companion10, composerM3407constructorimpl8, measurePolicyI, composerM3407constructorimpl8, currentCompositionLocalMap8);
            if (composerM3407constructorimpl8.getInserting() || !o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG8);
            }
            Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier8, companion10.getSetModifier());
            float f11 = 6;
            BoxKt.Box(BackgroundKt.m206backgroundbw27NRU(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(f11)), ColorKt.Color(4282090230L), RoundedCornerShapeKt.getCircleShape()), composer, 0);
            TextKt.m2432Text4IGK_g("Golden Wiro Binding", (Modifier) null, Color.m3926copywmQWz5c$default(companion7.m3964getWhite0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 3462, 0, 131058);
            composer.endNode();
            TextKt.m2432Text4IGK_g("₹50.00", (Modifier) null, Color.m3926copywmQWz5c$default(companion7.m3964getWhite0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(12), (FontStyle) null, companion8.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 200070, 0, 131026);
            composer.endNode();
            Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion9.getTop(), composer, 6);
            int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap9 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default4);
            a constructor9 = companion10.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor9);
            } else {
                composer.useNode();
            }
            Composer composerM3407constructorimpl9 = Updater.m3407constructorimpl(composer);
            e eVarG9 = p035i0.a.g(companion10, composerM3407constructorimpl9, measurePolicyRowMeasurePolicy3, composerM3407constructorimpl9, currentCompositionLocalMap9);
            if (composerM3407constructorimpl9.getInserting() || !o.b(composerM3407constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG9);
            }
            MeasurePolicy measurePolicyI2 = androidx.compose.foundation.text.modifiers.a.i(f9, arrangement2, b.c(companion10, composerM3407constructorimpl9, modifierMaterializeModifier9, companion9), composer, 54);
            int currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap10 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer, companion6);
            a constructor10 = companion10.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor10);
            } else {
                composer.useNode();
            }
            Composer composerM3407constructorimpl10 = Updater.m3407constructorimpl(composer);
            e eVarG10 = p035i0.a.g(companion10, composerM3407constructorimpl10, measurePolicyI2, composerM3407constructorimpl10, currentCompositionLocalMap10);
            if (composerM3407constructorimpl10.getInserting() || !o.b(composerM3407constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                p035i0.a.t(currentCompositeKeyHash10, composerM3407constructorimpl10, currentCompositeKeyHash10, eVarG10);
            }
            Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier10, companion10.getSetModifier());
            BoxKt.Box(BackgroundKt.m206backgroundbw27NRU(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(f11)), ColorKt.Color(4279286145L), RoundedCornerShapeKt.getCircleShape()), composer, 0);
            TextKt.m2432Text4IGK_g("Premium Cover Kit", (Modifier) null, Color.m3926copywmQWz5c$default(companion7.m3964getWhite0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 3462, 0, 131058);
            composer.endNode();
            TextKt.m2432Text4IGK_g("₹15.00", (Modifier) null, Color.m3926copywmQWz5c$default(companion7.m3964getWhite0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(12), (FontStyle) null, companion8.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 200070, 0, 131026);
            composer.endNode();
            DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3926copywmQWz5c$default(companion7.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), composer, 384, 3);
            Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion9.getCenterVertically(), composer, 54);
            int currentCompositeKeyHash11 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap11 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default5);
            a constructor11 = companion10.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor11);
            } else {
                composer.useNode();
            }
            Composer composerM3407constructorimpl11 = Updater.m3407constructorimpl(composer);
            e eVarG11 = p035i0.a.g(companion10, composerM3407constructorimpl11, measurePolicyRowMeasurePolicy4, composerM3407constructorimpl11, currentCompositionLocalMap11);
            if (composerM3407constructorimpl11.getInserting() || !o.b(composerM3407constructorimpl11.rememberedValue(), Integer.valueOf(currentCompositeKeyHash11))) {
                p035i0.a.t(currentCompositeKeyHash11, composerM3407constructorimpl11, currentCompositeKeyHash11, eVarG11);
            }
            Updater.m3414setimpl(composerM3407constructorimpl11, modifierMaterializeModifier11, companion10.getSetModifier());
            TextKt.m2432Text4IGK_g("Fixed Cover & Binding", (Modifier) null, companion7.m3964getWhite0d7_KjU(), TextUnitKt.getSp(12), (FontStyle) null, companion8.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 200070, 0, 131026);
            TextKt.m2432Text4IGK_g("₹65.00", (Modifier) null, ColorKt.Color(4290807036L), TextUnitKt.getSp(13), (FontStyle) null, companion8.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 200064, 0, 131026);
            if (S2.b(composer)) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
