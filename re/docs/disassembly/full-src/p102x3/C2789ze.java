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
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.DownloadKt;
import androidx.compose.material.icons.filled.InfoKt;
import androidx.compose.material.icons.outlined.DescriptionKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
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
import kotlin.jvm.internal.o;
import p076s.b;
import p097w3.q;

/* JADX INFO: renamed from: x3.ze, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2789ze implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f15828o;
    public final /* synthetic */ a p;
    public final /* synthetic */ float q;

    public C2789ze(boolean z3, a aVar, float f5) {
        this.f15828o = z3;
        this.p = aVar;
        this.q = f5;
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
                ComposerKt.traceEventStart(-947718731, iIntValue, -1, "com.notescrafter.ui.screens.SuccessScreen.<anonymous>.<anonymous> (SuccessScreen.kt:208)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f5 = 24;
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(companion, Dp.m6403constructorimpl(f5));
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
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
            e eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f6 = 12;
            Modifier modifierM668padding3ABfNKs2 = PaddingKt.m668padding3ABfNKs(b.e(f6, BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f6), Color.m3926copywmQWz5c$default(p107y3.a.f15989n, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(2), Color.m3926copywmQWz5c$default(p107y3.a.f15988m, 0.6f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f6));
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getCenter(), companion2.getCenterVertically(), composer, 54);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierM668padding3ABfNKs2);
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Icons.Filled filled = Icons.Filled.INSTANCE;
            ImageVector info = InfoKt.getInfo(filled);
            long j5 = p107y3.a.f15987l;
            IconKt.m1877Iconww6aTOc(info, (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(20)), j5, composer, 3504, 0);
            androidx.compose.foundation.text.modifiers.a.q(f6, companion, composer, 6);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i5 = MaterialTheme.$stable;
            TextStyle titleSmall = materialTheme.getTypography(composer, i5).getTitleSmall();
            FontWeight.Companion companion4 = FontWeight.Companion;
            TextKt.m2432Text4IGK_g("Review the Notes Before Printing", (Modifier) null, j5, 0L, (FontStyle) null, companion4.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, titleSmall, composer, 196998, 0, 65498);
            b.n(composer, f5, companion, composer, 6);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer, 48);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, companion);
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
            e eVarG3 = p035i0.a.g(companion3, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl3, currentCompositionLocalMap3);
            if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
            }
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            Modifier modifierG = b.g(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(48)), f6);
            Brush.Companion companion5 = Brush.Companion;
            long j6 = p107y3.a.f15978a;
            Modifier modifierM668padding3ABfNKs3 = PaddingKt.m668padding3ABfNKs(BackgroundKt.background$default(modifierG, Brush.Companion.m3878linearGradientmHitzGk$default(companion5, v.S(Color.m3917boximpl(j6), Color.m3917boximpl(p107y3.a.f15979b)), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null), Dp.m6403constructorimpl(f6));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, modifierM668padding3ABfNKs3);
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
            e eVarG4 = p035i0.a.g(companion3, composerM3407constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl4, currentCompositionLocalMap4);
            if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
            }
            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            IconKt.m1877Iconww6aTOc(DescriptionKt.getDescription(Icons.Outlined.INSTANCE), (String) null, (Modifier) null, Color.Companion.m3964getWhite0d7_KjU(), composer, 3120, 4);
            composer.endNode();
            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion, Dp.m6403constructorimpl(16)), composer, 6);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer, companion);
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
            e eVarG5 = p035i0.a.g(companion3, composerM3407constructorimpl5, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl5, currentCompositionLocalMap5);
            if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
            }
            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier5, companion3.getSetModifier());
            TextKt.m2432Text4IGK_g("Enhanced PDF", (Modifier) null, p107y3.a.f15990o, 0L, (FontStyle) null, companion4.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (c) null, materialTheme.getTypography(composer, i5).getTitleMedium(), composer, 196998, 3072, 57306);
            TextKt.m2432Text4IGK_g("Enhanced PDF", (Modifier) null, p107y3.a.q, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer, i5).getBodySmall(), composer, 390, 0, 65530);
            b.r(composer, f5, companion, composer, 6);
            DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, p107y3.a.f15991r, composer, 384, 3);
            b.m(f5, companion, composer, 6);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
            a constructor6 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor6);
            } else {
                composer.useNode();
            }
            Composer composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer);
            e eVarG6 = p035i0.a.g(companion3, composerM3407constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl6, currentCompositionLocalMap6);
            if (composerM3407constructorimpl6.getInserting() || !o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG6);
            }
            Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier6, companion3.getSetModifier());
            if (this.f15828o) {
                composer.startReplaceGroup(-196391407);
                Modifier modifierM699height3ABfNKs = SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(56));
                RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f6));
                ButtonColors buttonColorsM1520buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1520buttonColorsro_MJ88(0L, 0L, Color.m3926copywmQWz5c$default(j6, 0.8f, 0.0f, 0.0f, 0.0f, 14, null), 0L, composer, (ButtonDefaults.$stable << 12) | 384, 11);
                composer.startReplaceGroup(-283428735);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new M0.f(3);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                ButtonKt.Button((a) objRememberedValue, modifierM699height3ABfNKs, false, roundedCornerShapeM955RoundedCornerShape0680j_4, buttonColorsM1520buttonColorsro_MJ88, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(286120252, true, new C2773ye(this.q), composer, 54), composer, 805306806, 480);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-195004560);
                q.a("Download PDF", this.p, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), DownloadKt.getDownload(filled), false, false, composer, 390, 48);
                composer.endReplaceGroup();
            }
            if (androidx.compose.foundation.text.modifiers.a.w(composer)) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
