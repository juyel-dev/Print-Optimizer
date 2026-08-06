package p097w3;

import O3.a;
import O3.c;
import O3.e;
import T3.d;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import java.util.Set;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t {
    public static final void a(final int i5, final int i6, final Set set, Modifier modifier, Composer composer, final int i7) {
        int i8;
        Composer composer2;
        final Modifier modifier2;
        Composer composer3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1966503842);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(i5) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(i6) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(set) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i9 = i8 | 3072;
        if ((i9 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            composer2 = composerStartRestartGroup;
        } else {
            Modifier.Companion companion = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1966503842, i9, -1, "com.notescrafter.ui.components.StepIndicator (StepIndicator.kt:37)");
            }
            float f5 = 16;
            boolean z3 = true;
            Easing easing = null;
            Modifier modifierHorizontalScroll$default = ScrollKt.horizontalScroll$default(PaddingKt.m670paddingVpY3zN4$default(companion, 0.0f, Dp.m6403constructorimpl(f5), 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(4)), Alignment.Companion.getCenterVertically(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierHorizontalScroll$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            a constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3407constructorimpl = Updater.m3407constructorimpl(composerStartRestartGroup);
            e eVarG = p035i0.a.g(companion2, composerM3407constructorimpl, measurePolicyRowMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(940280760);
            d it = new T3.e(1, i5, 1).iterator();
            while (it.q) {
                int iA = it.a();
                boolean zContains = set.contains(Integer.valueOf(iA));
                boolean z4 = iA == i6 ? z3 : false;
                if (iA > i6) {
                    set.contains(Integer.valueOf(iA));
                }
                Easing easing2 = easing;
                boolean z5 = z3;
                Modifier.Companion companion3 = companion;
                State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(z4 ? 1.05f : 1.0f, AnimationSpecKt.tween$default(ComposerKt.invocationKey, 0, easing, 6, easing), 0.0f, "step_scale", null, composerStartRestartGroup, 3120, 20);
                Modifier.Companion companion4 = Modifier.Companion;
                Modifier modifierClip = ClipKt.clip(SizeKt.m713size3ABfNKs(ScaleKt.scale(companion4, stateAnimateFloatAsState.getValue().floatValue()), Dp.m6403constructorimpl(26)), RoundedCornerShapeKt.getCircleShape());
                long j5 = (zContains || z4) ? p107y3.a.f15978a : p107y3.a.f15991r;
                Modifier modifierM207backgroundbw27NRU$default = BackgroundKt.m207backgroundbw27NRU$default(modifierClip, j5, null, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM207backgroundbw27NRU$default);
                ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
                a constructor2 = companion5.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3407constructorimpl2 = Updater.m3407constructorimpl(composerStartRestartGroup);
                e eVarG2 = p035i0.a.g(companion5, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
                if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (zContains) {
                    composerStartRestartGroup.startReplaceGroup(442388926);
                    IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Filled.INSTANCE), "Completed", SizeKt.m713size3ABfNKs(companion4, Dp.m6403constructorimpl(14)), Color.Companion.m3964getWhite0d7_KjU(), composerStartRestartGroup, 3504, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    composer3 = composerStartRestartGroup;
                } else {
                    composerStartRestartGroup.startReplaceGroup(442725307);
                    composer3 = composerStartRestartGroup;
                    TextKt.m2432Text4IGK_g(String.valueOf(iA), (Modifier) null, z4 ? Color.Companion.m3964getWhite0d7_KjU() : p107y3.a.q, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getLabelSmall(), composer3, 0, 0, 65530);
                    composer3.endReplaceGroup();
                }
                composer3.endNode();
                Composer composer4 = composer3;
                composer4.startReplaceGroup(940335992);
                if (iA < i5) {
                    BoxKt.Box(BackgroundKt.m207backgroundbw27NRU$default(SizeKt.m715sizeVpY3zN4(companion4, Dp.m6403constructorimpl(f5), Dp.m6403constructorimpl(2)), set.contains(Integer.valueOf(iA)) ? p107y3.a.f15978a : p107y3.a.f15991r, null, 2, null), composer4, 0);
                }
                composer4.endReplaceGroup();
                it = it;
                composerStartRestartGroup = composer4;
                easing = easing2;
                z3 = z5;
                companion = companion3;
            }
            Modifier.Companion companion6 = companion;
            composer2 = composerStartRestartGroup;
            if (p035i0.a.z(composer2)) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion6;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: w3.s
                @Override // O3.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i7 | 1);
                    Set set2 = set;
                    Modifier modifier3 = modifier2;
                    t.a(i5, i6, set2, modifier3, (Composer) obj, iUpdateChangedFlags);
                    return B3.o.f154a;
                }
            });
        }
    }
}
