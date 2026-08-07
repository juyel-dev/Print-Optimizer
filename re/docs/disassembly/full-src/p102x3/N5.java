package p102x3;

import O3.a;
import O3.c;
import O3.e;
import O3.f;
import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.DividerKt;
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
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.o;
import p076s.b;

/* JADX INFO: loaded from: classes2.dex */
public final class N5 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MutableState f14219o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f14220r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f14221s;

    public N5(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, Context context) {
        this.f14219o = mutableState;
        this.p = mutableState2;
        this.q = mutableState3;
        this.f14220r = mutableState4;
        this.f14221s = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        String str2;
        MutableState mutableState;
        BoxScope GlassCard = (BoxScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(GlassCard, "$this$GlassCard");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1903647680, iIntValue, -1, "com.notescrafter.ui.screens.JpgToPdfScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (JpgToPdfScreen.kt:388)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f5 = 20;
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(f5));
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
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
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getCenterVertically(), composer, 54);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
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
            e eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyRowMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i5 = MaterialTheme.$stable;
            TextStyle bodySmall = materialTheme.getTypography(composer, i5).getBodySmall();
            FontWeight.Companion companion4 = FontWeight.Companion;
            TextKt.m2432Text4IGK_g("DOCUMENT RECEIPT", (Modifier) null, p107y3.a.f15980c, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodySmall.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodySmall.spanStyle.getFontWeight() : companion4.getBold(), (16645977 & 8) != 0 ? bodySmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? bodySmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall.paragraphStyle.getTextMotion() : null), composer, 390, 0, 65530);
            TextStyle bodySmall2 = materialTheme.getTypography(composer, i5).getBodySmall();
            TextStyle textStyleM5917copyp1EtxEg = bodySmall2.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall2.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodySmall2.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(10), (16645977 & 4) != 0 ? bodySmall2.spanStyle.getFontWeight() : companion4.getBold(), (16645977 & 8) != 0 ? bodySmall2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall2.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall2.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall2.paragraphStyle.getTextMotion() : null);
            long j5 = p107y3.a.f15984i;
            TextKt.m2432Text4IGK_g("SUCCESS", PaddingKt.m669paddingVpY3zN4(BackgroundKt.m207backgroundbw27NRU$default(b.d(4, companion), Color.m3926copywmQWz5c$default(j5, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(6), Dp.m6403constructorimpl(2)), j5, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, textStyleM5917copyp1EtxEg, composer, 390, 0, 65528);
            composer.endNode();
            float f6 = 16;
            b.m(f6, companion, composer, 6);
            Color.Companion companion5 = Color.Companion;
            float f7 = 1;
            DividerKt.m1794HorizontalDivider9IZ8Weo(null, Dp.m6403constructorimpl(f7), Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), composer, 432, 1);
            b.m(f6, companion, composer, 6);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(10)), companion2.getStart(), composer, 6);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, companion);
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
            e eVarG3 = p035i0.a.g(companion3, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl3, currentCompositionLocalMap3);
            if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
            }
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getTop(), composer, 6);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default2);
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
            e eVarG4 = p035i0.a.g(companion3, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl4, currentCompositionLocalMap4);
            if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
            }
            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
            TextStyle bodySmall3 = materialTheme.getTypography(composer, i5).getBodySmall();
            long j6 = p107y3.a.p;
            TextKt.m2432Text4IGK_g("Filename", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall3, composer, 390, 0, 65530);
            MutableState mutableState2 = this.f14219o;
            File file = (File) mutableState2.getValue();
            o.c(file);
            String name = file.getName();
            o.e(name, "getName(...)");
            TextStyle bodySmall4 = materialTheme.getTypography(composer, i5).getBodySmall();
            TextStyle textStyleM5917copyp1EtxEg2 = bodySmall4.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall4.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodySmall4.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodySmall4.spanStyle.getFontWeight() : companion4.getBold(), (16645977 & 8) != 0 ? bodySmall4.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall4.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall4.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall4.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall4.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall4.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall4.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall4.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall4.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall4.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall4.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall4.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall4.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall4.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall4.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall4.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall4.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall4.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall4.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall4.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall4.paragraphStyle.getTextMotion() : null);
            long j7 = p107y3.a.f15990o;
            TextKt.m2432Text4IGK_g(name, SizeKt.m720widthInVpY3zN4$default(companion, 0.0f, Dp.m6403constructorimpl(180), 1, null), j7, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m6342getEllipsisgIe3tQ8(), false, 1, 0, (c) null, textStyleM5917copyp1EtxEg2, composer, 432, 3120, 55288);
            composer.endNode();
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getTop(), composer, 6);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default3);
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
            e eVarG5 = p035i0.a.g(companion3, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy3, composerM3407constructorimpl5, currentCompositionLocalMap5);
            if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
            }
            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier5, companion3.getSetModifier());
            TextKt.m2432Text4IGK_g("Page Count", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer, i5).getBodySmall(), composer, 390, 0, 65530);
            String strK = androidx.compose.foundation.text.modifiers.a.k(((List) this.p.getValue()).size(), " Pages");
            TextStyle bodySmall5 = materialTheme.getTypography(composer, i5).getBodySmall();
            TextKt.m2432Text4IGK_g(strK, (Modifier) null, j7, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall5.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall5.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodySmall5.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodySmall5.spanStyle.getFontWeight() : companion4.getBold(), (16645977 & 8) != 0 ? bodySmall5.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall5.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall5.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall5.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall5.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall5.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall5.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall5.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall5.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall5.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall5.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall5.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall5.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall5.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall5.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall5.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall5.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall5.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall5.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall5.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall5.paragraphStyle.getTextMotion() : null), composer, 384, 0, 65530);
            composer.endNode();
            Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getTop(), composer, 6);
            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default4);
            a constructor6 = companion3.getConstructor();
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
            e eVarG6 = p035i0.a.g(companion3, composerM3407constructorimpl6, measurePolicyRowMeasurePolicy4, composerM3407constructorimpl6, currentCompositionLocalMap6);
            if (composerM3407constructorimpl6.getInserting() || !o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG6);
            }
            Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier6, companion3.getSetModifier());
            TextKt.m2432Text4IGK_g("File Size", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer, i5).getBodySmall(), composer, 390, 0, 65530);
            File file2 = (File) mutableState2.getValue();
            o.c(file2);
            long length = file2.length();
            if (length <= 0) {
                str = "0 B";
            } else {
                double d4 = length;
                int iLog10 = (int) (Math.log10(d4) / Math.log10(1024.0d));
                str = String.format("%.2f %s", Arrays.copyOf(new Object[]{Double.valueOf(d4 / Math.pow(1024.0d, iLog10)), new String[]{"B", "KB", "MB", "GB"}[iLog10]}, 2));
            }
            TextStyle bodySmall6 = materialTheme.getTypography(composer, i5).getBodySmall();
            TextKt.m2432Text4IGK_g(str, (Modifier) null, j7, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall6.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall6.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodySmall6.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodySmall6.spanStyle.getFontWeight() : companion4.getBold(), (16645977 & 8) != 0 ? bodySmall6.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall6.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall6.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall6.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall6.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall6.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall6.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall6.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall6.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall6.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall6.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall6.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall6.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall6.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall6.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall6.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall6.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall6.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall6.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall6.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall6.paragraphStyle.getTextMotion() : null), composer, 384, 0, 65530);
            composer.endNode();
            Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getTop(), composer, 6);
            int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default5);
            a constructor7 = companion3.getConstructor();
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
            e eVarG7 = p035i0.a.g(companion3, composerM3407constructorimpl7, measurePolicyRowMeasurePolicy5, composerM3407constructorimpl7, currentCompositionLocalMap7);
            if (composerM3407constructorimpl7.getInserting() || !o.b(composerM3407constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG7);
            }
            Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier7, companion3.getSetModifier());
            TextKt.m2432Text4IGK_g("Page Settings", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer, i5).getBodySmall(), composer, 390, 0, 65530);
            MutableState mutableState3 = this.q;
            if (((H5) mutableState3.getValue()) == H5.FIT) {
                str2 = "Fit to Image";
            } else {
                str2 = ((H5) mutableState3.getValue()).f14021o + " (" + ((G5) this.f14220r.getValue()).f13983o + ")";
            }
            TextStyle bodySmall7 = materialTheme.getTypography(composer, i5).getBodySmall();
            TextKt.m2432Text4IGK_g(str2, (Modifier) null, j7, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall7.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall7.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodySmall7.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodySmall7.spanStyle.getFontWeight() : companion4.getBold(), (16645977 & 8) != 0 ? bodySmall7.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall7.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall7.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall7.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall7.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall7.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall7.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall7.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall7.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall7.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall7.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall7.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall7.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall7.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall7.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall7.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall7.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall7.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall7.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall7.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall7.paragraphStyle.getTextMotion() : null), composer, 384, 0, 65530);
            b.r(composer, f5, companion, composer, 6);
            DividerKt.m1794HorizontalDivider9IZ8Weo(null, Dp.m6403constructorimpl(f7), Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), composer, 432, 1);
            b.m(f6, companion, composer, 6);
            Modifier modifierFillMaxWidth$default6 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            float f8 = 12;
            MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f8)), companion2.getTop(), composer, 6);
            int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap8 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default6);
            a constructor8 = companion3.getConstructor();
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
            e eVarG8 = p035i0.a.g(companion3, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy6, composerM3407constructorimpl8, currentCompositionLocalMap8);
            if (composerM3407constructorimpl8.getInserting() || !o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG8);
            }
            Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier8, companion3.getSetModifier());
            Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
            ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
            long jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.06f, 0.0f, 0.0f, 0.0f, 14, null);
            int i6 = (ButtonDefaults.$stable << 12) | 6;
            ButtonColors buttonColorsM1520buttonColorsro_MJ88 = buttonDefaults.m1520buttonColorsro_MJ88(jM3926copywmQWz5c$default, 0L, 0L, 0L, composer, i6, 14);
            RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f8));
            BorderStroke borderStrokeM236BorderStrokecXLIe8U = BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(f7), Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null));
            composer.startReplaceGroup(-859798074);
            Context context = this.f14221s;
            boolean zChangedInstance = composer.changedInstance(context);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                mutableState = mutableState2;
                objRememberedValue = new M5(context, mutableState, 0);
                composer.updateRememberedValue(objRememberedValue);
            } else {
                mutableState = mutableState2;
            }
            composer.endReplaceGroup();
            MutableState mutableState4 = mutableState;
            ButtonKt.Button((a) objRememberedValue, modifierWeight$default, false, roundedCornerShapeM955RoundedCornerShape0680j_4, buttonColorsM1520buttonColorsro_MJ88, null, borderStrokeM236BorderStrokecXLIe8U, null, null, AbstractC2552l0.f15271b, composer, 806879232, 420);
            Modifier modifierWeight$default2 = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
            ButtonColors buttonColorsM1520buttonColorsro_MJ89 = buttonDefaults.m1520buttonColorsro_MJ88(p107y3.a.f15978a, 0L, 0L, 0L, composer, i6, 14);
            RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_5 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f8));
            composer.startReplaceGroup(-859739060);
            boolean zChangedInstance2 = composer.changedInstance(context);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new M5(context, mutableState4, 1);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            ButtonKt.Button((a) objRememberedValue2, modifierWeight$default2, false, roundedCornerShapeM955RoundedCornerShape0680j_5, buttonColorsM1520buttonColorsro_MJ89, null, null, null, null, AbstractC2552l0.f15272c, composer, 805306368, 484);
            if (androidx.compose.foundation.text.modifiers.a.w(composer)) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
