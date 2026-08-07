package p102x3;

import C3.v;
import O3.a;
import O3.c;
import O3.e;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.GridViewKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
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

/* JADX INFO: renamed from: x3.b9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2401b9 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ State f14843o;
    public final /* synthetic */ State p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f14844r;

    public C2401b9(State state, State state2, MutableState mutableState, MutableState mutableState2) {
        this.f14843o = state;
        this.p = state2;
        this.q = mutableState;
        this.f14844r = mutableState2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1529991554, iIntValue, -1, "com.notescrafter.ui.screens.PdfOrganizeScreen.<anonymous>.<anonymous> (PdfOrganizeScreen.kt:1136)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getCenterHorizontally(), composer, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
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
            Modifier modifierM713size3ABfNKs = SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(MenuKt.InTransitionDuration));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierM713size3ABfNKs);
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
            Modifier modifierClip = ClipKt.clip(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(((Number) this.f14843o.getValue()).floatValue() * 80)), RoundedCornerShapeKt.getCircleShape());
            long j5 = p107y3.a.f15978a;
            float f5 = 1;
            BoxKt.Box(BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(modifierClip, Color.m3926copywmQWz5c$default(j5, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f5), Color.m3926copywmQWz5c$default(j5, 0.15f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape()), composer, 0);
            float f6 = 16;
            Modifier modifierG = b.g(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(64)), f6);
            Brush.Companion companion4 = Brush.Companion;
            Color colorM3917boximpl = Color.m3917boximpl(Color.m3926copywmQWz5c$default(j5, 0.15f, 0.0f, 0.0f, 0.0f, 14, null));
            long j6 = p107y3.a.f15979b;
            Modifier modifierM222borderziNgDLE = BorderKt.m222borderziNgDLE(BackgroundKt.background$default(modifierG, Brush.Companion.m3878linearGradientmHitzGk$default(companion4, v.S(colorM3917boximpl, Color.m3917boximpl(Color.m3926copywmQWz5c$default(j6, 0.15f, 0.0f, 0.0f, 0.0f, 14, null))), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null), Dp.m6403constructorimpl(f5), Brush.Companion.m3878linearGradientmHitzGk$default(companion4, v.S(Color.m3917boximpl(Color.m3926copywmQWz5c$default(j5, 0.35f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3917boximpl(Color.m3926copywmQWz5c$default(j6, 0.35f, 0.0f, 0.0f, 0.0f, 14, null))), 0L, 0L, 0, 14, (Object) null), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f6)));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierM222borderziNgDLE);
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
            e eVarG3 = p035i0.a.g(companion3, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl3, currentCompositionLocalMap3);
            if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
            }
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            ImageVector gridView = GridViewKt.getGridView(Icons.Outlined.INSTANCE);
            Color.Companion companion5 = Color.Companion;
            IconKt.m1877Iconww6aTOc(gridView, (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(28)), companion5.m3964getWhite0d7_KjU(), composer, 3504, 0);
            BoxKt.Box(BackgroundKt.background$default(OffsetKt.m629offsetVpY3zN4$default(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(2)), 0.0f, Dp.m6403constructorimpl(((Number) this.p.getValue()).floatValue() - 30), 1, null), Brush.Companion.m3876horizontalGradient8A3gB4$default(companion4, v.S(Color.m3917boximpl(companion5.m3962getTransparent0d7_KjU()), Color.m3917boximpl(p107y3.a.f15980c), Color.m3917boximpl(companion5.m3962getTransparent0d7_KjU())), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composer, 0);
            composer.endNode();
            composer.endNode();
            b.m(20, companion, composer, 6);
            String str = (String) this.q.getValue();
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i5 = MaterialTheme.$stable;
            TextStyle titleMedium = materialTheme.getTypography(composer, i5).getTitleMedium();
            FontWeight.Companion companion6 = FontWeight.Companion;
            TextKt.m2432Text4IGK_g(str, (Modifier) null, p107y3.a.f15990o, 0L, (FontStyle) null, companion6.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, titleMedium, composer, 196992, 0, 64986);
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f6)), composer, 6);
            long jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
            Modifier modifierClip2 = ClipKt.clip(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(6)), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(3)));
            composer.startReplaceGroup(1552114949);
            Object objRememberedValue = composer.rememberedValue();
            Object empty = Composer.Companion.getEmpty();
            MutableState mutableState = this.f14844r;
            if (objRememberedValue == empty) {
                objRememberedValue = new O6(12, mutableState);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            ProgressIndicatorKt.m2104LinearProgressIndicatorGJbTh5U((a) objRememberedValue, modifierClip2, j5, jM3926copywmQWz5c$default, 0, 0.0f, null, composer, 3462, 112);
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(8)), composer, 6);
            TextKt.m2432Text4IGK_g(androidx.compose.foundation.text.modifiers.a.k((int) (((Number) mutableState.getValue()).floatValue() * 100), "%"), (Modifier) null, p107y3.a.p, 0L, (FontStyle) null, companion6.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer, i5).getBodyMedium(), composer, 196992, 0, 65498);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
