package p102x3;

import C3.v;
import O3.a;
import O3.c;
import O3.e;
import O3.f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.AutoAwesomeKt;
import androidx.compose.material.icons.outlined.MenuBookKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
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
import androidx.compose.ui.unit.Dp;
import com.notescrafter.PrintOrderViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import p076s.b;
import p087u3.m;

/* JADX INFO: loaded from: classes2.dex */
public final class Kc implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ State f14142o;
    public final /* synthetic */ PrintOrderViewModel p;
    public final /* synthetic */ String q;

    public Kc(State state, PrintOrderViewModel printOrderViewModel, String str) {
        this.f14142o = state;
        this.p = printOrderViewModel;
        this.q = str;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:69:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:70:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:75:0x0419  */
    /* JADX WARN: Code duplicated, block: B:78:0x0491  */
    /* JADX WARN: Code duplicated, block: B:81:0x049d  */
    /* JADX WARN: Code duplicated, block: B:82:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:87:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:90:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:93:0x0503  */
    /* JADX WARN: Code duplicated, block: B:94:0x0507  */
    /* JADX WARN: Code duplicated, block: B:99:0x0526  */
    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float f5;
        int currentCompositeKeyHash;
        a constructor;
        Composer composerM3407constructorimpl;
        e eVarG;
        int currentCompositeKeyHash2;
        a constructor2;
        Composer composerM3407constructorimpl2;
        e eVarG2;
        int currentCompositeKeyHash3;
        a constructor3;
        Composer composerM3407constructorimpl3;
        e eVarG3;
        BoxScope GlassCard = (BoxScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(GlassCard, "$this$GlassCard");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-86072827, iIntValue, -1, "com.notescrafter.ui.screens.PrintOrderCheckoutScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:3694)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(companion, Dp.m6403constructorimpl(20));
            Arrangement arrangement = Arrangement.INSTANCE;
            float f6 = 16;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_4 = arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f6));
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_4, companion2.getStart(), composer, 6);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM668padding3ABfNKs);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
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
            e eVarG4 = p035i0.a.g(companion3, composerM3407constructorimpl4, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl4, currentCompositionLocalMap);
            if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
            }
            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer, 48);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, companion);
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
            e eVarG5 = p035i0.a.g(companion3, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy, composerM3407constructorimpl5, currentCompositionLocalMap2);
            if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
            }
            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier2, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            IconKt.m1877Iconww6aTOc(AutoAwesomeKt.getAutoAwesome(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(18)), p107y3.a.f15980c, composer, 3504, 0);
            float f7 = 8;
            androidx.compose.foundation.text.modifiers.a.q(f7, companion, composer, 6);
            TextStyle titleMedium = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleMedium();
            float f8 = f6;
            TextKt.m2432Text4IGK_g("Review Your Items", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, titleMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? titleMedium.spanStyle.m5841getColor0d7_KjU() : Color.Companion.m3964getWhite0d7_KjU(), (16645977 & 2) != 0 ? titleMedium.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? titleMedium.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? titleMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? titleMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? titleMedium.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? titleMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? titleMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? titleMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? titleMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? titleMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? titleMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? titleMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? titleMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? titleMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? titleMedium.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? titleMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? titleMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? titleMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? titleMedium.platformStyle : null, (16645977 & 1048576) != 0 ? titleMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? titleMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? titleMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? titleMedium.paragraphStyle.getTextMotion() : null), composer, 6, 0, 65534);
            composer.endNode();
            float f9 = 10;
            Composer composer2 = composer;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f9)), companion2.getStart(), composer2, 6);
            int i5 = 0;
            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, companion);
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
            e eVarG6 = p035i0.a.g(companion3, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl6, currentCompositionLocalMap3);
            if (composerM3407constructorimpl6.getInserting() || !o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG6);
            }
            p035i0.a.w(companion3, composerM3407constructorimpl6, modifierMaterializeModifier3, composer2, 803099915);
            Iterator it = ((List) this.f14142o.getValue()).iterator();
            while (it.hasNext()) {
                m mVar = (m) it.next();
                Modifier.Companion companion4 = Modifier.Companion;
                float f10 = f8;
                Modifier modifierG = b.g(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), f10);
                Brush.Companion companion5 = Brush.Companion;
                long j5 = p107y3.a.f15978a;
                Color colorM3917boximpl = Color.m3917boximpl(Color.m3926copywmQWz5c$default(j5, 0.08f, 0.0f, 0.0f, 0.0f, 14, null));
                long j6 = p107y3.a.f15979b;
                Modifier modifierBackground$default = BackgroundKt.background$default(modifierG, Brush.Companion.m3876horizontalGradient8A3gB4$default(companion5, v.S(colorM3917boximpl, Color.m3917boximpl(Color.m3926copywmQWz5c$default(j6, 0.08f, 0.0f, 0.0f, 0.0f, 14, null))), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                float f11 = 1;
                float fM6403constructorimpl = Dp.m6403constructorimpl(f11);
                Color.Companion companion6 = Color.Companion;
                Modifier modifierE = b.e(f10, modifierBackground$default, fM6403constructorimpl, Color.m3926copywmQWz5c$default(companion6.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null));
                float f12 = 14;
                Modifier modifierM668padding3ABfNKs2 = PaddingKt.m668padding3ABfNKs(modifierE, Dp.m6403constructorimpl(f12));
                Arrangement arrangement2 = Arrangement.INSTANCE;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_5 = arrangement2.m548spacedBy0680j_4(Dp.m6403constructorimpl(f12));
                Alignment.Companion companion7 = Alignment.Companion;
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_5, companion7.getCenterVertically(), composer2, 54);
                int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer2, i5);
                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierM668padding3ABfNKs2);
                ComposeUiNode.Companion companion8 = ComposeUiNode.Companion;
                Iterator it2 = it;
                a constructor7 = companion8.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor7);
                } else {
                    composer2.useNode();
                }
                Composer composerM3407constructorimpl7 = Updater.m3407constructorimpl(composer2);
                e eVarG7 = p035i0.a.g(companion8, composerM3407constructorimpl7, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl7, currentCompositionLocalMap4);
                if (composerM3407constructorimpl7.getInserting()) {
                    f5 = f10;
                } else {
                    f5 = f10;
                    if (!o.b(composerM3407constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier4, companion8.getSetModifier());
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    Modifier modifierE2 = b.e(f9, BackgroundKt.background$default(b.g(SizeKt.m699height3ABfNKs(SizeKt.m718width3ABfNKs(companion4, Dp.m6403constructorimpl(48)), Dp.m6403constructorimpl(60)), f9), Brush.Companion.m3878linearGradientmHitzGk$default(companion5, v.S(Color.m3917boximpl(Color.m3926copywmQWz5c$default(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3917boximpl(Color.m3926copywmQWz5c$default(j6, 0.2f, 0.0f, 0.0f, 0.0f, 14, null))), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null), Dp.m6403constructorimpl(f11), Color.m3926copywmQWz5c$default(companion6.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifierE2);
                    constructor = companion8.getConstructor();
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
                    eVarG = p035i0.a.g(companion8, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap5);
                    if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier5, companion8.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    float f13 = f5;
                    float f14 = f9;
                    IconKt.m1877Iconww6aTOc(MenuBookKt.getMenuBook(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion4, Dp.m6403constructorimpl(22)), Color.m3926copywmQWz5c$default(companion6.m3964getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), composer2, 3504, 0);
                    composer2.endNode();
                    Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance2, companion4, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion7.getStart(), composer2, 0);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer2, modifierWeight$default);
                    constructor2 = companion8.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer2);
                    eVarG2 = p035i0.a.g(companion8, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy3, composerM3407constructorimpl2, currentCompositionLocalMap6);
                    if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier6, companion8.getSetModifier());
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion7.getTop(), composer2, 54);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
                    constructor3 = companion8.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer2);
                    eVarG3 = p035i0.a.g(companion8, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy3, composerM3407constructorimpl3, currentCompositionLocalMap7);
                    if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier7, companion8.getSetModifier());
                    String name = mVar.getName();
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i6 = MaterialTheme.$stable;
                    TextStyle bodyMedium = materialTheme.getTypography(composer2, i6).getBodyMedium();
                    long jM3964getWhite0d7_KjU = companion6.m3964getWhite0d7_KjU();
                    FontWeight.Companion companion9 = FontWeight.Companion;
                    Composer composer3 = composer2;
                    TextKt.m2432Text4IGK_g(name, RowScope.weight$default(rowScopeInstance2, companion4, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium.spanStyle.m5841getColor0d7_KjU() : jM3964getWhite0d7_KjU, (16645977 & 2) != 0 ? bodyMedium.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium.spanStyle.getFontWeight() : companion9.getBold(), (16645977 & 8) != 0 ? bodyMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium.paragraphStyle.getTextMotion() : null), composer3, 0, 0, 65532);
                    String strY = Gd.y(this.p.l(mVar, this.q));
                    TextStyle bodyMedium2 = materialTheme.getTypography(composer3, i6).getBodyMedium();
                    TextKt.m2432Text4IGK_g(strY, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium2.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium2.spanStyle.m5841getColor0d7_KjU() : p107y3.a.f15980c, (16645977 & 2) != 0 ? bodyMedium2.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium2.spanStyle.getFontWeight() : companion9.getBold(), (16645977 & 8) != 0 ? bodyMedium2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium2.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium2.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium2.paragraphStyle.getTextMotion() : null), composer3, 0, 0, 65534);
                    b.n(composer3, f7, companion4, composer3, 6);
                    FlowLayoutKt.FlowRow(null, arrangement2.m548spacedBy0680j_4(Dp.m6403constructorimpl(5)), arrangement2.m548spacedBy0680j_4(Dp.m6403constructorimpl(4)), 0, 0, null, ComposableLambdaKt.rememberComposableLambda(-967533322, true, new Jc(mVar), composer3, 54), composer3, 1573296, 57);
                    composer3.endNode();
                    composer3.endNode();
                    f8 = f13;
                    i5 = 0;
                    it = it2;
                    f9 = f14;
                    composer2 = composer3;
                }
                p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG7);
                Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier4, companion8.getSetModifier());
                RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                Modifier modifierE3 = b.e(f9, BackgroundKt.background$default(b.g(SizeKt.m699height3ABfNKs(SizeKt.m718width3ABfNKs(companion4, Dp.m6403constructorimpl(48)), Dp.m6403constructorimpl(60)), f9), Brush.Companion.m3878linearGradientmHitzGk$default(companion5, v.S(Color.m3917boximpl(Color.m3926copywmQWz5c$default(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3917boximpl(Color.m3926copywmQWz5c$default(j6, 0.2f, 0.0f, 0.0f, 0.0f, 14, null))), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null), Dp.m6403constructorimpl(f11), Color.m3926copywmQWz5c$default(companion6.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap8 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer2, modifierE3);
                constructor = companion8.getConstructor();
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
                eVarG = p035i0.a.g(companion8, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl, currentCompositionLocalMap8);
                if (composerM3407constructorimpl.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                } else {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier8, companion8.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                float f15 = f5;
                float f16 = f9;
                IconKt.m1877Iconww6aTOc(MenuBookKt.getMenuBook(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion4, Dp.m6403constructorimpl(22)), Color.m3926copywmQWz5c$default(companion6.m3964getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), composer2, 3504, 0);
                composer2.endNode();
                Modifier modifierWeight$default2 = RowScope.weight$default(rowScopeInstance3, companion4, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion7.getStart(), composer2, 0);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap9 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer2, modifierWeight$default2);
                constructor2 = companion8.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer2);
                eVarG2 = p035i0.a.g(companion8, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy4, composerM3407constructorimpl2, currentCompositionLocalMap9);
                if (composerM3407constructorimpl2.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                } else {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier9, companion8.getSetModifier());
                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion7.getTop(), composer2, 54);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap10 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default2);
                constructor3 = companion8.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer2);
                eVarG3 = p035i0.a.g(companion8, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy4, composerM3407constructorimpl3, currentCompositionLocalMap10);
                if (composerM3407constructorimpl3.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                } else {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                }
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier10, companion8.getSetModifier());
                String name2 = mVar.getName();
                MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                int i7 = MaterialTheme.$stable;
                TextStyle bodyMedium3 = materialTheme2.getTypography(composer2, i7).getBodyMedium();
                long jM3964getWhite0d7_KjU2 = companion6.m3964getWhite0d7_KjU();
                FontWeight.Companion companion10 = FontWeight.Companion;
                Composer composer4 = composer2;
                TextKt.m2432Text4IGK_g(name2, RowScope.weight$default(rowScopeInstance3, companion4, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium3.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium3.spanStyle.m5841getColor0d7_KjU() : jM3964getWhite0d7_KjU2, (16645977 & 2) != 0 ? bodyMedium3.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium3.spanStyle.getFontWeight() : companion10.getBold(), (16645977 & 8) != 0 ? bodyMedium3.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium3.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium3.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium3.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium3.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium3.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium3.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium3.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium3.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium3.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium3.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium3.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium3.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium3.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium3.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium3.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium3.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium3.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium3.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium3.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium3.paragraphStyle.getTextMotion() : null), composer4, 0, 0, 65532);
                String strY2 = Gd.y(this.p.l(mVar, this.q));
                TextStyle bodyMedium4 = materialTheme2.getTypography(composer4, i7).getBodyMedium();
                TextKt.m2432Text4IGK_g(strY2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium4.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium4.spanStyle.m5841getColor0d7_KjU() : p107y3.a.f15980c, (16645977 & 2) != 0 ? bodyMedium4.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium4.spanStyle.getFontWeight() : companion10.getBold(), (16645977 & 8) != 0 ? bodyMedium4.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium4.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium4.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium4.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium4.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium4.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium4.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium4.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium4.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium4.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium4.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium4.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium4.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium4.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium4.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium4.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium4.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium4.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium4.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium4.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium4.paragraphStyle.getTextMotion() : null), composer4, 0, 0, 65534);
                b.n(composer4, f7, companion4, composer4, 6);
                FlowLayoutKt.FlowRow(null, arrangement2.m548spacedBy0680j_4(Dp.m6403constructorimpl(5)), arrangement2.m548spacedBy0680j_4(Dp.m6403constructorimpl(4)), 0, 0, null, ComposableLambdaKt.rememberComposableLambda(-967533322, true, new Jc(mVar), composer4, 54), composer4, 1573296, 57);
                composer4.endNode();
                composer4.endNode();
                f8 = f15;
                i5 = 0;
                it = it2;
                f9 = f16;
                composer2 = composer4;
            }
            Composer composer5 = composer2;
            composer5.endReplaceGroup();
            composer5.endNode();
            composer5.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
