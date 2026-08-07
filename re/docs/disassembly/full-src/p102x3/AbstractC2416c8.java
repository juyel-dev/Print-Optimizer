package p102x3;

import C3.v;
import F3.j;
import M0.f;
import O3.a;
import O3.c;
import O3.e;
import W.A;
import X3.InterfaceC0200y;
import android.content.Context;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingFunctionsKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.DialogProperties;
import com.google.android.gms.internal.ads.AbstractC1421mz;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC2168g;
import kotlin.jvm.internal.o;
import p015d.l;
import p076s.b;
import p097w3.n;

/* JADX INFO: renamed from: x3.c8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2416c8 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(int i5, a onBack, Composer composer, boolean z3) {
        int i6;
        State<Float> state;
        Composer composer2;
        int i7;
        int i8 = 3;
        o.f(onBack, "onBack");
        Composer composerStartRestartGroup = composer.startRestartGroup(1442556926);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changedInstance(onBack) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i6 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            i7 = 3;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1442556926, i6, -1, "com.notescrafter.ui.screens.PdfCropScreen (PdfCropScreen.kt:64)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = AbstractC1421mz.e(EffectsKt.createCompositionCoroutineScope(j.f418o, composerStartRestartGroup), composerStartRestartGroup);
            }
            InterfaceC0200y coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            composerStartRestartGroup.startReplaceGroup(499986313);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState = (MutableState) objRememberedValue2;
            Object objK = b.k(composerStartRestartGroup, 499988481);
            if (objK == companion.getEmpty()) {
                objK = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK);
            }
            MutableState mutableState2 = (MutableState) objK;
            Object objK2 = b.k(composerStartRestartGroup, 499990401);
            if (objK2 == companion.getEmpty()) {
                objK2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK2);
            }
            MutableState mutableState3 = (MutableState) objK2;
            Object objK3 = b.k(composerStartRestartGroup, 499992096);
            if (objK3 == companion.getEmpty()) {
                objK3 = b.b(0, null, 2, null, composerStartRestartGroup);
            }
            MutableState mutableState4 = (MutableState) objK3;
            Object objK4 = b.k(composerStartRestartGroup, 499993984);
            if (objK4 == companion.getEmpty()) {
                objK4 = b.b(1, null, 2, null, composerStartRestartGroup);
            }
            MutableState mutableState5 = (MutableState) objK4;
            Object objK5 = b.k(composerStartRestartGroup, 499995788);
            if (objK5 == companion.getEmpty()) {
                objK5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK5);
            }
            MutableState mutableState6 = (MutableState) objK5;
            Object objK6 = b.k(composerStartRestartGroup, 499998659);
            if (objK6 == companion.getEmpty()) {
                objK6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("10", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK6);
            }
            MutableState mutableState7 = (MutableState) objK6;
            Object objK7 = b.k(composerStartRestartGroup, 500000515);
            if (objK7 == companion.getEmpty()) {
                objK7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("10", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK7);
            }
            MutableState mutableState8 = (MutableState) objK7;
            Object objK8 = b.k(composerStartRestartGroup, 500002307);
            if (objK8 == companion.getEmpty()) {
                objK8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("10", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK8);
            }
            MutableState mutableState9 = (MutableState) objK8;
            Object objK9 = b.k(composerStartRestartGroup, 500004131);
            if (objK9 == companion.getEmpty()) {
                objK9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("10", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK9);
            }
            MutableState mutableState10 = (MutableState) objK9;
            Object objK10 = b.k(composerStartRestartGroup, 500006148);
            if (objK10 == companion.getEmpty()) {
                objK10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK10);
            }
            MutableState mutableState11 = (MutableState) objK10;
            Object objK11 = b.k(composerStartRestartGroup, 500008097);
            if (objK11 == companion.getEmpty()) {
                objK11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK11);
            }
            MutableState mutableState12 = (MutableState) objK11;
            Object objK12 = b.k(composerStartRestartGroup, 500009985);
            if (objK12 == companion.getEmpty()) {
                objK12 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK12);
            }
            MutableState mutableState13 = (MutableState) objK12;
            Object objK13 = b.k(composerStartRestartGroup, 500011978);
            if (objK13 == companion.getEmpty()) {
                objK13 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK13);
            }
            MutableState mutableState14 = (MutableState) objK13;
            Object objK14 = b.k(composerStartRestartGroup, 500014060);
            if (objK14 == companion.getEmpty()) {
                objK14 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK14);
            }
            MutableState mutableState15 = (MutableState) objK14;
            composerStartRestartGroup.endReplaceGroup();
            A a5 = new A(i8);
            composerStartRestartGroup.startReplaceGroup(500070254);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new A7(coroutineScope, context, mutableState11, mutableState12, mutableState15, mutableState14, mutableState6, mutableState5, mutableState13, mutableState, mutableState2, mutableState3, mutableState4, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            l lVarV = p000a.a.v(a5, (c) objRememberedValue3, composerStartRestartGroup);
            InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition("halo", composerStartRestartGroup, 6, 0);
            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(1500, 0, EasingFunctionsKt.getEaseInOutSine(), 2, null);
            RepeatMode repeatMode = RepeatMode.Reverse;
            InfiniteRepeatableSpec infiniteRepeatableSpecM107infiniteRepeatable9IiC70o$default = AnimationSpecKt.m107infiniteRepeatable9IiC70o$default(tweenSpecTween$default, repeatMode, 0L, 4, null);
            int i9 = InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9);
            int i10 = i6;
            State<Float> stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.92f, 1.08f, infiniteRepeatableSpecM107infiniteRepeatable9IiC70o$default, "scale", composerStartRestartGroup, i9, 0);
            State<Float> stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.35f, 0.75f, AnimationSpecKt.m107infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1500, 0, EasingFunctionsKt.getEaseInOutSine(), 2, null), repeatMode, 0L, 4, null), "opacity", composerStartRestartGroup, i9, 0);
            State<Float> stateAnimateFloat3 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 60.0f, AnimationSpecKt.m107infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1800, 0, EasingKt.getLinearEasing(), 2, null), repeatMode, 0L, 4, null), "scanY", composerStartRestartGroup, i9, 0);
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            a constructor = companion4.getConstructor();
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
            e eVarG = p035i0.a.g(companion4, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            BoxKt.Box(BackgroundKt.background$default(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), Brush.Companion.m3880radialGradientP_VxKs$default(Brush.Companion, v.S(Color.m3917boximpl(Color.m3926copywmQWz5c$default(p107y3.a.f15978a, 0.08f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3917boximpl(Color.Companion.m3962getTransparent0d7_KjU())), 0L, Dp.m6403constructorimpl(400), 0, 10, (Object) null), null, 0.0f, 6, null), composerStartRestartGroup, 0);
            Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), Dp.m6403constructorimpl(24), 0.0f, 2, null);
            PaddingValues paddingValuesM665PaddingValuesa9UjIt4$default = PaddingKt.m665PaddingValuesa9UjIt4$default(0.0f, Dp.m6403constructorimpl(16), 0.0f, Dp.m6403constructorimpl(40), 5, null);
            Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
            composerStartRestartGroup.startReplaceGroup(-383331717);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(context) | ((i10 & 14) == 4) | composerStartRestartGroup.changed(stateAnimateFloat2) | composerStartRestartGroup.changedInstance(lVarV) | composerStartRestartGroup.changed(stateAnimateFloat) | composerStartRestartGroup.changedInstance(coroutineScope);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue4 == companion.getEmpty()) {
                state = stateAnimateFloat;
                B7 b7 = new B7(onBack, mutableState14, mutableState4, mutableState7, mutableState8, mutableState9, mutableState10, context, mutableState, mutableState6, mutableState15, lVarV, stateAnimateFloat2, state, mutableState2, mutableState3, coroutineScope, mutableState5, mutableState11, mutableState12, mutableState13);
                composer2 = composerStartRestartGroup;
                composer2.updateRememberedValue(b7);
                objRememberedValue4 = b7;
            } else {
                state = stateAnimateFloat;
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierM670paddingVpY3zN4$default, null, paddingValuesM665PaddingValuesa9UjIt4$default, false, null, centerHorizontally, null, false, (c) objRememberedValue4, composer2, 196998, 218);
            composer2.startReplaceGroup(-382083551);
            if (((Boolean) mutableState11.getValue()).booleanValue()) {
                DialogProperties dialogProperties = new DialogProperties(false, false, false, 4, (AbstractC2168g) null);
                Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(companion2, 0.85f);
                composer2.startReplaceGroup(-382085597);
                Object objRememberedValue5 = composer2.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    i7 = 3;
                    objRememberedValue5 = new f(3);
                    composer2.updateRememberedValue(objRememberedValue5);
                } else {
                    i7 = 3;
                }
                composer2.endReplaceGroup();
                n.a((a) objRememberedValue5, modifierFillMaxWidth, 0L, dialogProperties, ComposableLambdaKt.rememberComposableLambda(-1074964184, true, new T7(state, stateAnimateFloat3, mutableState12, mutableState13), composer2, 54), composer2, 27702, 4);
            } else {
                i7 = 3;
            }
            if (p035i0.a.z(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new J5(i5, z3, i7, onBack));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int b(MutableState mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }

    public static final void c(String str, ImageVector imageVector, String str2, String str3, Composer composer, int i5) {
        int i6;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1315067662);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(imageVector) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changed(str2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i5 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changed(str3) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i6 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1315067662, i6, -1, "com.notescrafter.ui.screens.PdfCropStepItem (PdfCropScreen.kt:1149)");
            }
            composer2 = composerStartRestartGroup;
            p097w3.j.a(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1458371945, true, new C2400b8(imageVector, str, str3, str2), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new K5(str, imageVector, str2, str3, i5, 3));
        }
    }

    public static final String d(long j5) {
        if (j5 <= 0) {
            return "0 B";
        }
        double d4 = j5;
        int iLog10 = (int) (Math.log10(d4) / Math.log10(1024.0d));
        return String.format("%.2f %s", Arrays.copyOf(new Object[]{Double.valueOf(d4 / Math.pow(1024.0d, iLog10)), new String[]{"B", "KB", "MB", "GB"}[iLog10]}, 2));
    }

    public static final void e(MutableState mutableState, boolean z3) {
        mutableState.setValue(Boolean.valueOf(z3));
    }
}
