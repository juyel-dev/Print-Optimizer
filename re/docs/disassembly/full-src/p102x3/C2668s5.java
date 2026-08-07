package p102x3;

import O3.a;
import O3.c;
import O3.e;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
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
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.OpenInNewKt;
import androidx.compose.material3.IconKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
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
import java.util.List;
import kotlin.jvm.internal.o;
import p076s.b;

/* JADX INFO: renamed from: x3.s5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2668s5 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List f15519o;
    public final /* synthetic */ MutableInteractionSource p;
    public final /* synthetic */ a q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ State f15520r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f15521s;
    public final /* synthetic */ String t;
    public final /* synthetic */ String u;

    public C2668s5(List list, MutableInteractionSource mutableInteractionSource, a aVar, State state, String str, String str2, String str3) {
        this.f15519o = list;
        this.p = mutableInteractionSource;
        this.q = aVar;
        this.f15520r = state;
        this.f15521s = str;
        this.t = str2;
        this.u = str3;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1140344522, iIntValue, -1, "com.notescrafter.ui.screens.WebStyleCTA.<anonymous> (GlobalHomeScreen.kt:432)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f5 = 12;
            Modifier modifierM669paddingVpY3zN4 = PaddingKt.m669paddingVpY3zN4(ClickableKt.m240clickableO2vRcR0$default(BackgroundKt.background$default(b.g(ScaleKt.scale(SizeKt.m701heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(58), 0.0f, 2, null), ((Number) this.f15520r.getValue()).floatValue()), f5), Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, this.f15519o, 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), this.p, (Indication) composer.consume(IndicationKt.getLocalIndication()), false, null, null, this.q, 28, null), Dp.m6403constructorimpl(16), Dp.m6403constructorimpl(14));
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenterStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM669paddingVpY3zN4);
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
            e eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
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
            Modifier modifierWeight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getCenter(), companion2.getStart(), composer, 6);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierWeight$default);
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
            e eVarG3 = p035i0.a.g(companion3, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl3, currentCompositionLocalMap3);
            if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
            }
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer, 54);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, companion);
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
            Color.Companion companion4 = Color.Companion;
            long jM3964getWhite0d7_KjU = companion4.m3964getWhite0d7_KjU();
            FontWeight.Companion companion5 = FontWeight.Companion;
            TextKt.m2432Text4IGK_g(this.t, (Modifier) null, jM3964getWhite0d7_KjU, TextUnitKt.getSp(13), (FontStyle) null, companion5.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 200064, 0, 131026);
            androidx.compose.foundation.text.modifiers.a.q(6, companion, composer, 6);
            IconKt.m1877Iconww6aTOc(OpenInNewKt.getOpenInNew(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f5)), Color.m3926copywmQWz5c$default(companion4.m3964getWhite0d7_KjU(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null), composer, 3504, 0);
            composer.endNode();
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(2)), composer, 6);
            TextKt.m2432Text4IGK_g(this.f15521s, (Modifier) null, Color.m3926copywmQWz5c$default(companion4.m3964getWhite0d7_KjU(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(9), (FontStyle) null, companion5.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m6342getEllipsisgIe3tQ8(), false, 1, 0, (c) null, (TextStyle) null, composer, 200064, 3120, 120786);
            composer.endNode();
            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion, Dp.m6403constructorimpl(8)), composer, 6);
            Modifier modifierM669paddingVpY3zN5 = PaddingKt.m669paddingVpY3zN4(BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(companion, RoundedCornerShapeKt.RoundedCornerShape(50)), ColorKt.Color(4279673674L), null, 2, null), Dp.m6403constructorimpl(1), ColorKt.Color(4280468830L), RoundedCornerShapeKt.RoundedCornerShape(50)), Dp.m6403constructorimpl(10), Dp.m6403constructorimpl(4));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer, modifierM669paddingVpY3zN5);
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
            e eVarG5 = p035i0.a.g(companion3, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl5, currentCompositionLocalMap5);
            if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
            }
            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier5, companion3.getSetModifier());
            TextKt.m2432Text4IGK_g(this.u, (Modifier) null, companion4.m3964getWhite0d7_KjU(), TextUnitKt.getSp(9), (FontStyle) null, companion5.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 200064, 0, 131026);
            if (S2.b(composer)) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
