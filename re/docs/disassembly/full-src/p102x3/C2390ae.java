package p102x3;

import O3.a;
import O3.c;
import O3.e;
import O3.f;
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
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material.icons.filled.KeyboardArrowDownKt;
import androidx.compose.material.icons.filled.KeyboardArrowUpKt;
import androidx.compose.material.icons.outlined.DescriptionKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.vector.ImageVector;
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
import kotlin.jvm.internal.o;
import p076s.b;

/* JADX INFO: renamed from: x3.ae, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2390ae implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a f14800o;
    public final /* synthetic */ int p;
    public final /* synthetic */ p087u3.f q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f14801r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f14802s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ a u;

    public C2390ae(a aVar, int i5, p087u3.f fVar, boolean z3, a aVar2, boolean z4, a aVar3) {
        this.f14800o = aVar;
        this.p = i5;
        this.q = fVar;
        this.f14801r = z3;
        this.f14802s = aVar2;
        this.t = z4;
        this.u = aVar3;
    }

    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BoxScope GlassCard = (BoxScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(GlassCard, "$this$GlassCard");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1948980015, iIntValue, -1, "com.notescrafter.ui.screens.ReorderableItem.<anonymous> (ReorderScreen.kt:252)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(companion, Dp.m6403constructorimpl(16));
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer, 48);
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
            e eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyRowMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            float f5 = 6;
            Modifier modifierG = b.g(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(24)), f5);
            long j5 = p107y3.a.f15978a;
            Modifier modifierM207backgroundbw27NRU$default = BackgroundKt.m207backgroundbw27NRU$default(modifierG, Color.m3926copywmQWz5c$default(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierM207backgroundbw27NRU$default);
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
            e eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            String strValueOf = String.valueOf(this.p);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i5 = MaterialTheme.$stable;
            TextStyle labelMedium = materialTheme.getTypography(composer, i5).getLabelMedium();
            FontWeight.Companion companion4 = FontWeight.Companion;
            TextKt.m2432Text4IGK_g(strValueOf, (Modifier) null, j5, 0L, (FontStyle) null, companion4.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelMedium, composer, 196992, 0, 65498);
            composer.endNode();
            float f6 = 12;
            androidx.compose.foundation.text.modifiers.a.q(f6, companion, composer, 6);
            float f7 = 28;
            IconKt.m1877Iconww6aTOc(DescriptionKt.getDescription(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f7)), p107y3.a.p, composer, 3504, 0);
            androidx.compose.foundation.text.modifiers.a.q(f6, companion, composer, 6);
            Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
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
            p087u3.f fVar = this.q;
            String name = fVar.getName();
            TextStyle bodyMedium = materialTheme.getTypography(composer, i5).getBodyMedium();
            FontWeight medium = companion4.getMedium();
            long jM3926copywmQWz5c$default = p107y3.a.f15990o;
            TextOverflow.Companion companion5 = TextOverflow.Companion;
            TextKt.m2432Text4IGK_g(name, (Modifier) null, jM3926copywmQWz5c$default, 0L, (FontStyle) null, medium, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion5.m6342getEllipsisgIe3tQ8(), false, 1, 0, (c) null, bodyMedium, composer, 196992, 3120, 55258);
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(2)), composer, 6);
            StringBuilder sb = new StringBuilder();
            sb.append(fVar.getFormattedSize());
            if (fVar.getPageCount() > 0) {
                sb.append(" • " + fVar.getPageCount() + " pages");
            }
            String string = sb.toString();
            o.e(string, "toString(...)");
            TextStyle bodySmall = materialTheme.getTypography(composer, i5).getBodySmall();
            long j6 = p107y3.a.q;
            TextKt.m2432Text4IGK_g(string, (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion5.m6342getEllipsisgIe3tQ8(), false, 1, 0, (c) null, bodySmall, composer, 384, 3504, 51194);
            composer.endNode();
            float f8 = 8;
            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion, Dp.m6403constructorimpl(f8)), composer, 6);
            float f9 = 4;
            MeasurePolicy measurePolicyI = androidx.compose.foundation.text.modifiers.a.i(f9, arrangement, companion2.getCenterVertically(), composer, 54);
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
            e eVarG4 = p035i0.a.g(companion3, composerM3407constructorimpl4, measurePolicyI, composerM3407constructorimpl4, currentCompositionLocalMap4);
            if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
            }
            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
            Icons icons = Icons.INSTANCE;
            ImageVector keyboardArrowDown = KeyboardArrowDownKt.getKeyboardArrowDown(icons.getDefault());
            boolean z3 = this.f14801r;
            IconKt.m1877Iconww6aTOc(keyboardArrowDown, "Move Down", PaddingKt.m668padding3ABfNKs(BackgroundKt.m207backgroundbw27NRU$default(ClickableKt.m242clickableXHw0xAI$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f7)), RoundedCornerShapeKt.getCircleShape()), !z3, null, null, this.f14802s, 6, null), z3 ? Color.Companion.m3962getTransparent0d7_KjU() : p107y3.a.g, null, 2, null), Dp.m6403constructorimpl(f9)), z3 ? Color.m3926copywmQWz5c$default(j6, 0.3f, 0.0f, 0.0f, 0.0f, 14, null) : jM3926copywmQWz5c$default, composer, 48, 0);
            ImageVector keyboardArrowUp = KeyboardArrowUpKt.getKeyboardArrowUp(icons.getDefault());
            boolean z4 = this.t;
            if (z4) {
                jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(j6, 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
            }
            IconKt.m1877Iconww6aTOc(keyboardArrowUp, "Move Up", PaddingKt.m668padding3ABfNKs(BackgroundKt.m207backgroundbw27NRU$default(ClickableKt.m242clickableXHw0xAI$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f7)), RoundedCornerShapeKt.getCircleShape()), !z4, null, null, this.u, 6, null), z4 ? Color.Companion.m3962getTransparent0d7_KjU() : p107y3.a.g, null, 2, null), Dp.m6403constructorimpl(f9)), jM3926copywmQWz5c$default, composer, 48, 0);
            b.u(composer, f6, companion, composer, 6);
            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion, Dp.m6403constructorimpl(f8)), composer, 6);
            IconKt.m1877Iconww6aTOc(CloseKt.getClose(icons.getDefault()), "Remove", PaddingKt.m668padding3ABfNKs(BackgroundKt.m207backgroundbw27NRU$default(ClickableKt.m242clickableXHw0xAI$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f7)), RoundedCornerShapeKt.getCircleShape()), false, null, null, this.f14800o, 7, null), Color.m3926copywmQWz5c$default(ColorKt.Color(4293870660L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f5)), ColorKt.Color(4293870660L), composer, 3120, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
