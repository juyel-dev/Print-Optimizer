package p102x3;

import O3.a;
import O3.c;
import O3.e;
import O3.f;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
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
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final class U8 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14495o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f14496r;

    public U8(int i5, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        this.f14495o = i5;
        this.p = mutableState;
        this.q = mutableState2;
        this.f14496r = mutableState3;
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
                ComposerKt.traceEventStart(1719629185, iIntValue, -1, "com.notescrafter.ui.screens.PdfOrganizeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfOrganizeScreen.kt:847)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f5 = 12;
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(f5));
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), centerVertically, composer, 54);
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
            e eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyRowMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            String strO = androidx.compose.foundation.text.modifiers.a.o(new StringBuilder(), this.f14495o, " pages selected");
            TextStyle bodyMedium = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium();
            TextKt.m2432Text4IGK_g(strO, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium.spanStyle.m5841getColor0d7_KjU() : p107y3.a.f15990o, (16645977 & 2) != 0 ? bodyMedium.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? bodyMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium.paragraphStyle.getTextMotion() : null), composer, 0, 0, 65534);
            float f6 = 8;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f6)), companion2.getTop(), composer, 6);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, companion);
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
            e eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
            long jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(ColorKt.Color(4293870660L), 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
            int i5 = (ButtonDefaults.$stable << 12) | 6;
            ButtonColors buttonColorsM1520buttonColorsro_MJ88 = buttonDefaults.m1520buttonColorsro_MJ88(jM3926copywmQWz5c$default, 0L, 0L, 0L, composer, i5, 14);
            float f7 = 6;
            PaddingValues paddingValuesM662PaddingValuesYgX7TsA = PaddingKt.m662PaddingValuesYgX7TsA(Dp.m6403constructorimpl(f5), Dp.m6403constructorimpl(f7));
            RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f6));
            float f8 = 1;
            BorderStroke borderStrokeM236BorderStrokecXLIe8U = BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(f8), Color.m3926copywmQWz5c$default(ColorKt.Color(4293870660L), 0.25f, 0.0f, 0.0f, 0.0f, 14, null));
            composer.startReplaceGroup(-359864254);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion4 = Composer.Companion;
            Object empty = companion4.getEmpty();
            MutableState mutableState = this.p;
            MutableState mutableState2 = this.q;
            MutableState mutableState3 = this.f14496r;
            if (objRememberedValue == empty) {
                objRememberedValue = new P3(4, mutableState, mutableState2, mutableState3);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            ButtonKt.Button((a) objRememberedValue, null, false, roundedCornerShapeM955RoundedCornerShape0680j_4, buttonColorsM1520buttonColorsro_MJ88, null, borderStrokeM236BorderStrokecXLIe8U, paddingValuesM662PaddingValuesYgX7TsA, null, C1.f13833f, composer, 819462150, 294);
            long j5 = p107y3.a.f15978a;
            ButtonColors buttonColorsM1520buttonColorsro_MJ89 = buttonDefaults.m1520buttonColorsro_MJ88(Color.m3926copywmQWz5c$default(j5, 0.15f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, composer, i5, 14);
            PaddingValues paddingValuesM662PaddingValuesYgX7TsA2 = PaddingKt.m662PaddingValuesYgX7TsA(Dp.m6403constructorimpl(f5), Dp.m6403constructorimpl(f7));
            RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_5 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f6));
            BorderStroke borderStrokeM236BorderStrokecXLIe8U2 = BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(f8), Color.m3926copywmQWz5c$default(j5, 0.25f, 0.0f, 0.0f, 0.0f, 14, null));
            composer.startReplaceGroup(-359831291);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion4.getEmpty()) {
                objRememberedValue2 = new P3(5, mutableState, mutableState2, mutableState3);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            ButtonKt.Button((a) objRememberedValue2, null, false, roundedCornerShapeM955RoundedCornerShape0680j_5, buttonColorsM1520buttonColorsro_MJ89, null, borderStrokeM236BorderStrokecXLIe8U2, paddingValuesM662PaddingValuesYgX7TsA2, null, C1.g, composer, 819462150, 294);
            if (androidx.compose.foundation.text.modifiers.a.w(composer)) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
