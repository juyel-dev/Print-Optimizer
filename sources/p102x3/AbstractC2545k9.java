package p102x3;

import C3.C;
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
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingFunctionsKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.CheckKt;
import androidx.compose.material.icons.outlined.DescriptionKt;
import androidx.compose.material.icons.outlined.GridViewKt;
import androidx.compose.material.icons.outlined.SaveKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.DialogProperties;
import com.google.android.gms.internal.ads.AbstractC1421mz;
import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2168g;
import kotlin.jvm.internal.o;
import p015d.l;
import p076s.b;
import p083t3.F;
import p097w3.n;
import p097w3.q;

/* JADX INFO: renamed from: x3.k9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2545k9 {
    /* JADX WARN: Code duplicated, block: B:101:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:105:0x0419  */
    /* JADX WARN: Code duplicated, block: B:108:0x0425  */
    /* JADX WARN: Code duplicated, block: B:109:0x0429  */
    /* JADX WARN: Code duplicated, block: B:112:0x043a  */
    /* JADX WARN: Code duplicated, block: B:115:0x044b  */
    /* JADX WARN: Code duplicated, block: B:119:0x0576  */
    /* JADX WARN: Code duplicated, block: B:121:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:124:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:125:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:128:0x05de  */
    /* JADX WARN: Code duplicated, block: B:131:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:135:0x0676  */
    /* JADX WARN: Code duplicated, block: B:138:0x0682  */
    /* JADX WARN: Code duplicated, block: B:139:0x0686  */
    /* JADX WARN: Code duplicated, block: B:142:0x0697  */
    /* JADX WARN: Code duplicated, block: B:145:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:149:0x071c  */
    /* JADX WARN: Code duplicated, block: B:152:0x0728  */
    /* JADX WARN: Code duplicated, block: B:153:0x072c  */
    /* JADX WARN: Code duplicated, block: B:156:0x073d  */
    /* JADX WARN: Code duplicated, block: B:158:0x074b  */
    /* JADX WARN: Code duplicated, block: B:161:0x0865  */
    /* JADX WARN: Code duplicated, block: B:163:0x08a6  */
    /* JADX WARN: Code duplicated, block: B:165:0x08be  */
    /* JADX WARN: Code duplicated, block: B:167:0x0903  */
    /* JADX WARN: Code duplicated, block: B:170:0x090f  */
    /* JADX WARN: Code duplicated, block: B:171:0x0913  */
    /* JADX WARN: Code duplicated, block: B:174:0x0924  */
    /* JADX WARN: Code duplicated, block: B:176:0x0932  */
    /* JADX WARN: Code duplicated, block: B:179:0x0978  */
    /* JADX WARN: Code duplicated, block: B:181:0x0980  */
    /* JADX WARN: Code duplicated, block: B:184:0x0a72  */
    /* JADX WARN: Code duplicated, block: B:187:0x0a7e  */
    /* JADX WARN: Code duplicated, block: B:188:0x0a82  */
    /* JADX WARN: Code duplicated, block: B:191:0x0a93  */
    /* JADX WARN: Code duplicated, block: B:193:0x0aa1  */
    /* JADX WARN: Code duplicated, block: B:195:0x0b3e  */
    /* JADX WARN: Code duplicated, block: B:197:0x0b78  */
    /* JADX WARN: Code duplicated, block: B:200:0x0b84  */
    /* JADX WARN: Code duplicated, block: B:201:0x0b88  */
    /* JADX WARN: Code duplicated, block: B:204:0x0b99  */
    /* JADX WARN: Code duplicated, block: B:207:0x0baa  */
    /* JADX WARN: Code duplicated, block: B:211:0x0bbd  */
    /* JADX WARN: Code duplicated, block: B:212:0x0bc0  */
    /* JADX WARN: Code duplicated, block: B:215:0x0c13  */
    /* JADX WARN: Code duplicated, block: B:216:0x0c18  */
    /* JADX WARN: Code duplicated, block: B:219:0x0cad  */
    /* JADX WARN: Code duplicated, block: B:222:0x0cb9  */
    /* JADX WARN: Code duplicated, block: B:223:0x0cbd  */
    /* JADX WARN: Code duplicated, block: B:226:0x0cce  */
    /* JADX WARN: Code duplicated, block: B:228:0x0cdc  */
    /* JADX WARN: Code duplicated, block: B:231:0x0d18  */
    /* JADX WARN: Code duplicated, block: B:235:0x0d55  */
    /* JADX WARN: Code duplicated, block: B:238:0x0df9  */
    /* JADX WARN: Code duplicated, block: B:240:0x0dff  */
    /* JADX WARN: Code duplicated, block: B:245:0x0e59  */
    /* JADX WARN: Code duplicated, block: B:247:0x0e7e  */
    /* JADX WARN: Code duplicated, block: B:251:0x0eb6  */
    /* JADX WARN: Code duplicated, block: B:91:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:94:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:95:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:98:0x03c1  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(int i5, a onBack, Composer composer, boolean z3) {
        int i6;
        int i7;
        int i8;
        int i9;
        State<Float> state;
        Brush.Companion companion;
        long j5;
        Color.Companion companion2;
        float f5;
        float f6;
        Arrangement arrangement;
        int currentCompositeKeyHash;
        a constructor;
        Composer composerM3407constructorimpl;
        MutableState mutableState;
        ColumnScopeInstance columnScopeInstance;
        float f7;
        int currentCompositeKeyHash2;
        a constructor2;
        Composer composerM3407constructorimpl2;
        Arrangement arrangement2;
        float f8;
        Arrangement arrangement3;
        State<Float> state2;
        MaterialTheme materialTheme;
        int i10;
        FontWeight.Companion companion3;
        long j6;
        int currentCompositeKeyHash3;
        a constructor3;
        Composer composerM3407constructorimpl3;
        State<Float> state3;
        boolean z4;
        float f9;
        int i11;
        boolean z5;
        State<Float> state4;
        int currentCompositeKeyHash4;
        a constructor4;
        Composer composerM3407constructorimpl4;
        e eVarG;
        Object objRememberedValue;
        Composer.Companion companion4;
        String str;
        boolean zChangedInstance;
        Object objRememberedValue2;
        int currentCompositeKeyHash5;
        a constructor5;
        Composer composerM3407constructorimpl5;
        e eVarG2;
        boolean zChangedInstance2;
        Object objRememberedValue3;
        int currentCompositeKeyHash6;
        a constructor6;
        Composer composerM3407constructorimpl6;
        e eVarG3;
        Object objRememberedValue4;
        int currentCompositeKeyHash7;
        a constructor7;
        Composer composerM3407constructorimpl7;
        MutableState mutableState2;
        int currentCompositeKeyHash8;
        a constructor8;
        Composer composerM3407constructorimpl8;
        MutableState mutableState3;
        int currentCompositeKeyHash9;
        a constructor9;
        Composer composerM3407constructorimpl9;
        e eVarG4;
        MutableState mutableState4;
        Object objRememberedValue5;
        o.f(onBack, "onBack");
        Composer composerStartRestartGroup = composer.startRestartGroup(-536678824);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changedInstance(onBack) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i6 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-536678824, i6, -1, "com.notescrafter.ui.screens.PdfOrganizeScreen (PdfOrganizeScreen.kt:72)");
            }
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion5 = Composer.Companion;
            if (objRememberedValue6 == companion5.getEmpty()) {
                objRememberedValue6 = AbstractC1421mz.e(EffectsKt.createCompositionCoroutineScope(j.f418o, composerStartRestartGroup), composerStartRestartGroup);
            }
            final InterfaceC0200y coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue6).getCoroutineScope();
            composerStartRestartGroup.startReplaceGroup(-498836388);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion5.getEmpty()) {
                objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            final MutableState mutableState5 = (MutableState) objRememberedValue7;
            Object objK = b.k(composerStartRestartGroup, -498834220);
            if (objK == companion5.getEmpty()) {
                objK = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK);
            }
            final MutableState mutableState6 = (MutableState) objK;
            Object objK2 = b.k(composerStartRestartGroup, -498832300);
            if (objK2 == companion5.getEmpty()) {
                objK2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK2);
            }
            final MutableState mutableState7 = (MutableState) objK2;
            Object objK3 = b.k(composerStartRestartGroup, -498830605);
            if (objK3 == companion5.getEmpty()) {
                objK3 = b.b(0, null, 2, null, composerStartRestartGroup);
            }
            final MutableState mutableState8 = (MutableState) objK3;
            Object objK4 = b.k(composerStartRestartGroup, -498828779);
            if (objK4 == companion5.getEmpty()) {
                objK4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(C.f167o, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK4);
            }
            final MutableState mutableState9 = (MutableState) objK4;
            Object objK5 = b.k(composerStartRestartGroup, -498825961);
            if (objK5 == companion5.getEmpty()) {
                i7 = 2;
                objK5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK5);
            } else {
                i7 = 2;
            }
            final MutableState mutableState10 = (MutableState) objK5;
            Object objK6 = b.k(composerStartRestartGroup, -498824012);
            if (objK6 == companion5.getEmpty()) {
                objK6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, i7, null);
                composerStartRestartGroup.updateRememberedValue(objK6);
            }
            final MutableState mutableState11 = (MutableState) objK6;
            Object objK7 = b.k(composerStartRestartGroup, -498822124);
            if (objK7 == companion5.getEmpty()) {
                i8 = 2;
                objK7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK7);
            } else {
                i8 = 2;
            }
            final MutableState mutableState12 = (MutableState) objK7;
            Object objK8 = b.k(composerStartRestartGroup, -498820131);
            if (objK8 == companion5.getEmpty()) {
                objK8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i8, null);
                composerStartRestartGroup.updateRememberedValue(objK8);
            }
            final MutableState mutableState13 = (MutableState) objK8;
            Object objK9 = b.k(composerStartRestartGroup, -498818049);
            int i12 = i6;
            if (objK9 == companion5.getEmpty()) {
                objK9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i8, null);
                composerStartRestartGroup.updateRememberedValue(objK9);
            }
            final MutableState mutableState14 = (MutableState) objK9;
            composerStartRestartGroup.endReplaceGroup();
            A a5 = new A(3);
            composerStartRestartGroup.startReplaceGroup(-498808308);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue8 == companion5.getEmpty()) {
                objRememberedValue8 = new c() { // from class: x3.R8
                    @Override // O3.c
                    public final Object invoke(Object obj) {
                        Uri uri = (Uri) obj;
                        if (uri != null) {
                            X3.A.t(coroutineScope, null, null, new C2465f9(context, uri, mutableState10, mutableState11, mutableState14, mutableState13, mutableState12, mutableState5, mutableState6, mutableState7, mutableState8, mutableState9, null), 3);
                        }
                        return B3.o.f154a;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            composerStartRestartGroup.endReplaceGroup();
            l lVarV = p000a.a.v(a5, (c) objRememberedValue8, composerStartRestartGroup);
            List list = (List) mutableState9.getValue();
            if ((list instanceof Collection) && list.isEmpty()) {
                i9 = 0;
            } else {
                Iterator it = list.iterator();
                i9 = 0;
                while (it.hasNext()) {
                    if (((D6) it.next()).f13862d && (i9 = i9 + 1) < 0) {
                        v.W();
                        throw null;
                    }
                }
            }
            InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition("halo", composerStartRestartGroup, 6, 0);
            int i13 = i9;
            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(1500, 0, EasingFunctionsKt.getEaseInOutSine(), 2, null);
            RepeatMode repeatMode = RepeatMode.Reverse;
            InfiniteRepeatableSpec infiniteRepeatableSpecM107infiniteRepeatable9IiC70o$default = AnimationSpecKt.m107infiniteRepeatable9IiC70o$default(tweenSpecTween$default, repeatMode, 0L, 4, null);
            int i14 = InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9);
            State<Float> stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.92f, 1.08f, infiniteRepeatableSpecM107infiniteRepeatable9IiC70o$default, "scale", composerStartRestartGroup, i14, 0);
            State<Float> stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.35f, 0.75f, AnimationSpecKt.m107infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1500, 0, EasingFunctionsKt.getEaseInOutSine(), 2, null), repeatMode, 0L, 4, null), "opacity", composerStartRestartGroup, i14, 0);
            State<Float> stateAnimateFloat3 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 60.0f, AnimationSpecKt.m107infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1800, 0, EasingKt.getLinearEasing(), 2, null), repeatMode, 0L, 4, null), "scanY", composerStartRestartGroup, i14, 0);
            Modifier.Companion companion6 = Modifier.Companion;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null);
            Alignment.Companion companion7 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
            int currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion8 = ComposeUiNode.Companion;
            a constructor10 = companion8.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor10);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3407constructorimpl10 = Updater.m3407constructorimpl(composerStartRestartGroup);
            e eVarG5 = p035i0.a.g(companion8, composerM3407constructorimpl10, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl10, currentCompositionLocalMap);
            if (composerM3407constructorimpl10.getInserting()) {
                state = stateAnimateFloat3;
            } else {
                state = stateAnimateFloat3;
                if (!o.b(composerM3407constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                }
                Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier, companion8.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null);
                companion = Brush.Companion;
                j5 = p107y3.a.f15978a;
                Color colorM3917boximpl = Color.m3917boximpl(Color.m3926copywmQWz5c$default(j5, 0.08f, 0.0f, 0.0f, 0.0f, 14, null));
                companion2 = Color.Companion;
                BoxKt.Box(BackgroundKt.background$default(modifierFillMaxSize$default2, Brush.Companion.m3880radialGradientP_VxKs$default(companion, v.S(colorM3917boximpl, Color.m3917boximpl(companion2.m3962getTransparent0d7_KjU())), 0L, Dp.m6403constructorimpl(400), 0, 10, (Object) null), null, 0.0f, 6, null), composerStartRestartGroup, 0);
                f5 = 24;
                f6 = 16;
                Modifier modifierM672paddingqDBjuR0$default = PaddingKt.m672paddingqDBjuR0$default(PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), Dp.m6403constructorimpl(f5), 0.0f, 2, null), 0.0f, Dp.m6403constructorimpl(f6), 0.0f, Dp.m6403constructorimpl(f5), 5, null);
                arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion7.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM672paddingqDBjuR0$default);
                constructor = companion8.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3407constructorimpl = Updater.m3407constructorimpl(composerStartRestartGroup);
                e eVarG6 = p035i0.a.g(companion8, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap2);
                if (composerM3407constructorimpl.getInserting()) {
                    mutableState = mutableState11;
                } else {
                    mutableState = mutableState11;
                    if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier2, companion8.getSetModifier());
                    columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    f7 = 8;
                    Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, Dp.m6403constructorimpl(f7), 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion7.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM670paddingVpY3zN4$default);
                    constructor2 = companion8.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl2 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    e eVarG7 = p035i0.a.g(companion8, composerM3407constructorimpl2, measurePolicyRowMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap3);
                    if (composerM3407constructorimpl2.getInserting()) {
                        arrangement2 = arrangement;
                    } else {
                        arrangement2 = arrangement;
                        if (!o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier3, companion8.getSetModifier());
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        f8 = 1;
                        arrangement3 = arrangement2;
                        state2 = state;
                        IconButtonKt.IconButton(onBack, BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(40)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f8), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape()), false, null, null, C1.f13829a, composerStartRestartGroup, (i12 & 14) | 196608, 28);
                        composerStartRestartGroup = composerStartRestartGroup;
                        androidx.compose.foundation.text.modifiers.a.q(f6, companion6, composerStartRestartGroup, 6);
                        materialTheme = MaterialTheme.INSTANCE;
                        i10 = MaterialTheme.$stable;
                        TextStyle titleLarge = materialTheme.getTypography(composerStartRestartGroup, i10).getTitleLarge();
                        companion3 = FontWeight.Companion;
                        TextStyle textStyleM5917copyp1EtxEg = titleLarge.m5917copyp1EtxEg((16645977 & 1) != 0 ? titleLarge.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? titleLarge.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(22), (16645977 & 4) != 0 ? titleLarge.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? titleLarge.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? titleLarge.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? titleLarge.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? titleLarge.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? titleLarge.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? titleLarge.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? titleLarge.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? titleLarge.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? titleLarge.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? titleLarge.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? titleLarge.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? titleLarge.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? titleLarge.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? titleLarge.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? titleLarge.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? titleLarge.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? titleLarge.platformStyle : null, (16645977 & 1048576) != 0 ? titleLarge.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? titleLarge.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? titleLarge.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? titleLarge.paragraphStyle.getTextMotion() : null);
                        j6 = p107y3.a.f15990o;
                        TextKt.m2432Text4IGK_g("Organize PDF", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, textStyleM5917copyp1EtxEg, composerStartRestartGroup, 390, 0, 65530);
                        b.n(composerStartRestartGroup, f6, companion6, composerStartRestartGroup, 6);
                        if (((File) mutableState13.getValue()) != null) {
                            composerStartRestartGroup.startReplaceGroup(-1255053421);
                            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion7.getCenterHorizontally(), composerStartRestartGroup, 48);
                            currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
                            constructor7 = companion8.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor7);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            e eVarG8 = p035i0.a.g(companion8, composerM3407constructorimpl7, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl7, currentCompositionLocalMap4);
                            if (composerM3407constructorimpl7.getInserting()) {
                                mutableState2 = mutableState14;
                            } else {
                                mutableState2 = mutableState14;
                                if (!o.b(composerM3407constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier4, companion8.getSetModifier());
                                float f10 = 32;
                                b.m(f10, companion6, composerStartRestartGroup, 6);
                                Modifier modifierClip = ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(96)), RoundedCornerShapeKt.getCircleShape());
                                long j7 = p107y3.a.f15984i;
                                Modifier modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(modifierClip, Color.m3926copywmQWz5c$default(j7, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f8), Color.m3926copywmQWz5c$default(j7, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                                currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM220borderxT4_qwU);
                                constructor8 = companion8.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor8);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                                e eVarG9 = p035i0.a.g(companion8, composerM3407constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl8, currentCompositionLocalMap5);
                                if (composerM3407constructorimpl8.getInserting()) {
                                    mutableState3 = mutableState13;
                                } else {
                                    mutableState3 = mutableState13;
                                    if (!o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                                    }
                                    Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier5, companion8.getSetModifier());
                                    Modifier modifierBackground$default = BackgroundKt.background$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(64)), RoundedCornerShapeKt.getCircleShape()), Brush.Companion.m3878linearGradientmHitzGk$default(companion, v.S(Color.m3917boximpl(j7), Color.m3917boximpl(ColorKt.Color(4281652121L))), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                                    currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default);
                                    constructor9 = companion8.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (composerStartRestartGroup.getInserting()) {
                                        composerStartRestartGroup.createNode(constructor9);
                                    } else {
                                        composerStartRestartGroup.useNode();
                                    }
                                    composerM3407constructorimpl9 = Updater.m3407constructorimpl(composerStartRestartGroup);
                                    eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3407constructorimpl9, currentCompositionLocalMap6);
                                    if (composerM3407constructorimpl9.getInserting() || !o.b(composerM3407constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                                        p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                                    }
                                    Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier6, companion8.getSetModifier());
                                    IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), "Success", SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(36)), companion2.m3964getWhite0d7_KjU(), composerStartRestartGroup, 3504, 0);
                                    b.r(composerStartRestartGroup, f5, companion6, composerStartRestartGroup, 6);
                                    TextStyle headlineSmall = materialTheme.getTypography(composerStartRestartGroup, i10).getHeadlineSmall();
                                    TextKt.m2432Text4IGK_g("PDF Saved Successfully!", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, headlineSmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineSmall.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? headlineSmall.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineSmall.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? headlineSmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineSmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineSmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineSmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineSmall.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineSmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineSmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineSmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineSmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineSmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineSmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineSmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineSmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineSmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineSmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineSmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineSmall.platformStyle : null, (16645977 & 1048576) != 0 ? headlineSmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineSmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineSmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineSmall.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 390, 0, 65018);
                                    b.m(28, companion6, composerStartRestartGroup, 6);
                                    mutableState4 = mutableState3;
                                    p097w3.j.a(PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(20), 7, null), 0L, Color.m3926copywmQWz5c$default(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-446322778, true, new S8(context, mutableState4, mutableState9), composerStartRestartGroup, 54), composerStartRestartGroup, 196998, 26);
                                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f10)), composerStartRestartGroup, 6);
                                    composerStartRestartGroup.startReplaceGroup(1551057536);
                                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                                        objRememberedValue5 = new C2527j7(mutableState5, mutableState9, mutableState4, mutableState2, 3);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    ButtonKt.TextButton((a) objRememberedValue5, null, false, null, null, null, null, null, null, C1.f13832d, composerStartRestartGroup, 805306374, 510);
                                    composerStartRestartGroup.endNode();
                                    composerStartRestartGroup.endReplaceGroup();
                                    state4 = stateAnimateFloat;
                                }
                                p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG9);
                                Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier5, companion8.getSetModifier());
                                Modifier modifierBackground$default2 = BackgroundKt.background$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(64)), RoundedCornerShapeKt.getCircleShape()), Brush.Companion.m3878linearGradientmHitzGk$default(companion, v.S(Color.m3917boximpl(j7), Color.m3917boximpl(ColorKt.Color(4281652121L))), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                                currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default2);
                                constructor9 = companion8.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor9);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                composerM3407constructorimpl9 = Updater.m3407constructorimpl(composerStartRestartGroup);
                                eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM3407constructorimpl9, currentCompositionLocalMap7);
                                if (composerM3407constructorimpl9.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier7, companion8.getSetModifier());
                                IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), "Success", SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(36)), companion2.m3964getWhite0d7_KjU(), composerStartRestartGroup, 3504, 0);
                                b.r(composerStartRestartGroup, f5, companion6, composerStartRestartGroup, 6);
                                TextStyle headlineSmall2 = materialTheme.getTypography(composerStartRestartGroup, i10).getHeadlineSmall();
                                TextKt.m2432Text4IGK_g("PDF Saved Successfully!", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, headlineSmall2.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineSmall2.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? headlineSmall2.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineSmall2.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? headlineSmall2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineSmall2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineSmall2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineSmall2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineSmall2.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineSmall2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineSmall2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineSmall2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineSmall2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineSmall2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineSmall2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineSmall2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineSmall2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineSmall2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineSmall2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineSmall2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineSmall2.platformStyle : null, (16645977 & 1048576) != 0 ? headlineSmall2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineSmall2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineSmall2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineSmall2.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 390, 0, 65018);
                                b.m(28, companion6, composerStartRestartGroup, 6);
                                mutableState4 = mutableState3;
                                p097w3.j.a(PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(20), 7, null), 0L, Color.m3926copywmQWz5c$default(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-446322778, true, new S8(context, mutableState4, mutableState9), composerStartRestartGroup, 54), composerStartRestartGroup, 196998, 26);
                                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f10)), composerStartRestartGroup, 6);
                                composerStartRestartGroup.startReplaceGroup(1551057536);
                                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                                    objRememberedValue5 = new C2527j7(mutableState5, mutableState9, mutableState4, mutableState2, 3);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                ButtonKt.TextButton((a) objRememberedValue5, null, false, null, null, null, null, null, null, C1.f13832d, composerStartRestartGroup, 805306374, 510);
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceGroup();
                                state4 = stateAnimateFloat;
                            }
                            p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG8);
                            Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier4, companion8.getSetModifier());
                            float f11 = 32;
                            b.m(f11, companion6, composerStartRestartGroup, 6);
                            Modifier modifierClip2 = ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(96)), RoundedCornerShapeKt.getCircleShape());
                            long j8 = p107y3.a.f15984i;
                            Modifier modifierM220borderxT4_qwU2 = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(modifierClip2, Color.m3926copywmQWz5c$default(j8, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f8), Color.m3926copywmQWz5c$default(j8, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                            currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM220borderxT4_qwU2);
                            constructor8 = companion8.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor8);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            e eVarG10 = p035i0.a.g(companion8, composerM3407constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy5, composerM3407constructorimpl8, currentCompositionLocalMap8);
                            if (composerM3407constructorimpl8.getInserting()) {
                                mutableState3 = mutableState13;
                                if (!o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier8, companion8.getSetModifier());
                                Modifier modifierBackground$default3 = BackgroundKt.background$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(64)), RoundedCornerShapeKt.getCircleShape()), Brush.Companion.m3878linearGradientmHitzGk$default(companion, v.S(Color.m3917boximpl(j8), Color.m3917boximpl(ColorKt.Color(4281652121L))), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                                currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default3);
                                constructor9 = companion8.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor9);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                composerM3407constructorimpl9 = Updater.m3407constructorimpl(composerStartRestartGroup);
                                eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy6, composerM3407constructorimpl9, currentCompositionLocalMap9);
                                if (composerM3407constructorimpl9.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier9, companion8.getSetModifier());
                                IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), "Success", SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(36)), companion2.m3964getWhite0d7_KjU(), composerStartRestartGroup, 3504, 0);
                                b.r(composerStartRestartGroup, f5, companion6, composerStartRestartGroup, 6);
                                TextStyle headlineSmall3 = materialTheme.getTypography(composerStartRestartGroup, i10).getHeadlineSmall();
                                TextKt.m2432Text4IGK_g("PDF Saved Successfully!", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, headlineSmall3.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineSmall3.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? headlineSmall3.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineSmall3.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? headlineSmall3.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineSmall3.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineSmall3.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineSmall3.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineSmall3.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineSmall3.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineSmall3.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineSmall3.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineSmall3.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineSmall3.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineSmall3.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineSmall3.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineSmall3.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineSmall3.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineSmall3.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineSmall3.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineSmall3.platformStyle : null, (16645977 & 1048576) != 0 ? headlineSmall3.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineSmall3.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineSmall3.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineSmall3.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 390, 0, 65018);
                                b.m(28, companion6, composerStartRestartGroup, 6);
                                mutableState4 = mutableState3;
                                p097w3.j.a(PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(20), 7, null), 0L, Color.m3926copywmQWz5c$default(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-446322778, true, new S8(context, mutableState4, mutableState9), composerStartRestartGroup, 54), composerStartRestartGroup, 196998, 26);
                                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f11)), composerStartRestartGroup, 6);
                                composerStartRestartGroup.startReplaceGroup(1551057536);
                                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                                    objRememberedValue5 = new C2527j7(mutableState5, mutableState9, mutableState4, mutableState2, 3);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                ButtonKt.TextButton((a) objRememberedValue5, null, false, null, null, null, null, null, null, C1.f13832d, composerStartRestartGroup, 805306374, 510);
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceGroup();
                                state4 = stateAnimateFloat;
                            } else {
                                mutableState3 = mutableState13;
                            }
                            p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG10);
                            Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier8, companion8.getSetModifier());
                            Modifier modifierBackground$default4 = BackgroundKt.background$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(64)), RoundedCornerShapeKt.getCircleShape()), Brush.Companion.m3878linearGradientmHitzGk$default(companion, v.S(Color.m3917boximpl(j8), Color.m3917boximpl(ColorKt.Color(4281652121L))), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                            currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap10 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default4);
                            constructor9 = companion8.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor9);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl9 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy7, composerM3407constructorimpl9, currentCompositionLocalMap10);
                            if (composerM3407constructorimpl9.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier10, companion8.getSetModifier());
                            IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), "Success", SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(36)), companion2.m3964getWhite0d7_KjU(), composerStartRestartGroup, 3504, 0);
                            b.r(composerStartRestartGroup, f5, companion6, composerStartRestartGroup, 6);
                            TextStyle headlineSmall4 = materialTheme.getTypography(composerStartRestartGroup, i10).getHeadlineSmall();
                            TextKt.m2432Text4IGK_g("PDF Saved Successfully!", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, headlineSmall4.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineSmall4.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? headlineSmall4.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineSmall4.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? headlineSmall4.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineSmall4.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineSmall4.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineSmall4.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineSmall4.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineSmall4.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineSmall4.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineSmall4.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineSmall4.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineSmall4.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineSmall4.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineSmall4.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineSmall4.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineSmall4.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineSmall4.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineSmall4.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineSmall4.platformStyle : null, (16645977 & 1048576) != 0 ? headlineSmall4.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineSmall4.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineSmall4.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineSmall4.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 390, 0, 65018);
                            b.m(28, companion6, composerStartRestartGroup, 6);
                            mutableState4 = mutableState3;
                            p097w3.j.a(PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(20), 7, null), 0L, Color.m3926copywmQWz5c$default(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-446322778, true, new S8(context, mutableState4, mutableState9), composerStartRestartGroup, 54), composerStartRestartGroup, 196998, 26);
                            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f11)), composerStartRestartGroup, 6);
                            composerStartRestartGroup.startReplaceGroup(1551057536);
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                                objRememberedValue5 = new C2527j7(mutableState5, mutableState9, mutableState4, mutableState2, 3);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            ButtonKt.TextButton((a) objRememberedValue5, null, false, null, null, null, null, null, null, C1.f13832d, composerStartRestartGroup, 805306374, 510);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceGroup();
                            state4 = stateAnimateFloat;
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-1242473187);
                            if (((Uri) mutableState5.getValue()) == null) {
                                composerStartRestartGroup.startReplaceGroup(-1242989399);
                                Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion7.getCenterHorizontally(), composerStartRestartGroup, 48);
                                currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap11 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default2);
                                constructor5 = companion8.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor5);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                composerM3407constructorimpl5 = Updater.m3407constructorimpl(composerStartRestartGroup);
                                eVarG2 = p035i0.a.g(companion8, composerM3407constructorimpl5, measurePolicyColumnMeasurePolicy3, composerM3407constructorimpl5, currentCompositionLocalMap11);
                                if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier11, companion8.getSetModifier());
                                Modifier modifierM699height3ABfNKs = SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), Dp.m6403constructorimpl(280));
                                long jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(j5, stateAnimateFloat2.getValue().floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                                composerStartRestartGroup.startReplaceGroup(1551090884);
                                zChangedInstance2 = composerStartRestartGroup.changedInstance(lVarV);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                                    objRememberedValue3 = new P5(lVarV, 14);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                p097w3.j.a(modifierM699height3ABfNKs, 0L, jM3926copywmQWz5c$default, 0.0f, (a) objRememberedValue3, ComposableLambdaKt.rememberComposableLambda(201211522, true, new T8(lVarV, stateAnimateFloat2, stateAnimateFloat), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 10);
                                b.m(f5, companion6, composerStartRestartGroup, 6);
                                TextStyle titleMedium = materialTheme.getTypography(composerStartRestartGroup, i10).getTitleMedium();
                                TextKt.m2432Text4IGK_g("How it works", PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(12), 7, null), j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, titleMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? titleMedium.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? titleMedium.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? titleMedium.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? titleMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? titleMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? titleMedium.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? titleMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? titleMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? titleMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? titleMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? titleMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? titleMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? titleMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? titleMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? titleMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? titleMedium.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? titleMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? titleMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? titleMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? titleMedium.platformStyle : null, (16645977 & 1048576) != 0 ? titleMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? titleMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? titleMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? titleMedium.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 438, 0, 65528);
                                Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_4 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(10));
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_4, companion7.getStart(), composerStartRestartGroup, 6);
                                currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap12 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier12 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                                constructor6 = companion8.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor6);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                                eVarG3 = p035i0.a.g(companion8, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy4, composerM3407constructorimpl6, currentCompositionLocalMap12);
                                if (composerM3407constructorimpl6.getInserting() || !o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier12, companion8.getSetModifier());
                                Icons.Outlined outlined = Icons.Outlined.INSTANCE;
                                b("01", DescriptionKt.getDescription(outlined), "Import PDF Document", "Choose the PDF file you want to organize from your device storage.", composerStartRestartGroup, 3462);
                                b("02", GridViewKt.getGridView(outlined), "Reorder & Rotate Pages", "Drag pages or use Move Up/Down, Rotate 90°, Duplicate or Delete options on each page.", composerStartRestartGroup, 3462);
                                b("03", SaveKt.getSave(outlined), "Save New Document", "Confirm changes and click 'Save PDF' to generate the optimized, updated file.", composerStartRestartGroup, 3462);
                                composerStartRestartGroup.endNode();
                                b.m(20, companion6, composerStartRestartGroup, 6);
                                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
                                long j9 = p107y3.a.f15984i;
                                p097w3.j.a(modifierFillMaxWidth$default2, Color.m3926copywmQWz5c$default(j9, 0.03f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(j9, 0.15f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, C1.e, composerStartRestartGroup, 197046, 24);
                                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f6)), composerStartRestartGroup, 6);
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceGroup();
                                state4 = stateAnimateFloat;
                            } else {
                                composerStartRestartGroup.startReplaceGroup(-1233398898);
                                Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion7.getStart(), composerStartRestartGroup, 0);
                                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap13 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier13 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default3);
                                constructor3 = companion8.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor3);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                composerM3407constructorimpl3 = Updater.m3407constructorimpl(composerStartRestartGroup);
                                e eVarG11 = p035i0.a.g(companion8, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy5, composerM3407constructorimpl3, currentCompositionLocalMap13);
                                if (composerM3407constructorimpl3.getInserting()) {
                                    state3 = stateAnimateFloat;
                                } else {
                                    state3 = stateAnimateFloat;
                                    if (!o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    }
                                    Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier13, companion8.getSetModifier());
                                    if (i13 > 0) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z4, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-486966906, true, new V8(i13, mutableState9, mutableState13, mutableState14), composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
                                    if (i13 == 0) {
                                        f9 = 0.0f;
                                        i11 = 3;
                                        z5 = true;
                                    } else {
                                        f9 = 0.0f;
                                        i11 = 3;
                                        z5 = false;
                                    }
                                    AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z5, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, f9, i11, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-1332655761, true, new X8(mutableState6, mutableState8, mutableState7, mutableState5), composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
                                    state4 = state3;
                                    Modifier modifierWeight$default = ColumnScope.weight$default(columnScopeInstance, companion6, 1.0f, false, 2, null);
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy8 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
                                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap14 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier14 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                                    constructor4 = companion8.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (composerStartRestartGroup.getInserting()) {
                                        composerStartRestartGroup.createNode(constructor4);
                                    } else {
                                        composerStartRestartGroup.useNode();
                                    }
                                    composerM3407constructorimpl4 = Updater.m3407constructorimpl(composerStartRestartGroup);
                                    eVarG = p035i0.a.g(companion8, composerM3407constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy8, composerM3407constructorimpl4, currentCompositionLocalMap14);
                                    if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG);
                                    }
                                    Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier14, companion8.getSetModifier());
                                    GridCells.Fixed fixed = new GridCells.Fixed(3);
                                    Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_5 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(f7));
                                    Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_6 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(12));
                                    Modifier modifierFillMaxSize$default4 = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null);
                                    composerStartRestartGroup.startReplaceGroup(1425236413);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    companion4 = Composer.Companion;
                                    if (objRememberedValue == companion4.getEmpty()) {
                                        objRememberedValue = new F(8, mutableState9, mutableState14, mutableState13);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    LazyGridDslKt.LazyVerticalGrid(fixed, modifierFillMaxSize$default4, null, null, false, horizontalOrVerticalM548spacedBy0680j_6, horizontalOrVerticalM548spacedBy0680j_5, null, false, (c) objRememberedValue, composerStartRestartGroup, 807075888, 412);
                                    b.n(composerStartRestartGroup, f6, companion6, composerStartRestartGroup, 6);
                                    str = (String) mutableState14.getValue();
                                    composerStartRestartGroup.startReplaceGroup(1551965696);
                                    if (str != null) {
                                        long jColor = ColorKt.Color(4293870660L);
                                        TextStyle bodyMedium = materialTheme.getTypography(composerStartRestartGroup, i10).getBodyMedium();
                                        TextKt.m2432Text4IGK_g(str, PaddingKt.m672paddingqDBjuR0$default(companion6, 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f7), 7, null), jColor, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, bodyMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodyMedium.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium.spanStyle.getFontWeight() : companion3.getSemiBold(), (16645977 & 8) != 0 ? bodyMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 432, 0, 65016);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(1551985192);
                                    zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
                                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (zChangedInstance || objRememberedValue2 == companion4.getEmpty()) {
                                        objRememberedValue2 = new C2382a6(context, coroutineScope, mutableState5, mutableState9, mutableState10, mutableState, mutableState14, mutableState13, mutableState12, mutableState6);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    q.a("Save Organized PDF", (a) objRememberedValue2, SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), null, false, false, composerStartRestartGroup, 390, 56);
                                    composerStartRestartGroup.endNode();
                                    composerStartRestartGroup.endReplaceGroup();
                                }
                                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG11);
                                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier13, companion8.getSetModifier());
                                if (i13 > 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z4, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-486966906, true, new V8(i13, mutableState9, mutableState13, mutableState14), composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
                                if (i13 == 0) {
                                    f9 = 0.0f;
                                    i11 = 3;
                                    z5 = true;
                                } else {
                                    f9 = 0.0f;
                                    i11 = 3;
                                    z5 = false;
                                }
                                AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z5, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, f9, i11, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-1332655761, true, new X8(mutableState6, mutableState8, mutableState7, mutableState5), composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
                                state4 = state3;
                                Modifier modifierWeight$default2 = ColumnScope.weight$default(columnScopeInstance, companion6, 1.0f, false, 2, null);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy9 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
                                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap15 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier15 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
                                constructor4 = companion8.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor4);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                composerM3407constructorimpl4 = Updater.m3407constructorimpl(composerStartRestartGroup);
                                eVarG = p035i0.a.g(companion8, composerM3407constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy9, composerM3407constructorimpl4, currentCompositionLocalMap15);
                                if (composerM3407constructorimpl4.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier15, companion8.getSetModifier());
                                GridCells.Fixed fixed2 = new GridCells.Fixed(3);
                                Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_7 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(f7));
                                Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_8 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(12));
                                Modifier modifierFillMaxSize$default5 = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null);
                                composerStartRestartGroup.startReplaceGroup(1425236413);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                companion4 = Composer.Companion;
                                if (objRememberedValue == companion4.getEmpty()) {
                                    objRememberedValue = new F(8, mutableState9, mutableState14, mutableState13);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                LazyGridDslKt.LazyVerticalGrid(fixed2, modifierFillMaxSize$default5, null, null, false, horizontalOrVerticalM548spacedBy0680j_8, horizontalOrVerticalM548spacedBy0680j_7, null, false, (c) objRememberedValue, composerStartRestartGroup, 807075888, 412);
                                b.n(composerStartRestartGroup, f6, companion6, composerStartRestartGroup, 6);
                                str = (String) mutableState14.getValue();
                                composerStartRestartGroup.startReplaceGroup(1551965696);
                                if (str != null) {
                                    long jColor2 = ColorKt.Color(4293870660L);
                                    TextStyle bodyMedium2 = materialTheme.getTypography(composerStartRestartGroup, i10).getBodyMedium();
                                    TextKt.m2432Text4IGK_g(str, PaddingKt.m672paddingqDBjuR0$default(companion6, 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f7), 7, null), jColor2, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, bodyMedium2.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium2.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodyMedium2.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium2.spanStyle.getFontWeight() : companion3.getSemiBold(), (16645977 & 8) != 0 ? bodyMedium2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium2.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium2.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium2.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 432, 0, 65016);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(1551985192);
                                zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance) {
                                    objRememberedValue2 = new C2382a6(context, coroutineScope, mutableState5, mutableState9, mutableState10, mutableState, mutableState14, mutableState13, mutableState12, mutableState6);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                } else {
                                    objRememberedValue2 = new C2382a6(context, coroutineScope, mutableState5, mutableState9, mutableState10, mutableState, mutableState14, mutableState13, mutableState12, mutableState6);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                q.a("Save Organized PDF", (a) objRememberedValue2, SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), null, false, false, composerStartRestartGroup, 390, 56);
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceGroup();
                            }
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.startReplaceGroup(442168952);
                        if (((Boolean) mutableState10.getValue()).booleanValue()) {
                            DialogProperties dialogProperties = new DialogProperties(false, false, false, 4, (AbstractC2168g) null);
                            Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(companion6, 0.85f);
                            composerStartRestartGroup.startReplaceGroup(442166902);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                                objRememberedValue4 = new f(4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            n.a((a) objRememberedValue4, modifierFillMaxWidth, 0L, dialogProperties, ComposableLambdaKt.rememberComposableLambda(1529991554, true, new C2401b9(state4, state2, mutableState, mutableState12), composerStartRestartGroup, 54), composerStartRestartGroup, 27702, 4);
                        }
                        if (p035i0.a.z(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG7);
                    Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier3, companion8.getSetModifier());
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    f8 = 1;
                    arrangement3 = arrangement2;
                    state2 = state;
                    IconButtonKt.IconButton(onBack, BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(40)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f8), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape()), false, null, null, C1.f13829a, composerStartRestartGroup, (i12 & 14) | 196608, 28);
                    composerStartRestartGroup = composerStartRestartGroup;
                    androidx.compose.foundation.text.modifiers.a.q(f6, companion6, composerStartRestartGroup, 6);
                    materialTheme = MaterialTheme.INSTANCE;
                    i10 = MaterialTheme.$stable;
                    TextStyle titleLarge2 = materialTheme.getTypography(composerStartRestartGroup, i10).getTitleLarge();
                    companion3 = FontWeight.Companion;
                    TextStyle textStyleM5917copyp1EtxEg2 = titleLarge2.m5917copyp1EtxEg((16645977 & 1) != 0 ? titleLarge2.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? titleLarge2.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(22), (16645977 & 4) != 0 ? titleLarge2.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? titleLarge2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? titleLarge2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? titleLarge2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? titleLarge2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? titleLarge2.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? titleLarge2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? titleLarge2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? titleLarge2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? titleLarge2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? titleLarge2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? titleLarge2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? titleLarge2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? titleLarge2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? titleLarge2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? titleLarge2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? titleLarge2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? titleLarge2.platformStyle : null, (16645977 & 1048576) != 0 ? titleLarge2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? titleLarge2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? titleLarge2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? titleLarge2.paragraphStyle.getTextMotion() : null);
                    j6 = p107y3.a.f15990o;
                    TextKt.m2432Text4IGK_g("Organize PDF", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, textStyleM5917copyp1EtxEg2, composerStartRestartGroup, 390, 0, 65530);
                    b.n(composerStartRestartGroup, f6, companion6, composerStartRestartGroup, 6);
                    if (((File) mutableState13.getValue()) != null) {
                        composerStartRestartGroup.startReplaceGroup(-1255053421);
                        Modifier modifierVerticalScroll$default3 = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion7.getCenterHorizontally(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap16 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier16 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default3);
                        constructor7 = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor7);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        e eVarG12 = p035i0.a.g(companion8, composerM3407constructorimpl7, measurePolicyColumnMeasurePolicy6, composerM3407constructorimpl7, currentCompositionLocalMap16);
                        if (composerM3407constructorimpl7.getInserting()) {
                            mutableState2 = mutableState14;
                            if (!o.b(composerM3407constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier16, companion8.getSetModifier());
                            float f12 = 32;
                            b.m(f12, companion6, composerStartRestartGroup, 6);
                            Modifier modifierClip3 = ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(96)), RoundedCornerShapeKt.getCircleShape());
                            long j10 = p107y3.a.f15984i;
                            Modifier modifierM220borderxT4_qwU3 = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(modifierClip3, Color.m3926copywmQWz5c$default(j10, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f8), Color.m3926copywmQWz5c$default(j10, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy10 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                            currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap17 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier17 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM220borderxT4_qwU3);
                            constructor8 = companion8.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor8);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            e eVarG13 = p035i0.a.g(companion8, composerM3407constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy10, composerM3407constructorimpl8, currentCompositionLocalMap17);
                            if (composerM3407constructorimpl8.getInserting()) {
                                mutableState3 = mutableState13;
                                if (!o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier17, companion8.getSetModifier());
                                Modifier modifierBackground$default5 = BackgroundKt.background$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(64)), RoundedCornerShapeKt.getCircleShape()), Brush.Companion.m3878linearGradientmHitzGk$default(companion, v.S(Color.m3917boximpl(j10), Color.m3917boximpl(ColorKt.Color(4281652121L))), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy11 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                                currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap18 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier18 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default5);
                                constructor9 = companion8.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor9);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                composerM3407constructorimpl9 = Updater.m3407constructorimpl(composerStartRestartGroup);
                                eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy11, composerM3407constructorimpl9, currentCompositionLocalMap18);
                                if (composerM3407constructorimpl9.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier18, companion8.getSetModifier());
                                IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), "Success", SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(36)), companion2.m3964getWhite0d7_KjU(), composerStartRestartGroup, 3504, 0);
                                b.r(composerStartRestartGroup, f5, companion6, composerStartRestartGroup, 6);
                                TextStyle headlineSmall5 = materialTheme.getTypography(composerStartRestartGroup, i10).getHeadlineSmall();
                                TextKt.m2432Text4IGK_g("PDF Saved Successfully!", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, headlineSmall5.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineSmall5.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? headlineSmall5.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineSmall5.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? headlineSmall5.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineSmall5.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineSmall5.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineSmall5.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineSmall5.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineSmall5.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineSmall5.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineSmall5.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineSmall5.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineSmall5.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineSmall5.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineSmall5.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineSmall5.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineSmall5.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineSmall5.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineSmall5.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineSmall5.platformStyle : null, (16645977 & 1048576) != 0 ? headlineSmall5.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineSmall5.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineSmall5.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineSmall5.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 390, 0, 65018);
                                b.m(28, companion6, composerStartRestartGroup, 6);
                                mutableState4 = mutableState3;
                                p097w3.j.a(PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(20), 7, null), 0L, Color.m3926copywmQWz5c$default(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-446322778, true, new S8(context, mutableState4, mutableState9), composerStartRestartGroup, 54), composerStartRestartGroup, 196998, 26);
                                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f12)), composerStartRestartGroup, 6);
                                composerStartRestartGroup.startReplaceGroup(1551057536);
                                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                                    objRememberedValue5 = new C2527j7(mutableState5, mutableState9, mutableState4, mutableState2, 3);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                ButtonKt.TextButton((a) objRememberedValue5, null, false, null, null, null, null, null, null, C1.f13832d, composerStartRestartGroup, 805306374, 510);
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceGroup();
                                state4 = stateAnimateFloat;
                            } else {
                                mutableState3 = mutableState13;
                            }
                            p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG13);
                            Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier17, companion8.getSetModifier());
                            Modifier modifierBackground$default6 = BackgroundKt.background$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(64)), RoundedCornerShapeKt.getCircleShape()), Brush.Companion.m3878linearGradientmHitzGk$default(companion, v.S(Color.m3917boximpl(j10), Color.m3917boximpl(ColorKt.Color(4281652121L))), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy12 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                            currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap19 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier19 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default6);
                            constructor9 = companion8.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor9);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl9 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy12, composerM3407constructorimpl9, currentCompositionLocalMap19);
                            if (composerM3407constructorimpl9.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier19, companion8.getSetModifier());
                            IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), "Success", SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(36)), companion2.m3964getWhite0d7_KjU(), composerStartRestartGroup, 3504, 0);
                            b.r(composerStartRestartGroup, f5, companion6, composerStartRestartGroup, 6);
                            TextStyle headlineSmall6 = materialTheme.getTypography(composerStartRestartGroup, i10).getHeadlineSmall();
                            TextKt.m2432Text4IGK_g("PDF Saved Successfully!", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, headlineSmall6.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineSmall6.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? headlineSmall6.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineSmall6.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? headlineSmall6.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineSmall6.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineSmall6.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineSmall6.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineSmall6.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineSmall6.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineSmall6.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineSmall6.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineSmall6.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineSmall6.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineSmall6.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineSmall6.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineSmall6.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineSmall6.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineSmall6.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineSmall6.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineSmall6.platformStyle : null, (16645977 & 1048576) != 0 ? headlineSmall6.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineSmall6.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineSmall6.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineSmall6.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 390, 0, 65018);
                            b.m(28, companion6, composerStartRestartGroup, 6);
                            mutableState4 = mutableState3;
                            p097w3.j.a(PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(20), 7, null), 0L, Color.m3926copywmQWz5c$default(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-446322778, true, new S8(context, mutableState4, mutableState9), composerStartRestartGroup, 54), composerStartRestartGroup, 196998, 26);
                            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f12)), composerStartRestartGroup, 6);
                            composerStartRestartGroup.startReplaceGroup(1551057536);
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                                objRememberedValue5 = new C2527j7(mutableState5, mutableState9, mutableState4, mutableState2, 3);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            ButtonKt.TextButton((a) objRememberedValue5, null, false, null, null, null, null, null, null, C1.f13832d, composerStartRestartGroup, 805306374, 510);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceGroup();
                            state4 = stateAnimateFloat;
                        } else {
                            mutableState2 = mutableState14;
                        }
                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG12);
                        Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier16, companion8.getSetModifier());
                        float f13 = 32;
                        b.m(f13, companion6, composerStartRestartGroup, 6);
                        Modifier modifierClip4 = ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(96)), RoundedCornerShapeKt.getCircleShape());
                        long j11 = p107y3.a.f15984i;
                        Modifier modifierM220borderxT4_qwU4 = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(modifierClip4, Color.m3926copywmQWz5c$default(j11, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f8), Color.m3926copywmQWz5c$default(j11, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy13 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                        currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier110 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM220borderxT4_qwU4);
                        constructor8 = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor8);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        e eVarG14 = p035i0.a.g(companion8, composerM3407constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy13, composerM3407constructorimpl8, currentCompositionLocalMap110);
                        if (composerM3407constructorimpl8.getInserting()) {
                            mutableState3 = mutableState13;
                            if (!o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier110, companion8.getSetModifier());
                            Modifier modifierBackground$default7 = BackgroundKt.background$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(64)), RoundedCornerShapeKt.getCircleShape()), Brush.Companion.m3878linearGradientmHitzGk$default(companion, v.S(Color.m3917boximpl(j11), Color.m3917boximpl(ColorKt.Color(4281652121L))), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy14 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                            currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier111 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default7);
                            constructor9 = companion8.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor9);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl9 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy14, composerM3407constructorimpl9, currentCompositionLocalMap111);
                            if (composerM3407constructorimpl9.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier111, companion8.getSetModifier());
                            IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), "Success", SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(36)), companion2.m3964getWhite0d7_KjU(), composerStartRestartGroup, 3504, 0);
                            b.r(composerStartRestartGroup, f5, companion6, composerStartRestartGroup, 6);
                            TextStyle headlineSmall7 = materialTheme.getTypography(composerStartRestartGroup, i10).getHeadlineSmall();
                            TextKt.m2432Text4IGK_g("PDF Saved Successfully!", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, headlineSmall7.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineSmall7.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? headlineSmall7.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineSmall7.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? headlineSmall7.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineSmall7.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineSmall7.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineSmall7.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineSmall7.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineSmall7.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineSmall7.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineSmall7.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineSmall7.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineSmall7.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineSmall7.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineSmall7.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineSmall7.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineSmall7.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineSmall7.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineSmall7.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineSmall7.platformStyle : null, (16645977 & 1048576) != 0 ? headlineSmall7.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineSmall7.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineSmall7.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineSmall7.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 390, 0, 65018);
                            b.m(28, companion6, composerStartRestartGroup, 6);
                            mutableState4 = mutableState3;
                            p097w3.j.a(PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(20), 7, null), 0L, Color.m3926copywmQWz5c$default(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-446322778, true, new S8(context, mutableState4, mutableState9), composerStartRestartGroup, 54), composerStartRestartGroup, 196998, 26);
                            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f13)), composerStartRestartGroup, 6);
                            composerStartRestartGroup.startReplaceGroup(1551057536);
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                                objRememberedValue5 = new C2527j7(mutableState5, mutableState9, mutableState4, mutableState2, 3);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            ButtonKt.TextButton((a) objRememberedValue5, null, false, null, null, null, null, null, null, C1.f13832d, composerStartRestartGroup, 805306374, 510);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceGroup();
                            state4 = stateAnimateFloat;
                        } else {
                            mutableState3 = mutableState13;
                        }
                        p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG14);
                        Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier110, companion8.getSetModifier());
                        Modifier modifierBackground$default8 = BackgroundKt.background$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(64)), RoundedCornerShapeKt.getCircleShape()), Brush.Companion.m3878linearGradientmHitzGk$default(companion, v.S(Color.m3917boximpl(j11), Color.m3917boximpl(ColorKt.Color(4281652121L))), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy15 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                        currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier112 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default8);
                        constructor9 = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor9);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl9 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy15, composerM3407constructorimpl9, currentCompositionLocalMap112);
                        if (composerM3407constructorimpl9.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier112, companion8.getSetModifier());
                        IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), "Success", SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(36)), companion2.m3964getWhite0d7_KjU(), composerStartRestartGroup, 3504, 0);
                        b.r(composerStartRestartGroup, f5, companion6, composerStartRestartGroup, 6);
                        TextStyle headlineSmall8 = materialTheme.getTypography(composerStartRestartGroup, i10).getHeadlineSmall();
                        TextKt.m2432Text4IGK_g("PDF Saved Successfully!", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, headlineSmall8.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineSmall8.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? headlineSmall8.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineSmall8.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? headlineSmall8.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineSmall8.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineSmall8.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineSmall8.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineSmall8.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineSmall8.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineSmall8.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineSmall8.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineSmall8.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineSmall8.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineSmall8.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineSmall8.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineSmall8.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineSmall8.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineSmall8.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineSmall8.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineSmall8.platformStyle : null, (16645977 & 1048576) != 0 ? headlineSmall8.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineSmall8.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineSmall8.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineSmall8.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 390, 0, 65018);
                        b.m(28, companion6, composerStartRestartGroup, 6);
                        mutableState4 = mutableState3;
                        p097w3.j.a(PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(20), 7, null), 0L, Color.m3926copywmQWz5c$default(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-446322778, true, new S8(context, mutableState4, mutableState9), composerStartRestartGroup, 54), composerStartRestartGroup, 196998, 26);
                        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f13)), composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceGroup(1551057536);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                            objRememberedValue5 = new C2527j7(mutableState5, mutableState9, mutableState4, mutableState2, 3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        ButtonKt.TextButton((a) objRememberedValue5, null, false, null, null, null, null, null, null, C1.f13832d, composerStartRestartGroup, 805306374, 510);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceGroup();
                        state4 = stateAnimateFloat;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1242473187);
                        if (((Uri) mutableState5.getValue()) == null) {
                            composerStartRestartGroup.startReplaceGroup(-1242989399);
                            Modifier modifierVerticalScroll$default4 = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy7 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion7.getCenterHorizontally(), composerStartRestartGroup, 48);
                            currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier113 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default4);
                            constructor5 = companion8.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor5);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl5 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG2 = p035i0.a.g(companion8, composerM3407constructorimpl5, measurePolicyColumnMeasurePolicy7, composerM3407constructorimpl5, currentCompositionLocalMap113);
                            if (composerM3407constructorimpl5.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier113, companion8.getSetModifier());
                            Modifier modifierM699height3ABfNKs2 = SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), Dp.m6403constructorimpl(280));
                            long jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(j5, stateAnimateFloat2.getValue().floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                            composerStartRestartGroup.startReplaceGroup(1551090884);
                            zChangedInstance2 = composerStartRestartGroup.changedInstance(lVarV);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance2) {
                                objRememberedValue3 = new P5(lVarV, 14);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                objRememberedValue3 = new P5(lVarV, 14);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            p097w3.j.a(modifierM699height3ABfNKs2, 0L, jM3926copywmQWz5c$default2, 0.0f, (a) objRememberedValue3, ComposableLambdaKt.rememberComposableLambda(201211522, true, new T8(lVarV, stateAnimateFloat2, stateAnimateFloat), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 10);
                            b.m(f5, companion6, composerStartRestartGroup, 6);
                            TextStyle titleMedium2 = materialTheme.getTypography(composerStartRestartGroup, i10).getTitleMedium();
                            TextKt.m2432Text4IGK_g("How it works", PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(12), 7, null), j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, titleMedium2.m5917copyp1EtxEg((16645977 & 1) != 0 ? titleMedium2.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? titleMedium2.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? titleMedium2.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? titleMedium2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? titleMedium2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? titleMedium2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? titleMedium2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? titleMedium2.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? titleMedium2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? titleMedium2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? titleMedium2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? titleMedium2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? titleMedium2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? titleMedium2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? titleMedium2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? titleMedium2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? titleMedium2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? titleMedium2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? titleMedium2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? titleMedium2.platformStyle : null, (16645977 & 1048576) != 0 ? titleMedium2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? titleMedium2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? titleMedium2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? titleMedium2.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 438, 0, 65528);
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_9 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(10));
                            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy8 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_9, companion7.getStart(), composerStartRestartGroup, 6);
                            currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier114 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default3);
                            constructor6 = companion8.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor6);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG3 = p035i0.a.g(companion8, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy8, composerM3407constructorimpl6, currentCompositionLocalMap114);
                            if (composerM3407constructorimpl6.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier114, companion8.getSetModifier());
                            Icons.Outlined outlined2 = Icons.Outlined.INSTANCE;
                            b("01", DescriptionKt.getDescription(outlined2), "Import PDF Document", "Choose the PDF file you want to organize from your device storage.", composerStartRestartGroup, 3462);
                            b("02", GridViewKt.getGridView(outlined2), "Reorder & Rotate Pages", "Drag pages or use Move Up/Down, Rotate 90°, Duplicate or Delete options on each page.", composerStartRestartGroup, 3462);
                            b("03", SaveKt.getSave(outlined2), "Save New Document", "Confirm changes and click 'Save PDF' to generate the optimized, updated file.", composerStartRestartGroup, 3462);
                            composerStartRestartGroup.endNode();
                            b.m(20, companion6, composerStartRestartGroup, 6);
                            Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
                            long j12 = p107y3.a.f15984i;
                            p097w3.j.a(modifierFillMaxWidth$default4, Color.m3926copywmQWz5c$default(j12, 0.03f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(j12, 0.15f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, C1.e, composerStartRestartGroup, 197046, 24);
                            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f6)), composerStartRestartGroup, 6);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceGroup();
                            state4 = stateAnimateFloat;
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-1233398898);
                            Modifier modifierFillMaxSize$default6 = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy9 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion7.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier115 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default6);
                            constructor3 = companion8.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor3);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl3 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            e eVarG15 = p035i0.a.g(companion8, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy9, composerM3407constructorimpl3, currentCompositionLocalMap115);
                            if (composerM3407constructorimpl3.getInserting()) {
                                state3 = stateAnimateFloat;
                                if (!o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier115, companion8.getSetModifier());
                                if (i13 > 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z4, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-486966906, true, new V8(i13, mutableState9, mutableState13, mutableState14), composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
                                if (i13 == 0) {
                                    f9 = 0.0f;
                                    i11 = 3;
                                    z5 = true;
                                } else {
                                    f9 = 0.0f;
                                    i11 = 3;
                                    z5 = false;
                                }
                                AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z5, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, f9, i11, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-1332655761, true, new X8(mutableState6, mutableState8, mutableState7, mutableState5), composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
                                state4 = state3;
                                Modifier modifierWeight$default3 = ColumnScope.weight$default(columnScopeInstance, companion6, 1.0f, false, 2, null);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy16 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
                                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier116 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default3);
                                constructor4 = companion8.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor4);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                composerM3407constructorimpl4 = Updater.m3407constructorimpl(composerStartRestartGroup);
                                eVarG = p035i0.a.g(companion8, composerM3407constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy16, composerM3407constructorimpl4, currentCompositionLocalMap116);
                                if (composerM3407constructorimpl4.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier116, companion8.getSetModifier());
                                GridCells.Fixed fixed3 = new GridCells.Fixed(3);
                                Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_10 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(f7));
                                Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_11 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(12));
                                Modifier modifierFillMaxSize$default7 = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null);
                                composerStartRestartGroup.startReplaceGroup(1425236413);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                companion4 = Composer.Companion;
                                if (objRememberedValue == companion4.getEmpty()) {
                                    objRememberedValue = new F(8, mutableState9, mutableState14, mutableState13);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                LazyGridDslKt.LazyVerticalGrid(fixed3, modifierFillMaxSize$default7, null, null, false, horizontalOrVerticalM548spacedBy0680j_11, horizontalOrVerticalM548spacedBy0680j_10, null, false, (c) objRememberedValue, composerStartRestartGroup, 807075888, 412);
                                b.n(composerStartRestartGroup, f6, companion6, composerStartRestartGroup, 6);
                                str = (String) mutableState14.getValue();
                                composerStartRestartGroup.startReplaceGroup(1551965696);
                                if (str != null) {
                                    long jColor3 = ColorKt.Color(4293870660L);
                                    TextStyle bodyMedium3 = materialTheme.getTypography(composerStartRestartGroup, i10).getBodyMedium();
                                    TextKt.m2432Text4IGK_g(str, PaddingKt.m672paddingqDBjuR0$default(companion6, 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f7), 7, null), jColor3, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, bodyMedium3.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium3.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodyMedium3.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium3.spanStyle.getFontWeight() : companion3.getSemiBold(), (16645977 & 8) != 0 ? bodyMedium3.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium3.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium3.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium3.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium3.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium3.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium3.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium3.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium3.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium3.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium3.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium3.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium3.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium3.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium3.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium3.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium3.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium3.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium3.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium3.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium3.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 432, 0, 65016);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(1551985192);
                                zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance) {
                                    objRememberedValue2 = new C2382a6(context, coroutineScope, mutableState5, mutableState9, mutableState10, mutableState, mutableState14, mutableState13, mutableState12, mutableState6);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                } else {
                                    objRememberedValue2 = new C2382a6(context, coroutineScope, mutableState5, mutableState9, mutableState10, mutableState, mutableState14, mutableState13, mutableState12, mutableState6);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                q.a("Save Organized PDF", (a) objRememberedValue2, SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), null, false, false, composerStartRestartGroup, 390, 56);
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                state3 = stateAnimateFloat;
                            }
                            p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG15);
                            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier115, companion8.getSetModifier());
                            if (i13 > 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z4, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-486966906, true, new V8(i13, mutableState9, mutableState13, mutableState14), composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
                            if (i13 == 0) {
                                f9 = 0.0f;
                                i11 = 3;
                                z5 = true;
                            } else {
                                f9 = 0.0f;
                                i11 = 3;
                                z5 = false;
                            }
                            AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z5, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, f9, i11, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-1332655761, true, new X8(mutableState6, mutableState8, mutableState7, mutableState5), composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
                            state4 = state3;
                            Modifier modifierWeight$default4 = ColumnScope.weight$default(columnScopeInstance, companion6, 1.0f, false, 2, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy17 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
                            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier117 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default4);
                            constructor4 = companion8.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor4);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl4 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG = p035i0.a.g(companion8, composerM3407constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy17, composerM3407constructorimpl4, currentCompositionLocalMap117);
                            if (composerM3407constructorimpl4.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier117, companion8.getSetModifier());
                            GridCells.Fixed fixed4 = new GridCells.Fixed(3);
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_12 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(f7));
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_13 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(12));
                            Modifier modifierFillMaxSize$default8 = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null);
                            composerStartRestartGroup.startReplaceGroup(1425236413);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion4 = Composer.Companion;
                            if (objRememberedValue == companion4.getEmpty()) {
                                objRememberedValue = new F(8, mutableState9, mutableState14, mutableState13);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            LazyGridDslKt.LazyVerticalGrid(fixed4, modifierFillMaxSize$default8, null, null, false, horizontalOrVerticalM548spacedBy0680j_13, horizontalOrVerticalM548spacedBy0680j_12, null, false, (c) objRememberedValue, composerStartRestartGroup, 807075888, 412);
                            b.n(composerStartRestartGroup, f6, companion6, composerStartRestartGroup, 6);
                            str = (String) mutableState14.getValue();
                            composerStartRestartGroup.startReplaceGroup(1551965696);
                            if (str != null) {
                                long jColor4 = ColorKt.Color(4293870660L);
                                TextStyle bodyMedium4 = materialTheme.getTypography(composerStartRestartGroup, i10).getBodyMedium();
                                TextKt.m2432Text4IGK_g(str, PaddingKt.m672paddingqDBjuR0$default(companion6, 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f7), 7, null), jColor4, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, bodyMedium4.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium4.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodyMedium4.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium4.spanStyle.getFontWeight() : companion3.getSemiBold(), (16645977 & 8) != 0 ? bodyMedium4.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium4.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium4.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium4.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium4.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium4.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium4.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium4.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium4.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium4.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium4.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium4.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium4.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium4.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium4.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium4.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium4.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium4.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium4.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium4.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium4.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 432, 0, 65016);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1551985192);
                            zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance) {
                                objRememberedValue2 = new C2382a6(context, coroutineScope, mutableState5, mutableState9, mutableState10, mutableState, mutableState14, mutableState13, mutableState12, mutableState6);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new C2382a6(context, coroutineScope, mutableState5, mutableState9, mutableState10, mutableState, mutableState14, mutableState13, mutableState12, mutableState6);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            q.a("Save Organized PDF", (a) objRememberedValue2, SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), null, false, false, composerStartRestartGroup, 390, 56);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.startReplaceGroup(442168952);
                    if (((Boolean) mutableState10.getValue()).booleanValue()) {
                        DialogProperties dialogProperties2 = new DialogProperties(false, false, false, 4, (AbstractC2168g) null);
                        Modifier modifierFillMaxWidth2 = SizeKt.fillMaxWidth(companion6, 0.85f);
                        composerStartRestartGroup.startReplaceGroup(442166902);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                            objRememberedValue4 = new f(4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        n.a((a) objRememberedValue4, modifierFillMaxWidth2, 0L, dialogProperties2, ComposableLambdaKt.rememberComposableLambda(1529991554, true, new C2401b9(state4, state2, mutableState, mutableState12), composerStartRestartGroup, 54), composerStartRestartGroup, 27702, 4);
                    }
                    if (p035i0.a.z(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                }
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG6);
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier2, companion8.getSetModifier());
                columnScopeInstance = ColumnScopeInstance.INSTANCE;
                f7 = 8;
                Modifier modifierM670paddingVpY3zN4$default2 = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, Dp.m6403constructorimpl(f7), 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion7.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap20 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier20 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM670paddingVpY3zN4$default2);
                constructor2 = companion8.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3407constructorimpl2 = Updater.m3407constructorimpl(composerStartRestartGroup);
                e eVarG16 = p035i0.a.g(companion8, composerM3407constructorimpl2, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl2, currentCompositionLocalMap20);
                if (composerM3407constructorimpl2.getInserting()) {
                    arrangement2 = arrangement;
                    if (!o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier20, companion8.getSetModifier());
                    RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                    f8 = 1;
                    arrangement3 = arrangement2;
                    state2 = state;
                    IconButtonKt.IconButton(onBack, BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(40)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f8), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape()), false, null, null, C1.f13829a, composerStartRestartGroup, (i12 & 14) | 196608, 28);
                    composerStartRestartGroup = composerStartRestartGroup;
                    androidx.compose.foundation.text.modifiers.a.q(f6, companion6, composerStartRestartGroup, 6);
                    materialTheme = MaterialTheme.INSTANCE;
                    i10 = MaterialTheme.$stable;
                    TextStyle titleLarge3 = materialTheme.getTypography(composerStartRestartGroup, i10).getTitleLarge();
                    companion3 = FontWeight.Companion;
                    TextStyle textStyleM5917copyp1EtxEg3 = titleLarge3.m5917copyp1EtxEg((16645977 & 1) != 0 ? titleLarge3.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? titleLarge3.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(22), (16645977 & 4) != 0 ? titleLarge3.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? titleLarge3.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? titleLarge3.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? titleLarge3.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? titleLarge3.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? titleLarge3.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? titleLarge3.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? titleLarge3.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? titleLarge3.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? titleLarge3.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? titleLarge3.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? titleLarge3.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? titleLarge3.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? titleLarge3.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? titleLarge3.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? titleLarge3.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? titleLarge3.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? titleLarge3.platformStyle : null, (16645977 & 1048576) != 0 ? titleLarge3.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? titleLarge3.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? titleLarge3.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? titleLarge3.paragraphStyle.getTextMotion() : null);
                    j6 = p107y3.a.f15990o;
                    TextKt.m2432Text4IGK_g("Organize PDF", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, textStyleM5917copyp1EtxEg3, composerStartRestartGroup, 390, 0, 65530);
                    b.n(composerStartRestartGroup, f6, companion6, composerStartRestartGroup, 6);
                    if (((File) mutableState13.getValue()) != null) {
                        composerStartRestartGroup.startReplaceGroup(-1255053421);
                        Modifier modifierVerticalScroll$default5 = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy10 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion7.getCenterHorizontally(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier118 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default5);
                        constructor7 = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor7);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        e eVarG17 = p035i0.a.g(companion8, composerM3407constructorimpl7, measurePolicyColumnMeasurePolicy10, composerM3407constructorimpl7, currentCompositionLocalMap118);
                        if (composerM3407constructorimpl7.getInserting()) {
                            mutableState2 = mutableState14;
                            if (!o.b(composerM3407constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier118, companion8.getSetModifier());
                            float f14 = 32;
                            b.m(f14, companion6, composerStartRestartGroup, 6);
                            Modifier modifierClip5 = ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(96)), RoundedCornerShapeKt.getCircleShape());
                            long j13 = p107y3.a.f15984i;
                            Modifier modifierM220borderxT4_qwU5 = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(modifierClip5, Color.m3926copywmQWz5c$default(j13, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f8), Color.m3926copywmQWz5c$default(j13, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy18 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                            currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier119 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM220borderxT4_qwU5);
                            constructor8 = companion8.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor8);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            e eVarG18 = p035i0.a.g(companion8, composerM3407constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy18, composerM3407constructorimpl8, currentCompositionLocalMap119);
                            if (composerM3407constructorimpl8.getInserting()) {
                                mutableState3 = mutableState13;
                                if (!o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier119, companion8.getSetModifier());
                                Modifier modifierBackground$default9 = BackgroundKt.background$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(64)), RoundedCornerShapeKt.getCircleShape()), Brush.Companion.m3878linearGradientmHitzGk$default(companion, v.S(Color.m3917boximpl(j13), Color.m3917boximpl(ColorKt.Color(4281652121L))), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy19 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                                currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap1110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier1110 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default9);
                                constructor9 = companion8.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor9);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                composerM3407constructorimpl9 = Updater.m3407constructorimpl(composerStartRestartGroup);
                                eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy19, composerM3407constructorimpl9, currentCompositionLocalMap1110);
                                if (composerM3407constructorimpl9.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier1110, companion8.getSetModifier());
                                IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), "Success", SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(36)), companion2.m3964getWhite0d7_KjU(), composerStartRestartGroup, 3504, 0);
                                b.r(composerStartRestartGroup, f5, companion6, composerStartRestartGroup, 6);
                                TextStyle headlineSmall9 = materialTheme.getTypography(composerStartRestartGroup, i10).getHeadlineSmall();
                                TextKt.m2432Text4IGK_g("PDF Saved Successfully!", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, headlineSmall9.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineSmall9.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? headlineSmall9.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineSmall9.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? headlineSmall9.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineSmall9.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineSmall9.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineSmall9.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineSmall9.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineSmall9.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineSmall9.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineSmall9.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineSmall9.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineSmall9.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineSmall9.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineSmall9.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineSmall9.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineSmall9.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineSmall9.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineSmall9.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineSmall9.platformStyle : null, (16645977 & 1048576) != 0 ? headlineSmall9.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineSmall9.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineSmall9.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineSmall9.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 390, 0, 65018);
                                b.m(28, companion6, composerStartRestartGroup, 6);
                                mutableState4 = mutableState3;
                                p097w3.j.a(PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(20), 7, null), 0L, Color.m3926copywmQWz5c$default(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-446322778, true, new S8(context, mutableState4, mutableState9), composerStartRestartGroup, 54), composerStartRestartGroup, 196998, 26);
                                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f14)), composerStartRestartGroup, 6);
                                composerStartRestartGroup.startReplaceGroup(1551057536);
                                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                                    objRememberedValue5 = new C2527j7(mutableState5, mutableState9, mutableState4, mutableState2, 3);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                ButtonKt.TextButton((a) objRememberedValue5, null, false, null, null, null, null, null, null, C1.f13832d, composerStartRestartGroup, 805306374, 510);
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceGroup();
                                state4 = stateAnimateFloat;
                            } else {
                                mutableState3 = mutableState13;
                            }
                            p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG18);
                            Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier119, companion8.getSetModifier());
                            Modifier modifierBackground$default10 = BackgroundKt.background$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(64)), RoundedCornerShapeKt.getCircleShape()), Brush.Companion.m3878linearGradientmHitzGk$default(companion, v.S(Color.m3917boximpl(j13), Color.m3917boximpl(ColorKt.Color(4281652121L))), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy110 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                            currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap1111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier1111 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default10);
                            constructor9 = companion8.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor9);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl9 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy110, composerM3407constructorimpl9, currentCompositionLocalMap1111);
                            if (composerM3407constructorimpl9.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier1111, companion8.getSetModifier());
                            IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), "Success", SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(36)), companion2.m3964getWhite0d7_KjU(), composerStartRestartGroup, 3504, 0);
                            b.r(composerStartRestartGroup, f5, companion6, composerStartRestartGroup, 6);
                            TextStyle headlineSmall10 = materialTheme.getTypography(composerStartRestartGroup, i10).getHeadlineSmall();
                            TextKt.m2432Text4IGK_g("PDF Saved Successfully!", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, headlineSmall10.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineSmall10.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? headlineSmall10.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineSmall10.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? headlineSmall10.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineSmall10.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineSmall10.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineSmall10.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineSmall10.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineSmall10.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineSmall10.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineSmall10.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineSmall10.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineSmall10.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineSmall10.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineSmall10.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineSmall10.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineSmall10.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineSmall10.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineSmall10.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineSmall10.platformStyle : null, (16645977 & 1048576) != 0 ? headlineSmall10.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineSmall10.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineSmall10.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineSmall10.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 390, 0, 65018);
                            b.m(28, companion6, composerStartRestartGroup, 6);
                            mutableState4 = mutableState3;
                            p097w3.j.a(PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(20), 7, null), 0L, Color.m3926copywmQWz5c$default(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-446322778, true, new S8(context, mutableState4, mutableState9), composerStartRestartGroup, 54), composerStartRestartGroup, 196998, 26);
                            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f14)), composerStartRestartGroup, 6);
                            composerStartRestartGroup.startReplaceGroup(1551057536);
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                                objRememberedValue5 = new C2527j7(mutableState5, mutableState9, mutableState4, mutableState2, 3);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            ButtonKt.TextButton((a) objRememberedValue5, null, false, null, null, null, null, null, null, C1.f13832d, composerStartRestartGroup, 805306374, 510);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceGroup();
                            state4 = stateAnimateFloat;
                        } else {
                            mutableState2 = mutableState14;
                        }
                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG17);
                        Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier118, companion8.getSetModifier());
                        float f15 = 32;
                        b.m(f15, companion6, composerStartRestartGroup, 6);
                        Modifier modifierClip6 = ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(96)), RoundedCornerShapeKt.getCircleShape());
                        long j14 = p107y3.a.f15984i;
                        Modifier modifierM220borderxT4_qwU6 = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(modifierClip6, Color.m3926copywmQWz5c$default(j14, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f8), Color.m3926copywmQWz5c$default(j14, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy111 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                        currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap1112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier1112 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM220borderxT4_qwU6);
                        constructor8 = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor8);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        e eVarG19 = p035i0.a.g(companion8, composerM3407constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy111, composerM3407constructorimpl8, currentCompositionLocalMap1112);
                        if (composerM3407constructorimpl8.getInserting()) {
                            mutableState3 = mutableState13;
                            if (!o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier1112, companion8.getSetModifier());
                            Modifier modifierBackground$default11 = BackgroundKt.background$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(64)), RoundedCornerShapeKt.getCircleShape()), Brush.Companion.m3878linearGradientmHitzGk$default(companion, v.S(Color.m3917boximpl(j14), Color.m3917boximpl(ColorKt.Color(4281652121L))), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy112 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                            currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap1113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier1113 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default11);
                            constructor9 = companion8.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor9);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl9 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy112, composerM3407constructorimpl9, currentCompositionLocalMap1113);
                            if (composerM3407constructorimpl9.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier1113, companion8.getSetModifier());
                            IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), "Success", SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(36)), companion2.m3964getWhite0d7_KjU(), composerStartRestartGroup, 3504, 0);
                            b.r(composerStartRestartGroup, f5, companion6, composerStartRestartGroup, 6);
                            TextStyle headlineSmall11 = materialTheme.getTypography(composerStartRestartGroup, i10).getHeadlineSmall();
                            TextKt.m2432Text4IGK_g("PDF Saved Successfully!", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, headlineSmall11.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineSmall11.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? headlineSmall11.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineSmall11.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? headlineSmall11.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineSmall11.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineSmall11.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineSmall11.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineSmall11.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineSmall11.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineSmall11.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineSmall11.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineSmall11.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineSmall11.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineSmall11.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineSmall11.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineSmall11.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineSmall11.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineSmall11.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineSmall11.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineSmall11.platformStyle : null, (16645977 & 1048576) != 0 ? headlineSmall11.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineSmall11.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineSmall11.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineSmall11.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 390, 0, 65018);
                            b.m(28, companion6, composerStartRestartGroup, 6);
                            mutableState4 = mutableState3;
                            p097w3.j.a(PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(20), 7, null), 0L, Color.m3926copywmQWz5c$default(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-446322778, true, new S8(context, mutableState4, mutableState9), composerStartRestartGroup, 54), composerStartRestartGroup, 196998, 26);
                            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f15)), composerStartRestartGroup, 6);
                            composerStartRestartGroup.startReplaceGroup(1551057536);
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                                objRememberedValue5 = new C2527j7(mutableState5, mutableState9, mutableState4, mutableState2, 3);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            ButtonKt.TextButton((a) objRememberedValue5, null, false, null, null, null, null, null, null, C1.f13832d, composerStartRestartGroup, 805306374, 510);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceGroup();
                            state4 = stateAnimateFloat;
                        } else {
                            mutableState3 = mutableState13;
                        }
                        p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG19);
                        Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier1112, companion8.getSetModifier());
                        Modifier modifierBackground$default12 = BackgroundKt.background$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(64)), RoundedCornerShapeKt.getCircleShape()), Brush.Companion.m3878linearGradientmHitzGk$default(companion, v.S(Color.m3917boximpl(j14), Color.m3917boximpl(ColorKt.Color(4281652121L))), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy113 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                        currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap1114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier1114 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default12);
                        constructor9 = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor9);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl9 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy113, composerM3407constructorimpl9, currentCompositionLocalMap1114);
                        if (composerM3407constructorimpl9.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier1114, companion8.getSetModifier());
                        IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), "Success", SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(36)), companion2.m3964getWhite0d7_KjU(), composerStartRestartGroup, 3504, 0);
                        b.r(composerStartRestartGroup, f5, companion6, composerStartRestartGroup, 6);
                        TextStyle headlineSmall12 = materialTheme.getTypography(composerStartRestartGroup, i10).getHeadlineSmall();
                        TextKt.m2432Text4IGK_g("PDF Saved Successfully!", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, headlineSmall12.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineSmall12.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? headlineSmall12.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineSmall12.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? headlineSmall12.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineSmall12.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineSmall12.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineSmall12.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineSmall12.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineSmall12.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineSmall12.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineSmall12.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineSmall12.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineSmall12.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineSmall12.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineSmall12.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineSmall12.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineSmall12.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineSmall12.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineSmall12.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineSmall12.platformStyle : null, (16645977 & 1048576) != 0 ? headlineSmall12.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineSmall12.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineSmall12.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineSmall12.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 390, 0, 65018);
                        b.m(28, companion6, composerStartRestartGroup, 6);
                        mutableState4 = mutableState3;
                        p097w3.j.a(PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(20), 7, null), 0L, Color.m3926copywmQWz5c$default(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-446322778, true, new S8(context, mutableState4, mutableState9), composerStartRestartGroup, 54), composerStartRestartGroup, 196998, 26);
                        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f15)), composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceGroup(1551057536);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                            objRememberedValue5 = new C2527j7(mutableState5, mutableState9, mutableState4, mutableState2, 3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        ButtonKt.TextButton((a) objRememberedValue5, null, false, null, null, null, null, null, null, C1.f13832d, composerStartRestartGroup, 805306374, 510);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceGroup();
                        state4 = stateAnimateFloat;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1242473187);
                        if (((Uri) mutableState5.getValue()) == null) {
                            composerStartRestartGroup.startReplaceGroup(-1242989399);
                            Modifier modifierVerticalScroll$default6 = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy11 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion7.getCenterHorizontally(), composerStartRestartGroup, 48);
                            currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap1115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier1115 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default6);
                            constructor5 = companion8.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor5);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl5 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG2 = p035i0.a.g(companion8, composerM3407constructorimpl5, measurePolicyColumnMeasurePolicy11, composerM3407constructorimpl5, currentCompositionLocalMap1115);
                            if (composerM3407constructorimpl5.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier1115, companion8.getSetModifier());
                            Modifier modifierM699height3ABfNKs3 = SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), Dp.m6403constructorimpl(280));
                            long jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(j5, stateAnimateFloat2.getValue().floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                            composerStartRestartGroup.startReplaceGroup(1551090884);
                            zChangedInstance2 = composerStartRestartGroup.changedInstance(lVarV);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance2) {
                                objRememberedValue3 = new P5(lVarV, 14);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                objRememberedValue3 = new P5(lVarV, 14);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            p097w3.j.a(modifierM699height3ABfNKs3, 0L, jM3926copywmQWz5c$default3, 0.0f, (a) objRememberedValue3, ComposableLambdaKt.rememberComposableLambda(201211522, true, new T8(lVarV, stateAnimateFloat2, stateAnimateFloat), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 10);
                            b.m(f5, companion6, composerStartRestartGroup, 6);
                            TextStyle titleMedium3 = materialTheme.getTypography(composerStartRestartGroup, i10).getTitleMedium();
                            TextKt.m2432Text4IGK_g("How it works", PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(12), 7, null), j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, titleMedium3.m5917copyp1EtxEg((16645977 & 1) != 0 ? titleMedium3.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? titleMedium3.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? titleMedium3.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? titleMedium3.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? titleMedium3.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? titleMedium3.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? titleMedium3.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? titleMedium3.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? titleMedium3.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? titleMedium3.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? titleMedium3.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? titleMedium3.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? titleMedium3.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? titleMedium3.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? titleMedium3.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? titleMedium3.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? titleMedium3.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? titleMedium3.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? titleMedium3.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? titleMedium3.platformStyle : null, (16645977 & 1048576) != 0 ? titleMedium3.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? titleMedium3.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? titleMedium3.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? titleMedium3.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 438, 0, 65528);
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_14 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(10));
                            Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy12 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_14, companion7.getStart(), composerStartRestartGroup, 6);
                            currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap1116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier1116 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default5);
                            constructor6 = companion8.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor6);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG3 = p035i0.a.g(companion8, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy12, composerM3407constructorimpl6, currentCompositionLocalMap1116);
                            if (composerM3407constructorimpl6.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier1116, companion8.getSetModifier());
                            Icons.Outlined outlined3 = Icons.Outlined.INSTANCE;
                            b("01", DescriptionKt.getDescription(outlined3), "Import PDF Document", "Choose the PDF file you want to organize from your device storage.", composerStartRestartGroup, 3462);
                            b("02", GridViewKt.getGridView(outlined3), "Reorder & Rotate Pages", "Drag pages or use Move Up/Down, Rotate 90°, Duplicate or Delete options on each page.", composerStartRestartGroup, 3462);
                            b("03", SaveKt.getSave(outlined3), "Save New Document", "Confirm changes and click 'Save PDF' to generate the optimized, updated file.", composerStartRestartGroup, 3462);
                            composerStartRestartGroup.endNode();
                            b.m(20, companion6, composerStartRestartGroup, 6);
                            Modifier modifierFillMaxWidth$default6 = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
                            long j15 = p107y3.a.f15984i;
                            p097w3.j.a(modifierFillMaxWidth$default6, Color.m3926copywmQWz5c$default(j15, 0.03f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(j15, 0.15f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, C1.e, composerStartRestartGroup, 197046, 24);
                            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f6)), composerStartRestartGroup, 6);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceGroup();
                            state4 = stateAnimateFloat;
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-1233398898);
                            Modifier modifierFillMaxSize$default9 = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy13 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion7.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap1117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier1117 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default9);
                            constructor3 = companion8.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor3);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl3 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            e eVarG110 = p035i0.a.g(companion8, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy13, composerM3407constructorimpl3, currentCompositionLocalMap1117);
                            if (composerM3407constructorimpl3.getInserting()) {
                                state3 = stateAnimateFloat;
                                if (!o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier1117, companion8.getSetModifier());
                                if (i13 > 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z4, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-486966906, true, new V8(i13, mutableState9, mutableState13, mutableState14), composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
                                if (i13 == 0) {
                                    f9 = 0.0f;
                                    i11 = 3;
                                    z5 = true;
                                } else {
                                    f9 = 0.0f;
                                    i11 = 3;
                                    z5 = false;
                                }
                                AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z5, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, f9, i11, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-1332655761, true, new X8(mutableState6, mutableState8, mutableState7, mutableState5), composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
                                state4 = state3;
                                Modifier modifierWeight$default5 = ColumnScope.weight$default(columnScopeInstance, companion6, 1.0f, false, 2, null);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy114 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
                                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap1118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier1118 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default5);
                                constructor4 = companion8.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor4);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                composerM3407constructorimpl4 = Updater.m3407constructorimpl(composerStartRestartGroup);
                                eVarG = p035i0.a.g(companion8, composerM3407constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy114, composerM3407constructorimpl4, currentCompositionLocalMap1118);
                                if (composerM3407constructorimpl4.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier1118, companion8.getSetModifier());
                                GridCells.Fixed fixed5 = new GridCells.Fixed(3);
                                Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_15 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(f7));
                                Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_16 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(12));
                                Modifier modifierFillMaxSize$default10 = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null);
                                composerStartRestartGroup.startReplaceGroup(1425236413);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                companion4 = Composer.Companion;
                                if (objRememberedValue == companion4.getEmpty()) {
                                    objRememberedValue = new F(8, mutableState9, mutableState14, mutableState13);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                LazyGridDslKt.LazyVerticalGrid(fixed5, modifierFillMaxSize$default10, null, null, false, horizontalOrVerticalM548spacedBy0680j_16, horizontalOrVerticalM548spacedBy0680j_15, null, false, (c) objRememberedValue, composerStartRestartGroup, 807075888, 412);
                                b.n(composerStartRestartGroup, f6, companion6, composerStartRestartGroup, 6);
                                str = (String) mutableState14.getValue();
                                composerStartRestartGroup.startReplaceGroup(1551965696);
                                if (str != null) {
                                    long jColor5 = ColorKt.Color(4293870660L);
                                    TextStyle bodyMedium5 = materialTheme.getTypography(composerStartRestartGroup, i10).getBodyMedium();
                                    TextKt.m2432Text4IGK_g(str, PaddingKt.m672paddingqDBjuR0$default(companion6, 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f7), 7, null), jColor5, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, bodyMedium5.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium5.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodyMedium5.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium5.spanStyle.getFontWeight() : companion3.getSemiBold(), (16645977 & 8) != 0 ? bodyMedium5.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium5.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium5.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium5.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium5.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium5.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium5.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium5.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium5.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium5.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium5.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium5.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium5.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium5.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium5.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium5.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium5.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium5.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium5.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium5.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium5.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 432, 0, 65016);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(1551985192);
                                zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance) {
                                    objRememberedValue2 = new C2382a6(context, coroutineScope, mutableState5, mutableState9, mutableState10, mutableState, mutableState14, mutableState13, mutableState12, mutableState6);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                } else {
                                    objRememberedValue2 = new C2382a6(context, coroutineScope, mutableState5, mutableState9, mutableState10, mutableState, mutableState14, mutableState13, mutableState12, mutableState6);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                q.a("Save Organized PDF", (a) objRememberedValue2, SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), null, false, false, composerStartRestartGroup, 390, 56);
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                state3 = stateAnimateFloat;
                            }
                            p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG110);
                            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier1117, companion8.getSetModifier());
                            if (i13 > 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z4, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-486966906, true, new V8(i13, mutableState9, mutableState13, mutableState14), composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
                            if (i13 == 0) {
                                f9 = 0.0f;
                                i11 = 3;
                                z5 = true;
                            } else {
                                f9 = 0.0f;
                                i11 = 3;
                                z5 = false;
                            }
                            AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z5, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, f9, i11, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-1332655761, true, new X8(mutableState6, mutableState8, mutableState7, mutableState5), composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
                            state4 = state3;
                            Modifier modifierWeight$default6 = ColumnScope.weight$default(columnScopeInstance, companion6, 1.0f, false, 2, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy115 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
                            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap1119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier1119 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default6);
                            constructor4 = companion8.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor4);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl4 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG = p035i0.a.g(companion8, composerM3407constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy115, composerM3407constructorimpl4, currentCompositionLocalMap1119);
                            if (composerM3407constructorimpl4.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier1119, companion8.getSetModifier());
                            GridCells.Fixed fixed6 = new GridCells.Fixed(3);
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_17 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(f7));
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_18 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(12));
                            Modifier modifierFillMaxSize$default11 = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null);
                            composerStartRestartGroup.startReplaceGroup(1425236413);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion4 = Composer.Companion;
                            if (objRememberedValue == companion4.getEmpty()) {
                                objRememberedValue = new F(8, mutableState9, mutableState14, mutableState13);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            LazyGridDslKt.LazyVerticalGrid(fixed6, modifierFillMaxSize$default11, null, null, false, horizontalOrVerticalM548spacedBy0680j_18, horizontalOrVerticalM548spacedBy0680j_17, null, false, (c) objRememberedValue, composerStartRestartGroup, 807075888, 412);
                            b.n(composerStartRestartGroup, f6, companion6, composerStartRestartGroup, 6);
                            str = (String) mutableState14.getValue();
                            composerStartRestartGroup.startReplaceGroup(1551965696);
                            if (str != null) {
                                long jColor6 = ColorKt.Color(4293870660L);
                                TextStyle bodyMedium6 = materialTheme.getTypography(composerStartRestartGroup, i10).getBodyMedium();
                                TextKt.m2432Text4IGK_g(str, PaddingKt.m672paddingqDBjuR0$default(companion6, 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f7), 7, null), jColor6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, bodyMedium6.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium6.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodyMedium6.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium6.spanStyle.getFontWeight() : companion3.getSemiBold(), (16645977 & 8) != 0 ? bodyMedium6.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium6.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium6.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium6.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium6.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium6.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium6.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium6.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium6.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium6.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium6.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium6.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium6.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium6.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium6.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium6.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium6.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium6.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium6.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium6.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium6.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 432, 0, 65016);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1551985192);
                            zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance) {
                                objRememberedValue2 = new C2382a6(context, coroutineScope, mutableState5, mutableState9, mutableState10, mutableState, mutableState14, mutableState13, mutableState12, mutableState6);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new C2382a6(context, coroutineScope, mutableState5, mutableState9, mutableState10, mutableState, mutableState14, mutableState13, mutableState12, mutableState6);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            q.a("Save Organized PDF", (a) objRememberedValue2, SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), null, false, false, composerStartRestartGroup, 390, 56);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.startReplaceGroup(442168952);
                    if (((Boolean) mutableState10.getValue()).booleanValue()) {
                        DialogProperties dialogProperties3 = new DialogProperties(false, false, false, 4, (AbstractC2168g) null);
                        Modifier modifierFillMaxWidth3 = SizeKt.fillMaxWidth(companion6, 0.85f);
                        composerStartRestartGroup.startReplaceGroup(442166902);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                            objRememberedValue4 = new f(4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        n.a((a) objRememberedValue4, modifierFillMaxWidth3, 0L, dialogProperties3, ComposableLambdaKt.rememberComposableLambda(1529991554, true, new C2401b9(state4, state2, mutableState, mutableState12), composerStartRestartGroup, 54), composerStartRestartGroup, 27702, 4);
                    }
                    if (p035i0.a.z(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    arrangement2 = arrangement;
                }
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG16);
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier20, companion8.getSetModifier());
                RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                f8 = 1;
                arrangement3 = arrangement2;
                state2 = state;
                IconButtonKt.IconButton(onBack, BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(40)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f8), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape()), false, null, null, C1.f13829a, composerStartRestartGroup, (i12 & 14) | 196608, 28);
                composerStartRestartGroup = composerStartRestartGroup;
                androidx.compose.foundation.text.modifiers.a.q(f6, companion6, composerStartRestartGroup, 6);
                materialTheme = MaterialTheme.INSTANCE;
                i10 = MaterialTheme.$stable;
                TextStyle titleLarge4 = materialTheme.getTypography(composerStartRestartGroup, i10).getTitleLarge();
                companion3 = FontWeight.Companion;
                TextStyle textStyleM5917copyp1EtxEg4 = titleLarge4.m5917copyp1EtxEg((16645977 & 1) != 0 ? titleLarge4.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? titleLarge4.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(22), (16645977 & 4) != 0 ? titleLarge4.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? titleLarge4.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? titleLarge4.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? titleLarge4.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? titleLarge4.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? titleLarge4.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? titleLarge4.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? titleLarge4.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? titleLarge4.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? titleLarge4.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? titleLarge4.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? titleLarge4.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? titleLarge4.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? titleLarge4.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? titleLarge4.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? titleLarge4.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? titleLarge4.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? titleLarge4.platformStyle : null, (16645977 & 1048576) != 0 ? titleLarge4.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? titleLarge4.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? titleLarge4.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? titleLarge4.paragraphStyle.getTextMotion() : null);
                j6 = p107y3.a.f15990o;
                TextKt.m2432Text4IGK_g("Organize PDF", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, textStyleM5917copyp1EtxEg4, composerStartRestartGroup, 390, 0, 65530);
                b.n(composerStartRestartGroup, f6, companion6, composerStartRestartGroup, 6);
                if (((File) mutableState13.getValue()) != null) {
                    composerStartRestartGroup.startReplaceGroup(-1255053421);
                    Modifier modifierVerticalScroll$default7 = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy14 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion7.getCenterHorizontally(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap1120 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier1120 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default7);
                    constructor7 = companion8.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor7);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    e eVarG111 = p035i0.a.g(companion8, composerM3407constructorimpl7, measurePolicyColumnMeasurePolicy14, composerM3407constructorimpl7, currentCompositionLocalMap1120);
                    if (composerM3407constructorimpl7.getInserting()) {
                        mutableState2 = mutableState14;
                        if (!o.b(composerM3407constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier1120, companion8.getSetModifier());
                        float f16 = 32;
                        b.m(f16, companion6, composerStartRestartGroup, 6);
                        Modifier modifierClip7 = ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(96)), RoundedCornerShapeKt.getCircleShape());
                        long j16 = p107y3.a.f15984i;
                        Modifier modifierM220borderxT4_qwU7 = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(modifierClip7, Color.m3926copywmQWz5c$default(j16, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f8), Color.m3926copywmQWz5c$default(j16, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy116 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                        currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap11110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier11110 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM220borderxT4_qwU7);
                        constructor8 = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor8);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        e eVarG112 = p035i0.a.g(companion8, composerM3407constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy116, composerM3407constructorimpl8, currentCompositionLocalMap11110);
                        if (composerM3407constructorimpl8.getInserting()) {
                            mutableState3 = mutableState13;
                            if (!o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier11110, companion8.getSetModifier());
                            Modifier modifierBackground$default13 = BackgroundKt.background$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(64)), RoundedCornerShapeKt.getCircleShape()), Brush.Companion.m3878linearGradientmHitzGk$default(companion, v.S(Color.m3917boximpl(j16), Color.m3917boximpl(ColorKt.Color(4281652121L))), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy117 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                            currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap11111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier11111 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default13);
                            constructor9 = companion8.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor9);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl9 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy117, composerM3407constructorimpl9, currentCompositionLocalMap11111);
                            if (composerM3407constructorimpl9.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier11111, companion8.getSetModifier());
                            IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), "Success", SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(36)), companion2.m3964getWhite0d7_KjU(), composerStartRestartGroup, 3504, 0);
                            b.r(composerStartRestartGroup, f5, companion6, composerStartRestartGroup, 6);
                            TextStyle headlineSmall13 = materialTheme.getTypography(composerStartRestartGroup, i10).getHeadlineSmall();
                            TextKt.m2432Text4IGK_g("PDF Saved Successfully!", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, headlineSmall13.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineSmall13.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? headlineSmall13.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineSmall13.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? headlineSmall13.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineSmall13.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineSmall13.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineSmall13.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineSmall13.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineSmall13.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineSmall13.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineSmall13.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineSmall13.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineSmall13.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineSmall13.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineSmall13.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineSmall13.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineSmall13.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineSmall13.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineSmall13.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineSmall13.platformStyle : null, (16645977 & 1048576) != 0 ? headlineSmall13.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineSmall13.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineSmall13.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineSmall13.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 390, 0, 65018);
                            b.m(28, companion6, composerStartRestartGroup, 6);
                            mutableState4 = mutableState3;
                            p097w3.j.a(PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(20), 7, null), 0L, Color.m3926copywmQWz5c$default(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-446322778, true, new S8(context, mutableState4, mutableState9), composerStartRestartGroup, 54), composerStartRestartGroup, 196998, 26);
                            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f16)), composerStartRestartGroup, 6);
                            composerStartRestartGroup.startReplaceGroup(1551057536);
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                                objRememberedValue5 = new C2527j7(mutableState5, mutableState9, mutableState4, mutableState2, 3);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            ButtonKt.TextButton((a) objRememberedValue5, null, false, null, null, null, null, null, null, C1.f13832d, composerStartRestartGroup, 805306374, 510);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceGroup();
                            state4 = stateAnimateFloat;
                        } else {
                            mutableState3 = mutableState13;
                        }
                        p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG112);
                        Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier11110, companion8.getSetModifier());
                        Modifier modifierBackground$default14 = BackgroundKt.background$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(64)), RoundedCornerShapeKt.getCircleShape()), Brush.Companion.m3878linearGradientmHitzGk$default(companion, v.S(Color.m3917boximpl(j16), Color.m3917boximpl(ColorKt.Color(4281652121L))), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy118 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                        currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap11112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier11112 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default14);
                        constructor9 = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor9);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl9 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy118, composerM3407constructorimpl9, currentCompositionLocalMap11112);
                        if (composerM3407constructorimpl9.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier11112, companion8.getSetModifier());
                        IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), "Success", SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(36)), companion2.m3964getWhite0d7_KjU(), composerStartRestartGroup, 3504, 0);
                        b.r(composerStartRestartGroup, f5, companion6, composerStartRestartGroup, 6);
                        TextStyle headlineSmall14 = materialTheme.getTypography(composerStartRestartGroup, i10).getHeadlineSmall();
                        TextKt.m2432Text4IGK_g("PDF Saved Successfully!", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, headlineSmall14.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineSmall14.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? headlineSmall14.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineSmall14.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? headlineSmall14.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineSmall14.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineSmall14.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineSmall14.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineSmall14.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineSmall14.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineSmall14.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineSmall14.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineSmall14.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineSmall14.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineSmall14.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineSmall14.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineSmall14.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineSmall14.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineSmall14.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineSmall14.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineSmall14.platformStyle : null, (16645977 & 1048576) != 0 ? headlineSmall14.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineSmall14.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineSmall14.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineSmall14.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 390, 0, 65018);
                        b.m(28, companion6, composerStartRestartGroup, 6);
                        mutableState4 = mutableState3;
                        p097w3.j.a(PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(20), 7, null), 0L, Color.m3926copywmQWz5c$default(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-446322778, true, new S8(context, mutableState4, mutableState9), composerStartRestartGroup, 54), composerStartRestartGroup, 196998, 26);
                        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f16)), composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceGroup(1551057536);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                            objRememberedValue5 = new C2527j7(mutableState5, mutableState9, mutableState4, mutableState2, 3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        ButtonKt.TextButton((a) objRememberedValue5, null, false, null, null, null, null, null, null, C1.f13832d, composerStartRestartGroup, 805306374, 510);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceGroup();
                        state4 = stateAnimateFloat;
                    } else {
                        mutableState2 = mutableState14;
                    }
                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG111);
                    Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier1120, companion8.getSetModifier());
                    float f17 = 32;
                    b.m(f17, companion6, composerStartRestartGroup, 6);
                    Modifier modifierClip8 = ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(96)), RoundedCornerShapeKt.getCircleShape());
                    long j17 = p107y3.a.f15984i;
                    Modifier modifierM220borderxT4_qwU8 = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(modifierClip8, Color.m3926copywmQWz5c$default(j17, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f8), Color.m3926copywmQWz5c$default(j17, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy119 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                    currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier11113 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM220borderxT4_qwU8);
                    constructor8 = companion8.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor8);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    e eVarG113 = p035i0.a.g(companion8, composerM3407constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy119, composerM3407constructorimpl8, currentCompositionLocalMap11113);
                    if (composerM3407constructorimpl8.getInserting()) {
                        mutableState3 = mutableState13;
                        if (!o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier11113, companion8.getSetModifier());
                        Modifier modifierBackground$default15 = BackgroundKt.background$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(64)), RoundedCornerShapeKt.getCircleShape()), Brush.Companion.m3878linearGradientmHitzGk$default(companion, v.S(Color.m3917boximpl(j17), Color.m3917boximpl(ColorKt.Color(4281652121L))), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy1110 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                        currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap11114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier11114 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default15);
                        constructor9 = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor9);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl9 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy1110, composerM3407constructorimpl9, currentCompositionLocalMap11114);
                        if (composerM3407constructorimpl9.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier11114, companion8.getSetModifier());
                        IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), "Success", SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(36)), companion2.m3964getWhite0d7_KjU(), composerStartRestartGroup, 3504, 0);
                        b.r(composerStartRestartGroup, f5, companion6, composerStartRestartGroup, 6);
                        TextStyle headlineSmall15 = materialTheme.getTypography(composerStartRestartGroup, i10).getHeadlineSmall();
                        TextKt.m2432Text4IGK_g("PDF Saved Successfully!", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, headlineSmall15.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineSmall15.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? headlineSmall15.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineSmall15.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? headlineSmall15.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineSmall15.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineSmall15.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineSmall15.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineSmall15.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineSmall15.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineSmall15.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineSmall15.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineSmall15.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineSmall15.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineSmall15.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineSmall15.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineSmall15.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineSmall15.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineSmall15.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineSmall15.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineSmall15.platformStyle : null, (16645977 & 1048576) != 0 ? headlineSmall15.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineSmall15.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineSmall15.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineSmall15.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 390, 0, 65018);
                        b.m(28, companion6, composerStartRestartGroup, 6);
                        mutableState4 = mutableState3;
                        p097w3.j.a(PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(20), 7, null), 0L, Color.m3926copywmQWz5c$default(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-446322778, true, new S8(context, mutableState4, mutableState9), composerStartRestartGroup, 54), composerStartRestartGroup, 196998, 26);
                        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f17)), composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceGroup(1551057536);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                            objRememberedValue5 = new C2527j7(mutableState5, mutableState9, mutableState4, mutableState2, 3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        ButtonKt.TextButton((a) objRememberedValue5, null, false, null, null, null, null, null, null, C1.f13832d, composerStartRestartGroup, 805306374, 510);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceGroup();
                        state4 = stateAnimateFloat;
                    } else {
                        mutableState3 = mutableState13;
                    }
                    p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG113);
                    Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier11113, companion8.getSetModifier());
                    Modifier modifierBackground$default16 = BackgroundKt.background$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(64)), RoundedCornerShapeKt.getCircleShape()), Brush.Companion.m3878linearGradientmHitzGk$default(companion, v.S(Color.m3917boximpl(j17), Color.m3917boximpl(ColorKt.Color(4281652121L))), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy1111 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                    currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier11115 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default16);
                    constructor9 = companion8.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor9);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl9 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy1111, composerM3407constructorimpl9, currentCompositionLocalMap11115);
                    if (composerM3407constructorimpl9.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier11115, companion8.getSetModifier());
                    IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), "Success", SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(36)), companion2.m3964getWhite0d7_KjU(), composerStartRestartGroup, 3504, 0);
                    b.r(composerStartRestartGroup, f5, companion6, composerStartRestartGroup, 6);
                    TextStyle headlineSmall16 = materialTheme.getTypography(composerStartRestartGroup, i10).getHeadlineSmall();
                    TextKt.m2432Text4IGK_g("PDF Saved Successfully!", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, headlineSmall16.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineSmall16.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? headlineSmall16.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineSmall16.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? headlineSmall16.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineSmall16.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineSmall16.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineSmall16.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineSmall16.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineSmall16.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineSmall16.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineSmall16.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineSmall16.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineSmall16.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineSmall16.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineSmall16.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineSmall16.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineSmall16.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineSmall16.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineSmall16.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineSmall16.platformStyle : null, (16645977 & 1048576) != 0 ? headlineSmall16.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineSmall16.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineSmall16.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineSmall16.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 390, 0, 65018);
                    b.m(28, companion6, composerStartRestartGroup, 6);
                    mutableState4 = mutableState3;
                    p097w3.j.a(PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(20), 7, null), 0L, Color.m3926copywmQWz5c$default(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-446322778, true, new S8(context, mutableState4, mutableState9), composerStartRestartGroup, 54), composerStartRestartGroup, 196998, 26);
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f17)), composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceGroup(1551057536);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                        objRememberedValue5 = new C2527j7(mutableState5, mutableState9, mutableState4, mutableState2, 3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ButtonKt.TextButton((a) objRememberedValue5, null, false, null, null, null, null, null, null, C1.f13832d, composerStartRestartGroup, 805306374, 510);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                    state4 = stateAnimateFloat;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1242473187);
                    if (((Uri) mutableState5.getValue()) == null) {
                        composerStartRestartGroup.startReplaceGroup(-1242989399);
                        Modifier modifierVerticalScroll$default8 = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy15 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion7.getCenterHorizontally(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap11116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier11116 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default8);
                        constructor5 = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor5);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl5 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG2 = p035i0.a.g(companion8, composerM3407constructorimpl5, measurePolicyColumnMeasurePolicy15, composerM3407constructorimpl5, currentCompositionLocalMap11116);
                        if (composerM3407constructorimpl5.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier11116, companion8.getSetModifier());
                        Modifier modifierM699height3ABfNKs4 = SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), Dp.m6403constructorimpl(280));
                        long jM3926copywmQWz5c$default4 = Color.m3926copywmQWz5c$default(j5, stateAnimateFloat2.getValue().floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                        composerStartRestartGroup.startReplaceGroup(1551090884);
                        zChangedInstance2 = composerStartRestartGroup.changedInstance(lVarV);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2) {
                            objRememberedValue3 = new P5(lVarV, 14);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new P5(lVarV, 14);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        p097w3.j.a(modifierM699height3ABfNKs4, 0L, jM3926copywmQWz5c$default4, 0.0f, (a) objRememberedValue3, ComposableLambdaKt.rememberComposableLambda(201211522, true, new T8(lVarV, stateAnimateFloat2, stateAnimateFloat), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 10);
                        b.m(f5, companion6, composerStartRestartGroup, 6);
                        TextStyle titleMedium4 = materialTheme.getTypography(composerStartRestartGroup, i10).getTitleMedium();
                        TextKt.m2432Text4IGK_g("How it works", PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(12), 7, null), j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, titleMedium4.m5917copyp1EtxEg((16645977 & 1) != 0 ? titleMedium4.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? titleMedium4.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? titleMedium4.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? titleMedium4.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? titleMedium4.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? titleMedium4.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? titleMedium4.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? titleMedium4.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? titleMedium4.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? titleMedium4.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? titleMedium4.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? titleMedium4.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? titleMedium4.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? titleMedium4.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? titleMedium4.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? titleMedium4.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? titleMedium4.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? titleMedium4.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? titleMedium4.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? titleMedium4.platformStyle : null, (16645977 & 1048576) != 0 ? titleMedium4.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? titleMedium4.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? titleMedium4.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? titleMedium4.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 438, 0, 65528);
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_19 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(10));
                        Modifier modifierFillMaxWidth$default7 = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy16 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_19, companion7.getStart(), composerStartRestartGroup, 6);
                        currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap11117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier11117 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default7);
                        constructor6 = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor6);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG3 = p035i0.a.g(companion8, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy16, composerM3407constructorimpl6, currentCompositionLocalMap11117);
                        if (composerM3407constructorimpl6.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier11117, companion8.getSetModifier());
                        Icons.Outlined outlined4 = Icons.Outlined.INSTANCE;
                        b("01", DescriptionKt.getDescription(outlined4), "Import PDF Document", "Choose the PDF file you want to organize from your device storage.", composerStartRestartGroup, 3462);
                        b("02", GridViewKt.getGridView(outlined4), "Reorder & Rotate Pages", "Drag pages or use Move Up/Down, Rotate 90°, Duplicate or Delete options on each page.", composerStartRestartGroup, 3462);
                        b("03", SaveKt.getSave(outlined4), "Save New Document", "Confirm changes and click 'Save PDF' to generate the optimized, updated file.", composerStartRestartGroup, 3462);
                        composerStartRestartGroup.endNode();
                        b.m(20, companion6, composerStartRestartGroup, 6);
                        Modifier modifierFillMaxWidth$default8 = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
                        long j18 = p107y3.a.f15984i;
                        p097w3.j.a(modifierFillMaxWidth$default8, Color.m3926copywmQWz5c$default(j18, 0.03f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(j18, 0.15f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, C1.e, composerStartRestartGroup, 197046, 24);
                        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f6)), composerStartRestartGroup, 6);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceGroup();
                        state4 = stateAnimateFloat;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1233398898);
                        Modifier modifierFillMaxSize$default12 = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy17 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion7.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap11118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier11118 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default12);
                        constructor3 = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor3);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl3 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        e eVarG114 = p035i0.a.g(companion8, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy17, composerM3407constructorimpl3, currentCompositionLocalMap11118);
                        if (composerM3407constructorimpl3.getInserting()) {
                            state3 = stateAnimateFloat;
                            if (!o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier11118, companion8.getSetModifier());
                            if (i13 > 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z4, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-486966906, true, new V8(i13, mutableState9, mutableState13, mutableState14), composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
                            if (i13 == 0) {
                                f9 = 0.0f;
                                i11 = 3;
                                z5 = true;
                            } else {
                                f9 = 0.0f;
                                i11 = 3;
                                z5 = false;
                            }
                            AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z5, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, f9, i11, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-1332655761, true, new X8(mutableState6, mutableState8, mutableState7, mutableState5), composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
                            state4 = state3;
                            Modifier modifierWeight$default7 = ColumnScope.weight$default(columnScopeInstance, companion6, 1.0f, false, 2, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy1112 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
                            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap11119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier11119 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default7);
                            constructor4 = companion8.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor4);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl4 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG = p035i0.a.g(companion8, composerM3407constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy1112, composerM3407constructorimpl4, currentCompositionLocalMap11119);
                            if (composerM3407constructorimpl4.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier11119, companion8.getSetModifier());
                            GridCells.Fixed fixed7 = new GridCells.Fixed(3);
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_110 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(f7));
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_111 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(12));
                            Modifier modifierFillMaxSize$default13 = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null);
                            composerStartRestartGroup.startReplaceGroup(1425236413);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion4 = Composer.Companion;
                            if (objRememberedValue == companion4.getEmpty()) {
                                objRememberedValue = new F(8, mutableState9, mutableState14, mutableState13);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            LazyGridDslKt.LazyVerticalGrid(fixed7, modifierFillMaxSize$default13, null, null, false, horizontalOrVerticalM548spacedBy0680j_111, horizontalOrVerticalM548spacedBy0680j_110, null, false, (c) objRememberedValue, composerStartRestartGroup, 807075888, 412);
                            b.n(composerStartRestartGroup, f6, companion6, composerStartRestartGroup, 6);
                            str = (String) mutableState14.getValue();
                            composerStartRestartGroup.startReplaceGroup(1551965696);
                            if (str != null) {
                                long jColor7 = ColorKt.Color(4293870660L);
                                TextStyle bodyMedium7 = materialTheme.getTypography(composerStartRestartGroup, i10).getBodyMedium();
                                TextKt.m2432Text4IGK_g(str, PaddingKt.m672paddingqDBjuR0$default(companion6, 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f7), 7, null), jColor7, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, bodyMedium7.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium7.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodyMedium7.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium7.spanStyle.getFontWeight() : companion3.getSemiBold(), (16645977 & 8) != 0 ? bodyMedium7.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium7.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium7.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium7.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium7.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium7.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium7.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium7.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium7.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium7.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium7.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium7.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium7.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium7.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium7.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium7.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium7.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium7.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium7.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium7.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium7.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 432, 0, 65016);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1551985192);
                            zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance) {
                                objRememberedValue2 = new C2382a6(context, coroutineScope, mutableState5, mutableState9, mutableState10, mutableState, mutableState14, mutableState13, mutableState12, mutableState6);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new C2382a6(context, coroutineScope, mutableState5, mutableState9, mutableState10, mutableState, mutableState14, mutableState13, mutableState12, mutableState6);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            q.a("Save Organized PDF", (a) objRememberedValue2, SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), null, false, false, composerStartRestartGroup, 390, 56);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            state3 = stateAnimateFloat;
                        }
                        p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG114);
                        Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier11118, companion8.getSetModifier());
                        if (i13 > 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z4, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-486966906, true, new V8(i13, mutableState9, mutableState13, mutableState14), composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
                        if (i13 == 0) {
                            f9 = 0.0f;
                            i11 = 3;
                            z5 = true;
                        } else {
                            f9 = 0.0f;
                            i11 = 3;
                            z5 = false;
                        }
                        AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z5, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, f9, i11, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-1332655761, true, new X8(mutableState6, mutableState8, mutableState7, mutableState5), composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
                        state4 = state3;
                        Modifier modifierWeight$default8 = ColumnScope.weight$default(columnScopeInstance, companion6, 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy1113 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
                        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap111110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier111110 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default8);
                        constructor4 = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor4);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl4 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG = p035i0.a.g(companion8, composerM3407constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy1113, composerM3407constructorimpl4, currentCompositionLocalMap111110);
                        if (composerM3407constructorimpl4.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier111110, companion8.getSetModifier());
                        GridCells.Fixed fixed8 = new GridCells.Fixed(3);
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_112 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(f7));
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_113 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(12));
                        Modifier modifierFillMaxSize$default14 = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceGroup(1425236413);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion4 = Composer.Companion;
                        if (objRememberedValue == companion4.getEmpty()) {
                            objRememberedValue = new F(8, mutableState9, mutableState14, mutableState13);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        LazyGridDslKt.LazyVerticalGrid(fixed8, modifierFillMaxSize$default14, null, null, false, horizontalOrVerticalM548spacedBy0680j_113, horizontalOrVerticalM548spacedBy0680j_112, null, false, (c) objRememberedValue, composerStartRestartGroup, 807075888, 412);
                        b.n(composerStartRestartGroup, f6, companion6, composerStartRestartGroup, 6);
                        str = (String) mutableState14.getValue();
                        composerStartRestartGroup.startReplaceGroup(1551965696);
                        if (str != null) {
                            long jColor8 = ColorKt.Color(4293870660L);
                            TextStyle bodyMedium8 = materialTheme.getTypography(composerStartRestartGroup, i10).getBodyMedium();
                            TextKt.m2432Text4IGK_g(str, PaddingKt.m672paddingqDBjuR0$default(companion6, 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f7), 7, null), jColor8, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, bodyMedium8.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium8.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodyMedium8.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium8.spanStyle.getFontWeight() : companion3.getSemiBold(), (16645977 & 8) != 0 ? bodyMedium8.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium8.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium8.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium8.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium8.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium8.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium8.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium8.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium8.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium8.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium8.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium8.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium8.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium8.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium8.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium8.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium8.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium8.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium8.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium8.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium8.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 432, 0, 65016);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1551985192);
                        zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance) {
                            objRememberedValue2 = new C2382a6(context, coroutineScope, mutableState5, mutableState9, mutableState10, mutableState, mutableState14, mutableState13, mutableState12, mutableState6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new C2382a6(context, coroutineScope, mutableState5, mutableState9, mutableState10, mutableState, mutableState14, mutableState13, mutableState12, mutableState6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        q.a("Save Organized PDF", (a) objRememberedValue2, SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), null, false, false, composerStartRestartGroup, 390, 56);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.startReplaceGroup(442168952);
                if (((Boolean) mutableState10.getValue()).booleanValue()) {
                    DialogProperties dialogProperties4 = new DialogProperties(false, false, false, 4, (AbstractC2168g) null);
                    Modifier modifierFillMaxWidth4 = SizeKt.fillMaxWidth(companion6, 0.85f);
                    composerStartRestartGroup.startReplaceGroup(442166902);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                        objRememberedValue4 = new f(4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    n.a((a) objRememberedValue4, modifierFillMaxWidth4, 0L, dialogProperties4, ComposableLambdaKt.rememberComposableLambda(1529991554, true, new C2401b9(state4, state2, mutableState, mutableState12), composerStartRestartGroup, 54), composerStartRestartGroup, 27702, 4);
                }
                if (p035i0.a.z(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
            }
            p035i0.a.t(currentCompositeKeyHash10, composerM3407constructorimpl10, currentCompositeKeyHash10, eVarG5);
            Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier, companion8.getSetModifier());
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxSize$default15 = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null);
            companion = Brush.Companion;
            j5 = p107y3.a.f15978a;
            Color colorM3917boximpl2 = Color.m3917boximpl(Color.m3926copywmQWz5c$default(j5, 0.08f, 0.0f, 0.0f, 0.0f, 14, null));
            companion2 = Color.Companion;
            BoxKt.Box(BackgroundKt.background$default(modifierFillMaxSize$default15, Brush.Companion.m3880radialGradientP_VxKs$default(companion, v.S(colorM3917boximpl2, Color.m3917boximpl(companion2.m3962getTransparent0d7_KjU())), 0L, Dp.m6403constructorimpl(400), 0, 10, (Object) null), null, 0.0f, 6, null), composerStartRestartGroup, 0);
            f5 = 24;
            f6 = 16;
            Modifier modifierM672paddingqDBjuR0$default2 = PaddingKt.m672paddingqDBjuR0$default(PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), Dp.m6403constructorimpl(f5), 0.0f, 2, null), 0.0f, Dp.m6403constructorimpl(f6), 0.0f, Dp.m6403constructorimpl(f5), 5, null);
            arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy18 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion7.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap21 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier21 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM672paddingqDBjuR0$default2);
            constructor = companion8.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM3407constructorimpl = Updater.m3407constructorimpl(composerStartRestartGroup);
            e eVarG20 = p035i0.a.g(companion8, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy18, composerM3407constructorimpl, currentCompositionLocalMap21);
            if (composerM3407constructorimpl.getInserting()) {
                mutableState = mutableState11;
                if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier21, companion8.getSetModifier());
                columnScopeInstance = ColumnScopeInstance.INSTANCE;
                f7 = 8;
                Modifier modifierM670paddingVpY3zN4$default3 = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, Dp.m6403constructorimpl(f7), 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion7.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM670paddingVpY3zN4$default3);
                constructor2 = companion8.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3407constructorimpl2 = Updater.m3407constructorimpl(composerStartRestartGroup);
                e eVarG115 = p035i0.a.g(companion8, composerM3407constructorimpl2, measurePolicyRowMeasurePolicy3, composerM3407constructorimpl2, currentCompositionLocalMap22);
                if (composerM3407constructorimpl2.getInserting()) {
                    arrangement2 = arrangement;
                    if (!o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier22, companion8.getSetModifier());
                    RowScopeInstance rowScopeInstance5 = RowScopeInstance.INSTANCE;
                    f8 = 1;
                    arrangement3 = arrangement2;
                    state2 = state;
                    IconButtonKt.IconButton(onBack, BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(40)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f8), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape()), false, null, null, C1.f13829a, composerStartRestartGroup, (i12 & 14) | 196608, 28);
                    composerStartRestartGroup = composerStartRestartGroup;
                    androidx.compose.foundation.text.modifiers.a.q(f6, companion6, composerStartRestartGroup, 6);
                    materialTheme = MaterialTheme.INSTANCE;
                    i10 = MaterialTheme.$stable;
                    TextStyle titleLarge5 = materialTheme.getTypography(composerStartRestartGroup, i10).getTitleLarge();
                    companion3 = FontWeight.Companion;
                    TextStyle textStyleM5917copyp1EtxEg5 = titleLarge5.m5917copyp1EtxEg((16645977 & 1) != 0 ? titleLarge5.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? titleLarge5.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(22), (16645977 & 4) != 0 ? titleLarge5.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? titleLarge5.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? titleLarge5.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? titleLarge5.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? titleLarge5.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? titleLarge5.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? titleLarge5.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? titleLarge5.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? titleLarge5.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? titleLarge5.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? titleLarge5.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? titleLarge5.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? titleLarge5.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? titleLarge5.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? titleLarge5.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? titleLarge5.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? titleLarge5.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? titleLarge5.platformStyle : null, (16645977 & 1048576) != 0 ? titleLarge5.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? titleLarge5.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? titleLarge5.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? titleLarge5.paragraphStyle.getTextMotion() : null);
                    j6 = p107y3.a.f15990o;
                    TextKt.m2432Text4IGK_g("Organize PDF", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, textStyleM5917copyp1EtxEg5, composerStartRestartGroup, 390, 0, 65530);
                    b.n(composerStartRestartGroup, f6, companion6, composerStartRestartGroup, 6);
                    if (((File) mutableState13.getValue()) != null) {
                        composerStartRestartGroup.startReplaceGroup(-1255053421);
                        Modifier modifierVerticalScroll$default9 = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy19 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion7.getCenterHorizontally(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap1121 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier1121 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default9);
                        constructor7 = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor7);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        e eVarG116 = p035i0.a.g(companion8, composerM3407constructorimpl7, measurePolicyColumnMeasurePolicy19, composerM3407constructorimpl7, currentCompositionLocalMap1121);
                        if (composerM3407constructorimpl7.getInserting()) {
                            mutableState2 = mutableState14;
                            if (!o.b(composerM3407constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier1121, companion8.getSetModifier());
                            float f18 = 32;
                            b.m(f18, companion6, composerStartRestartGroup, 6);
                            Modifier modifierClip9 = ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(96)), RoundedCornerShapeKt.getCircleShape());
                            long j19 = p107y3.a.f15984i;
                            Modifier modifierM220borderxT4_qwU9 = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(modifierClip9, Color.m3926copywmQWz5c$default(j19, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f8), Color.m3926copywmQWz5c$default(j19, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy1114 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                            currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap111111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier111111 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM220borderxT4_qwU9);
                            constructor8 = companion8.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor8);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            e eVarG117 = p035i0.a.g(companion8, composerM3407constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy1114, composerM3407constructorimpl8, currentCompositionLocalMap111111);
                            if (composerM3407constructorimpl8.getInserting()) {
                                mutableState3 = mutableState13;
                                if (!o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier111111, companion8.getSetModifier());
                                Modifier modifierBackground$default17 = BackgroundKt.background$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(64)), RoundedCornerShapeKt.getCircleShape()), Brush.Companion.m3878linearGradientmHitzGk$default(companion, v.S(Color.m3917boximpl(j19), Color.m3917boximpl(ColorKt.Color(4281652121L))), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy1115 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                                currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap111112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier111112 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default17);
                                constructor9 = companion8.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor9);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                composerM3407constructorimpl9 = Updater.m3407constructorimpl(composerStartRestartGroup);
                                eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy1115, composerM3407constructorimpl9, currentCompositionLocalMap111112);
                                if (composerM3407constructorimpl9.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier111112, companion8.getSetModifier());
                                IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), "Success", SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(36)), companion2.m3964getWhite0d7_KjU(), composerStartRestartGroup, 3504, 0);
                                b.r(composerStartRestartGroup, f5, companion6, composerStartRestartGroup, 6);
                                TextStyle headlineSmall17 = materialTheme.getTypography(composerStartRestartGroup, i10).getHeadlineSmall();
                                TextKt.m2432Text4IGK_g("PDF Saved Successfully!", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, headlineSmall17.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineSmall17.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? headlineSmall17.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineSmall17.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? headlineSmall17.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineSmall17.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineSmall17.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineSmall17.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineSmall17.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineSmall17.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineSmall17.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineSmall17.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineSmall17.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineSmall17.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineSmall17.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineSmall17.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineSmall17.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineSmall17.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineSmall17.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineSmall17.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineSmall17.platformStyle : null, (16645977 & 1048576) != 0 ? headlineSmall17.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineSmall17.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineSmall17.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineSmall17.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 390, 0, 65018);
                                b.m(28, companion6, composerStartRestartGroup, 6);
                                mutableState4 = mutableState3;
                                p097w3.j.a(PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(20), 7, null), 0L, Color.m3926copywmQWz5c$default(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-446322778, true, new S8(context, mutableState4, mutableState9), composerStartRestartGroup, 54), composerStartRestartGroup, 196998, 26);
                                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f18)), composerStartRestartGroup, 6);
                                composerStartRestartGroup.startReplaceGroup(1551057536);
                                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                                    objRememberedValue5 = new C2527j7(mutableState5, mutableState9, mutableState4, mutableState2, 3);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                ButtonKt.TextButton((a) objRememberedValue5, null, false, null, null, null, null, null, null, C1.f13832d, composerStartRestartGroup, 805306374, 510);
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceGroup();
                                state4 = stateAnimateFloat;
                            } else {
                                mutableState3 = mutableState13;
                            }
                            p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG117);
                            Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier111111, companion8.getSetModifier());
                            Modifier modifierBackground$default18 = BackgroundKt.background$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(64)), RoundedCornerShapeKt.getCircleShape()), Brush.Companion.m3878linearGradientmHitzGk$default(companion, v.S(Color.m3917boximpl(j19), Color.m3917boximpl(ColorKt.Color(4281652121L))), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy1116 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                            currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap111113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier111113 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default18);
                            constructor9 = companion8.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor9);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl9 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy1116, composerM3407constructorimpl9, currentCompositionLocalMap111113);
                            if (composerM3407constructorimpl9.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier111113, companion8.getSetModifier());
                            IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), "Success", SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(36)), companion2.m3964getWhite0d7_KjU(), composerStartRestartGroup, 3504, 0);
                            b.r(composerStartRestartGroup, f5, companion6, composerStartRestartGroup, 6);
                            TextStyle headlineSmall18 = materialTheme.getTypography(composerStartRestartGroup, i10).getHeadlineSmall();
                            TextKt.m2432Text4IGK_g("PDF Saved Successfully!", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, headlineSmall18.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineSmall18.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? headlineSmall18.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineSmall18.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? headlineSmall18.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineSmall18.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineSmall18.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineSmall18.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineSmall18.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineSmall18.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineSmall18.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineSmall18.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineSmall18.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineSmall18.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineSmall18.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineSmall18.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineSmall18.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineSmall18.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineSmall18.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineSmall18.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineSmall18.platformStyle : null, (16645977 & 1048576) != 0 ? headlineSmall18.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineSmall18.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineSmall18.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineSmall18.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 390, 0, 65018);
                            b.m(28, companion6, composerStartRestartGroup, 6);
                            mutableState4 = mutableState3;
                            p097w3.j.a(PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(20), 7, null), 0L, Color.m3926copywmQWz5c$default(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-446322778, true, new S8(context, mutableState4, mutableState9), composerStartRestartGroup, 54), composerStartRestartGroup, 196998, 26);
                            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f18)), composerStartRestartGroup, 6);
                            composerStartRestartGroup.startReplaceGroup(1551057536);
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                                objRememberedValue5 = new C2527j7(mutableState5, mutableState9, mutableState4, mutableState2, 3);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            ButtonKt.TextButton((a) objRememberedValue5, null, false, null, null, null, null, null, null, C1.f13832d, composerStartRestartGroup, 805306374, 510);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceGroup();
                            state4 = stateAnimateFloat;
                        } else {
                            mutableState2 = mutableState14;
                        }
                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG116);
                        Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier1121, companion8.getSetModifier());
                        float f19 = 32;
                        b.m(f19, companion6, composerStartRestartGroup, 6);
                        Modifier modifierClip10 = ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(96)), RoundedCornerShapeKt.getCircleShape());
                        long j110 = p107y3.a.f15984i;
                        Modifier modifierM220borderxT4_qwU10 = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(modifierClip10, Color.m3926copywmQWz5c$default(j110, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f8), Color.m3926copywmQWz5c$default(j110, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy1117 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                        currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap111114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier111114 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM220borderxT4_qwU10);
                        constructor8 = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor8);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        e eVarG118 = p035i0.a.g(companion8, composerM3407constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy1117, composerM3407constructorimpl8, currentCompositionLocalMap111114);
                        if (composerM3407constructorimpl8.getInserting()) {
                            mutableState3 = mutableState13;
                            if (!o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier111114, companion8.getSetModifier());
                            Modifier modifierBackground$default19 = BackgroundKt.background$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(64)), RoundedCornerShapeKt.getCircleShape()), Brush.Companion.m3878linearGradientmHitzGk$default(companion, v.S(Color.m3917boximpl(j110), Color.m3917boximpl(ColorKt.Color(4281652121L))), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy1118 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                            currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap111115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier111115 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default19);
                            constructor9 = companion8.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor9);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl9 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy1118, composerM3407constructorimpl9, currentCompositionLocalMap111115);
                            if (composerM3407constructorimpl9.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier111115, companion8.getSetModifier());
                            IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), "Success", SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(36)), companion2.m3964getWhite0d7_KjU(), composerStartRestartGroup, 3504, 0);
                            b.r(composerStartRestartGroup, f5, companion6, composerStartRestartGroup, 6);
                            TextStyle headlineSmall19 = materialTheme.getTypography(composerStartRestartGroup, i10).getHeadlineSmall();
                            TextKt.m2432Text4IGK_g("PDF Saved Successfully!", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, headlineSmall19.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineSmall19.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? headlineSmall19.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineSmall19.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? headlineSmall19.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineSmall19.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineSmall19.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineSmall19.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineSmall19.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineSmall19.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineSmall19.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineSmall19.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineSmall19.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineSmall19.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineSmall19.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineSmall19.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineSmall19.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineSmall19.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineSmall19.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineSmall19.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineSmall19.platformStyle : null, (16645977 & 1048576) != 0 ? headlineSmall19.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineSmall19.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineSmall19.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineSmall19.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 390, 0, 65018);
                            b.m(28, companion6, composerStartRestartGroup, 6);
                            mutableState4 = mutableState3;
                            p097w3.j.a(PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(20), 7, null), 0L, Color.m3926copywmQWz5c$default(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-446322778, true, new S8(context, mutableState4, mutableState9), composerStartRestartGroup, 54), composerStartRestartGroup, 196998, 26);
                            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f19)), composerStartRestartGroup, 6);
                            composerStartRestartGroup.startReplaceGroup(1551057536);
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                                objRememberedValue5 = new C2527j7(mutableState5, mutableState9, mutableState4, mutableState2, 3);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            ButtonKt.TextButton((a) objRememberedValue5, null, false, null, null, null, null, null, null, C1.f13832d, composerStartRestartGroup, 805306374, 510);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceGroup();
                            state4 = stateAnimateFloat;
                        } else {
                            mutableState3 = mutableState13;
                        }
                        p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG118);
                        Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier111114, companion8.getSetModifier());
                        Modifier modifierBackground$default110 = BackgroundKt.background$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(64)), RoundedCornerShapeKt.getCircleShape()), Brush.Companion.m3878linearGradientmHitzGk$default(companion, v.S(Color.m3917boximpl(j110), Color.m3917boximpl(ColorKt.Color(4281652121L))), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy1119 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                        currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap111116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier111116 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default110);
                        constructor9 = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor9);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl9 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy1119, composerM3407constructorimpl9, currentCompositionLocalMap111116);
                        if (composerM3407constructorimpl9.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier111116, companion8.getSetModifier());
                        IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), "Success", SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(36)), companion2.m3964getWhite0d7_KjU(), composerStartRestartGroup, 3504, 0);
                        b.r(composerStartRestartGroup, f5, companion6, composerStartRestartGroup, 6);
                        TextStyle headlineSmall110 = materialTheme.getTypography(composerStartRestartGroup, i10).getHeadlineSmall();
                        TextKt.m2432Text4IGK_g("PDF Saved Successfully!", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, headlineSmall110.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineSmall110.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? headlineSmall110.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineSmall110.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? headlineSmall110.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineSmall110.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineSmall110.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineSmall110.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineSmall110.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineSmall110.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineSmall110.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineSmall110.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineSmall110.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineSmall110.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineSmall110.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineSmall110.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineSmall110.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineSmall110.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineSmall110.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineSmall110.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineSmall110.platformStyle : null, (16645977 & 1048576) != 0 ? headlineSmall110.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineSmall110.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineSmall110.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineSmall110.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 390, 0, 65018);
                        b.m(28, companion6, composerStartRestartGroup, 6);
                        mutableState4 = mutableState3;
                        p097w3.j.a(PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(20), 7, null), 0L, Color.m3926copywmQWz5c$default(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-446322778, true, new S8(context, mutableState4, mutableState9), composerStartRestartGroup, 54), composerStartRestartGroup, 196998, 26);
                        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f19)), composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceGroup(1551057536);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                            objRememberedValue5 = new C2527j7(mutableState5, mutableState9, mutableState4, mutableState2, 3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        ButtonKt.TextButton((a) objRememberedValue5, null, false, null, null, null, null, null, null, C1.f13832d, composerStartRestartGroup, 805306374, 510);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceGroup();
                        state4 = stateAnimateFloat;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1242473187);
                        if (((Uri) mutableState5.getValue()) == null) {
                            composerStartRestartGroup.startReplaceGroup(-1242989399);
                            Modifier modifierVerticalScroll$default10 = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy110 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion7.getCenterHorizontally(), composerStartRestartGroup, 48);
                            currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap111117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier111117 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default10);
                            constructor5 = companion8.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor5);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl5 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG2 = p035i0.a.g(companion8, composerM3407constructorimpl5, measurePolicyColumnMeasurePolicy110, composerM3407constructorimpl5, currentCompositionLocalMap111117);
                            if (composerM3407constructorimpl5.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier111117, companion8.getSetModifier());
                            Modifier modifierM699height3ABfNKs5 = SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), Dp.m6403constructorimpl(280));
                            long jM3926copywmQWz5c$default5 = Color.m3926copywmQWz5c$default(j5, stateAnimateFloat2.getValue().floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                            composerStartRestartGroup.startReplaceGroup(1551090884);
                            zChangedInstance2 = composerStartRestartGroup.changedInstance(lVarV);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance2) {
                                objRememberedValue3 = new P5(lVarV, 14);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                objRememberedValue3 = new P5(lVarV, 14);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            p097w3.j.a(modifierM699height3ABfNKs5, 0L, jM3926copywmQWz5c$default5, 0.0f, (a) objRememberedValue3, ComposableLambdaKt.rememberComposableLambda(201211522, true, new T8(lVarV, stateAnimateFloat2, stateAnimateFloat), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 10);
                            b.m(f5, companion6, composerStartRestartGroup, 6);
                            TextStyle titleMedium5 = materialTheme.getTypography(composerStartRestartGroup, i10).getTitleMedium();
                            TextKt.m2432Text4IGK_g("How it works", PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(12), 7, null), j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, titleMedium5.m5917copyp1EtxEg((16645977 & 1) != 0 ? titleMedium5.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? titleMedium5.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? titleMedium5.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? titleMedium5.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? titleMedium5.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? titleMedium5.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? titleMedium5.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? titleMedium5.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? titleMedium5.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? titleMedium5.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? titleMedium5.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? titleMedium5.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? titleMedium5.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? titleMedium5.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? titleMedium5.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? titleMedium5.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? titleMedium5.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? titleMedium5.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? titleMedium5.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? titleMedium5.platformStyle : null, (16645977 & 1048576) != 0 ? titleMedium5.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? titleMedium5.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? titleMedium5.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? titleMedium5.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 438, 0, 65528);
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_114 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(10));
                            Modifier modifierFillMaxWidth$default9 = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy111 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_114, companion7.getStart(), composerStartRestartGroup, 6);
                            currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap111118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier111118 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default9);
                            constructor6 = companion8.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor6);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG3 = p035i0.a.g(companion8, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy111, composerM3407constructorimpl6, currentCompositionLocalMap111118);
                            if (composerM3407constructorimpl6.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier111118, companion8.getSetModifier());
                            Icons.Outlined outlined5 = Icons.Outlined.INSTANCE;
                            b("01", DescriptionKt.getDescription(outlined5), "Import PDF Document", "Choose the PDF file you want to organize from your device storage.", composerStartRestartGroup, 3462);
                            b("02", GridViewKt.getGridView(outlined5), "Reorder & Rotate Pages", "Drag pages or use Move Up/Down, Rotate 90°, Duplicate or Delete options on each page.", composerStartRestartGroup, 3462);
                            b("03", SaveKt.getSave(outlined5), "Save New Document", "Confirm changes and click 'Save PDF' to generate the optimized, updated file.", composerStartRestartGroup, 3462);
                            composerStartRestartGroup.endNode();
                            b.m(20, companion6, composerStartRestartGroup, 6);
                            Modifier modifierFillMaxWidth$default10 = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
                            long j111 = p107y3.a.f15984i;
                            p097w3.j.a(modifierFillMaxWidth$default10, Color.m3926copywmQWz5c$default(j111, 0.03f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(j111, 0.15f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, C1.e, composerStartRestartGroup, 197046, 24);
                            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f6)), composerStartRestartGroup, 6);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceGroup();
                            state4 = stateAnimateFloat;
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-1233398898);
                            Modifier modifierFillMaxSize$default16 = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy112 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion7.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap111119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier111119 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default16);
                            constructor3 = companion8.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor3);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl3 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            e eVarG119 = p035i0.a.g(companion8, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy112, composerM3407constructorimpl3, currentCompositionLocalMap111119);
                            if (composerM3407constructorimpl3.getInserting()) {
                                state3 = stateAnimateFloat;
                                if (!o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier111119, companion8.getSetModifier());
                                if (i13 > 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z4, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-486966906, true, new V8(i13, mutableState9, mutableState13, mutableState14), composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
                                if (i13 == 0) {
                                    f9 = 0.0f;
                                    i11 = 3;
                                    z5 = true;
                                } else {
                                    f9 = 0.0f;
                                    i11 = 3;
                                    z5 = false;
                                }
                                AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z5, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, f9, i11, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-1332655761, true, new X8(mutableState6, mutableState8, mutableState7, mutableState5), composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
                                state4 = state3;
                                Modifier modifierWeight$default9 = ColumnScope.weight$default(columnScopeInstance, companion6, 1.0f, false, 2, null);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy11110 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
                                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap1111110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier1111110 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default9);
                                constructor4 = companion8.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor4);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                composerM3407constructorimpl4 = Updater.m3407constructorimpl(composerStartRestartGroup);
                                eVarG = p035i0.a.g(companion8, composerM3407constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy11110, composerM3407constructorimpl4, currentCompositionLocalMap1111110);
                                if (composerM3407constructorimpl4.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier1111110, companion8.getSetModifier());
                                GridCells.Fixed fixed9 = new GridCells.Fixed(3);
                                Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_115 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(f7));
                                Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_116 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(12));
                                Modifier modifierFillMaxSize$default17 = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null);
                                composerStartRestartGroup.startReplaceGroup(1425236413);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                companion4 = Composer.Companion;
                                if (objRememberedValue == companion4.getEmpty()) {
                                    objRememberedValue = new F(8, mutableState9, mutableState14, mutableState13);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                LazyGridDslKt.LazyVerticalGrid(fixed9, modifierFillMaxSize$default17, null, null, false, horizontalOrVerticalM548spacedBy0680j_116, horizontalOrVerticalM548spacedBy0680j_115, null, false, (c) objRememberedValue, composerStartRestartGroup, 807075888, 412);
                                b.n(composerStartRestartGroup, f6, companion6, composerStartRestartGroup, 6);
                                str = (String) mutableState14.getValue();
                                composerStartRestartGroup.startReplaceGroup(1551965696);
                                if (str != null) {
                                    long jColor9 = ColorKt.Color(4293870660L);
                                    TextStyle bodyMedium9 = materialTheme.getTypography(composerStartRestartGroup, i10).getBodyMedium();
                                    TextKt.m2432Text4IGK_g(str, PaddingKt.m672paddingqDBjuR0$default(companion6, 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f7), 7, null), jColor9, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, bodyMedium9.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium9.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodyMedium9.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium9.spanStyle.getFontWeight() : companion3.getSemiBold(), (16645977 & 8) != 0 ? bodyMedium9.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium9.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium9.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium9.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium9.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium9.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium9.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium9.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium9.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium9.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium9.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium9.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium9.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium9.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium9.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium9.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium9.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium9.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium9.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium9.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium9.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 432, 0, 65016);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(1551985192);
                                zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance) {
                                    objRememberedValue2 = new C2382a6(context, coroutineScope, mutableState5, mutableState9, mutableState10, mutableState, mutableState14, mutableState13, mutableState12, mutableState6);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                } else {
                                    objRememberedValue2 = new C2382a6(context, coroutineScope, mutableState5, mutableState9, mutableState10, mutableState, mutableState14, mutableState13, mutableState12, mutableState6);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                q.a("Save Organized PDF", (a) objRememberedValue2, SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), null, false, false, composerStartRestartGroup, 390, 56);
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                state3 = stateAnimateFloat;
                            }
                            p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG119);
                            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier111119, companion8.getSetModifier());
                            if (i13 > 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z4, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-486966906, true, new V8(i13, mutableState9, mutableState13, mutableState14), composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
                            if (i13 == 0) {
                                f9 = 0.0f;
                                i11 = 3;
                                z5 = true;
                            } else {
                                f9 = 0.0f;
                                i11 = 3;
                                z5 = false;
                            }
                            AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z5, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, f9, i11, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-1332655761, true, new X8(mutableState6, mutableState8, mutableState7, mutableState5), composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
                            state4 = state3;
                            Modifier modifierWeight$default10 = ColumnScope.weight$default(columnScopeInstance, companion6, 1.0f, false, 2, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy11111 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
                            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap1111111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier1111111 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default10);
                            constructor4 = companion8.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor4);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl4 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG = p035i0.a.g(companion8, composerM3407constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy11111, composerM3407constructorimpl4, currentCompositionLocalMap1111111);
                            if (composerM3407constructorimpl4.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier1111111, companion8.getSetModifier());
                            GridCells.Fixed fixed10 = new GridCells.Fixed(3);
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_117 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(f7));
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_118 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(12));
                            Modifier modifierFillMaxSize$default18 = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null);
                            composerStartRestartGroup.startReplaceGroup(1425236413);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion4 = Composer.Companion;
                            if (objRememberedValue == companion4.getEmpty()) {
                                objRememberedValue = new F(8, mutableState9, mutableState14, mutableState13);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            LazyGridDslKt.LazyVerticalGrid(fixed10, modifierFillMaxSize$default18, null, null, false, horizontalOrVerticalM548spacedBy0680j_118, horizontalOrVerticalM548spacedBy0680j_117, null, false, (c) objRememberedValue, composerStartRestartGroup, 807075888, 412);
                            b.n(composerStartRestartGroup, f6, companion6, composerStartRestartGroup, 6);
                            str = (String) mutableState14.getValue();
                            composerStartRestartGroup.startReplaceGroup(1551965696);
                            if (str != null) {
                                long jColor10 = ColorKt.Color(4293870660L);
                                TextStyle bodyMedium10 = materialTheme.getTypography(composerStartRestartGroup, i10).getBodyMedium();
                                TextKt.m2432Text4IGK_g(str, PaddingKt.m672paddingqDBjuR0$default(companion6, 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f7), 7, null), jColor10, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, bodyMedium10.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium10.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodyMedium10.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium10.spanStyle.getFontWeight() : companion3.getSemiBold(), (16645977 & 8) != 0 ? bodyMedium10.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium10.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium10.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium10.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium10.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium10.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium10.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium10.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium10.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium10.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium10.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium10.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium10.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium10.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium10.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium10.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium10.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium10.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium10.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium10.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium10.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 432, 0, 65016);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1551985192);
                            zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance) {
                                objRememberedValue2 = new C2382a6(context, coroutineScope, mutableState5, mutableState9, mutableState10, mutableState, mutableState14, mutableState13, mutableState12, mutableState6);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new C2382a6(context, coroutineScope, mutableState5, mutableState9, mutableState10, mutableState, mutableState14, mutableState13, mutableState12, mutableState6);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            q.a("Save Organized PDF", (a) objRememberedValue2, SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), null, false, false, composerStartRestartGroup, 390, 56);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.startReplaceGroup(442168952);
                    if (((Boolean) mutableState10.getValue()).booleanValue()) {
                        DialogProperties dialogProperties5 = new DialogProperties(false, false, false, 4, (AbstractC2168g) null);
                        Modifier modifierFillMaxWidth5 = SizeKt.fillMaxWidth(companion6, 0.85f);
                        composerStartRestartGroup.startReplaceGroup(442166902);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                            objRememberedValue4 = new f(4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        n.a((a) objRememberedValue4, modifierFillMaxWidth5, 0L, dialogProperties5, ComposableLambdaKt.rememberComposableLambda(1529991554, true, new C2401b9(state4, state2, mutableState, mutableState12), composerStartRestartGroup, 54), composerStartRestartGroup, 27702, 4);
                    }
                    if (p035i0.a.z(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    arrangement2 = arrangement;
                }
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG115);
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier22, companion8.getSetModifier());
                RowScopeInstance rowScopeInstance6 = RowScopeInstance.INSTANCE;
                f8 = 1;
                arrangement3 = arrangement2;
                state2 = state;
                IconButtonKt.IconButton(onBack, BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(40)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f8), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape()), false, null, null, C1.f13829a, composerStartRestartGroup, (i12 & 14) | 196608, 28);
                composerStartRestartGroup = composerStartRestartGroup;
                androidx.compose.foundation.text.modifiers.a.q(f6, companion6, composerStartRestartGroup, 6);
                materialTheme = MaterialTheme.INSTANCE;
                i10 = MaterialTheme.$stable;
                TextStyle titleLarge6 = materialTheme.getTypography(composerStartRestartGroup, i10).getTitleLarge();
                companion3 = FontWeight.Companion;
                TextStyle textStyleM5917copyp1EtxEg6 = titleLarge6.m5917copyp1EtxEg((16645977 & 1) != 0 ? titleLarge6.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? titleLarge6.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(22), (16645977 & 4) != 0 ? titleLarge6.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? titleLarge6.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? titleLarge6.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? titleLarge6.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? titleLarge6.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? titleLarge6.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? titleLarge6.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? titleLarge6.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? titleLarge6.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? titleLarge6.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? titleLarge6.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? titleLarge6.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? titleLarge6.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? titleLarge6.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? titleLarge6.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? titleLarge6.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? titleLarge6.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? titleLarge6.platformStyle : null, (16645977 & 1048576) != 0 ? titleLarge6.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? titleLarge6.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? titleLarge6.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? titleLarge6.paragraphStyle.getTextMotion() : null);
                j6 = p107y3.a.f15990o;
                TextKt.m2432Text4IGK_g("Organize PDF", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, textStyleM5917copyp1EtxEg6, composerStartRestartGroup, 390, 0, 65530);
                b.n(composerStartRestartGroup, f6, companion6, composerStartRestartGroup, 6);
                if (((File) mutableState13.getValue()) != null) {
                    composerStartRestartGroup.startReplaceGroup(-1255053421);
                    Modifier modifierVerticalScroll$default11 = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy113 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion7.getCenterHorizontally(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap1122 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier1122 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default11);
                    constructor7 = companion8.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor7);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    e eVarG1110 = p035i0.a.g(companion8, composerM3407constructorimpl7, measurePolicyColumnMeasurePolicy113, composerM3407constructorimpl7, currentCompositionLocalMap1122);
                    if (composerM3407constructorimpl7.getInserting()) {
                        mutableState2 = mutableState14;
                        if (!o.b(composerM3407constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier1122, companion8.getSetModifier());
                        float f110 = 32;
                        b.m(f110, companion6, composerStartRestartGroup, 6);
                        Modifier modifierClip11 = ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(96)), RoundedCornerShapeKt.getCircleShape());
                        long j112 = p107y3.a.f15984i;
                        Modifier modifierM220borderxT4_qwU11 = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(modifierClip11, Color.m3926copywmQWz5c$default(j112, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f8), Color.m3926copywmQWz5c$default(j112, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy11112 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                        currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap1111112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier1111112 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM220borderxT4_qwU11);
                        constructor8 = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor8);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        e eVarG1111 = p035i0.a.g(companion8, composerM3407constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy11112, composerM3407constructorimpl8, currentCompositionLocalMap1111112);
                        if (composerM3407constructorimpl8.getInserting()) {
                            mutableState3 = mutableState13;
                            if (!o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier1111112, companion8.getSetModifier());
                            Modifier modifierBackground$default111 = BackgroundKt.background$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(64)), RoundedCornerShapeKt.getCircleShape()), Brush.Companion.m3878linearGradientmHitzGk$default(companion, v.S(Color.m3917boximpl(j112), Color.m3917boximpl(ColorKt.Color(4281652121L))), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy11113 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                            currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap1111113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier1111113 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default111);
                            constructor9 = companion8.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor9);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl9 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy11113, composerM3407constructorimpl9, currentCompositionLocalMap1111113);
                            if (composerM3407constructorimpl9.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier1111113, companion8.getSetModifier());
                            IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), "Success", SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(36)), companion2.m3964getWhite0d7_KjU(), composerStartRestartGroup, 3504, 0);
                            b.r(composerStartRestartGroup, f5, companion6, composerStartRestartGroup, 6);
                            TextStyle headlineSmall111 = materialTheme.getTypography(composerStartRestartGroup, i10).getHeadlineSmall();
                            TextKt.m2432Text4IGK_g("PDF Saved Successfully!", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, headlineSmall111.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineSmall111.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? headlineSmall111.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineSmall111.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? headlineSmall111.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineSmall111.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineSmall111.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineSmall111.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineSmall111.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineSmall111.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineSmall111.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineSmall111.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineSmall111.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineSmall111.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineSmall111.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineSmall111.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineSmall111.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineSmall111.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineSmall111.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineSmall111.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineSmall111.platformStyle : null, (16645977 & 1048576) != 0 ? headlineSmall111.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineSmall111.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineSmall111.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineSmall111.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 390, 0, 65018);
                            b.m(28, companion6, composerStartRestartGroup, 6);
                            mutableState4 = mutableState3;
                            p097w3.j.a(PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(20), 7, null), 0L, Color.m3926copywmQWz5c$default(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-446322778, true, new S8(context, mutableState4, mutableState9), composerStartRestartGroup, 54), composerStartRestartGroup, 196998, 26);
                            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f110)), composerStartRestartGroup, 6);
                            composerStartRestartGroup.startReplaceGroup(1551057536);
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                                objRememberedValue5 = new C2527j7(mutableState5, mutableState9, mutableState4, mutableState2, 3);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            ButtonKt.TextButton((a) objRememberedValue5, null, false, null, null, null, null, null, null, C1.f13832d, composerStartRestartGroup, 805306374, 510);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceGroup();
                            state4 = stateAnimateFloat;
                        } else {
                            mutableState3 = mutableState13;
                        }
                        p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG1111);
                        Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier1111112, companion8.getSetModifier());
                        Modifier modifierBackground$default112 = BackgroundKt.background$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(64)), RoundedCornerShapeKt.getCircleShape()), Brush.Companion.m3878linearGradientmHitzGk$default(companion, v.S(Color.m3917boximpl(j112), Color.m3917boximpl(ColorKt.Color(4281652121L))), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy11114 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                        currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap1111114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier1111114 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default112);
                        constructor9 = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor9);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl9 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy11114, composerM3407constructorimpl9, currentCompositionLocalMap1111114);
                        if (composerM3407constructorimpl9.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier1111114, companion8.getSetModifier());
                        IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), "Success", SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(36)), companion2.m3964getWhite0d7_KjU(), composerStartRestartGroup, 3504, 0);
                        b.r(composerStartRestartGroup, f5, companion6, composerStartRestartGroup, 6);
                        TextStyle headlineSmall112 = materialTheme.getTypography(composerStartRestartGroup, i10).getHeadlineSmall();
                        TextKt.m2432Text4IGK_g("PDF Saved Successfully!", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, headlineSmall112.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineSmall112.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? headlineSmall112.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineSmall112.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? headlineSmall112.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineSmall112.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineSmall112.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineSmall112.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineSmall112.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineSmall112.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineSmall112.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineSmall112.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineSmall112.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineSmall112.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineSmall112.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineSmall112.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineSmall112.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineSmall112.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineSmall112.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineSmall112.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineSmall112.platformStyle : null, (16645977 & 1048576) != 0 ? headlineSmall112.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineSmall112.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineSmall112.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineSmall112.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 390, 0, 65018);
                        b.m(28, companion6, composerStartRestartGroup, 6);
                        mutableState4 = mutableState3;
                        p097w3.j.a(PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(20), 7, null), 0L, Color.m3926copywmQWz5c$default(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-446322778, true, new S8(context, mutableState4, mutableState9), composerStartRestartGroup, 54), composerStartRestartGroup, 196998, 26);
                        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f110)), composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceGroup(1551057536);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                            objRememberedValue5 = new C2527j7(mutableState5, mutableState9, mutableState4, mutableState2, 3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        ButtonKt.TextButton((a) objRememberedValue5, null, false, null, null, null, null, null, null, C1.f13832d, composerStartRestartGroup, 805306374, 510);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceGroup();
                        state4 = stateAnimateFloat;
                    } else {
                        mutableState2 = mutableState14;
                    }
                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG1110);
                    Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier1122, companion8.getSetModifier());
                    float f111 = 32;
                    b.m(f111, companion6, composerStartRestartGroup, 6);
                    Modifier modifierClip12 = ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(96)), RoundedCornerShapeKt.getCircleShape());
                    long j113 = p107y3.a.f15984i;
                    Modifier modifierM220borderxT4_qwU12 = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(modifierClip12, Color.m3926copywmQWz5c$default(j113, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f8), Color.m3926copywmQWz5c$default(j113, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy11115 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                    currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap1111115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier1111115 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM220borderxT4_qwU12);
                    constructor8 = companion8.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor8);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    e eVarG1112 = p035i0.a.g(companion8, composerM3407constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy11115, composerM3407constructorimpl8, currentCompositionLocalMap1111115);
                    if (composerM3407constructorimpl8.getInserting()) {
                        mutableState3 = mutableState13;
                        if (!o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier1111115, companion8.getSetModifier());
                        Modifier modifierBackground$default113 = BackgroundKt.background$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(64)), RoundedCornerShapeKt.getCircleShape()), Brush.Companion.m3878linearGradientmHitzGk$default(companion, v.S(Color.m3917boximpl(j113), Color.m3917boximpl(ColorKt.Color(4281652121L))), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy11116 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                        currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap1111116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier1111116 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default113);
                        constructor9 = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor9);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl9 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy11116, composerM3407constructorimpl9, currentCompositionLocalMap1111116);
                        if (composerM3407constructorimpl9.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier1111116, companion8.getSetModifier());
                        IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), "Success", SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(36)), companion2.m3964getWhite0d7_KjU(), composerStartRestartGroup, 3504, 0);
                        b.r(composerStartRestartGroup, f5, companion6, composerStartRestartGroup, 6);
                        TextStyle headlineSmall113 = materialTheme.getTypography(composerStartRestartGroup, i10).getHeadlineSmall();
                        TextKt.m2432Text4IGK_g("PDF Saved Successfully!", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, headlineSmall113.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineSmall113.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? headlineSmall113.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineSmall113.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? headlineSmall113.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineSmall113.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineSmall113.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineSmall113.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineSmall113.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineSmall113.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineSmall113.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineSmall113.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineSmall113.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineSmall113.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineSmall113.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineSmall113.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineSmall113.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineSmall113.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineSmall113.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineSmall113.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineSmall113.platformStyle : null, (16645977 & 1048576) != 0 ? headlineSmall113.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineSmall113.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineSmall113.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineSmall113.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 390, 0, 65018);
                        b.m(28, companion6, composerStartRestartGroup, 6);
                        mutableState4 = mutableState3;
                        p097w3.j.a(PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(20), 7, null), 0L, Color.m3926copywmQWz5c$default(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-446322778, true, new S8(context, mutableState4, mutableState9), composerStartRestartGroup, 54), composerStartRestartGroup, 196998, 26);
                        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f111)), composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceGroup(1551057536);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                            objRememberedValue5 = new C2527j7(mutableState5, mutableState9, mutableState4, mutableState2, 3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        ButtonKt.TextButton((a) objRememberedValue5, null, false, null, null, null, null, null, null, C1.f13832d, composerStartRestartGroup, 805306374, 510);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceGroup();
                        state4 = stateAnimateFloat;
                    } else {
                        mutableState3 = mutableState13;
                    }
                    p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG1112);
                    Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier1111115, companion8.getSetModifier());
                    Modifier modifierBackground$default114 = BackgroundKt.background$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(64)), RoundedCornerShapeKt.getCircleShape()), Brush.Companion.m3878linearGradientmHitzGk$default(companion, v.S(Color.m3917boximpl(j113), Color.m3917boximpl(ColorKt.Color(4281652121L))), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy11117 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                    currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap1111117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier1111117 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default114);
                    constructor9 = companion8.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor9);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl9 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy11117, composerM3407constructorimpl9, currentCompositionLocalMap1111117);
                    if (composerM3407constructorimpl9.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier1111117, companion8.getSetModifier());
                    IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), "Success", SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(36)), companion2.m3964getWhite0d7_KjU(), composerStartRestartGroup, 3504, 0);
                    b.r(composerStartRestartGroup, f5, companion6, composerStartRestartGroup, 6);
                    TextStyle headlineSmall114 = materialTheme.getTypography(composerStartRestartGroup, i10).getHeadlineSmall();
                    TextKt.m2432Text4IGK_g("PDF Saved Successfully!", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, headlineSmall114.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineSmall114.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? headlineSmall114.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineSmall114.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? headlineSmall114.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineSmall114.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineSmall114.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineSmall114.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineSmall114.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineSmall114.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineSmall114.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineSmall114.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineSmall114.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineSmall114.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineSmall114.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineSmall114.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineSmall114.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineSmall114.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineSmall114.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineSmall114.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineSmall114.platformStyle : null, (16645977 & 1048576) != 0 ? headlineSmall114.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineSmall114.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineSmall114.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineSmall114.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 390, 0, 65018);
                    b.m(28, companion6, composerStartRestartGroup, 6);
                    mutableState4 = mutableState3;
                    p097w3.j.a(PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(20), 7, null), 0L, Color.m3926copywmQWz5c$default(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-446322778, true, new S8(context, mutableState4, mutableState9), composerStartRestartGroup, 54), composerStartRestartGroup, 196998, 26);
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f111)), composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceGroup(1551057536);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                        objRememberedValue5 = new C2527j7(mutableState5, mutableState9, mutableState4, mutableState2, 3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ButtonKt.TextButton((a) objRememberedValue5, null, false, null, null, null, null, null, null, C1.f13832d, composerStartRestartGroup, 805306374, 510);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                    state4 = stateAnimateFloat;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1242473187);
                    if (((Uri) mutableState5.getValue()) == null) {
                        composerStartRestartGroup.startReplaceGroup(-1242989399);
                        Modifier modifierVerticalScroll$default12 = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy114 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion7.getCenterHorizontally(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap1111118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier1111118 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default12);
                        constructor5 = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor5);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl5 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG2 = p035i0.a.g(companion8, composerM3407constructorimpl5, measurePolicyColumnMeasurePolicy114, composerM3407constructorimpl5, currentCompositionLocalMap1111118);
                        if (composerM3407constructorimpl5.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier1111118, companion8.getSetModifier());
                        Modifier modifierM699height3ABfNKs6 = SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), Dp.m6403constructorimpl(280));
                        long jM3926copywmQWz5c$default6 = Color.m3926copywmQWz5c$default(j5, stateAnimateFloat2.getValue().floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                        composerStartRestartGroup.startReplaceGroup(1551090884);
                        zChangedInstance2 = composerStartRestartGroup.changedInstance(lVarV);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2) {
                            objRememberedValue3 = new P5(lVarV, 14);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new P5(lVarV, 14);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        p097w3.j.a(modifierM699height3ABfNKs6, 0L, jM3926copywmQWz5c$default6, 0.0f, (a) objRememberedValue3, ComposableLambdaKt.rememberComposableLambda(201211522, true, new T8(lVarV, stateAnimateFloat2, stateAnimateFloat), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 10);
                        b.m(f5, companion6, composerStartRestartGroup, 6);
                        TextStyle titleMedium6 = materialTheme.getTypography(composerStartRestartGroup, i10).getTitleMedium();
                        TextKt.m2432Text4IGK_g("How it works", PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(12), 7, null), j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, titleMedium6.m5917copyp1EtxEg((16645977 & 1) != 0 ? titleMedium6.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? titleMedium6.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? titleMedium6.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? titleMedium6.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? titleMedium6.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? titleMedium6.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? titleMedium6.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? titleMedium6.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? titleMedium6.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? titleMedium6.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? titleMedium6.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? titleMedium6.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? titleMedium6.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? titleMedium6.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? titleMedium6.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? titleMedium6.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? titleMedium6.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? titleMedium6.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? titleMedium6.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? titleMedium6.platformStyle : null, (16645977 & 1048576) != 0 ? titleMedium6.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? titleMedium6.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? titleMedium6.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? titleMedium6.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 438, 0, 65528);
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_119 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(10));
                        Modifier modifierFillMaxWidth$default11 = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy115 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_119, companion7.getStart(), composerStartRestartGroup, 6);
                        currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap1111119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier1111119 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default11);
                        constructor6 = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor6);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG3 = p035i0.a.g(companion8, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy115, composerM3407constructorimpl6, currentCompositionLocalMap1111119);
                        if (composerM3407constructorimpl6.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier1111119, companion8.getSetModifier());
                        Icons.Outlined outlined6 = Icons.Outlined.INSTANCE;
                        b("01", DescriptionKt.getDescription(outlined6), "Import PDF Document", "Choose the PDF file you want to organize from your device storage.", composerStartRestartGroup, 3462);
                        b("02", GridViewKt.getGridView(outlined6), "Reorder & Rotate Pages", "Drag pages or use Move Up/Down, Rotate 90°, Duplicate or Delete options on each page.", composerStartRestartGroup, 3462);
                        b("03", SaveKt.getSave(outlined6), "Save New Document", "Confirm changes and click 'Save PDF' to generate the optimized, updated file.", composerStartRestartGroup, 3462);
                        composerStartRestartGroup.endNode();
                        b.m(20, companion6, composerStartRestartGroup, 6);
                        Modifier modifierFillMaxWidth$default12 = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
                        long j114 = p107y3.a.f15984i;
                        p097w3.j.a(modifierFillMaxWidth$default12, Color.m3926copywmQWz5c$default(j114, 0.03f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(j114, 0.15f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, C1.e, composerStartRestartGroup, 197046, 24);
                        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f6)), composerStartRestartGroup, 6);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceGroup();
                        state4 = stateAnimateFloat;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1233398898);
                        Modifier modifierFillMaxSize$default19 = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy116 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion7.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap1111120 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier1111120 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default19);
                        constructor3 = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor3);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl3 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        e eVarG1113 = p035i0.a.g(companion8, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy116, composerM3407constructorimpl3, currentCompositionLocalMap1111120);
                        if (composerM3407constructorimpl3.getInserting()) {
                            state3 = stateAnimateFloat;
                            if (!o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier1111120, companion8.getSetModifier());
                            if (i13 > 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z4, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-486966906, true, new V8(i13, mutableState9, mutableState13, mutableState14), composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
                            if (i13 == 0) {
                                f9 = 0.0f;
                                i11 = 3;
                                z5 = true;
                            } else {
                                f9 = 0.0f;
                                i11 = 3;
                                z5 = false;
                            }
                            AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z5, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, f9, i11, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-1332655761, true, new X8(mutableState6, mutableState8, mutableState7, mutableState5), composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
                            state4 = state3;
                            Modifier modifierWeight$default11 = ColumnScope.weight$default(columnScopeInstance, companion6, 1.0f, false, 2, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy11118 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
                            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap11111110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier11111110 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default11);
                            constructor4 = companion8.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor4);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl4 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG = p035i0.a.g(companion8, composerM3407constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy11118, composerM3407constructorimpl4, currentCompositionLocalMap11111110);
                            if (composerM3407constructorimpl4.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier11111110, companion8.getSetModifier());
                            GridCells.Fixed fixed11 = new GridCells.Fixed(3);
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_1110 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(f7));
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_1111 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(12));
                            Modifier modifierFillMaxSize$default110 = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null);
                            composerStartRestartGroup.startReplaceGroup(1425236413);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion4 = Composer.Companion;
                            if (objRememberedValue == companion4.getEmpty()) {
                                objRememberedValue = new F(8, mutableState9, mutableState14, mutableState13);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            LazyGridDslKt.LazyVerticalGrid(fixed11, modifierFillMaxSize$default110, null, null, false, horizontalOrVerticalM548spacedBy0680j_1111, horizontalOrVerticalM548spacedBy0680j_1110, null, false, (c) objRememberedValue, composerStartRestartGroup, 807075888, 412);
                            b.n(composerStartRestartGroup, f6, companion6, composerStartRestartGroup, 6);
                            str = (String) mutableState14.getValue();
                            composerStartRestartGroup.startReplaceGroup(1551965696);
                            if (str != null) {
                                long jColor11 = ColorKt.Color(4293870660L);
                                TextStyle bodyMedium11 = materialTheme.getTypography(composerStartRestartGroup, i10).getBodyMedium();
                                TextKt.m2432Text4IGK_g(str, PaddingKt.m672paddingqDBjuR0$default(companion6, 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f7), 7, null), jColor11, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, bodyMedium11.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium11.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodyMedium11.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium11.spanStyle.getFontWeight() : companion3.getSemiBold(), (16645977 & 8) != 0 ? bodyMedium11.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium11.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium11.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium11.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium11.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium11.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium11.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium11.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium11.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium11.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium11.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium11.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium11.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium11.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium11.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium11.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium11.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium11.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium11.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium11.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium11.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 432, 0, 65016);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1551985192);
                            zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance) {
                                objRememberedValue2 = new C2382a6(context, coroutineScope, mutableState5, mutableState9, mutableState10, mutableState, mutableState14, mutableState13, mutableState12, mutableState6);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new C2382a6(context, coroutineScope, mutableState5, mutableState9, mutableState10, mutableState, mutableState14, mutableState13, mutableState12, mutableState6);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            q.a("Save Organized PDF", (a) objRememberedValue2, SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), null, false, false, composerStartRestartGroup, 390, 56);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            state3 = stateAnimateFloat;
                        }
                        p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG1113);
                        Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier1111120, companion8.getSetModifier());
                        if (i13 > 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z4, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-486966906, true, new V8(i13, mutableState9, mutableState13, mutableState14), composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
                        if (i13 == 0) {
                            f9 = 0.0f;
                            i11 = 3;
                            z5 = true;
                        } else {
                            f9 = 0.0f;
                            i11 = 3;
                            z5 = false;
                        }
                        AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z5, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, f9, i11, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-1332655761, true, new X8(mutableState6, mutableState8, mutableState7, mutableState5), composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
                        state4 = state3;
                        Modifier modifierWeight$default12 = ColumnScope.weight$default(columnScopeInstance, companion6, 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy11119 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
                        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap11111111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier11111111 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default12);
                        constructor4 = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor4);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl4 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG = p035i0.a.g(companion8, composerM3407constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy11119, composerM3407constructorimpl4, currentCompositionLocalMap11111111);
                        if (composerM3407constructorimpl4.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier11111111, companion8.getSetModifier());
                        GridCells.Fixed fixed12 = new GridCells.Fixed(3);
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_1112 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(f7));
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_1113 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(12));
                        Modifier modifierFillMaxSize$default111 = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceGroup(1425236413);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion4 = Composer.Companion;
                        if (objRememberedValue == companion4.getEmpty()) {
                            objRememberedValue = new F(8, mutableState9, mutableState14, mutableState13);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        LazyGridDslKt.LazyVerticalGrid(fixed12, modifierFillMaxSize$default111, null, null, false, horizontalOrVerticalM548spacedBy0680j_1113, horizontalOrVerticalM548spacedBy0680j_1112, null, false, (c) objRememberedValue, composerStartRestartGroup, 807075888, 412);
                        b.n(composerStartRestartGroup, f6, companion6, composerStartRestartGroup, 6);
                        str = (String) mutableState14.getValue();
                        composerStartRestartGroup.startReplaceGroup(1551965696);
                        if (str != null) {
                            long jColor12 = ColorKt.Color(4293870660L);
                            TextStyle bodyMedium12 = materialTheme.getTypography(composerStartRestartGroup, i10).getBodyMedium();
                            TextKt.m2432Text4IGK_g(str, PaddingKt.m672paddingqDBjuR0$default(companion6, 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f7), 7, null), jColor12, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, bodyMedium12.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium12.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodyMedium12.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium12.spanStyle.getFontWeight() : companion3.getSemiBold(), (16645977 & 8) != 0 ? bodyMedium12.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium12.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium12.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium12.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium12.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium12.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium12.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium12.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium12.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium12.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium12.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium12.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium12.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium12.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium12.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium12.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium12.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium12.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium12.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium12.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium12.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 432, 0, 65016);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1551985192);
                        zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance) {
                            objRememberedValue2 = new C2382a6(context, coroutineScope, mutableState5, mutableState9, mutableState10, mutableState, mutableState14, mutableState13, mutableState12, mutableState6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new C2382a6(context, coroutineScope, mutableState5, mutableState9, mutableState10, mutableState, mutableState14, mutableState13, mutableState12, mutableState6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        q.a("Save Organized PDF", (a) objRememberedValue2, SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), null, false, false, composerStartRestartGroup, 390, 56);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.startReplaceGroup(442168952);
                if (((Boolean) mutableState10.getValue()).booleanValue()) {
                    DialogProperties dialogProperties6 = new DialogProperties(false, false, false, 4, (AbstractC2168g) null);
                    Modifier modifierFillMaxWidth6 = SizeKt.fillMaxWidth(companion6, 0.85f);
                    composerStartRestartGroup.startReplaceGroup(442166902);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                        objRememberedValue4 = new f(4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    n.a((a) objRememberedValue4, modifierFillMaxWidth6, 0L, dialogProperties6, ComposableLambdaKt.rememberComposableLambda(1529991554, true, new C2401b9(state4, state2, mutableState, mutableState12), composerStartRestartGroup, 54), composerStartRestartGroup, 27702, 4);
                }
                if (p035i0.a.z(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                mutableState = mutableState11;
            }
            p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG20);
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier21, companion8.getSetModifier());
            columnScopeInstance = ColumnScopeInstance.INSTANCE;
            f7 = 8;
            Modifier modifierM670paddingVpY3zN4$default4 = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, Dp.m6403constructorimpl(f7), 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion7.getCenterVertically(), composerStartRestartGroup, 48);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap23 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier23 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM670paddingVpY3zN4$default4);
            constructor2 = companion8.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM3407constructorimpl2 = Updater.m3407constructorimpl(composerStartRestartGroup);
            e eVarG1114 = p035i0.a.g(companion8, composerM3407constructorimpl2, measurePolicyRowMeasurePolicy4, composerM3407constructorimpl2, currentCompositionLocalMap23);
            if (composerM3407constructorimpl2.getInserting()) {
                arrangement2 = arrangement;
                if (!o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier23, companion8.getSetModifier());
                RowScopeInstance rowScopeInstance7 = RowScopeInstance.INSTANCE;
                f8 = 1;
                arrangement3 = arrangement2;
                state2 = state;
                IconButtonKt.IconButton(onBack, BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(40)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f8), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape()), false, null, null, C1.f13829a, composerStartRestartGroup, (i12 & 14) | 196608, 28);
                composerStartRestartGroup = composerStartRestartGroup;
                androidx.compose.foundation.text.modifiers.a.q(f6, companion6, composerStartRestartGroup, 6);
                materialTheme = MaterialTheme.INSTANCE;
                i10 = MaterialTheme.$stable;
                TextStyle titleLarge7 = materialTheme.getTypography(composerStartRestartGroup, i10).getTitleLarge();
                companion3 = FontWeight.Companion;
                TextStyle textStyleM5917copyp1EtxEg7 = titleLarge7.m5917copyp1EtxEg((16645977 & 1) != 0 ? titleLarge7.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? titleLarge7.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(22), (16645977 & 4) != 0 ? titleLarge7.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? titleLarge7.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? titleLarge7.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? titleLarge7.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? titleLarge7.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? titleLarge7.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? titleLarge7.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? titleLarge7.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? titleLarge7.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? titleLarge7.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? titleLarge7.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? titleLarge7.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? titleLarge7.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? titleLarge7.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? titleLarge7.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? titleLarge7.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? titleLarge7.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? titleLarge7.platformStyle : null, (16645977 & 1048576) != 0 ? titleLarge7.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? titleLarge7.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? titleLarge7.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? titleLarge7.paragraphStyle.getTextMotion() : null);
                j6 = p107y3.a.f15990o;
                TextKt.m2432Text4IGK_g("Organize PDF", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, textStyleM5917copyp1EtxEg7, composerStartRestartGroup, 390, 0, 65530);
                b.n(composerStartRestartGroup, f6, companion6, composerStartRestartGroup, 6);
                if (((File) mutableState13.getValue()) != null) {
                    composerStartRestartGroup.startReplaceGroup(-1255053421);
                    Modifier modifierVerticalScroll$default13 = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy117 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion7.getCenterHorizontally(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap1123 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier1123 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default13);
                    constructor7 = companion8.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor7);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    e eVarG1115 = p035i0.a.g(companion8, composerM3407constructorimpl7, measurePolicyColumnMeasurePolicy117, composerM3407constructorimpl7, currentCompositionLocalMap1123);
                    if (composerM3407constructorimpl7.getInserting()) {
                        mutableState2 = mutableState14;
                        if (!o.b(composerM3407constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier1123, companion8.getSetModifier());
                        float f112 = 32;
                        b.m(f112, companion6, composerStartRestartGroup, 6);
                        Modifier modifierClip13 = ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(96)), RoundedCornerShapeKt.getCircleShape());
                        long j115 = p107y3.a.f15984i;
                        Modifier modifierM220borderxT4_qwU13 = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(modifierClip13, Color.m3926copywmQWz5c$default(j115, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f8), Color.m3926copywmQWz5c$default(j115, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy111110 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                        currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap11111112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier11111112 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM220borderxT4_qwU13);
                        constructor8 = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor8);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        e eVarG1116 = p035i0.a.g(companion8, composerM3407constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy111110, composerM3407constructorimpl8, currentCompositionLocalMap11111112);
                        if (composerM3407constructorimpl8.getInserting()) {
                            mutableState3 = mutableState13;
                            if (!o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier11111112, companion8.getSetModifier());
                            Modifier modifierBackground$default115 = BackgroundKt.background$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(64)), RoundedCornerShapeKt.getCircleShape()), Brush.Companion.m3878linearGradientmHitzGk$default(companion, v.S(Color.m3917boximpl(j115), Color.m3917boximpl(ColorKt.Color(4281652121L))), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy111111 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                            currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap11111113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier11111113 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default115);
                            constructor9 = companion8.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor9);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl9 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy111111, composerM3407constructorimpl9, currentCompositionLocalMap11111113);
                            if (composerM3407constructorimpl9.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier11111113, companion8.getSetModifier());
                            IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), "Success", SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(36)), companion2.m3964getWhite0d7_KjU(), composerStartRestartGroup, 3504, 0);
                            b.r(composerStartRestartGroup, f5, companion6, composerStartRestartGroup, 6);
                            TextStyle headlineSmall115 = materialTheme.getTypography(composerStartRestartGroup, i10).getHeadlineSmall();
                            TextKt.m2432Text4IGK_g("PDF Saved Successfully!", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, headlineSmall115.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineSmall115.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? headlineSmall115.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineSmall115.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? headlineSmall115.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineSmall115.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineSmall115.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineSmall115.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineSmall115.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineSmall115.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineSmall115.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineSmall115.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineSmall115.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineSmall115.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineSmall115.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineSmall115.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineSmall115.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineSmall115.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineSmall115.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineSmall115.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineSmall115.platformStyle : null, (16645977 & 1048576) != 0 ? headlineSmall115.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineSmall115.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineSmall115.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineSmall115.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 390, 0, 65018);
                            b.m(28, companion6, composerStartRestartGroup, 6);
                            mutableState4 = mutableState3;
                            p097w3.j.a(PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(20), 7, null), 0L, Color.m3926copywmQWz5c$default(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-446322778, true, new S8(context, mutableState4, mutableState9), composerStartRestartGroup, 54), composerStartRestartGroup, 196998, 26);
                            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f112)), composerStartRestartGroup, 6);
                            composerStartRestartGroup.startReplaceGroup(1551057536);
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                                objRememberedValue5 = new C2527j7(mutableState5, mutableState9, mutableState4, mutableState2, 3);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            ButtonKt.TextButton((a) objRememberedValue5, null, false, null, null, null, null, null, null, C1.f13832d, composerStartRestartGroup, 805306374, 510);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceGroup();
                            state4 = stateAnimateFloat;
                        } else {
                            mutableState3 = mutableState13;
                        }
                        p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG1116);
                        Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier11111112, companion8.getSetModifier());
                        Modifier modifierBackground$default116 = BackgroundKt.background$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(64)), RoundedCornerShapeKt.getCircleShape()), Brush.Companion.m3878linearGradientmHitzGk$default(companion, v.S(Color.m3917boximpl(j115), Color.m3917boximpl(ColorKt.Color(4281652121L))), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy111112 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                        currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap11111114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier11111114 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default116);
                        constructor9 = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor9);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl9 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy111112, composerM3407constructorimpl9, currentCompositionLocalMap11111114);
                        if (composerM3407constructorimpl9.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier11111114, companion8.getSetModifier());
                        IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), "Success", SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(36)), companion2.m3964getWhite0d7_KjU(), composerStartRestartGroup, 3504, 0);
                        b.r(composerStartRestartGroup, f5, companion6, composerStartRestartGroup, 6);
                        TextStyle headlineSmall116 = materialTheme.getTypography(composerStartRestartGroup, i10).getHeadlineSmall();
                        TextKt.m2432Text4IGK_g("PDF Saved Successfully!", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, headlineSmall116.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineSmall116.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? headlineSmall116.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineSmall116.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? headlineSmall116.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineSmall116.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineSmall116.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineSmall116.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineSmall116.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineSmall116.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineSmall116.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineSmall116.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineSmall116.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineSmall116.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineSmall116.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineSmall116.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineSmall116.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineSmall116.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineSmall116.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineSmall116.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineSmall116.platformStyle : null, (16645977 & 1048576) != 0 ? headlineSmall116.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineSmall116.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineSmall116.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineSmall116.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 390, 0, 65018);
                        b.m(28, companion6, composerStartRestartGroup, 6);
                        mutableState4 = mutableState3;
                        p097w3.j.a(PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(20), 7, null), 0L, Color.m3926copywmQWz5c$default(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-446322778, true, new S8(context, mutableState4, mutableState9), composerStartRestartGroup, 54), composerStartRestartGroup, 196998, 26);
                        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f112)), composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceGroup(1551057536);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                            objRememberedValue5 = new C2527j7(mutableState5, mutableState9, mutableState4, mutableState2, 3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        ButtonKt.TextButton((a) objRememberedValue5, null, false, null, null, null, null, null, null, C1.f13832d, composerStartRestartGroup, 805306374, 510);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceGroup();
                        state4 = stateAnimateFloat;
                    } else {
                        mutableState2 = mutableState14;
                    }
                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG1115);
                    Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier1123, companion8.getSetModifier());
                    float f113 = 32;
                    b.m(f113, companion6, composerStartRestartGroup, 6);
                    Modifier modifierClip14 = ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(96)), RoundedCornerShapeKt.getCircleShape());
                    long j116 = p107y3.a.f15984i;
                    Modifier modifierM220borderxT4_qwU14 = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(modifierClip14, Color.m3926copywmQWz5c$default(j116, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f8), Color.m3926copywmQWz5c$default(j116, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy111113 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                    currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11111115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier11111115 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM220borderxT4_qwU14);
                    constructor8 = companion8.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor8);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    e eVarG1117 = p035i0.a.g(companion8, composerM3407constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy111113, composerM3407constructorimpl8, currentCompositionLocalMap11111115);
                    if (composerM3407constructorimpl8.getInserting()) {
                        mutableState3 = mutableState13;
                        if (!o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier11111115, companion8.getSetModifier());
                        Modifier modifierBackground$default117 = BackgroundKt.background$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(64)), RoundedCornerShapeKt.getCircleShape()), Brush.Companion.m3878linearGradientmHitzGk$default(companion, v.S(Color.m3917boximpl(j116), Color.m3917boximpl(ColorKt.Color(4281652121L))), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy111114 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                        currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap11111116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier11111116 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default117);
                        constructor9 = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor9);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl9 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy111114, composerM3407constructorimpl9, currentCompositionLocalMap11111116);
                        if (composerM3407constructorimpl9.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier11111116, companion8.getSetModifier());
                        IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), "Success", SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(36)), companion2.m3964getWhite0d7_KjU(), composerStartRestartGroup, 3504, 0);
                        b.r(composerStartRestartGroup, f5, companion6, composerStartRestartGroup, 6);
                        TextStyle headlineSmall117 = materialTheme.getTypography(composerStartRestartGroup, i10).getHeadlineSmall();
                        TextKt.m2432Text4IGK_g("PDF Saved Successfully!", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, headlineSmall117.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineSmall117.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? headlineSmall117.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineSmall117.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? headlineSmall117.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineSmall117.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineSmall117.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineSmall117.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineSmall117.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineSmall117.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineSmall117.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineSmall117.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineSmall117.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineSmall117.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineSmall117.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineSmall117.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineSmall117.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineSmall117.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineSmall117.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineSmall117.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineSmall117.platformStyle : null, (16645977 & 1048576) != 0 ? headlineSmall117.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineSmall117.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineSmall117.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineSmall117.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 390, 0, 65018);
                        b.m(28, companion6, composerStartRestartGroup, 6);
                        mutableState4 = mutableState3;
                        p097w3.j.a(PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(20), 7, null), 0L, Color.m3926copywmQWz5c$default(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-446322778, true, new S8(context, mutableState4, mutableState9), composerStartRestartGroup, 54), composerStartRestartGroup, 196998, 26);
                        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f113)), composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceGroup(1551057536);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                            objRememberedValue5 = new C2527j7(mutableState5, mutableState9, mutableState4, mutableState2, 3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        ButtonKt.TextButton((a) objRememberedValue5, null, false, null, null, null, null, null, null, C1.f13832d, composerStartRestartGroup, 805306374, 510);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceGroup();
                        state4 = stateAnimateFloat;
                    } else {
                        mutableState3 = mutableState13;
                    }
                    p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG1117);
                    Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier11111115, companion8.getSetModifier());
                    Modifier modifierBackground$default118 = BackgroundKt.background$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(64)), RoundedCornerShapeKt.getCircleShape()), Brush.Companion.m3878linearGradientmHitzGk$default(companion, v.S(Color.m3917boximpl(j116), Color.m3917boximpl(ColorKt.Color(4281652121L))), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy111115 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                    currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11111117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier11111117 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default118);
                    constructor9 = companion8.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor9);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl9 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy111115, composerM3407constructorimpl9, currentCompositionLocalMap11111117);
                    if (composerM3407constructorimpl9.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier11111117, companion8.getSetModifier());
                    IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), "Success", SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(36)), companion2.m3964getWhite0d7_KjU(), composerStartRestartGroup, 3504, 0);
                    b.r(composerStartRestartGroup, f5, companion6, composerStartRestartGroup, 6);
                    TextStyle headlineSmall118 = materialTheme.getTypography(composerStartRestartGroup, i10).getHeadlineSmall();
                    TextKt.m2432Text4IGK_g("PDF Saved Successfully!", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, headlineSmall118.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineSmall118.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? headlineSmall118.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineSmall118.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? headlineSmall118.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineSmall118.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineSmall118.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineSmall118.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineSmall118.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineSmall118.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineSmall118.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineSmall118.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineSmall118.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineSmall118.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineSmall118.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineSmall118.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineSmall118.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineSmall118.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineSmall118.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineSmall118.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineSmall118.platformStyle : null, (16645977 & 1048576) != 0 ? headlineSmall118.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineSmall118.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineSmall118.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineSmall118.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 390, 0, 65018);
                    b.m(28, companion6, composerStartRestartGroup, 6);
                    mutableState4 = mutableState3;
                    p097w3.j.a(PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(20), 7, null), 0L, Color.m3926copywmQWz5c$default(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-446322778, true, new S8(context, mutableState4, mutableState9), composerStartRestartGroup, 54), composerStartRestartGroup, 196998, 26);
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f113)), composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceGroup(1551057536);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                        objRememberedValue5 = new C2527j7(mutableState5, mutableState9, mutableState4, mutableState2, 3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ButtonKt.TextButton((a) objRememberedValue5, null, false, null, null, null, null, null, null, C1.f13832d, composerStartRestartGroup, 805306374, 510);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                    state4 = stateAnimateFloat;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1242473187);
                    if (((Uri) mutableState5.getValue()) == null) {
                        composerStartRestartGroup.startReplaceGroup(-1242989399);
                        Modifier modifierVerticalScroll$default14 = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy118 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion7.getCenterHorizontally(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap11111118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier11111118 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default14);
                        constructor5 = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor5);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl5 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG2 = p035i0.a.g(companion8, composerM3407constructorimpl5, measurePolicyColumnMeasurePolicy118, composerM3407constructorimpl5, currentCompositionLocalMap11111118);
                        if (composerM3407constructorimpl5.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier11111118, companion8.getSetModifier());
                        Modifier modifierM699height3ABfNKs7 = SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), Dp.m6403constructorimpl(280));
                        long jM3926copywmQWz5c$default7 = Color.m3926copywmQWz5c$default(j5, stateAnimateFloat2.getValue().floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                        composerStartRestartGroup.startReplaceGroup(1551090884);
                        zChangedInstance2 = composerStartRestartGroup.changedInstance(lVarV);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2) {
                            objRememberedValue3 = new P5(lVarV, 14);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new P5(lVarV, 14);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        p097w3.j.a(modifierM699height3ABfNKs7, 0L, jM3926copywmQWz5c$default7, 0.0f, (a) objRememberedValue3, ComposableLambdaKt.rememberComposableLambda(201211522, true, new T8(lVarV, stateAnimateFloat2, stateAnimateFloat), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 10);
                        b.m(f5, companion6, composerStartRestartGroup, 6);
                        TextStyle titleMedium7 = materialTheme.getTypography(composerStartRestartGroup, i10).getTitleMedium();
                        TextKt.m2432Text4IGK_g("How it works", PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(12), 7, null), j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, titleMedium7.m5917copyp1EtxEg((16645977 & 1) != 0 ? titleMedium7.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? titleMedium7.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? titleMedium7.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? titleMedium7.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? titleMedium7.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? titleMedium7.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? titleMedium7.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? titleMedium7.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? titleMedium7.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? titleMedium7.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? titleMedium7.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? titleMedium7.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? titleMedium7.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? titleMedium7.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? titleMedium7.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? titleMedium7.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? titleMedium7.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? titleMedium7.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? titleMedium7.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? titleMedium7.platformStyle : null, (16645977 & 1048576) != 0 ? titleMedium7.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? titleMedium7.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? titleMedium7.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? titleMedium7.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 438, 0, 65528);
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_1114 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(10));
                        Modifier modifierFillMaxWidth$default13 = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy119 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_1114, companion7.getStart(), composerStartRestartGroup, 6);
                        currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap11111119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier11111119 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default13);
                        constructor6 = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor6);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG3 = p035i0.a.g(companion8, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy119, composerM3407constructorimpl6, currentCompositionLocalMap11111119);
                        if (composerM3407constructorimpl6.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier11111119, companion8.getSetModifier());
                        Icons.Outlined outlined7 = Icons.Outlined.INSTANCE;
                        b("01", DescriptionKt.getDescription(outlined7), "Import PDF Document", "Choose the PDF file you want to organize from your device storage.", composerStartRestartGroup, 3462);
                        b("02", GridViewKt.getGridView(outlined7), "Reorder & Rotate Pages", "Drag pages or use Move Up/Down, Rotate 90°, Duplicate or Delete options on each page.", composerStartRestartGroup, 3462);
                        b("03", SaveKt.getSave(outlined7), "Save New Document", "Confirm changes and click 'Save PDF' to generate the optimized, updated file.", composerStartRestartGroup, 3462);
                        composerStartRestartGroup.endNode();
                        b.m(20, companion6, composerStartRestartGroup, 6);
                        Modifier modifierFillMaxWidth$default14 = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
                        long j117 = p107y3.a.f15984i;
                        p097w3.j.a(modifierFillMaxWidth$default14, Color.m3926copywmQWz5c$default(j117, 0.03f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(j117, 0.15f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, C1.e, composerStartRestartGroup, 197046, 24);
                        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f6)), composerStartRestartGroup, 6);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceGroup();
                        state4 = stateAnimateFloat;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1233398898);
                        Modifier modifierFillMaxSize$default112 = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy1110 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion7.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap1111121 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier1111121 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default112);
                        constructor3 = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor3);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl3 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        e eVarG1118 = p035i0.a.g(companion8, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy1110, composerM3407constructorimpl3, currentCompositionLocalMap1111121);
                        if (composerM3407constructorimpl3.getInserting()) {
                            state3 = stateAnimateFloat;
                            if (!o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier1111121, companion8.getSetModifier());
                            if (i13 > 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z4, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-486966906, true, new V8(i13, mutableState9, mutableState13, mutableState14), composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
                            if (i13 == 0) {
                                f9 = 0.0f;
                                i11 = 3;
                                z5 = true;
                            } else {
                                f9 = 0.0f;
                                i11 = 3;
                                z5 = false;
                            }
                            AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z5, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, f9, i11, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-1332655761, true, new X8(mutableState6, mutableState8, mutableState7, mutableState5), composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
                            state4 = state3;
                            Modifier modifierWeight$default13 = ColumnScope.weight$default(columnScopeInstance, companion6, 1.0f, false, 2, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy111116 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
                            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap111111110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier111111110 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default13);
                            constructor4 = companion8.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor4);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl4 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG = p035i0.a.g(companion8, composerM3407constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy111116, composerM3407constructorimpl4, currentCompositionLocalMap111111110);
                            if (composerM3407constructorimpl4.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier111111110, companion8.getSetModifier());
                            GridCells.Fixed fixed13 = new GridCells.Fixed(3);
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_1115 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(f7));
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_1116 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(12));
                            Modifier modifierFillMaxSize$default113 = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null);
                            composerStartRestartGroup.startReplaceGroup(1425236413);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion4 = Composer.Companion;
                            if (objRememberedValue == companion4.getEmpty()) {
                                objRememberedValue = new F(8, mutableState9, mutableState14, mutableState13);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            LazyGridDslKt.LazyVerticalGrid(fixed13, modifierFillMaxSize$default113, null, null, false, horizontalOrVerticalM548spacedBy0680j_1116, horizontalOrVerticalM548spacedBy0680j_1115, null, false, (c) objRememberedValue, composerStartRestartGroup, 807075888, 412);
                            b.n(composerStartRestartGroup, f6, companion6, composerStartRestartGroup, 6);
                            str = (String) mutableState14.getValue();
                            composerStartRestartGroup.startReplaceGroup(1551965696);
                            if (str != null) {
                                long jColor13 = ColorKt.Color(4293870660L);
                                TextStyle bodyMedium13 = materialTheme.getTypography(composerStartRestartGroup, i10).getBodyMedium();
                                TextKt.m2432Text4IGK_g(str, PaddingKt.m672paddingqDBjuR0$default(companion6, 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f7), 7, null), jColor13, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, bodyMedium13.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium13.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodyMedium13.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium13.spanStyle.getFontWeight() : companion3.getSemiBold(), (16645977 & 8) != 0 ? bodyMedium13.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium13.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium13.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium13.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium13.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium13.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium13.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium13.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium13.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium13.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium13.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium13.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium13.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium13.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium13.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium13.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium13.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium13.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium13.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium13.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium13.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 432, 0, 65016);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1551985192);
                            zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance) {
                                objRememberedValue2 = new C2382a6(context, coroutineScope, mutableState5, mutableState9, mutableState10, mutableState, mutableState14, mutableState13, mutableState12, mutableState6);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new C2382a6(context, coroutineScope, mutableState5, mutableState9, mutableState10, mutableState, mutableState14, mutableState13, mutableState12, mutableState6);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            q.a("Save Organized PDF", (a) objRememberedValue2, SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), null, false, false, composerStartRestartGroup, 390, 56);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            state3 = stateAnimateFloat;
                        }
                        p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG1118);
                        Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier1111121, companion8.getSetModifier());
                        if (i13 > 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z4, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-486966906, true, new V8(i13, mutableState9, mutableState13, mutableState14), composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
                        if (i13 == 0) {
                            f9 = 0.0f;
                            i11 = 3;
                            z5 = true;
                        } else {
                            f9 = 0.0f;
                            i11 = 3;
                            z5 = false;
                        }
                        AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z5, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, f9, i11, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-1332655761, true, new X8(mutableState6, mutableState8, mutableState7, mutableState5), composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
                        state4 = state3;
                        Modifier modifierWeight$default14 = ColumnScope.weight$default(columnScopeInstance, companion6, 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy111117 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
                        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap111111111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier111111111 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default14);
                        constructor4 = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor4);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl4 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG = p035i0.a.g(companion8, composerM3407constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy111117, composerM3407constructorimpl4, currentCompositionLocalMap111111111);
                        if (composerM3407constructorimpl4.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier111111111, companion8.getSetModifier());
                        GridCells.Fixed fixed14 = new GridCells.Fixed(3);
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_1117 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(f7));
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_1118 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(12));
                        Modifier modifierFillMaxSize$default114 = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceGroup(1425236413);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion4 = Composer.Companion;
                        if (objRememberedValue == companion4.getEmpty()) {
                            objRememberedValue = new F(8, mutableState9, mutableState14, mutableState13);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        LazyGridDslKt.LazyVerticalGrid(fixed14, modifierFillMaxSize$default114, null, null, false, horizontalOrVerticalM548spacedBy0680j_1118, horizontalOrVerticalM548spacedBy0680j_1117, null, false, (c) objRememberedValue, composerStartRestartGroup, 807075888, 412);
                        b.n(composerStartRestartGroup, f6, companion6, composerStartRestartGroup, 6);
                        str = (String) mutableState14.getValue();
                        composerStartRestartGroup.startReplaceGroup(1551965696);
                        if (str != null) {
                            long jColor14 = ColorKt.Color(4293870660L);
                            TextStyle bodyMedium14 = materialTheme.getTypography(composerStartRestartGroup, i10).getBodyMedium();
                            TextKt.m2432Text4IGK_g(str, PaddingKt.m672paddingqDBjuR0$default(companion6, 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f7), 7, null), jColor14, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, bodyMedium14.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium14.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodyMedium14.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium14.spanStyle.getFontWeight() : companion3.getSemiBold(), (16645977 & 8) != 0 ? bodyMedium14.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium14.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium14.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium14.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium14.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium14.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium14.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium14.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium14.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium14.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium14.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium14.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium14.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium14.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium14.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium14.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium14.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium14.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium14.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium14.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium14.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 432, 0, 65016);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1551985192);
                        zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance) {
                            objRememberedValue2 = new C2382a6(context, coroutineScope, mutableState5, mutableState9, mutableState10, mutableState, mutableState14, mutableState13, mutableState12, mutableState6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new C2382a6(context, coroutineScope, mutableState5, mutableState9, mutableState10, mutableState, mutableState14, mutableState13, mutableState12, mutableState6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        q.a("Save Organized PDF", (a) objRememberedValue2, SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), null, false, false, composerStartRestartGroup, 390, 56);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.startReplaceGroup(442168952);
                if (((Boolean) mutableState10.getValue()).booleanValue()) {
                    DialogProperties dialogProperties7 = new DialogProperties(false, false, false, 4, (AbstractC2168g) null);
                    Modifier modifierFillMaxWidth7 = SizeKt.fillMaxWidth(companion6, 0.85f);
                    composerStartRestartGroup.startReplaceGroup(442166902);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                        objRememberedValue4 = new f(4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    n.a((a) objRememberedValue4, modifierFillMaxWidth7, 0L, dialogProperties7, ComposableLambdaKt.rememberComposableLambda(1529991554, true, new C2401b9(state4, state2, mutableState, mutableState12), composerStartRestartGroup, 54), composerStartRestartGroup, 27702, 4);
                }
                if (p035i0.a.z(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                arrangement2 = arrangement;
            }
            p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG1114);
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier23, companion8.getSetModifier());
            RowScopeInstance rowScopeInstance8 = RowScopeInstance.INSTANCE;
            f8 = 1;
            arrangement3 = arrangement2;
            state2 = state;
            IconButtonKt.IconButton(onBack, BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(40)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f8), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape()), false, null, null, C1.f13829a, composerStartRestartGroup, (i12 & 14) | 196608, 28);
            composerStartRestartGroup = composerStartRestartGroup;
            androidx.compose.foundation.text.modifiers.a.q(f6, companion6, composerStartRestartGroup, 6);
            materialTheme = MaterialTheme.INSTANCE;
            i10 = MaterialTheme.$stable;
            TextStyle titleLarge8 = materialTheme.getTypography(composerStartRestartGroup, i10).getTitleLarge();
            companion3 = FontWeight.Companion;
            TextStyle textStyleM5917copyp1EtxEg8 = titleLarge8.m5917copyp1EtxEg((16645977 & 1) != 0 ? titleLarge8.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? titleLarge8.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(22), (16645977 & 4) != 0 ? titleLarge8.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? titleLarge8.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? titleLarge8.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? titleLarge8.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? titleLarge8.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? titleLarge8.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? titleLarge8.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? titleLarge8.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? titleLarge8.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? titleLarge8.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? titleLarge8.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? titleLarge8.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? titleLarge8.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? titleLarge8.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? titleLarge8.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? titleLarge8.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? titleLarge8.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? titleLarge8.platformStyle : null, (16645977 & 1048576) != 0 ? titleLarge8.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? titleLarge8.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? titleLarge8.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? titleLarge8.paragraphStyle.getTextMotion() : null);
            j6 = p107y3.a.f15990o;
            TextKt.m2432Text4IGK_g("Organize PDF", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, textStyleM5917copyp1EtxEg8, composerStartRestartGroup, 390, 0, 65530);
            b.n(composerStartRestartGroup, f6, companion6, composerStartRestartGroup, 6);
            if (((File) mutableState13.getValue()) != null) {
                composerStartRestartGroup.startReplaceGroup(-1255053421);
                Modifier modifierVerticalScroll$default15 = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy1111 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion7.getCenterHorizontally(), composerStartRestartGroup, 48);
                currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap1124 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier1124 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default15);
                constructor7 = companion8.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor7);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
                e eVarG1119 = p035i0.a.g(companion8, composerM3407constructorimpl7, measurePolicyColumnMeasurePolicy1111, composerM3407constructorimpl7, currentCompositionLocalMap1124);
                if (composerM3407constructorimpl7.getInserting()) {
                    mutableState2 = mutableState14;
                    if (!o.b(composerM3407constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier1124, companion8.getSetModifier());
                    float f114 = 32;
                    b.m(f114, companion6, composerStartRestartGroup, 6);
                    Modifier modifierClip15 = ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(96)), RoundedCornerShapeKt.getCircleShape());
                    long j118 = p107y3.a.f15984i;
                    Modifier modifierM220borderxT4_qwU15 = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(modifierClip15, Color.m3926copywmQWz5c$default(j118, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f8), Color.m3926copywmQWz5c$default(j118, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy111118 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                    currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap111111112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier111111112 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM220borderxT4_qwU15);
                    constructor8 = companion8.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor8);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    e eVarG11110 = p035i0.a.g(companion8, composerM3407constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy111118, composerM3407constructorimpl8, currentCompositionLocalMap111111112);
                    if (composerM3407constructorimpl8.getInserting()) {
                        mutableState3 = mutableState13;
                        if (!o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier111111112, companion8.getSetModifier());
                        Modifier modifierBackground$default119 = BackgroundKt.background$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(64)), RoundedCornerShapeKt.getCircleShape()), Brush.Companion.m3878linearGradientmHitzGk$default(companion, v.S(Color.m3917boximpl(j118), Color.m3917boximpl(ColorKt.Color(4281652121L))), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy111119 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                        currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap111111113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier111111113 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default119);
                        constructor9 = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor9);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl9 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy111119, composerM3407constructorimpl9, currentCompositionLocalMap111111113);
                        if (composerM3407constructorimpl9.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier111111113, companion8.getSetModifier());
                        IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), "Success", SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(36)), companion2.m3964getWhite0d7_KjU(), composerStartRestartGroup, 3504, 0);
                        b.r(composerStartRestartGroup, f5, companion6, composerStartRestartGroup, 6);
                        TextStyle headlineSmall119 = materialTheme.getTypography(composerStartRestartGroup, i10).getHeadlineSmall();
                        TextKt.m2432Text4IGK_g("PDF Saved Successfully!", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, headlineSmall119.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineSmall119.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? headlineSmall119.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineSmall119.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? headlineSmall119.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineSmall119.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineSmall119.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineSmall119.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineSmall119.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineSmall119.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineSmall119.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineSmall119.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineSmall119.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineSmall119.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineSmall119.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineSmall119.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineSmall119.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineSmall119.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineSmall119.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineSmall119.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineSmall119.platformStyle : null, (16645977 & 1048576) != 0 ? headlineSmall119.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineSmall119.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineSmall119.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineSmall119.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 390, 0, 65018);
                        b.m(28, companion6, composerStartRestartGroup, 6);
                        mutableState4 = mutableState3;
                        p097w3.j.a(PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(20), 7, null), 0L, Color.m3926copywmQWz5c$default(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-446322778, true, new S8(context, mutableState4, mutableState9), composerStartRestartGroup, 54), composerStartRestartGroup, 196998, 26);
                        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f114)), composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceGroup(1551057536);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                            objRememberedValue5 = new C2527j7(mutableState5, mutableState9, mutableState4, mutableState2, 3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        ButtonKt.TextButton((a) objRememberedValue5, null, false, null, null, null, null, null, null, C1.f13832d, composerStartRestartGroup, 805306374, 510);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceGroup();
                        state4 = stateAnimateFloat;
                    } else {
                        mutableState3 = mutableState13;
                    }
                    p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG11110);
                    Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier111111112, companion8.getSetModifier());
                    Modifier modifierBackground$default1110 = BackgroundKt.background$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(64)), RoundedCornerShapeKt.getCircleShape()), Brush.Companion.m3878linearGradientmHitzGk$default(companion, v.S(Color.m3917boximpl(j118), Color.m3917boximpl(ColorKt.Color(4281652121L))), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy1111110 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                    currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap111111114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier111111114 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default1110);
                    constructor9 = companion8.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor9);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl9 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy1111110, composerM3407constructorimpl9, currentCompositionLocalMap111111114);
                    if (composerM3407constructorimpl9.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier111111114, companion8.getSetModifier());
                    IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), "Success", SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(36)), companion2.m3964getWhite0d7_KjU(), composerStartRestartGroup, 3504, 0);
                    b.r(composerStartRestartGroup, f5, companion6, composerStartRestartGroup, 6);
                    TextStyle headlineSmall1110 = materialTheme.getTypography(composerStartRestartGroup, i10).getHeadlineSmall();
                    TextKt.m2432Text4IGK_g("PDF Saved Successfully!", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, headlineSmall1110.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineSmall1110.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? headlineSmall1110.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineSmall1110.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? headlineSmall1110.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineSmall1110.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineSmall1110.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineSmall1110.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineSmall1110.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineSmall1110.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineSmall1110.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineSmall1110.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineSmall1110.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineSmall1110.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineSmall1110.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineSmall1110.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineSmall1110.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineSmall1110.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineSmall1110.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineSmall1110.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineSmall1110.platformStyle : null, (16645977 & 1048576) != 0 ? headlineSmall1110.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineSmall1110.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineSmall1110.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineSmall1110.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 390, 0, 65018);
                    b.m(28, companion6, composerStartRestartGroup, 6);
                    mutableState4 = mutableState3;
                    p097w3.j.a(PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(20), 7, null), 0L, Color.m3926copywmQWz5c$default(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-446322778, true, new S8(context, mutableState4, mutableState9), composerStartRestartGroup, 54), composerStartRestartGroup, 196998, 26);
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f114)), composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceGroup(1551057536);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                        objRememberedValue5 = new C2527j7(mutableState5, mutableState9, mutableState4, mutableState2, 3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ButtonKt.TextButton((a) objRememberedValue5, null, false, null, null, null, null, null, null, C1.f13832d, composerStartRestartGroup, 805306374, 510);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                    state4 = stateAnimateFloat;
                } else {
                    mutableState2 = mutableState14;
                }
                p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG1119);
                Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier1124, companion8.getSetModifier());
                float f115 = 32;
                b.m(f115, companion6, composerStartRestartGroup, 6);
                Modifier modifierClip16 = ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(96)), RoundedCornerShapeKt.getCircleShape());
                long j119 = p107y3.a.f15984i;
                Modifier modifierM220borderxT4_qwU16 = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(modifierClip16, Color.m3926copywmQWz5c$default(j119, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f8), Color.m3926copywmQWz5c$default(j119, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy1111111 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap111111115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier111111115 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM220borderxT4_qwU16);
                constructor8 = companion8.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor8);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                e eVarG11111 = p035i0.a.g(companion8, composerM3407constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy1111111, composerM3407constructorimpl8, currentCompositionLocalMap111111115);
                if (composerM3407constructorimpl8.getInserting()) {
                    mutableState3 = mutableState13;
                    if (!o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier111111115, companion8.getSetModifier());
                    Modifier modifierBackground$default1111 = BackgroundKt.background$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(64)), RoundedCornerShapeKt.getCircleShape()), Brush.Companion.m3878linearGradientmHitzGk$default(companion, v.S(Color.m3917boximpl(j119), Color.m3917boximpl(ColorKt.Color(4281652121L))), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy1111112 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                    currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap111111116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier111111116 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default1111);
                    constructor9 = companion8.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor9);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl9 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy1111112, composerM3407constructorimpl9, currentCompositionLocalMap111111116);
                    if (composerM3407constructorimpl9.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier111111116, companion8.getSetModifier());
                    IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), "Success", SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(36)), companion2.m3964getWhite0d7_KjU(), composerStartRestartGroup, 3504, 0);
                    b.r(composerStartRestartGroup, f5, companion6, composerStartRestartGroup, 6);
                    TextStyle headlineSmall1111 = materialTheme.getTypography(composerStartRestartGroup, i10).getHeadlineSmall();
                    TextKt.m2432Text4IGK_g("PDF Saved Successfully!", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, headlineSmall1111.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineSmall1111.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? headlineSmall1111.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineSmall1111.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? headlineSmall1111.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineSmall1111.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineSmall1111.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineSmall1111.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineSmall1111.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineSmall1111.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineSmall1111.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineSmall1111.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineSmall1111.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineSmall1111.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineSmall1111.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineSmall1111.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineSmall1111.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineSmall1111.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineSmall1111.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineSmall1111.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineSmall1111.platformStyle : null, (16645977 & 1048576) != 0 ? headlineSmall1111.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineSmall1111.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineSmall1111.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineSmall1111.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 390, 0, 65018);
                    b.m(28, companion6, composerStartRestartGroup, 6);
                    mutableState4 = mutableState3;
                    p097w3.j.a(PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(20), 7, null), 0L, Color.m3926copywmQWz5c$default(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-446322778, true, new S8(context, mutableState4, mutableState9), composerStartRestartGroup, 54), composerStartRestartGroup, 196998, 26);
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f115)), composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceGroup(1551057536);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                        objRememberedValue5 = new C2527j7(mutableState5, mutableState9, mutableState4, mutableState2, 3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ButtonKt.TextButton((a) objRememberedValue5, null, false, null, null, null, null, null, null, C1.f13832d, composerStartRestartGroup, 805306374, 510);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                    state4 = stateAnimateFloat;
                } else {
                    mutableState3 = mutableState13;
                }
                p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG11111);
                Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier111111115, companion8.getSetModifier());
                Modifier modifierBackground$default1112 = BackgroundKt.background$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(64)), RoundedCornerShapeKt.getCircleShape()), Brush.Companion.m3878linearGradientmHitzGk$default(companion, v.S(Color.m3917boximpl(j119), Color.m3917boximpl(ColorKt.Color(4281652121L))), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy1111113 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap111111117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier111111117 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default1112);
                constructor9 = companion8.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor9);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3407constructorimpl9 = Updater.m3407constructorimpl(composerStartRestartGroup);
                eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy1111113, composerM3407constructorimpl9, currentCompositionLocalMap111111117);
                if (composerM3407constructorimpl9.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                } else {
                    p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG4);
                }
                Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier111111117, companion8.getSetModifier());
                IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), "Success", SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(36)), companion2.m3964getWhite0d7_KjU(), composerStartRestartGroup, 3504, 0);
                b.r(composerStartRestartGroup, f5, companion6, composerStartRestartGroup, 6);
                TextStyle headlineSmall1112 = materialTheme.getTypography(composerStartRestartGroup, i10).getHeadlineSmall();
                TextKt.m2432Text4IGK_g("PDF Saved Successfully!", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, headlineSmall1112.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineSmall1112.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? headlineSmall1112.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineSmall1112.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? headlineSmall1112.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineSmall1112.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineSmall1112.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineSmall1112.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineSmall1112.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineSmall1112.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineSmall1112.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineSmall1112.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineSmall1112.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineSmall1112.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineSmall1112.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineSmall1112.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineSmall1112.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineSmall1112.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineSmall1112.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineSmall1112.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineSmall1112.platformStyle : null, (16645977 & 1048576) != 0 ? headlineSmall1112.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineSmall1112.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineSmall1112.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineSmall1112.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 390, 0, 65018);
                b.m(28, companion6, composerStartRestartGroup, 6);
                mutableState4 = mutableState3;
                p097w3.j.a(PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(20), 7, null), 0L, Color.m3926copywmQWz5c$default(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-446322778, true, new S8(context, mutableState4, mutableState9), composerStartRestartGroup, 54), composerStartRestartGroup, 196998, 26);
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f115)), composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceGroup(1551057536);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                    objRememberedValue5 = new C2527j7(mutableState5, mutableState9, mutableState4, mutableState2, 3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                ButtonKt.TextButton((a) objRememberedValue5, null, false, null, null, null, null, null, null, C1.f13832d, composerStartRestartGroup, 805306374, 510);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
                state4 = stateAnimateFloat;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1242473187);
                if (((Uri) mutableState5.getValue()) == null) {
                    composerStartRestartGroup.startReplaceGroup(-1242989399);
                    Modifier modifierVerticalScroll$default16 = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy1112 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion7.getCenterHorizontally(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap111111118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier111111118 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default16);
                    constructor5 = companion8.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor5);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl5 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    eVarG2 = p035i0.a.g(companion8, composerM3407constructorimpl5, measurePolicyColumnMeasurePolicy1112, composerM3407constructorimpl5, currentCompositionLocalMap111111118);
                    if (composerM3407constructorimpl5.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier111111118, companion8.getSetModifier());
                    Modifier modifierM699height3ABfNKs8 = SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), Dp.m6403constructorimpl(280));
                    long jM3926copywmQWz5c$default8 = Color.m3926copywmQWz5c$default(j5, stateAnimateFloat2.getValue().floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                    composerStartRestartGroup.startReplaceGroup(1551090884);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(lVarV);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2) {
                        objRememberedValue3 = new P5(lVarV, 14);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new P5(lVarV, 14);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    p097w3.j.a(modifierM699height3ABfNKs8, 0L, jM3926copywmQWz5c$default8, 0.0f, (a) objRememberedValue3, ComposableLambdaKt.rememberComposableLambda(201211522, true, new T8(lVarV, stateAnimateFloat2, stateAnimateFloat), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 10);
                    b.m(f5, companion6, composerStartRestartGroup, 6);
                    TextStyle titleMedium8 = materialTheme.getTypography(composerStartRestartGroup, i10).getTitleMedium();
                    TextKt.m2432Text4IGK_g("How it works", PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(12), 7, null), j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, titleMedium8.m5917copyp1EtxEg((16645977 & 1) != 0 ? titleMedium8.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? titleMedium8.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? titleMedium8.spanStyle.getFontWeight() : companion3.getBold(), (16645977 & 8) != 0 ? titleMedium8.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? titleMedium8.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? titleMedium8.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? titleMedium8.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? titleMedium8.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? titleMedium8.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? titleMedium8.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? titleMedium8.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? titleMedium8.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? titleMedium8.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? titleMedium8.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? titleMedium8.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? titleMedium8.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? titleMedium8.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? titleMedium8.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? titleMedium8.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? titleMedium8.platformStyle : null, (16645977 & 1048576) != 0 ? titleMedium8.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? titleMedium8.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? titleMedium8.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? titleMedium8.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 438, 0, 65528);
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_1119 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(10));
                    Modifier modifierFillMaxWidth$default15 = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy1113 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_1119, companion7.getStart(), composerStartRestartGroup, 6);
                    currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap111111119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier111111119 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default15);
                    constructor6 = companion8.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor6);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    eVarG3 = p035i0.a.g(companion8, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy1113, composerM3407constructorimpl6, currentCompositionLocalMap111111119);
                    if (composerM3407constructorimpl6.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier111111119, companion8.getSetModifier());
                    Icons.Outlined outlined8 = Icons.Outlined.INSTANCE;
                    b("01", DescriptionKt.getDescription(outlined8), "Import PDF Document", "Choose the PDF file you want to organize from your device storage.", composerStartRestartGroup, 3462);
                    b("02", GridViewKt.getGridView(outlined8), "Reorder & Rotate Pages", "Drag pages or use Move Up/Down, Rotate 90°, Duplicate or Delete options on each page.", composerStartRestartGroup, 3462);
                    b("03", SaveKt.getSave(outlined8), "Save New Document", "Confirm changes and click 'Save PDF' to generate the optimized, updated file.", composerStartRestartGroup, 3462);
                    composerStartRestartGroup.endNode();
                    b.m(20, companion6, composerStartRestartGroup, 6);
                    Modifier modifierFillMaxWidth$default16 = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
                    long j1110 = p107y3.a.f15984i;
                    p097w3.j.a(modifierFillMaxWidth$default16, Color.m3926copywmQWz5c$default(j1110, 0.03f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(j1110, 0.15f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, C1.e, composerStartRestartGroup, 197046, 24);
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f6)), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                    state4 = stateAnimateFloat;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1233398898);
                    Modifier modifierFillMaxSize$default115 = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy1114 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion7.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap1111122 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier1111122 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default115);
                    constructor3 = companion8.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl3 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    e eVarG11112 = p035i0.a.g(companion8, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy1114, composerM3407constructorimpl3, currentCompositionLocalMap1111122);
                    if (composerM3407constructorimpl3.getInserting()) {
                        state3 = stateAnimateFloat;
                        if (!o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier1111122, companion8.getSetModifier());
                        if (i13 > 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z4, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-486966906, true, new V8(i13, mutableState9, mutableState13, mutableState14), composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
                        if (i13 == 0) {
                            f9 = 0.0f;
                            i11 = 3;
                            z5 = true;
                        } else {
                            f9 = 0.0f;
                            i11 = 3;
                            z5 = false;
                        }
                        AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z5, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, f9, i11, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-1332655761, true, new X8(mutableState6, mutableState8, mutableState7, mutableState5), composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
                        state4 = state3;
                        Modifier modifierWeight$default15 = ColumnScope.weight$default(columnScopeInstance, companion6, 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy1111114 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
                        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap1111111110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier1111111110 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default15);
                        constructor4 = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor4);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl4 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG = p035i0.a.g(companion8, composerM3407constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy1111114, composerM3407constructorimpl4, currentCompositionLocalMap1111111110);
                        if (composerM3407constructorimpl4.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier1111111110, companion8.getSetModifier());
                        GridCells.Fixed fixed15 = new GridCells.Fixed(3);
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_11110 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(f7));
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_11111 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(12));
                        Modifier modifierFillMaxSize$default116 = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceGroup(1425236413);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion4 = Composer.Companion;
                        if (objRememberedValue == companion4.getEmpty()) {
                            objRememberedValue = new F(8, mutableState9, mutableState14, mutableState13);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        LazyGridDslKt.LazyVerticalGrid(fixed15, modifierFillMaxSize$default116, null, null, false, horizontalOrVerticalM548spacedBy0680j_11111, horizontalOrVerticalM548spacedBy0680j_11110, null, false, (c) objRememberedValue, composerStartRestartGroup, 807075888, 412);
                        b.n(composerStartRestartGroup, f6, companion6, composerStartRestartGroup, 6);
                        str = (String) mutableState14.getValue();
                        composerStartRestartGroup.startReplaceGroup(1551965696);
                        if (str != null) {
                            long jColor15 = ColorKt.Color(4293870660L);
                            TextStyle bodyMedium15 = materialTheme.getTypography(composerStartRestartGroup, i10).getBodyMedium();
                            TextKt.m2432Text4IGK_g(str, PaddingKt.m672paddingqDBjuR0$default(companion6, 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f7), 7, null), jColor15, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, bodyMedium15.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium15.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodyMedium15.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium15.spanStyle.getFontWeight() : companion3.getSemiBold(), (16645977 & 8) != 0 ? bodyMedium15.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium15.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium15.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium15.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium15.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium15.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium15.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium15.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium15.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium15.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium15.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium15.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium15.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium15.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium15.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium15.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium15.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium15.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium15.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium15.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium15.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 432, 0, 65016);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1551985192);
                        zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance) {
                            objRememberedValue2 = new C2382a6(context, coroutineScope, mutableState5, mutableState9, mutableState10, mutableState, mutableState14, mutableState13, mutableState12, mutableState6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new C2382a6(context, coroutineScope, mutableState5, mutableState9, mutableState10, mutableState, mutableState14, mutableState13, mutableState12, mutableState6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        q.a("Save Organized PDF", (a) objRememberedValue2, SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), null, false, false, composerStartRestartGroup, 390, 56);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        state3 = stateAnimateFloat;
                    }
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG11112);
                    Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier1111122, companion8.getSetModifier());
                    if (i13 > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z4, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-486966906, true, new V8(i13, mutableState9, mutableState13, mutableState14), composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
                    if (i13 == 0) {
                        f9 = 0.0f;
                        i11 = 3;
                        z5 = true;
                    } else {
                        f9 = 0.0f;
                        i11 = 3;
                        z5 = false;
                    }
                    AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z5, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, f9, i11, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-1332655761, true, new X8(mutableState6, mutableState8, mutableState7, mutableState5), composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
                    state4 = state3;
                    Modifier modifierWeight$default16 = ColumnScope.weight$default(columnScopeInstance, companion6, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy1111115 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap1111111111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier1111111111 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default16);
                    constructor4 = companion8.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor4);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl4 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    eVarG = p035i0.a.g(companion8, composerM3407constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy1111115, composerM3407constructorimpl4, currentCompositionLocalMap1111111111);
                    if (composerM3407constructorimpl4.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier1111111111, companion8.getSetModifier());
                    GridCells.Fixed fixed16 = new GridCells.Fixed(3);
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_11112 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(f7));
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_11113 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(12));
                    Modifier modifierFillMaxSize$default117 = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceGroup(1425236413);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion4 = Composer.Companion;
                    if (objRememberedValue == companion4.getEmpty()) {
                        objRememberedValue = new F(8, mutableState9, mutableState14, mutableState13);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    LazyGridDslKt.LazyVerticalGrid(fixed16, modifierFillMaxSize$default117, null, null, false, horizontalOrVerticalM548spacedBy0680j_11113, horizontalOrVerticalM548spacedBy0680j_11112, null, false, (c) objRememberedValue, composerStartRestartGroup, 807075888, 412);
                    b.n(composerStartRestartGroup, f6, companion6, composerStartRestartGroup, 6);
                    str = (String) mutableState14.getValue();
                    composerStartRestartGroup.startReplaceGroup(1551965696);
                    if (str != null) {
                        long jColor16 = ColorKt.Color(4293870660L);
                        TextStyle bodyMedium16 = materialTheme.getTypography(composerStartRestartGroup, i10).getBodyMedium();
                        TextKt.m2432Text4IGK_g(str, PaddingKt.m672paddingqDBjuR0$default(companion6, 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f7), 7, null), jColor16, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, bodyMedium16.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium16.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodyMedium16.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium16.spanStyle.getFontWeight() : companion3.getSemiBold(), (16645977 & 8) != 0 ? bodyMedium16.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium16.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium16.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium16.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium16.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium16.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium16.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium16.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium16.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium16.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium16.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium16.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium16.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium16.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium16.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium16.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium16.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium16.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium16.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium16.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium16.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 432, 0, 65016);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1551985192);
                    zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance) {
                        objRememberedValue2 = new C2382a6(context, coroutineScope, mutableState5, mutableState9, mutableState10, mutableState, mutableState14, mutableState13, mutableState12, mutableState6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new C2382a6(context, coroutineScope, mutableState5, mutableState9, mutableState10, mutableState, mutableState14, mutableState13, mutableState12, mutableState6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    q.a("Save Organized PDF", (a) objRememberedValue2, SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), null, false, false, composerStartRestartGroup, 390, 56);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.startReplaceGroup(442168952);
            if (((Boolean) mutableState10.getValue()).booleanValue()) {
                DialogProperties dialogProperties8 = new DialogProperties(false, false, false, 4, (AbstractC2168g) null);
                Modifier modifierFillMaxWidth8 = SizeKt.fillMaxWidth(companion6, 0.85f);
                composerStartRestartGroup.startReplaceGroup(442166902);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                    objRememberedValue4 = new f(4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                n.a((a) objRememberedValue4, modifierFillMaxWidth8, 0L, dialogProperties8, ComposableLambdaKt.rememberComposableLambda(1529991554, true, new C2401b9(state4, state2, mutableState, mutableState12), composerStartRestartGroup, 54), composerStartRestartGroup, 27702, 4);
            }
            if (p035i0.a.z(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new J5(i5, z3, 6, onBack));
        }
    }

    public static final void b(String str, ImageVector imageVector, String str2, String str3, Composer composer, int i5) {
        int i6;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1071447598);
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
                ComposerKt.traceEventStart(-1071447598, i6, -1, "com.notescrafter.ui.screens.PdfOrganizeStepItem (PdfOrganizeScreen.kt:1236)");
            }
            composer2 = composerStartRestartGroup;
            p097w3.j.a(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-850729353, true, new C2529j9(imageVector, str, str3, str2), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new K5(str, imageVector, str2, str3, i5, 6));
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

    public static final void d(MutableState mutableState, boolean z3) {
        mutableState.setValue(Boolean.valueOf(z3));
    }
}
