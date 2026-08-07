package p097w3;

import O3.a;
import O3.e;
import O3.f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j {
    /* JADX WARN: Code duplicated, block: B:103:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:107:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00de  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:83:0x0118  */
    /* JADX WARN: Code duplicated, block: B:86:0x013e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0179  */
    /* JADX WARN: Code duplicated, block: B:92:0x0185  */
    /* JADX WARN: Code duplicated, block: B:93:0x0189  */
    /* JADX WARN: Code duplicated, block: B:96:0x019a  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ab  */
    public static final void a(final Modifier modifier, long j5, long j6, float f5, a aVar, final f content, Composer composer, final int i5, final int i6) {
        int i7;
        long j7;
        int i8;
        long j8;
        int i9;
        int i10;
        float f6;
        int i11;
        int i12;
        a aVar2;
        int i13;
        float fM6403constructorimpl;
        RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_4;
        Modifier modifierM3585shadows4CzXII$default;
        Modifier modifierM220borderxT4_qwU;
        Composer composer2;
        int currentCompositeKeyHash;
        a constructor;
        Composer composerM3407constructorimpl;
        long j9;
        final float f7;
        final a aVar3;
        final long j10;
        final long j11;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i14;
        o.f(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(844425280);
        if ((i5 & 6) == 0) {
            i7 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        int i15 = i6 & 2;
        if (i15 == 0) {
            if ((i5 & 48) == 0) {
                j7 = j5;
                i7 |= composerStartRestartGroup.changed(j7) ? 32 : 16;
            }
            i8 = i6 & 4;
            if (i8 != 0) {
                if ((i5 & 384) == 0) {
                    j8 = j6;
                    if (composerStartRestartGroup.changed(j8)) {
                        i9 = Fields.RotationX;
                    } else {
                        i9 = Fields.SpotShadowColor;
                    }
                    i7 |= i9;
                }
                i10 = i6 & 8;
                if (i10 != 0) {
                    if ((i5 & 3072) == 0) {
                        f6 = f5;
                        if (composerStartRestartGroup.changed(f6)) {
                            i11 = Fields.CameraDistance;
                        } else {
                            i11 = Fields.RotationZ;
                        }
                        i7 |= i11;
                    }
                    i12 = i6 & 16;
                    if (i12 != 0) {
                        if ((i5 & 24576) == 0) {
                            aVar2 = aVar;
                            if (composerStartRestartGroup.changedInstance(aVar2)) {
                                i13 = Fields.Clip;
                            } else {
                                i13 = Fields.Shape;
                            }
                            i7 |= i13;
                        }
                        if ((i5 & 196608) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i14 = Fields.RenderEffect;
                            } else {
                                i14 = 65536;
                            }
                            i7 |= i14;
                        }
                        if ((i7 & 74899) == 74898 || !composerStartRestartGroup.getSkipping()) {
                            if (i15 != 0) {
                                j7 = p107y3.a.u;
                            }
                            if (i8 != 0) {
                                j8 = p107y3.a.t;
                            }
                            if (i10 != 0) {
                                fM6403constructorimpl = Dp.m6403constructorimpl(0);
                            } else {
                                fM6403constructorimpl = f6;
                            }
                            if (i12 != 0) {
                                aVar2 = null;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(844425280, i7, -1, "com.notescrafter.ui.components.GlassCard (GlassCard.kt:26)");
                            }
                            roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(16));
                            if (Dp.m6402compareTo0680j_4(fM6403constructorimpl, Dp.m6403constructorimpl(0)) > 0) {
                                Color.Companion companion = Color.Companion;
                                modifierM3585shadows4CzXII$default = ShadowKt.m3585shadows4CzXII$default(modifier, fM6403constructorimpl, roundedCornerShapeM955RoundedCornerShape0680j_4, false, companion.m3953getBlack0d7_KjU(), companion.m3953getBlack0d7_KjU(), 4, null);
                            } else {
                                modifierM3585shadows4CzXII$default = modifier;
                            }
                            modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(modifierM3585shadows4CzXII$default, roundedCornerShapeM955RoundedCornerShape0680j_4), j7, null, 2, null), Dp.m6403constructorimpl(1), j8, roundedCornerShapeM955RoundedCornerShape0680j_4);
                            if (aVar2 != null) {
                                modifierM220borderxT4_qwU = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU, false, null, null, aVar2, 7, null);
                            }
                            int i16 = (i7 >> 6) & 7168;
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                            composer2 = composerStartRestartGroup;
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM220borderxT4_qwU);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                            constructor = companion2.getConstructor();
                            if (composer2.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
                            e eVarG = p035i0.a.g(companion2, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
                            if (composerM3407constructorimpl.getInserting()) {
                                j9 = j8;
                            } else {
                                j9 = j8;
                                if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i16 >> 6) & 112) | 6));
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                long j12 = j7;
                                f7 = fM6403constructorimpl;
                                aVar3 = aVar2;
                                j10 = j12;
                                j11 = j9;
                            }
                            p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i16 >> 6) & 112) | 6));
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            long j13 = j7;
                            f7 = fM6403constructorimpl;
                            aVar3 = aVar2;
                            j10 = j13;
                            j11 = j9;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            j10 = j7;
                            f7 = f6;
                            aVar3 = aVar2;
                            j11 = j8;
                            composer2 = composerStartRestartGroup;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: w3.i
                                @Override // O3.e
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                                    f fVar = content;
                                    j.a(modifier, j10, j11, f7, aVar3, fVar, (Composer) obj, iUpdateChangedFlags, i6);
                                    return B3.o.f154a;
                                }
                            });
                        }
                    }
                    i7 |= 24576;
                    aVar2 = aVar;
                    if ((i5 & 196608) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i14 = Fields.RenderEffect;
                        } else {
                            i14 = 65536;
                        }
                        i7 |= i14;
                    }
                    if ((i7 & 74899) == 74898) {
                        if (i15 != 0) {
                            j7 = p107y3.a.u;
                        }
                        if (i8 != 0) {
                            j8 = p107y3.a.t;
                        }
                        if (i10 != 0) {
                            fM6403constructorimpl = Dp.m6403constructorimpl(0);
                        } else {
                            fM6403constructorimpl = f6;
                        }
                        if (i12 != 0) {
                            aVar2 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(844425280, i7, -1, "com.notescrafter.ui.components.GlassCard (GlassCard.kt:26)");
                        }
                        roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(16));
                        if (Dp.m6402compareTo0680j_4(fM6403constructorimpl, Dp.m6403constructorimpl(0)) > 0) {
                            Color.Companion companion3 = Color.Companion;
                            modifierM3585shadows4CzXII$default = ShadowKt.m3585shadows4CzXII$default(modifier, fM6403constructorimpl, roundedCornerShapeM955RoundedCornerShape0680j_4, false, companion3.m3953getBlack0d7_KjU(), companion3.m3953getBlack0d7_KjU(), 4, null);
                        } else {
                            modifierM3585shadows4CzXII$default = modifier;
                        }
                        modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(modifierM3585shadows4CzXII$default, roundedCornerShapeM955RoundedCornerShape0680j_4), j7, null, 2, null), Dp.m6403constructorimpl(1), j8, roundedCornerShapeM955RoundedCornerShape0680j_4);
                        if (aVar2 != null) {
                            modifierM220borderxT4_qwU = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU, false, null, null, aVar2, 7, null);
                        }
                        int i17 = (i7 >> 6) & 7168;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                        composer2 = composerStartRestartGroup;
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM220borderxT4_qwU);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                        constructor = companion4.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
                        e eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl, currentCompositionLocalMap2);
                        if (composerM3407constructorimpl.getInserting()) {
                            j9 = j8;
                            if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier2, companion4.getSetModifier());
                            content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i17 >> 6) & 112) | 6));
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            long j14 = j7;
                            f7 = fM6403constructorimpl;
                            aVar3 = aVar2;
                            j10 = j14;
                            j11 = j9;
                        } else {
                            j9 = j8;
                        }
                        p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG2);
                        Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier2, companion4.getSetModifier());
                        content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i17 >> 6) & 112) | 6));
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        long j15 = j7;
                        f7 = fM6403constructorimpl;
                        aVar3 = aVar2;
                        j10 = j15;
                        j11 = j9;
                    } else {
                        if (i15 != 0) {
                            j7 = p107y3.a.u;
                        }
                        if (i8 != 0) {
                            j8 = p107y3.a.t;
                        }
                        if (i10 != 0) {
                            fM6403constructorimpl = Dp.m6403constructorimpl(0);
                        } else {
                            fM6403constructorimpl = f6;
                        }
                        if (i12 != 0) {
                            aVar2 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(844425280, i7, -1, "com.notescrafter.ui.components.GlassCard (GlassCard.kt:26)");
                        }
                        roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(16));
                        if (Dp.m6402compareTo0680j_4(fM6403constructorimpl, Dp.m6403constructorimpl(0)) > 0) {
                            Color.Companion companion5 = Color.Companion;
                            modifierM3585shadows4CzXII$default = ShadowKt.m3585shadows4CzXII$default(modifier, fM6403constructorimpl, roundedCornerShapeM955RoundedCornerShape0680j_4, false, companion5.m3953getBlack0d7_KjU(), companion5.m3953getBlack0d7_KjU(), 4, null);
                        } else {
                            modifierM3585shadows4CzXII$default = modifier;
                        }
                        modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(modifierM3585shadows4CzXII$default, roundedCornerShapeM955RoundedCornerShape0680j_4), j7, null, 2, null), Dp.m6403constructorimpl(1), j8, roundedCornerShapeM955RoundedCornerShape0680j_4);
                        if (aVar2 != null) {
                            modifierM220borderxT4_qwU = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU, false, null, null, aVar2, 7, null);
                        }
                        int i18 = (i7 >> 6) & 7168;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                        composer2 = composerStartRestartGroup;
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierM220borderxT4_qwU);
                        ComposeUiNode.Companion companion6 = ComposeUiNode.Companion;
                        constructor = companion6.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
                        e eVarG3 = p035i0.a.g(companion6, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3407constructorimpl, currentCompositionLocalMap3);
                        if (composerM3407constructorimpl.getInserting()) {
                            j9 = j8;
                            if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier3, companion6.getSetModifier());
                            content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i18 >> 6) & 112) | 6));
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            long j16 = j7;
                            f7 = fM6403constructorimpl;
                            aVar3 = aVar2;
                            j10 = j16;
                            j11 = j9;
                        } else {
                            j9 = j8;
                        }
                        p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG3);
                        Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier3, companion6.getSetModifier());
                        content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i18 >> 6) & 112) | 6));
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        long j17 = j7;
                        f7 = fM6403constructorimpl;
                        aVar3 = aVar2;
                        j10 = j17;
                        j11 = j9;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: w3.i
                            @Override // O3.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                                f fVar = content;
                                j.a(modifier, j10, j11, f7, aVar3, fVar, (Composer) obj, iUpdateChangedFlags, i6);
                                return B3.o.f154a;
                            }
                        });
                    }
                }
                i7 |= 3072;
                f6 = f5;
                i12 = i6 & 16;
                if (i12 != 0) {
                    if ((i5 & 24576) == 0) {
                        aVar2 = aVar;
                        if (composerStartRestartGroup.changedInstance(aVar2)) {
                            i13 = Fields.Clip;
                        } else {
                            i13 = Fields.Shape;
                        }
                        i7 |= i13;
                    }
                    if ((i5 & 196608) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i14 = Fields.RenderEffect;
                        } else {
                            i14 = 65536;
                        }
                        i7 |= i14;
                    }
                    if ((i7 & 74899) == 74898) {
                        if (i15 != 0) {
                            j7 = p107y3.a.u;
                        }
                        if (i8 != 0) {
                            j8 = p107y3.a.t;
                        }
                        if (i10 != 0) {
                            fM6403constructorimpl = Dp.m6403constructorimpl(0);
                        } else {
                            fM6403constructorimpl = f6;
                        }
                        if (i12 != 0) {
                            aVar2 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(844425280, i7, -1, "com.notescrafter.ui.components.GlassCard (GlassCard.kt:26)");
                        }
                        roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(16));
                        if (Dp.m6402compareTo0680j_4(fM6403constructorimpl, Dp.m6403constructorimpl(0)) > 0) {
                            Color.Companion companion7 = Color.Companion;
                            modifierM3585shadows4CzXII$default = ShadowKt.m3585shadows4CzXII$default(modifier, fM6403constructorimpl, roundedCornerShapeM955RoundedCornerShape0680j_4, false, companion7.m3953getBlack0d7_KjU(), companion7.m3953getBlack0d7_KjU(), 4, null);
                        } else {
                            modifierM3585shadows4CzXII$default = modifier;
                        }
                        modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(modifierM3585shadows4CzXII$default, roundedCornerShapeM955RoundedCornerShape0680j_4), j7, null, 2, null), Dp.m6403constructorimpl(1), j8, roundedCornerShapeM955RoundedCornerShape0680j_4);
                        if (aVar2 != null) {
                            modifierM220borderxT4_qwU = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU, false, null, null, aVar2, 7, null);
                        }
                        int i19 = (i7 >> 6) & 7168;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                        composer2 = composerStartRestartGroup;
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierM220borderxT4_qwU);
                        ComposeUiNode.Companion companion8 = ComposeUiNode.Companion;
                        constructor = companion8.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
                        e eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM3407constructorimpl, currentCompositionLocalMap4);
                        if (composerM3407constructorimpl.getInserting()) {
                            j9 = j8;
                            if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier4, companion8.getSetModifier());
                            content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i19 >> 6) & 112) | 6));
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            long j18 = j7;
                            f7 = fM6403constructorimpl;
                            aVar3 = aVar2;
                            j10 = j18;
                            j11 = j9;
                        } else {
                            j9 = j8;
                        }
                        p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG4);
                        Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier4, companion8.getSetModifier());
                        content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i19 >> 6) & 112) | 6));
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        long j19 = j7;
                        f7 = fM6403constructorimpl;
                        aVar3 = aVar2;
                        j10 = j19;
                        j11 = j9;
                    } else {
                        if (i15 != 0) {
                            j7 = p107y3.a.u;
                        }
                        if (i8 != 0) {
                            j8 = p107y3.a.t;
                        }
                        if (i10 != 0) {
                            fM6403constructorimpl = Dp.m6403constructorimpl(0);
                        } else {
                            fM6403constructorimpl = f6;
                        }
                        if (i12 != 0) {
                            aVar2 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(844425280, i7, -1, "com.notescrafter.ui.components.GlassCard (GlassCard.kt:26)");
                        }
                        roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(16));
                        if (Dp.m6402compareTo0680j_4(fM6403constructorimpl, Dp.m6403constructorimpl(0)) > 0) {
                            Color.Companion companion9 = Color.Companion;
                            modifierM3585shadows4CzXII$default = ShadowKt.m3585shadows4CzXII$default(modifier, fM6403constructorimpl, roundedCornerShapeM955RoundedCornerShape0680j_4, false, companion9.m3953getBlack0d7_KjU(), companion9.m3953getBlack0d7_KjU(), 4, null);
                        } else {
                            modifierM3585shadows4CzXII$default = modifier;
                        }
                        modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(modifierM3585shadows4CzXII$default, roundedCornerShapeM955RoundedCornerShape0680j_4), j7, null, 2, null), Dp.m6403constructorimpl(1), j8, roundedCornerShapeM955RoundedCornerShape0680j_4);
                        if (aVar2 != null) {
                            modifierM220borderxT4_qwU = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU, false, null, null, aVar2, 7, null);
                        }
                        int i110 = (i7 >> 6) & 7168;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                        composer2 = composerStartRestartGroup;
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifierM220borderxT4_qwU);
                        ComposeUiNode.Companion companion10 = ComposeUiNode.Companion;
                        constructor = companion10.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
                        e eVarG5 = p035i0.a.g(companion10, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy5, composerM3407constructorimpl, currentCompositionLocalMap5);
                        if (composerM3407constructorimpl.getInserting()) {
                            j9 = j8;
                            if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier5, companion10.getSetModifier());
                            content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i110 >> 6) & 112) | 6));
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            long j110 = j7;
                            f7 = fM6403constructorimpl;
                            aVar3 = aVar2;
                            j10 = j110;
                            j11 = j9;
                        } else {
                            j9 = j8;
                        }
                        p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG5);
                        Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier5, companion10.getSetModifier());
                        content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i110 >> 6) & 112) | 6));
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        long j111 = j7;
                        f7 = fM6403constructorimpl;
                        aVar3 = aVar2;
                        j10 = j111;
                        j11 = j9;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: w3.i
                            @Override // O3.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                                f fVar = content;
                                j.a(modifier, j10, j11, f7, aVar3, fVar, (Composer) obj, iUpdateChangedFlags, i6);
                                return B3.o.f154a;
                            }
                        });
                    }
                }
                i7 |= 24576;
                aVar2 = aVar;
                if ((i5 & 196608) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i14 = Fields.RenderEffect;
                    } else {
                        i14 = 65536;
                    }
                    i7 |= i14;
                }
                if ((i7 & 74899) == 74898) {
                    if (i15 != 0) {
                        j7 = p107y3.a.u;
                    }
                    if (i8 != 0) {
                        j8 = p107y3.a.t;
                    }
                    if (i10 != 0) {
                        fM6403constructorimpl = Dp.m6403constructorimpl(0);
                    } else {
                        fM6403constructorimpl = f6;
                    }
                    if (i12 != 0) {
                        aVar2 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(844425280, i7, -1, "com.notescrafter.ui.components.GlassCard (GlassCard.kt:26)");
                    }
                    roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(16));
                    if (Dp.m6402compareTo0680j_4(fM6403constructorimpl, Dp.m6403constructorimpl(0)) > 0) {
                        Color.Companion companion11 = Color.Companion;
                        modifierM3585shadows4CzXII$default = ShadowKt.m3585shadows4CzXII$default(modifier, fM6403constructorimpl, roundedCornerShapeM955RoundedCornerShape0680j_4, false, companion11.m3953getBlack0d7_KjU(), companion11.m3953getBlack0d7_KjU(), 4, null);
                    } else {
                        modifierM3585shadows4CzXII$default = modifier;
                    }
                    modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(modifierM3585shadows4CzXII$default, roundedCornerShapeM955RoundedCornerShape0680j_4), j7, null, 2, null), Dp.m6403constructorimpl(1), j8, roundedCornerShapeM955RoundedCornerShape0680j_4);
                    if (aVar2 != null) {
                        modifierM220borderxT4_qwU = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU, false, null, null, aVar2, 7, null);
                    }
                    int i111 = (i7 >> 6) & 7168;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                    composer2 = composerStartRestartGroup;
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer2, modifierM220borderxT4_qwU);
                    ComposeUiNode.Companion companion12 = ComposeUiNode.Companion;
                    constructor = companion12.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
                    e eVarG6 = p035i0.a.g(companion12, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy6, composerM3407constructorimpl, currentCompositionLocalMap6);
                    if (composerM3407constructorimpl.getInserting()) {
                        j9 = j8;
                        if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier6, companion12.getSetModifier());
                        content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i111 >> 6) & 112) | 6));
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        long j112 = j7;
                        f7 = fM6403constructorimpl;
                        aVar3 = aVar2;
                        j10 = j112;
                        j11 = j9;
                    } else {
                        j9 = j8;
                    }
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG6);
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier6, companion12.getSetModifier());
                    content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i111 >> 6) & 112) | 6));
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    long j113 = j7;
                    f7 = fM6403constructorimpl;
                    aVar3 = aVar2;
                    j10 = j113;
                    j11 = j9;
                } else {
                    if (i15 != 0) {
                        j7 = p107y3.a.u;
                    }
                    if (i8 != 0) {
                        j8 = p107y3.a.t;
                    }
                    if (i10 != 0) {
                        fM6403constructorimpl = Dp.m6403constructorimpl(0);
                    } else {
                        fM6403constructorimpl = f6;
                    }
                    if (i12 != 0) {
                        aVar2 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(844425280, i7, -1, "com.notescrafter.ui.components.GlassCard (GlassCard.kt:26)");
                    }
                    roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(16));
                    if (Dp.m6402compareTo0680j_4(fM6403constructorimpl, Dp.m6403constructorimpl(0)) > 0) {
                        Color.Companion companion13 = Color.Companion;
                        modifierM3585shadows4CzXII$default = ShadowKt.m3585shadows4CzXII$default(modifier, fM6403constructorimpl, roundedCornerShapeM955RoundedCornerShape0680j_4, false, companion13.m3953getBlack0d7_KjU(), companion13.m3953getBlack0d7_KjU(), 4, null);
                    } else {
                        modifierM3585shadows4CzXII$default = modifier;
                    }
                    modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(modifierM3585shadows4CzXII$default, roundedCornerShapeM955RoundedCornerShape0680j_4), j7, null, 2, null), Dp.m6403constructorimpl(1), j8, roundedCornerShapeM955RoundedCornerShape0680j_4);
                    if (aVar2 != null) {
                        modifierM220borderxT4_qwU = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU, false, null, null, aVar2, 7, null);
                    }
                    int i112 = (i7 >> 6) & 7168;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                    composer2 = composerStartRestartGroup;
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer2, modifierM220borderxT4_qwU);
                    ComposeUiNode.Companion companion14 = ComposeUiNode.Companion;
                    constructor = companion14.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
                    e eVarG7 = p035i0.a.g(companion14, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy7, composerM3407constructorimpl, currentCompositionLocalMap7);
                    if (composerM3407constructorimpl.getInserting()) {
                        j9 = j8;
                        if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier7, companion14.getSetModifier());
                        content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i112 >> 6) & 112) | 6));
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        long j114 = j7;
                        f7 = fM6403constructorimpl;
                        aVar3 = aVar2;
                        j10 = j114;
                        j11 = j9;
                    } else {
                        j9 = j8;
                    }
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG7);
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier7, companion14.getSetModifier());
                    content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i112 >> 6) & 112) | 6));
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    long j115 = j7;
                    f7 = fM6403constructorimpl;
                    aVar3 = aVar2;
                    j10 = j115;
                    j11 = j9;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: w3.i
                        @Override // O3.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                            f fVar = content;
                            j.a(modifier, j10, j11, f7, aVar3, fVar, (Composer) obj, iUpdateChangedFlags, i6);
                            return B3.o.f154a;
                        }
                    });
                }
            }
            i7 |= 384;
            j8 = j6;
            i10 = i6 & 8;
            if (i10 != 0) {
                if ((i5 & 3072) == 0) {
                    f6 = f5;
                    if (composerStartRestartGroup.changed(f6)) {
                        i11 = Fields.CameraDistance;
                    } else {
                        i11 = Fields.RotationZ;
                    }
                    i7 |= i11;
                }
                i12 = i6 & 16;
                if (i12 != 0) {
                    if ((i5 & 24576) == 0) {
                        aVar2 = aVar;
                        if (composerStartRestartGroup.changedInstance(aVar2)) {
                            i13 = Fields.Clip;
                        } else {
                            i13 = Fields.Shape;
                        }
                        i7 |= i13;
                    }
                    if ((i5 & 196608) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i14 = Fields.RenderEffect;
                        } else {
                            i14 = 65536;
                        }
                        i7 |= i14;
                    }
                    if ((i7 & 74899) == 74898) {
                        if (i15 != 0) {
                            j7 = p107y3.a.u;
                        }
                        if (i8 != 0) {
                            j8 = p107y3.a.t;
                        }
                        if (i10 != 0) {
                            fM6403constructorimpl = Dp.m6403constructorimpl(0);
                        } else {
                            fM6403constructorimpl = f6;
                        }
                        if (i12 != 0) {
                            aVar2 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(844425280, i7, -1, "com.notescrafter.ui.components.GlassCard (GlassCard.kt:26)");
                        }
                        roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(16));
                        if (Dp.m6402compareTo0680j_4(fM6403constructorimpl, Dp.m6403constructorimpl(0)) > 0) {
                            Color.Companion companion15 = Color.Companion;
                            modifierM3585shadows4CzXII$default = ShadowKt.m3585shadows4CzXII$default(modifier, fM6403constructorimpl, roundedCornerShapeM955RoundedCornerShape0680j_4, false, companion15.m3953getBlack0d7_KjU(), companion15.m3953getBlack0d7_KjU(), 4, null);
                        } else {
                            modifierM3585shadows4CzXII$default = modifier;
                        }
                        modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(modifierM3585shadows4CzXII$default, roundedCornerShapeM955RoundedCornerShape0680j_4), j7, null, 2, null), Dp.m6403constructorimpl(1), j8, roundedCornerShapeM955RoundedCornerShape0680j_4);
                        if (aVar2 != null) {
                            modifierM220borderxT4_qwU = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU, false, null, null, aVar2, 7, null);
                        }
                        int i113 = (i7 >> 6) & 7168;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy8 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                        composer2 = composerStartRestartGroup;
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap8 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer2, modifierM220borderxT4_qwU);
                        ComposeUiNode.Companion companion16 = ComposeUiNode.Companion;
                        constructor = companion16.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
                        e eVarG8 = p035i0.a.g(companion16, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy8, composerM3407constructorimpl, currentCompositionLocalMap8);
                        if (composerM3407constructorimpl.getInserting()) {
                            j9 = j8;
                            if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier8, companion16.getSetModifier());
                            content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i113 >> 6) & 112) | 6));
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            long j116 = j7;
                            f7 = fM6403constructorimpl;
                            aVar3 = aVar2;
                            j10 = j116;
                            j11 = j9;
                        } else {
                            j9 = j8;
                        }
                        p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG8);
                        Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier8, companion16.getSetModifier());
                        content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i113 >> 6) & 112) | 6));
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        long j117 = j7;
                        f7 = fM6403constructorimpl;
                        aVar3 = aVar2;
                        j10 = j117;
                        j11 = j9;
                    } else {
                        if (i15 != 0) {
                            j7 = p107y3.a.u;
                        }
                        if (i8 != 0) {
                            j8 = p107y3.a.t;
                        }
                        if (i10 != 0) {
                            fM6403constructorimpl = Dp.m6403constructorimpl(0);
                        } else {
                            fM6403constructorimpl = f6;
                        }
                        if (i12 != 0) {
                            aVar2 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(844425280, i7, -1, "com.notescrafter.ui.components.GlassCard (GlassCard.kt:26)");
                        }
                        roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(16));
                        if (Dp.m6402compareTo0680j_4(fM6403constructorimpl, Dp.m6403constructorimpl(0)) > 0) {
                            Color.Companion companion17 = Color.Companion;
                            modifierM3585shadows4CzXII$default = ShadowKt.m3585shadows4CzXII$default(modifier, fM6403constructorimpl, roundedCornerShapeM955RoundedCornerShape0680j_4, false, companion17.m3953getBlack0d7_KjU(), companion17.m3953getBlack0d7_KjU(), 4, null);
                        } else {
                            modifierM3585shadows4CzXII$default = modifier;
                        }
                        modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(modifierM3585shadows4CzXII$default, roundedCornerShapeM955RoundedCornerShape0680j_4), j7, null, 2, null), Dp.m6403constructorimpl(1), j8, roundedCornerShapeM955RoundedCornerShape0680j_4);
                        if (aVar2 != null) {
                            modifierM220borderxT4_qwU = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU, false, null, null, aVar2, 7, null);
                        }
                        int i114 = (i7 >> 6) & 7168;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy9 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                        composer2 = composerStartRestartGroup;
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap9 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer2, modifierM220borderxT4_qwU);
                        ComposeUiNode.Companion companion18 = ComposeUiNode.Companion;
                        constructor = companion18.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
                        e eVarG9 = p035i0.a.g(companion18, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy9, composerM3407constructorimpl, currentCompositionLocalMap9);
                        if (composerM3407constructorimpl.getInserting()) {
                            j9 = j8;
                            if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier9, companion18.getSetModifier());
                            content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i114 >> 6) & 112) | 6));
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            long j118 = j7;
                            f7 = fM6403constructorimpl;
                            aVar3 = aVar2;
                            j10 = j118;
                            j11 = j9;
                        } else {
                            j9 = j8;
                        }
                        p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG9);
                        Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier9, companion18.getSetModifier());
                        content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i114 >> 6) & 112) | 6));
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        long j119 = j7;
                        f7 = fM6403constructorimpl;
                        aVar3 = aVar2;
                        j10 = j119;
                        j11 = j9;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: w3.i
                            @Override // O3.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                                f fVar = content;
                                j.a(modifier, j10, j11, f7, aVar3, fVar, (Composer) obj, iUpdateChangedFlags, i6);
                                return B3.o.f154a;
                            }
                        });
                    }
                }
                i7 |= 24576;
                aVar2 = aVar;
                if ((i5 & 196608) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i14 = Fields.RenderEffect;
                    } else {
                        i14 = 65536;
                    }
                    i7 |= i14;
                }
                if ((i7 & 74899) == 74898) {
                    if (i15 != 0) {
                        j7 = p107y3.a.u;
                    }
                    if (i8 != 0) {
                        j8 = p107y3.a.t;
                    }
                    if (i10 != 0) {
                        fM6403constructorimpl = Dp.m6403constructorimpl(0);
                    } else {
                        fM6403constructorimpl = f6;
                    }
                    if (i12 != 0) {
                        aVar2 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(844425280, i7, -1, "com.notescrafter.ui.components.GlassCard (GlassCard.kt:26)");
                    }
                    roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(16));
                    if (Dp.m6402compareTo0680j_4(fM6403constructorimpl, Dp.m6403constructorimpl(0)) > 0) {
                        Color.Companion companion19 = Color.Companion;
                        modifierM3585shadows4CzXII$default = ShadowKt.m3585shadows4CzXII$default(modifier, fM6403constructorimpl, roundedCornerShapeM955RoundedCornerShape0680j_4, false, companion19.m3953getBlack0d7_KjU(), companion19.m3953getBlack0d7_KjU(), 4, null);
                    } else {
                        modifierM3585shadows4CzXII$default = modifier;
                    }
                    modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(modifierM3585shadows4CzXII$default, roundedCornerShapeM955RoundedCornerShape0680j_4), j7, null, 2, null), Dp.m6403constructorimpl(1), j8, roundedCornerShapeM955RoundedCornerShape0680j_4);
                    if (aVar2 != null) {
                        modifierM220borderxT4_qwU = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU, false, null, null, aVar2, 7, null);
                    }
                    int i115 = (i7 >> 6) & 7168;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy10 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                    composer2 = composerStartRestartGroup;
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap10 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer2, modifierM220borderxT4_qwU);
                    ComposeUiNode.Companion companion110 = ComposeUiNode.Companion;
                    constructor = companion110.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
                    e eVarG10 = p035i0.a.g(companion110, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy10, composerM3407constructorimpl, currentCompositionLocalMap10);
                    if (composerM3407constructorimpl.getInserting()) {
                        j9 = j8;
                        if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier10, companion110.getSetModifier());
                        content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i115 >> 6) & 112) | 6));
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        long j1110 = j7;
                        f7 = fM6403constructorimpl;
                        aVar3 = aVar2;
                        j10 = j1110;
                        j11 = j9;
                    } else {
                        j9 = j8;
                    }
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG10);
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier10, companion110.getSetModifier());
                    content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i115 >> 6) & 112) | 6));
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    long j1111 = j7;
                    f7 = fM6403constructorimpl;
                    aVar3 = aVar2;
                    j10 = j1111;
                    j11 = j9;
                } else {
                    if (i15 != 0) {
                        j7 = p107y3.a.u;
                    }
                    if (i8 != 0) {
                        j8 = p107y3.a.t;
                    }
                    if (i10 != 0) {
                        fM6403constructorimpl = Dp.m6403constructorimpl(0);
                    } else {
                        fM6403constructorimpl = f6;
                    }
                    if (i12 != 0) {
                        aVar2 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(844425280, i7, -1, "com.notescrafter.ui.components.GlassCard (GlassCard.kt:26)");
                    }
                    roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(16));
                    if (Dp.m6402compareTo0680j_4(fM6403constructorimpl, Dp.m6403constructorimpl(0)) > 0) {
                        Color.Companion companion111 = Color.Companion;
                        modifierM3585shadows4CzXII$default = ShadowKt.m3585shadows4CzXII$default(modifier, fM6403constructorimpl, roundedCornerShapeM955RoundedCornerShape0680j_4, false, companion111.m3953getBlack0d7_KjU(), companion111.m3953getBlack0d7_KjU(), 4, null);
                    } else {
                        modifierM3585shadows4CzXII$default = modifier;
                    }
                    modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(modifierM3585shadows4CzXII$default, roundedCornerShapeM955RoundedCornerShape0680j_4), j7, null, 2, null), Dp.m6403constructorimpl(1), j8, roundedCornerShapeM955RoundedCornerShape0680j_4);
                    if (aVar2 != null) {
                        modifierM220borderxT4_qwU = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU, false, null, null, aVar2, 7, null);
                    }
                    int i116 = (i7 >> 6) & 7168;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy11 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                    composer2 = composerStartRestartGroup;
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap11 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composer2, modifierM220borderxT4_qwU);
                    ComposeUiNode.Companion companion112 = ComposeUiNode.Companion;
                    constructor = companion112.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
                    e eVarG11 = p035i0.a.g(companion112, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy11, composerM3407constructorimpl, currentCompositionLocalMap11);
                    if (composerM3407constructorimpl.getInserting()) {
                        j9 = j8;
                        if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier11, companion112.getSetModifier());
                        content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i116 >> 6) & 112) | 6));
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        long j1112 = j7;
                        f7 = fM6403constructorimpl;
                        aVar3 = aVar2;
                        j10 = j1112;
                        j11 = j9;
                    } else {
                        j9 = j8;
                    }
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG11);
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier11, companion112.getSetModifier());
                    content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i116 >> 6) & 112) | 6));
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    long j1113 = j7;
                    f7 = fM6403constructorimpl;
                    aVar3 = aVar2;
                    j10 = j1113;
                    j11 = j9;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: w3.i
                        @Override // O3.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                            f fVar = content;
                            j.a(modifier, j10, j11, f7, aVar3, fVar, (Composer) obj, iUpdateChangedFlags, i6);
                            return B3.o.f154a;
                        }
                    });
                }
            }
            i7 |= 3072;
            f6 = f5;
            i12 = i6 & 16;
            if (i12 != 0) {
                if ((i5 & 24576) == 0) {
                    aVar2 = aVar;
                    if (composerStartRestartGroup.changedInstance(aVar2)) {
                        i13 = Fields.Clip;
                    } else {
                        i13 = Fields.Shape;
                    }
                    i7 |= i13;
                }
                if ((i5 & 196608) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i14 = Fields.RenderEffect;
                    } else {
                        i14 = 65536;
                    }
                    i7 |= i14;
                }
                if ((i7 & 74899) == 74898) {
                    if (i15 != 0) {
                        j7 = p107y3.a.u;
                    }
                    if (i8 != 0) {
                        j8 = p107y3.a.t;
                    }
                    if (i10 != 0) {
                        fM6403constructorimpl = Dp.m6403constructorimpl(0);
                    } else {
                        fM6403constructorimpl = f6;
                    }
                    if (i12 != 0) {
                        aVar2 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(844425280, i7, -1, "com.notescrafter.ui.components.GlassCard (GlassCard.kt:26)");
                    }
                    roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(16));
                    if (Dp.m6402compareTo0680j_4(fM6403constructorimpl, Dp.m6403constructorimpl(0)) > 0) {
                        Color.Companion companion113 = Color.Companion;
                        modifierM3585shadows4CzXII$default = ShadowKt.m3585shadows4CzXII$default(modifier, fM6403constructorimpl, roundedCornerShapeM955RoundedCornerShape0680j_4, false, companion113.m3953getBlack0d7_KjU(), companion113.m3953getBlack0d7_KjU(), 4, null);
                    } else {
                        modifierM3585shadows4CzXII$default = modifier;
                    }
                    modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(modifierM3585shadows4CzXII$default, roundedCornerShapeM955RoundedCornerShape0680j_4), j7, null, 2, null), Dp.m6403constructorimpl(1), j8, roundedCornerShapeM955RoundedCornerShape0680j_4);
                    if (aVar2 != null) {
                        modifierM220borderxT4_qwU = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU, false, null, null, aVar2, 7, null);
                    }
                    int i117 = (i7 >> 6) & 7168;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy12 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                    composer2 = composerStartRestartGroup;
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap12 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier12 = ComposedModifierKt.materializeModifier(composer2, modifierM220borderxT4_qwU);
                    ComposeUiNode.Companion companion114 = ComposeUiNode.Companion;
                    constructor = companion114.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
                    e eVarG12 = p035i0.a.g(companion114, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy12, composerM3407constructorimpl, currentCompositionLocalMap12);
                    if (composerM3407constructorimpl.getInserting()) {
                        j9 = j8;
                        if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier12, companion114.getSetModifier());
                        content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i117 >> 6) & 112) | 6));
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        long j1114 = j7;
                        f7 = fM6403constructorimpl;
                        aVar3 = aVar2;
                        j10 = j1114;
                        j11 = j9;
                    } else {
                        j9 = j8;
                    }
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG12);
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier12, companion114.getSetModifier());
                    content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i117 >> 6) & 112) | 6));
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    long j1115 = j7;
                    f7 = fM6403constructorimpl;
                    aVar3 = aVar2;
                    j10 = j1115;
                    j11 = j9;
                } else {
                    if (i15 != 0) {
                        j7 = p107y3.a.u;
                    }
                    if (i8 != 0) {
                        j8 = p107y3.a.t;
                    }
                    if (i10 != 0) {
                        fM6403constructorimpl = Dp.m6403constructorimpl(0);
                    } else {
                        fM6403constructorimpl = f6;
                    }
                    if (i12 != 0) {
                        aVar2 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(844425280, i7, -1, "com.notescrafter.ui.components.GlassCard (GlassCard.kt:26)");
                    }
                    roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(16));
                    if (Dp.m6402compareTo0680j_4(fM6403constructorimpl, Dp.m6403constructorimpl(0)) > 0) {
                        Color.Companion companion115 = Color.Companion;
                        modifierM3585shadows4CzXII$default = ShadowKt.m3585shadows4CzXII$default(modifier, fM6403constructorimpl, roundedCornerShapeM955RoundedCornerShape0680j_4, false, companion115.m3953getBlack0d7_KjU(), companion115.m3953getBlack0d7_KjU(), 4, null);
                    } else {
                        modifierM3585shadows4CzXII$default = modifier;
                    }
                    modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(modifierM3585shadows4CzXII$default, roundedCornerShapeM955RoundedCornerShape0680j_4), j7, null, 2, null), Dp.m6403constructorimpl(1), j8, roundedCornerShapeM955RoundedCornerShape0680j_4);
                    if (aVar2 != null) {
                        modifierM220borderxT4_qwU = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU, false, null, null, aVar2, 7, null);
                    }
                    int i118 = (i7 >> 6) & 7168;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy13 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                    composer2 = composerStartRestartGroup;
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap13 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier13 = ComposedModifierKt.materializeModifier(composer2, modifierM220borderxT4_qwU);
                    ComposeUiNode.Companion companion116 = ComposeUiNode.Companion;
                    constructor = companion116.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
                    e eVarG13 = p035i0.a.g(companion116, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy13, composerM3407constructorimpl, currentCompositionLocalMap13);
                    if (composerM3407constructorimpl.getInserting()) {
                        j9 = j8;
                        if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier13, companion116.getSetModifier());
                        content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i118 >> 6) & 112) | 6));
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        long j1116 = j7;
                        f7 = fM6403constructorimpl;
                        aVar3 = aVar2;
                        j10 = j1116;
                        j11 = j9;
                    } else {
                        j9 = j8;
                    }
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG13);
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier13, companion116.getSetModifier());
                    content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i118 >> 6) & 112) | 6));
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    long j1117 = j7;
                    f7 = fM6403constructorimpl;
                    aVar3 = aVar2;
                    j10 = j1117;
                    j11 = j9;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: w3.i
                        @Override // O3.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                            f fVar = content;
                            j.a(modifier, j10, j11, f7, aVar3, fVar, (Composer) obj, iUpdateChangedFlags, i6);
                            return B3.o.f154a;
                        }
                    });
                }
            }
            i7 |= 24576;
            aVar2 = aVar;
            if ((i5 & 196608) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i14 = Fields.RenderEffect;
                } else {
                    i14 = 65536;
                }
                i7 |= i14;
            }
            if ((i7 & 74899) == 74898) {
                if (i15 != 0) {
                    j7 = p107y3.a.u;
                }
                if (i8 != 0) {
                    j8 = p107y3.a.t;
                }
                if (i10 != 0) {
                    fM6403constructorimpl = Dp.m6403constructorimpl(0);
                } else {
                    fM6403constructorimpl = f6;
                }
                if (i12 != 0) {
                    aVar2 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(844425280, i7, -1, "com.notescrafter.ui.components.GlassCard (GlassCard.kt:26)");
                }
                roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(16));
                if (Dp.m6402compareTo0680j_4(fM6403constructorimpl, Dp.m6403constructorimpl(0)) > 0) {
                    Color.Companion companion117 = Color.Companion;
                    modifierM3585shadows4CzXII$default = ShadowKt.m3585shadows4CzXII$default(modifier, fM6403constructorimpl, roundedCornerShapeM955RoundedCornerShape0680j_4, false, companion117.m3953getBlack0d7_KjU(), companion117.m3953getBlack0d7_KjU(), 4, null);
                } else {
                    modifierM3585shadows4CzXII$default = modifier;
                }
                modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(modifierM3585shadows4CzXII$default, roundedCornerShapeM955RoundedCornerShape0680j_4), j7, null, 2, null), Dp.m6403constructorimpl(1), j8, roundedCornerShapeM955RoundedCornerShape0680j_4);
                if (aVar2 != null) {
                    modifierM220borderxT4_qwU = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU, false, null, null, aVar2, 7, null);
                }
                int i119 = (i7 >> 6) & 7168;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy14 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                composer2 = composerStartRestartGroup;
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap14 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier14 = ComposedModifierKt.materializeModifier(composer2, modifierM220borderxT4_qwU);
                ComposeUiNode.Companion companion118 = ComposeUiNode.Companion;
                constructor = companion118.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
                e eVarG14 = p035i0.a.g(companion118, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy14, composerM3407constructorimpl, currentCompositionLocalMap14);
                if (composerM3407constructorimpl.getInserting()) {
                    j9 = j8;
                    if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier14, companion118.getSetModifier());
                    content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i119 >> 6) & 112) | 6));
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    long j1118 = j7;
                    f7 = fM6403constructorimpl;
                    aVar3 = aVar2;
                    j10 = j1118;
                    j11 = j9;
                } else {
                    j9 = j8;
                }
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG14);
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier14, companion118.getSetModifier());
                content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i119 >> 6) & 112) | 6));
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                long j1119 = j7;
                f7 = fM6403constructorimpl;
                aVar3 = aVar2;
                j10 = j1119;
                j11 = j9;
            } else {
                if (i15 != 0) {
                    j7 = p107y3.a.u;
                }
                if (i8 != 0) {
                    j8 = p107y3.a.t;
                }
                if (i10 != 0) {
                    fM6403constructorimpl = Dp.m6403constructorimpl(0);
                } else {
                    fM6403constructorimpl = f6;
                }
                if (i12 != 0) {
                    aVar2 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(844425280, i7, -1, "com.notescrafter.ui.components.GlassCard (GlassCard.kt:26)");
                }
                roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(16));
                if (Dp.m6402compareTo0680j_4(fM6403constructorimpl, Dp.m6403constructorimpl(0)) > 0) {
                    Color.Companion companion119 = Color.Companion;
                    modifierM3585shadows4CzXII$default = ShadowKt.m3585shadows4CzXII$default(modifier, fM6403constructorimpl, roundedCornerShapeM955RoundedCornerShape0680j_4, false, companion119.m3953getBlack0d7_KjU(), companion119.m3953getBlack0d7_KjU(), 4, null);
                } else {
                    modifierM3585shadows4CzXII$default = modifier;
                }
                modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(modifierM3585shadows4CzXII$default, roundedCornerShapeM955RoundedCornerShape0680j_4), j7, null, 2, null), Dp.m6403constructorimpl(1), j8, roundedCornerShapeM955RoundedCornerShape0680j_4);
                if (aVar2 != null) {
                    modifierM220borderxT4_qwU = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU, false, null, null, aVar2, 7, null);
                }
                int i1110 = (i7 >> 6) & 7168;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy15 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                composer2 = composerStartRestartGroup;
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap15 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier15 = ComposedModifierKt.materializeModifier(composer2, modifierM220borderxT4_qwU);
                ComposeUiNode.Companion companion1110 = ComposeUiNode.Companion;
                constructor = companion1110.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
                e eVarG15 = p035i0.a.g(companion1110, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy15, composerM3407constructorimpl, currentCompositionLocalMap15);
                if (composerM3407constructorimpl.getInserting()) {
                    j9 = j8;
                    if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier15, companion1110.getSetModifier());
                    content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i1110 >> 6) & 112) | 6));
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    long j11110 = j7;
                    f7 = fM6403constructorimpl;
                    aVar3 = aVar2;
                    j10 = j11110;
                    j11 = j9;
                } else {
                    j9 = j8;
                }
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG15);
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier15, companion1110.getSetModifier());
                content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i1110 >> 6) & 112) | 6));
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                long j11111 = j7;
                f7 = fM6403constructorimpl;
                aVar3 = aVar2;
                j10 = j11111;
                j11 = j9;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: w3.i
                    @Override // O3.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                        f fVar = content;
                        j.a(modifier, j10, j11, f7, aVar3, fVar, (Composer) obj, iUpdateChangedFlags, i6);
                        return B3.o.f154a;
                    }
                });
            }
        }
        i7 |= 48;
        j7 = j5;
        i8 = i6 & 4;
        if (i8 != 0) {
            if ((i5 & 384) == 0) {
                j8 = j6;
                if (composerStartRestartGroup.changed(j8)) {
                    i9 = Fields.RotationX;
                } else {
                    i9 = Fields.SpotShadowColor;
                }
                i7 |= i9;
            }
            i10 = i6 & 8;
            if (i10 != 0) {
                if ((i5 & 3072) == 0) {
                    f6 = f5;
                    if (composerStartRestartGroup.changed(f6)) {
                        i11 = Fields.CameraDistance;
                    } else {
                        i11 = Fields.RotationZ;
                    }
                    i7 |= i11;
                }
                i12 = i6 & 16;
                if (i12 != 0) {
                    if ((i5 & 24576) == 0) {
                        aVar2 = aVar;
                        if (composerStartRestartGroup.changedInstance(aVar2)) {
                            i13 = Fields.Clip;
                        } else {
                            i13 = Fields.Shape;
                        }
                        i7 |= i13;
                    }
                    if ((i5 & 196608) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i14 = Fields.RenderEffect;
                        } else {
                            i14 = 65536;
                        }
                        i7 |= i14;
                    }
                    if ((i7 & 74899) == 74898) {
                        if (i15 != 0) {
                            j7 = p107y3.a.u;
                        }
                        if (i8 != 0) {
                            j8 = p107y3.a.t;
                        }
                        if (i10 != 0) {
                            fM6403constructorimpl = Dp.m6403constructorimpl(0);
                        } else {
                            fM6403constructorimpl = f6;
                        }
                        if (i12 != 0) {
                            aVar2 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(844425280, i7, -1, "com.notescrafter.ui.components.GlassCard (GlassCard.kt:26)");
                        }
                        roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(16));
                        if (Dp.m6402compareTo0680j_4(fM6403constructorimpl, Dp.m6403constructorimpl(0)) > 0) {
                            Color.Companion companion1111 = Color.Companion;
                            modifierM3585shadows4CzXII$default = ShadowKt.m3585shadows4CzXII$default(modifier, fM6403constructorimpl, roundedCornerShapeM955RoundedCornerShape0680j_4, false, companion1111.m3953getBlack0d7_KjU(), companion1111.m3953getBlack0d7_KjU(), 4, null);
                        } else {
                            modifierM3585shadows4CzXII$default = modifier;
                        }
                        modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(modifierM3585shadows4CzXII$default, roundedCornerShapeM955RoundedCornerShape0680j_4), j7, null, 2, null), Dp.m6403constructorimpl(1), j8, roundedCornerShapeM955RoundedCornerShape0680j_4);
                        if (aVar2 != null) {
                            modifierM220borderxT4_qwU = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU, false, null, null, aVar2, 7, null);
                        }
                        int i1111 = (i7 >> 6) & 7168;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy16 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                        composer2 = composerStartRestartGroup;
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap16 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier16 = ComposedModifierKt.materializeModifier(composer2, modifierM220borderxT4_qwU);
                        ComposeUiNode.Companion companion1112 = ComposeUiNode.Companion;
                        constructor = companion1112.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
                        e eVarG16 = p035i0.a.g(companion1112, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy16, composerM3407constructorimpl, currentCompositionLocalMap16);
                        if (composerM3407constructorimpl.getInserting()) {
                            j9 = j8;
                            if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier16, companion1112.getSetModifier());
                            content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i1111 >> 6) & 112) | 6));
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            long j11112 = j7;
                            f7 = fM6403constructorimpl;
                            aVar3 = aVar2;
                            j10 = j11112;
                            j11 = j9;
                        } else {
                            j9 = j8;
                        }
                        p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG16);
                        Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier16, companion1112.getSetModifier());
                        content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i1111 >> 6) & 112) | 6));
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        long j11113 = j7;
                        f7 = fM6403constructorimpl;
                        aVar3 = aVar2;
                        j10 = j11113;
                        j11 = j9;
                    } else {
                        if (i15 != 0) {
                            j7 = p107y3.a.u;
                        }
                        if (i8 != 0) {
                            j8 = p107y3.a.t;
                        }
                        if (i10 != 0) {
                            fM6403constructorimpl = Dp.m6403constructorimpl(0);
                        } else {
                            fM6403constructorimpl = f6;
                        }
                        if (i12 != 0) {
                            aVar2 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(844425280, i7, -1, "com.notescrafter.ui.components.GlassCard (GlassCard.kt:26)");
                        }
                        roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(16));
                        if (Dp.m6402compareTo0680j_4(fM6403constructorimpl, Dp.m6403constructorimpl(0)) > 0) {
                            Color.Companion companion1113 = Color.Companion;
                            modifierM3585shadows4CzXII$default = ShadowKt.m3585shadows4CzXII$default(modifier, fM6403constructorimpl, roundedCornerShapeM955RoundedCornerShape0680j_4, false, companion1113.m3953getBlack0d7_KjU(), companion1113.m3953getBlack0d7_KjU(), 4, null);
                        } else {
                            modifierM3585shadows4CzXII$default = modifier;
                        }
                        modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(modifierM3585shadows4CzXII$default, roundedCornerShapeM955RoundedCornerShape0680j_4), j7, null, 2, null), Dp.m6403constructorimpl(1), j8, roundedCornerShapeM955RoundedCornerShape0680j_4);
                        if (aVar2 != null) {
                            modifierM220borderxT4_qwU = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU, false, null, null, aVar2, 7, null);
                        }
                        int i1112 = (i7 >> 6) & 7168;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy17 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                        composer2 = composerStartRestartGroup;
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap17 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier17 = ComposedModifierKt.materializeModifier(composer2, modifierM220borderxT4_qwU);
                        ComposeUiNode.Companion companion1114 = ComposeUiNode.Companion;
                        constructor = companion1114.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
                        e eVarG17 = p035i0.a.g(companion1114, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy17, composerM3407constructorimpl, currentCompositionLocalMap17);
                        if (composerM3407constructorimpl.getInserting()) {
                            j9 = j8;
                            if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier17, companion1114.getSetModifier());
                            content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i1112 >> 6) & 112) | 6));
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            long j11114 = j7;
                            f7 = fM6403constructorimpl;
                            aVar3 = aVar2;
                            j10 = j11114;
                            j11 = j9;
                        } else {
                            j9 = j8;
                        }
                        p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG17);
                        Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier17, companion1114.getSetModifier());
                        content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i1112 >> 6) & 112) | 6));
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        long j11115 = j7;
                        f7 = fM6403constructorimpl;
                        aVar3 = aVar2;
                        j10 = j11115;
                        j11 = j9;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: w3.i
                            @Override // O3.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                                f fVar = content;
                                j.a(modifier, j10, j11, f7, aVar3, fVar, (Composer) obj, iUpdateChangedFlags, i6);
                                return B3.o.f154a;
                            }
                        });
                    }
                }
                i7 |= 24576;
                aVar2 = aVar;
                if ((i5 & 196608) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i14 = Fields.RenderEffect;
                    } else {
                        i14 = 65536;
                    }
                    i7 |= i14;
                }
                if ((i7 & 74899) == 74898) {
                    if (i15 != 0) {
                        j7 = p107y3.a.u;
                    }
                    if (i8 != 0) {
                        j8 = p107y3.a.t;
                    }
                    if (i10 != 0) {
                        fM6403constructorimpl = Dp.m6403constructorimpl(0);
                    } else {
                        fM6403constructorimpl = f6;
                    }
                    if (i12 != 0) {
                        aVar2 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(844425280, i7, -1, "com.notescrafter.ui.components.GlassCard (GlassCard.kt:26)");
                    }
                    roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(16));
                    if (Dp.m6402compareTo0680j_4(fM6403constructorimpl, Dp.m6403constructorimpl(0)) > 0) {
                        Color.Companion companion1115 = Color.Companion;
                        modifierM3585shadows4CzXII$default = ShadowKt.m3585shadows4CzXII$default(modifier, fM6403constructorimpl, roundedCornerShapeM955RoundedCornerShape0680j_4, false, companion1115.m3953getBlack0d7_KjU(), companion1115.m3953getBlack0d7_KjU(), 4, null);
                    } else {
                        modifierM3585shadows4CzXII$default = modifier;
                    }
                    modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(modifierM3585shadows4CzXII$default, roundedCornerShapeM955RoundedCornerShape0680j_4), j7, null, 2, null), Dp.m6403constructorimpl(1), j8, roundedCornerShapeM955RoundedCornerShape0680j_4);
                    if (aVar2 != null) {
                        modifierM220borderxT4_qwU = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU, false, null, null, aVar2, 7, null);
                    }
                    int i1113 = (i7 >> 6) & 7168;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy18 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                    composer2 = composerStartRestartGroup;
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap18 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier18 = ComposedModifierKt.materializeModifier(composer2, modifierM220borderxT4_qwU);
                    ComposeUiNode.Companion companion1116 = ComposeUiNode.Companion;
                    constructor = companion1116.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
                    e eVarG18 = p035i0.a.g(companion1116, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy18, composerM3407constructorimpl, currentCompositionLocalMap18);
                    if (composerM3407constructorimpl.getInserting()) {
                        j9 = j8;
                        if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier18, companion1116.getSetModifier());
                        content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i1113 >> 6) & 112) | 6));
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        long j11116 = j7;
                        f7 = fM6403constructorimpl;
                        aVar3 = aVar2;
                        j10 = j11116;
                        j11 = j9;
                    } else {
                        j9 = j8;
                    }
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG18);
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier18, companion1116.getSetModifier());
                    content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i1113 >> 6) & 112) | 6));
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    long j11117 = j7;
                    f7 = fM6403constructorimpl;
                    aVar3 = aVar2;
                    j10 = j11117;
                    j11 = j9;
                } else {
                    if (i15 != 0) {
                        j7 = p107y3.a.u;
                    }
                    if (i8 != 0) {
                        j8 = p107y3.a.t;
                    }
                    if (i10 != 0) {
                        fM6403constructorimpl = Dp.m6403constructorimpl(0);
                    } else {
                        fM6403constructorimpl = f6;
                    }
                    if (i12 != 0) {
                        aVar2 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(844425280, i7, -1, "com.notescrafter.ui.components.GlassCard (GlassCard.kt:26)");
                    }
                    roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(16));
                    if (Dp.m6402compareTo0680j_4(fM6403constructorimpl, Dp.m6403constructorimpl(0)) > 0) {
                        Color.Companion companion1117 = Color.Companion;
                        modifierM3585shadows4CzXII$default = ShadowKt.m3585shadows4CzXII$default(modifier, fM6403constructorimpl, roundedCornerShapeM955RoundedCornerShape0680j_4, false, companion1117.m3953getBlack0d7_KjU(), companion1117.m3953getBlack0d7_KjU(), 4, null);
                    } else {
                        modifierM3585shadows4CzXII$default = modifier;
                    }
                    modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(modifierM3585shadows4CzXII$default, roundedCornerShapeM955RoundedCornerShape0680j_4), j7, null, 2, null), Dp.m6403constructorimpl(1), j8, roundedCornerShapeM955RoundedCornerShape0680j_4);
                    if (aVar2 != null) {
                        modifierM220borderxT4_qwU = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU, false, null, null, aVar2, 7, null);
                    }
                    int i1114 = (i7 >> 6) & 7168;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy19 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                    composer2 = composerStartRestartGroup;
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap19 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier19 = ComposedModifierKt.materializeModifier(composer2, modifierM220borderxT4_qwU);
                    ComposeUiNode.Companion companion1118 = ComposeUiNode.Companion;
                    constructor = companion1118.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
                    e eVarG19 = p035i0.a.g(companion1118, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy19, composerM3407constructorimpl, currentCompositionLocalMap19);
                    if (composerM3407constructorimpl.getInserting()) {
                        j9 = j8;
                        if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier19, companion1118.getSetModifier());
                        content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i1114 >> 6) & 112) | 6));
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        long j11118 = j7;
                        f7 = fM6403constructorimpl;
                        aVar3 = aVar2;
                        j10 = j11118;
                        j11 = j9;
                    } else {
                        j9 = j8;
                    }
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG19);
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier19, companion1118.getSetModifier());
                    content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i1114 >> 6) & 112) | 6));
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    long j11119 = j7;
                    f7 = fM6403constructorimpl;
                    aVar3 = aVar2;
                    j10 = j11119;
                    j11 = j9;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: w3.i
                        @Override // O3.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                            f fVar = content;
                            j.a(modifier, j10, j11, f7, aVar3, fVar, (Composer) obj, iUpdateChangedFlags, i6);
                            return B3.o.f154a;
                        }
                    });
                }
            }
            i7 |= 3072;
            f6 = f5;
            i12 = i6 & 16;
            if (i12 != 0) {
                if ((i5 & 24576) == 0) {
                    aVar2 = aVar;
                    if (composerStartRestartGroup.changedInstance(aVar2)) {
                        i13 = Fields.Clip;
                    } else {
                        i13 = Fields.Shape;
                    }
                    i7 |= i13;
                }
                if ((i5 & 196608) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i14 = Fields.RenderEffect;
                    } else {
                        i14 = 65536;
                    }
                    i7 |= i14;
                }
                if ((i7 & 74899) == 74898) {
                    if (i15 != 0) {
                        j7 = p107y3.a.u;
                    }
                    if (i8 != 0) {
                        j8 = p107y3.a.t;
                    }
                    if (i10 != 0) {
                        fM6403constructorimpl = Dp.m6403constructorimpl(0);
                    } else {
                        fM6403constructorimpl = f6;
                    }
                    if (i12 != 0) {
                        aVar2 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(844425280, i7, -1, "com.notescrafter.ui.components.GlassCard (GlassCard.kt:26)");
                    }
                    roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(16));
                    if (Dp.m6402compareTo0680j_4(fM6403constructorimpl, Dp.m6403constructorimpl(0)) > 0) {
                        Color.Companion companion1119 = Color.Companion;
                        modifierM3585shadows4CzXII$default = ShadowKt.m3585shadows4CzXII$default(modifier, fM6403constructorimpl, roundedCornerShapeM955RoundedCornerShape0680j_4, false, companion1119.m3953getBlack0d7_KjU(), companion1119.m3953getBlack0d7_KjU(), 4, null);
                    } else {
                        modifierM3585shadows4CzXII$default = modifier;
                    }
                    modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(modifierM3585shadows4CzXII$default, roundedCornerShapeM955RoundedCornerShape0680j_4), j7, null, 2, null), Dp.m6403constructorimpl(1), j8, roundedCornerShapeM955RoundedCornerShape0680j_4);
                    if (aVar2 != null) {
                        modifierM220borderxT4_qwU = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU, false, null, null, aVar2, 7, null);
                    }
                    int i1115 = (i7 >> 6) & 7168;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy110 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                    composer2 = composerStartRestartGroup;
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap110 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier110 = ComposedModifierKt.materializeModifier(composer2, modifierM220borderxT4_qwU);
                    ComposeUiNode.Companion companion11110 = ComposeUiNode.Companion;
                    constructor = companion11110.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
                    e eVarG110 = p035i0.a.g(companion11110, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy110, composerM3407constructorimpl, currentCompositionLocalMap110);
                    if (composerM3407constructorimpl.getInserting()) {
                        j9 = j8;
                        if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier110, companion11110.getSetModifier());
                        content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i1115 >> 6) & 112) | 6));
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        long j111110 = j7;
                        f7 = fM6403constructorimpl;
                        aVar3 = aVar2;
                        j10 = j111110;
                        j11 = j9;
                    } else {
                        j9 = j8;
                    }
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG110);
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier110, companion11110.getSetModifier());
                    content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i1115 >> 6) & 112) | 6));
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    long j111111 = j7;
                    f7 = fM6403constructorimpl;
                    aVar3 = aVar2;
                    j10 = j111111;
                    j11 = j9;
                } else {
                    if (i15 != 0) {
                        j7 = p107y3.a.u;
                    }
                    if (i8 != 0) {
                        j8 = p107y3.a.t;
                    }
                    if (i10 != 0) {
                        fM6403constructorimpl = Dp.m6403constructorimpl(0);
                    } else {
                        fM6403constructorimpl = f6;
                    }
                    if (i12 != 0) {
                        aVar2 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(844425280, i7, -1, "com.notescrafter.ui.components.GlassCard (GlassCard.kt:26)");
                    }
                    roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(16));
                    if (Dp.m6402compareTo0680j_4(fM6403constructorimpl, Dp.m6403constructorimpl(0)) > 0) {
                        Color.Companion companion11111 = Color.Companion;
                        modifierM3585shadows4CzXII$default = ShadowKt.m3585shadows4CzXII$default(modifier, fM6403constructorimpl, roundedCornerShapeM955RoundedCornerShape0680j_4, false, companion11111.m3953getBlack0d7_KjU(), companion11111.m3953getBlack0d7_KjU(), 4, null);
                    } else {
                        modifierM3585shadows4CzXII$default = modifier;
                    }
                    modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(modifierM3585shadows4CzXII$default, roundedCornerShapeM955RoundedCornerShape0680j_4), j7, null, 2, null), Dp.m6403constructorimpl(1), j8, roundedCornerShapeM955RoundedCornerShape0680j_4);
                    if (aVar2 != null) {
                        modifierM220borderxT4_qwU = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU, false, null, null, aVar2, 7, null);
                    }
                    int i1116 = (i7 >> 6) & 7168;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy111 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                    composer2 = composerStartRestartGroup;
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap111 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier111 = ComposedModifierKt.materializeModifier(composer2, modifierM220borderxT4_qwU);
                    ComposeUiNode.Companion companion11112 = ComposeUiNode.Companion;
                    constructor = companion11112.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
                    e eVarG111 = p035i0.a.g(companion11112, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy111, composerM3407constructorimpl, currentCompositionLocalMap111);
                    if (composerM3407constructorimpl.getInserting()) {
                        j9 = j8;
                        if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier111, companion11112.getSetModifier());
                        content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i1116 >> 6) & 112) | 6));
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        long j111112 = j7;
                        f7 = fM6403constructorimpl;
                        aVar3 = aVar2;
                        j10 = j111112;
                        j11 = j9;
                    } else {
                        j9 = j8;
                    }
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG111);
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier111, companion11112.getSetModifier());
                    content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i1116 >> 6) & 112) | 6));
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    long j111113 = j7;
                    f7 = fM6403constructorimpl;
                    aVar3 = aVar2;
                    j10 = j111113;
                    j11 = j9;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: w3.i
                        @Override // O3.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                            f fVar = content;
                            j.a(modifier, j10, j11, f7, aVar3, fVar, (Composer) obj, iUpdateChangedFlags, i6);
                            return B3.o.f154a;
                        }
                    });
                }
            }
            i7 |= 24576;
            aVar2 = aVar;
            if ((i5 & 196608) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i14 = Fields.RenderEffect;
                } else {
                    i14 = 65536;
                }
                i7 |= i14;
            }
            if ((i7 & 74899) == 74898) {
                if (i15 != 0) {
                    j7 = p107y3.a.u;
                }
                if (i8 != 0) {
                    j8 = p107y3.a.t;
                }
                if (i10 != 0) {
                    fM6403constructorimpl = Dp.m6403constructorimpl(0);
                } else {
                    fM6403constructorimpl = f6;
                }
                if (i12 != 0) {
                    aVar2 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(844425280, i7, -1, "com.notescrafter.ui.components.GlassCard (GlassCard.kt:26)");
                }
                roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(16));
                if (Dp.m6402compareTo0680j_4(fM6403constructorimpl, Dp.m6403constructorimpl(0)) > 0) {
                    Color.Companion companion11113 = Color.Companion;
                    modifierM3585shadows4CzXII$default = ShadowKt.m3585shadows4CzXII$default(modifier, fM6403constructorimpl, roundedCornerShapeM955RoundedCornerShape0680j_4, false, companion11113.m3953getBlack0d7_KjU(), companion11113.m3953getBlack0d7_KjU(), 4, null);
                } else {
                    modifierM3585shadows4CzXII$default = modifier;
                }
                modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(modifierM3585shadows4CzXII$default, roundedCornerShapeM955RoundedCornerShape0680j_4), j7, null, 2, null), Dp.m6403constructorimpl(1), j8, roundedCornerShapeM955RoundedCornerShape0680j_4);
                if (aVar2 != null) {
                    modifierM220borderxT4_qwU = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU, false, null, null, aVar2, 7, null);
                }
                int i1117 = (i7 >> 6) & 7168;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy112 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                composer2 = composerStartRestartGroup;
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap112 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier112 = ComposedModifierKt.materializeModifier(composer2, modifierM220borderxT4_qwU);
                ComposeUiNode.Companion companion11114 = ComposeUiNode.Companion;
                constructor = companion11114.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
                e eVarG112 = p035i0.a.g(companion11114, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy112, composerM3407constructorimpl, currentCompositionLocalMap112);
                if (composerM3407constructorimpl.getInserting()) {
                    j9 = j8;
                    if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier112, companion11114.getSetModifier());
                    content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i1117 >> 6) & 112) | 6));
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    long j111114 = j7;
                    f7 = fM6403constructorimpl;
                    aVar3 = aVar2;
                    j10 = j111114;
                    j11 = j9;
                } else {
                    j9 = j8;
                }
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG112);
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier112, companion11114.getSetModifier());
                content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i1117 >> 6) & 112) | 6));
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                long j111115 = j7;
                f7 = fM6403constructorimpl;
                aVar3 = aVar2;
                j10 = j111115;
                j11 = j9;
            } else {
                if (i15 != 0) {
                    j7 = p107y3.a.u;
                }
                if (i8 != 0) {
                    j8 = p107y3.a.t;
                }
                if (i10 != 0) {
                    fM6403constructorimpl = Dp.m6403constructorimpl(0);
                } else {
                    fM6403constructorimpl = f6;
                }
                if (i12 != 0) {
                    aVar2 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(844425280, i7, -1, "com.notescrafter.ui.components.GlassCard (GlassCard.kt:26)");
                }
                roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(16));
                if (Dp.m6402compareTo0680j_4(fM6403constructorimpl, Dp.m6403constructorimpl(0)) > 0) {
                    Color.Companion companion11115 = Color.Companion;
                    modifierM3585shadows4CzXII$default = ShadowKt.m3585shadows4CzXII$default(modifier, fM6403constructorimpl, roundedCornerShapeM955RoundedCornerShape0680j_4, false, companion11115.m3953getBlack0d7_KjU(), companion11115.m3953getBlack0d7_KjU(), 4, null);
                } else {
                    modifierM3585shadows4CzXII$default = modifier;
                }
                modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(modifierM3585shadows4CzXII$default, roundedCornerShapeM955RoundedCornerShape0680j_4), j7, null, 2, null), Dp.m6403constructorimpl(1), j8, roundedCornerShapeM955RoundedCornerShape0680j_4);
                if (aVar2 != null) {
                    modifierM220borderxT4_qwU = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU, false, null, null, aVar2, 7, null);
                }
                int i1118 = (i7 >> 6) & 7168;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy113 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                composer2 = composerStartRestartGroup;
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap113 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier113 = ComposedModifierKt.materializeModifier(composer2, modifierM220borderxT4_qwU);
                ComposeUiNode.Companion companion11116 = ComposeUiNode.Companion;
                constructor = companion11116.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
                e eVarG113 = p035i0.a.g(companion11116, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy113, composerM3407constructorimpl, currentCompositionLocalMap113);
                if (composerM3407constructorimpl.getInserting()) {
                    j9 = j8;
                    if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier113, companion11116.getSetModifier());
                    content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i1118 >> 6) & 112) | 6));
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    long j111116 = j7;
                    f7 = fM6403constructorimpl;
                    aVar3 = aVar2;
                    j10 = j111116;
                    j11 = j9;
                } else {
                    j9 = j8;
                }
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG113);
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier113, companion11116.getSetModifier());
                content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i1118 >> 6) & 112) | 6));
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                long j111117 = j7;
                f7 = fM6403constructorimpl;
                aVar3 = aVar2;
                j10 = j111117;
                j11 = j9;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: w3.i
                    @Override // O3.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                        f fVar = content;
                        j.a(modifier, j10, j11, f7, aVar3, fVar, (Composer) obj, iUpdateChangedFlags, i6);
                        return B3.o.f154a;
                    }
                });
            }
        }
        i7 |= 384;
        j8 = j6;
        i10 = i6 & 8;
        if (i10 != 0) {
            if ((i5 & 3072) == 0) {
                f6 = f5;
                if (composerStartRestartGroup.changed(f6)) {
                    i11 = Fields.CameraDistance;
                } else {
                    i11 = Fields.RotationZ;
                }
                i7 |= i11;
            }
            i12 = i6 & 16;
            if (i12 != 0) {
                if ((i5 & 24576) == 0) {
                    aVar2 = aVar;
                    if (composerStartRestartGroup.changedInstance(aVar2)) {
                        i13 = Fields.Clip;
                    } else {
                        i13 = Fields.Shape;
                    }
                    i7 |= i13;
                }
                if ((i5 & 196608) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i14 = Fields.RenderEffect;
                    } else {
                        i14 = 65536;
                    }
                    i7 |= i14;
                }
                if ((i7 & 74899) == 74898) {
                    if (i15 != 0) {
                        j7 = p107y3.a.u;
                    }
                    if (i8 != 0) {
                        j8 = p107y3.a.t;
                    }
                    if (i10 != 0) {
                        fM6403constructorimpl = Dp.m6403constructorimpl(0);
                    } else {
                        fM6403constructorimpl = f6;
                    }
                    if (i12 != 0) {
                        aVar2 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(844425280, i7, -1, "com.notescrafter.ui.components.GlassCard (GlassCard.kt:26)");
                    }
                    roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(16));
                    if (Dp.m6402compareTo0680j_4(fM6403constructorimpl, Dp.m6403constructorimpl(0)) > 0) {
                        Color.Companion companion11117 = Color.Companion;
                        modifierM3585shadows4CzXII$default = ShadowKt.m3585shadows4CzXII$default(modifier, fM6403constructorimpl, roundedCornerShapeM955RoundedCornerShape0680j_4, false, companion11117.m3953getBlack0d7_KjU(), companion11117.m3953getBlack0d7_KjU(), 4, null);
                    } else {
                        modifierM3585shadows4CzXII$default = modifier;
                    }
                    modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(modifierM3585shadows4CzXII$default, roundedCornerShapeM955RoundedCornerShape0680j_4), j7, null, 2, null), Dp.m6403constructorimpl(1), j8, roundedCornerShapeM955RoundedCornerShape0680j_4);
                    if (aVar2 != null) {
                        modifierM220borderxT4_qwU = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU, false, null, null, aVar2, 7, null);
                    }
                    int i1119 = (i7 >> 6) & 7168;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy114 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                    composer2 = composerStartRestartGroup;
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap114 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier114 = ComposedModifierKt.materializeModifier(composer2, modifierM220borderxT4_qwU);
                    ComposeUiNode.Companion companion11118 = ComposeUiNode.Companion;
                    constructor = companion11118.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
                    e eVarG114 = p035i0.a.g(companion11118, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy114, composerM3407constructorimpl, currentCompositionLocalMap114);
                    if (composerM3407constructorimpl.getInserting()) {
                        j9 = j8;
                        if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier114, companion11118.getSetModifier());
                        content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i1119 >> 6) & 112) | 6));
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        long j111118 = j7;
                        f7 = fM6403constructorimpl;
                        aVar3 = aVar2;
                        j10 = j111118;
                        j11 = j9;
                    } else {
                        j9 = j8;
                    }
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG114);
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier114, companion11118.getSetModifier());
                    content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i1119 >> 6) & 112) | 6));
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    long j111119 = j7;
                    f7 = fM6403constructorimpl;
                    aVar3 = aVar2;
                    j10 = j111119;
                    j11 = j9;
                } else {
                    if (i15 != 0) {
                        j7 = p107y3.a.u;
                    }
                    if (i8 != 0) {
                        j8 = p107y3.a.t;
                    }
                    if (i10 != 0) {
                        fM6403constructorimpl = Dp.m6403constructorimpl(0);
                    } else {
                        fM6403constructorimpl = f6;
                    }
                    if (i12 != 0) {
                        aVar2 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(844425280, i7, -1, "com.notescrafter.ui.components.GlassCard (GlassCard.kt:26)");
                    }
                    roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(16));
                    if (Dp.m6402compareTo0680j_4(fM6403constructorimpl, Dp.m6403constructorimpl(0)) > 0) {
                        Color.Companion companion11119 = Color.Companion;
                        modifierM3585shadows4CzXII$default = ShadowKt.m3585shadows4CzXII$default(modifier, fM6403constructorimpl, roundedCornerShapeM955RoundedCornerShape0680j_4, false, companion11119.m3953getBlack0d7_KjU(), companion11119.m3953getBlack0d7_KjU(), 4, null);
                    } else {
                        modifierM3585shadows4CzXII$default = modifier;
                    }
                    modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(modifierM3585shadows4CzXII$default, roundedCornerShapeM955RoundedCornerShape0680j_4), j7, null, 2, null), Dp.m6403constructorimpl(1), j8, roundedCornerShapeM955RoundedCornerShape0680j_4);
                    if (aVar2 != null) {
                        modifierM220borderxT4_qwU = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU, false, null, null, aVar2, 7, null);
                    }
                    int i11110 = (i7 >> 6) & 7168;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy115 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                    composer2 = composerStartRestartGroup;
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap115 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier115 = ComposedModifierKt.materializeModifier(composer2, modifierM220borderxT4_qwU);
                    ComposeUiNode.Companion companion111110 = ComposeUiNode.Companion;
                    constructor = companion111110.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
                    e eVarG115 = p035i0.a.g(companion111110, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy115, composerM3407constructorimpl, currentCompositionLocalMap115);
                    if (composerM3407constructorimpl.getInserting()) {
                        j9 = j8;
                        if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier115, companion111110.getSetModifier());
                        content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i11110 >> 6) & 112) | 6));
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        long j1111110 = j7;
                        f7 = fM6403constructorimpl;
                        aVar3 = aVar2;
                        j10 = j1111110;
                        j11 = j9;
                    } else {
                        j9 = j8;
                    }
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG115);
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier115, companion111110.getSetModifier());
                    content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i11110 >> 6) & 112) | 6));
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    long j1111111 = j7;
                    f7 = fM6403constructorimpl;
                    aVar3 = aVar2;
                    j10 = j1111111;
                    j11 = j9;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: w3.i
                        @Override // O3.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                            f fVar = content;
                            j.a(modifier, j10, j11, f7, aVar3, fVar, (Composer) obj, iUpdateChangedFlags, i6);
                            return B3.o.f154a;
                        }
                    });
                }
            }
            i7 |= 24576;
            aVar2 = aVar;
            if ((i5 & 196608) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i14 = Fields.RenderEffect;
                } else {
                    i14 = 65536;
                }
                i7 |= i14;
            }
            if ((i7 & 74899) == 74898) {
                if (i15 != 0) {
                    j7 = p107y3.a.u;
                }
                if (i8 != 0) {
                    j8 = p107y3.a.t;
                }
                if (i10 != 0) {
                    fM6403constructorimpl = Dp.m6403constructorimpl(0);
                } else {
                    fM6403constructorimpl = f6;
                }
                if (i12 != 0) {
                    aVar2 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(844425280, i7, -1, "com.notescrafter.ui.components.GlassCard (GlassCard.kt:26)");
                }
                roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(16));
                if (Dp.m6402compareTo0680j_4(fM6403constructorimpl, Dp.m6403constructorimpl(0)) > 0) {
                    Color.Companion companion111111 = Color.Companion;
                    modifierM3585shadows4CzXII$default = ShadowKt.m3585shadows4CzXII$default(modifier, fM6403constructorimpl, roundedCornerShapeM955RoundedCornerShape0680j_4, false, companion111111.m3953getBlack0d7_KjU(), companion111111.m3953getBlack0d7_KjU(), 4, null);
                } else {
                    modifierM3585shadows4CzXII$default = modifier;
                }
                modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(modifierM3585shadows4CzXII$default, roundedCornerShapeM955RoundedCornerShape0680j_4), j7, null, 2, null), Dp.m6403constructorimpl(1), j8, roundedCornerShapeM955RoundedCornerShape0680j_4);
                if (aVar2 != null) {
                    modifierM220borderxT4_qwU = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU, false, null, null, aVar2, 7, null);
                }
                int i11111 = (i7 >> 6) & 7168;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy116 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                composer2 = composerStartRestartGroup;
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap116 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier116 = ComposedModifierKt.materializeModifier(composer2, modifierM220borderxT4_qwU);
                ComposeUiNode.Companion companion111112 = ComposeUiNode.Companion;
                constructor = companion111112.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
                e eVarG116 = p035i0.a.g(companion111112, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy116, composerM3407constructorimpl, currentCompositionLocalMap116);
                if (composerM3407constructorimpl.getInserting()) {
                    j9 = j8;
                    if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier116, companion111112.getSetModifier());
                    content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i11111 >> 6) & 112) | 6));
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    long j1111112 = j7;
                    f7 = fM6403constructorimpl;
                    aVar3 = aVar2;
                    j10 = j1111112;
                    j11 = j9;
                } else {
                    j9 = j8;
                }
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG116);
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier116, companion111112.getSetModifier());
                content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i11111 >> 6) & 112) | 6));
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                long j1111113 = j7;
                f7 = fM6403constructorimpl;
                aVar3 = aVar2;
                j10 = j1111113;
                j11 = j9;
            } else {
                if (i15 != 0) {
                    j7 = p107y3.a.u;
                }
                if (i8 != 0) {
                    j8 = p107y3.a.t;
                }
                if (i10 != 0) {
                    fM6403constructorimpl = Dp.m6403constructorimpl(0);
                } else {
                    fM6403constructorimpl = f6;
                }
                if (i12 != 0) {
                    aVar2 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(844425280, i7, -1, "com.notescrafter.ui.components.GlassCard (GlassCard.kt:26)");
                }
                roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(16));
                if (Dp.m6402compareTo0680j_4(fM6403constructorimpl, Dp.m6403constructorimpl(0)) > 0) {
                    Color.Companion companion111113 = Color.Companion;
                    modifierM3585shadows4CzXII$default = ShadowKt.m3585shadows4CzXII$default(modifier, fM6403constructorimpl, roundedCornerShapeM955RoundedCornerShape0680j_4, false, companion111113.m3953getBlack0d7_KjU(), companion111113.m3953getBlack0d7_KjU(), 4, null);
                } else {
                    modifierM3585shadows4CzXII$default = modifier;
                }
                modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(modifierM3585shadows4CzXII$default, roundedCornerShapeM955RoundedCornerShape0680j_4), j7, null, 2, null), Dp.m6403constructorimpl(1), j8, roundedCornerShapeM955RoundedCornerShape0680j_4);
                if (aVar2 != null) {
                    modifierM220borderxT4_qwU = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU, false, null, null, aVar2, 7, null);
                }
                int i11112 = (i7 >> 6) & 7168;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy117 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                composer2 = composerStartRestartGroup;
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap117 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier117 = ComposedModifierKt.materializeModifier(composer2, modifierM220borderxT4_qwU);
                ComposeUiNode.Companion companion111114 = ComposeUiNode.Companion;
                constructor = companion111114.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
                e eVarG117 = p035i0.a.g(companion111114, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy117, composerM3407constructorimpl, currentCompositionLocalMap117);
                if (composerM3407constructorimpl.getInserting()) {
                    j9 = j8;
                    if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier117, companion111114.getSetModifier());
                    content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i11112 >> 6) & 112) | 6));
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    long j1111114 = j7;
                    f7 = fM6403constructorimpl;
                    aVar3 = aVar2;
                    j10 = j1111114;
                    j11 = j9;
                } else {
                    j9 = j8;
                }
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG117);
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier117, companion111114.getSetModifier());
                content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i11112 >> 6) & 112) | 6));
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                long j1111115 = j7;
                f7 = fM6403constructorimpl;
                aVar3 = aVar2;
                j10 = j1111115;
                j11 = j9;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: w3.i
                    @Override // O3.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                        f fVar = content;
                        j.a(modifier, j10, j11, f7, aVar3, fVar, (Composer) obj, iUpdateChangedFlags, i6);
                        return B3.o.f154a;
                    }
                });
            }
        }
        i7 |= 3072;
        f6 = f5;
        i12 = i6 & 16;
        if (i12 != 0) {
            if ((i5 & 24576) == 0) {
                aVar2 = aVar;
                if (composerStartRestartGroup.changedInstance(aVar2)) {
                    i13 = Fields.Clip;
                } else {
                    i13 = Fields.Shape;
                }
                i7 |= i13;
            }
            if ((i5 & 196608) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i14 = Fields.RenderEffect;
                } else {
                    i14 = 65536;
                }
                i7 |= i14;
            }
            if ((i7 & 74899) == 74898) {
                if (i15 != 0) {
                    j7 = p107y3.a.u;
                }
                if (i8 != 0) {
                    j8 = p107y3.a.t;
                }
                if (i10 != 0) {
                    fM6403constructorimpl = Dp.m6403constructorimpl(0);
                } else {
                    fM6403constructorimpl = f6;
                }
                if (i12 != 0) {
                    aVar2 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(844425280, i7, -1, "com.notescrafter.ui.components.GlassCard (GlassCard.kt:26)");
                }
                roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(16));
                if (Dp.m6402compareTo0680j_4(fM6403constructorimpl, Dp.m6403constructorimpl(0)) > 0) {
                    Color.Companion companion111115 = Color.Companion;
                    modifierM3585shadows4CzXII$default = ShadowKt.m3585shadows4CzXII$default(modifier, fM6403constructorimpl, roundedCornerShapeM955RoundedCornerShape0680j_4, false, companion111115.m3953getBlack0d7_KjU(), companion111115.m3953getBlack0d7_KjU(), 4, null);
                } else {
                    modifierM3585shadows4CzXII$default = modifier;
                }
                modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(modifierM3585shadows4CzXII$default, roundedCornerShapeM955RoundedCornerShape0680j_4), j7, null, 2, null), Dp.m6403constructorimpl(1), j8, roundedCornerShapeM955RoundedCornerShape0680j_4);
                if (aVar2 != null) {
                    modifierM220borderxT4_qwU = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU, false, null, null, aVar2, 7, null);
                }
                int i11113 = (i7 >> 6) & 7168;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy118 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                composer2 = composerStartRestartGroup;
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap118 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier118 = ComposedModifierKt.materializeModifier(composer2, modifierM220borderxT4_qwU);
                ComposeUiNode.Companion companion111116 = ComposeUiNode.Companion;
                constructor = companion111116.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
                e eVarG118 = p035i0.a.g(companion111116, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy118, composerM3407constructorimpl, currentCompositionLocalMap118);
                if (composerM3407constructorimpl.getInserting()) {
                    j9 = j8;
                    if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier118, companion111116.getSetModifier());
                    content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i11113 >> 6) & 112) | 6));
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    long j1111116 = j7;
                    f7 = fM6403constructorimpl;
                    aVar3 = aVar2;
                    j10 = j1111116;
                    j11 = j9;
                } else {
                    j9 = j8;
                }
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG118);
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier118, companion111116.getSetModifier());
                content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i11113 >> 6) & 112) | 6));
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                long j1111117 = j7;
                f7 = fM6403constructorimpl;
                aVar3 = aVar2;
                j10 = j1111117;
                j11 = j9;
            } else {
                if (i15 != 0) {
                    j7 = p107y3.a.u;
                }
                if (i8 != 0) {
                    j8 = p107y3.a.t;
                }
                if (i10 != 0) {
                    fM6403constructorimpl = Dp.m6403constructorimpl(0);
                } else {
                    fM6403constructorimpl = f6;
                }
                if (i12 != 0) {
                    aVar2 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(844425280, i7, -1, "com.notescrafter.ui.components.GlassCard (GlassCard.kt:26)");
                }
                roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(16));
                if (Dp.m6402compareTo0680j_4(fM6403constructorimpl, Dp.m6403constructorimpl(0)) > 0) {
                    Color.Companion companion111117 = Color.Companion;
                    modifierM3585shadows4CzXII$default = ShadowKt.m3585shadows4CzXII$default(modifier, fM6403constructorimpl, roundedCornerShapeM955RoundedCornerShape0680j_4, false, companion111117.m3953getBlack0d7_KjU(), companion111117.m3953getBlack0d7_KjU(), 4, null);
                } else {
                    modifierM3585shadows4CzXII$default = modifier;
                }
                modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(modifierM3585shadows4CzXII$default, roundedCornerShapeM955RoundedCornerShape0680j_4), j7, null, 2, null), Dp.m6403constructorimpl(1), j8, roundedCornerShapeM955RoundedCornerShape0680j_4);
                if (aVar2 != null) {
                    modifierM220borderxT4_qwU = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU, false, null, null, aVar2, 7, null);
                }
                int i11114 = (i7 >> 6) & 7168;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy119 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                composer2 = composerStartRestartGroup;
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap119 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier119 = ComposedModifierKt.materializeModifier(composer2, modifierM220borderxT4_qwU);
                ComposeUiNode.Companion companion111118 = ComposeUiNode.Companion;
                constructor = companion111118.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
                e eVarG119 = p035i0.a.g(companion111118, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy119, composerM3407constructorimpl, currentCompositionLocalMap119);
                if (composerM3407constructorimpl.getInserting()) {
                    j9 = j8;
                    if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier119, companion111118.getSetModifier());
                    content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i11114 >> 6) & 112) | 6));
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    long j1111118 = j7;
                    f7 = fM6403constructorimpl;
                    aVar3 = aVar2;
                    j10 = j1111118;
                    j11 = j9;
                } else {
                    j9 = j8;
                }
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG119);
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier119, companion111118.getSetModifier());
                content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i11114 >> 6) & 112) | 6));
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                long j1111119 = j7;
                f7 = fM6403constructorimpl;
                aVar3 = aVar2;
                j10 = j1111119;
                j11 = j9;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: w3.i
                    @Override // O3.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                        f fVar = content;
                        j.a(modifier, j10, j11, f7, aVar3, fVar, (Composer) obj, iUpdateChangedFlags, i6);
                        return B3.o.f154a;
                    }
                });
            }
        }
        i7 |= 24576;
        aVar2 = aVar;
        if ((i5 & 196608) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i14 = Fields.RenderEffect;
            } else {
                i14 = 65536;
            }
            i7 |= i14;
        }
        if ((i7 & 74899) == 74898) {
            if (i15 != 0) {
                j7 = p107y3.a.u;
            }
            if (i8 != 0) {
                j8 = p107y3.a.t;
            }
            if (i10 != 0) {
                fM6403constructorimpl = Dp.m6403constructorimpl(0);
            } else {
                fM6403constructorimpl = f6;
            }
            if (i12 != 0) {
                aVar2 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(844425280, i7, -1, "com.notescrafter.ui.components.GlassCard (GlassCard.kt:26)");
            }
            roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(16));
            if (Dp.m6402compareTo0680j_4(fM6403constructorimpl, Dp.m6403constructorimpl(0)) > 0) {
                Color.Companion companion111119 = Color.Companion;
                modifierM3585shadows4CzXII$default = ShadowKt.m3585shadows4CzXII$default(modifier, fM6403constructorimpl, roundedCornerShapeM955RoundedCornerShape0680j_4, false, companion111119.m3953getBlack0d7_KjU(), companion111119.m3953getBlack0d7_KjU(), 4, null);
            } else {
                modifierM3585shadows4CzXII$default = modifier;
            }
            modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(modifierM3585shadows4CzXII$default, roundedCornerShapeM955RoundedCornerShape0680j_4), j7, null, 2, null), Dp.m6403constructorimpl(1), j8, roundedCornerShapeM955RoundedCornerShape0680j_4);
            if (aVar2 != null) {
                modifierM220borderxT4_qwU = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU, false, null, null, aVar2, 7, null);
            }
            int i11115 = (i7 >> 6) & 7168;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy1110 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            composer2 = composerStartRestartGroup;
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap1110 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier1110 = ComposedModifierKt.materializeModifier(composer2, modifierM220borderxT4_qwU);
            ComposeUiNode.Companion companion1111110 = ComposeUiNode.Companion;
            constructor = companion1111110.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
            e eVarG1110 = p035i0.a.g(companion1111110, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy1110, composerM3407constructorimpl, currentCompositionLocalMap1110);
            if (composerM3407constructorimpl.getInserting()) {
                j9 = j8;
                if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier1110, companion1111110.getSetModifier());
                content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i11115 >> 6) & 112) | 6));
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                long j11111110 = j7;
                f7 = fM6403constructorimpl;
                aVar3 = aVar2;
                j10 = j11111110;
                j11 = j9;
            } else {
                j9 = j8;
            }
            p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG1110);
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier1110, companion1111110.getSetModifier());
            content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i11115 >> 6) & 112) | 6));
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            long j11111111 = j7;
            f7 = fM6403constructorimpl;
            aVar3 = aVar2;
            j10 = j11111111;
            j11 = j9;
        } else {
            if (i15 != 0) {
                j7 = p107y3.a.u;
            }
            if (i8 != 0) {
                j8 = p107y3.a.t;
            }
            if (i10 != 0) {
                fM6403constructorimpl = Dp.m6403constructorimpl(0);
            } else {
                fM6403constructorimpl = f6;
            }
            if (i12 != 0) {
                aVar2 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(844425280, i7, -1, "com.notescrafter.ui.components.GlassCard (GlassCard.kt:26)");
            }
            roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(16));
            if (Dp.m6402compareTo0680j_4(fM6403constructorimpl, Dp.m6403constructorimpl(0)) > 0) {
                Color.Companion companion1111111 = Color.Companion;
                modifierM3585shadows4CzXII$default = ShadowKt.m3585shadows4CzXII$default(modifier, fM6403constructorimpl, roundedCornerShapeM955RoundedCornerShape0680j_4, false, companion1111111.m3953getBlack0d7_KjU(), companion1111111.m3953getBlack0d7_KjU(), 4, null);
            } else {
                modifierM3585shadows4CzXII$default = modifier;
            }
            modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(modifierM3585shadows4CzXII$default, roundedCornerShapeM955RoundedCornerShape0680j_4), j7, null, 2, null), Dp.m6403constructorimpl(1), j8, roundedCornerShapeM955RoundedCornerShape0680j_4);
            if (aVar2 != null) {
                modifierM220borderxT4_qwU = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU, false, null, null, aVar2, 7, null);
            }
            int i11116 = (i7 >> 6) & 7168;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy1111 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            composer2 = composerStartRestartGroup;
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap1111 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier1111 = ComposedModifierKt.materializeModifier(composer2, modifierM220borderxT4_qwU);
            ComposeUiNode.Companion companion1111112 = ComposeUiNode.Companion;
            constructor = companion1111112.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
            e eVarG1111 = p035i0.a.g(companion1111112, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy1111, composerM3407constructorimpl, currentCompositionLocalMap1111);
            if (composerM3407constructorimpl.getInserting()) {
                j9 = j8;
                if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier1111, companion1111112.getSetModifier());
                content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i11116 >> 6) & 112) | 6));
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                long j11111112 = j7;
                f7 = fM6403constructorimpl;
                aVar3 = aVar2;
                j10 = j11111112;
                j11 = j9;
            } else {
                j9 = j8;
            }
            p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG1111);
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier1111, companion1111112.getSetModifier());
            content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i11116 >> 6) & 112) | 6));
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            long j11111113 = j7;
            f7 = fM6403constructorimpl;
            aVar3 = aVar2;
            j10 = j11111113;
            j11 = j9;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: w3.i
                @Override // O3.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                    f fVar = content;
                    j.a(modifier, j10, j11, f7, aVar3, fVar, (Composer) obj, iUpdateChangedFlags, i6);
                    return B3.o.f154a;
                }
            });
        }
    }
}
