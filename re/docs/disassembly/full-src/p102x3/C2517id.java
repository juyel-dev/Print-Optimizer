package p102x3;

import B3.h;
import C3.v;
import O3.a;
import O3.c;
import O3.e;
import O3.f;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.LocalShippingKt;
import androidx.compose.material.icons.outlined.SecurityKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.vector.ImageVector;
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
import com.notescrafter.PrintOrderViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import p087u3.j;
import p087u3.m;

/* JADX INFO: renamed from: x3.id, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2517id implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ State f15195o;
    public final /* synthetic */ PrintOrderViewModel p;
    public final /* synthetic */ String q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ double f15196r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ State f15197s;
    public final /* synthetic */ State t;
    public final /* synthetic */ State u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ double f15198v;

    public C2517id(State state, PrintOrderViewModel printOrderViewModel, String str, double d4, State state2, State state3, State state4, double d5) {
        this.f15195o = state;
        this.p = printOrderViewModel;
        this.q = str;
        this.f15196r = d4;
        this.f15197s = state2;
        this.t = state3;
        this.u = state4;
        this.f15198v = d5;
    }

    /* JADX WARN: Code duplicated, block: B:192:0x049c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x026c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0278  */
    /* JADX WARN: Code duplicated, block: B:60:0x027c  */
    /* JADX WARN: Code duplicated, block: B:65:0x029b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0348  */
    /* JADX WARN: Code duplicated, block: B:69:0x034b  */
    /* JADX WARN: Code duplicated, block: B:72:0x047d  */
    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier.Companion companion;
        int i5;
        int i6;
        PrintOrderViewModel printOrderViewModel;
        int currentCompositeKeyHash;
        a constructor;
        Composer composerM3407constructorimpl;
        e eVarG;
        Color.Companion companion2;
        int i7;
        String str;
        BoxScope GlassCard = (BoxScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(GlassCard, "$this$GlassCard");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-615190135, iIntValue, -1, "com.notescrafter.ui.screens.PrintOrderShippingScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:3041)");
            }
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(companion3, Dp.m6403constructorimpl(20));
            Arrangement arrangement = Arrangement.INSTANCE;
            float f5 = 14;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_4 = arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f5));
            Alignment.Companion companion4 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_4, companion4.getStart(), composer, 6);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM668padding3ABfNKs);
            ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
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
            e eVarG2 = p035i0.a.g(companion5, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier, companion5.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextStyle labelSmall = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall();
            TextKt.m2432Text4IGK_g("ORDER SUMMARY", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall.spanStyle.m5841getColor0d7_KjU() : p107y3.a.g(), (16645977 & 2) != 0 ? labelSmall.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(9), (16645977 & 4) != 0 ? labelSmall.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? labelSmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? labelSmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall.paragraphStyle.getTextMotion() : null), composer, 6, 0, 65534);
            float f6 = 8;
            Composer composer2 = composer;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f6)), companion4.getStart(), composer2, 6);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion3);
            a constructor3 = companion5.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            Composer composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer2);
            e eVarG3 = p035i0.a.g(companion5, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl3, currentCompositionLocalMap2);
            if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
            }
            p035i0.a.w(companion5, composerM3407constructorimpl3, modifierMaterializeModifier2, composer2, -815669592);
            State state = this.f15195o;
            Iterator it = ((List) state.getValue()).iterator();
            int i8 = 0;
            while (true) {
                boolean zHasNext = it.hasNext();
                PrintOrderViewModel printOrderViewModel2 = this.p;
                if (!zHasNext) {
                    float f7 = f6;
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    Color.Companion companion6 = Color.Companion;
                    float f8 = 1;
                    DividerKt.m1794HorizontalDivider9IZ8Weo(null, Dp.m6403constructorimpl(f8), Color.m3926copywmQWz5c$default(companion6.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), composer2, 432, 1);
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_5 = arrangement2.m548spacedBy0680j_4(Dp.m6403constructorimpl(f7));
                    Modifier.Companion companion7 = Modifier.Companion;
                    Alignment.Companion companion8 = Alignment.Companion;
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_5, companion8.getStart(), composer2, 6);
                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, companion7);
                    ComposeUiNode.Companion companion9 = ComposeUiNode.Companion;
                    a constructor4 = companion9.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor4);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer2);
                    e eVarG4 = p035i0.a.g(companion9, composerM3407constructorimpl4, measurePolicyColumnMeasurePolicy3, composerM3407constructorimpl4, currentCompositionLocalMap3);
                    if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier3, companion9.getSetModifier());
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion8.getTop(), composer2, 6);
                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
                    a constructor5 = companion9.getConstructor();
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
                    e eVarG5 = p035i0.a.g(companion9, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy, composerM3407constructorimpl5, currentCompositionLocalMap4);
                    if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier4, companion9.getSetModifier());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    String strK = p035i0.a.k("Subtotal (", ((List) state.getValue()).size(), " items)");
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i9 = MaterialTheme.$stable;
                    TextStyle bodySmall = materialTheme.getTypography(composer2, i9).getBodySmall();
                    Arrangement arrangement3 = arrangement2;
                    Composer composer3 = composer2;
                    TextKt.m2432Text4IGK_g(strK, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall.spanStyle.m5841getColor0d7_KjU() : p107y3.a.g(), (16645977 & 2) != 0 ? bodySmall.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodySmall.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodySmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall.paragraphStyle.getTextMotion() : null), composer3, 0, 0, 65534);
                    String strY = Gd.y(this.f15196r);
                    TextStyle bodySmall2 = materialTheme.getTypography(composer3, i9).getBodySmall();
                    TextKt.m2432Text4IGK_g(strY, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall2.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall2.spanStyle.m5841getColor0d7_KjU() : companion6.m3964getWhite0d7_KjU(), (16645977 & 2) != 0 ? bodySmall2.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodySmall2.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodySmall2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall2.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall2.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall2.paragraphStyle.getTextMotion() : null), composer3, 0, 0, 65534);
                    composer3.endNode();
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement3.getSpaceBetween(), companion8.getCenterVertically(), composer3, 54);
                    int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default2);
                    a constructor6 = companion9.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor6);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer3);
                    e eVarG6 = p035i0.a.g(companion9, composerM3407constructorimpl6, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl6, currentCompositionLocalMap5);
                    if (composerM3407constructorimpl6.getInserting() || !o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG6);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier5, companion9.getSetModifier());
                    TextStyle bodySmall3 = materialTheme.getTypography(composer3, i9).getBodySmall();
                    ComposeUiNode.Companion companion10 = companion9;
                    Composer composer4 = composer3;
                    TextKt.m2432Text4IGK_g("Shipping", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall3.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall3.spanStyle.m5841getColor0d7_KjU() : p107y3.a.g(), (16645977 & 2) != 0 ? bodySmall3.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodySmall3.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodySmall3.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall3.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall3.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall3.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall3.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall3.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall3.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall3.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall3.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall3.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall3.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall3.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall3.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall3.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall3.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall3.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall3.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall3.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall3.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall3.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall3.paragraphStyle.getTextMotion() : null), composer4, 6, 0, 65534);
                    if (Gd.u(this.f15197s).getPostalCode().length() == 6) {
                        composer4.startReplaceGroup(653886648);
                        if (printOrderViewModel2.k() >= 5) {
                            composer4.startReplaceGroup(653942727);
                            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(6)), companion8.getCenterVertically(), composer4, 54);
                            int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                            CompositionLocalMap currentCompositionLocalMap6 = composer4.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer4, companion7);
                            a constructor7 = companion10.getConstructor();
                            if (composer4.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor7);
                            } else {
                                composer4.useNode();
                            }
                            Composer composerM3407constructorimpl7 = Updater.m3407constructorimpl(composer4);
                            e eVarG7 = p035i0.a.g(companion10, composerM3407constructorimpl7, measurePolicyRowMeasurePolicy3, composerM3407constructorimpl7, currentCompositionLocalMap6);
                            if (composerM3407constructorimpl7.getInserting() || !o.b(composerM3407constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                                p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG7);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier6, companion10.getSetModifier());
                            String strY2 = Gd.y(((Number) this.t.getValue()).doubleValue());
                            TextStyle bodySmall4 = materialTheme.getTypography(composer4, i9).getBodySmall();
                            companion10 = companion10;
                            companion = companion7;
                            arrangement3 = arrangement3;
                            composer4 = composer4;
                            TextKt.m2432Text4IGK_g(strY2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall4.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall4.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion6.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? bodySmall4.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodySmall4.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodySmall4.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall4.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall4.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall4.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall4.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall4.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall4.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall4.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall4.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall4.spanStyle.getTextDecoration() : TextDecoration.Companion.getLineThrough(), (16645977 & Fields.Shape) != 0 ? bodySmall4.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall4.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall4.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall4.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall4.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall4.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall4.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall4.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall4.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall4.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall4.paragraphStyle.getTextMotion() : null), composer4, 0, 0, 65534);
                            TextStyle bodySmall5 = materialTheme.getTypography(composer4, i9).getBodySmall();
                            TextKt.m2432Text4IGK_g("FREE", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall5.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall5.spanStyle.m5841getColor0d7_KjU() : p107y3.a.a(), (16645977 & 2) != 0 ? bodySmall5.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodySmall5.spanStyle.getFontWeight() : FontWeight.Companion.getBlack(), (16645977 & 8) != 0 ? bodySmall5.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall5.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall5.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall5.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall5.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall5.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall5.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall5.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall5.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall5.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall5.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall5.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall5.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall5.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall5.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall5.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall5.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall5.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall5.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall5.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall5.paragraphStyle.getTextMotion() : null), composer4, 6, 0, 65534);
                            composer4.endNode();
                            composer4.endReplaceGroup();
                            i6 = i9;
                        } else {
                            companion = companion7;
                            composer4.startReplaceGroup(655278083);
                            String strY3 = Gd.y(((Number) this.u.getValue()).doubleValue());
                            TextStyle bodySmall6 = materialTheme.getTypography(composer4, i9).getBodySmall();
                            i6 = i9;
                            composer4 = composer4;
                            TextKt.m2432Text4IGK_g(strY3, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall6.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall6.spanStyle.m5841getColor0d7_KjU() : companion6.m3964getWhite0d7_KjU(), (16645977 & 2) != 0 ? bodySmall6.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodySmall6.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodySmall6.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall6.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall6.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall6.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall6.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall6.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall6.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall6.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall6.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall6.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall6.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall6.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall6.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall6.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall6.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall6.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall6.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall6.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall6.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall6.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall6.paragraphStyle.getTextMotion() : null), composer4, 0, 0, 65534);
                            composer4.endReplaceGroup();
                        }
                        composer4.endReplaceGroup();
                        i5 = i6;
                    } else {
                        companion = companion7;
                        composer4.startReplaceGroup(655635234);
                        TextStyle bodySmall7 = materialTheme.getTypography(composer4, i9).getBodySmall();
                        i5 = i9;
                        TextKt.m2432Text4IGK_g("Enter pincode", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall7.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall7.spanStyle.m5841getColor0d7_KjU() : p107y3.a.g(), (16645977 & 2) != 0 ? bodySmall7.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodySmall7.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodySmall7.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall7.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall7.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall7.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall7.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall7.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall7.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall7.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall7.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall7.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall7.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall7.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall7.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall7.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall7.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall7.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall7.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall7.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall7.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall7.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall7.paragraphStyle.getTextMotion() : null), composer4, 6, 0, 65534);
                        composer4.endReplaceGroup();
                    }
                    composer4.endNode();
                    Modifier.Companion companion11 = companion;
                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion11, 0.0f, 1, null);
                    Composer composer5 = composer4;
                    MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement3.getSpaceBetween(), companion8.getTop(), composer5, 6);
                    int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer5, modifierFillMaxWidth$default3);
                    a constructor8 = companion10.getConstructor();
                    if (composer5.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor8);
                    } else {
                        composer5.useNode();
                    }
                    Composer composerM3407constructorimpl8 = Updater.m3407constructorimpl(composer5);
                    ComposeUiNode.Companion companion12 = companion10;
                    e eVarG8 = p035i0.a.g(companion12, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy4, composerM3407constructorimpl8, currentCompositionLocalMap7);
                    if (composerM3407constructorimpl8.getInserting() || !o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                        p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG8);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier7, companion12.getSetModifier());
                    int i10 = i5;
                    TextStyle bodySmall8 = materialTheme.getTypography(composer5, i10).getBodySmall();
                    TextKt.m2432Text4IGK_g("Tax", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall8.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall8.spanStyle.m5841getColor0d7_KjU() : p107y3.a.g(), (16645977 & 2) != 0 ? bodySmall8.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodySmall8.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodySmall8.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall8.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall8.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall8.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall8.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall8.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall8.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall8.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall8.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall8.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall8.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall8.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall8.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall8.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall8.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall8.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall8.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall8.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall8.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall8.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall8.paragraphStyle.getTextMotion() : null), composer5, 6, 0, 65534);
                    TextStyle labelSmall2 = materialTheme.getTypography(composer5, i10).getLabelSmall();
                    TextKt.m2432Text4IGK_g("Calculated at checkout", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall2.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall2.spanStyle.m5841getColor0d7_KjU() : p107y3.a.g(), (16645977 & 2) != 0 ? labelSmall2.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall2.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? labelSmall2.spanStyle.m5843getFontStyle4Lr2A7w() : FontStyle.m5997boximpl(FontStyle.Companion.m6006getItalic_LCdwA()), (16645977 & 16) != 0 ? labelSmall2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall2.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? labelSmall2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall2.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall2.paragraphStyle.getTextMotion() : null), composer5, 6, 0, 65534);
                    composer5.endNode();
                    composer5.endNode();
                    DividerKt.m1794HorizontalDivider9IZ8Weo(null, Dp.m6403constructorimpl(f8), Color.m3926copywmQWz5c$default(companion6.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), composer5, 432, 1);
                    Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion11, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(arrangement3.getSpaceBetween(), companion8.getCenterVertically(), composer5, 54);
                    int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                    CompositionLocalMap currentCompositionLocalMap8 = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer5, modifierFillMaxWidth$default4);
                    a constructor9 = companion12.getConstructor();
                    if (composer5.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor9);
                    } else {
                        composer5.useNode();
                    }
                    Composer composerM3407constructorimpl9 = Updater.m3407constructorimpl(composer5);
                    e eVarG9 = p035i0.a.g(companion12, composerM3407constructorimpl9, measurePolicyRowMeasurePolicy5, composerM3407constructorimpl9, currentCompositionLocalMap8);
                    if (composerM3407constructorimpl9.getInserting() || !o.b(composerM3407constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                        p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG9);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier8, companion12.getSetModifier());
                    TextStyle bodySmall9 = materialTheme.getTypography(composer5, i10).getBodySmall();
                    long jG = p107y3.a.g();
                    FontWeight.Companion companion13 = FontWeight.Companion;
                    TextKt.m2432Text4IGK_g("Estimated Total", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall9.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall9.spanStyle.m5841getColor0d7_KjU() : jG, (16645977 & 2) != 0 ? bodySmall9.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodySmall9.spanStyle.getFontWeight() : companion13.getSemiBold(), (16645977 & 8) != 0 ? bodySmall9.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall9.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall9.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall9.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall9.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall9.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall9.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall9.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall9.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall9.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall9.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall9.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall9.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall9.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall9.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall9.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall9.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall9.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall9.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall9.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall9.paragraphStyle.getTextMotion() : null), composer5, 6, 0, 65534);
                    String strY4 = Gd.y(this.f15198v);
                    TextStyle titleMedium = materialTheme.getTypography(composer5, i10).getTitleMedium();
                    TextKt.m2432Text4IGK_g(strY4, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, titleMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? titleMedium.spanStyle.m5841getColor0d7_KjU() : companion6.m3964getWhite0d7_KjU(), (16645977 & 2) != 0 ? titleMedium.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? titleMedium.spanStyle.getFontWeight() : companion13.getExtraBold(), (16645977 & 8) != 0 ? titleMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? titleMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? titleMedium.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? titleMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? titleMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? titleMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? titleMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? titleMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? titleMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? titleMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? titleMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? titleMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? titleMedium.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? titleMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? titleMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? titleMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? titleMedium.platformStyle : null, (16645977 & 1048576) != 0 ? titleMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? titleMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? titleMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? titleMedium.paragraphStyle.getTextMotion() : null), composer5, 0, 0, 65534);
                    composer5.endNode();
                    MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(6)), companion8.getStart(), composer5, 6);
                    int currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                    CompositionLocalMap currentCompositionLocalMap9 = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer5, companion11);
                    a constructor10 = companion12.getConstructor();
                    if (composer5.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor10);
                    } else {
                        composer5.useNode();
                    }
                    Composer composerM3407constructorimpl10 = Updater.m3407constructorimpl(composer5);
                    e eVarG10 = p035i0.a.g(companion12, composerM3407constructorimpl10, measurePolicyColumnMeasurePolicy4, composerM3407constructorimpl10, currentCompositionLocalMap9);
                    if (composerM3407constructorimpl10.getInserting() || !o.b(composerM3407constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                        p035i0.a.t(currentCompositeKeyHash10, composerM3407constructorimpl10, currentCompositeKeyHash10, eVarG10);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier9, companion12.getSetModifier());
                    composer5.startReplaceGroup(-815419044);
                    Icons.Outlined outlined = Icons.Outlined.INSTANCE;
                    for (h hVar : v.S(new h(SecurityKt.getSecurity(outlined), "256-bit SSL encryption"), new h(LocalShippingKt.getLocalShipping(outlined), "Est. delivery in 3–7 business days"))) {
                        ImageVector imageVector = (ImageVector) hVar.a();
                        String str2 = (String) hVar.b();
                        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_6 = Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(f7));
                        Modifier.Companion companion14 = Modifier.Companion;
                        MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_6, centerVertically, composer5, 54);
                        int currentCompositeKeyHash11 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                        CompositionLocalMap currentCompositionLocalMap10 = composer5.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer5, companion14);
                        ComposeUiNode.Companion companion15 = ComposeUiNode.Companion;
                        a constructor11 = companion15.getConstructor();
                        if (composer5.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer5.startReusableNode();
                        if (composer5.getInserting()) {
                            composer5.createNode(constructor11);
                        } else {
                            composer5.useNode();
                        }
                        Composer composerM3407constructorimpl11 = Updater.m3407constructorimpl(composer5);
                        e eVarG11 = p035i0.a.g(companion15, composerM3407constructorimpl11, measurePolicyRowMeasurePolicy6, composerM3407constructorimpl11, currentCompositionLocalMap10);
                        if (composerM3407constructorimpl11.getInserting() || !o.b(composerM3407constructorimpl11.rememberedValue(), Integer.valueOf(currentCompositeKeyHash11))) {
                            p035i0.a.t(currentCompositeKeyHash11, composerM3407constructorimpl11, currentCompositeKeyHash11, eVarG11);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl11, modifierMaterializeModifier10, companion15.getSetModifier());
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        IconKt.m1877Iconww6aTOc(imageVector, (String) null, SizeKt.m713size3ABfNKs(companion14, Dp.m6403constructorimpl(f5)), p107y3.a.g(), composer5, 3504, 0);
                        TextStyle labelSmall3 = MaterialTheme.INSTANCE.getTypography(composer5, MaterialTheme.$stable).getLabelSmall();
                        TextKt.m2432Text4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall3.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall3.spanStyle.m5841getColor0d7_KjU() : p107y3.a.g(), (16645977 & 2) != 0 ? labelSmall3.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall3.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? labelSmall3.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall3.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall3.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall3.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall3.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? labelSmall3.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall3.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall3.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall3.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall3.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall3.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall3.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall3.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall3.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall3.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall3.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall3.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall3.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall3.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall3.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall3.paragraphStyle.getTextMotion() : null), composer5, 0, 0, 65534);
                        composer5.endNode();
                    }
                    composer5.endReplaceGroup();
                    composer5.endNode();
                    composer5.endNode();
                    if (!ComposerKt.isTraceInProgress()) {
                        break;
                    }
                    ComposerKt.traceEventEnd();
                    break;
                }
                Object next = it.next();
                int i11 = i8 + 1;
                if (i8 < 0) {
                    v.X();
                    throw null;
                }
                m mVar = (m) next;
                Modifier.Companion companion16 = Modifier.Companion;
                Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(companion16, 0.0f, 1, null);
                Arrangement arrangement4 = Arrangement.INSTANCE;
                Arrangement.HorizontalOrVertical spaceBetween = arrangement4.getSpaceBetween();
                Alignment.Companion companion17 = Alignment.Companion;
                MeasurePolicy measurePolicyRowMeasurePolicy7 = RowKt.rowMeasurePolicy(spaceBetween, companion17.getCenterVertically(), composer2, 54);
                int currentCompositeKeyHash12 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap11 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default5);
                ComposeUiNode.Companion companion18 = ComposeUiNode.Companion;
                Iterator it2 = it;
                a constructor12 = companion18.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor12);
                } else {
                    composer2.useNode();
                }
                Composer composerM3407constructorimpl12 = Updater.m3407constructorimpl(composer2);
                e eVarG12 = p035i0.a.g(companion18, composerM3407constructorimpl12, measurePolicyRowMeasurePolicy7, composerM3407constructorimpl12, currentCompositionLocalMap11);
                if (composerM3407constructorimpl12.getInserting()) {
                    printOrderViewModel = printOrderViewModel2;
                } else {
                    printOrderViewModel = printOrderViewModel2;
                    if (!o.b(composerM3407constructorimpl12.rememberedValue(), Integer.valueOf(currentCompositeKeyHash12))) {
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl12, modifierMaterializeModifier11, companion18.getSetModifier());
                    Modifier modifierWeight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, companion16, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(arrangement4.getTop(), companion17.getStart(), composer2, 0);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap12 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier12 = ComposedModifierKt.materializeModifier(composer2, modifierWeight$default);
                    constructor = companion18.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
                    eVarG = p035i0.a.g(companion18, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy5, composerM3407constructorimpl, currentCompositionLocalMap12);
                    if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier12, companion18.getSetModifier());
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    String name = mVar.getName();
                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                    int i12 = MaterialTheme.$stable;
                    TextStyle bodySmall10 = materialTheme2.getTypography(composer2, i12).getBodySmall();
                    companion2 = Color.Companion;
                    long jM3964getWhite0d7_KjU = companion2.m3964getWhite0d7_KjU();
                    FontWeight.Companion companion19 = FontWeight.Companion;
                    TextStyle textStyleM5917copyp1EtxEg = bodySmall10.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall10.spanStyle.m5841getColor0d7_KjU() : jM3964getWhite0d7_KjU, (16645977 & 2) != 0 ? bodySmall10.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodySmall10.spanStyle.getFontWeight() : companion19.getSemiBold(), (16645977 & 8) != 0 ? bodySmall10.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall10.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall10.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall10.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall10.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall10.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall10.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall10.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall10.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall10.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall10.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall10.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall10.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall10.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall10.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall10.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall10.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall10.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall10.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall10.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall10.paragraphStyle.getTextMotion() : null);
                    PrintOrderViewModel printOrderViewModel3 = printOrderViewModel;
                    i7 = i8;
                    Composer composer6 = composer2;
                    float f9 = f6;
                    TextKt.m2432Text4IGK_g(name, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (c) null, textStyleM5917copyp1EtxEg, composer6, 0, 3072, 57342);
                    int copies = mVar.getCopies();
                    int pages = mVar.getPages();
                    if (mVar.getColor() == j.COLOR) {
                        str = "Color";
                    } else {
                        str = "B&W";
                    }
                    String str3 = copies + "× · " + pages + "p · " + str + " · " + mVar.getSize() + " · " + mVar.getBinding();
                    TextStyle labelSmall4 = materialTheme2.getTypography(composer6, i12).getLabelSmall();
                    TextKt.m2432Text4IGK_g(str3, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall4.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall4.spanStyle.m5841getColor0d7_KjU() : p107y3.a.g(), (16645977 & 2) != 0 ? labelSmall4.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(10), (16645977 & 4) != 0 ? labelSmall4.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? labelSmall4.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall4.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall4.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall4.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall4.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? labelSmall4.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall4.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall4.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall4.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall4.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall4.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall4.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall4.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall4.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall4.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall4.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall4.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall4.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall4.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall4.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall4.paragraphStyle.getTextMotion() : null), composer6, 0, 0, 65534);
                    composer6.endNode();
                    String strY5 = Gd.y(printOrderViewModel3.l(mVar, this.q));
                    TextStyle bodySmall11 = materialTheme2.getTypography(composer6, i12).getBodySmall();
                    TextKt.m2432Text4IGK_g(strY5, PaddingKt.m672paddingqDBjuR0$default(companion16, Dp.m6403constructorimpl(12), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall11.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall11.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? bodySmall11.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodySmall11.spanStyle.getFontWeight() : companion19.getBold(), (16645977 & 8) != 0 ? bodySmall11.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall11.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall11.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall11.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall11.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall11.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall11.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall11.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall11.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall11.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall11.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall11.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall11.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall11.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall11.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall11.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall11.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall11.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall11.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall11.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall11.paragraphStyle.getTextMotion() : null), composer6, 48, 0, 65532);
                    composer6.endNode();
                    composer2 = composer6;
                    composer2.startReplaceGroup(-815603375);
                    if (i7 < ((List) state.getValue()).size() - 1) {
                        DividerKt.m1794HorizontalDivider9IZ8Weo(null, Dp.m6403constructorimpl(1), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.06f, 0.0f, 0.0f, 0.0f, 14, null), composer2, 432, 1);
                    }
                    composer2.endReplaceGroup();
                    it = it2;
                    i8 = i11;
                    f6 = f9;
                }
                p035i0.a.t(currentCompositeKeyHash12, composerM3407constructorimpl12, currentCompositeKeyHash12, eVarG12);
                Updater.m3414setimpl(composerM3407constructorimpl12, modifierMaterializeModifier11, companion18.getSetModifier());
                Modifier modifierWeight$default2 = RowScope.weight$default(RowScopeInstance.INSTANCE, companion16, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(arrangement4.getTop(), companion17.getStart(), composer2, 0);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap13 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier13 = ComposedModifierKt.materializeModifier(composer2, modifierWeight$default2);
                constructor = companion18.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
                eVarG = p035i0.a.g(companion18, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy6, composerM3407constructorimpl, currentCompositionLocalMap13);
                if (composerM3407constructorimpl.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                } else {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier13, companion18.getSetModifier());
                ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                String name2 = mVar.getName();
                MaterialTheme materialTheme3 = MaterialTheme.INSTANCE;
                int i13 = MaterialTheme.$stable;
                TextStyle bodySmall12 = materialTheme3.getTypography(composer2, i13).getBodySmall();
                companion2 = Color.Companion;
                long jM3964getWhite0d7_KjU2 = companion2.m3964getWhite0d7_KjU();
                FontWeight.Companion companion110 = FontWeight.Companion;
                TextStyle textStyleM5917copyp1EtxEg2 = bodySmall12.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall12.spanStyle.m5841getColor0d7_KjU() : jM3964getWhite0d7_KjU2, (16645977 & 2) != 0 ? bodySmall12.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodySmall12.spanStyle.getFontWeight() : companion110.getSemiBold(), (16645977 & 8) != 0 ? bodySmall12.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall12.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall12.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall12.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall12.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall12.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall12.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall12.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall12.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall12.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall12.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall12.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall12.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall12.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall12.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall12.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall12.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall12.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall12.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall12.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall12.paragraphStyle.getTextMotion() : null);
                PrintOrderViewModel printOrderViewModel4 = printOrderViewModel;
                i7 = i8;
                Composer composer7 = composer2;
                float f10 = f6;
                TextKt.m2432Text4IGK_g(name2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (c) null, textStyleM5917copyp1EtxEg2, composer7, 0, 3072, 57342);
                int copies2 = mVar.getCopies();
                int pages2 = mVar.getPages();
                if (mVar.getColor() == j.COLOR) {
                    str = "Color";
                } else {
                    str = "B&W";
                }
                String str4 = copies2 + "× · " + pages2 + "p · " + str + " · " + mVar.getSize() + " · " + mVar.getBinding();
                TextStyle labelSmall5 = materialTheme3.getTypography(composer7, i13).getLabelSmall();
                TextKt.m2432Text4IGK_g(str4, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall5.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall5.spanStyle.m5841getColor0d7_KjU() : p107y3.a.g(), (16645977 & 2) != 0 ? labelSmall5.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(10), (16645977 & 4) != 0 ? labelSmall5.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? labelSmall5.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall5.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall5.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall5.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall5.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? labelSmall5.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall5.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall5.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall5.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall5.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall5.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall5.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall5.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall5.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall5.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall5.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall5.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall5.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall5.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall5.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall5.paragraphStyle.getTextMotion() : null), composer7, 0, 0, 65534);
                composer7.endNode();
                String strY6 = Gd.y(printOrderViewModel4.l(mVar, this.q));
                TextStyle bodySmall13 = materialTheme3.getTypography(composer7, i13).getBodySmall();
                TextKt.m2432Text4IGK_g(strY6, PaddingKt.m672paddingqDBjuR0$default(companion16, Dp.m6403constructorimpl(12), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall13.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall13.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? bodySmall13.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodySmall13.spanStyle.getFontWeight() : companion110.getBold(), (16645977 & 8) != 0 ? bodySmall13.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall13.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall13.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall13.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall13.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall13.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall13.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall13.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall13.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall13.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall13.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall13.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall13.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall13.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall13.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall13.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall13.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall13.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall13.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall13.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall13.paragraphStyle.getTextMotion() : null), composer7, 48, 0, 65532);
                composer7.endNode();
                composer2 = composer7;
                composer2.startReplaceGroup(-815603375);
                if (i7 < ((List) state.getValue()).size() - 1) {
                    DividerKt.m1794HorizontalDivider9IZ8Weo(null, Dp.m6403constructorimpl(1), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.06f, 0.0f, 0.0f, 0.0f, 14, null), composer2, 432, 1);
                }
                composer2.endReplaceGroup();
                it = it2;
                i8 = i11;
                f6 = f10;
            }
        }
        return B3.o.f154a;
    }
}
