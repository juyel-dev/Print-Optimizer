package p102x3;

import A2.t;
import O3.a;
import O3.c;
import O3.e;
import O3.f;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
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
import kotlin.jvm.internal.AbstractC2168g;
import kotlin.jvm.internal.o;
import p076s.b;
import p083t3.C2321y;
import p097w3.j;

/* JADX INFO: renamed from: x3.v9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2720v9 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MutableState f15651o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;

    public C2720v9(MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        this.f15651o = mutableState;
        this.p = mutableState2;
        this.q = mutableState3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer;
        Composer composer2;
        LazyItemScope item = (LazyItemScope) obj;
        Composer composer3 = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(item, "$this$item");
        if ((iIntValue & 17) == 16 && composer3.getSkipping()) {
            composer3.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-935661962, iIntValue, -1, "com.notescrafter.ui.screens.PdfSplitScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfSplitScreen.kt:872)");
            }
            int iOrdinal = ((EnumC2677se) this.f15651o.getValue()).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    composer2 = composer3;
                    composer2.startReplaceGroup(863497613);
                    j.a(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0L, 0L, 0.0f, null, L1.f14152h, composer2, 196614, 30);
                    composer2.endReplaceGroup();
                } else {
                    if (iOrdinal != 2) {
                        composer3.startReplaceGroup(-664927413);
                        composer3.endReplaceGroup();
                        throw new t();
                    }
                    composer3.startReplaceGroup(864571980);
                    Modifier.Companion companion = Modifier.Companion;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer3, 0);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                    a constructor = companion2.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM3407constructorimpl = Updater.m3407constructorimpl(composer3);
                    e eVarG = p035i0.a.g(companion2, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
                    if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    TextStyle bodyMedium = MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodyMedium();
                    TextKt.m2432Text4IGK_g("Split every N pages:", PaddingKt.m672paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(8), 7, null), p107y3.a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodyMedium.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium.spanStyle.getFontWeight() : FontWeight.Companion.getSemiBold(), (16645977 & 8) != 0 ? bodyMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium.paragraphStyle.getTextMotion() : null), composer3, 438, 0, 65528);
                    MutableState mutableState = this.q;
                    String str = (String) mutableState.getValue();
                    Modifier modifierM718width3ABfNKs = SizeKt.m718width3ABfNKs(companion, Dp.m6403constructorimpl(140));
                    KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, KeyboardType.Companion.m6125getNumberPjHm6EE(), 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 123, (AbstractC2168g) null);
                    OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
                    long j5 = p107y3.a.f15978a;
                    long j6 = p107y3.a.f15991r;
                    long j7 = p107y3.a.f15990o;
                    TextFieldColors textFieldColorsM2076colors0hiis_0 = outlinedTextFieldDefaults.m2076colors0hiis_0(j7, j7, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, j5, j6, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer3, 54, 432, 0, 0, 3072, 2147477500, 4095);
                    RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(12));
                    composer3.startReplaceGroup(-2130926927);
                    Object objRememberedValue = composer3.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new C2321y(12, mutableState);
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    composer3.endReplaceGroup();
                    composer2 = composer3;
                    OutlinedTextFieldKt.OutlinedTextField(str, (c) objRememberedValue, modifierM718width3ABfNKs, false, false, (TextStyle) null, (e) null, (e) null, (e) null, (e) null, (e) null, (e) null, (e) null, false, (VisualTransformation) null, keyboardOptions, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM955RoundedCornerShape0680j_4, textFieldColorsM2076colors0hiis_0, composer2, 432, 196608, 0, 2064376);
                    composer2.endNode();
                    composer2.endReplaceGroup();
                }
                composer = composer2;
            } else {
                composer = composer3;
                composer.startReplaceGroup(862069288);
                Modifier.Companion companion3 = Modifier.Companion;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default2);
                ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
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
                e eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl2, currentCompositionLocalMap2);
                if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                TextStyle bodyMedium2 = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium();
                TextKt.m2432Text4IGK_g("Pages to extract (e.g. 1, 3, 5-8):", PaddingKt.m672paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(8), 7, null), p107y3.a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium2.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium2.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodyMedium2.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium2.spanStyle.getFontWeight() : FontWeight.Companion.getSemiBold(), (16645977 & 8) != 0 ? bodyMedium2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium2.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium2.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium2.paragraphStyle.getTextMotion() : null), composer, 438, 0, 65528);
                MutableState mutableState2 = this.p;
                String str2 = (String) mutableState2.getValue();
                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                OutlinedTextFieldDefaults outlinedTextFieldDefaults2 = OutlinedTextFieldDefaults.INSTANCE;
                long j8 = p107y3.a.f15978a;
                long j9 = p107y3.a.f15991r;
                long j10 = p107y3.a.f15990o;
                TextFieldColors textFieldColorsM2076colors0hiis_1 = outlinedTextFieldDefaults2.m2076colors0hiis_0(j10, j10, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, j8, j9, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 54, 432, 0, 0, 3072, 2147477500, 4095);
                RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_5 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(12));
                composer.startReplaceGroup(-2131007022);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new C2321y(11, mutableState2);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                OutlinedTextFieldKt.OutlinedTextField(str2, (c) objRememberedValue2, modifierFillMaxWidth$default3, false, false, (TextStyle) null, (e) null, (e) null, (e) null, (e) null, (e) null, (e) null, (e) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM955RoundedCornerShape0680j_5, textFieldColorsM2076colors0hiis_1, composer, 432, 0, 0, 2097144);
                composer.endNode();
                composer.endReplaceGroup();
            }
            if (b.q(32, Modifier.Companion, composer, 6)) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
