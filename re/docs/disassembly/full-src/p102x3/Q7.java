package p102x3;

import B3.m;
import C3.v;
import O3.c;
import O3.e;
import O3.f;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
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
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.outlined.ArrowBackKt;
import androidx.compose.material.icons.automirrored.outlined.ArrowForwardKt;
import androidx.compose.material.icons.outlined.VerticalAlignBottomKt;
import androidx.compose.material.icons.outlined.VerticalAlignTopKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.vector.ImageVector;
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
import p083t3.A;
import p107y3.a;

/* JADX INFO: loaded from: classes2.dex */
public final class Q7 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MutableState f14321o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f14322r;

    public Q7(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4) {
        this.f14321o = mutableState;
        this.p = mutableState2;
        this.q = mutableState3;
        this.f14322r = mutableState4;
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
                ComposerKt.traceEventStart(1858440773, iIntValue, -1, "com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfCropScreen.kt:965)");
            }
            TextStyle titleMedium = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleMedium();
            TextStyle textStyleM5917copyp1EtxEg = titleMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? titleMedium.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? titleMedium.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? titleMedium.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? titleMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? titleMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? titleMedium.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? titleMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? titleMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? titleMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? titleMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? titleMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? titleMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? titleMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? titleMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? titleMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? titleMedium.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? titleMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? titleMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? titleMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? titleMedium.platformStyle : null, (16645977 & 1048576) != 0 ? titleMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? titleMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? titleMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? titleMedium.paragraphStyle.getTextMotion() : null);
            long j5 = a.f15990o;
            Modifier.Companion companion = Modifier.Companion;
            float f5 = 12;
            TextKt.m2432Text4IGK_g("Crop Margins (mm)", PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f5), 7, null), j5, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, textStyleM5917copyp1EtxEg, composer, 438, 0, 65528);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Composer composer2 = composer;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(8)), Alignment.Companion.getTop(), composer2, 6);
            int i5 = 0;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            O3.a constructor = companion2.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
            e eVarG = p035i0.a.g(companion2, composerM3407constructorimpl, measurePolicyRowMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Object objJ = b.j(1987902508, composer2, 1987887818);
            Composer.Companion companion3 = Composer.Companion;
            Object empty = companion3.getEmpty();
            MutableState mutableState = this.f14321o;
            if (objJ == empty) {
                objJ = new O6(4, mutableState);
                composer2.updateRememberedValue(objJ);
            }
            composer2.endReplaceGroup();
            Icons.Outlined outlined = Icons.Outlined.INSTANCE;
            m mVar = new m("Top", (O3.a) objJ, VerticalAlignTopKt.getVerticalAlignTop(outlined));
            composer2.startReplaceGroup(1987890957);
            Object objRememberedValue = composer2.rememberedValue();
            Object empty2 = companion3.getEmpty();
            MutableState mutableState2 = this.p;
            if (objRememberedValue == empty2) {
                objRememberedValue = new O6(5, mutableState2);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceGroup();
            m mVar2 = new m("Bottom", (O3.a) objRememberedValue, VerticalAlignBottomKt.getVerticalAlignBottom(outlined));
            composer2.startReplaceGroup(1987894219);
            Object objRememberedValue2 = composer2.rememberedValue();
            Object empty3 = companion3.getEmpty();
            MutableState mutableState3 = this.q;
            if (objRememberedValue2 == empty3) {
                objRememberedValue2 = new O6(6, mutableState3);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceGroup();
            Icons.AutoMirrored.Outlined outlined2 = Icons.AutoMirrored.Outlined.INSTANCE;
            m mVar3 = new m("Left", (O3.a) objRememberedValue2, ArrowBackKt.getArrowBack(outlined2));
            composer2.startReplaceGroup(1987897548);
            Object objRememberedValue3 = composer2.rememberedValue();
            Object empty4 = companion3.getEmpty();
            MutableState mutableState4 = this.f14322r;
            if (objRememberedValue3 == empty4) {
                objRememberedValue3 = new O6(7, mutableState4);
                composer2.updateRememberedValue(objRememberedValue3);
            }
            composer2.endReplaceGroup();
            for (m mVar4 : v.S(mVar, mVar2, mVar3, new m("Right", (O3.a) objRememberedValue3, ArrowForwardKt.getArrowForward(outlined2)))) {
                String str = (String) mVar4.f152o;
                O3.a aVar = (O3.a) mVar4.p;
                ImageVector imageVector = (ImageVector) mVar4.q;
                Modifier.Companion companion4 = Modifier.Companion;
                MutableState mutableState5 = mutableState3;
                MutableState mutableState6 = mutableState2;
                Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion4, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, i5);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, i5);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierWeight$default);
                ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
                O3.a constructor2 = companion5.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer2);
                e eVarG2 = p035i0.a.g(companion5, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
                if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                String str2 = (String) aVar.invoke();
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, KeyboardType.Companion.m6125getNumberPjHm6EE(), 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 123, (AbstractC2168g) null);
                OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
                long j6 = a.f15978a;
                long j7 = a.f15991r;
                long j8 = a.f15990o;
                Color.Companion companion6 = Color.Companion;
                MutableState mutableState7 = mutableState;
                MutableState mutableState8 = mutableState4;
                Composer composer3 = composer2;
                TextFieldColors textFieldColorsM2076colors0hiis_0 = outlinedTextFieldDefaults.m2076colors0hiis_0(j8, j8, 0L, 0L, Color.m3926copywmQWz5c$default(companion6.m3964getWhite0d7_KjU(), 0.02f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion6.m3964getWhite0d7_KjU(), 0.02f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, null, j6, j7, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer3, 221238, 432, 0, 0, 3072, 2147477452, 4095);
                RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f5));
                composer3.startReplaceGroup(-439791804);
                boolean zChanged = composer3.changed(str);
                Object objRememberedValue4 = composer3.rememberedValue();
                if (zChanged || objRememberedValue4 == Composer.Companion.getEmpty()) {
                    objRememberedValue4 = new C2476g4(str, mutableState7, mutableState6, mutableState5, mutableState8, 1);
                    composer3.updateRememberedValue(objRememberedValue4);
                }
                composer3.endReplaceGroup();
                OutlinedTextFieldKt.OutlinedTextField(str2, (c) objRememberedValue4, modifierFillMaxWidth$default2, false, false, (TextStyle) null, (e) ComposableLambdaKt.rememberComposableLambda(-1911333324, true, new A(str, 1), composer3, 54), (e) null, (e) ComposableLambdaKt.rememberComposableLambda(781499250, true, new P7(imageVector), composer3, 54), (e) null, (e) null, (e) null, (e) null, false, (VisualTransformation) null, keyboardOptions, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM955RoundedCornerShape0680j_4, textFieldColorsM2076colors0hiis_0, composer3, 102236544, 196608, 0, 2064056);
                composer3.endNode();
                composer2 = composer3;
                mutableState3 = mutableState5;
                mutableState2 = mutableState6;
                mutableState = mutableState7;
                i5 = 0;
                mutableState4 = mutableState8;
            }
            Composer composer4 = composer2;
            composer4.endReplaceGroup();
            composer4.endNode();
            if (b.q(32, Modifier.Companion, composer4, 6)) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
