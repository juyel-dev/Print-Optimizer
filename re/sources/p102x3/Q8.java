package p102x3;

import C3.C;
import C3.v;
import M0.f;
import O3.a;
import O3.c;
import O3.e;
import W.A;
import X3.C0194s;
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
import com.notescrafter.service.PDFProcessor;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2168g;
import kotlin.jvm.internal.o;
import p015d.l;
import p076s.b;
import p083t3.C2291i0;
import p097w3.j;
import p097w3.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Q8 {
    public static final void a(String str, ImageVector imageVector, String str2, String str3, Composer composer, int i5) {
        int i6;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(399575014);
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
                ComposerKt.traceEventStart(399575014, i6, -1, "com.notescrafter.ui.screens.MergeStepItem (PdfMergeScreen.kt:1057)");
            }
            composer2 = composerStartRestartGroup;
            j.a(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1960352351, true, new B8(imageVector, str, str3, str2), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new K5(str, imageVector, str2, str3, i5, 5));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(int i5, final a onBack, Composer composer, boolean z3) {
        int i6;
        final State<Float> state;
        State<Float> state2;
        Composer composer2;
        o.f(onBack, "onBack");
        Composer composerStartRestartGroup = composer.startRestartGroup(1429491088);
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
                ComposerKt.traceEventStart(1429491088, i6, -1, "com.notescrafter.ui.screens.PdfMergeScreen (PdfMergeScreen.kt:61)");
            }
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = AbstractC1421mz.e(EffectsKt.createCompositionCoroutineScope(F3.j.f418o, composerStartRestartGroup), composerStartRestartGroup);
            }
            final InterfaceC0200y coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            composerStartRestartGroup.startReplaceGroup(-1672574784);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new PDFProcessor(context);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final PDFProcessor pDFProcessor = (PDFProcessor) objRememberedValue2;
            Object objK = b.k(composerStartRestartGroup, -1672572677);
            if (objK == companion.getEmpty()) {
                objK = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(C.f167o, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK);
            }
            final MutableState mutableState = (MutableState) objK;
            Object objK2 = b.k(composerStartRestartGroup, -1672569952);
            if (objK2 == companion.getEmpty()) {
                objK2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK2);
            }
            final MutableState mutableState2 = (MutableState) objK2;
            Object objK3 = b.k(composerStartRestartGroup, -1672568035);
            if (objK3 == companion.getEmpty()) {
                objK3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK3);
            }
            final MutableState mutableState3 = (MutableState) objK3;
            Object objK4 = b.k(composerStartRestartGroup, -1672566166);
            if (objK4 == companion.getEmpty()) {
                objK4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("Processing...", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK4);
            }
            final MutableState mutableState4 = (MutableState) objK4;
            Object objK5 = b.k(composerStartRestartGroup, -1672563866);
            if (objK5 == companion.getEmpty()) {
                objK5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK5);
            }
            final MutableState mutableState5 = (MutableState) objK5;
            Object objK6 = b.k(composerStartRestartGroup, -1672561731);
            if (objK6 == companion.getEmpty()) {
                objK6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK6);
            }
            final MutableState mutableState6 = (MutableState) objK6;
            Object objK7 = b.k(composerStartRestartGroup, -1672559928);
            if (objK7 == companion.getEmpty()) {
                objK7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK7);
            }
            final MutableState mutableState7 = (MutableState) objK7;
            composerStartRestartGroup.endReplaceGroup();
            A a5 = new A(4);
            composerStartRestartGroup.startReplaceGroup(-1672552463);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(pDFProcessor);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                C2291i0 c2291i0 = new C2291i0(coroutineScope, context, pDFProcessor, mutableState, 4);
                composerStartRestartGroup.updateRememberedValue(c2291i0);
                objRememberedValue3 = c2291i0;
            }
            composerStartRestartGroup.endReplaceGroup();
            final l lVarV = p000a.a.v(a5, (c) objRememberedValue3, composerStartRestartGroup);
            Iterator it = ((List) mutableState.getValue()).iterator();
            int i7 = 0;
            while (it.hasNext()) {
                i7 += ((C6) it.next()).f13844d;
            }
            Iterator it2 = ((List) mutableState.getValue()).iterator();
            long j5 = 0;
            while (it2.hasNext()) {
                j5 += ((C6) it2.next()).f13843c;
            }
            InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition("halo", composerStartRestartGroup, 6, 0);
            final long j6 = j5;
            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(1500, 0, EasingFunctionsKt.getEaseInOutSine(), 2, null);
            RepeatMode repeatMode = RepeatMode.Reverse;
            InfiniteRepeatableSpec infiniteRepeatableSpecM107infiniteRepeatable9IiC70o$default = AnimationSpecKt.m107infiniteRepeatable9IiC70o$default(tweenSpecTween$default, repeatMode, 0L, 4, null);
            int i8 = InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9);
            final int i9 = i7;
            int i10 = i6;
            State<Float> stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.92f, 1.08f, infiniteRepeatableSpecM107infiniteRepeatable9IiC70o$default, "scale", composerStartRestartGroup, i8, 0);
            final State<Float> stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.35f, 0.75f, AnimationSpecKt.m107infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1500, 0, EasingFunctionsKt.getEaseInOutSine(), 2, null), repeatMode, 0L, 4, null), "opacity", composerStartRestartGroup, i8, 0);
            State<Float> stateAnimateFloat3 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 60.0f, AnimationSpecKt.m107infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1800, 0, EasingKt.getLinearEasing(), 2, null), repeatMode, 0L, 4, null), "scanY", composerStartRestartGroup, i8, 0);
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
            composerStartRestartGroup.startReplaceGroup(-800615003);
            boolean zChanged = composerStartRestartGroup.changed(i9) | ((i10 & 14) == 4) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changed(stateAnimateFloat2) | composerStartRestartGroup.changedInstance(lVarV) | composerStartRestartGroup.changed(stateAnimateFloat) | composerStartRestartGroup.changed(j6) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(pDFProcessor);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue4 == Composer.Companion.getEmpty()) {
                state = stateAnimateFloat;
                state2 = stateAnimateFloat3;
                c cVar = new c() { // from class: x3.A8
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // O3.c
                    public final Object invoke(Object obj) {
                        LazyListScope LazyColumn = (LazyListScope) obj;
                        o.f(LazyColumn, "$this$LazyColumn");
                        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(657385910, true, new C8(onBack)), 3, null);
                        MutableState mutableState8 = mutableState5;
                        File file = (File) mutableState8.getValue();
                        MutableState mutableState9 = mutableState;
                        Context context2 = context;
                        MutableState mutableState10 = mutableState6;
                        int i11 = i9;
                        MutableState mutableState11 = mutableState7;
                        if (file != null) {
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1887306427, true, new E8(context2, mutableState8, mutableState10, i11, mutableState9, mutableState11)), 3, null);
                        } else {
                            boolean zIsEmpty = ((List) mutableState9.getValue()).isEmpty();
                            l lVar = lVarV;
                            if (zIsEmpty) {
                                LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1260896361, true, new G8(lVar, stateAnimateFloat2, state)), 3, null);
                                LazyListScope.item$default(LazyColumn, null, null, AbstractC2648r1.f15468d, 3, null);
                                LazyListScope.item$default(LazyColumn, null, null, AbstractC2648r1.e, 3, null);
                                LazyListScope.item$default(LazyColumn, null, null, AbstractC2648r1.g, 3, null);
                            } else {
                                LazyListScope.item$default(LazyColumn, null, null, AbstractC2648r1.f15470h, 3, null);
                                LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1661909527, true, new I8(mutableState9, i11, j6)), 3, null);
                                List list = (List) mutableState9.getValue();
                                LazyColumn.items(list.size(), new p035i0.b(1, new C0194s(8), list), new V3(list, 2), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new N8(list, mutableState9, 0)));
                                LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-2039569098, true, new L8(lVar, i11, coroutineScope, pDFProcessor, context2, mutableState11, mutableState9, mutableState2, mutableState3, mutableState4, mutableState8, mutableState10)), 3, null);
                            }
                        }
                        return B3.o.f154a;
                    }
                };
                composer2 = composerStartRestartGroup;
                composer2.updateRememberedValue(cVar);
                objRememberedValue4 = cVar;
            } else {
                state = stateAnimateFloat;
                state2 = stateAnimateFloat3;
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierM670paddingVpY3zN4$default, null, paddingValuesM665PaddingValuesa9UjIt4$default, false, null, centerHorizontally, null, false, (c) objRememberedValue4, composer2, 196998, 218);
            composer2.endNode();
            if (((Boolean) mutableState2.getValue()).booleanValue()) {
                DialogProperties dialogProperties = new DialogProperties(false, false, false, 4, (AbstractC2168g) null);
                Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(companion2, 0.85f);
                composer2.startReplaceGroup(-1671055040);
                Object objRememberedValue5 = composer2.rememberedValue();
                if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                    objRememberedValue5 = new f(3);
                    composer2.updateRememberedValue(objRememberedValue5);
                }
                composer2.endReplaceGroup();
                n.a((a) objRememberedValue5, modifierFillMaxWidth, 0L, dialogProperties, ComposableLambdaKt.rememberComposableLambda(29436928, true, new M8(state, state2, mutableState4, mutableState3), composer2, 54), composer2, 27702, 4);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new J5(i5, z3, 5, onBack));
        }
    }

    public static final String c(long j5) {
        if (j5 <= 0) {
            return "0 B";
        }
        double d4 = j5;
        int iLog10 = (int) (Math.log10(d4) / Math.log10(1024.0d));
        return String.format("%.2f %s", Arrays.copyOf(new Object[]{Double.valueOf(d4 / Math.pow(1024.0d, iLog10)), new String[]{"B", "KB", "MB", "GB"}[iLog10]}, 2));
    }
}
