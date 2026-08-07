package p102x3;

import B3.o;
import C3.v;
import M0.b;
import N0.C0135c;
import O3.c;
import O3.e;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.notescrafter.app.R;
import o4.d;
import p087u3.t;
import p107y3.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Qd {
    /* JADX WARN: Code duplicated, block: B:36:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:37:0x0106  */
    /* JADX WARN: Code duplicated, block: B:39:0x0114  */
    /* JADX WARN: Code duplicated, block: B:40:0x0123  */
    /* JADX WARN: Code duplicated, block: B:43:0x017c  */
    public static final void a(final float f5, Composer composer, final int i5, final int i6) {
        int i7;
        float f6;
        float fFloatValue;
        float fFloatValue2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1860586846);
        if ((i6 & 6) == 0) {
            i7 = (composerStartRestartGroup.changed(i5) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= composerStartRestartGroup.changed(f5) ? 32 : 16;
        }
        if ((i7 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1860586846, i7, -1, "com.notescrafter.ui.screens.Particle (ProcessingScreen.kt:347)");
            }
            State<Float> stateAnimateFloat = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("particle_" + i5, composerStartRestartGroup, 0, 0), 0.0f, 1.0f, AnimationSpecKt.m107infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween(3000, (int) (1000 * f5), EasingKt.getFastOutSlowInEasing()), RepeatMode.Restart, 0L, 4, null), "particle_t", composerStartRestartGroup, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0);
            float fM6403constructorimpl = Dp.m6403constructorimpl((float) 80);
            double radians = Math.toRadians((double) i5);
            float fM6403constructorimpl2 = Dp.m6403constructorimpl(stateAnimateFloat.getValue().floatValue() * fM6403constructorimpl);
            if (stateAnimateFloat.getValue().floatValue() < 0.2f) {
                fFloatValue = stateAnimateFloat.getValue().floatValue();
            } else {
                if (stateAnimateFloat.getValue().floatValue() > 0.8f) {
                    fFloatValue = 1 - stateAnimateFloat.getValue().floatValue();
                } else {
                    f6 = 0.8f;
                }
                if (stateAnimateFloat.getValue().floatValue() < 0.2f) {
                    fFloatValue2 = stateAnimateFloat.getValue().floatValue() * 5;
                } else if (stateAnimateFloat.getValue().floatValue() > 0.8f) {
                    fFloatValue2 = 5 * (1 - stateAnimateFloat.getValue().floatValue());
                } else {
                    fFloatValue2 = 1.0f;
                }
                double d4 = fM6403constructorimpl2;
                BoxKt.Box(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(AlphaKt.alpha(ScaleKt.scale(OffsetKt.m628offsetVpY3zN4(Modifier.Companion, Dp.m6403constructorimpl((float) (Math.cos(radians) * d4)), Dp.m6403constructorimpl((float) (Math.sin(radians) * d4))), fFloatValue2), f6), Dp.m6403constructorimpl(6)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(a.f15978a, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            f6 = fFloatValue * 5 * 0.8f;
            if (stateAnimateFloat.getValue().floatValue() < 0.2f) {
                fFloatValue2 = stateAnimateFloat.getValue().floatValue() * 5;
            } else if (stateAnimateFloat.getValue().floatValue() > 0.8f) {
                fFloatValue2 = 5 * (1 - stateAnimateFloat.getValue().floatValue());
            } else {
                fFloatValue2 = 1.0f;
            }
            double d5 = fM6403constructorimpl2;
            BoxKt.Box(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(AlphaKt.alpha(ScaleKt.scale(OffsetKt.m628offsetVpY3zN4(Modifier.Companion, Dp.m6403constructorimpl((float) (Math.cos(radians) * d5)), Dp.m6403constructorimpl((float) (Math.sin(radians) * d5))), fFloatValue2), f6), Dp.m6403constructorimpl(6)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(a.f15978a, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: x3.Od
                @Override // O3.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i6 | 1);
                    int i8 = i5;
                    Qd.a(f5, (Composer) obj, i8, iUpdateChangedFlags);
                    return o.f154a;
                }
            });
        }
    }

    public static final void b(final float f5, Composer composer, final int i5) {
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1079356891);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(f5) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i6 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1079356891, i6, -1, "com.notescrafter.ui.screens.ProcessingIcon (ProcessingScreen.kt:182)");
            }
            InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition("processing_icon", composerStartRestartGroup, 6, 0);
            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(2500, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
            RepeatMode repeatMode = RepeatMode.Reverse;
            InfiniteRepeatableSpec infiniteRepeatableSpecM107infiniteRepeatable9IiC70o$default = AnimationSpecKt.m107infiniteRepeatable9IiC70o$default(tweenSpecTween$default, repeatMode, 0L, 4, null);
            int i7 = InfiniteTransition.$stable;
            int i8 = InfiniteRepeatableSpec.$stable << 9;
            int i9 = i7 | 25008 | i8;
            State<Float> stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 1.0f, 1.2f, infiniteRepeatableSpecM107infiniteRepeatable9IiC70o$default, "glow_pulse", composerStartRestartGroup, i9, 0);
            State<Float> stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.3f, 0.6f, AnimationSpecKt.m107infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(2500, 0, EasingKt.getFastOutSlowInEasing(), 2, null), repeatMode, 0L, 4, null), "glow_alpha", composerStartRestartGroup, i9, 0);
            State<Float> stateAnimateFloat3 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 1.1f, 1.0f, AnimationSpecKt.m107infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(2000, 0, EasingKt.getFastOutSlowInEasing(), 2, null), repeatMode, 0L, 4, null), "inner_glow_pulse", composerStartRestartGroup, i9, 0);
            State<Float> stateAnimateFloat4 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 360.0f, AnimationSpecKt.m107infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(4000, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), "rotate_outer", composerStartRestartGroup, i9, 0);
            State<Float> stateAnimateFloat5 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, -360.0f, AnimationSpecKt.m107infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(5000, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), "rotate_inner", composerStartRestartGroup, i7 | 24624 | i8, 0);
            State<Float> stateAnimateFloat6 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 1.0f, 1.05f, AnimationSpecKt.m107infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1500, 0, EasingKt.getFastOutSlowInEasing(), 2, null), repeatMode, 0L, 4, null), "logo_scale", composerStartRestartGroup, i9, 0);
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM713size3ABfNKs = SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(220));
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM713size3ABfNKs);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            O3.a constructor = companion3.getConstructor();
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
            e eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierClip = ClipKt.clip(ScaleKt.scale(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(ComposerKt.invocationKey)), stateAnimateFloat.getValue().floatValue()), RoundedCornerShapeKt.getCircleShape());
            Brush.Companion companion4 = Brush.Companion;
            long j5 = a.f15978a;
            Color colorM3917boximpl = Color.m3917boximpl(Color.m3926copywmQWz5c$default(j5, stateAnimateFloat2.getValue().floatValue(), 0.0f, 0.0f, 0.0f, 14, null));
            Color.Companion companion5 = Color.Companion;
            BoxKt.Box(BackgroundKt.background$default(modifierClip, Brush.Companion.m3880radialGradientP_VxKs$default(companion4, v.S(colorM3917boximpl, Color.m3917boximpl(companion5.m3962getTransparent0d7_KjU())), 0L, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composerStartRestartGroup, 0);
            BoxKt.Box(BackgroundKt.background$default(ClipKt.clip(ScaleKt.scale(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(160)), stateAnimateFloat3.getValue().floatValue()), RoundedCornerShapeKt.getCircleShape()), Brush.Companion.m3880radialGradientP_VxKs$default(companion4, v.S(Color.m3917boximpl(Color.m3926copywmQWz5c$default(a.f15979b, 0.4f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3917boximpl(companion5.m3962getTransparent0d7_KjU())), 0L, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composerStartRestartGroup, 0);
            Modifier modifierM713size3ABfNKs2 = SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(180));
            composerStartRestartGroup.startReplaceGroup(-2112409193);
            boolean z3 = (i6 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new c() { // from class: x3.Md
                    @Override // O3.c
                    public final Object invoke(Object obj) {
                        DrawScope Canvas = (DrawScope) obj;
                        kotlin.jvm.internal.o.f(Canvas, "$this$Canvas");
                        long j6 = a.f15978a;
                        float f6 = 4;
                        DrawScope.m4458drawCircleVaOC9Bg$default(Canvas, Color.m3926copywmQWz5c$default(j6, 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 0L, 0.0f, new Stroke(Canvas.mo349toPx0680j_4(Dp.m6403constructorimpl(f6)), 0.0f, 0, 0, null, 30, null), null, 0, 110, null);
                        DrawScope.m4455drawArcillE91I$default(Canvas, Brush.Companion.m3882sweepGradientUv8p0NA$default(Brush.Companion, v.S(Color.m3917boximpl(j6), Color.m3917boximpl(a.f15979b), Color.m3917boximpl(j6)), 0L, 2, (Object) null), -90.0f, f5 * 360.0f, false, 0L, 0L, 0.0f, new Stroke(Canvas.mo349toPx0680j_4(Dp.m6403constructorimpl(f6)), 0.0f, StrokeCap.Companion.m4280getRoundKaPHkGw(), 0, null, 26, null), null, 0, 880, null);
                        return o.f154a;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            CanvasKt.Canvas(modifierM713size3ABfNKs2, (c) objRememberedValue, composerStartRestartGroup, 6);
            Modifier modifierRotate = RotateKt.rotate(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(190)), stateAnimateFloat4.getValue().floatValue());
            composerStartRestartGroup.startReplaceGroup(-2112387282);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion6 = Composer.Companion;
            if (objRememberedValue2 == companion6.getEmpty()) {
                objRememberedValue2 = new C0135c(23);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            CanvasKt.Canvas(modifierRotate, (c) objRememberedValue2, composerStartRestartGroup, 48);
            Modifier modifierRotate2 = RotateKt.rotate(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(150)), stateAnimateFloat5.getValue().floatValue());
            composerStartRestartGroup.startReplaceGroup(-2112366821);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion6.getEmpty()) {
                objRememberedValue3 = new C0135c(24);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            CanvasKt.Canvas(modifierRotate2, (c) objRememberedValue3, composerStartRestartGroup, 48);
            Modifier modifierScale = ScaleKt.scale(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(80)), stateAnimateFloat6.getValue().floatValue());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierScale);
            O3.a constructor2 = companion3.getConstructor();
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
            e eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            float f6 = 60;
            BoxKt.Box(BackgroundKt.background$default(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f6)), Brush.Companion.m3880radialGradientP_VxKs$default(companion4, v.S(Color.m3917boximpl(Color.m3926copywmQWz5c$default(j5, 0.6f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3917boximpl(companion5.m3962getTransparent0d7_KjU())), 0L, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composerStartRestartGroup, 6);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_app_logo_foreground, composerStartRestartGroup, 0), (String) null, ClipKt.clip(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f6)), RoundedCornerShapeKt.getCircleShape()), (Alignment) null, ContentScale.Companion.getFit(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
            composerStartRestartGroup.endNode();
            a(0.75f, composerStartRestartGroup, 0, 54);
            a(1.5f, composerStartRestartGroup, 90, 54);
            a(2.25f, composerStartRestartGroup, 180, 54);
            a(3.0f, composerStartRestartGroup, 270, 54);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: x3.Nd
                @Override // O3.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                    Qd.b(f5, (Composer) obj, iUpdateChangedFlags);
                    return o.f154a;
                }
            });
        }
    }

    public static final void c(t progress, b adMobManager, Modifier modifier, Composer composer, int i5) {
        int i6;
        int i7;
        Composer composer2;
        Object obj;
        kotlin.jvm.internal.o.f(progress, "progress");
        kotlin.jvm.internal.o.f(adMobManager, "adMobManager");
        Composer composerStartRestartGroup = composer.startRestartGroup(1141886905);
        if ((i5 & 6) == 0) {
            i6 = i5 | (composerStartRestartGroup.changed(progress) ? 4 : 2);
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(adMobManager) ? 32 : 16;
        }
        int i8 = i6 | 384;
        if ((i8 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            obj = modifier;
            composer2 = composerStartRestartGroup;
        } else {
            Modifier.Companion companion = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1141886905, i8, -1, "com.notescrafter.ui.screens.ProcessingScreen (ProcessingScreen.kt:45)");
            }
            o oVar = o.f154a;
            composerStartRestartGroup.startReplaceGroup(-1718690385);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(adMobManager);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Pd(adMobManager, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(oVar, (e) objRememberedValue, composerStartRestartGroup, 6);
            Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(24), 0.0f, 2, null);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), companion2.getCenterHorizontally(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM670paddingVpY3zN4$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            O3.a constructor = companion3.getConstructor();
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
            e eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f5 = 32;
            p076s.b.m(f5, companion, composerStartRestartGroup, 6);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i9 = MaterialTheme.$stable;
            TextKt.m2432Text4IGK_g("Processing Document", (Modifier) null, a.f15990o, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i9).getHeadlineMedium(), composerStartRestartGroup, 196998, 0, 65498);
            float f6 = 8;
            p076s.b.m(f6, companion, composerStartRestartGroup, 6);
            TextStyle bodyMedium = materialTheme.getTypography(composerStartRestartGroup, i9).getBodyMedium();
            long j5 = a.p;
            TextAlign.Companion companion4 = TextAlign.Companion;
            Modifier.Companion companion5 = companion;
            TextKt.m2432Text4IGK_g("Please wait while we enhance your PDF.", (Modifier) null, j5, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion4.m6292getCentere0LSkKk()), 0L, 0, false, 2, 0, (c) null, bodyMedium, composerStartRestartGroup, 390, 3072, 56826);
            p097w3.t.a(6, 5, d.s(1, 2, 3, 4), null, composerStartRestartGroup, 438);
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion5, Dp.m6403constructorimpl(f5)), composerStartRestartGroup, 6);
            b(progress.getProgress(), composerStartRestartGroup, 0);
            p076s.b.m(48, companion5, composerStartRestartGroup, 6);
            Modifier modifierM699height3ABfNKs = SizeKt.m699height3ABfNKs(companion5, Dp.m6403constructorimpl(80));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopCenter(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM699height3ABfNKs);
            O3.a constructor2 = companion3.getConstructor();
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
            e eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            String status = progress.getStatus();
            composerStartRestartGroup.startReplaceGroup(-1258880520);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new C0135c(20);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            AnimatedContentKt.AnimatedContent(status, null, (c) objRememberedValue2, null, "status_text", null, AbstractC2443e3.f14952a, composerStartRestartGroup, 1597824, 42);
            composerStartRestartGroup.endNode();
            TextKt.m2432Text4IGK_g("Transforming pages into enhanced notes...", (Modifier) null, a.q, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion4.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i9).getBodyMedium(), composerStartRestartGroup, 390, 0, 65018);
            p076s.b.m(f5, companion5, composerStartRestartGroup, 6);
            Modifier modifierClip = ClipKt.clip(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), Dp.m6403constructorimpl(12)), RoundedCornerShapeKt.RoundedCornerShape(50));
            long j6 = a.f15978a;
            float f7 = 1;
            Modifier modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(modifierClip, Color.m3926copywmQWz5c$default(j6, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f7), Color.m3926copywmQWz5c$default(j6, 0.1f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.RoundedCornerShape(50));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM220borderxT4_qwU);
            O3.a constructor3 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3407constructorimpl3 = Updater.m3407constructorimpl(composerStartRestartGroup);
            e eVarG3 = p035i0.a.g(companion3, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl3, currentCompositionLocalMap3);
            if (composerM3407constructorimpl3.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
            }
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            BoxKt.Box(BackgroundKt.background$default(ClipKt.clip(SizeKt.fillMaxWidth(SizeKt.fillMaxHeight$default(companion5, 0.0f, 1, null), Q3.a.q(progress.getProgress(), 0.0f, 1.0f)), RoundedCornerShapeKt.RoundedCornerShape(50)), Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(j6), Color.m3917boximpl(a.f15979b), Color.m3917boximpl(j6)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion5, Dp.m6403constructorimpl(16)), composerStartRestartGroup, 6);
            AnimatedContentKt.AnimatedContent(Integer.valueOf(progress.getPercentComplete()), null, null, null, "percentage", null, AbstractC2443e3.f14953b, composerStartRestartGroup, 1597440, 46);
            if (progress.getProgress() > 0.0f) {
                int progress2 = (int) (((f7 - progress.getProgress()) / progress.getProgress()) * 10);
                if (progress2 < 1) {
                    progress2 = 1;
                }
                i7 = progress2;
            } else {
                i7 = 0;
            }
            composerStartRestartGroup.startReplaceGroup(1017330403);
            if (i7 > 0) {
                composer2 = composerStartRestartGroup;
                TextKt.m2432Text4IGK_g(p035i0.a.l("~", i7 / 60, "m ", i7 % 60, "s remaining"), PaddingKt.m672paddingqDBjuR0$default(companion5, 0.0f, Dp.m6403constructorimpl(f6), 0.0f, 0.0f, 13, null), j5, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i9).getBodySmall(), composer2, 432, 0, 65528);
            } else {
                composer2 = composerStartRestartGroup;
            }
            obj = companion5;
            if (p035i0.a.z(composer2)) {
                ComposerKt.traceEventEnd();
                obj = companion5;
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p097w3.a(progress, adMobManager, obj, i5, 7));
        }
    }
}
