package p102x3;

import C3.v;
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
import com.notescrafter.service.PDFProcessor;
import java.io.File;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC2168g;
import kotlin.jvm.internal.o;
import p015d.l;
import p076s.b;
import p097w3.j;
import p097w3.n;

/* JADX INFO: renamed from: x3.z7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2782z7 {
    public static final void a(String str, ImageVector imageVector, String str2, String str3, Composer composer, int i5) {
        int i6;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-866871108);
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
                ComposerKt.traceEventStart(-866871108, i6, -1, "com.notescrafter.ui.screens.CompressStepItem (PdfCompressScreen.kt:1154)");
            }
            composer2 = composerStartRestartGroup;
            j.a(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(786333239, true, new C2495h7(imageVector, str, str3, str2), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new K5(str, imageVector, str2, str3, i5, 2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:88:0x02ca  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(int i5, final a onBack, Composer composer, boolean z3) {
        int i6;
        int iLongValue;
        final State<Float> state;
        Composer composer2;
        o.f(onBack, "onBack");
        Composer composerStartRestartGroup = composer.startRestartGroup(-320236838);
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
                ComposerKt.traceEventStart(-320236838, i6, -1, "com.notescrafter.ui.screens.PdfCompressScreen (PdfCompressScreen.kt:62)");
            }
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = AbstractC1421mz.e(EffectsKt.createCompositionCoroutineScope(F3.j.f418o, composerStartRestartGroup), composerStartRestartGroup);
            }
            final InterfaceC0200y coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            composerStartRestartGroup.startReplaceGroup(-1079295978);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new PDFProcessor(context);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final PDFProcessor pDFProcessor = (PDFProcessor) objRememberedValue2;
            Object objK = b.k(composerStartRestartGroup, -1079293829);
            if (objK == companion.getEmpty()) {
                objK = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK);
            }
            final MutableState mutableState = (MutableState) objK;
            Object objK2 = b.k(composerStartRestartGroup, -1079291661);
            if (objK2 == companion.getEmpty()) {
                objK2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK2);
            }
            final MutableState mutableState2 = (MutableState) objK2;
            Object objK3 = b.k(composerStartRestartGroup, -1079289741);
            if (objK3 == companion.getEmpty()) {
                objK3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK3);
            }
            final MutableState mutableState3 = (MutableState) objK3;
            Object objK4 = b.k(composerStartRestartGroup, -1079288046);
            if (objK4 == companion.getEmpty()) {
                objK4 = b.b(0, null, 2, null, composerStartRestartGroup);
            }
            final MutableState mutableState4 = (MutableState) objK4;
            Object objK5 = b.k(composerStartRestartGroup, -1079286109);
            if (objK5 == companion.getEmpty()) {
                objK5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(EnumC2778z3.f15797o, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK5);
            }
            final MutableState mutableState5 = (MutableState) objK5;
            Object objK6 = b.k(composerStartRestartGroup, -1079283672);
            if (objK6 == companion.getEmpty()) {
                objK6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(A3.p, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK6);
            }
            final MutableState mutableState6 = (MutableState) objK6;
            Object objK7 = b.k(composerStartRestartGroup, -1079281132);
            if (objK7 == companion.getEmpty()) {
                objK7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("1", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK7);
            }
            final MutableState mutableState7 = (MutableState) objK7;
            Object objK8 = b.k(composerStartRestartGroup, -1079279236);
            if (objK8 == companion.getEmpty()) {
                objK8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(EnumC2614oe.p, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK8);
            }
            final MutableState mutableState8 = (MutableState) objK8;
            Object objK9 = b.k(composerStartRestartGroup, -1079277002);
            if (objK9 == companion.getEmpty()) {
                objK9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK9);
            }
            final MutableState mutableState9 = (MutableState) objK9;
            Object objK10 = b.k(composerStartRestartGroup, -1079274990);
            if (objK10 == companion.getEmpty()) {
                objK10 = b.b(0, null, 2, null, composerStartRestartGroup);
            }
            final MutableState mutableState10 = (MutableState) objK10;
            Object objK11 = b.k(composerStartRestartGroup, -1079273262);
            int i7 = i6;
            if (objK11 == companion.getEmpty()) {
                objK11 = b.b(1, null, 2, null, composerStartRestartGroup);
            }
            final MutableState mutableState11 = (MutableState) objK11;
            Object objK12 = b.k(composerStartRestartGroup, -1079271277);
            if (objK12 == companion.getEmpty()) {
                objK12 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK12);
            }
            final MutableState mutableState12 = (MutableState) objK12;
            Object objK13 = b.k(composerStartRestartGroup, -1079269407);
            if (objK13 == companion.getEmpty()) {
                objK13 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("Compressing...", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK13);
            }
            final MutableState mutableState13 = (MutableState) objK13;
            Object objK14 = b.k(composerStartRestartGroup, -1079266948);
            if (objK14 == companion.getEmpty()) {
                objK14 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK14);
            }
            final MutableState mutableState14 = (MutableState) objK14;
            Object objK15 = b.k(composerStartRestartGroup, -1079264813);
            if (objK15 == companion.getEmpty()) {
                objK15 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK15);
            }
            final MutableState mutableState15 = (MutableState) objK15;
            Object objK16 = b.k(composerStartRestartGroup, -1079262754);
            if (objK16 == companion.getEmpty()) {
                objK16 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK16);
            }
            final MutableState mutableState16 = (MutableState) objK16;
            Object objK17 = b.k(composerStartRestartGroup, -1079260610);
            if (objK17 == companion.getEmpty()) {
                objK17 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK17);
            }
            final MutableState mutableState17 = (MutableState) objK17;
            composerStartRestartGroup.endReplaceGroup();
            A a5 = new A(3);
            composerStartRestartGroup.startReplaceGroup(-1079253630);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(pDFProcessor);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new C2463f7(coroutineScope, context, pDFProcessor, mutableState, mutableState14, mutableState17, mutableState16, mutableState2, mutableState3, mutableState4, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            final l lVarV = p000a.a.v(a5, (c) objRememberedValue3, composerStartRestartGroup);
            if (((File) mutableState14.getValue()) == null || ((Number) mutableState3.getValue()).longValue() <= 0) {
                iLongValue = 0;
            } else {
                long jLongValue = ((Number) mutableState3.getValue()).longValue() - ((Number) mutableState15.getValue()).longValue();
                if (jLongValue > 0) {
                    iLongValue = (int) ((jLongValue * ((long) 100)) / ((Number) mutableState3.getValue()).longValue());
                } else {
                    iLongValue = 0;
                }
            }
            InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition("halo", composerStartRestartGroup, 6, 0);
            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(1500, 0, EasingFunctionsKt.getEaseInOutSine(), 2, null);
            RepeatMode repeatMode = RepeatMode.Reverse;
            InfiniteRepeatableSpec infiniteRepeatableSpecM107infiniteRepeatable9IiC70o$default = AnimationSpecKt.m107infiniteRepeatable9IiC70o$default(tweenSpecTween$default, repeatMode, 0L, 4, null);
            int i8 = InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9);
            final int i9 = iLongValue;
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
            composerStartRestartGroup.startReplaceGroup(-1201231889);
            boolean zChanged = composerStartRestartGroup.changed(i9) | ((i7 & 14) == 4) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changed(stateAnimateFloat2) | composerStartRestartGroup.changedInstance(lVarV) | composerStartRestartGroup.changed(stateAnimateFloat) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(pDFProcessor);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                state = stateAnimateFloat;
                c cVar = new c() { // from class: x3.g7
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // O3.c
                    public final Object invoke(Object obj) {
                        LazyListScope LazyColumn = (LazyListScope) obj;
                        o.f(LazyColumn, "$this$LazyColumn");
                        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(28048000, true, new C2511i7(onBack)), 3, null);
                        MutableState mutableState18 = mutableState14;
                        File file = (File) mutableState18.getValue();
                        Context context2 = context;
                        MutableState mutableState19 = mutableState16;
                        MutableState mutableState20 = mutableState3;
                        MutableState mutableState21 = mutableState15;
                        MutableState mutableState22 = mutableState;
                        MutableState mutableState23 = mutableState17;
                        if (file != null) {
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1476623301, true, new C2575m7(i9, context2, mutableState19, mutableState18, mutableState20, mutableState21, mutableState22, mutableState23)), 3, null);
                        } else if (((Uri) mutableState22.getValue()) == null) {
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-593779807, true, new C2607o7(lVarV, stateAnimateFloat2, state)), 3, null);
                            LazyListScope.item$default(LazyColumn, null, null, N0.f14212d, 3, null);
                            LazyListScope.item$default(LazyColumn, null, null, N0.e, 3, null);
                            LazyListScope.item$default(LazyColumn, null, null, N0.g, 3, null);
                        } else {
                            MutableState mutableState24 = mutableState2;
                            MutableState mutableState25 = mutableState4;
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(32364600, true, new C2639q7(mutableState24, mutableState25, mutableState20, mutableState22)), 3, null);
                            MutableState mutableState26 = mutableState5;
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1247003103, true, new C2654r7(mutableState26)), 3, null);
                            MutableState mutableState27 = mutableState6;
                            MutableState mutableState28 = mutableState7;
                            MutableState mutableState29 = mutableState8;
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1443960320, true, new C2670s7(mutableState26, mutableState27, mutableState28, mutableState29)), 3, null);
                            MutableState mutableState30 = mutableState13;
                            MutableState mutableState31 = mutableState12;
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-160043553, true, new C2702u7(coroutineScope, context2, mutableState23, mutableState26, mutableState28, mutableState29, mutableState22, mutableState25, mutableState9, mutableState18, mutableState19, mutableState24, mutableState11, mutableState10, mutableState30, mutableState27, mutableState31, mutableState21, pDFProcessor)), 3, null);
                        }
                        return B3.o.f154a;
                    }
                };
                composer2 = composerStartRestartGroup;
                composer2.updateRememberedValue(cVar);
                objRememberedValue4 = cVar;
            } else {
                state = stateAnimateFloat;
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierM670paddingVpY3zN4$default, null, paddingValuesM665PaddingValuesa9UjIt4$default, false, null, centerHorizontally, null, false, (c) objRememberedValue4, composer2, 196998, 218);
            composer2.startReplaceGroup(-1199918925);
            if (((Boolean) mutableState9.getValue()).booleanValue()) {
                DialogProperties dialogProperties = new DialogProperties(false, false, false, 4, (AbstractC2168g) null);
                Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(companion2, 0.85f);
                composer2.startReplaceGroup(-1199921483);
                Object objRememberedValue5 = composer2.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new f(3);
                    composer2.updateRememberedValue(objRememberedValue5);
                }
                composer2.endReplaceGroup();
                n.a((a) objRememberedValue5, modifierFillMaxWidth, 0L, dialogProperties, ComposableLambdaKt.rememberComposableLambda(1746433540, true, new C2718v7(state, stateAnimateFloat3, mutableState13, mutableState5, mutableState10, mutableState11, mutableState12), composer2, 54), composer2, 27702, 4);
            }
            if (p035i0.a.z(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new J5(i5, z3, 2, onBack));
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
