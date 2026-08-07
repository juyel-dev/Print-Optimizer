package p102x3;

import A2.t;
import B3.h;
import B3.m;
import C3.v;
import O3.a;
import O3.c;
import O3.e;
import O3.f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
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
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.internal.AbstractC2168g;
import kotlin.jvm.internal.o;
import p076s.b;
import p083t3.C2290i;
import p083t3.C2321y;

/* JADX INFO: renamed from: x3.s7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2670s7 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MutableState f15523o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f15524r;

    public C2670s7(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4) {
        this.f15523o = mutableState;
        this.p = mutableState2;
        this.q = mutableState3;
        this.f15524r = mutableState4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
        Composer composer;
        Modifier.Companion companion;
        Modifier modifierM207backgroundbw27NRU$default;
        char c5;
        LazyItemScope item = (LazyItemScope) obj;
        Composer composer2 = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(item, "$this$item");
        if ((iIntValue & 17) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1443960320, iIntValue, -1, "com.notescrafter.ui.screens.PdfCompressScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfCompressScreen.kt:887)");
            }
            int iOrdinal = ((EnumC2778z3) this.f15523o.getValue()).ordinal();
            if (iOrdinal == 0) {
                composer = composer2;
                composer.startReplaceGroup(-1611093527);
                Modifier.Companion companion2 = Modifier.Companion;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion3 = Alignment.Companion;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composer, 0);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
                ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                a constructor = companion4.getConstructor();
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
                e eVarG = p035i0.a.g(companion4, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
                if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                TextStyle bodyMedium = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium();
                float f5 = 12;
                float f6 = f5;
                TextKt.m2432Text4IGK_g("Select Compression Level:", PaddingKt.m672paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f5), 7, null), p107y3.a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodyMedium.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium.spanStyle.getFontWeight() : FontWeight.Companion.getSemiBold(), (16645977 & 8) != 0 ? bodyMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium.paragraphStyle.getTextMotion() : null), composer, 438, 0, 65528);
                int i5 = 1;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(8)), companion3.getTop(), composer, 6);
                int i6 = 0;
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default2);
                a constructor2 = companion4.getConstructor();
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
                e eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl2, measurePolicyRowMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
                if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                composer.startReplaceGroup(928332767);
                for (h hVar : v.S(new h(A3.f13729o, new m("Low", "Best Quality", Float.valueOf(0.08f))), new h(A3.p, new m("Medium", "Balanced", Float.valueOf(0.15f))), new h(A3.q, new m("High", "Max Compress", Float.valueOf(0.22f))))) {
                    A3 a5 = (A3) hVar.f148o;
                    m mVar = (m) hVar.p;
                    String str = (String) mVar.f152o;
                    String str2 = (String) mVar.p;
                    float fFloatValue = ((Number) mVar.q).floatValue();
                    MutableState mutableState = this.p;
                    int i7 = ((A3) mutableState.getValue()) == a5 ? i5 : i6;
                    Modifier.Companion companion5 = Modifier.Companion;
                    float f7 = f6;
                    Modifier modifierG = b.g(RowScope.weight$default(rowScopeInstance, companion5, 1.0f, false, 2, null), f7);
                    if (i7 != 0) {
                        companion = companion5;
                        modifierM207backgroundbw27NRU$default = BackgroundKt.background$default(companion5, Brush.Companion.m3878linearGradientmHitzGk$default(Brush.Companion, v.S(Color.m3917boximpl(p107y3.a.f15978a), Color.m3917boximpl(p107y3.a.f15979b)), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
                    } else {
                        companion = companion5;
                        modifierM207backgroundbw27NRU$default = BackgroundKt.m207backgroundbw27NRU$default(companion, Color.m3926copywmQWz5c$default(p107y3.a.f15978a, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    }
                    Modifier modifierE = b.e(f7, modifierG.then(modifierM207backgroundbw27NRU$default), Dp.m6403constructorimpl(i5), i7 != 0 ? Color.Companion.m3962getTransparent0d7_KjU() : Color.m3926copywmQWz5c$default(p107y3.a.t, 0.3f, 0.0f, 0.0f, 0.0f, 14, null));
                    composer.startReplaceGroup(548108743);
                    boolean zChanged = composer.changed(a5);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                        c5 = '\f';
                        objRememberedValue = new C2290i(12, a5, mutableState);
                        composer.updateRememberedValue(objRememberedValue);
                    } else {
                        c5 = '\f';
                    }
                    composer.endReplaceGroup();
                    float f8 = 4;
                    Modifier modifierM669paddingVpY3zN4 = PaddingKt.m669paddingVpY3zN4(ClickableKt.m242clickableXHw0xAI$default(modifierE, false, null, null, (a) objRememberedValue, 7, null), Dp.m6403constructorimpl(f8), Dp.m6403constructorimpl(14));
                    Alignment.Companion companion6 = Alignment.Companion;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getCenter(), false);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierM669paddingVpY3zN4);
                    ComposeUiNode.Companion companion7 = ComposeUiNode.Companion;
                    a constructor3 = companion7.getConstructor();
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
                    e eVarG3 = p035i0.a.g(companion7, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl3, currentCompositionLocalMap3);
                    if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion7.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion6.getCenterHorizontally(), composer, 48);
                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                    Modifier.Companion companion8 = companion;
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, companion8);
                    a constructor4 = companion7.getConstructor();
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
                    e eVarG4 = p035i0.a.g(companion7, composerM3407constructorimpl4, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl4, currentCompositionLocalMap4);
                    if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier4, companion7.getSetModifier());
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i8 = MaterialTheme.$stable;
                    TextStyle bodyMedium2 = materialTheme.getTypography(composer, i8).getBodyMedium();
                    TextKt.m2432Text4IGK_g(str, (Modifier) null, i7 != 0 ? Color.Companion.m3964getWhite0d7_KjU() : p107y3.a.f15990o, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium2.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium2.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodyMedium2.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium2.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? bodyMedium2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium2.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium2.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium2.paragraphStyle.getTextMotion() : null), composer, 0, 0, 65530);
                    b.m(f8, companion8, composer, 6);
                    TextStyle bodySmall = materialTheme.getTypography(composer, i8).getBodySmall();
                    TextKt.m2432Text4IGK_g(str2, (Modifier) null, i7 != 0 ? Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null) : p107y3.a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, bodySmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodySmall.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(9), (16645977 & 4) != 0 ? bodySmall.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodySmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall.paragraphStyle.getTextMotion() : null), composer, 0, 0, 65018);
                    composer.endNode();
                    composer.endNode();
                    i6 = 0;
                    f6 = f7;
                    i5 = 1;
                }
                composer.endReplaceGroup();
                composer.endNode();
                composer.endNode();
                composer.endReplaceGroup();
            } else {
                if (iOrdinal != 1) {
                    composer2.startReplaceGroup(-51968471);
                    composer2.endReplaceGroup();
                    throw new t();
                }
                composer2.startReplaceGroup(-1606713320);
                Modifier.Companion companion9 = Modifier.Companion;
                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion9, 0.0f, 1, null);
                Arrangement arrangement2 = Arrangement.INSTANCE;
                Arrangement.Vertical top2 = arrangement2.getTop();
                Alignment.Companion companion10 = Alignment.Companion;
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(top2, companion10.getStart(), composer2, 0);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default3);
                ComposeUiNode.Companion companion11 = ComposeUiNode.Companion;
                a constructor5 = companion11.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor5);
                } else {
                    composer2.useNode();
                }
                Composer composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer2);
                e eVarG5 = p035i0.a.g(companion11, composerM3407constructorimpl5, measurePolicyColumnMeasurePolicy3, composerM3407constructorimpl5, currentCompositionLocalMap5);
                if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
                }
                Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier5, companion11.getSetModifier());
                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                TextStyle bodyMedium3 = MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyMedium();
                float f9 = 8;
                TextKt.m2432Text4IGK_g("Compress to under:", PaddingKt.m672paddingqDBjuR0$default(companion9, 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f9), 7, null), p107y3.a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium3.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium3.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodyMedium3.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium3.spanStyle.getFontWeight() : FontWeight.Companion.getSemiBold(), (16645977 & 8) != 0 ? bodyMedium3.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium3.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium3.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium3.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium3.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium3.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium3.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium3.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium3.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium3.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium3.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium3.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium3.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium3.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium3.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium3.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium3.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium3.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium3.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium3.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium3.paragraphStyle.getTextMotion() : null), composer2, 438, 0, 65528);
                Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion9, 0.0f, 1, null);
                MeasurePolicy measurePolicyI = androidx.compose.foundation.text.modifiers.a.i(f9, arrangement2, companion10.getCenterVertically(), composer2, 54);
                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default4);
                a constructor6 = companion11.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor6);
                } else {
                    composer2.useNode();
                }
                Composer composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer2);
                e eVarG6 = p035i0.a.g(companion11, composerM3407constructorimpl6, measurePolicyI, composerM3407constructorimpl6, currentCompositionLocalMap6);
                if (composerM3407constructorimpl6.getInserting() || !o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG6);
                }
                Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier6, companion11.getSetModifier());
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                MutableState mutableState2 = this.q;
                String str3 = (String) mutableState2.getValue();
                Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance2, companion9, 1.0f, false, 2, null);
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, KeyboardType.Companion.m6125getNumberPjHm6EE(), 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 123, (AbstractC2168g) null);
                OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
                long j5 = p107y3.a.f15978a;
                long j6 = p107y3.a.f15991r;
                long j7 = p107y3.a.f15990o;
                TextFieldColors textFieldColorsM2076colors0hiis_0 = outlinedTextFieldDefaults.m2076colors0hiis_0(j7, j7, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, j5, j6, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer2, 54, 432, 0, 0, 3072, 2147477500, 4095);
                float f10 = 12;
                RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f10));
                composer2.startReplaceGroup(928465190);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new C2321y(10, mutableState2);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceGroup();
                float f11 = f10;
                OutlinedTextFieldKt.OutlinedTextField(str3, (c) objRememberedValue2, modifierWeight$default, false, false, (TextStyle) null, (e) null, (e) null, (e) null, (e) null, (e) null, (e) null, (e) null, false, (VisualTransformation) null, keyboardOptions, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM955RoundedCornerShape0680j_4, textFieldColorsM2076colors0hiis_0, composer2, 48, 196608, 0, 2064376);
                Composer composer3 = composer2;
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement2.m548spacedBy0680j_4(Dp.m6403constructorimpl(4)), companion10.getTop(), composer3, 6);
                ?? r6 = 0;
                int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap7 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer3, companion9);
                a constructor7 = companion11.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor7);
                } else {
                    composer3.useNode();
                }
                Composer composerM3407constructorimpl7 = Updater.m3407constructorimpl(composer3);
                e eVarG7 = p035i0.a.g(companion11, composerM3407constructorimpl7, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl7, currentCompositionLocalMap7);
                if (composerM3407constructorimpl7.getInserting() || !o.b(composerM3407constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG7);
                }
                p035i0.a.w(companion11, composerM3407constructorimpl7, modifierMaterializeModifier7, composer3, 548230687);
                for (EnumC2614oe enumC2614oe : v.S(EnumC2614oe.f15388o, EnumC2614oe.p)) {
                    MutableState mutableState3 = this.f15524r;
                    ?? r4 = ((EnumC2614oe) mutableState3.getValue()) == enumC2614oe ? 1 : r6;
                    Modifier.Companion companion12 = Modifier.Companion;
                    float f12 = f11;
                    Modifier modifierE2 = b.e(f12, b.d(f12, companion12).then(r4 != 0 ? BackgroundKt.background$default(companion12, Brush.Companion.m3878linearGradientmHitzGk$default(Brush.Companion, v.S(Color.m3917boximpl(p107y3.a.f15978a), Color.m3917boximpl(p107y3.a.f15979b)), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null) : BackgroundKt.m207backgroundbw27NRU$default(companion12, Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null)), Dp.m6403constructorimpl(1), r4 != 0 ? Color.Companion.m3962getTransparent0d7_KjU() : p107y3.a.f15991r);
                    composer3.startReplaceGroup(-292224123);
                    boolean zChanged2 = composer3.changed(enumC2614oe);
                    Object objRememberedValue3 = composer3.rememberedValue();
                    if (zChanged2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                        objRememberedValue3 = new C2290i(13, enumC2614oe, mutableState3);
                        composer3.updateRememberedValue(objRememberedValue3);
                    }
                    composer3.endReplaceGroup();
                    Modifier modifierM669paddingVpY3zN5 = PaddingKt.m669paddingVpY3zN4(ClickableKt.m242clickableXHw0xAI$default(modifierE2, false, null, null, (a) objRememberedValue3, 7, null), Dp.m6403constructorimpl(16), Dp.m6403constructorimpl(f12));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), r6);
                    int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer3, r6);
                    CompositionLocalMap currentCompositionLocalMap8 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer3, modifierM669paddingVpY3zN5);
                    ComposeUiNode.Companion companion13 = ComposeUiNode.Companion;
                    a constructor8 = companion13.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor8);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM3407constructorimpl8 = Updater.m3407constructorimpl(composer3);
                    e eVarG8 = p035i0.a.g(companion13, composerM3407constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl8, currentCompositionLocalMap8);
                    if (composerM3407constructorimpl8.getInserting() || !o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                        p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG8);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier8, companion13.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Composer composer4 = composer3;
                    TextKt.m2432Text4IGK_g(enumC2614oe.name(), (Modifier) null, r4 != 0 ? Color.Companion.m3964getWhite0d7_KjU() : p107y3.a.p, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodyMedium(), composer4, 196608, 0, 65498);
                    composer4.endNode();
                    composer3 = composer4;
                    f11 = f12;
                    r6 = 0;
                }
                Composer composer5 = composer3;
                composer5.endReplaceGroup();
                composer5.endNode();
                composer5.endNode();
                composer5.endNode();
                composer5.endReplaceGroup();
                composer = composer5;
            }
            if (b.q(32, Modifier.Companion, composer, 6)) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
