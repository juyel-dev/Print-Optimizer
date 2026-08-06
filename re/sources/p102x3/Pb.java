package p102x3;

import B3.h;
import C3.v;
import O3.a;
import O3.c;
import O3.e;
import O3.f;
import W3.j;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.BoltKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
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
import kotlin.jvm.internal.o;
import p076s.b;
import p083t3.C2290i;

/* JADX INFO: loaded from: classes2.dex */
public final class Pb implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a f14296o;
    public final /* synthetic */ a p;
    public final /* synthetic */ boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ State f14297r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f14298s;
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;

    public Pb(a aVar, a aVar2, boolean z3, State state, int i5, int i6, int i7) {
        this.f14296o = aVar;
        this.p = aVar2;
        this.q = z3;
        this.f14297r = state;
        this.f14298s = i5;
        this.t = i6;
        this.u = i7;
    }

    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer;
        ColumnScope Card = (ColumnScope) obj;
        Composer composer2 = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(Card, "$this$Card");
        if ((iIntValue & 17) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1588981875, iIntValue, -1, "com.notescrafter.ui.screens.WeekendFlashSaleDialog.<anonymous>.<anonymous>.<anonymous> (PrintLandingScreen.kt:467)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Brush.Companion companion2 = Brush.Companion;
            float f5 = 20;
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(BackgroundKt.background$default(modifierFillMaxWidth$default, Brush.Companion.m3878linearGradientmHitzGk$default(companion2, v.S(Color.m3917boximpl(Color.m3926copywmQWz5c$default(ColorKt.Color(4292617766L), 0.12f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3917boximpl(Color.m3926copywmQWz5c$default(ColorKt.Color(4293548044L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3917boximpl(Color.m3926copywmQWz5c$default(ColorKt.Color(4289222135L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null))), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null), Dp.m6403constructorimpl(f5));
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM668padding3ABfNKs);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            a constructor = companion4.getConstructor();
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
            e eVarG = p035i0.a.g(companion4, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            Modifier modifierAlign = BoxScopeInstance.INSTANCE.align(companion, companion3.getTopEnd());
            Color.Companion companion5 = Color.Companion;
            Modifier modifierM713size3ABfNKs = SizeKt.m713size3ABfNKs(BackgroundKt.m206backgroundbw27NRU(modifierAlign, Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape()), Dp.m6403constructorimpl(28));
            ComposableLambda composableLambda = AbstractC2745x2.f15705b;
            a aVar = this.f14296o;
            IconButtonKt.IconButton(aVar, modifierM713size3ABfNKs, false, null, null, composableLambda, composer2, 196608, 28);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer2, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default2);
            a constructor2 = companion4.getConstructor();
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
            e eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f6 = 12;
            MeasurePolicy measurePolicyI = androidx.compose.foundation.text.modifiers.a.i(f6, arrangement, companion3.getCenterVertically(), composer2, 54);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, companion);
            a constructor3 = companion4.getConstructor();
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
            e eVarG3 = p035i0.a.g(companion4, composerM3407constructorimpl3, measurePolicyI, composerM3407constructorimpl3, currentCompositionLocalMap3);
            if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
            }
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierBackground$default = BackgroundKt.background$default(b.g(ScaleKt.scale(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(40)), InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("icon_pulse", composer2, 6, 0), 1.0f, 1.12f, AnimationSpecKt.m107infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(800, 0, null, 6, null), RepeatMode.Reverse, 0L, 4, null), "pulse", composer2, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0).getValue().floatValue()), 10), Brush.Companion.m3878linearGradientmHitzGk$default(companion2, v.S(Color.m3917boximpl(Color.m3926copywmQWz5c$default(ColorKt.Color(4292617766L), 0.8f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3917boximpl(Color.m3926copywmQWz5c$default(ColorKt.Color(4293548044L), 0.7f, 0.0f, 0.0f, 0.0f, 14, null))), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierBackground$default);
            a constructor4 = companion4.getConstructor();
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
            e eVarG4 = p035i0.a.g(companion4, composerM3407constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl4, currentCompositionLocalMap4);
            if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
            }
            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier4, companion4.getSetModifier());
            IconKt.m1877Iconww6aTOc(BoltKt.getBolt(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(22)), companion5.m3964getWhite0d7_KjU(), composer2, 3504, 0);
            composer2.endNode();
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer2, 0);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, companion);
            a constructor5 = companion4.getConstructor();
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
            e eVarG5 = p035i0.a.g(companion4, composerM3407constructorimpl5, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl5, currentCompositionLocalMap5);
            if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
            }
            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier5, companion4.getSetModifier());
            boolean z3 = this.q;
            String str = z3 ? "⚡ Weekend Flash Sale · Live Now" : "⏰ Upcoming · Saturday Flash Sale";
            long sp = TextUnitKt.getSp(9);
            FontWeight.Companion companion6 = FontWeight.Companion;
            TextKt.m2432Text4IGK_g(str, (Modifier) null, ColorKt.Color(4294677052L), sp, (FontStyle) null, companion6.getBlack(), (FontFamily) null, TextUnitKt.getEm(0.15d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer2, 12782976, 0, 130898);
            TextKt.m2432Text4IGK_g("Lowest Prices of All Time", (Modifier) null, companion5.m3964getWhite0d7_KjU(), TextUnitKt.getSp(16), (FontStyle) null, companion6.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer2, 200070, 0, 131026);
            TextKt.m2432Text4IGK_g("Every Saturday · 11 AM – 11 PM IST", (Modifier) null, Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.45f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer2, 3462, 0, 131058);
            b.r(composer2, f5, companion, composer2, 6);
            float f7 = 1;
            Modifier modifierM668padding3ABfNKs2 = PaddingKt.m668padding3ABfNKs(b.e(f6, BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f6), Color.m3926copywmQWz5c$default(companion5.m3953getBlack0d7_KjU(), 0.25f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f7), Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.06f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f6));
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceEvenly(), companion3.getCenterVertically(), composer2, 54);
            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer2, modifierM668padding3ABfNKs2);
            a constructor6 = companion4.getConstructor();
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
            e eVarG6 = p035i0.a.g(companion4, composerM3407constructorimpl6, measurePolicyRowMeasurePolicy, composerM3407constructorimpl6, currentCompositionLocalMap6);
            if (composerM3407constructorimpl6.getInserting() || !o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG6);
            }
            Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier6, companion4.getSetModifier());
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getCenterHorizontally(), composer2, 48);
            int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer2, companion);
            a constructor7 = companion4.getConstructor();
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
            e eVarG7 = p035i0.a.g(companion4, composerM3407constructorimpl7, measurePolicyColumnMeasurePolicy3, composerM3407constructorimpl7, currentCompositionLocalMap7);
            if (composerM3407constructorimpl7.getInserting() || !o.b(composerM3407constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG7);
            }
            Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier7, companion4.getSetModifier());
            TextKt.m2432Text4IGK_g("B&W / page", (Modifier) null, Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(9), (FontStyle) null, companion6.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer2, 200070, 0, 131026);
            float f8 = 2;
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f8)), composer2, 6);
            float f9 = 4;
            MeasurePolicy measurePolicyI2 = androidx.compose.foundation.text.modifiers.a.i(f9, arrangement, companion3.getCenterVertically(), composer2, 54);
            int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap8 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer2, companion);
            a constructor8 = companion4.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor8);
            } else {
                composer2.useNode();
            }
            Composer composerM3407constructorimpl8 = Updater.m3407constructorimpl(composer2);
            e eVarG8 = p035i0.a.g(companion4, composerM3407constructorimpl8, measurePolicyI2, composerM3407constructorimpl8, currentCompositionLocalMap8);
            if (composerM3407constructorimpl8.getInserting() || !o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG8);
            }
            Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier8, companion4.getSetModifier());
            long sp2 = TextUnitKt.getSp(11);
            long jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i5 = MaterialTheme.$stable;
            TextStyle bodySmall = materialTheme.getTypography(composer2, i5).getBodySmall();
            TextDecoration.Companion companion7 = TextDecoration.Companion;
            TextKt.m2432Text4IGK_g("₹1.25", (Modifier) null, jM3926copywmQWz5c$default, sp2, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodySmall.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodySmall.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodySmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall.spanStyle.getTextDecoration() : companion7.getLineThrough(), (16645977 & Fields.Shape) != 0 ? bodySmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall.paragraphStyle.getTextMotion() : null), composer2, 3462, 0, 65522);
            long sp3 = TextUnitKt.getSp(18);
            FontWeight black = companion6.getBlack();
            long jColor = ColorKt.Color(4294538006L);
            State state = this.f14297r;
            TextKt.m2432Text4IGK_g("₹0.79", (Modifier) null, Color.m3926copywmQWz5c$default(jColor, z3 ? ((Number) state.getValue()).floatValue() : 0.9f, 0.0f, 0.0f, 0.0f, 14, null), sp3, (FontStyle) null, black, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer2, 199686, 0, 131026);
            composer2.endNode();
            composer2.endNode();
            BoxKt.Box(BackgroundKt.m207backgroundbw27NRU$default(SizeKt.m699height3ABfNKs(SizeKt.m718width3ABfNKs(companion, Dp.m6403constructorimpl(f7)), Dp.m6403constructorimpl(32)), Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer2, 6);
            MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getCenterHorizontally(), composer2, 48);
            int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap9 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer2, companion);
            a constructor9 = companion4.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor9);
            } else {
                composer2.useNode();
            }
            Composer composerM3407constructorimpl9 = Updater.m3407constructorimpl(composer2);
            e eVarG9 = p035i0.a.g(companion4, composerM3407constructorimpl9, measurePolicyColumnMeasurePolicy4, composerM3407constructorimpl9, currentCompositionLocalMap9);
            if (composerM3407constructorimpl9.getInserting() || !o.b(composerM3407constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG9);
            }
            Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier9, companion4.getSetModifier());
            TextKt.m2432Text4IGK_g("Color / page", (Modifier) null, Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(9), (FontStyle) null, companion6.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer2, 200070, 0, 131026);
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f8)), composer2, 6);
            MeasurePolicy measurePolicyI3 = androidx.compose.foundation.text.modifiers.a.i(f9, arrangement, companion3.getCenterVertically(), composer2, 54);
            int currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap10 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer2, companion);
            a constructor10 = companion4.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor10);
            } else {
                composer2.useNode();
            }
            Composer composerM3407constructorimpl10 = Updater.m3407constructorimpl(composer2);
            e eVarG10 = p035i0.a.g(companion4, composerM3407constructorimpl10, measurePolicyI3, composerM3407constructorimpl10, currentCompositionLocalMap10);
            if (composerM3407constructorimpl10.getInserting() || !o.b(composerM3407constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                p035i0.a.t(currentCompositeKeyHash10, composerM3407constructorimpl10, currentCompositeKeyHash10, eVarG10);
            }
            Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier10, companion4.getSetModifier());
            long sp4 = TextUnitKt.getSp(11);
            long jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
            TextStyle bodySmall2 = materialTheme.getTypography(composer2, i5).getBodySmall();
            TextKt.m2432Text4IGK_g("₹3.35", (Modifier) null, jM3926copywmQWz5c$default2, sp4, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall2.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall2.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodySmall2.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodySmall2.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodySmall2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall2.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall2.spanStyle.getTextDecoration() : companion7.getLineThrough(), (16645977 & Fields.Shape) != 0 ? bodySmall2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall2.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall2.paragraphStyle.getTextMotion() : null), composer2, 3462, 0, 65522);
            TextKt.m2432Text4IGK_g("₹1.89", (Modifier) null, Color.m3926copywmQWz5c$default(ColorKt.Color(4289222135L), z3 ? ((Number) state.getValue()).floatValue() : 0.9f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(18), (FontStyle) null, companion6.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer2, 199686, 0, 131026);
            composer2.endNode();
            composer2.endNode();
            composer2.endNode();
            b.m(16, companion, composer2, 6);
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion3.getCenterVertically(), composer2, 54);
            int currentCompositeKeyHash11 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap11 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default3);
            a constructor11 = companion4.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor11);
            } else {
                composer2.useNode();
            }
            Composer composerM3407constructorimpl11 = Updater.m3407constructorimpl(composer2);
            e eVarG11 = p035i0.a.g(companion4, composerM3407constructorimpl11, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl11, currentCompositionLocalMap11);
            if (composerM3407constructorimpl11.getInserting() || !o.b(composerM3407constructorimpl11.rememberedValue(), Integer.valueOf(currentCompositeKeyHash11))) {
                p035i0.a.t(currentCompositeKeyHash11, composerM3407constructorimpl11, currentCompositeKeyHash11, eVarG11);
            }
            Updater.m3414setimpl(composerM3407constructorimpl11, modifierMaterializeModifier11, companion4.getSetModifier());
            TextKt.m2432Text4IGK_g(z3 ? "ENDS IN" : "STARTS IN", (Modifier) null, Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(9), (FontStyle) null, companion6.getBold(), (FontFamily) null, TextUnitKt.getEm(0.1d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer2, 12782976, 0, 130898);
            Composer composer3 = composer2;
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f9)), companion3.getCenterVertically(), composer3, 54);
            int i6 = 0;
            int currentCompositeKeyHash12 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
            CompositionLocalMap currentCompositionLocalMap12 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier12 = ComposedModifierKt.materializeModifier(composer3, companion);
            a constructor12 = companion4.getConstructor();
            if (composer3.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor12);
            } else {
                composer3.useNode();
            }
            Composer composerM3407constructorimpl12 = Updater.m3407constructorimpl(composer3);
            e eVarG12 = p035i0.a.g(companion4, composerM3407constructorimpl12, measurePolicyRowMeasurePolicy3, composerM3407constructorimpl12, currentCompositionLocalMap12);
            if (composerM3407constructorimpl12.getInserting() || !o.b(composerM3407constructorimpl12.rememberedValue(), Integer.valueOf(currentCompositeKeyHash12))) {
                p035i0.a.t(currentCompositeKeyHash12, composerM3407constructorimpl12, currentCompositeKeyHash12, eVarG12);
            }
            p035i0.a.w(companion4, composerM3407constructorimpl12, modifierMaterializeModifier12, composer3, -113129712);
            int i7 = 0;
            for (Object obj4 : v.S(new h(j.q0(2, String.valueOf(this.f14298s)), "HR"), new h(j.q0(2, String.valueOf(this.t)), "MIN"), new h(j.q0(2, String.valueOf(this.u)), "SEC"))) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    v.X();
                    throw null;
                }
                h hVar = (h) obj4;
                String str2 = (String) hVar.f148o;
                String str3 = (String) hVar.p;
                Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
                float f10 = 6;
                Modifier modifierD = b.d(f10, Modifier.Companion);
                Color.Companion companion8 = Color.Companion;
                Modifier modifierM669paddingVpY3zN4 = PaddingKt.m669paddingVpY3zN4(b.e(f10, BackgroundKt.m207backgroundbw27NRU$default(modifierD, Color.m3926copywmQWz5c$default(companion8.m3953getBlack0d7_KjU(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f7), Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(8), Dp.m6403constructorimpl(f9));
                MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
                int currentCompositeKeyHash13 = ComposablesKt.getCurrentCompositeKeyHash(composer3, i6);
                CompositionLocalMap currentCompositionLocalMap13 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier13 = ComposedModifierKt.materializeModifier(composer3, modifierM669paddingVpY3zN4);
                ComposeUiNode.Companion companion9 = ComposeUiNode.Companion;
                a constructor13 = companion9.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor13);
                } else {
                    composer3.useNode();
                }
                Composer composerM3407constructorimpl13 = Updater.m3407constructorimpl(composer3);
                e eVarG13 = p035i0.a.g(companion9, composerM3407constructorimpl13, measurePolicyColumnMeasurePolicy5, composerM3407constructorimpl13, currentCompositionLocalMap13);
                if (composerM3407constructorimpl13.getInserting() || !o.b(composerM3407constructorimpl13.rememberedValue(), Integer.valueOf(currentCompositeKeyHash13))) {
                    p035i0.a.t(currentCompositeKeyHash13, composerM3407constructorimpl13, currentCompositeKeyHash13, eVarG13);
                }
                Updater.m3414setimpl(composerM3407constructorimpl13, modifierMaterializeModifier13, companion9.getSetModifier());
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                long sp5 = TextUnitKt.getSp(16);
                FontWeight.Companion companion10 = FontWeight.Companion;
                int i9 = i6;
                Composer composer4 = composer3;
                int i10 = i7;
                TextKt.m2432Text4IGK_g(str2, (Modifier) null, companion8.m3964getWhite0d7_KjU(), sp5, (FontStyle) null, companion10.getBlack(), (FontFamily) FontFamily.Companion.getMonospace(), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer4, 200064, 0, 130962);
                TextKt.m2432Text4IGK_g(str3, (Modifier) null, Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(7), (FontStyle) null, companion10.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer4, 200064, 0, 131026);
                composer4.endNode();
                composer4.startReplaceGroup(-113098467);
                if (i10 < 2) {
                    composer = composer4;
                    TextKt.m2432Text4IGK_g(":", (Modifier) null, Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.25f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(16), (FontStyle) null, companion10.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 200070, 0, 131026);
                } else {
                    composer = composer4;
                }
                composer.endReplaceGroup();
                composer3 = composer;
                i7 = i8;
                i6 = i9;
            }
            Composer composer5 = composer3;
            composer5.endReplaceGroup();
            composer5.endNode();
            composer5.endNode();
            Modifier.Companion companion11 = Modifier.Companion;
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion11, Dp.m6403constructorimpl(f5)), composer3, 6);
            composer3.startReplaceGroup(875375040);
            boolean zChanged = composer3.changed(aVar);
            a aVar2 = this.p;
            boolean zChanged2 = zChanged | composer3.changed(aVar2);
            Object objRememberedValue = composer3.rememberedValue();
            if (zChanged2 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new C2290i(19, aVar, aVar2);
                composer3.updateRememberedValue(objRememberedValue);
            }
            composer3.endReplaceGroup();
            ButtonKt.Button((a) objRememberedValue, SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion11, 0.0f, 1, null), Dp.m6403constructorimpl(48)), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f6)), ButtonDefaults.INSTANCE.m1520buttonColorsro_MJ88(Color.Companion.m3962getTransparent0d7_KjU(), 0L, 0L, 0L, composer3, (ButtonDefaults.$stable << 12) | 6, 14), null, null, PaddingKt.m663PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null), null, ComposableLambdaKt.rememberComposableLambda(694604807, true, new Ob(z3), composer3, 54), composer3, 817889328, 356);
            if (androidx.compose.foundation.text.modifiers.a.w(composer3)) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
