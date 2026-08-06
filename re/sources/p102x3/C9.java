package p102x3;

import C3.C;
import C3.r;
import C3.u;
import C3.v;
import C3.w;
import C3.z;
import F3.j;
import M0.f;
import O3.a;
import O3.c;
import O3.e;
import W.A;
import W3.q;
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
import com.notescrafter.service.PDFProcessor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AbstractC2168g;
import kotlin.jvm.internal.o;
import p015d.l;
import p076s.b;
import p097w3.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class C9 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(int i5, a onBack, Composer composer, boolean z3) {
        int i6;
        Composer composer2;
        int i7 = 3;
        o.f(onBack, "onBack");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1761569072);
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
                ComposerKt.traceEventStart(-1761569072, i6, -1, "com.notescrafter.ui.screens.PdfSplitScreen (PdfSplitScreen.kt:62)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = AbstractC1421mz.e(EffectsKt.createCompositionCoroutineScope(j.f418o, composerStartRestartGroup), composerStartRestartGroup);
            }
            InterfaceC0200y coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            composerStartRestartGroup.startReplaceGroup(-1556352798);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new PDFProcessor(context);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            PDFProcessor pDFProcessor = (PDFProcessor) objRememberedValue2;
            Object objK = b.k(composerStartRestartGroup, -1556350649);
            if (objK == companion.getEmpty()) {
                objK = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK);
            }
            MutableState mutableState = (MutableState) objK;
            Object objK2 = b.k(composerStartRestartGroup, -1556348481);
            if (objK2 == companion.getEmpty()) {
                objK2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK2);
            }
            MutableState mutableState2 = (MutableState) objK2;
            Object objK3 = b.k(composerStartRestartGroup, -1556346561);
            if (objK3 == companion.getEmpty()) {
                objK3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK3);
            }
            MutableState mutableState3 = (MutableState) objK3;
            Object objK4 = b.k(composerStartRestartGroup, -1556344866);
            if (objK4 == companion.getEmpty()) {
                objK4 = b.b(0, null, 2, null, composerStartRestartGroup);
            }
            MutableState mutableState4 = (MutableState) objK4;
            Object objK5 = b.k(composerStartRestartGroup, -1556343026);
            if (objK5 == companion.getEmpty()) {
                objK5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(EnumC2677se.f15538o, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK5);
            }
            MutableState mutableState5 = (MutableState) objK5;
            Object objK6 = b.k(composerStartRestartGroup, -1556340705);
            if (objK6 == companion.getEmpty()) {
                objK6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK6);
            }
            MutableState mutableState6 = (MutableState) objK6;
            Object objK7 = b.k(composerStartRestartGroup, -1556338944);
            if (objK7 == companion.getEmpty()) {
                objK7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("1", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK7);
            }
            MutableState mutableState7 = (MutableState) objK7;
            Object objK8 = b.k(composerStartRestartGroup, -1556336958);
            if (objK8 == companion.getEmpty()) {
                objK8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK8);
            }
            MutableState mutableState8 = (MutableState) objK8;
            Object objK9 = b.k(composerStartRestartGroup, -1556334946);
            if (objK9 == companion.getEmpty()) {
                objK9 = b.b(0, null, 2, null, composerStartRestartGroup);
            }
            MutableState mutableState9 = (MutableState) objK9;
            Object objK10 = b.k(composerStartRestartGroup, -1556332994);
            if (objK10 == companion.getEmpty()) {
                objK10 = b.b(1, null, 2, null, composerStartRestartGroup);
            }
            MutableState mutableState10 = (MutableState) objK10;
            Object objK11 = b.k(composerStartRestartGroup, -1556331009);
            if (objK11 == companion.getEmpty()) {
                objK11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK11);
            }
            MutableState mutableState11 = (MutableState) objK11;
            Object objK12 = b.k(composerStartRestartGroup, -1556329140);
            if (objK12 == companion.getEmpty()) {
                objK12 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("Processing...", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK12);
            }
            MutableState mutableState12 = (MutableState) objK12;
            Object objK13 = b.k(composerStartRestartGroup, -1556326787);
            if (objK13 == companion.getEmpty()) {
                objK13 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(C.f167o, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK13);
            }
            MutableState mutableState13 = (MutableState) objK13;
            Object objK14 = b.k(composerStartRestartGroup, -1556324054);
            if (objK14 == companion.getEmpty()) {
                objK14 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK14);
            }
            MutableState mutableState14 = (MutableState) objK14;
            composerStartRestartGroup.endReplaceGroup();
            A a5 = new A(i7);
            composerStartRestartGroup.startReplaceGroup(-1556317065);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(pDFProcessor);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new C2463f7(coroutineScope, context, pDFProcessor, mutableState, mutableState13, mutableState14, mutableState2, mutableState3, mutableState4, mutableState6, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            l lVarV = p000a.a.v(a5, (c) objRememberedValue3, composerStartRestartGroup);
            InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition("halo", composerStartRestartGroup, 6, 0);
            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(1500, 0, EasingFunctionsKt.getEaseInOutSine(), 2, null);
            RepeatMode repeatMode = RepeatMode.Reverse;
            InfiniteRepeatableSpec infiniteRepeatableSpecM107infiniteRepeatable9IiC70o$default = AnimationSpecKt.m107infiniteRepeatable9IiC70o$default(tweenSpecTween$default, repeatMode, 0L, 4, null);
            int i8 = InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9);
            int i9 = i6;
            State<Float> stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.92f, 1.08f, infiniteRepeatableSpecM107infiniteRepeatable9IiC70o$default, "scale", composerStartRestartGroup, i8, 0);
            State<Float> stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.35f, 0.75f, AnimationSpecKt.m107infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1500, 0, EasingFunctionsKt.getEaseInOutSine(), 2, null), repeatMode, 0L, 4, null), "opacity", composerStartRestartGroup, i8, 0);
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
            composerStartRestartGroup.startReplaceGroup(-900373828);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(context) | ((i9 & 14) == 4) | composerStartRestartGroup.changed(stateAnimateFloat2) | composerStartRestartGroup.changedInstance(lVarV) | composerStartRestartGroup.changed(stateAnimateFloat) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(pDFProcessor);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue4 == companion.getEmpty()) {
                B7 b7 = new B7(onBack, mutableState13, context, mutableState, mutableState14, lVarV, stateAnimateFloat2, stateAnimateFloat, mutableState2, mutableState4, mutableState3, mutableState5, mutableState6, mutableState7, coroutineScope, pDFProcessor, mutableState8, mutableState10, mutableState9, mutableState12, mutableState11);
                composer2 = composerStartRestartGroup;
                composer2.updateRememberedValue(b7);
                objRememberedValue4 = b7;
            } else {
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierM670paddingVpY3zN4$default, null, paddingValuesM665PaddingValuesa9UjIt4$default, false, null, centerHorizontally, null, false, (c) objRememberedValue4, composer2, 196998, 218);
            composer2.startReplaceGroup(-899309955);
            if (((Boolean) mutableState8.getValue()).booleanValue()) {
                DialogProperties dialogProperties = new DialogProperties(false, false, false, 4, (AbstractC2168g) null);
                Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(companion2, 0.85f);
                composer2.startReplaceGroup(-899312351);
                Object objRememberedValue5 = composer2.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new f(3);
                    composer2.updateRememberedValue(objRememberedValue5);
                }
                composer2.endReplaceGroup();
                n.a((a) objRememberedValue5, modifierFillMaxWidth, 0L, dialogProperties, ComposableLambdaKt.rememberComposableLambda(1262199162, true, new C2768y9(stateAnimateFloat, stateAnimateFloat3, mutableState12, mutableState9, mutableState10, mutableState11), composer2, 54), composer2, 27702, 4);
            }
            if (p035i0.a.z(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new J5(i5, z3, 7, onBack));
        }
    }

    public static final void b(String str, ImageVector imageVector, String str2, String str3, Composer composer, int i5) {
        int i6;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-237580894);
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
                ComposerKt.traceEventStart(-237580894, i6, -1, "com.notescrafter.ui.screens.SplitStepItem (PdfSplitScreen.kt:1078)");
            }
            composer2 = composerStartRestartGroup;
            p097w3.j.a(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1697459037, true, new B9(imageVector, str, str3, str2), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new K5(str, imageVector, str2, str3, i5, 7));
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

    /* JADX WARN: Multi-variable type inference failed */
    public static final int d(MutableState mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }

    public static final void e(MutableState mutableState, boolean z3) {
        mutableState.setValue(Boolean.valueOf(z3));
    }

    public static final void f(float f5, MutableState mutableState) {
        mutableState.setValue(Float.valueOf(f5));
    }

    public static final List g(int i5, String str) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List listX0 = W3.j.x0(str, new String[]{","});
        ArrayList<String> arrayList = new ArrayList(w.Y(listX0));
        Iterator it = listX0.iterator();
        while (it.hasNext()) {
            arrayList.add(W3.j.I0((String) it.next()).toString());
        }
        for (String str2 : arrayList) {
            if (W3.j.c0(str2, "-", false)) {
                List listX1 = W3.j.x0(str2, new String[]{"-"});
                ArrayList arrayList2 = new ArrayList(w.Y(listX1));
                Iterator it2 = listX1.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(W3.j.I0((String) it2.next()).toString());
                }
                if (arrayList2.size() == 2) {
                    Integer numZ = q.Z((String) arrayList2.get(0));
                    int iIntValue = numZ != null ? numZ.intValue() : 1;
                    Integer numZ2 = q.Z((String) arrayList2.get(1));
                    int iIntValue2 = numZ2 != null ? numZ2.intValue() : i5;
                    int iMax = Math.max(1, iIntValue);
                    int iMin = Math.min(i5, iIntValue2);
                    if (iMax <= iMin) {
                        while (true) {
                            linkedHashSet.add(Integer.valueOf(iMax));
                            if (iMax != iMin) {
                                iMax++;
                            }
                        }
                    }
                }
            } else {
                Integer numZ3 = q.Z(str2);
                if (numZ3 != null && new T3.e(1, i5, 1).i(numZ3.intValue())) {
                    linkedHashSet.add(numZ3);
                }
            }
        }
        List listI0 = u.I0(linkedHashSet);
        if (!(listI0 instanceof Collection)) {
            List listK0 = u.K0(listI0);
            z.Z(listK0);
            return listK0;
        }
        List list = listI0;
        if (list.size() <= 1) {
            return u.I0(listI0);
        }
        Object[] array = list.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        o.f(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return r.y(array);
    }
}
