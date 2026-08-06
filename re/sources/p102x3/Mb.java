package p102x3;

import B3.h;
import O3.a;
import O3.c;
import O3.e;
import O3.f;
import W3.j;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
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
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.LocalShippingKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.internal.AbstractC2168g;
import kotlin.jvm.internal.o;
import p076s.b;

/* JADX INFO: loaded from: classes2.dex */
public final class Mb implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Brush f14201o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f14202r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f14203s;
    public final /* synthetic */ a t;
    public final /* synthetic */ String u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f14204v;

    public Mb(Brush brush, boolean z3, boolean z4, boolean z5, h hVar, a aVar, String str, String str2) {
        this.f14201o = brush;
        this.p = z3;
        this.q = z4;
        this.f14202r = z5;
        this.f14203s = hVar;
        this.t = aVar;
        this.u = str;
        this.f14204v = str2;
    }

    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer;
        BoxScope GlassCard = (BoxScope) obj;
        Composer composer2 = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(GlassCard, "$this$GlassCard");
        if ((iIntValue & 17) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-598366114, iIntValue, -1, "com.notescrafter.ui.screens.UnifiedShippingAndEddCard.<anonymous> (PrintLandingScreen.kt:2235)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(BackgroundKt.background$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), this.f14201o, null, 0.0f, 6, null), Dp.m6403constructorimpl(16));
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer2, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM668padding3ABfNKs);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            a constructor = companion3.getConstructor();
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
            e eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            float f5 = 12;
            MeasurePolicy measurePolicyI = androidx.compose.foundation.text.modifiers.a.i(f5, arrangement, companion2.getCenterVertically(), composer2, 54);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
            a constructor2 = companion3.getConstructor();
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
            e eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyI, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            float f6 = 10;
            Modifier modifierE = b.e(f6, BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(40)), f6), Color.m3926copywmQWz5c$default(ColorKt.Color(4279286145L), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(1), Color.m3926copywmQWz5c$default(ColorKt.Color(4279286145L), 0.3f, 0.0f, 0.0f, 0.0f, 14, null));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierE);
            a constructor3 = companion3.getConstructor();
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
            e eVarG3 = p035i0.a.g(companion3, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl3, currentCompositionLocalMap3);
            if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
            }
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            IconKt.m1877Iconww6aTOc(LocalShippingKt.getLocalShipping(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(20)), ColorKt.Color(4279286145L), composer2, 3504, 0);
            composer2.endNode();
            Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 0);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierWeight$default);
            a constructor4 = companion3.getConstructor();
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
            e eVarG4 = p035i0.a.g(companion3, composerM3407constructorimpl4, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl4, currentCompositionLocalMap4);
            if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
            }
            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
            Color.Companion companion4 = Color.Companion;
            long jM3964getWhite0d7_KjU = companion4.m3964getWhite0d7_KjU();
            long sp = TextUnitKt.getSp(13);
            FontWeight.Companion companion5 = FontWeight.Companion;
            TextKt.m2432Text4IGK_g("Free Shipping Activated", (Modifier) null, jM3964getWhite0d7_KjU, sp, (FontStyle) null, companion5.getExtraBold(), (FontFamily) null, TextUnitKt.getSp(0.3d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer2, 12782982, 0, 130898);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append("Free shipping on ");
            int iPushStyle = builder.pushStyle(new SpanStyle(ColorKt.Color(4279286145L), 0L, companion5.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
            try {
                builder.append("5 or more notebooks");
                builder.pop(iPushStyle);
                builder.append("!");
                TextKt.m2433TextIbK3jfQ(builder.toAnnotatedString(), null, Color.m3926copywmQWz5c$default(companion4.m3964getWhite0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(11), null, companion5.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer2, 200064, 0, 262098);
                composer2.endNode();
                composer2.endNode();
                if (this.p) {
                    composer2.startReplaceGroup(499426070);
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f6)), composer2, 6);
                    float f7 = (float) 1.5d;
                    BoxKt.Box(BackgroundKt.m207backgroundbw27NRU$default(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(f7)), Color.m3926copywmQWz5c$default(companion4.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer2, 6);
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f6)), composer2, 6);
                    if (this.q) {
                        composer2.startReplaceGroup(499756530);
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer2, 48);
                        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default2);
                        a constructor5 = companion3.getConstructor();
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
                        e eVarG5 = p035i0.a.g(companion3, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy, composerM3407constructorimpl5, currentCompositionLocalMap5);
                        if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                            p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier5, companion3.getSetModifier());
                        ProgressIndicatorKt.m2100CircularProgressIndicatorLxG7B9w(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f5)), ColorKt.Color(4279286145L), Dp.m6403constructorimpl(f7), 0L, 0, composer2, 438, 24);
                        composer = composer2;
                        TextKt.m2432Text4IGK_g("Calculating estimated delivery...", (Modifier) null, Color.m3926copywmQWz5c$default(b.a(8, companion, composer2, 6, companion4), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 3462, 0, 131058);
                        composer.endNode();
                        composer.endReplaceGroup();
                    } else if (this.f14202r) {
                        composer2.startReplaceGroup(500549014);
                        Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getCenterVertically(), composer2, 54);
                        int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default3);
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
                        e eVarG6 = p035i0.a.g(companion3, composerM3407constructorimpl6, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl6, currentCompositionLocalMap6);
                        if (composerM3407constructorimpl6.getInserting() || !o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG6);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier6, companion3.getSetModifier());
                        TextKt.m2432Text4IGK_g("📍 No address saved to estimate arrival.", (Modifier) null, Color.m3926copywmQWz5c$default(companion4.m3964getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer2, 3462, 0, 131058);
                        TextKt.m2432Text4IGK_g("Add Address →", ClickableKt.m242clickableXHw0xAI$default(companion, false, null, null, this.t, 7, null), ColorKt.Color(4281908728L), TextUnitKt.getSp(11), (FontStyle) null, companion5.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer2, 200070, 0, 131024);
                        composer2.endNode();
                        composer2.endReplaceGroup();
                        composer = composer2;
                    } else {
                        h hVar = this.f14203s;
                        if (hVar != null) {
                            composer2.startReplaceGroup(501468722);
                            String str = (String) hVar.f148o;
                            String str2 = (String) hVar.p;
                            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 0);
                            int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap7 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer2, companion);
                            a constructor7 = companion3.getConstructor();
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
                            e eVarG7 = p035i0.a.g(companion3, composerM3407constructorimpl7, measurePolicyColumnMeasurePolicy3, composerM3407constructorimpl7, currentCompositionLocalMap7);
                            if (composerM3407constructorimpl7.getInserting() || !o.b(composerM3407constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                                p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG7);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier7, companion3.getSetModifier());
                            AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, null);
                            builder2.append("Est. Arrival: ");
                            int iPushStyle2 = builder2.pushStyle(new SpanStyle(ColorKt.Color(4279286145L), 0L, companion5.getExtraBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                            try {
                                builder2.append(str + " – " + str2);
                                builder2.pop(iPushStyle2);
                                composer = composer2;
                                TextKt.m2433TextIbK3jfQ(builder2.toAnnotatedString(), null, companion4.m3964getWhite0d7_KjU(), TextUnitKt.getSp(11), null, companion5.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer, 200064, 0, 262098);
                                composer.startReplaceGroup(-1053337570);
                                String str3 = this.u;
                                if (str3 != null && !j.m0(str3)) {
                                    String str4 = this.f14204v;
                                    TextKt.m2432Text4IGK_g(androidx.compose.foundation.text.modifiers.a.z("Delivering to ", str3, (str4 == null || j.m0(str4)) ? "" : androidx.compose.foundation.text.modifiers.a.z(" (", str4, ")")), (Modifier) null, Color.m3926copywmQWz5c$default(companion4.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 3456, 0, 131058);
                                }
                                composer.endReplaceGroup();
                                composer.endNode();
                                composer.endReplaceGroup();
                            } catch (Throwable th) {
                                builder2.pop(iPushStyle2);
                                throw th;
                            }
                        } else {
                            composer = composer2;
                            composer.startReplaceGroup(502514290);
                            composer.endReplaceGroup();
                        }
                    }
                    composer.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(502552172);
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f6)), composer2, 6);
                    BoxKt.Box(BackgroundKt.m207backgroundbw27NRU$default(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl((float) 1.5d)), Color.m3926copywmQWz5c$default(companion4.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer2, 6);
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f6)), composer2, 6);
                    composer = composer2;
                    TextKt.m2432Text4IGK_g("Sign in to see estimated delivery date for your pincode.", (Modifier) null, Color.m3926copywmQWz5c$default(companion4.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 3462, 0, 131058);
                    composer.endReplaceGroup();
                }
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } catch (Throwable th2) {
                builder.pop(iPushStyle);
                throw th2;
            }
        }
        return B3.o.f154a;
    }
}
