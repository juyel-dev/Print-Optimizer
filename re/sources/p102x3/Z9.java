package p102x3;

import C3.C;
import C3.C0121a;
import C3.u;
import C3.v;
import F3.j;
import M0.f;
import O3.a;
import O3.c;
import O3.e;
import W.A;
import X3.InterfaceC0200y;
import android.content.Context;
import android.net.Uri;
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
import androidx.compose.foundation.lazy.LazyListScope;
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
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC2168g;
import kotlin.jvm.internal.o;
import p015d.l;
import p076s.b;
import p097w3.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Z9 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(int i5, final a onBack, Composer composer, boolean z3) {
        int i6;
        State<Float> state;
        Modifier.Companion companion;
        Composer composer2;
        o.f(onBack, "onBack");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1737675184);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changedInstance(onBack) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i6 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1737675184, i6, -1, "com.notescrafter.ui.screens.PdfToJpgScreen (PdfToJpgScreen.kt:73)");
            }
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.Companion;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = AbstractC1421mz.e(EffectsKt.createCompositionCoroutineScope(j.f418o, composerStartRestartGroup), composerStartRestartGroup);
            }
            final InterfaceC0200y coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            composerStartRestartGroup.startReplaceGroup(-365546221);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final MutableState mutableState = (MutableState) objRememberedValue2;
            Object objK = b.k(composerStartRestartGroup, -365544053);
            if (objK == companion2.getEmpty()) {
                objK = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK);
            }
            final MutableState mutableState2 = (MutableState) objK;
            Object objK2 = b.k(composerStartRestartGroup, -365542133);
            if (objK2 == companion2.getEmpty()) {
                objK2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK2);
            }
            final MutableState mutableState3 = (MutableState) objK2;
            Object objK3 = b.k(composerStartRestartGroup, -365540438);
            if (objK3 == companion2.getEmpty()) {
                objK3 = b.b(0, null, 2, null, composerStartRestartGroup);
            }
            final MutableState mutableState4 = (MutableState) objK3;
            Object objK4 = b.k(composerStartRestartGroup, -365538599);
            if (objK4 == companion2.getEmpty()) {
                objK4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Y3.MEDIUM, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK4);
            }
            final MutableState mutableState5 = (MutableState) objK4;
            Object objK5 = b.k(composerStartRestartGroup, -365536370);
            if (objK5 == companion2.getEmpty()) {
                objK5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK5);
            }
            final MutableState mutableState6 = (MutableState) objK5;
            Object objK6 = b.k(composerStartRestartGroup, -365534389);
            if (objK6 == companion2.getEmpty()) {
                objK6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK6);
            }
            final MutableState mutableState7 = (MutableState) objK6;
            Object objK7 = b.k(composerStartRestartGroup, -365532533);
            if (objK7 == companion2.getEmpty()) {
                objK7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK7);
            }
            final MutableState mutableState8 = (MutableState) objK7;
            Object objK8 = b.k(composerStartRestartGroup, -365530546);
            if (objK8 == companion2.getEmpty()) {
                objK8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(C.f167o, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK8);
            }
            final MutableState mutableState9 = (MutableState) objK8;
            Object objK9 = b.k(composerStartRestartGroup, -365527628);
            if (objK9 == companion2.getEmpty()) {
                objK9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK9);
            }
            final MutableState mutableState10 = (MutableState) objK9;
            Object objK10 = b.k(composerStartRestartGroup, -365525546);
            if (objK10 == companion2.getEmpty()) {
                objK10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK10);
            }
            final MutableState mutableState11 = (MutableState) objK10;
            composerStartRestartGroup.endReplaceGroup();
            A a5 = new A(3);
            composerStartRestartGroup.startReplaceGroup(-365517924);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion2.getEmpty()) {
                objRememberedValue3 = new c() { // from class: x3.D9
                    @Override // O3.c
                    public final Object invoke(Object obj) {
                        Uri uri = (Uri) obj;
                        if (uri != null) {
                            X3.A.t(coroutineScope, null, null, new V9(null, context, uri, mutableState, mutableState9, mutableState10, mutableState11, mutableState2, mutableState3, mutableState4), 3);
                        }
                        return B3.o.f154a;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            final l lVarV = p000a.a.v(a5, (c) objRememberedValue3, composerStartRestartGroup);
            InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition("halo", composerStartRestartGroup, 6, 0);
            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(1500, 0, EasingFunctionsKt.getEaseInOutSine(), 2, null);
            RepeatMode repeatMode = RepeatMode.Reverse;
            InfiniteRepeatableSpec infiniteRepeatableSpecM107infiniteRepeatable9IiC70o$default = AnimationSpecKt.m107infiniteRepeatable9IiC70o$default(tweenSpecTween$default, repeatMode, 0L, 4, null);
            int i7 = InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9);
            int i8 = i6;
            final State<Float> stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.92f, 1.08f, infiniteRepeatableSpecM107infiniteRepeatable9IiC70o$default, "scale", composerStartRestartGroup, i7, 0);
            final State<Float> stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.35f, 0.75f, AnimationSpecKt.m107infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1500, 0, EasingFunctionsKt.getEaseInOutSine(), 2, null), repeatMode, 0L, 4, null), "opacity", composerStartRestartGroup, i7, 0);
            State<Float> stateAnimateFloat3 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 60.0f, AnimationSpecKt.m107infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1800, 0, EasingKt.getLinearEasing(), 2, null), repeatMode, 0L, 4, null), "scanY", composerStartRestartGroup, i7, 0);
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
            Alignment.Companion companion4 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
            a constructor = companion5.getConstructor();
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
            e eVarG = p035i0.a.g(companion5, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            BoxKt.Box(BackgroundKt.background$default(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), Brush.Companion.m3880radialGradientP_VxKs$default(Brush.Companion, v.S(Color.m3917boximpl(Color.m3926copywmQWz5c$default(p107y3.a.f15978a, 0.08f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3917boximpl(Color.Companion.m3962getTransparent0d7_KjU())), 0L, Dp.m6403constructorimpl(400), 0, 10, (Object) null), null, 0.0f, 6, null), composerStartRestartGroup, 0);
            Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), Dp.m6403constructorimpl(24), 0.0f, 2, null);
            PaddingValues paddingValuesM665PaddingValuesa9UjIt4$default = PaddingKt.m665PaddingValuesa9UjIt4$default(0.0f, Dp.m6403constructorimpl(16), 0.0f, Dp.m6403constructorimpl(40), 5, null);
            Alignment.Horizontal centerHorizontally = companion4.getCenterHorizontally();
            composerStartRestartGroup.startReplaceGroup(-2117057453);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(context) | ((i8 & 14) == 4) | composerStartRestartGroup.changed(stateAnimateFloat2) | composerStartRestartGroup.changedInstance(lVarV) | composerStartRestartGroup.changed(stateAnimateFloat) | composerStartRestartGroup.changedInstance(coroutineScope);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue4 == companion2.getEmpty()) {
                state = stateAnimateFloat3;
                companion = companion3;
                c cVar = new c() { // from class: x3.E9
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // O3.c
                    public final Object invoke(Object obj) {
                        LazyListScope LazyColumn = (LazyListScope) obj;
                        o.f(LazyColumn, "$this$LazyColumn");
                        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1785186934, true, new F9(onBack)), 3, null);
                        MutableState mutableState12 = mutableState9;
                        boolean zIsEmpty = ((List) mutableState12.getValue()).isEmpty();
                        MutableState mutableState13 = mutableState10;
                        Context context2 = context;
                        MutableState mutableState14 = mutableState;
                        MutableState mutableState15 = mutableState11;
                        if (!zIsEmpty) {
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1279859845, true, new G9(mutableState12)), 3, null);
                            File file = (File) mutableState13.getValue();
                            if (file != null) {
                                LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1853612048, true, new J9(context2, file)), 3, null);
                            }
                            LazyListScope.item$default(LazyColumn, null, null, W1.f14558d, 3, null);
                            ArrayList arrayListL0 = u.l0((List) mutableState12.getValue());
                            LazyColumn.items(arrayListL0.size(), null, new C0121a(arrayListL0, 9), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new T9(arrayListL0, arrayListL0, context2, 0)));
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-760050365, true, new K9(mutableState14, mutableState12, mutableState13, mutableState15)), 3, null);
                        } else if (((Uri) mutableState14.getValue()) == null) {
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-133095337, true, new M9(lVarV, stateAnimateFloat2, stateAnimateFloat)), 3, null);
                            LazyListScope.item$default(LazyColumn, null, null, W1.f14559f, 3, null);
                            LazyListScope.item$default(LazyColumn, null, null, W1.g, 3, null);
                            LazyListScope.item$default(LazyColumn, null, null, W1.f14561i, 3, null);
                        } else {
                            MutableState mutableState16 = mutableState3;
                            MutableState mutableState17 = mutableState2;
                            MutableState mutableState18 = mutableState4;
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1041214930, true, new O9(mutableState17, mutableState18, mutableState16, mutableState14)), 3, null);
                            MutableState mutableState19 = mutableState5;
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1505256745, true, new P9(mutableState19)), 3, null);
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-911768074, true, new R9(coroutineScope, context2, mutableState15, mutableState14, mutableState18, mutableState6, mutableState12, mutableState13, mutableState7, mutableState17, mutableState19, mutableState8)), 3, null);
                        }
                        return B3.o.f154a;
                    }
                };
                composer2 = composerStartRestartGroup;
                composer2.updateRememberedValue(cVar);
                objRememberedValue4 = cVar;
            } else {
                companion = companion3;
                state = stateAnimateFloat3;
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierM670paddingVpY3zN4$default, null, paddingValuesM665PaddingValuesa9UjIt4$default, false, null, centerHorizontally, null, false, (c) objRememberedValue4, composer2, 196998, 218);
            composer2.startReplaceGroup(-2115989652);
            if (((Boolean) mutableState6.getValue()).booleanValue()) {
                DialogProperties dialogProperties = new DialogProperties(false, false, false, 4, (AbstractC2168g) null);
                Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(companion, 0.85f);
                composer2.startReplaceGroup(-2115991699);
                Object objRememberedValue5 = composer2.rememberedValue();
                if (objRememberedValue5 == companion2.getEmpty()) {
                    objRememberedValue5 = new f(3);
                    composer2.updateRememberedValue(objRememberedValue5);
                }
                composer2.endReplaceGroup();
                n.a((a) objRememberedValue5, modifierFillMaxWidth, 0L, dialogProperties, ComposableLambdaKt.rememberComposableLambda(1286093050, true, new S9(stateAnimateFloat, state, mutableState8, mutableState7), composer2, 54), composer2, 27702, 4);
            }
            if (p035i0.a.z(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new J5(i5, z3, 8, onBack));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int b(MutableState mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }

    public static final void c(String str, ImageVector imageVector, String str2, String str3, Composer composer, int i5) {
        int i6;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1475610752);
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
                ComposerKt.traceEventStart(-1475610752, i6, -1, "com.notescrafter.ui.screens.PdfToJpgStepItem (PdfToJpgScreen.kt:1029)");
            }
            composer2 = composerStartRestartGroup;
            p097w3.j.a(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1752073243, true, new Y9(imageVector, str, str3, str2), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new K5(str, imageVector, str2, str3, i5, 8));
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
}
