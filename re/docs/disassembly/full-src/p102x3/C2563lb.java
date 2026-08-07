package p102x3;

import O3.a;
import O3.c;
import O3.e;
import O3.f;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.CheckCircleKt;
import androidx.compose.material.icons.outlined.PhoneKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconKt;
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
import androidx.compose.ui.graphics.ColorKt;
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

/* JADX INFO: renamed from: x3.lb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2563lb implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MutableState f15292o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f15293r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f15294s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ MutableState u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MutableState f15295v;

    public C2563lb(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, a aVar, a aVar2, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6) {
        this.f15292o = mutableState;
        this.p = mutableState2;
        this.q = mutableState3;
        this.f15293r = aVar;
        this.f15294s = aVar2;
        this.t = mutableState4;
        this.u = mutableState5;
        this.f15295v = mutableState6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MutableState mutableState;
        int i5;
        MutableState mutableState2;
        Composer composer;
        Composer composer2;
        MutableState mutableState3;
        BoxScope GlassCard = (BoxScope) obj;
        Composer composer3 = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(GlassCard, "$this$GlassCard");
        if ((iIntValue & 17) == 16 && composer3.getSkipping()) {
            composer3.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(444165629, iIntValue, -1, "com.notescrafter.ui.screens.PrintAddressesScreen.<anonymous>.<anonymous> (PrintAddressesScreen.kt:228)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f5 = 20;
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(companion, Dp.m6403constructorimpl(f5));
            Arrangement arrangement = Arrangement.INSTANCE;
            float f6 = 16;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_4 = arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f6));
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_4, companion2.getStart(), composer3, 6);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM668padding3ABfNKs);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            a constructor = companion3.getConstructor();
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
            e eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MeasurePolicy measurePolicyI = androidx.compose.foundation.text.modifiers.a.i(8, arrangement, companion2.getCenterVertically(), composer3, 54);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, companion);
            a constructor2 = companion3.getConstructor();
            if (composer3.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor2);
            } else {
                composer3.useNode();
            }
            Composer composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer3);
            e eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyI, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Icons.Outlined outlined = Icons.Outlined.INSTANCE;
            IconKt.m1877Iconww6aTOc(PhoneKt.getPhone(outlined), (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f5)), p107y3.a.f15980c, composer3, 3504, 0);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer3, 0);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, companion);
            a constructor3 = companion3.getConstructor();
            if (composer3.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor3);
            } else {
                composer3.useNode();
            }
            Composer composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer3);
            e eVarG3 = p035i0.a.g(companion3, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl3, currentCompositionLocalMap3);
            if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
            }
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i6 = MaterialTheme.$stable;
            TextStyle titleMedium = materialTheme.getTypography(composer3, i6).getTitleMedium();
            FontWeight.Companion companion4 = FontWeight.Companion;
            FontWeight bold = companion4.getBold();
            Color.Companion companion5 = Color.Companion;
            TextKt.m2432Text4IGK_g("Contact Information", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, titleMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? titleMedium.spanStyle.m5841getColor0d7_KjU() : companion5.m3964getWhite0d7_KjU(), (16645977 & 2) != 0 ? titleMedium.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? titleMedium.spanStyle.getFontWeight() : bold, (16645977 & 8) != 0 ? titleMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? titleMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? titleMedium.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? titleMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? titleMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? titleMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? titleMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? titleMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? titleMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? titleMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? titleMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? titleMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? titleMedium.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? titleMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? titleMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? titleMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? titleMedium.platformStyle : null, (16645977 & 1048576) != 0 ? titleMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? titleMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? titleMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? titleMedium.paragraphStyle.getTextMotion() : null), composer3, 6, 0, 65534);
            MutableState mutableState4 = this.f15292o;
            String str = ((Boolean) mutableState4.getValue()).booleanValue() ? "PRIMARY CONTACT VERIFIED" : "VERIFICATION REQUIRED";
            TextStyle labelSmall = materialTheme.getTypography(composer3, i6).getLabelSmall();
            TextKt.m2432Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall.spanStyle.m5841getColor0d7_KjU() : ((Boolean) mutableState4.getValue()).booleanValue() ? ColorKt.Color(4279286145L) : ColorKt.Color(4294688548L), (16645977 & 2) != 0 ? labelSmall.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(8), (16645977 & 4) != 0 ? labelSmall.spanStyle.getFontWeight() : companion4.getBlack(), (16645977 & 8) != 0 ? labelSmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? labelSmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall.paragraphStyle.getTextMotion() : null), composer3, 0, 0, 65534);
            composer3.endNode();
            composer3.endNode();
            if (((Boolean) mutableState4.getValue()).booleanValue()) {
                composer3.startReplaceGroup(1231662109);
                float f7 = 1;
                Modifier modifierM668padding3ABfNKs2 = PaddingKt.m668padding3ABfNKs(b.e(f6, b.f(f6, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.02f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f7), Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.06f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(14));
                MeasurePolicy measurePolicyI2 = androidx.compose.foundation.text.modifiers.a.i(12, arrangement, companion2.getCenterVertically(), composer3, 54);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer3, modifierM668padding3ABfNKs2);
                a constructor4 = companion3.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor4);
                } else {
                    composer3.useNode();
                }
                Composer composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer3);
                e eVarG4 = p035i0.a.g(companion3, composerM3407constructorimpl4, measurePolicyI2, composerM3407constructorimpl4, currentCompositionLocalMap4);
                if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
                }
                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
                float f8 = 10;
                Modifier modifierE = b.e(f8, b.f(f8, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(40)), Color.m3926copywmQWz5c$default(ColorKt.Color(4279286145L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f7), Color.m3926copywmQWz5c$default(ColorKt.Color(4279286145L), 0.2f, 0.0f, 0.0f, 0.0f, 14, null));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer3, modifierE);
                a constructor5 = companion3.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor5);
                } else {
                    composer3.useNode();
                }
                Composer composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer3);
                e eVarG5 = p035i0.a.g(companion3, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl5, currentCompositionLocalMap5);
                if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
                }
                Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier5, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                IconKt.m1877Iconww6aTOc(CheckCircleKt.getCheckCircle(outlined), (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f5)), ColorKt.Color(4281652121L), composer3, 3504, 0);
                composer3.endNode();
                composer2 = composer3;
                Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 0);
                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer2, modifierWeight$default);
                a constructor6 = companion3.getConstructor();
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
                e eVarG6 = p035i0.a.g(companion3, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy3, composerM3407constructorimpl6, currentCompositionLocalMap6);
                if (composerM3407constructorimpl6.getInserting() || !o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG6);
                }
                Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier6, companion3.getSetModifier());
                TextKt.m2432Text4IGK_g(androidx.compose.foundation.text.modifiers.a.y("+91 ", (String) this.p.getValue()), (Modifier) null, companion5.m3964getWhite0d7_KjU(), TextUnitKt.getSp(18), (FontStyle) null, companion4.getBlack(), (FontFamily) null, TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer2, 12782976, 0, 130898);
                TextKt.m2432Text4IGK_g("Primary delivery contact", (Modifier) null, Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, (FontStyle) null, companion4.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer2, i6).getLabelSmall(), composer2, 196998, 0, 65498);
                composer2.endNode();
                composer2.endNode();
                composer2.endReplaceGroup();
            } else {
                composer3.startReplaceGroup(1233938687);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                float f9 = 12;
                MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f9)), companion2.getStart(), composer3, 6);
                int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap7 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
                a constructor7 = companion3.getConstructor();
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
                e eVarG7 = p035i0.a.g(companion3, composerM3407constructorimpl7, measurePolicyColumnMeasurePolicy4, composerM3407constructorimpl7, currentCompositionLocalMap7);
                if (composerM3407constructorimpl7.getInserting() || !o.b(composerM3407constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG7);
                }
                Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier7, companion3.getSetModifier());
                MutableState mutableState5 = this.q;
                String str2 = ((Boolean) mutableState5.getValue()).booleanValue() ? "ENTER WHATSAPP OTP TOKEN" : "ENTER MOBILE NUMBER";
                TextStyle labelSmall2 = materialTheme.getTypography(composer3, i6).getLabelSmall();
                TextKt.m2432Text4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall2.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall2.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? labelSmall2.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall2.spanStyle.getFontWeight() : companion4.getBlack(), (16645977 & 8) != 0 ? labelSmall2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall2.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1.5d), (16645977 & Fields.RotationX) != 0 ? labelSmall2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall2.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall2.paragraphStyle.getTextMotion() : null), composer3, 0, 0, 65534);
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(10)), companion2.getCenterVertically(), composer3, 54);
                int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap8 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default2);
                a constructor8 = companion3.getConstructor();
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
                e eVarG8 = p035i0.a.g(companion3, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy, composerM3407constructorimpl8, currentCompositionLocalMap8);
                if (composerM3407constructorimpl8.getInserting() || !o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                    p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG8);
                }
                Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier8, companion3.getSetModifier());
                boolean zBooleanValue = ((Boolean) mutableState5.getValue()).booleanValue();
                MutableState mutableState6 = this.t;
                MutableState mutableState7 = this.u;
                if (zBooleanValue) {
                    mutableState = mutableState6;
                    boolean z3 = false;
                    i5 = 10;
                    composer3.startReplaceGroup(-431810720);
                    MutableState mutableState8 = this.f15295v;
                    String str3 = (String) mutableState8.getValue();
                    KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, KeyboardType.Companion.m6125getNumberPjHm6EE(), 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 123, (AbstractC2168g) null);
                    OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
                    long jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(companion5.m3953getBlack0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
                    long jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(companion5.m3953getBlack0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
                    long j5 = p107y3.a.f15978a;
                    TextFieldColors textFieldColorsM2076colors0hiis_0 = outlinedTextFieldDefaults.m2076colors0hiis_0(0L, 0L, 0L, 0L, jM3926copywmQWz5c$default, jM3926copywmQWz5c$default2, 0L, 0L, 0L, 0L, null, Color.m3926copywmQWz5c$default(j5, 0.7f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer3, 221184, 432, 0, 0, 3072, 2147477455, 4095);
                    RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9));
                    Modifier modifierWeight$default2 = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
                    composer3.startReplaceGroup(124621022);
                    Object objRememberedValue = composer3.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        mutableState2 = mutableState8;
                        objRememberedValue = new C2435db(2, mutableState2);
                        composer3.updateRememberedValue(objRememberedValue);
                    } else {
                        mutableState2 = mutableState8;
                    }
                    composer3.endReplaceGroup();
                    composer = composer3;
                    OutlinedTextFieldKt.OutlinedTextField(str3, (c) objRememberedValue, modifierWeight$default2, false, false, (TextStyle) null, (e) null, (e) AbstractC2649r2.f15475d, (e) null, (e) null, (e) null, (e) null, (e) null, false, (VisualTransformation) null, keyboardOptions, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM955RoundedCornerShape0680j_4, textFieldColorsM2076colors0hiis_0, composer, 12582960, 12779520, 0, 1933176);
                    if (((String) mutableState2.getValue()).length() == 6 && !((Boolean) mutableState7.getValue()).booleanValue()) {
                        z3 = true;
                    }
                    ButtonKt.Button(this.f15294s, SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(50)), z3, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9)), ButtonDefaults.INSTANCE.m1520buttonColorsro_MJ88(j5, 0L, 0L, 0L, composer, (ButtonDefaults.$stable << 12) | 6, 14), null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1502350203, true, new C2547kb(mutableState7), composer, 54), composer, 805306416, 480);
                    composer.endReplaceGroup();
                } else {
                    composer3.startReplaceGroup(-433981712);
                    String str4 = (String) mutableState6.getValue();
                    KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, (Boolean) null, KeyboardType.Companion.m6128getPhonePjHm6EE(), 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 123, (AbstractC2168g) null);
                    boolean z4 = false;
                    TextFieldColors textFieldColorsM2076colors0hiis_1 = OutlinedTextFieldDefaults.INSTANCE.m2076colors0hiis_0(0L, 0L, 0L, 0L, Color.m3926copywmQWz5c$default(companion5.m3953getBlack0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion5.m3953getBlack0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, null, Color.m3926copywmQWz5c$default(p107y3.a.f15978a, 0.7f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer3, 221184, 432, 0, 0, 3072, 2147477455, 4095);
                    RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_5 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9));
                    Modifier modifierWeight$default3 = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
                    composer3.startReplaceGroup(124550945);
                    Object objRememberedValue2 = composer3.rememberedValue();
                    if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                        mutableState3 = mutableState6;
                        objRememberedValue2 = new C2435db(1, mutableState3);
                        composer3.updateRememberedValue(objRememberedValue2);
                    } else {
                        mutableState3 = mutableState6;
                    }
                    composer3.endReplaceGroup();
                    mutableState = mutableState3;
                    composer = composer3;
                    OutlinedTextFieldKt.OutlinedTextField(str4, (c) objRememberedValue2, modifierWeight$default3, false, false, (TextStyle) null, (e) null, (e) AbstractC2649r2.f15473b, (e) null, (e) null, (e) AbstractC2649r2.f15474c, (e) null, (e) null, false, (VisualTransformation) null, keyboardOptions2, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM955RoundedCornerShape0680j_5, textFieldColorsM2076colors0hiis_1, composer, 12582960, 12779526, 0, 1932152);
                    if (((String) mutableState.getValue()).length() == 10 && !((Boolean) mutableState7.getValue()).booleanValue()) {
                        z4 = true;
                    }
                    i5 = 10;
                    ButtonKt.Button(this.f15293r, SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(50)), z4, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9)), ButtonDefaults.INSTANCE.m1520buttonColorsro_MJ88(companion5.m3964getWhite0d7_KjU(), 0L, 0L, 0L, composer, (ButtonDefaults.$stable << 12) | 6, 14), null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-163470212, true, new C2531jb(mutableState7), composer, 54), composer, 805306416, 480);
                    composer.endReplaceGroup();
                }
                composer.endNode();
                String strZ = ((Boolean) mutableState5.getValue()).booleanValue() ? androidx.compose.foundation.text.modifiers.a.z("Please check your WhatsApp on +91 ", (String) mutableState.getValue(), " for the 6-digit verification code.") : "Verification ensures secure checkouts and delivery updates via WhatsApp.";
                composer2 = composer;
                TextStyle bodySmall = materialTheme.getTypography(composer2, i6).getBodySmall();
                TextKt.m2432Text4IGK_g(strZ, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? bodySmall.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(i5), (16645977 & 4) != 0 ? bodySmall.spanStyle.getFontWeight() : companion4.getNormal(), (16645977 & 8) != 0 ? bodySmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall.paragraphStyle.getTextMotion() : null), composer2, 0, 0, 65534);
                composer2.endNode();
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
