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
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC2168g;
import kotlin.jvm.internal.o;
import p015d.l;
import p076s.b;
import p097w3.n;

/* JADX INFO: renamed from: x3.e7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2447e7 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(int i5, final a onBack, Composer composer, boolean z3) {
        int i6;
        final State<Float> state;
        Modifier.Companion companion;
        Composer composer2;
        int i7;
        int i8 = 3;
        o.f(onBack, "onBack");
        Composer composerStartRestartGroup = composer.startRestartGroup(800500522);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changedInstance(onBack) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i6 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            i7 = 1;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(800500522, i6, -1, "com.notescrafter.ui.screens.PdfAddPageNumbersScreen (PdfAddPageNumbersScreen.kt:74)");
            }
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.Companion;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = AbstractC1421mz.e(EffectsKt.createCompositionCoroutineScope(j.f418o, composerStartRestartGroup), composerStartRestartGroup);
            }
            final InterfaceC0200y coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            composerStartRestartGroup.startReplaceGroup(-2128294797);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final MutableState mutableState = (MutableState) objRememberedValue2;
            Object objK = b.k(composerStartRestartGroup, -2128292629);
            if (objK == companion2.getEmpty()) {
                objK = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK);
            }
            final MutableState mutableState2 = (MutableState) objK;
            Object objK2 = b.k(composerStartRestartGroup, -2128290709);
            if (objK2 == companion2.getEmpty()) {
                objK2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK2);
            }
            final MutableState mutableState3 = (MutableState) objK2;
            Object objK3 = b.k(composerStartRestartGroup, -2128289014);
            if (objK3 == companion2.getEmpty()) {
                objK3 = b.b(0, null, 2, null, composerStartRestartGroup);
            }
            final MutableState mutableState4 = (MutableState) objK3;
            Object objK4 = b.k(composerStartRestartGroup, -2128287205);
            if (objK4 == companion2.getEmpty()) {
                objK4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(F6.f13951s, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK4);
            }
            final MutableState mutableState5 = (MutableState) objK4;
            Object objK5 = b.k(composerStartRestartGroup, -2128285092);
            if (objK5 == companion2.getEmpty()) {
                objK5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(E6.f13911o, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK5);
            }
            final MutableState mutableState6 = (MutableState) objK5;
            Object objK6 = b.k(composerStartRestartGroup, -2128282739);
            if (objK6 == companion2.getEmpty()) {
                objK6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("12", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK6);
            }
            final MutableState mutableState7 = (MutableState) objK6;
            Object objK7 = b.k(composerStartRestartGroup, -2128280820);
            if (objK7 == companion2.getEmpty()) {
                objK7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("1", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK7);
            }
            final MutableState mutableState8 = (MutableState) objK7;
            Object objK8 = b.k(composerStartRestartGroup, -2128278932);
            if (objK8 == companion2.getEmpty()) {
                objK8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("0", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK8);
            }
            final MutableState mutableState9 = (MutableState) objK8;
            Object objK9 = b.k(composerStartRestartGroup, -2128276946);
            if (objK9 == companion2.getEmpty()) {
                objK9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK9);
            }
            final MutableState mutableState10 = (MutableState) objK9;
            Object objK10 = b.k(composerStartRestartGroup, -2128274975);
            if (objK10 == companion2.getEmpty()) {
                objK10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("Adding page numbers...", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK10);
            }
            final MutableState mutableState11 = (MutableState) objK10;
            Object objK11 = b.k(composerStartRestartGroup, -2128272405);
            if (objK11 == companion2.getEmpty()) {
                objK11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK11);
            }
            final MutableState mutableState12 = (MutableState) objK11;
            Object objK12 = b.k(composerStartRestartGroup, -2128270412);
            if (objK12 == companion2.getEmpty()) {
                objK12 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK12);
            }
            final MutableState mutableState13 = (MutableState) objK12;
            Object objK13 = b.k(composerStartRestartGroup, -2128268330);
            if (objK13 == companion2.getEmpty()) {
                objK13 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK13);
            }
            final MutableState mutableState14 = (MutableState) objK13;
            composerStartRestartGroup.endReplaceGroup();
            A a5 = new A(i8);
            composerStartRestartGroup.startReplaceGroup(-2128260755);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion2.getEmpty()) {
                objRememberedValue3 = new c() { // from class: x3.H6
                    @Override // O3.c
                    public final Object invoke(Object obj) {
                        Uri uri = (Uri) obj;
                        if (uri != null) {
                            X3.A.t(coroutineScope, null, null, new Z6(context, uri, mutableState, mutableState13, mutableState14, mutableState2, mutableState3, mutableState4, null), 3);
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
            int i9 = InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9);
            int i10 = i6;
            State<Float> stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.92f, 1.08f, infiniteRepeatableSpecM107infiniteRepeatable9IiC70o$default, "scale", composerStartRestartGroup, i9, 0);
            final State<Float> stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.35f, 0.75f, AnimationSpecKt.m107infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1500, 0, EasingFunctionsKt.getEaseInOutSine(), 2, null), repeatMode, 0L, 4, null), "opacity", composerStartRestartGroup, i9, 0);
            State<Float> stateAnimateFloat3 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 60.0f, AnimationSpecKt.m107infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1800, 0, EasingKt.getLinearEasing(), 2, null), repeatMode, 0L, 4, null), "scanY", composerStartRestartGroup, i9, 0);
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
            composerStartRestartGroup.startReplaceGroup(713886508);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(context) | ((i10 & 14) == 4) | composerStartRestartGroup.changed(stateAnimateFloat2) | composerStartRestartGroup.changedInstance(lVarV) | composerStartRestartGroup.changed(stateAnimateFloat) | composerStartRestartGroup.changedInstance(coroutineScope);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue4 == companion2.getEmpty()) {
                state = stateAnimateFloat;
                companion = companion3;
                c cVar = new c() { // from class: x3.I6
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // O3.c
                    public final Object invoke(Object obj) {
                        LazyListScope LazyColumn = (LazyListScope) obj;
                        o.f(LazyColumn, "$this$LazyColumn");
                        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1844655664, true, new J6(onBack)), 3, null);
                        MutableState mutableState15 = mutableState13;
                        File file = (File) mutableState15.getValue();
                        MutableState mutableState16 = mutableState4;
                        MutableState mutableState17 = mutableState5;
                        MutableState mutableState18 = mutableState6;
                        MutableState mutableState19 = mutableState7;
                        MutableState mutableState20 = mutableState8;
                        MutableState mutableState21 = mutableState9;
                        Context context2 = context;
                        MutableState mutableState22 = mutableState;
                        MutableState mutableState23 = mutableState14;
                        if (file != null) {
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1836813205, true, new L6(context2, mutableState15, mutableState16, mutableState17, mutableState18, mutableState19, mutableState20, mutableState21, mutableState22, mutableState23)), 3, null);
                        } else if (((Uri) mutableState22.getValue()) == null) {
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1129657999, true, new N6(lVarV, stateAnimateFloat2, state)), 3, null);
                            LazyListScope.item$default(LazyColumn, null, null, E0.e, 3, null);
                            LazyListScope.item$default(LazyColumn, null, null, E0.f13897f, 3, null);
                            LazyListScope.item$default(LazyColumn, null, null, E0.f13898h, 3, null);
                        } else {
                            MutableState mutableState24 = mutableState3;
                            MutableState mutableState25 = mutableState2;
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1013460088, true, new Q6(mutableState25, mutableState16, mutableState24, mutableState22)), 3, null);
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1859673103, true, new S6(mutableState17)), 3, null);
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1977309872, true, new T6(mutableState18)), 3, null);
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-2094946641, true, new U6(mutableState19, mutableState20, mutableState21)), 3, null);
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(2082383886, true, new W6(coroutineScope, context2, mutableState23, mutableState22, mutableState16, mutableState19, mutableState20, mutableState21, mutableState10, mutableState15, mutableState12, mutableState25, mutableState11, mutableState18, mutableState17)), 3, null);
                        }
                        return B3.o.f154a;
                    }
                };
                composer2 = composerStartRestartGroup;
                composer2.updateRememberedValue(cVar);
                objRememberedValue4 = cVar;
            } else {
                state = stateAnimateFloat;
                companion = companion3;
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierM670paddingVpY3zN4$default, null, paddingValuesM665PaddingValuesa9UjIt4$default, false, null, centerHorizontally, null, false, (c) objRememberedValue4, composer2, 196998, 218);
            composer2.startReplaceGroup(715404473);
            if (((Boolean) mutableState10.getValue()).booleanValue()) {
                DialogProperties dialogProperties = new DialogProperties(false, false, false, 4, (AbstractC2168g) null);
                Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(companion, 0.85f);
                composer2.startReplaceGroup(715402413);
                Object objRememberedValue5 = composer2.rememberedValue();
                if (objRememberedValue5 == companion2.getEmpty()) {
                    objRememberedValue5 = new f(3);
                    composer2.updateRememberedValue(objRememberedValue5);
                }
                composer2.endReplaceGroup();
                i7 = 1;
                n.a((a) objRememberedValue5, modifierFillMaxWidth, 0L, dialogProperties, ComposableLambdaKt.rememberComposableLambda(-1507319980, true, new X6(state, stateAnimateFloat3, mutableState11, mutableState12), composer2, 54), composer2, 27702, 4);
            } else {
                i7 = 1;
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

    public static final String c(int i5, boolean z3) {
        int[] iArr = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] strArr = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String strL = "";
        int i6 = i5;
        for (int i7 = 0; i7 < 13; i7++) {
            while (i6 >= iArr[i7]) {
                strL = androidx.compose.foundation.text.modifiers.a.l(strL, strArr[i7]);
                i6 -= iArr[i7];
            }
        }
        if (z3) {
            return strL;
        }
        String lowerCase = strL.toLowerCase(Locale.ROOT);
        o.e(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static final void d(String str, ImageVector imageVector, String str2, String str3, Composer composer, int i5) {
        int i6;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1086645490);
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
                ComposerKt.traceEventStart(1086645490, i6, -1, "com.notescrafter.ui.screens.PdfAddPageNumbersStepItem (PdfAddPageNumbersScreen.kt:1293)");
            }
            composer2 = composerStartRestartGroup;
            p097w3.j.a(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(933886487, true, new C2431d7(imageVector, str, str3, str2), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new K5(str, imageVector, str2, str3, i5, 1));
        }
    }

    public static final String e(long j5) {
        if (j5 <= 0) {
            return "0 B";
        }
        double d4 = j5;
        int iLog10 = (int) (Math.log10(d4) / Math.log10(1024.0d));
        return String.format("%.2f %s", Arrays.copyOf(new Object[]{Double.valueOf(d4 / Math.pow(1024.0d, iLog10)), new String[]{"B", "KB", "MB", "GB"}[iLog10]}, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String f(int i5, int i6, MutableState mutableState) {
        int iOrdinal = ((E6) mutableState.getValue()).ordinal();
        if (iOrdinal == 1) {
            return AbstractC1421mz.h(i5, "Page ");
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                return iOrdinal != 4 ? String.valueOf(i5) : c(i5, true);
            }
            return c(i5, false);
        }
        return i5 + " of " + i6;
    }
}
