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
import android.graphics.Bitmap;
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
import com.notescrafter.service.PDFProcessor;
import java.io.File;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC2168g;
import kotlin.jvm.internal.o;
import p015d.l;
import p076s.b;
import p097w3.n;

/* JADX INFO: renamed from: x3.z8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2783z8 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(int i5, final a onBack, Composer composer, boolean z3) {
        int i6;
        final State<Float> state;
        State<Float> state2;
        final MutableState mutableState;
        Composer composer2;
        int i7 = 3;
        o.f(onBack, "onBack");
        Composer composerStartRestartGroup = composer.startRestartGroup(466578482);
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
                ComposerKt.traceEventStart(466578482, i6, -1, "com.notescrafter.ui.screens.PdfInvertScreen (PdfInvertScreen.kt:62)");
            }
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = AbstractC1421mz.e(EffectsKt.createCompositionCoroutineScope(j.f418o, composerStartRestartGroup), composerStartRestartGroup);
            }
            final InterfaceC0200y coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            composerStartRestartGroup.startReplaceGroup(-1062684982);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new PDFProcessor(context);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final PDFProcessor pDFProcessor = (PDFProcessor) objRememberedValue2;
            Object objK = b.k(composerStartRestartGroup, -1062682833);
            if (objK == companion.getEmpty()) {
                objK = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK);
            }
            final MutableState mutableState2 = (MutableState) objK;
            Object objK2 = b.k(composerStartRestartGroup, -1062680665);
            if (objK2 == companion.getEmpty()) {
                objK2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK2);
            }
            final MutableState mutableState3 = (MutableState) objK2;
            Object objK3 = b.k(composerStartRestartGroup, -1062678745);
            if (objK3 == companion.getEmpty()) {
                objK3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK3);
            }
            final MutableState mutableState4 = (MutableState) objK3;
            Object objK4 = b.k(composerStartRestartGroup, -1062677050);
            if (objK4 == companion.getEmpty()) {
                objK4 = b.b(0, null, 2, null, composerStartRestartGroup);
            }
            final MutableState mutableState5 = (MutableState) objK4;
            Object objK5 = b.k(composerStartRestartGroup, -1062675162);
            if (objK5 == companion.getEmpty()) {
                objK5 = b.b(1, null, 2, null, composerStartRestartGroup);
            }
            final MutableState mutableState6 = (MutableState) objK5;
            Object objK6 = b.k(composerStartRestartGroup, -1062673358);
            if (objK6 == companion.getEmpty()) {
                objK6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK6);
            }
            final MutableState mutableState7 = (MutableState) objK6;
            Object objK7 = b.k(composerStartRestartGroup, -1062671062);
            if (objK7 == companion.getEmpty()) {
                objK7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK7);
            }
            final MutableState mutableState8 = (MutableState) objK7;
            Object objK8 = b.k(composerStartRestartGroup, -1062669081);
            if (objK8 == companion.getEmpty()) {
                objK8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK8);
            }
            final MutableState mutableState9 = (MutableState) objK8;
            Object objK9 = b.k(composerStartRestartGroup, -1062667225);
            if (objK9 == companion.getEmpty()) {
                objK9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK9);
            }
            MutableState mutableState10 = (MutableState) objK9;
            Object objK10 = b.k(composerStartRestartGroup, -1062665232);
            if (objK10 == companion.getEmpty()) {
                objK10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK10);
            }
            final MutableState mutableState11 = (MutableState) objK10;
            Object objK11 = b.k(composerStartRestartGroup, -1062663150);
            if (objK11 == companion.getEmpty()) {
                objK11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK11);
            }
            final MutableState mutableState12 = (MutableState) objK11;
            composerStartRestartGroup.endReplaceGroup();
            A a5 = new A(i7);
            composerStartRestartGroup.startReplaceGroup(-1062606956);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new A7(coroutineScope, context, mutableState8, mutableState10, mutableState12, mutableState11, mutableState7, mutableState6, mutableState9, mutableState2, mutableState3, mutableState4, mutableState5, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            final l lVarV = p000a.a.v(a5, (c) objRememberedValue3, composerStartRestartGroup);
            InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition("halo", composerStartRestartGroup, 6, 0);
            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(1500, 0, EasingFunctionsKt.getEaseInOutSine(), 2, null);
            RepeatMode repeatMode = RepeatMode.Reverse;
            InfiniteRepeatableSpec infiniteRepeatableSpecM107infiniteRepeatable9IiC70o$default = AnimationSpecKt.m107infiniteRepeatable9IiC70o$default(tweenSpecTween$default, repeatMode, 0L, 4, null);
            int i8 = InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9);
            int i9 = i6;
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
            composerStartRestartGroup.startReplaceGroup(-677378324);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(context) | ((i9 & 14) == 4) | composerStartRestartGroup.changed(stateAnimateFloat2) | composerStartRestartGroup.changedInstance(lVarV) | composerStartRestartGroup.changed(stateAnimateFloat) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(pDFProcessor);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue4 == companion.getEmpty()) {
                state = stateAnimateFloat;
                state2 = stateAnimateFloat3;
                mutableState = mutableState10;
                c cVar = new c() { // from class: x3.d8
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // O3.c
                    public final Object invoke(Object obj) {
                        LazyListScope LazyColumn = (LazyListScope) obj;
                        o.f(LazyColumn, "$this$LazyColumn");
                        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1502844632, true, new C2448e8(onBack)), 3, null);
                        MutableState mutableState13 = mutableState11;
                        File file = (File) mutableState13.getValue();
                        MutableState mutableState14 = mutableState5;
                        Context context2 = context;
                        MutableState mutableState15 = mutableState2;
                        MutableState mutableState16 = mutableState7;
                        MutableState mutableState17 = mutableState12;
                        if (file != null) {
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1954512227, true, new C2480g8(context2, mutableState13, mutableState14, mutableState15, mutableState16, mutableState17)), 3, null);
                        } else if (((Uri) mutableState15.getValue()) == null) {
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(574552185, true, new C2512i8(lVarV, stateAnimateFloat2, state)), 3, null);
                            LazyListScope.item$default(LazyColumn, null, null, AbstractC2489h1.e, 3, null);
                            LazyListScope.item$default(LazyColumn, null, null, AbstractC2489h1.f15137f, 3, null);
                            LazyListScope.item$default(LazyColumn, null, null, AbstractC2489h1.f15138h, 3, null);
                        } else {
                            MutableState mutableState18 = mutableState4;
                            MutableState mutableState19 = mutableState3;
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-250015600, true, new C2544k8(mutableState19, mutableState14, mutableState18, mutableState15, mutableState16)), 3, null);
                            Bitmap bitmap = (Bitmap) mutableState16.getValue();
                            InterfaceC0200y interfaceC0200y = coroutineScope;
                            if (bitmap != null) {
                                LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(102766162, true, new C2560l8(bitmap)), 3, null);
                                if (AbstractC2783z8.b(mutableState14) > 1) {
                                    LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1158702509, true, new C2608o8(interfaceC0200y, context2, mutableState6, mutableState15, mutableState14, mutableState16)), 3, null);
                                }
                            }
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(482398969, true, new C2640q8(interfaceC0200y, context2, mutableState17, mutableState15, mutableState14, mutableState8, mutableState, mutableState13, mutableState9, mutableState19, pDFProcessor)), 3, null);
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
                mutableState = mutableState10;
            }
            composer2.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierM670paddingVpY3zN4$default, null, paddingValuesM665PaddingValuesa9UjIt4$default, false, null, centerHorizontally, null, false, (c) objRememberedValue4, composer2, 196998, 218);
            composer2.startReplaceGroup(-676333169);
            if (((Boolean) mutableState8.getValue()).booleanValue()) {
                DialogProperties dialogProperties = new DialogProperties(false, false, false, 4, (AbstractC2168g) null);
                Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(companion2, 0.85f);
                composer2.startReplaceGroup(-676335223);
                Object objRememberedValue5 = composer2.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new f(3);
                    composer2.updateRememberedValue(objRememberedValue5);
                }
                composer2.endReplaceGroup();
                n.a((a) objRememberedValue5, modifierFillMaxWidth, 0L, dialogProperties, ComposableLambdaKt.rememberComposableLambda(-1385008036, true, new C2655r8(state, state2, mutableState, mutableState9), composer2, 54), composer2, 27702, 4);
            }
            if (p035i0.a.z(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new J5(i5, z3, 4, onBack));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int b(MutableState mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }

    public static final void c(String str, ImageVector imageVector, String str2, String str3, Composer composer, int i5) {
        int i6;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1236322418);
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
                ComposerKt.traceEventStart(1236322418, i6, -1, "com.notescrafter.ui.screens.PdfInvertStepItem (PdfInvertScreen.kt:992)");
            }
            composer2 = composerStartRestartGroup;
            p097w3.j.a(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1843840919, true, new C2767y8(imageVector, str, str3, str2), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new K5(str, imageVector, str2, str3, i5, 4));
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
