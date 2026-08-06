package p102x3;

import C3.C;
import O3.a;
import O3.c;
import O3.e;
import android.graphics.RectF;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.KeyboardArrowLeftKt;
import androidx.compose.material.icons.filled.KeyboardArrowRightKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.jvm.internal.o;
import p076s.b;
import p083t3.C2290i;
import p083t3.C2294k;
import p083t3.I;
import p087u3.g;
import p087u3.h;
import p097w3.q;

/* JADX INFO: renamed from: x3.n4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2588n4 {
    /* JADX WARN: Code duplicated, block: B:102:0x0376  */
    /* JADX WARN: Code duplicated, block: B:104:0x0384  */
    /* JADX WARN: Code duplicated, block: B:107:0x0408  */
    /* JADX WARN: Code duplicated, block: B:110:0x0414  */
    /* JADX WARN: Code duplicated, block: B:111:0x0418  */
    /* JADX WARN: Code duplicated, block: B:114:0x0429  */
    /* JADX WARN: Code duplicated, block: B:117:0x043a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0450  */
    /* JADX WARN: Code duplicated, block: B:122:0x0452  */
    /* JADX WARN: Code duplicated, block: B:125:0x0463  */
    /* JADX WARN: Code duplicated, block: B:126:0x0470  */
    /* JADX WARN: Code duplicated, block: B:129:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:130:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:133:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:134:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:137:0x055b  */
    /* JADX WARN: Code duplicated, block: B:140:0x0567  */
    /* JADX WARN: Code duplicated, block: B:141:0x056b  */
    /* JADX WARN: Code duplicated, block: B:144:0x057c  */
    /* JADX WARN: Code duplicated, block: B:147:0x058d  */
    /* JADX WARN: Code duplicated, block: B:151:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:152:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:155:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:156:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:159:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:160:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:163:0x060b  */
    /* JADX WARN: Code duplicated, block: B:164:0x0618  */
    /* JADX WARN: Code duplicated, block: B:167:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:170:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:171:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:174:0x06c8  */
    /* JADX WARN: Code duplicated, block: B:176:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:179:0x0709  */
    /* JADX WARN: Code duplicated, block: B:180:0x0717  */
    /* JADX WARN: Code duplicated, block: B:183:0x076d  */
    /* JADX WARN: Code duplicated, block: B:184:0x0779  */
    /* JADX WARN: Code duplicated, block: B:187:0x0830  */
    /* JADX WARN: Code duplicated, block: B:190:0x083c  */
    /* JADX WARN: Code duplicated, block: B:191:0x0840  */
    /* JADX WARN: Code duplicated, block: B:194:0x0853  */
    /* JADX WARN: Code duplicated, block: B:196:0x0861  */
    /* JADX WARN: Code duplicated, block: B:199:0x08d6  */
    /* JADX WARN: Code duplicated, block: B:202:0x08e2  */
    /* JADX WARN: Code duplicated, block: B:203:0x08e6  */
    /* JADX WARN: Code duplicated, block: B:206:0x08f7  */
    /* JADX WARN: Code duplicated, block: B:208:0x0905  */
    /* JADX WARN: Code duplicated, block: B:211:0x0985  */
    /* JADX WARN: Code duplicated, block: B:212:0x0987  */
    /* JADX WARN: Code duplicated, block: B:215:0x098e  */
    /* JADX WARN: Code duplicated, block: B:219:0x0998  */
    /* JADX WARN: Code duplicated, block: B:222:0x09cc  */
    /* JADX WARN: Code duplicated, block: B:77:0x025c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0268  */
    /* JADX WARN: Code duplicated, block: B:81:0x026c  */
    /* JADX WARN: Code duplicated, block: B:84:0x027d  */
    /* JADX WARN: Code duplicated, block: B:87:0x028e  */
    /* JADX WARN: Code duplicated, block: B:91:0x029e  */
    /* JADX WARN: Code duplicated, block: B:92:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:95:0x0353  */
    /* JADX WARN: Code duplicated, block: B:98:0x035f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0363  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(g gVar, c onSave, a onCancel, Modifier modifier, Composer composer, int i5) {
        int i6;
        MutableState mutableState;
        int currentCompositeKeyHash;
        a constructor;
        Composer composerM3407constructorimpl;
        Arrangement arrangement;
        Object objValueOf;
        MutableState mutableState2;
        Arrangement arrangement2;
        int currentCompositeKeyHash2;
        a constructor2;
        Composer composerM3407constructorimpl2;
        e eVarG;
        int currentCompositeKeyHash3;
        a constructor3;
        Composer composerM3407constructorimpl3;
        Arrangement arrangement3;
        boolean z3;
        Object objRememberedValue;
        MutableState mutableState3;
        MutableState mutableState4;
        boolean z4;
        Object objRememberedValue2;
        MutableState mutableState5;
        int currentCompositeKeyHash4;
        a constructor4;
        Composer composerM3407constructorimpl4;
        float f5;
        boolean z5;
        Object objRememberedValue3;
        MutableState mutableState6;
        MutableState mutableState7;
        boolean z6;
        Object objRememberedValue4;
        MutableState mutableState8;
        int currentCompositeKeyHash5;
        a constructor5;
        Composer composerM3407constructorimpl5;
        e eVarG2;
        Object objRememberedValue5;
        MutableState mutableState9;
        MutableState mutableState10;
        MutableState mutableState11;
        MutableState mutableState12;
        Object objRememberedValue6;
        MutableState mutableState13;
        int currentCompositeKeyHash6;
        a constructor6;
        Composer composerM3407constructorimpl6;
        e eVarG3;
        int currentCompositeKeyHash7;
        a constructor7;
        Composer composerM3407constructorimpl7;
        e eVarG4;
        Composer composer2;
        boolean z7;
        Object objRememberedValue7;
        Modifier modifier2;
        List<h> edits;
        o.f(onSave, "onSave");
        o.f(onCancel, "onCancel");
        Composer composerStartRestartGroup = composer.startRestartGroup(587112303);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changedInstance(gVar) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onSave) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onCancel) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i7 = i6 | 3072;
        if ((i7 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            composer2 = composerStartRestartGroup;
        } else {
            Modifier.Companion companion = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(587112303, i7, -1, "com.notescrafter.ui.screens.EditPageScreen (EditPageScreen.kt:66)");
            }
            composerStartRestartGroup.startReplaceGroup(1641486688);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.Companion;
            if (objRememberedValue8 == companion2.getEmpty()) {
                objRememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(EnumC2604o4.f15367o, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            MutableState mutableState14 = (MutableState) objRememberedValue8;
            Object objK = b.k(composerStartRestartGroup, 1641489059);
            if (objK == companion2.getEmpty()) {
                objK = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(EnumC2380a4.f14770o, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK);
            }
            MutableState mutableState15 = (MutableState) objK;
            Object objK2 = b.k(composerStartRestartGroup, 1641491464);
            Object empty = companion2.getEmpty();
            C c5 = C.f167o;
            if (objK2 == empty) {
                if (gVar == null || (edits = gVar.getEdits()) == null) {
                    edits = c5;
                }
                objK2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(edits, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK2);
            }
            MutableState mutableState16 = (MutableState) objK2;
            Object objK3 = b.k(composerStartRestartGroup, 1641493926);
            if (objK3 == companion2.getEmpty()) {
                objK3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(c5, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK3);
            }
            MutableState mutableState17 = (MutableState) objK3;
            Object objK4 = b.k(composerStartRestartGroup, 1641497210);
            if (objK4 == companion2.getEmpty()) {
                objK4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK4);
            }
            MutableState mutableState18 = (MutableState) objK4;
            Object objK5 = b.k(composerStartRestartGroup, 1641499507);
            if (objK5 == companion2.getEmpty()) {
                objK5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK5);
            }
            MutableState mutableState19 = (MutableState) objK5;
            Object objK6 = b.k(composerStartRestartGroup, 1641502560);
            if (objK6 == companion2.getEmpty()) {
                objK6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(EnumC2454ee.f14979o, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK6);
            }
            MutableState mutableState20 = (MutableState) objK6;
            Object objK7 = b.k(composerStartRestartGroup, 1641504861);
            if (objK7 == companion2.getEmpty()) {
                objK7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Z3.f14726o, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK7);
            }
            MutableState mutableState21 = (MutableState) objK7;
            composerStartRestartGroup.endReplaceGroup();
            State<Float> stateAnimateFloat = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("ants", composerStartRestartGroup, 6, 0), 0.0f, 20.0f, AnimationSpecKt.m107infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1000, 0, EasingKt.getLinearEasing(), 2, null), RepeatMode.Restart, 0L, 4, null), "phase", composerStartRestartGroup, (InfiniteRepeatableSpec.$stable << 9) | InfiniteTransition.$stable | 25008, 0);
            float f6 = 16;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m668padding3ABfNKs(SizeKt.fillMaxSize$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), 0.0f, 1, null), Dp.m6403constructorimpl(f6)), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            Arrangement arrangement4 = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement4.getTop();
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            a constructor8 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor8);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
            e eVarG5 = p035i0.a.g(companion4, composerM3407constructorimpl8, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl8, currentCompositionLocalMap);
            if (composerM3407constructorimpl8.getInserting()) {
                mutableState = mutableState14;
            } else {
                mutableState = mutableState14;
                if (!o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                }
                Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier, companion4.getSetModifier());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Modifier modifierM672paddingqDBjuR0$default = PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f6), 7, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement4.getSpaceBetween(), companion3.getCenterVertically(), composerStartRestartGroup, 54);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM672paddingqDBjuR0$default);
                constructor = companion4.getConstructor();
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
                e eVarG6 = p035i0.a.g(companion4, composerM3407constructorimpl, measurePolicyRowMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap2);
                if (composerM3407constructorimpl.getInserting()) {
                    arrangement = arrangement4;
                } else {
                    arrangement = arrangement4;
                    if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier2, companion4.getSetModifier());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    if (gVar != null) {
                        objValueOf = Integer.valueOf(gVar.getIndex() + 1);
                    } else {
                        objValueOf = "";
                    }
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i8 = MaterialTheme.$stable;
                    TextStyle titleLarge = materialTheme.getTypography(composerStartRestartGroup, i8).getTitleLarge();
                    long j5 = p107y3.a.f15990o;
                    FontWeight.Companion companion5 = FontWeight.Companion;
                    TextKt.m2432Text4IGK_g("Edit Page " + objValueOf, (Modifier) null, j5, 0L, (FontStyle) null, companion5.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, titleLarge, composerStartRestartGroup, 196992, 0, 65498);
                    int i9 = (i7 >> 6) & 14;
                    mutableState2 = mutableState;
                    arrangement2 = arrangement;
                    IconButtonKt.IconButton(onCancel, null, false, null, null, T.f14438a, composerStartRestartGroup, i9 | 196608, 30);
                    composerStartRestartGroup.endNode();
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
                    constructor2 = companion4.getConstructor();
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
                    eVarG = p035i0.a.g(companion4, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl2, currentCompositionLocalMap3);
                    if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier3, companion4.getSetModifier());
                    TextStyle bodySmall = materialTheme.getTypography(composerStartRestartGroup, i8).getBodySmall();
                    long j6 = p107y3.a.p;
                    TextKt.m2432Text4IGK_g("Selection Tool", (Modifier) null, j6, 0L, (FontStyle) null, companion5.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall, composerStartRestartGroup, 196998, 0, 65498);
                    float f7 = 8;
                    b.m(f7, companion, composerStartRestartGroup, 6);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    float f8 = 12;
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement2.m548spacedBy0680j_4(Dp.m6403constructorimpl(f8)), companion3.getTop(), composerStartRestartGroup, 6);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                    constructor3 = companion4.getConstructor();
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
                    e eVarG7 = p035i0.a.g(companion4, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl3, currentCompositionLocalMap4);
                    if (composerM3407constructorimpl3.getInserting()) {
                        arrangement3 = arrangement2;
                    } else {
                        if (!o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        }
                        arrangement3 = arrangement2;
                        Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier4, companion4.getSetModifier());
                        if (((EnumC2604o4) mutableState2.getValue()) == EnumC2604o4.f15367o) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        composerStartRestartGroup.startReplaceGroup(-1169294829);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == companion2.getEmpty()) {
                            mutableState3 = mutableState2;
                            objRememberedValue = new I(16, mutableState3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            mutableState3 = mutableState2;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        mutableState4 = mutableState3;
                        Arrangement arrangement5 = arrangement3;
                        d("Rectangle", z3, (a) objRememberedValue, RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                        if (((EnumC2604o4) mutableState4.getValue()) == EnumC2604o4.p) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        composerStartRestartGroup.startReplaceGroup(-1169286256);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion2.getEmpty()) {
                            mutableState5 = mutableState4;
                            objRememberedValue2 = new I(17, mutableState5);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            mutableState5 = mutableState4;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        MutableState mutableState22 = mutableState5;
                        d("Circle", z4, (a) objRememberedValue2, RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                        b.n(composerStartRestartGroup, f6, companion, composerStartRestartGroup, 6);
                        TextKt.m2432Text4IGK_g("Edit Action", (Modifier) null, j6, 0L, (FontStyle) null, companion5.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i8).getBodySmall(), composerStartRestartGroup, 196998, 0, 65498);
                        b.m(f7, companion, composerStartRestartGroup, 6);
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement5.m548spacedBy0680j_4(Dp.m6403constructorimpl(f8)), companion3.getTop(), composerStartRestartGroup, 6);
                        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                        constructor4 = companion4.getConstructor();
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
                        e eVarG8 = p035i0.a.g(companion4, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy3, composerM3407constructorimpl4, currentCompositionLocalMap5);
                        if (composerM3407constructorimpl4.getInserting()) {
                            f5 = f6;
                        } else {
                            f5 = f6;
                            if (!o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier5, companion4.getSetModifier());
                            if (((EnumC2380a4) mutableState15.getValue()) == EnumC2380a4.f14770o) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            composerStartRestartGroup.startReplaceGroup(-1169264808);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == companion2.getEmpty()) {
                                mutableState6 = mutableState15;
                                objRememberedValue3 = new I(18, mutableState6);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                mutableState6 = mutableState15;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            float f9 = f5;
                            mutableState7 = mutableState6;
                            d("Invert Colors", z5, (a) objRememberedValue3, RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                            if (((EnumC2380a4) mutableState7.getValue()) == EnumC2380a4.p) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            composerStartRestartGroup.startReplaceGroup(-1169255491);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue4 == companion2.getEmpty()) {
                                mutableState8 = mutableState7;
                                objRememberedValue4 = new I(19, mutableState8);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            } else {
                                mutableState8 = mutableState7;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            MutableState mutableState23 = mutableState8;
                            d("Paint Black", z6, (a) objRememberedValue4, RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                            b.n(composerStartRestartGroup, f9, companion, composerStartRestartGroup, 6);
                            TextKt.m2432Text4IGK_g("History", (Modifier) null, j6, 0L, (FontStyle) null, companion5.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i8).getBodySmall(), composerStartRestartGroup, 196998, 0, 65498);
                            b.m(f7, companion, composerStartRestartGroup, 6);
                            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement5.m548spacedBy0680j_4(Dp.m6403constructorimpl(f8)), companion3.getTop(), composerStartRestartGroup, 6);
                            currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default3);
                            constructor5 = companion4.getConstructor();
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
                            eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy4, composerM3407constructorimpl5, currentCompositionLocalMap6);
                            if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier6, companion4.getSetModifier());
                            Icons icons = Icons.INSTANCE;
                            ImageVector keyboardArrowLeft = KeyboardArrowLeftKt.getKeyboardArrowLeft(icons.getDefault());
                            boolean z8 = !((List) mutableState16.getValue()).isEmpty();
                            composerStartRestartGroup.startReplaceGroup(-1169231984);
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue5 == companion2.getEmpty()) {
                                mutableState9 = mutableState16;
                                mutableState10 = mutableState17;
                                objRememberedValue5 = new C2412c4(0, mutableState9, mutableState10);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            } else {
                                mutableState9 = mutableState16;
                                mutableState10 = mutableState17;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            mutableState11 = mutableState10;
                            mutableState12 = mutableState9;
                            b("Undo", keyboardArrowLeft, z8, (a) objRememberedValue5, RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 3078);
                            ImageVector keyboardArrowRight = KeyboardArrowRightKt.getKeyboardArrowRight(icons.getDefault());
                            boolean z9 = !((List) mutableState11.getValue()).isEmpty();
                            composerStartRestartGroup.startReplaceGroup(-1169213590);
                            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue6 == companion2.getEmpty()) {
                                mutableState13 = mutableState11;
                                objRememberedValue6 = new C2412c4(1, mutableState13, mutableState12);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                            } else {
                                mutableState13 = mutableState11;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            b("Redo", keyboardArrowRight, z9, (a) objRememberedValue6, RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 3078);
                            b.r(composerStartRestartGroup, f9, companion, composerStartRestartGroup, 6);
                            BoxWithConstraintsKt.BoxWithConstraints(b.g(b.f(f8, SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance, companion, 1.0f, false, 2, null), 0.0f, 1, null), ColorKt.Color(4279176986L)), f8), companion3.getCenter(), false, ComposableLambdaKt.rememberComposableLambda(1986572859, true, new C2524j4(gVar, mutableState18, mutableState20, mutableState21, mutableState19, mutableState12, mutableState22, mutableState23, stateAnimateFloat, mutableState13), composerStartRestartGroup, 54), composerStartRestartGroup, 3120, 4);
                            b.m(f9, companion, composerStartRestartGroup, 6);
                            Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement5.getTop(), companion3.getCenterHorizontally(), composerStartRestartGroup, 48);
                            currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default4);
                            constructor6 = companion4.getConstructor();
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
                            eVarG3 = p035i0.a.g(companion4, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy3, composerM3407constructorimpl6, currentCompositionLocalMap7);
                            if (composerM3407constructorimpl6.getInserting() || !o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier7, companion4.getSetModifier());
                            TextKt.m2432Text4IGK_g("Draw selections, click Apply to commit changes", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i8).getBodySmall(), composerStartRestartGroup, 390, 0, 65530);
                            b.m(f9, companion, composerStartRestartGroup, 6);
                            Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(arrangement5.m548spacedBy0680j_4(Dp.m6403constructorimpl(f9)), companion3.getTop(), composerStartRestartGroup, 6);
                            currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default5);
                            constructor7 = companion4.getConstructor();
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
                            eVarG4 = p035i0.a.g(companion4, composerM3407constructorimpl7, measurePolicyRowMeasurePolicy5, composerM3407constructorimpl7, currentCompositionLocalMap8);
                            if (composerM3407constructorimpl7.getInserting() || !o.b(composerM3407constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                                p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG4);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier8, companion4.getSetModifier());
                            composer2 = composerStartRestartGroup;
                            ButtonKt.OutlinedButton(onCancel, SizeKt.m699height3ABfNKs(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), Dp.m6403constructorimpl(56)), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f8)), ButtonDefaults.INSTANCE.m1530outlinedButtonColorsro_MJ88(Color.Companion.m3962getTransparent0d7_KjU(), j5, 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 54, 12), null, BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(1), p107y3.a.f15991r), null, null, T.f14439b, composer2, i9 | 806879232, 420);
                            composer2.startReplaceGroup(-1168621978);
                            if ((i7 & 112) == 32) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            objRememberedValue7 = composer2.rememberedValue();
                            if (z7 || objRememberedValue7 == companion2.getEmpty()) {
                                objRememberedValue7 = new C2290i(5, onSave, mutableState12);
                                composer2.updateRememberedValue(objRememberedValue7);
                            }
                            composer2.endReplaceGroup();
                            q.a("Save Edits", (a) objRememberedValue7, RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), null, false, false, composer2, 6, 56);
                            if (S2.b(composer2)) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = companion;
                        }
                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG8);
                        Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier5, companion4.getSetModifier());
                        if (((EnumC2380a4) mutableState15.getValue()) == EnumC2380a4.f14770o) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        composerStartRestartGroup.startReplaceGroup(-1169264808);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion2.getEmpty()) {
                            mutableState6 = mutableState15;
                            objRememberedValue3 = new I(18, mutableState6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            mutableState6 = mutableState15;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        float f10 = f5;
                        mutableState7 = mutableState6;
                        d("Invert Colors", z5, (a) objRememberedValue3, RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                        if (((EnumC2380a4) mutableState7.getValue()) == EnumC2380a4.p) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        composerStartRestartGroup.startReplaceGroup(-1169255491);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion2.getEmpty()) {
                            mutableState8 = mutableState7;
                            objRememberedValue4 = new I(19, mutableState8);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            mutableState8 = mutableState7;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        MutableState mutableState24 = mutableState8;
                        d("Paint Black", z6, (a) objRememberedValue4, RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                        b.n(composerStartRestartGroup, f10, companion, composerStartRestartGroup, 6);
                        TextKt.m2432Text4IGK_g("History", (Modifier) null, j6, 0L, (FontStyle) null, companion5.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i8).getBodySmall(), composerStartRestartGroup, 196998, 0, 65498);
                        b.m(f7, companion, composerStartRestartGroup, 6);
                        Modifier modifierFillMaxWidth$default6 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(arrangement5.m548spacedBy0680j_4(Dp.m6403constructorimpl(f8)), companion3.getTop(), composerStartRestartGroup, 6);
                        currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default6);
                        constructor5 = companion4.getConstructor();
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
                        eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy6, composerM3407constructorimpl5, currentCompositionLocalMap9);
                        if (composerM3407constructorimpl5.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier9, companion4.getSetModifier());
                        Icons icons2 = Icons.INSTANCE;
                        ImageVector keyboardArrowLeft2 = KeyboardArrowLeftKt.getKeyboardArrowLeft(icons2.getDefault());
                        boolean z10 = !((List) mutableState16.getValue()).isEmpty();
                        composerStartRestartGroup.startReplaceGroup(-1169231984);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion2.getEmpty()) {
                            mutableState9 = mutableState16;
                            mutableState10 = mutableState17;
                            objRememberedValue5 = new C2412c4(0, mutableState9, mutableState10);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        } else {
                            mutableState9 = mutableState16;
                            mutableState10 = mutableState17;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        mutableState11 = mutableState10;
                        mutableState12 = mutableState9;
                        b("Undo", keyboardArrowLeft2, z10, (a) objRememberedValue5, RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 3078);
                        ImageVector keyboardArrowRight2 = KeyboardArrowRightKt.getKeyboardArrowRight(icons2.getDefault());
                        boolean z11 = !((List) mutableState11.getValue()).isEmpty();
                        composerStartRestartGroup.startReplaceGroup(-1169213590);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue6 == companion2.getEmpty()) {
                            mutableState13 = mutableState11;
                            objRememberedValue6 = new C2412c4(1, mutableState13, mutableState12);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            mutableState13 = mutableState11;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        b("Redo", keyboardArrowRight2, z11, (a) objRememberedValue6, RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 3078);
                        b.r(composerStartRestartGroup, f10, companion, composerStartRestartGroup, 6);
                        BoxWithConstraintsKt.BoxWithConstraints(b.g(b.f(f8, SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance, companion, 1.0f, false, 2, null), 0.0f, 1, null), ColorKt.Color(4279176986L)), f8), companion3.getCenter(), false, ComposableLambdaKt.rememberComposableLambda(1986572859, true, new C2524j4(gVar, mutableState18, mutableState20, mutableState21, mutableState19, mutableState12, mutableState22, mutableState24, stateAnimateFloat, mutableState13), composerStartRestartGroup, 54), composerStartRestartGroup, 3120, 4);
                        b.m(f10, companion, composerStartRestartGroup, 6);
                        Modifier modifierFillMaxWidth$default7 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement5.getTop(), companion3.getCenterHorizontally(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap10 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default7);
                        constructor6 = companion4.getConstructor();
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
                        eVarG3 = p035i0.a.g(companion4, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy4, composerM3407constructorimpl6, currentCompositionLocalMap10);
                        if (composerM3407constructorimpl6.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier10, companion4.getSetModifier());
                        TextKt.m2432Text4IGK_g("Draw selections, click Apply to commit changes", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i8).getBodySmall(), composerStartRestartGroup, 390, 0, 65530);
                        b.m(f10, companion, composerStartRestartGroup, 6);
                        Modifier modifierFillMaxWidth$default8 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy7 = RowKt.rowMeasurePolicy(arrangement5.m548spacedBy0680j_4(Dp.m6403constructorimpl(f10)), companion3.getTop(), composerStartRestartGroup, 6);
                        currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap11 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default8);
                        constructor7 = companion4.getConstructor();
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
                        eVarG4 = p035i0.a.g(companion4, composerM3407constructorimpl7, measurePolicyRowMeasurePolicy7, composerM3407constructorimpl7, currentCompositionLocalMap11);
                        if (composerM3407constructorimpl7.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG4);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG4);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier11, companion4.getSetModifier());
                        composer2 = composerStartRestartGroup;
                        ButtonKt.OutlinedButton(onCancel, SizeKt.m699height3ABfNKs(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), Dp.m6403constructorimpl(56)), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f8)), ButtonDefaults.INSTANCE.m1530outlinedButtonColorsro_MJ88(Color.Companion.m3962getTransparent0d7_KjU(), j5, 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 54, 12), null, BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(1), p107y3.a.f15991r), null, null, T.f14439b, composer2, i9 | 806879232, 420);
                        composer2.startReplaceGroup(-1168621978);
                        if ((i7 & 112) == 32) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        objRememberedValue7 = composer2.rememberedValue();
                        if (z7) {
                            objRememberedValue7 = new C2290i(5, onSave, mutableState12);
                            composer2.updateRememberedValue(objRememberedValue7);
                        } else {
                            objRememberedValue7 = new C2290i(5, onSave, mutableState12);
                            composer2.updateRememberedValue(objRememberedValue7);
                        }
                        composer2.endReplaceGroup();
                        q.a("Save Edits", (a) objRememberedValue7, RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), null, false, false, composer2, 6, 56);
                        if (S2.b(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = companion;
                    }
                    arrangement3 = arrangement2;
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG7);
                    arrangement3 = arrangement2;
                    Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier4, companion4.getSetModifier());
                    if (((EnumC2604o4) mutableState2.getValue()) == EnumC2604o4.f15367o) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    composerStartRestartGroup.startReplaceGroup(-1169294829);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == companion2.getEmpty()) {
                        mutableState3 = mutableState2;
                        objRememberedValue = new I(16, mutableState3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        mutableState3 = mutableState2;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    mutableState4 = mutableState3;
                    Arrangement arrangement6 = arrangement3;
                    d("Rectangle", z3, (a) objRememberedValue, RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                    if (((EnumC2604o4) mutableState4.getValue()) == EnumC2604o4.p) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    composerStartRestartGroup.startReplaceGroup(-1169286256);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion2.getEmpty()) {
                        mutableState5 = mutableState4;
                        objRememberedValue2 = new I(17, mutableState5);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        mutableState5 = mutableState4;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    MutableState mutableState25 = mutableState5;
                    d("Circle", z4, (a) objRememberedValue2, RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                    b.n(composerStartRestartGroup, f6, companion, composerStartRestartGroup, 6);
                    TextKt.m2432Text4IGK_g("Edit Action", (Modifier) null, j6, 0L, (FontStyle) null, companion5.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i8).getBodySmall(), composerStartRestartGroup, 196998, 0, 65498);
                    b.m(f7, companion, composerStartRestartGroup, 6);
                    Modifier modifierFillMaxWidth$default9 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy8 = RowKt.rowMeasurePolicy(arrangement6.m548spacedBy0680j_4(Dp.m6403constructorimpl(f8)), companion3.getTop(), composerStartRestartGroup, 6);
                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap12 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier12 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default9);
                    constructor4 = companion4.getConstructor();
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
                    e eVarG9 = p035i0.a.g(companion4, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy8, composerM3407constructorimpl4, currentCompositionLocalMap12);
                    if (composerM3407constructorimpl4.getInserting()) {
                        f5 = f6;
                        if (!o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier12, companion4.getSetModifier());
                        if (((EnumC2380a4) mutableState15.getValue()) == EnumC2380a4.f14770o) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        composerStartRestartGroup.startReplaceGroup(-1169264808);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion2.getEmpty()) {
                            mutableState6 = mutableState15;
                            objRememberedValue3 = new I(18, mutableState6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            mutableState6 = mutableState15;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        float f11 = f5;
                        mutableState7 = mutableState6;
                        d("Invert Colors", z5, (a) objRememberedValue3, RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                        if (((EnumC2380a4) mutableState7.getValue()) == EnumC2380a4.p) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        composerStartRestartGroup.startReplaceGroup(-1169255491);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion2.getEmpty()) {
                            mutableState8 = mutableState7;
                            objRememberedValue4 = new I(19, mutableState8);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            mutableState8 = mutableState7;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        MutableState mutableState26 = mutableState8;
                        d("Paint Black", z6, (a) objRememberedValue4, RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                        b.n(composerStartRestartGroup, f11, companion, composerStartRestartGroup, 6);
                        TextKt.m2432Text4IGK_g("History", (Modifier) null, j6, 0L, (FontStyle) null, companion5.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i8).getBodySmall(), composerStartRestartGroup, 196998, 0, 65498);
                        b.m(f7, companion, composerStartRestartGroup, 6);
                        Modifier modifierFillMaxWidth$default10 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy9 = RowKt.rowMeasurePolicy(arrangement6.m548spacedBy0680j_4(Dp.m6403constructorimpl(f8)), companion3.getTop(), composerStartRestartGroup, 6);
                        currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap13 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier13 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default10);
                        constructor5 = companion4.getConstructor();
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
                        eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy9, composerM3407constructorimpl5, currentCompositionLocalMap13);
                        if (composerM3407constructorimpl5.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier13, companion4.getSetModifier());
                        Icons icons3 = Icons.INSTANCE;
                        ImageVector keyboardArrowLeft3 = KeyboardArrowLeftKt.getKeyboardArrowLeft(icons3.getDefault());
                        boolean z12 = !((List) mutableState16.getValue()).isEmpty();
                        composerStartRestartGroup.startReplaceGroup(-1169231984);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion2.getEmpty()) {
                            mutableState9 = mutableState16;
                            mutableState10 = mutableState17;
                            objRememberedValue5 = new C2412c4(0, mutableState9, mutableState10);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        } else {
                            mutableState9 = mutableState16;
                            mutableState10 = mutableState17;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        mutableState11 = mutableState10;
                        mutableState12 = mutableState9;
                        b("Undo", keyboardArrowLeft3, z12, (a) objRememberedValue5, RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 3078);
                        ImageVector keyboardArrowRight3 = KeyboardArrowRightKt.getKeyboardArrowRight(icons3.getDefault());
                        boolean z13 = !((List) mutableState11.getValue()).isEmpty();
                        composerStartRestartGroup.startReplaceGroup(-1169213590);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue6 == companion2.getEmpty()) {
                            mutableState13 = mutableState11;
                            objRememberedValue6 = new C2412c4(1, mutableState13, mutableState12);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            mutableState13 = mutableState11;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        b("Redo", keyboardArrowRight3, z13, (a) objRememberedValue6, RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 3078);
                        b.r(composerStartRestartGroup, f11, companion, composerStartRestartGroup, 6);
                        BoxWithConstraintsKt.BoxWithConstraints(b.g(b.f(f8, SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance, companion, 1.0f, false, 2, null), 0.0f, 1, null), ColorKt.Color(4279176986L)), f8), companion3.getCenter(), false, ComposableLambdaKt.rememberComposableLambda(1986572859, true, new C2524j4(gVar, mutableState18, mutableState20, mutableState21, mutableState19, mutableState12, mutableState25, mutableState26, stateAnimateFloat, mutableState13), composerStartRestartGroup, 54), composerStartRestartGroup, 3120, 4);
                        b.m(f11, companion, composerStartRestartGroup, 6);
                        Modifier modifierFillMaxWidth$default11 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(arrangement6.getTop(), companion3.getCenterHorizontally(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap14 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier14 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default11);
                        constructor6 = companion4.getConstructor();
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
                        eVarG3 = p035i0.a.g(companion4, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy5, composerM3407constructorimpl6, currentCompositionLocalMap14);
                        if (composerM3407constructorimpl6.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier14, companion4.getSetModifier());
                        TextKt.m2432Text4IGK_g("Draw selections, click Apply to commit changes", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i8).getBodySmall(), composerStartRestartGroup, 390, 0, 65530);
                        b.m(f11, companion, composerStartRestartGroup, 6);
                        Modifier modifierFillMaxWidth$default12 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy10 = RowKt.rowMeasurePolicy(arrangement6.m548spacedBy0680j_4(Dp.m6403constructorimpl(f11)), companion3.getTop(), composerStartRestartGroup, 6);
                        currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap15 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier15 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default12);
                        constructor7 = companion4.getConstructor();
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
                        eVarG4 = p035i0.a.g(companion4, composerM3407constructorimpl7, measurePolicyRowMeasurePolicy10, composerM3407constructorimpl7, currentCompositionLocalMap15);
                        if (composerM3407constructorimpl7.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG4);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG4);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier15, companion4.getSetModifier());
                        composer2 = composerStartRestartGroup;
                        ButtonKt.OutlinedButton(onCancel, SizeKt.m699height3ABfNKs(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), Dp.m6403constructorimpl(56)), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f8)), ButtonDefaults.INSTANCE.m1530outlinedButtonColorsro_MJ88(Color.Companion.m3962getTransparent0d7_KjU(), j5, 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 54, 12), null, BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(1), p107y3.a.f15991r), null, null, T.f14439b, composer2, i9 | 806879232, 420);
                        composer2.startReplaceGroup(-1168621978);
                        if ((i7 & 112) == 32) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        objRememberedValue7 = composer2.rememberedValue();
                        if (z7) {
                            objRememberedValue7 = new C2290i(5, onSave, mutableState12);
                            composer2.updateRememberedValue(objRememberedValue7);
                        } else {
                            objRememberedValue7 = new C2290i(5, onSave, mutableState12);
                            composer2.updateRememberedValue(objRememberedValue7);
                        }
                        composer2.endReplaceGroup();
                        q.a("Save Edits", (a) objRememberedValue7, RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), null, false, false, composer2, 6, 56);
                        if (S2.b(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = companion;
                    } else {
                        f5 = f6;
                    }
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG9);
                    Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier12, companion4.getSetModifier());
                    if (((EnumC2380a4) mutableState15.getValue()) == EnumC2380a4.f14770o) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    composerStartRestartGroup.startReplaceGroup(-1169264808);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion2.getEmpty()) {
                        mutableState6 = mutableState15;
                        objRememberedValue3 = new I(18, mutableState6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        mutableState6 = mutableState15;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    float f12 = f5;
                    mutableState7 = mutableState6;
                    d("Invert Colors", z5, (a) objRememberedValue3, RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                    if (((EnumC2380a4) mutableState7.getValue()) == EnumC2380a4.p) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    composerStartRestartGroup.startReplaceGroup(-1169255491);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion2.getEmpty()) {
                        mutableState8 = mutableState7;
                        objRememberedValue4 = new I(19, mutableState8);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        mutableState8 = mutableState7;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    MutableState mutableState27 = mutableState8;
                    d("Paint Black", z6, (a) objRememberedValue4, RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                    b.n(composerStartRestartGroup, f12, companion, composerStartRestartGroup, 6);
                    TextKt.m2432Text4IGK_g("History", (Modifier) null, j6, 0L, (FontStyle) null, companion5.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i8).getBodySmall(), composerStartRestartGroup, 196998, 0, 65498);
                    b.m(f7, companion, composerStartRestartGroup, 6);
                    Modifier modifierFillMaxWidth$default13 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy11 = RowKt.rowMeasurePolicy(arrangement6.m548spacedBy0680j_4(Dp.m6403constructorimpl(f8)), companion3.getTop(), composerStartRestartGroup, 6);
                    currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap16 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier16 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default13);
                    constructor5 = companion4.getConstructor();
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
                    eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy11, composerM3407constructorimpl5, currentCompositionLocalMap16);
                    if (composerM3407constructorimpl5.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier16, companion4.getSetModifier());
                    Icons icons4 = Icons.INSTANCE;
                    ImageVector keyboardArrowLeft4 = KeyboardArrowLeftKt.getKeyboardArrowLeft(icons4.getDefault());
                    boolean z14 = !((List) mutableState16.getValue()).isEmpty();
                    composerStartRestartGroup.startReplaceGroup(-1169231984);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion2.getEmpty()) {
                        mutableState9 = mutableState16;
                        mutableState10 = mutableState17;
                        objRememberedValue5 = new C2412c4(0, mutableState9, mutableState10);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        mutableState9 = mutableState16;
                        mutableState10 = mutableState17;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    mutableState11 = mutableState10;
                    mutableState12 = mutableState9;
                    b("Undo", keyboardArrowLeft4, z14, (a) objRememberedValue5, RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 3078);
                    ImageVector keyboardArrowRight4 = KeyboardArrowRightKt.getKeyboardArrowRight(icons4.getDefault());
                    boolean z15 = !((List) mutableState11.getValue()).isEmpty();
                    composerStartRestartGroup.startReplaceGroup(-1169213590);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == companion2.getEmpty()) {
                        mutableState13 = mutableState11;
                        objRememberedValue6 = new C2412c4(1, mutableState13, mutableState12);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        mutableState13 = mutableState11;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    b("Redo", keyboardArrowRight4, z15, (a) objRememberedValue6, RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 3078);
                    b.r(composerStartRestartGroup, f12, companion, composerStartRestartGroup, 6);
                    BoxWithConstraintsKt.BoxWithConstraints(b.g(b.f(f8, SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance, companion, 1.0f, false, 2, null), 0.0f, 1, null), ColorKt.Color(4279176986L)), f8), companion3.getCenter(), false, ComposableLambdaKt.rememberComposableLambda(1986572859, true, new C2524j4(gVar, mutableState18, mutableState20, mutableState21, mutableState19, mutableState12, mutableState25, mutableState27, stateAnimateFloat, mutableState13), composerStartRestartGroup, 54), composerStartRestartGroup, 3120, 4);
                    b.m(f12, companion, composerStartRestartGroup, 6);
                    Modifier modifierFillMaxWidth$default14 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(arrangement6.getTop(), companion3.getCenterHorizontally(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap17 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier17 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default14);
                    constructor6 = companion4.getConstructor();
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
                    eVarG3 = p035i0.a.g(companion4, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy6, composerM3407constructorimpl6, currentCompositionLocalMap17);
                    if (composerM3407constructorimpl6.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier17, companion4.getSetModifier());
                    TextKt.m2432Text4IGK_g("Draw selections, click Apply to commit changes", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i8).getBodySmall(), composerStartRestartGroup, 390, 0, 65530);
                    b.m(f12, companion, composerStartRestartGroup, 6);
                    Modifier modifierFillMaxWidth$default15 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy12 = RowKt.rowMeasurePolicy(arrangement6.m548spacedBy0680j_4(Dp.m6403constructorimpl(f12)), companion3.getTop(), composerStartRestartGroup, 6);
                    currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap18 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier18 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default15);
                    constructor7 = companion4.getConstructor();
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
                    eVarG4 = p035i0.a.g(companion4, composerM3407constructorimpl7, measurePolicyRowMeasurePolicy12, composerM3407constructorimpl7, currentCompositionLocalMap18);
                    if (composerM3407constructorimpl7.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG4);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG4);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier18, companion4.getSetModifier());
                    composer2 = composerStartRestartGroup;
                    ButtonKt.OutlinedButton(onCancel, SizeKt.m699height3ABfNKs(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), Dp.m6403constructorimpl(56)), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f8)), ButtonDefaults.INSTANCE.m1530outlinedButtonColorsro_MJ88(Color.Companion.m3962getTransparent0d7_KjU(), j5, 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 54, 12), null, BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(1), p107y3.a.f15991r), null, null, T.f14439b, composer2, i9 | 806879232, 420);
                    composer2.startReplaceGroup(-1168621978);
                    if ((i7 & 112) == 32) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    objRememberedValue7 = composer2.rememberedValue();
                    if (z7) {
                        objRememberedValue7 = new C2290i(5, onSave, mutableState12);
                        composer2.updateRememberedValue(objRememberedValue7);
                    } else {
                        objRememberedValue7 = new C2290i(5, onSave, mutableState12);
                        composer2.updateRememberedValue(objRememberedValue7);
                    }
                    composer2.endReplaceGroup();
                    q.a("Save Edits", (a) objRememberedValue7, RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), null, false, false, composer2, 6, 56);
                    if (S2.b(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion;
                }
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG6);
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier2, companion4.getSetModifier());
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                if (gVar != null) {
                    objValueOf = Integer.valueOf(gVar.getIndex() + 1);
                } else {
                    objValueOf = "";
                }
                MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                int i10 = MaterialTheme.$stable;
                TextStyle titleLarge2 = materialTheme2.getTypography(composerStartRestartGroup, i10).getTitleLarge();
                long j7 = p107y3.a.f15990o;
                FontWeight.Companion companion6 = FontWeight.Companion;
                TextKt.m2432Text4IGK_g("Edit Page " + objValueOf, (Modifier) null, j7, 0L, (FontStyle) null, companion6.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, titleLarge2, composerStartRestartGroup, 196992, 0, 65498);
                int i11 = (i7 >> 6) & 14;
                mutableState2 = mutableState;
                arrangement2 = arrangement;
                IconButtonKt.IconButton(onCancel, null, false, null, null, T.f14438a, composerStartRestartGroup, i11 | 196608, 30);
                composerStartRestartGroup.endNode();
                MeasurePolicy measurePolicyColumnMeasurePolicy7 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap19 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier19 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
                constructor2 = companion4.getConstructor();
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
                eVarG = p035i0.a.g(companion4, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy7, composerM3407constructorimpl2, currentCompositionLocalMap19);
                if (composerM3407constructorimpl2.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                } else {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier19, companion4.getSetModifier());
                TextStyle bodySmall2 = materialTheme2.getTypography(composerStartRestartGroup, i10).getBodySmall();
                long j8 = p107y3.a.p;
                TextKt.m2432Text4IGK_g("Selection Tool", (Modifier) null, j8, 0L, (FontStyle) null, companion6.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall2, composerStartRestartGroup, 196998, 0, 65498);
                float f13 = 8;
                b.m(f13, companion, composerStartRestartGroup, 6);
                Modifier modifierFillMaxWidth$default16 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                float f14 = 12;
                MeasurePolicy measurePolicyRowMeasurePolicy13 = RowKt.rowMeasurePolicy(arrangement2.m548spacedBy0680j_4(Dp.m6403constructorimpl(f14)), companion3.getTop(), composerStartRestartGroup, 6);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap20 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier20 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default16);
                constructor3 = companion4.getConstructor();
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
                e eVarG10 = p035i0.a.g(companion4, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy13, composerM3407constructorimpl3, currentCompositionLocalMap20);
                if (composerM3407constructorimpl3.getInserting()) {
                    if (!o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    }
                    arrangement3 = arrangement2;
                    Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier20, companion4.getSetModifier());
                    if (((EnumC2604o4) mutableState2.getValue()) == EnumC2604o4.f15367o) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    composerStartRestartGroup.startReplaceGroup(-1169294829);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == companion2.getEmpty()) {
                        mutableState3 = mutableState2;
                        objRememberedValue = new I(16, mutableState3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        mutableState3 = mutableState2;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    mutableState4 = mutableState3;
                    Arrangement arrangement7 = arrangement3;
                    d("Rectangle", z3, (a) objRememberedValue, RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                    if (((EnumC2604o4) mutableState4.getValue()) == EnumC2604o4.p) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    composerStartRestartGroup.startReplaceGroup(-1169286256);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion2.getEmpty()) {
                        mutableState5 = mutableState4;
                        objRememberedValue2 = new I(17, mutableState5);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        mutableState5 = mutableState4;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    MutableState mutableState28 = mutableState5;
                    d("Circle", z4, (a) objRememberedValue2, RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                    b.n(composerStartRestartGroup, f6, companion, composerStartRestartGroup, 6);
                    TextKt.m2432Text4IGK_g("Edit Action", (Modifier) null, j8, 0L, (FontStyle) null, companion6.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme2.getTypography(composerStartRestartGroup, i10).getBodySmall(), composerStartRestartGroup, 196998, 0, 65498);
                    b.m(f13, companion, composerStartRestartGroup, 6);
                    Modifier modifierFillMaxWidth$default17 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy14 = RowKt.rowMeasurePolicy(arrangement7.m548spacedBy0680j_4(Dp.m6403constructorimpl(f14)), companion3.getTop(), composerStartRestartGroup, 6);
                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier110 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default17);
                    constructor4 = companion4.getConstructor();
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
                    e eVarG11 = p035i0.a.g(companion4, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy14, composerM3407constructorimpl4, currentCompositionLocalMap110);
                    if (composerM3407constructorimpl4.getInserting()) {
                        f5 = f6;
                        if (!o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier110, companion4.getSetModifier());
                        if (((EnumC2380a4) mutableState15.getValue()) == EnumC2380a4.f14770o) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        composerStartRestartGroup.startReplaceGroup(-1169264808);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion2.getEmpty()) {
                            mutableState6 = mutableState15;
                            objRememberedValue3 = new I(18, mutableState6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            mutableState6 = mutableState15;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        float f15 = f5;
                        mutableState7 = mutableState6;
                        d("Invert Colors", z5, (a) objRememberedValue3, RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                        if (((EnumC2380a4) mutableState7.getValue()) == EnumC2380a4.p) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        composerStartRestartGroup.startReplaceGroup(-1169255491);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion2.getEmpty()) {
                            mutableState8 = mutableState7;
                            objRememberedValue4 = new I(19, mutableState8);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            mutableState8 = mutableState7;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        MutableState mutableState29 = mutableState8;
                        d("Paint Black", z6, (a) objRememberedValue4, RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                        b.n(composerStartRestartGroup, f15, companion, composerStartRestartGroup, 6);
                        TextKt.m2432Text4IGK_g("History", (Modifier) null, j8, 0L, (FontStyle) null, companion6.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme2.getTypography(composerStartRestartGroup, i10).getBodySmall(), composerStartRestartGroup, 196998, 0, 65498);
                        b.m(f13, companion, composerStartRestartGroup, 6);
                        Modifier modifierFillMaxWidth$default18 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy15 = RowKt.rowMeasurePolicy(arrangement7.m548spacedBy0680j_4(Dp.m6403constructorimpl(f14)), companion3.getTop(), composerStartRestartGroup, 6);
                        currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier111 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default18);
                        constructor5 = companion4.getConstructor();
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
                        eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy15, composerM3407constructorimpl5, currentCompositionLocalMap111);
                        if (composerM3407constructorimpl5.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier111, companion4.getSetModifier());
                        Icons icons5 = Icons.INSTANCE;
                        ImageVector keyboardArrowLeft5 = KeyboardArrowLeftKt.getKeyboardArrowLeft(icons5.getDefault());
                        boolean z16 = !((List) mutableState16.getValue()).isEmpty();
                        composerStartRestartGroup.startReplaceGroup(-1169231984);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion2.getEmpty()) {
                            mutableState9 = mutableState16;
                            mutableState10 = mutableState17;
                            objRememberedValue5 = new C2412c4(0, mutableState9, mutableState10);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        } else {
                            mutableState9 = mutableState16;
                            mutableState10 = mutableState17;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        mutableState11 = mutableState10;
                        mutableState12 = mutableState9;
                        b("Undo", keyboardArrowLeft5, z16, (a) objRememberedValue5, RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composerStartRestartGroup, 3078);
                        ImageVector keyboardArrowRight5 = KeyboardArrowRightKt.getKeyboardArrowRight(icons5.getDefault());
                        boolean z17 = !((List) mutableState11.getValue()).isEmpty();
                        composerStartRestartGroup.startReplaceGroup(-1169213590);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue6 == companion2.getEmpty()) {
                            mutableState13 = mutableState11;
                            objRememberedValue6 = new C2412c4(1, mutableState13, mutableState12);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            mutableState13 = mutableState11;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        b("Redo", keyboardArrowRight5, z17, (a) objRememberedValue6, RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composerStartRestartGroup, 3078);
                        b.r(composerStartRestartGroup, f15, companion, composerStartRestartGroup, 6);
                        BoxWithConstraintsKt.BoxWithConstraints(b.g(b.f(f14, SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance, companion, 1.0f, false, 2, null), 0.0f, 1, null), ColorKt.Color(4279176986L)), f14), companion3.getCenter(), false, ComposableLambdaKt.rememberComposableLambda(1986572859, true, new C2524j4(gVar, mutableState18, mutableState20, mutableState21, mutableState19, mutableState12, mutableState28, mutableState29, stateAnimateFloat, mutableState13), composerStartRestartGroup, 54), composerStartRestartGroup, 3120, 4);
                        b.m(f15, companion, composerStartRestartGroup, 6);
                        Modifier modifierFillMaxWidth$default19 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy8 = ColumnKt.columnMeasurePolicy(arrangement7.getTop(), companion3.getCenterHorizontally(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier112 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default19);
                        constructor6 = companion4.getConstructor();
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
                        eVarG3 = p035i0.a.g(companion4, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy8, composerM3407constructorimpl6, currentCompositionLocalMap112);
                        if (composerM3407constructorimpl6.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier112, companion4.getSetModifier());
                        TextKt.m2432Text4IGK_g("Draw selections, click Apply to commit changes", (Modifier) null, j8, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme2.getTypography(composerStartRestartGroup, i10).getBodySmall(), composerStartRestartGroup, 390, 0, 65530);
                        b.m(f15, companion, composerStartRestartGroup, 6);
                        Modifier modifierFillMaxWidth$default110 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy16 = RowKt.rowMeasurePolicy(arrangement7.m548spacedBy0680j_4(Dp.m6403constructorimpl(f15)), companion3.getTop(), composerStartRestartGroup, 6);
                        currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier113 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default110);
                        constructor7 = companion4.getConstructor();
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
                        eVarG4 = p035i0.a.g(companion4, composerM3407constructorimpl7, measurePolicyRowMeasurePolicy16, composerM3407constructorimpl7, currentCompositionLocalMap113);
                        if (composerM3407constructorimpl7.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG4);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG4);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier113, companion4.getSetModifier());
                        composer2 = composerStartRestartGroup;
                        ButtonKt.OutlinedButton(onCancel, SizeKt.m699height3ABfNKs(RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), Dp.m6403constructorimpl(56)), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f14)), ButtonDefaults.INSTANCE.m1530outlinedButtonColorsro_MJ88(Color.Companion.m3962getTransparent0d7_KjU(), j7, 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 54, 12), null, BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(1), p107y3.a.f15991r), null, null, T.f14439b, composer2, i11 | 806879232, 420);
                        composer2.startReplaceGroup(-1168621978);
                        if ((i7 & 112) == 32) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        objRememberedValue7 = composer2.rememberedValue();
                        if (z7) {
                            objRememberedValue7 = new C2290i(5, onSave, mutableState12);
                            composer2.updateRememberedValue(objRememberedValue7);
                        } else {
                            objRememberedValue7 = new C2290i(5, onSave, mutableState12);
                            composer2.updateRememberedValue(objRememberedValue7);
                        }
                        composer2.endReplaceGroup();
                        q.a("Save Edits", (a) objRememberedValue7, RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), null, false, false, composer2, 6, 56);
                        if (S2.b(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = companion;
                    } else {
                        f5 = f6;
                    }
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG11);
                    Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier110, companion4.getSetModifier());
                    if (((EnumC2380a4) mutableState15.getValue()) == EnumC2380a4.f14770o) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    composerStartRestartGroup.startReplaceGroup(-1169264808);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion2.getEmpty()) {
                        mutableState6 = mutableState15;
                        objRememberedValue3 = new I(18, mutableState6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        mutableState6 = mutableState15;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    float f16 = f5;
                    mutableState7 = mutableState6;
                    d("Invert Colors", z5, (a) objRememberedValue3, RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                    if (((EnumC2380a4) mutableState7.getValue()) == EnumC2380a4.p) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    composerStartRestartGroup.startReplaceGroup(-1169255491);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion2.getEmpty()) {
                        mutableState8 = mutableState7;
                        objRememberedValue4 = new I(19, mutableState8);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        mutableState8 = mutableState7;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    MutableState mutableState210 = mutableState8;
                    d("Paint Black", z6, (a) objRememberedValue4, RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                    b.n(composerStartRestartGroup, f16, companion, composerStartRestartGroup, 6);
                    TextKt.m2432Text4IGK_g("History", (Modifier) null, j8, 0L, (FontStyle) null, companion6.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme2.getTypography(composerStartRestartGroup, i10).getBodySmall(), composerStartRestartGroup, 196998, 0, 65498);
                    b.m(f13, companion, composerStartRestartGroup, 6);
                    Modifier modifierFillMaxWidth$default111 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy17 = RowKt.rowMeasurePolicy(arrangement7.m548spacedBy0680j_4(Dp.m6403constructorimpl(f14)), companion3.getTop(), composerStartRestartGroup, 6);
                    currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier114 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default111);
                    constructor5 = companion4.getConstructor();
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
                    eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy17, composerM3407constructorimpl5, currentCompositionLocalMap114);
                    if (composerM3407constructorimpl5.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier114, companion4.getSetModifier());
                    Icons icons6 = Icons.INSTANCE;
                    ImageVector keyboardArrowLeft6 = KeyboardArrowLeftKt.getKeyboardArrowLeft(icons6.getDefault());
                    boolean z18 = !((List) mutableState16.getValue()).isEmpty();
                    composerStartRestartGroup.startReplaceGroup(-1169231984);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion2.getEmpty()) {
                        mutableState9 = mutableState16;
                        mutableState10 = mutableState17;
                        objRememberedValue5 = new C2412c4(0, mutableState9, mutableState10);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        mutableState9 = mutableState16;
                        mutableState10 = mutableState17;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    mutableState11 = mutableState10;
                    mutableState12 = mutableState9;
                    b("Undo", keyboardArrowLeft6, z18, (a) objRememberedValue5, RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composerStartRestartGroup, 3078);
                    ImageVector keyboardArrowRight6 = KeyboardArrowRightKt.getKeyboardArrowRight(icons6.getDefault());
                    boolean z19 = !((List) mutableState11.getValue()).isEmpty();
                    composerStartRestartGroup.startReplaceGroup(-1169213590);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == companion2.getEmpty()) {
                        mutableState13 = mutableState11;
                        objRememberedValue6 = new C2412c4(1, mutableState13, mutableState12);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        mutableState13 = mutableState11;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    b("Redo", keyboardArrowRight6, z19, (a) objRememberedValue6, RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composerStartRestartGroup, 3078);
                    b.r(composerStartRestartGroup, f16, companion, composerStartRestartGroup, 6);
                    BoxWithConstraintsKt.BoxWithConstraints(b.g(b.f(f14, SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance, companion, 1.0f, false, 2, null), 0.0f, 1, null), ColorKt.Color(4279176986L)), f14), companion3.getCenter(), false, ComposableLambdaKt.rememberComposableLambda(1986572859, true, new C2524j4(gVar, mutableState18, mutableState20, mutableState21, mutableState19, mutableState12, mutableState28, mutableState210, stateAnimateFloat, mutableState13), composerStartRestartGroup, 54), composerStartRestartGroup, 3120, 4);
                    b.m(f16, companion, composerStartRestartGroup, 6);
                    Modifier modifierFillMaxWidth$default112 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy9 = ColumnKt.columnMeasurePolicy(arrangement7.getTop(), companion3.getCenterHorizontally(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier115 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default112);
                    constructor6 = companion4.getConstructor();
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
                    eVarG3 = p035i0.a.g(companion4, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy9, composerM3407constructorimpl6, currentCompositionLocalMap115);
                    if (composerM3407constructorimpl6.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier115, companion4.getSetModifier());
                    TextKt.m2432Text4IGK_g("Draw selections, click Apply to commit changes", (Modifier) null, j8, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme2.getTypography(composerStartRestartGroup, i10).getBodySmall(), composerStartRestartGroup, 390, 0, 65530);
                    b.m(f16, companion, composerStartRestartGroup, 6);
                    Modifier modifierFillMaxWidth$default113 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy18 = RowKt.rowMeasurePolicy(arrangement7.m548spacedBy0680j_4(Dp.m6403constructorimpl(f16)), companion3.getTop(), composerStartRestartGroup, 6);
                    currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier116 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default113);
                    constructor7 = companion4.getConstructor();
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
                    eVarG4 = p035i0.a.g(companion4, composerM3407constructorimpl7, measurePolicyRowMeasurePolicy18, composerM3407constructorimpl7, currentCompositionLocalMap116);
                    if (composerM3407constructorimpl7.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG4);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG4);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier116, companion4.getSetModifier());
                    composer2 = composerStartRestartGroup;
                    ButtonKt.OutlinedButton(onCancel, SizeKt.m699height3ABfNKs(RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), Dp.m6403constructorimpl(56)), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f14)), ButtonDefaults.INSTANCE.m1530outlinedButtonColorsro_MJ88(Color.Companion.m3962getTransparent0d7_KjU(), j7, 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 54, 12), null, BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(1), p107y3.a.f15991r), null, null, T.f14439b, composer2, i11 | 806879232, 420);
                    composer2.startReplaceGroup(-1168621978);
                    if ((i7 & 112) == 32) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    objRememberedValue7 = composer2.rememberedValue();
                    if (z7) {
                        objRememberedValue7 = new C2290i(5, onSave, mutableState12);
                        composer2.updateRememberedValue(objRememberedValue7);
                    } else {
                        objRememberedValue7 = new C2290i(5, onSave, mutableState12);
                        composer2.updateRememberedValue(objRememberedValue7);
                    }
                    composer2.endReplaceGroup();
                    q.a("Save Edits", (a) objRememberedValue7, RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), null, false, false, composer2, 6, 56);
                    if (S2.b(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion;
                } else {
                    arrangement3 = arrangement2;
                }
                arrangement3 = arrangement2;
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG10);
                arrangement3 = arrangement2;
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier20, companion4.getSetModifier());
                if (((EnumC2604o4) mutableState2.getValue()) == EnumC2604o4.f15367o) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                composerStartRestartGroup.startReplaceGroup(-1169294829);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == companion2.getEmpty()) {
                    mutableState3 = mutableState2;
                    objRememberedValue = new I(16, mutableState3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    mutableState3 = mutableState2;
                }
                composerStartRestartGroup.endReplaceGroup();
                mutableState4 = mutableState3;
                Arrangement arrangement8 = arrangement3;
                d("Rectangle", z3, (a) objRememberedValue, RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                if (((EnumC2604o4) mutableState4.getValue()) == EnumC2604o4.p) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                composerStartRestartGroup.startReplaceGroup(-1169286256);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion2.getEmpty()) {
                    mutableState5 = mutableState4;
                    objRememberedValue2 = new I(17, mutableState5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    mutableState5 = mutableState4;
                }
                composerStartRestartGroup.endReplaceGroup();
                MutableState mutableState211 = mutableState5;
                d("Circle", z4, (a) objRememberedValue2, RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                b.n(composerStartRestartGroup, f6, companion, composerStartRestartGroup, 6);
                TextKt.m2432Text4IGK_g("Edit Action", (Modifier) null, j8, 0L, (FontStyle) null, companion6.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme2.getTypography(composerStartRestartGroup, i10).getBodySmall(), composerStartRestartGroup, 196998, 0, 65498);
                b.m(f13, companion, composerStartRestartGroup, 6);
                Modifier modifierFillMaxWidth$default114 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy19 = RowKt.rowMeasurePolicy(arrangement8.m548spacedBy0680j_4(Dp.m6403constructorimpl(f14)), companion3.getTop(), composerStartRestartGroup, 6);
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier117 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default114);
                constructor4 = companion4.getConstructor();
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
                e eVarG12 = p035i0.a.g(companion4, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy19, composerM3407constructorimpl4, currentCompositionLocalMap117);
                if (composerM3407constructorimpl4.getInserting()) {
                    f5 = f6;
                    if (!o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier117, companion4.getSetModifier());
                    if (((EnumC2380a4) mutableState15.getValue()) == EnumC2380a4.f14770o) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    composerStartRestartGroup.startReplaceGroup(-1169264808);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion2.getEmpty()) {
                        mutableState6 = mutableState15;
                        objRememberedValue3 = new I(18, mutableState6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        mutableState6 = mutableState15;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    float f17 = f5;
                    mutableState7 = mutableState6;
                    d("Invert Colors", z5, (a) objRememberedValue3, RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                    if (((EnumC2380a4) mutableState7.getValue()) == EnumC2380a4.p) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    composerStartRestartGroup.startReplaceGroup(-1169255491);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion2.getEmpty()) {
                        mutableState8 = mutableState7;
                        objRememberedValue4 = new I(19, mutableState8);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        mutableState8 = mutableState7;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    MutableState mutableState212 = mutableState8;
                    d("Paint Black", z6, (a) objRememberedValue4, RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                    b.n(composerStartRestartGroup, f17, companion, composerStartRestartGroup, 6);
                    TextKt.m2432Text4IGK_g("History", (Modifier) null, j8, 0L, (FontStyle) null, companion6.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme2.getTypography(composerStartRestartGroup, i10).getBodySmall(), composerStartRestartGroup, 196998, 0, 65498);
                    b.m(f13, companion, composerStartRestartGroup, 6);
                    Modifier modifierFillMaxWidth$default115 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy110 = RowKt.rowMeasurePolicy(arrangement8.m548spacedBy0680j_4(Dp.m6403constructorimpl(f14)), companion3.getTop(), composerStartRestartGroup, 6);
                    currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier118 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default115);
                    constructor5 = companion4.getConstructor();
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
                    eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy110, composerM3407constructorimpl5, currentCompositionLocalMap118);
                    if (composerM3407constructorimpl5.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier118, companion4.getSetModifier());
                    Icons icons7 = Icons.INSTANCE;
                    ImageVector keyboardArrowLeft7 = KeyboardArrowLeftKt.getKeyboardArrowLeft(icons7.getDefault());
                    boolean z110 = !((List) mutableState16.getValue()).isEmpty();
                    composerStartRestartGroup.startReplaceGroup(-1169231984);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion2.getEmpty()) {
                        mutableState9 = mutableState16;
                        mutableState10 = mutableState17;
                        objRememberedValue5 = new C2412c4(0, mutableState9, mutableState10);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        mutableState9 = mutableState16;
                        mutableState10 = mutableState17;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    mutableState11 = mutableState10;
                    mutableState12 = mutableState9;
                    b("Undo", keyboardArrowLeft7, z110, (a) objRememberedValue5, RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composerStartRestartGroup, 3078);
                    ImageVector keyboardArrowRight7 = KeyboardArrowRightKt.getKeyboardArrowRight(icons7.getDefault());
                    boolean z111 = !((List) mutableState11.getValue()).isEmpty();
                    composerStartRestartGroup.startReplaceGroup(-1169213590);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == companion2.getEmpty()) {
                        mutableState13 = mutableState11;
                        objRememberedValue6 = new C2412c4(1, mutableState13, mutableState12);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        mutableState13 = mutableState11;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    b("Redo", keyboardArrowRight7, z111, (a) objRememberedValue6, RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composerStartRestartGroup, 3078);
                    b.r(composerStartRestartGroup, f17, companion, composerStartRestartGroup, 6);
                    BoxWithConstraintsKt.BoxWithConstraints(b.g(b.f(f14, SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance, companion, 1.0f, false, 2, null), 0.0f, 1, null), ColorKt.Color(4279176986L)), f14), companion3.getCenter(), false, ComposableLambdaKt.rememberComposableLambda(1986572859, true, new C2524j4(gVar, mutableState18, mutableState20, mutableState21, mutableState19, mutableState12, mutableState211, mutableState212, stateAnimateFloat, mutableState13), composerStartRestartGroup, 54), composerStartRestartGroup, 3120, 4);
                    b.m(f17, companion, composerStartRestartGroup, 6);
                    Modifier modifierFillMaxWidth$default116 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy10 = ColumnKt.columnMeasurePolicy(arrangement8.getTop(), companion3.getCenterHorizontally(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier119 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default116);
                    constructor6 = companion4.getConstructor();
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
                    eVarG3 = p035i0.a.g(companion4, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy10, composerM3407constructorimpl6, currentCompositionLocalMap119);
                    if (composerM3407constructorimpl6.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier119, companion4.getSetModifier());
                    TextKt.m2432Text4IGK_g("Draw selections, click Apply to commit changes", (Modifier) null, j8, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme2.getTypography(composerStartRestartGroup, i10).getBodySmall(), composerStartRestartGroup, 390, 0, 65530);
                    b.m(f17, companion, composerStartRestartGroup, 6);
                    Modifier modifierFillMaxWidth$default117 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy111 = RowKt.rowMeasurePolicy(arrangement8.m548spacedBy0680j_4(Dp.m6403constructorimpl(f17)), companion3.getTop(), composerStartRestartGroup, 6);
                    currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap1110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier1110 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default117);
                    constructor7 = companion4.getConstructor();
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
                    eVarG4 = p035i0.a.g(companion4, composerM3407constructorimpl7, measurePolicyRowMeasurePolicy111, composerM3407constructorimpl7, currentCompositionLocalMap1110);
                    if (composerM3407constructorimpl7.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG4);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG4);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier1110, companion4.getSetModifier());
                    composer2 = composerStartRestartGroup;
                    ButtonKt.OutlinedButton(onCancel, SizeKt.m699height3ABfNKs(RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), Dp.m6403constructorimpl(56)), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f14)), ButtonDefaults.INSTANCE.m1530outlinedButtonColorsro_MJ88(Color.Companion.m3962getTransparent0d7_KjU(), j7, 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 54, 12), null, BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(1), p107y3.a.f15991r), null, null, T.f14439b, composer2, i11 | 806879232, 420);
                    composer2.startReplaceGroup(-1168621978);
                    if ((i7 & 112) == 32) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    objRememberedValue7 = composer2.rememberedValue();
                    if (z7) {
                        objRememberedValue7 = new C2290i(5, onSave, mutableState12);
                        composer2.updateRememberedValue(objRememberedValue7);
                    } else {
                        objRememberedValue7 = new C2290i(5, onSave, mutableState12);
                        composer2.updateRememberedValue(objRememberedValue7);
                    }
                    composer2.endReplaceGroup();
                    q.a("Save Edits", (a) objRememberedValue7, RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), null, false, false, composer2, 6, 56);
                    if (S2.b(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion;
                } else {
                    f5 = f6;
                }
                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG12);
                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier117, companion4.getSetModifier());
                if (((EnumC2380a4) mutableState15.getValue()) == EnumC2380a4.f14770o) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                composerStartRestartGroup.startReplaceGroup(-1169264808);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion2.getEmpty()) {
                    mutableState6 = mutableState15;
                    objRememberedValue3 = new I(18, mutableState6);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    mutableState6 = mutableState15;
                }
                composerStartRestartGroup.endReplaceGroup();
                float f18 = f5;
                mutableState7 = mutableState6;
                d("Invert Colors", z5, (a) objRememberedValue3, RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                if (((EnumC2380a4) mutableState7.getValue()) == EnumC2380a4.p) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                composerStartRestartGroup.startReplaceGroup(-1169255491);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion2.getEmpty()) {
                    mutableState8 = mutableState7;
                    objRememberedValue4 = new I(19, mutableState8);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    mutableState8 = mutableState7;
                }
                composerStartRestartGroup.endReplaceGroup();
                MutableState mutableState213 = mutableState8;
                d("Paint Black", z6, (a) objRememberedValue4, RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                b.n(composerStartRestartGroup, f18, companion, composerStartRestartGroup, 6);
                TextKt.m2432Text4IGK_g("History", (Modifier) null, j8, 0L, (FontStyle) null, companion6.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme2.getTypography(composerStartRestartGroup, i10).getBodySmall(), composerStartRestartGroup, 196998, 0, 65498);
                b.m(f13, companion, composerStartRestartGroup, 6);
                Modifier modifierFillMaxWidth$default118 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy112 = RowKt.rowMeasurePolicy(arrangement8.m548spacedBy0680j_4(Dp.m6403constructorimpl(f14)), companion3.getTop(), composerStartRestartGroup, 6);
                currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap1111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier1111 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default118);
                constructor5 = companion4.getConstructor();
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
                eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy112, composerM3407constructorimpl5, currentCompositionLocalMap1111);
                if (composerM3407constructorimpl5.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                } else {
                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier1111, companion4.getSetModifier());
                Icons icons8 = Icons.INSTANCE;
                ImageVector keyboardArrowLeft8 = KeyboardArrowLeftKt.getKeyboardArrowLeft(icons8.getDefault());
                boolean z112 = !((List) mutableState16.getValue()).isEmpty();
                composerStartRestartGroup.startReplaceGroup(-1169231984);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion2.getEmpty()) {
                    mutableState9 = mutableState16;
                    mutableState10 = mutableState17;
                    objRememberedValue5 = new C2412c4(0, mutableState9, mutableState10);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    mutableState9 = mutableState16;
                    mutableState10 = mutableState17;
                }
                composerStartRestartGroup.endReplaceGroup();
                mutableState11 = mutableState10;
                mutableState12 = mutableState9;
                b("Undo", keyboardArrowLeft8, z112, (a) objRememberedValue5, RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composerStartRestartGroup, 3078);
                ImageVector keyboardArrowRight8 = KeyboardArrowRightKt.getKeyboardArrowRight(icons8.getDefault());
                boolean z113 = !((List) mutableState11.getValue()).isEmpty();
                composerStartRestartGroup.startReplaceGroup(-1169213590);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion2.getEmpty()) {
                    mutableState13 = mutableState11;
                    objRememberedValue6 = new C2412c4(1, mutableState13, mutableState12);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    mutableState13 = mutableState11;
                }
                composerStartRestartGroup.endReplaceGroup();
                b("Redo", keyboardArrowRight8, z113, (a) objRememberedValue6, RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composerStartRestartGroup, 3078);
                b.r(composerStartRestartGroup, f18, companion, composerStartRestartGroup, 6);
                BoxWithConstraintsKt.BoxWithConstraints(b.g(b.f(f14, SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance, companion, 1.0f, false, 2, null), 0.0f, 1, null), ColorKt.Color(4279176986L)), f14), companion3.getCenter(), false, ComposableLambdaKt.rememberComposableLambda(1986572859, true, new C2524j4(gVar, mutableState18, mutableState20, mutableState21, mutableState19, mutableState12, mutableState211, mutableState213, stateAnimateFloat, mutableState13), composerStartRestartGroup, 54), composerStartRestartGroup, 3120, 4);
                b.m(f18, companion, composerStartRestartGroup, 6);
                Modifier modifierFillMaxWidth$default119 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy11 = ColumnKt.columnMeasurePolicy(arrangement8.getTop(), companion3.getCenterHorizontally(), composerStartRestartGroup, 48);
                currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap1112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier1112 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default119);
                constructor6 = companion4.getConstructor();
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
                eVarG3 = p035i0.a.g(companion4, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy11, composerM3407constructorimpl6, currentCompositionLocalMap1112);
                if (composerM3407constructorimpl6.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                } else {
                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                }
                Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier1112, companion4.getSetModifier());
                TextKt.m2432Text4IGK_g("Draw selections, click Apply to commit changes", (Modifier) null, j8, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme2.getTypography(composerStartRestartGroup, i10).getBodySmall(), composerStartRestartGroup, 390, 0, 65530);
                b.m(f18, companion, composerStartRestartGroup, 6);
                Modifier modifierFillMaxWidth$default1110 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy113 = RowKt.rowMeasurePolicy(arrangement8.m548spacedBy0680j_4(Dp.m6403constructorimpl(f18)), companion3.getTop(), composerStartRestartGroup, 6);
                currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap1113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier1113 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default1110);
                constructor7 = companion4.getConstructor();
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
                eVarG4 = p035i0.a.g(companion4, composerM3407constructorimpl7, measurePolicyRowMeasurePolicy113, composerM3407constructorimpl7, currentCompositionLocalMap1113);
                if (composerM3407constructorimpl7.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG4);
                } else {
                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG4);
                }
                Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier1113, companion4.getSetModifier());
                composer2 = composerStartRestartGroup;
                ButtonKt.OutlinedButton(onCancel, SizeKt.m699height3ABfNKs(RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), Dp.m6403constructorimpl(56)), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f14)), ButtonDefaults.INSTANCE.m1530outlinedButtonColorsro_MJ88(Color.Companion.m3962getTransparent0d7_KjU(), j7, 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 54, 12), null, BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(1), p107y3.a.f15991r), null, null, T.f14439b, composer2, i11 | 806879232, 420);
                composer2.startReplaceGroup(-1168621978);
                if ((i7 & 112) == 32) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                objRememberedValue7 = composer2.rememberedValue();
                if (z7) {
                    objRememberedValue7 = new C2290i(5, onSave, mutableState12);
                    composer2.updateRememberedValue(objRememberedValue7);
                } else {
                    objRememberedValue7 = new C2290i(5, onSave, mutableState12);
                    composer2.updateRememberedValue(objRememberedValue7);
                }
                composer2.endReplaceGroup();
                q.a("Save Edits", (a) objRememberedValue7, RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), null, false, false, composer2, 6, 56);
                if (S2.b(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = companion;
            }
            p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG5);
            Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier, companion4.getSetModifier());
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            Modifier modifierM672paddingqDBjuR0$default2 = PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f6), 7, null);
            MeasurePolicy measurePolicyRowMeasurePolicy20 = RowKt.rowMeasurePolicy(arrangement4.getSpaceBetween(), companion3.getCenterVertically(), composerStartRestartGroup, 54);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap21 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier21 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM672paddingqDBjuR0$default2);
            constructor = companion4.getConstructor();
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
            e eVarG13 = p035i0.a.g(companion4, composerM3407constructorimpl, measurePolicyRowMeasurePolicy20, composerM3407constructorimpl, currentCompositionLocalMap21);
            if (composerM3407constructorimpl.getInserting()) {
                arrangement = arrangement4;
                if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier21, companion4.getSetModifier());
                RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                if (gVar != null) {
                    objValueOf = Integer.valueOf(gVar.getIndex() + 1);
                } else {
                    objValueOf = "";
                }
                MaterialTheme materialTheme3 = MaterialTheme.INSTANCE;
                int i12 = MaterialTheme.$stable;
                TextStyle titleLarge3 = materialTheme3.getTypography(composerStartRestartGroup, i12).getTitleLarge();
                long j9 = p107y3.a.f15990o;
                FontWeight.Companion companion7 = FontWeight.Companion;
                TextKt.m2432Text4IGK_g("Edit Page " + objValueOf, (Modifier) null, j9, 0L, (FontStyle) null, companion7.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, titleLarge3, composerStartRestartGroup, 196992, 0, 65498);
                int i13 = (i7 >> 6) & 14;
                mutableState2 = mutableState;
                arrangement2 = arrangement;
                IconButtonKt.IconButton(onCancel, null, false, null, null, T.f14438a, composerStartRestartGroup, i13 | 196608, 30);
                composerStartRestartGroup.endNode();
                MeasurePolicy measurePolicyColumnMeasurePolicy12 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap120 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier120 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
                constructor2 = companion4.getConstructor();
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
                eVarG = p035i0.a.g(companion4, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy12, composerM3407constructorimpl2, currentCompositionLocalMap120);
                if (composerM3407constructorimpl2.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                } else {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier120, companion4.getSetModifier());
                TextStyle bodySmall3 = materialTheme3.getTypography(composerStartRestartGroup, i12).getBodySmall();
                long j10 = p107y3.a.p;
                TextKt.m2432Text4IGK_g("Selection Tool", (Modifier) null, j10, 0L, (FontStyle) null, companion7.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall3, composerStartRestartGroup, 196998, 0, 65498);
                float f19 = 8;
                b.m(f19, companion, composerStartRestartGroup, 6);
                Modifier modifierFillMaxWidth$default120 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                float f110 = 12;
                MeasurePolicy measurePolicyRowMeasurePolicy114 = RowKt.rowMeasurePolicy(arrangement2.m548spacedBy0680j_4(Dp.m6403constructorimpl(f110)), companion3.getTop(), composerStartRestartGroup, 6);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default120);
                constructor3 = companion4.getConstructor();
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
                e eVarG14 = p035i0.a.g(companion4, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy114, composerM3407constructorimpl3, currentCompositionLocalMap22);
                if (composerM3407constructorimpl3.getInserting()) {
                    if (!o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    }
                    arrangement3 = arrangement2;
                    Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier22, companion4.getSetModifier());
                    if (((EnumC2604o4) mutableState2.getValue()) == EnumC2604o4.f15367o) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    composerStartRestartGroup.startReplaceGroup(-1169294829);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == companion2.getEmpty()) {
                        mutableState3 = mutableState2;
                        objRememberedValue = new I(16, mutableState3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        mutableState3 = mutableState2;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    mutableState4 = mutableState3;
                    Arrangement arrangement9 = arrangement3;
                    d("Rectangle", z3, (a) objRememberedValue, RowScope.weight$default(rowScopeInstance3, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                    if (((EnumC2604o4) mutableState4.getValue()) == EnumC2604o4.p) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    composerStartRestartGroup.startReplaceGroup(-1169286256);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion2.getEmpty()) {
                        mutableState5 = mutableState4;
                        objRememberedValue2 = new I(17, mutableState5);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        mutableState5 = mutableState4;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    MutableState mutableState214 = mutableState5;
                    d("Circle", z4, (a) objRememberedValue2, RowScope.weight$default(rowScopeInstance3, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                    b.n(composerStartRestartGroup, f6, companion, composerStartRestartGroup, 6);
                    TextKt.m2432Text4IGK_g("Edit Action", (Modifier) null, j10, 0L, (FontStyle) null, companion7.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme3.getTypography(composerStartRestartGroup, i12).getBodySmall(), composerStartRestartGroup, 196998, 0, 65498);
                    b.m(f19, companion, composerStartRestartGroup, 6);
                    Modifier modifierFillMaxWidth$default1111 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy115 = RowKt.rowMeasurePolicy(arrangement9.m548spacedBy0680j_4(Dp.m6403constructorimpl(f110)), companion3.getTop(), composerStartRestartGroup, 6);
                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap1114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier1114 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default1111);
                    constructor4 = companion4.getConstructor();
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
                    e eVarG15 = p035i0.a.g(companion4, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy115, composerM3407constructorimpl4, currentCompositionLocalMap1114);
                    if (composerM3407constructorimpl4.getInserting()) {
                        f5 = f6;
                        if (!o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier1114, companion4.getSetModifier());
                        if (((EnumC2380a4) mutableState15.getValue()) == EnumC2380a4.f14770o) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        composerStartRestartGroup.startReplaceGroup(-1169264808);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion2.getEmpty()) {
                            mutableState6 = mutableState15;
                            objRememberedValue3 = new I(18, mutableState6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            mutableState6 = mutableState15;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        float f111 = f5;
                        mutableState7 = mutableState6;
                        d("Invert Colors", z5, (a) objRememberedValue3, RowScope.weight$default(rowScopeInstance3, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                        if (((EnumC2380a4) mutableState7.getValue()) == EnumC2380a4.p) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        composerStartRestartGroup.startReplaceGroup(-1169255491);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion2.getEmpty()) {
                            mutableState8 = mutableState7;
                            objRememberedValue4 = new I(19, mutableState8);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            mutableState8 = mutableState7;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        MutableState mutableState215 = mutableState8;
                        d("Paint Black", z6, (a) objRememberedValue4, RowScope.weight$default(rowScopeInstance3, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                        b.n(composerStartRestartGroup, f111, companion, composerStartRestartGroup, 6);
                        TextKt.m2432Text4IGK_g("History", (Modifier) null, j10, 0L, (FontStyle) null, companion7.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme3.getTypography(composerStartRestartGroup, i12).getBodySmall(), composerStartRestartGroup, 196998, 0, 65498);
                        b.m(f19, companion, composerStartRestartGroup, 6);
                        Modifier modifierFillMaxWidth$default1112 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy116 = RowKt.rowMeasurePolicy(arrangement9.m548spacedBy0680j_4(Dp.m6403constructorimpl(f110)), companion3.getTop(), composerStartRestartGroup, 6);
                        currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap1115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier1115 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default1112);
                        constructor5 = companion4.getConstructor();
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
                        eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy116, composerM3407constructorimpl5, currentCompositionLocalMap1115);
                        if (composerM3407constructorimpl5.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier1115, companion4.getSetModifier());
                        Icons icons9 = Icons.INSTANCE;
                        ImageVector keyboardArrowLeft9 = KeyboardArrowLeftKt.getKeyboardArrowLeft(icons9.getDefault());
                        boolean z114 = !((List) mutableState16.getValue()).isEmpty();
                        composerStartRestartGroup.startReplaceGroup(-1169231984);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion2.getEmpty()) {
                            mutableState9 = mutableState16;
                            mutableState10 = mutableState17;
                            objRememberedValue5 = new C2412c4(0, mutableState9, mutableState10);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        } else {
                            mutableState9 = mutableState16;
                            mutableState10 = mutableState17;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        mutableState11 = mutableState10;
                        mutableState12 = mutableState9;
                        b("Undo", keyboardArrowLeft9, z114, (a) objRememberedValue5, RowScope.weight$default(rowScopeInstance3, companion, 1.0f, false, 2, null), composerStartRestartGroup, 3078);
                        ImageVector keyboardArrowRight9 = KeyboardArrowRightKt.getKeyboardArrowRight(icons9.getDefault());
                        boolean z115 = !((List) mutableState11.getValue()).isEmpty();
                        composerStartRestartGroup.startReplaceGroup(-1169213590);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue6 == companion2.getEmpty()) {
                            mutableState13 = mutableState11;
                            objRememberedValue6 = new C2412c4(1, mutableState13, mutableState12);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            mutableState13 = mutableState11;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        b("Redo", keyboardArrowRight9, z115, (a) objRememberedValue6, RowScope.weight$default(rowScopeInstance3, companion, 1.0f, false, 2, null), composerStartRestartGroup, 3078);
                        b.r(composerStartRestartGroup, f111, companion, composerStartRestartGroup, 6);
                        BoxWithConstraintsKt.BoxWithConstraints(b.g(b.f(f110, SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance2, companion, 1.0f, false, 2, null), 0.0f, 1, null), ColorKt.Color(4279176986L)), f110), companion3.getCenter(), false, ComposableLambdaKt.rememberComposableLambda(1986572859, true, new C2524j4(gVar, mutableState18, mutableState20, mutableState21, mutableState19, mutableState12, mutableState214, mutableState215, stateAnimateFloat, mutableState13), composerStartRestartGroup, 54), composerStartRestartGroup, 3120, 4);
                        b.m(f111, companion, composerStartRestartGroup, 6);
                        Modifier modifierFillMaxWidth$default1113 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy13 = ColumnKt.columnMeasurePolicy(arrangement9.getTop(), companion3.getCenterHorizontally(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap1116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier1116 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default1113);
                        constructor6 = companion4.getConstructor();
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
                        eVarG3 = p035i0.a.g(companion4, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy13, composerM3407constructorimpl6, currentCompositionLocalMap1116);
                        if (composerM3407constructorimpl6.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier1116, companion4.getSetModifier());
                        TextKt.m2432Text4IGK_g("Draw selections, click Apply to commit changes", (Modifier) null, j10, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme3.getTypography(composerStartRestartGroup, i12).getBodySmall(), composerStartRestartGroup, 390, 0, 65530);
                        b.m(f111, companion, composerStartRestartGroup, 6);
                        Modifier modifierFillMaxWidth$default1114 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy117 = RowKt.rowMeasurePolicy(arrangement9.m548spacedBy0680j_4(Dp.m6403constructorimpl(f111)), companion3.getTop(), composerStartRestartGroup, 6);
                        currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap1117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier1117 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default1114);
                        constructor7 = companion4.getConstructor();
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
                        eVarG4 = p035i0.a.g(companion4, composerM3407constructorimpl7, measurePolicyRowMeasurePolicy117, composerM3407constructorimpl7, currentCompositionLocalMap1117);
                        if (composerM3407constructorimpl7.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG4);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG4);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier1117, companion4.getSetModifier());
                        composer2 = composerStartRestartGroup;
                        ButtonKt.OutlinedButton(onCancel, SizeKt.m699height3ABfNKs(RowScope.weight$default(rowScopeInstance3, companion, 1.0f, false, 2, null), Dp.m6403constructorimpl(56)), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f110)), ButtonDefaults.INSTANCE.m1530outlinedButtonColorsro_MJ88(Color.Companion.m3962getTransparent0d7_KjU(), j9, 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 54, 12), null, BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(1), p107y3.a.f15991r), null, null, T.f14439b, composer2, i13 | 806879232, 420);
                        composer2.startReplaceGroup(-1168621978);
                        if ((i7 & 112) == 32) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        objRememberedValue7 = composer2.rememberedValue();
                        if (z7) {
                            objRememberedValue7 = new C2290i(5, onSave, mutableState12);
                            composer2.updateRememberedValue(objRememberedValue7);
                        } else {
                            objRememberedValue7 = new C2290i(5, onSave, mutableState12);
                            composer2.updateRememberedValue(objRememberedValue7);
                        }
                        composer2.endReplaceGroup();
                        q.a("Save Edits", (a) objRememberedValue7, RowScope.weight$default(rowScopeInstance3, companion, 1.0f, false, 2, null), null, false, false, composer2, 6, 56);
                        if (S2.b(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = companion;
                    } else {
                        f5 = f6;
                    }
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG15);
                    Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier1114, companion4.getSetModifier());
                    if (((EnumC2380a4) mutableState15.getValue()) == EnumC2380a4.f14770o) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    composerStartRestartGroup.startReplaceGroup(-1169264808);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion2.getEmpty()) {
                        mutableState6 = mutableState15;
                        objRememberedValue3 = new I(18, mutableState6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        mutableState6 = mutableState15;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    float f112 = f5;
                    mutableState7 = mutableState6;
                    d("Invert Colors", z5, (a) objRememberedValue3, RowScope.weight$default(rowScopeInstance3, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                    if (((EnumC2380a4) mutableState7.getValue()) == EnumC2380a4.p) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    composerStartRestartGroup.startReplaceGroup(-1169255491);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion2.getEmpty()) {
                        mutableState8 = mutableState7;
                        objRememberedValue4 = new I(19, mutableState8);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        mutableState8 = mutableState7;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    MutableState mutableState216 = mutableState8;
                    d("Paint Black", z6, (a) objRememberedValue4, RowScope.weight$default(rowScopeInstance3, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                    b.n(composerStartRestartGroup, f112, companion, composerStartRestartGroup, 6);
                    TextKt.m2432Text4IGK_g("History", (Modifier) null, j10, 0L, (FontStyle) null, companion7.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme3.getTypography(composerStartRestartGroup, i12).getBodySmall(), composerStartRestartGroup, 196998, 0, 65498);
                    b.m(f19, companion, composerStartRestartGroup, 6);
                    Modifier modifierFillMaxWidth$default1115 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy118 = RowKt.rowMeasurePolicy(arrangement9.m548spacedBy0680j_4(Dp.m6403constructorimpl(f110)), companion3.getTop(), composerStartRestartGroup, 6);
                    currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap1118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier1118 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default1115);
                    constructor5 = companion4.getConstructor();
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
                    eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy118, composerM3407constructorimpl5, currentCompositionLocalMap1118);
                    if (composerM3407constructorimpl5.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier1118, companion4.getSetModifier());
                    Icons icons10 = Icons.INSTANCE;
                    ImageVector keyboardArrowLeft10 = KeyboardArrowLeftKt.getKeyboardArrowLeft(icons10.getDefault());
                    boolean z116 = !((List) mutableState16.getValue()).isEmpty();
                    composerStartRestartGroup.startReplaceGroup(-1169231984);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion2.getEmpty()) {
                        mutableState9 = mutableState16;
                        mutableState10 = mutableState17;
                        objRememberedValue5 = new C2412c4(0, mutableState9, mutableState10);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        mutableState9 = mutableState16;
                        mutableState10 = mutableState17;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    mutableState11 = mutableState10;
                    mutableState12 = mutableState9;
                    b("Undo", keyboardArrowLeft10, z116, (a) objRememberedValue5, RowScope.weight$default(rowScopeInstance3, companion, 1.0f, false, 2, null), composerStartRestartGroup, 3078);
                    ImageVector keyboardArrowRight10 = KeyboardArrowRightKt.getKeyboardArrowRight(icons10.getDefault());
                    boolean z117 = !((List) mutableState11.getValue()).isEmpty();
                    composerStartRestartGroup.startReplaceGroup(-1169213590);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == companion2.getEmpty()) {
                        mutableState13 = mutableState11;
                        objRememberedValue6 = new C2412c4(1, mutableState13, mutableState12);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        mutableState13 = mutableState11;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    b("Redo", keyboardArrowRight10, z117, (a) objRememberedValue6, RowScope.weight$default(rowScopeInstance3, companion, 1.0f, false, 2, null), composerStartRestartGroup, 3078);
                    b.r(composerStartRestartGroup, f112, companion, composerStartRestartGroup, 6);
                    BoxWithConstraintsKt.BoxWithConstraints(b.g(b.f(f110, SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance2, companion, 1.0f, false, 2, null), 0.0f, 1, null), ColorKt.Color(4279176986L)), f110), companion3.getCenter(), false, ComposableLambdaKt.rememberComposableLambda(1986572859, true, new C2524j4(gVar, mutableState18, mutableState20, mutableState21, mutableState19, mutableState12, mutableState214, mutableState216, stateAnimateFloat, mutableState13), composerStartRestartGroup, 54), composerStartRestartGroup, 3120, 4);
                    b.m(f112, companion, composerStartRestartGroup, 6);
                    Modifier modifierFillMaxWidth$default1116 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy14 = ColumnKt.columnMeasurePolicy(arrangement9.getTop(), companion3.getCenterHorizontally(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap1119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier1119 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default1116);
                    constructor6 = companion4.getConstructor();
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
                    eVarG3 = p035i0.a.g(companion4, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy14, composerM3407constructorimpl6, currentCompositionLocalMap1119);
                    if (composerM3407constructorimpl6.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier1119, companion4.getSetModifier());
                    TextKt.m2432Text4IGK_g("Draw selections, click Apply to commit changes", (Modifier) null, j10, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme3.getTypography(composerStartRestartGroup, i12).getBodySmall(), composerStartRestartGroup, 390, 0, 65530);
                    b.m(f112, companion, composerStartRestartGroup, 6);
                    Modifier modifierFillMaxWidth$default1117 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy119 = RowKt.rowMeasurePolicy(arrangement9.m548spacedBy0680j_4(Dp.m6403constructorimpl(f112)), companion3.getTop(), composerStartRestartGroup, 6);
                    currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier11110 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default1117);
                    constructor7 = companion4.getConstructor();
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
                    eVarG4 = p035i0.a.g(companion4, composerM3407constructorimpl7, measurePolicyRowMeasurePolicy119, composerM3407constructorimpl7, currentCompositionLocalMap11110);
                    if (composerM3407constructorimpl7.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG4);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG4);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier11110, companion4.getSetModifier());
                    composer2 = composerStartRestartGroup;
                    ButtonKt.OutlinedButton(onCancel, SizeKt.m699height3ABfNKs(RowScope.weight$default(rowScopeInstance3, companion, 1.0f, false, 2, null), Dp.m6403constructorimpl(56)), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f110)), ButtonDefaults.INSTANCE.m1530outlinedButtonColorsro_MJ88(Color.Companion.m3962getTransparent0d7_KjU(), j9, 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 54, 12), null, BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(1), p107y3.a.f15991r), null, null, T.f14439b, composer2, i13 | 806879232, 420);
                    composer2.startReplaceGroup(-1168621978);
                    if ((i7 & 112) == 32) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    objRememberedValue7 = composer2.rememberedValue();
                    if (z7) {
                        objRememberedValue7 = new C2290i(5, onSave, mutableState12);
                        composer2.updateRememberedValue(objRememberedValue7);
                    } else {
                        objRememberedValue7 = new C2290i(5, onSave, mutableState12);
                        composer2.updateRememberedValue(objRememberedValue7);
                    }
                    composer2.endReplaceGroup();
                    q.a("Save Edits", (a) objRememberedValue7, RowScope.weight$default(rowScopeInstance3, companion, 1.0f, false, 2, null), null, false, false, composer2, 6, 56);
                    if (S2.b(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion;
                } else {
                    arrangement3 = arrangement2;
                }
                arrangement3 = arrangement2;
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG14);
                arrangement3 = arrangement2;
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier22, companion4.getSetModifier());
                if (((EnumC2604o4) mutableState2.getValue()) == EnumC2604o4.f15367o) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                composerStartRestartGroup.startReplaceGroup(-1169294829);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == companion2.getEmpty()) {
                    mutableState3 = mutableState2;
                    objRememberedValue = new I(16, mutableState3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    mutableState3 = mutableState2;
                }
                composerStartRestartGroup.endReplaceGroup();
                mutableState4 = mutableState3;
                Arrangement arrangement10 = arrangement3;
                d("Rectangle", z3, (a) objRememberedValue, RowScope.weight$default(rowScopeInstance3, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                if (((EnumC2604o4) mutableState4.getValue()) == EnumC2604o4.p) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                composerStartRestartGroup.startReplaceGroup(-1169286256);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion2.getEmpty()) {
                    mutableState5 = mutableState4;
                    objRememberedValue2 = new I(17, mutableState5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    mutableState5 = mutableState4;
                }
                composerStartRestartGroup.endReplaceGroup();
                MutableState mutableState217 = mutableState5;
                d("Circle", z4, (a) objRememberedValue2, RowScope.weight$default(rowScopeInstance3, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                b.n(composerStartRestartGroup, f6, companion, composerStartRestartGroup, 6);
                TextKt.m2432Text4IGK_g("Edit Action", (Modifier) null, j10, 0L, (FontStyle) null, companion7.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme3.getTypography(composerStartRestartGroup, i12).getBodySmall(), composerStartRestartGroup, 196998, 0, 65498);
                b.m(f19, companion, composerStartRestartGroup, 6);
                Modifier modifierFillMaxWidth$default1118 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy1110 = RowKt.rowMeasurePolicy(arrangement10.m548spacedBy0680j_4(Dp.m6403constructorimpl(f110)), companion3.getTop(), composerStartRestartGroup, 6);
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap11111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier11111 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default1118);
                constructor4 = companion4.getConstructor();
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
                e eVarG16 = p035i0.a.g(companion4, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy1110, composerM3407constructorimpl4, currentCompositionLocalMap11111);
                if (composerM3407constructorimpl4.getInserting()) {
                    f5 = f6;
                    if (!o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier11111, companion4.getSetModifier());
                    if (((EnumC2380a4) mutableState15.getValue()) == EnumC2380a4.f14770o) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    composerStartRestartGroup.startReplaceGroup(-1169264808);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion2.getEmpty()) {
                        mutableState6 = mutableState15;
                        objRememberedValue3 = new I(18, mutableState6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        mutableState6 = mutableState15;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    float f113 = f5;
                    mutableState7 = mutableState6;
                    d("Invert Colors", z5, (a) objRememberedValue3, RowScope.weight$default(rowScopeInstance3, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                    if (((EnumC2380a4) mutableState7.getValue()) == EnumC2380a4.p) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    composerStartRestartGroup.startReplaceGroup(-1169255491);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion2.getEmpty()) {
                        mutableState8 = mutableState7;
                        objRememberedValue4 = new I(19, mutableState8);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        mutableState8 = mutableState7;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    MutableState mutableState218 = mutableState8;
                    d("Paint Black", z6, (a) objRememberedValue4, RowScope.weight$default(rowScopeInstance3, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                    b.n(composerStartRestartGroup, f113, companion, composerStartRestartGroup, 6);
                    TextKt.m2432Text4IGK_g("History", (Modifier) null, j10, 0L, (FontStyle) null, companion7.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme3.getTypography(composerStartRestartGroup, i12).getBodySmall(), composerStartRestartGroup, 196998, 0, 65498);
                    b.m(f19, companion, composerStartRestartGroup, 6);
                    Modifier modifierFillMaxWidth$default1119 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy1111 = RowKt.rowMeasurePolicy(arrangement10.m548spacedBy0680j_4(Dp.m6403constructorimpl(f110)), companion3.getTop(), composerStartRestartGroup, 6);
                    currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier11112 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default1119);
                    constructor5 = companion4.getConstructor();
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
                    eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy1111, composerM3407constructorimpl5, currentCompositionLocalMap11112);
                    if (composerM3407constructorimpl5.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier11112, companion4.getSetModifier());
                    Icons icons11 = Icons.INSTANCE;
                    ImageVector keyboardArrowLeft11 = KeyboardArrowLeftKt.getKeyboardArrowLeft(icons11.getDefault());
                    boolean z118 = !((List) mutableState16.getValue()).isEmpty();
                    composerStartRestartGroup.startReplaceGroup(-1169231984);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion2.getEmpty()) {
                        mutableState9 = mutableState16;
                        mutableState10 = mutableState17;
                        objRememberedValue5 = new C2412c4(0, mutableState9, mutableState10);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        mutableState9 = mutableState16;
                        mutableState10 = mutableState17;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    mutableState11 = mutableState10;
                    mutableState12 = mutableState9;
                    b("Undo", keyboardArrowLeft11, z118, (a) objRememberedValue5, RowScope.weight$default(rowScopeInstance3, companion, 1.0f, false, 2, null), composerStartRestartGroup, 3078);
                    ImageVector keyboardArrowRight11 = KeyboardArrowRightKt.getKeyboardArrowRight(icons11.getDefault());
                    boolean z119 = !((List) mutableState11.getValue()).isEmpty();
                    composerStartRestartGroup.startReplaceGroup(-1169213590);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == companion2.getEmpty()) {
                        mutableState13 = mutableState11;
                        objRememberedValue6 = new C2412c4(1, mutableState13, mutableState12);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        mutableState13 = mutableState11;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    b("Redo", keyboardArrowRight11, z119, (a) objRememberedValue6, RowScope.weight$default(rowScopeInstance3, companion, 1.0f, false, 2, null), composerStartRestartGroup, 3078);
                    b.r(composerStartRestartGroup, f113, companion, composerStartRestartGroup, 6);
                    BoxWithConstraintsKt.BoxWithConstraints(b.g(b.f(f110, SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance2, companion, 1.0f, false, 2, null), 0.0f, 1, null), ColorKt.Color(4279176986L)), f110), companion3.getCenter(), false, ComposableLambdaKt.rememberComposableLambda(1986572859, true, new C2524j4(gVar, mutableState18, mutableState20, mutableState21, mutableState19, mutableState12, mutableState217, mutableState218, stateAnimateFloat, mutableState13), composerStartRestartGroup, 54), composerStartRestartGroup, 3120, 4);
                    b.m(f113, companion, composerStartRestartGroup, 6);
                    Modifier modifierFillMaxWidth$default11110 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy15 = ColumnKt.columnMeasurePolicy(arrangement10.getTop(), companion3.getCenterHorizontally(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier11113 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default11110);
                    constructor6 = companion4.getConstructor();
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
                    eVarG3 = p035i0.a.g(companion4, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy15, composerM3407constructorimpl6, currentCompositionLocalMap11113);
                    if (composerM3407constructorimpl6.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier11113, companion4.getSetModifier());
                    TextKt.m2432Text4IGK_g("Draw selections, click Apply to commit changes", (Modifier) null, j10, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme3.getTypography(composerStartRestartGroup, i12).getBodySmall(), composerStartRestartGroup, 390, 0, 65530);
                    b.m(f113, companion, composerStartRestartGroup, 6);
                    Modifier modifierFillMaxWidth$default11111 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy1112 = RowKt.rowMeasurePolicy(arrangement10.m548spacedBy0680j_4(Dp.m6403constructorimpl(f113)), companion3.getTop(), composerStartRestartGroup, 6);
                    currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier11114 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default11111);
                    constructor7 = companion4.getConstructor();
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
                    eVarG4 = p035i0.a.g(companion4, composerM3407constructorimpl7, measurePolicyRowMeasurePolicy1112, composerM3407constructorimpl7, currentCompositionLocalMap11114);
                    if (composerM3407constructorimpl7.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG4);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG4);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier11114, companion4.getSetModifier());
                    composer2 = composerStartRestartGroup;
                    ButtonKt.OutlinedButton(onCancel, SizeKt.m699height3ABfNKs(RowScope.weight$default(rowScopeInstance3, companion, 1.0f, false, 2, null), Dp.m6403constructorimpl(56)), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f110)), ButtonDefaults.INSTANCE.m1530outlinedButtonColorsro_MJ88(Color.Companion.m3962getTransparent0d7_KjU(), j9, 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 54, 12), null, BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(1), p107y3.a.f15991r), null, null, T.f14439b, composer2, i13 | 806879232, 420);
                    composer2.startReplaceGroup(-1168621978);
                    if ((i7 & 112) == 32) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    objRememberedValue7 = composer2.rememberedValue();
                    if (z7) {
                        objRememberedValue7 = new C2290i(5, onSave, mutableState12);
                        composer2.updateRememberedValue(objRememberedValue7);
                    } else {
                        objRememberedValue7 = new C2290i(5, onSave, mutableState12);
                        composer2.updateRememberedValue(objRememberedValue7);
                    }
                    composer2.endReplaceGroup();
                    q.a("Save Edits", (a) objRememberedValue7, RowScope.weight$default(rowScopeInstance3, companion, 1.0f, false, 2, null), null, false, false, composer2, 6, 56);
                    if (S2.b(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion;
                } else {
                    f5 = f6;
                }
                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG16);
                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier11111, companion4.getSetModifier());
                if (((EnumC2380a4) mutableState15.getValue()) == EnumC2380a4.f14770o) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                composerStartRestartGroup.startReplaceGroup(-1169264808);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion2.getEmpty()) {
                    mutableState6 = mutableState15;
                    objRememberedValue3 = new I(18, mutableState6);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    mutableState6 = mutableState15;
                }
                composerStartRestartGroup.endReplaceGroup();
                float f114 = f5;
                mutableState7 = mutableState6;
                d("Invert Colors", z5, (a) objRememberedValue3, RowScope.weight$default(rowScopeInstance3, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                if (((EnumC2380a4) mutableState7.getValue()) == EnumC2380a4.p) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                composerStartRestartGroup.startReplaceGroup(-1169255491);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion2.getEmpty()) {
                    mutableState8 = mutableState7;
                    objRememberedValue4 = new I(19, mutableState8);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    mutableState8 = mutableState7;
                }
                composerStartRestartGroup.endReplaceGroup();
                MutableState mutableState219 = mutableState8;
                d("Paint Black", z6, (a) objRememberedValue4, RowScope.weight$default(rowScopeInstance3, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                b.n(composerStartRestartGroup, f114, companion, composerStartRestartGroup, 6);
                TextKt.m2432Text4IGK_g("History", (Modifier) null, j10, 0L, (FontStyle) null, companion7.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme3.getTypography(composerStartRestartGroup, i12).getBodySmall(), composerStartRestartGroup, 196998, 0, 65498);
                b.m(f19, companion, composerStartRestartGroup, 6);
                Modifier modifierFillMaxWidth$default11112 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy1113 = RowKt.rowMeasurePolicy(arrangement10.m548spacedBy0680j_4(Dp.m6403constructorimpl(f110)), companion3.getTop(), composerStartRestartGroup, 6);
                currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap11115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier11115 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default11112);
                constructor5 = companion4.getConstructor();
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
                eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy1113, composerM3407constructorimpl5, currentCompositionLocalMap11115);
                if (composerM3407constructorimpl5.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                } else {
                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier11115, companion4.getSetModifier());
                Icons icons12 = Icons.INSTANCE;
                ImageVector keyboardArrowLeft12 = KeyboardArrowLeftKt.getKeyboardArrowLeft(icons12.getDefault());
                boolean z1110 = !((List) mutableState16.getValue()).isEmpty();
                composerStartRestartGroup.startReplaceGroup(-1169231984);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion2.getEmpty()) {
                    mutableState9 = mutableState16;
                    mutableState10 = mutableState17;
                    objRememberedValue5 = new C2412c4(0, mutableState9, mutableState10);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    mutableState9 = mutableState16;
                    mutableState10 = mutableState17;
                }
                composerStartRestartGroup.endReplaceGroup();
                mutableState11 = mutableState10;
                mutableState12 = mutableState9;
                b("Undo", keyboardArrowLeft12, z1110, (a) objRememberedValue5, RowScope.weight$default(rowScopeInstance3, companion, 1.0f, false, 2, null), composerStartRestartGroup, 3078);
                ImageVector keyboardArrowRight12 = KeyboardArrowRightKt.getKeyboardArrowRight(icons12.getDefault());
                boolean z1111 = !((List) mutableState11.getValue()).isEmpty();
                composerStartRestartGroup.startReplaceGroup(-1169213590);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion2.getEmpty()) {
                    mutableState13 = mutableState11;
                    objRememberedValue6 = new C2412c4(1, mutableState13, mutableState12);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    mutableState13 = mutableState11;
                }
                composerStartRestartGroup.endReplaceGroup();
                b("Redo", keyboardArrowRight12, z1111, (a) objRememberedValue6, RowScope.weight$default(rowScopeInstance3, companion, 1.0f, false, 2, null), composerStartRestartGroup, 3078);
                b.r(composerStartRestartGroup, f114, companion, composerStartRestartGroup, 6);
                BoxWithConstraintsKt.BoxWithConstraints(b.g(b.f(f110, SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance2, companion, 1.0f, false, 2, null), 0.0f, 1, null), ColorKt.Color(4279176986L)), f110), companion3.getCenter(), false, ComposableLambdaKt.rememberComposableLambda(1986572859, true, new C2524j4(gVar, mutableState18, mutableState20, mutableState21, mutableState19, mutableState12, mutableState217, mutableState219, stateAnimateFloat, mutableState13), composerStartRestartGroup, 54), composerStartRestartGroup, 3120, 4);
                b.m(f114, companion, composerStartRestartGroup, 6);
                Modifier modifierFillMaxWidth$default11113 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy16 = ColumnKt.columnMeasurePolicy(arrangement10.getTop(), companion3.getCenterHorizontally(), composerStartRestartGroup, 48);
                currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap11116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier11116 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default11113);
                constructor6 = companion4.getConstructor();
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
                eVarG3 = p035i0.a.g(companion4, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy16, composerM3407constructorimpl6, currentCompositionLocalMap11116);
                if (composerM3407constructorimpl6.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                } else {
                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                }
                Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier11116, companion4.getSetModifier());
                TextKt.m2432Text4IGK_g("Draw selections, click Apply to commit changes", (Modifier) null, j10, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme3.getTypography(composerStartRestartGroup, i12).getBodySmall(), composerStartRestartGroup, 390, 0, 65530);
                b.m(f114, companion, composerStartRestartGroup, 6);
                Modifier modifierFillMaxWidth$default11114 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy1114 = RowKt.rowMeasurePolicy(arrangement10.m548spacedBy0680j_4(Dp.m6403constructorimpl(f114)), companion3.getTop(), composerStartRestartGroup, 6);
                currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap11117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier11117 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default11114);
                constructor7 = companion4.getConstructor();
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
                eVarG4 = p035i0.a.g(companion4, composerM3407constructorimpl7, measurePolicyRowMeasurePolicy1114, composerM3407constructorimpl7, currentCompositionLocalMap11117);
                if (composerM3407constructorimpl7.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG4);
                } else {
                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG4);
                }
                Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier11117, companion4.getSetModifier());
                composer2 = composerStartRestartGroup;
                ButtonKt.OutlinedButton(onCancel, SizeKt.m699height3ABfNKs(RowScope.weight$default(rowScopeInstance3, companion, 1.0f, false, 2, null), Dp.m6403constructorimpl(56)), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f110)), ButtonDefaults.INSTANCE.m1530outlinedButtonColorsro_MJ88(Color.Companion.m3962getTransparent0d7_KjU(), j9, 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 54, 12), null, BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(1), p107y3.a.f15991r), null, null, T.f14439b, composer2, i13 | 806879232, 420);
                composer2.startReplaceGroup(-1168621978);
                if ((i7 & 112) == 32) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                objRememberedValue7 = composer2.rememberedValue();
                if (z7) {
                    objRememberedValue7 = new C2290i(5, onSave, mutableState12);
                    composer2.updateRememberedValue(objRememberedValue7);
                } else {
                    objRememberedValue7 = new C2290i(5, onSave, mutableState12);
                    composer2.updateRememberedValue(objRememberedValue7);
                }
                composer2.endReplaceGroup();
                q.a("Save Edits", (a) objRememberedValue7, RowScope.weight$default(rowScopeInstance3, companion, 1.0f, false, 2, null), null, false, false, composer2, 6, 56);
                if (S2.b(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = companion;
            } else {
                arrangement = arrangement4;
            }
            p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG13);
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier21, companion4.getSetModifier());
            RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
            if (gVar != null) {
                objValueOf = Integer.valueOf(gVar.getIndex() + 1);
            } else {
                objValueOf = "";
            }
            MaterialTheme materialTheme4 = MaterialTheme.INSTANCE;
            int i14 = MaterialTheme.$stable;
            TextStyle titleLarge4 = materialTheme4.getTypography(composerStartRestartGroup, i14).getTitleLarge();
            long j11 = p107y3.a.f15990o;
            FontWeight.Companion companion8 = FontWeight.Companion;
            TextKt.m2432Text4IGK_g("Edit Page " + objValueOf, (Modifier) null, j11, 0L, (FontStyle) null, companion8.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, titleLarge4, composerStartRestartGroup, 196992, 0, 65498);
            int i15 = (i7 >> 6) & 14;
            mutableState2 = mutableState;
            arrangement2 = arrangement;
            IconButtonKt.IconButton(onCancel, null, false, null, null, T.f14438a, composerStartRestartGroup, i15 | 196608, 30);
            composerStartRestartGroup.endNode();
            MeasurePolicy measurePolicyColumnMeasurePolicy17 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap121 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier121 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            constructor2 = companion4.getConstructor();
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
            eVarG = p035i0.a.g(companion4, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy17, composerM3407constructorimpl2, currentCompositionLocalMap121);
            if (composerM3407constructorimpl2.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
            } else {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier121, companion4.getSetModifier());
            TextStyle bodySmall4 = materialTheme4.getTypography(composerStartRestartGroup, i14).getBodySmall();
            long j12 = p107y3.a.p;
            TextKt.m2432Text4IGK_g("Selection Tool", (Modifier) null, j12, 0L, (FontStyle) null, companion8.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall4, composerStartRestartGroup, 196998, 0, 65498);
            float f115 = 8;
            b.m(f115, companion, composerStartRestartGroup, 6);
            Modifier modifierFillMaxWidth$default121 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            float f116 = 12;
            MeasurePolicy measurePolicyRowMeasurePolicy1115 = RowKt.rowMeasurePolicy(arrangement2.m548spacedBy0680j_4(Dp.m6403constructorimpl(f116)), companion3.getTop(), composerStartRestartGroup, 6);
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap23 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier23 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default121);
            constructor3 = companion4.getConstructor();
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
            e eVarG17 = p035i0.a.g(companion4, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy1115, composerM3407constructorimpl3, currentCompositionLocalMap23);
            if (composerM3407constructorimpl3.getInserting()) {
                if (!o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                }
                arrangement3 = arrangement2;
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier23, companion4.getSetModifier());
                if (((EnumC2604o4) mutableState2.getValue()) == EnumC2604o4.f15367o) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                composerStartRestartGroup.startReplaceGroup(-1169294829);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == companion2.getEmpty()) {
                    mutableState3 = mutableState2;
                    objRememberedValue = new I(16, mutableState3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    mutableState3 = mutableState2;
                }
                composerStartRestartGroup.endReplaceGroup();
                mutableState4 = mutableState3;
                Arrangement arrangement11 = arrangement3;
                d("Rectangle", z3, (a) objRememberedValue, RowScope.weight$default(rowScopeInstance4, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                if (((EnumC2604o4) mutableState4.getValue()) == EnumC2604o4.p) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                composerStartRestartGroup.startReplaceGroup(-1169286256);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion2.getEmpty()) {
                    mutableState5 = mutableState4;
                    objRememberedValue2 = new I(17, mutableState5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    mutableState5 = mutableState4;
                }
                composerStartRestartGroup.endReplaceGroup();
                MutableState mutableState2110 = mutableState5;
                d("Circle", z4, (a) objRememberedValue2, RowScope.weight$default(rowScopeInstance4, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                b.n(composerStartRestartGroup, f6, companion, composerStartRestartGroup, 6);
                TextKt.m2432Text4IGK_g("Edit Action", (Modifier) null, j12, 0L, (FontStyle) null, companion8.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme4.getTypography(composerStartRestartGroup, i14).getBodySmall(), composerStartRestartGroup, 196998, 0, 65498);
                b.m(f115, companion, composerStartRestartGroup, 6);
                Modifier modifierFillMaxWidth$default11115 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy1116 = RowKt.rowMeasurePolicy(arrangement11.m548spacedBy0680j_4(Dp.m6403constructorimpl(f116)), companion3.getTop(), composerStartRestartGroup, 6);
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap11118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier11118 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default11115);
                constructor4 = companion4.getConstructor();
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
                e eVarG18 = p035i0.a.g(companion4, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy1116, composerM3407constructorimpl4, currentCompositionLocalMap11118);
                if (composerM3407constructorimpl4.getInserting()) {
                    f5 = f6;
                    if (!o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier11118, companion4.getSetModifier());
                    if (((EnumC2380a4) mutableState15.getValue()) == EnumC2380a4.f14770o) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    composerStartRestartGroup.startReplaceGroup(-1169264808);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion2.getEmpty()) {
                        mutableState6 = mutableState15;
                        objRememberedValue3 = new I(18, mutableState6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        mutableState6 = mutableState15;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    float f117 = f5;
                    mutableState7 = mutableState6;
                    d("Invert Colors", z5, (a) objRememberedValue3, RowScope.weight$default(rowScopeInstance4, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                    if (((EnumC2380a4) mutableState7.getValue()) == EnumC2380a4.p) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    composerStartRestartGroup.startReplaceGroup(-1169255491);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion2.getEmpty()) {
                        mutableState8 = mutableState7;
                        objRememberedValue4 = new I(19, mutableState8);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        mutableState8 = mutableState7;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    MutableState mutableState2111 = mutableState8;
                    d("Paint Black", z6, (a) objRememberedValue4, RowScope.weight$default(rowScopeInstance4, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                    b.n(composerStartRestartGroup, f117, companion, composerStartRestartGroup, 6);
                    TextKt.m2432Text4IGK_g("History", (Modifier) null, j12, 0L, (FontStyle) null, companion8.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme4.getTypography(composerStartRestartGroup, i14).getBodySmall(), composerStartRestartGroup, 196998, 0, 65498);
                    b.m(f115, companion, composerStartRestartGroup, 6);
                    Modifier modifierFillMaxWidth$default11116 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy1117 = RowKt.rowMeasurePolicy(arrangement11.m548spacedBy0680j_4(Dp.m6403constructorimpl(f116)), companion3.getTop(), composerStartRestartGroup, 6);
                    currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier11119 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default11116);
                    constructor5 = companion4.getConstructor();
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
                    eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy1117, composerM3407constructorimpl5, currentCompositionLocalMap11119);
                    if (composerM3407constructorimpl5.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier11119, companion4.getSetModifier());
                    Icons icons13 = Icons.INSTANCE;
                    ImageVector keyboardArrowLeft13 = KeyboardArrowLeftKt.getKeyboardArrowLeft(icons13.getDefault());
                    boolean z1112 = !((List) mutableState16.getValue()).isEmpty();
                    composerStartRestartGroup.startReplaceGroup(-1169231984);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion2.getEmpty()) {
                        mutableState9 = mutableState16;
                        mutableState10 = mutableState17;
                        objRememberedValue5 = new C2412c4(0, mutableState9, mutableState10);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        mutableState9 = mutableState16;
                        mutableState10 = mutableState17;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    mutableState11 = mutableState10;
                    mutableState12 = mutableState9;
                    b("Undo", keyboardArrowLeft13, z1112, (a) objRememberedValue5, RowScope.weight$default(rowScopeInstance4, companion, 1.0f, false, 2, null), composerStartRestartGroup, 3078);
                    ImageVector keyboardArrowRight13 = KeyboardArrowRightKt.getKeyboardArrowRight(icons13.getDefault());
                    boolean z1113 = !((List) mutableState11.getValue()).isEmpty();
                    composerStartRestartGroup.startReplaceGroup(-1169213590);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == companion2.getEmpty()) {
                        mutableState13 = mutableState11;
                        objRememberedValue6 = new C2412c4(1, mutableState13, mutableState12);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        mutableState13 = mutableState11;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    b("Redo", keyboardArrowRight13, z1113, (a) objRememberedValue6, RowScope.weight$default(rowScopeInstance4, companion, 1.0f, false, 2, null), composerStartRestartGroup, 3078);
                    b.r(composerStartRestartGroup, f117, companion, composerStartRestartGroup, 6);
                    BoxWithConstraintsKt.BoxWithConstraints(b.g(b.f(f116, SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance2, companion, 1.0f, false, 2, null), 0.0f, 1, null), ColorKt.Color(4279176986L)), f116), companion3.getCenter(), false, ComposableLambdaKt.rememberComposableLambda(1986572859, true, new C2524j4(gVar, mutableState18, mutableState20, mutableState21, mutableState19, mutableState12, mutableState2110, mutableState2111, stateAnimateFloat, mutableState13), composerStartRestartGroup, 54), composerStartRestartGroup, 3120, 4);
                    b.m(f117, companion, composerStartRestartGroup, 6);
                    Modifier modifierFillMaxWidth$default11117 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy18 = ColumnKt.columnMeasurePolicy(arrangement11.getTop(), companion3.getCenterHorizontally(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap111110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier111110 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default11117);
                    constructor6 = companion4.getConstructor();
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
                    eVarG3 = p035i0.a.g(companion4, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy18, composerM3407constructorimpl6, currentCompositionLocalMap111110);
                    if (composerM3407constructorimpl6.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier111110, companion4.getSetModifier());
                    TextKt.m2432Text4IGK_g("Draw selections, click Apply to commit changes", (Modifier) null, j12, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme4.getTypography(composerStartRestartGroup, i14).getBodySmall(), composerStartRestartGroup, 390, 0, 65530);
                    b.m(f117, companion, composerStartRestartGroup, 6);
                    Modifier modifierFillMaxWidth$default11118 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy1118 = RowKt.rowMeasurePolicy(arrangement11.m548spacedBy0680j_4(Dp.m6403constructorimpl(f117)), companion3.getTop(), composerStartRestartGroup, 6);
                    currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap111111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier111111 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default11118);
                    constructor7 = companion4.getConstructor();
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
                    eVarG4 = p035i0.a.g(companion4, composerM3407constructorimpl7, measurePolicyRowMeasurePolicy1118, composerM3407constructorimpl7, currentCompositionLocalMap111111);
                    if (composerM3407constructorimpl7.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG4);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG4);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier111111, companion4.getSetModifier());
                    composer2 = composerStartRestartGroup;
                    ButtonKt.OutlinedButton(onCancel, SizeKt.m699height3ABfNKs(RowScope.weight$default(rowScopeInstance4, companion, 1.0f, false, 2, null), Dp.m6403constructorimpl(56)), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f116)), ButtonDefaults.INSTANCE.m1530outlinedButtonColorsro_MJ88(Color.Companion.m3962getTransparent0d7_KjU(), j11, 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 54, 12), null, BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(1), p107y3.a.f15991r), null, null, T.f14439b, composer2, i15 | 806879232, 420);
                    composer2.startReplaceGroup(-1168621978);
                    if ((i7 & 112) == 32) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    objRememberedValue7 = composer2.rememberedValue();
                    if (z7) {
                        objRememberedValue7 = new C2290i(5, onSave, mutableState12);
                        composer2.updateRememberedValue(objRememberedValue7);
                    } else {
                        objRememberedValue7 = new C2290i(5, onSave, mutableState12);
                        composer2.updateRememberedValue(objRememberedValue7);
                    }
                    composer2.endReplaceGroup();
                    q.a("Save Edits", (a) objRememberedValue7, RowScope.weight$default(rowScopeInstance4, companion, 1.0f, false, 2, null), null, false, false, composer2, 6, 56);
                    if (S2.b(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion;
                } else {
                    f5 = f6;
                }
                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG18);
                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier11118, companion4.getSetModifier());
                if (((EnumC2380a4) mutableState15.getValue()) == EnumC2380a4.f14770o) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                composerStartRestartGroup.startReplaceGroup(-1169264808);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion2.getEmpty()) {
                    mutableState6 = mutableState15;
                    objRememberedValue3 = new I(18, mutableState6);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    mutableState6 = mutableState15;
                }
                composerStartRestartGroup.endReplaceGroup();
                float f118 = f5;
                mutableState7 = mutableState6;
                d("Invert Colors", z5, (a) objRememberedValue3, RowScope.weight$default(rowScopeInstance4, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                if (((EnumC2380a4) mutableState7.getValue()) == EnumC2380a4.p) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                composerStartRestartGroup.startReplaceGroup(-1169255491);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion2.getEmpty()) {
                    mutableState8 = mutableState7;
                    objRememberedValue4 = new I(19, mutableState8);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    mutableState8 = mutableState7;
                }
                composerStartRestartGroup.endReplaceGroup();
                MutableState mutableState2112 = mutableState8;
                d("Paint Black", z6, (a) objRememberedValue4, RowScope.weight$default(rowScopeInstance4, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                b.n(composerStartRestartGroup, f118, companion, composerStartRestartGroup, 6);
                TextKt.m2432Text4IGK_g("History", (Modifier) null, j12, 0L, (FontStyle) null, companion8.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme4.getTypography(composerStartRestartGroup, i14).getBodySmall(), composerStartRestartGroup, 196998, 0, 65498);
                b.m(f115, companion, composerStartRestartGroup, 6);
                Modifier modifierFillMaxWidth$default11119 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy1119 = RowKt.rowMeasurePolicy(arrangement11.m548spacedBy0680j_4(Dp.m6403constructorimpl(f116)), companion3.getTop(), composerStartRestartGroup, 6);
                currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap111112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier111112 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default11119);
                constructor5 = companion4.getConstructor();
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
                eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy1119, composerM3407constructorimpl5, currentCompositionLocalMap111112);
                if (composerM3407constructorimpl5.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                } else {
                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier111112, companion4.getSetModifier());
                Icons icons14 = Icons.INSTANCE;
                ImageVector keyboardArrowLeft14 = KeyboardArrowLeftKt.getKeyboardArrowLeft(icons14.getDefault());
                boolean z1114 = !((List) mutableState16.getValue()).isEmpty();
                composerStartRestartGroup.startReplaceGroup(-1169231984);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion2.getEmpty()) {
                    mutableState9 = mutableState16;
                    mutableState10 = mutableState17;
                    objRememberedValue5 = new C2412c4(0, mutableState9, mutableState10);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    mutableState9 = mutableState16;
                    mutableState10 = mutableState17;
                }
                composerStartRestartGroup.endReplaceGroup();
                mutableState11 = mutableState10;
                mutableState12 = mutableState9;
                b("Undo", keyboardArrowLeft14, z1114, (a) objRememberedValue5, RowScope.weight$default(rowScopeInstance4, companion, 1.0f, false, 2, null), composerStartRestartGroup, 3078);
                ImageVector keyboardArrowRight14 = KeyboardArrowRightKt.getKeyboardArrowRight(icons14.getDefault());
                boolean z1115 = !((List) mutableState11.getValue()).isEmpty();
                composerStartRestartGroup.startReplaceGroup(-1169213590);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion2.getEmpty()) {
                    mutableState13 = mutableState11;
                    objRememberedValue6 = new C2412c4(1, mutableState13, mutableState12);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    mutableState13 = mutableState11;
                }
                composerStartRestartGroup.endReplaceGroup();
                b("Redo", keyboardArrowRight14, z1115, (a) objRememberedValue6, RowScope.weight$default(rowScopeInstance4, companion, 1.0f, false, 2, null), composerStartRestartGroup, 3078);
                b.r(composerStartRestartGroup, f118, companion, composerStartRestartGroup, 6);
                BoxWithConstraintsKt.BoxWithConstraints(b.g(b.f(f116, SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance2, companion, 1.0f, false, 2, null), 0.0f, 1, null), ColorKt.Color(4279176986L)), f116), companion3.getCenter(), false, ComposableLambdaKt.rememberComposableLambda(1986572859, true, new C2524j4(gVar, mutableState18, mutableState20, mutableState21, mutableState19, mutableState12, mutableState2110, mutableState2112, stateAnimateFloat, mutableState13), composerStartRestartGroup, 54), composerStartRestartGroup, 3120, 4);
                b.m(f118, companion, composerStartRestartGroup, 6);
                Modifier modifierFillMaxWidth$default111110 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy19 = ColumnKt.columnMeasurePolicy(arrangement11.getTop(), companion3.getCenterHorizontally(), composerStartRestartGroup, 48);
                currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap111113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier111113 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default111110);
                constructor6 = companion4.getConstructor();
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
                eVarG3 = p035i0.a.g(companion4, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy19, composerM3407constructorimpl6, currentCompositionLocalMap111113);
                if (composerM3407constructorimpl6.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                } else {
                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                }
                Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier111113, companion4.getSetModifier());
                TextKt.m2432Text4IGK_g("Draw selections, click Apply to commit changes", (Modifier) null, j12, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme4.getTypography(composerStartRestartGroup, i14).getBodySmall(), composerStartRestartGroup, 390, 0, 65530);
                b.m(f118, companion, composerStartRestartGroup, 6);
                Modifier modifierFillMaxWidth$default111111 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy11110 = RowKt.rowMeasurePolicy(arrangement11.m548spacedBy0680j_4(Dp.m6403constructorimpl(f118)), companion3.getTop(), composerStartRestartGroup, 6);
                currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap111114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier111114 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default111111);
                constructor7 = companion4.getConstructor();
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
                eVarG4 = p035i0.a.g(companion4, composerM3407constructorimpl7, measurePolicyRowMeasurePolicy11110, composerM3407constructorimpl7, currentCompositionLocalMap111114);
                if (composerM3407constructorimpl7.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG4);
                } else {
                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG4);
                }
                Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier111114, companion4.getSetModifier());
                composer2 = composerStartRestartGroup;
                ButtonKt.OutlinedButton(onCancel, SizeKt.m699height3ABfNKs(RowScope.weight$default(rowScopeInstance4, companion, 1.0f, false, 2, null), Dp.m6403constructorimpl(56)), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f116)), ButtonDefaults.INSTANCE.m1530outlinedButtonColorsro_MJ88(Color.Companion.m3962getTransparent0d7_KjU(), j11, 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 54, 12), null, BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(1), p107y3.a.f15991r), null, null, T.f14439b, composer2, i15 | 806879232, 420);
                composer2.startReplaceGroup(-1168621978);
                if ((i7 & 112) == 32) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                objRememberedValue7 = composer2.rememberedValue();
                if (z7) {
                    objRememberedValue7 = new C2290i(5, onSave, mutableState12);
                    composer2.updateRememberedValue(objRememberedValue7);
                } else {
                    objRememberedValue7 = new C2290i(5, onSave, mutableState12);
                    composer2.updateRememberedValue(objRememberedValue7);
                }
                composer2.endReplaceGroup();
                q.a("Save Edits", (a) objRememberedValue7, RowScope.weight$default(rowScopeInstance4, companion, 1.0f, false, 2, null), null, false, false, composer2, 6, 56);
                if (S2.b(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = companion;
            } else {
                arrangement3 = arrangement2;
            }
            arrangement3 = arrangement2;
            p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG17);
            arrangement3 = arrangement2;
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier23, companion4.getSetModifier());
            if (((EnumC2604o4) mutableState2.getValue()) == EnumC2604o4.f15367o) {
                z3 = true;
            } else {
                z3 = false;
            }
            composerStartRestartGroup.startReplaceGroup(-1169294829);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == companion2.getEmpty()) {
                mutableState3 = mutableState2;
                objRememberedValue = new I(16, mutableState3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                mutableState3 = mutableState2;
            }
            composerStartRestartGroup.endReplaceGroup();
            mutableState4 = mutableState3;
            Arrangement arrangement12 = arrangement3;
            d("Rectangle", z3, (a) objRememberedValue, RowScope.weight$default(rowScopeInstance4, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
            if (((EnumC2604o4) mutableState4.getValue()) == EnumC2604o4.p) {
                z4 = true;
            } else {
                z4 = false;
            }
            composerStartRestartGroup.startReplaceGroup(-1169286256);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion2.getEmpty()) {
                mutableState5 = mutableState4;
                objRememberedValue2 = new I(17, mutableState5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                mutableState5 = mutableState4;
            }
            composerStartRestartGroup.endReplaceGroup();
            MutableState mutableState2113 = mutableState5;
            d("Circle", z4, (a) objRememberedValue2, RowScope.weight$default(rowScopeInstance4, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
            b.n(composerStartRestartGroup, f6, companion, composerStartRestartGroup, 6);
            TextKt.m2432Text4IGK_g("Edit Action", (Modifier) null, j12, 0L, (FontStyle) null, companion8.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme4.getTypography(composerStartRestartGroup, i14).getBodySmall(), composerStartRestartGroup, 196998, 0, 65498);
            b.m(f115, companion, composerStartRestartGroup, 6);
            Modifier modifierFillMaxWidth$default111112 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy11111 = RowKt.rowMeasurePolicy(arrangement12.m548spacedBy0680j_4(Dp.m6403constructorimpl(f116)), companion3.getTop(), composerStartRestartGroup, 6);
            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap111115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier111115 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default111112);
            constructor4 = companion4.getConstructor();
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
            e eVarG19 = p035i0.a.g(companion4, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy11111, composerM3407constructorimpl4, currentCompositionLocalMap111115);
            if (composerM3407constructorimpl4.getInserting()) {
                f5 = f6;
                if (!o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                }
                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier111115, companion4.getSetModifier());
                if (((EnumC2380a4) mutableState15.getValue()) == EnumC2380a4.f14770o) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                composerStartRestartGroup.startReplaceGroup(-1169264808);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion2.getEmpty()) {
                    mutableState6 = mutableState15;
                    objRememberedValue3 = new I(18, mutableState6);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    mutableState6 = mutableState15;
                }
                composerStartRestartGroup.endReplaceGroup();
                float f119 = f5;
                mutableState7 = mutableState6;
                d("Invert Colors", z5, (a) objRememberedValue3, RowScope.weight$default(rowScopeInstance4, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                if (((EnumC2380a4) mutableState7.getValue()) == EnumC2380a4.p) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                composerStartRestartGroup.startReplaceGroup(-1169255491);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion2.getEmpty()) {
                    mutableState8 = mutableState7;
                    objRememberedValue4 = new I(19, mutableState8);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    mutableState8 = mutableState7;
                }
                composerStartRestartGroup.endReplaceGroup();
                MutableState mutableState2114 = mutableState8;
                d("Paint Black", z6, (a) objRememberedValue4, RowScope.weight$default(rowScopeInstance4, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
                b.n(composerStartRestartGroup, f119, companion, composerStartRestartGroup, 6);
                TextKt.m2432Text4IGK_g("History", (Modifier) null, j12, 0L, (FontStyle) null, companion8.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme4.getTypography(composerStartRestartGroup, i14).getBodySmall(), composerStartRestartGroup, 196998, 0, 65498);
                b.m(f115, companion, composerStartRestartGroup, 6);
                Modifier modifierFillMaxWidth$default111113 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy11112 = RowKt.rowMeasurePolicy(arrangement12.m548spacedBy0680j_4(Dp.m6403constructorimpl(f116)), companion3.getTop(), composerStartRestartGroup, 6);
                currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap111116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier111116 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default111113);
                constructor5 = companion4.getConstructor();
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
                eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy11112, composerM3407constructorimpl5, currentCompositionLocalMap111116);
                if (composerM3407constructorimpl5.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                } else {
                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier111116, companion4.getSetModifier());
                Icons icons15 = Icons.INSTANCE;
                ImageVector keyboardArrowLeft15 = KeyboardArrowLeftKt.getKeyboardArrowLeft(icons15.getDefault());
                boolean z1116 = !((List) mutableState16.getValue()).isEmpty();
                composerStartRestartGroup.startReplaceGroup(-1169231984);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion2.getEmpty()) {
                    mutableState9 = mutableState16;
                    mutableState10 = mutableState17;
                    objRememberedValue5 = new C2412c4(0, mutableState9, mutableState10);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    mutableState9 = mutableState16;
                    mutableState10 = mutableState17;
                }
                composerStartRestartGroup.endReplaceGroup();
                mutableState11 = mutableState10;
                mutableState12 = mutableState9;
                b("Undo", keyboardArrowLeft15, z1116, (a) objRememberedValue5, RowScope.weight$default(rowScopeInstance4, companion, 1.0f, false, 2, null), composerStartRestartGroup, 3078);
                ImageVector keyboardArrowRight15 = KeyboardArrowRightKt.getKeyboardArrowRight(icons15.getDefault());
                boolean z1117 = !((List) mutableState11.getValue()).isEmpty();
                composerStartRestartGroup.startReplaceGroup(-1169213590);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion2.getEmpty()) {
                    mutableState13 = mutableState11;
                    objRememberedValue6 = new C2412c4(1, mutableState13, mutableState12);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    mutableState13 = mutableState11;
                }
                composerStartRestartGroup.endReplaceGroup();
                b("Redo", keyboardArrowRight15, z1117, (a) objRememberedValue6, RowScope.weight$default(rowScopeInstance4, companion, 1.0f, false, 2, null), composerStartRestartGroup, 3078);
                b.r(composerStartRestartGroup, f119, companion, composerStartRestartGroup, 6);
                BoxWithConstraintsKt.BoxWithConstraints(b.g(b.f(f116, SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance2, companion, 1.0f, false, 2, null), 0.0f, 1, null), ColorKt.Color(4279176986L)), f116), companion3.getCenter(), false, ComposableLambdaKt.rememberComposableLambda(1986572859, true, new C2524j4(gVar, mutableState18, mutableState20, mutableState21, mutableState19, mutableState12, mutableState2113, mutableState2114, stateAnimateFloat, mutableState13), composerStartRestartGroup, 54), composerStartRestartGroup, 3120, 4);
                b.m(f119, companion, composerStartRestartGroup, 6);
                Modifier modifierFillMaxWidth$default111114 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy110 = ColumnKt.columnMeasurePolicy(arrangement12.getTop(), companion3.getCenterHorizontally(), composerStartRestartGroup, 48);
                currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap111117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier111117 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default111114);
                constructor6 = companion4.getConstructor();
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
                eVarG3 = p035i0.a.g(companion4, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy110, composerM3407constructorimpl6, currentCompositionLocalMap111117);
                if (composerM3407constructorimpl6.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                } else {
                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
                }
                Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier111117, companion4.getSetModifier());
                TextKt.m2432Text4IGK_g("Draw selections, click Apply to commit changes", (Modifier) null, j12, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme4.getTypography(composerStartRestartGroup, i14).getBodySmall(), composerStartRestartGroup, 390, 0, 65530);
                b.m(f119, companion, composerStartRestartGroup, 6);
                Modifier modifierFillMaxWidth$default111115 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy11113 = RowKt.rowMeasurePolicy(arrangement12.m548spacedBy0680j_4(Dp.m6403constructorimpl(f119)), companion3.getTop(), composerStartRestartGroup, 6);
                currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap111118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier111118 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default111115);
                constructor7 = companion4.getConstructor();
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
                eVarG4 = p035i0.a.g(companion4, composerM3407constructorimpl7, measurePolicyRowMeasurePolicy11113, composerM3407constructorimpl7, currentCompositionLocalMap111118);
                if (composerM3407constructorimpl7.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG4);
                } else {
                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG4);
                }
                Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier111118, companion4.getSetModifier());
                composer2 = composerStartRestartGroup;
                ButtonKt.OutlinedButton(onCancel, SizeKt.m699height3ABfNKs(RowScope.weight$default(rowScopeInstance4, companion, 1.0f, false, 2, null), Dp.m6403constructorimpl(56)), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f116)), ButtonDefaults.INSTANCE.m1530outlinedButtonColorsro_MJ88(Color.Companion.m3962getTransparent0d7_KjU(), j11, 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 54, 12), null, BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(1), p107y3.a.f15991r), null, null, T.f14439b, composer2, i15 | 806879232, 420);
                composer2.startReplaceGroup(-1168621978);
                if ((i7 & 112) == 32) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                objRememberedValue7 = composer2.rememberedValue();
                if (z7) {
                    objRememberedValue7 = new C2290i(5, onSave, mutableState12);
                    composer2.updateRememberedValue(objRememberedValue7);
                } else {
                    objRememberedValue7 = new C2290i(5, onSave, mutableState12);
                    composer2.updateRememberedValue(objRememberedValue7);
                }
                composer2.endReplaceGroup();
                q.a("Save Edits", (a) objRememberedValue7, RowScope.weight$default(rowScopeInstance4, companion, 1.0f, false, 2, null), null, false, false, composer2, 6, 56);
                if (S2.b(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = companion;
            } else {
                f5 = f6;
            }
            p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG19);
            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier111115, companion4.getSetModifier());
            if (((EnumC2380a4) mutableState15.getValue()) == EnumC2380a4.f14770o) {
                z5 = true;
            } else {
                z5 = false;
            }
            composerStartRestartGroup.startReplaceGroup(-1169264808);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion2.getEmpty()) {
                mutableState6 = mutableState15;
                objRememberedValue3 = new I(18, mutableState6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                mutableState6 = mutableState15;
            }
            composerStartRestartGroup.endReplaceGroup();
            float f1110 = f5;
            mutableState7 = mutableState6;
            d("Invert Colors", z5, (a) objRememberedValue3, RowScope.weight$default(rowScopeInstance4, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
            if (((EnumC2380a4) mutableState7.getValue()) == EnumC2380a4.p) {
                z6 = true;
            } else {
                z6 = false;
            }
            composerStartRestartGroup.startReplaceGroup(-1169255491);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion2.getEmpty()) {
                mutableState8 = mutableState7;
                objRememberedValue4 = new I(19, mutableState8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                mutableState8 = mutableState7;
            }
            composerStartRestartGroup.endReplaceGroup();
            MutableState mutableState2115 = mutableState8;
            d("Paint Black", z6, (a) objRememberedValue4, RowScope.weight$default(rowScopeInstance4, companion, 1.0f, false, 2, null), composerStartRestartGroup, 390);
            b.n(composerStartRestartGroup, f1110, companion, composerStartRestartGroup, 6);
            TextKt.m2432Text4IGK_g("History", (Modifier) null, j12, 0L, (FontStyle) null, companion8.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme4.getTypography(composerStartRestartGroup, i14).getBodySmall(), composerStartRestartGroup, 196998, 0, 65498);
            b.m(f115, companion, composerStartRestartGroup, 6);
            Modifier modifierFillMaxWidth$default111116 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy11114 = RowKt.rowMeasurePolicy(arrangement12.m548spacedBy0680j_4(Dp.m6403constructorimpl(f116)), companion3.getTop(), composerStartRestartGroup, 6);
            currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap111119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier111119 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default111116);
            constructor5 = companion4.getConstructor();
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
            eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy11114, composerM3407constructorimpl5, currentCompositionLocalMap111119);
            if (composerM3407constructorimpl5.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
            } else {
                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier111119, companion4.getSetModifier());
            Icons icons16 = Icons.INSTANCE;
            ImageVector keyboardArrowLeft16 = KeyboardArrowLeftKt.getKeyboardArrowLeft(icons16.getDefault());
            boolean z1118 = !((List) mutableState16.getValue()).isEmpty();
            composerStartRestartGroup.startReplaceGroup(-1169231984);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion2.getEmpty()) {
                mutableState9 = mutableState16;
                mutableState10 = mutableState17;
                objRememberedValue5 = new C2412c4(0, mutableState9, mutableState10);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                mutableState9 = mutableState16;
                mutableState10 = mutableState17;
            }
            composerStartRestartGroup.endReplaceGroup();
            mutableState11 = mutableState10;
            mutableState12 = mutableState9;
            b("Undo", keyboardArrowLeft16, z1118, (a) objRememberedValue5, RowScope.weight$default(rowScopeInstance4, companion, 1.0f, false, 2, null), composerStartRestartGroup, 3078);
            ImageVector keyboardArrowRight16 = KeyboardArrowRightKt.getKeyboardArrowRight(icons16.getDefault());
            boolean z1119 = !((List) mutableState11.getValue()).isEmpty();
            composerStartRestartGroup.startReplaceGroup(-1169213590);
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion2.getEmpty()) {
                mutableState13 = mutableState11;
                objRememberedValue6 = new C2412c4(1, mutableState13, mutableState12);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                mutableState13 = mutableState11;
            }
            composerStartRestartGroup.endReplaceGroup();
            b("Redo", keyboardArrowRight16, z1119, (a) objRememberedValue6, RowScope.weight$default(rowScopeInstance4, companion, 1.0f, false, 2, null), composerStartRestartGroup, 3078);
            b.r(composerStartRestartGroup, f1110, companion, composerStartRestartGroup, 6);
            BoxWithConstraintsKt.BoxWithConstraints(b.g(b.f(f116, SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance2, companion, 1.0f, false, 2, null), 0.0f, 1, null), ColorKt.Color(4279176986L)), f116), companion3.getCenter(), false, ComposableLambdaKt.rememberComposableLambda(1986572859, true, new C2524j4(gVar, mutableState18, mutableState20, mutableState21, mutableState19, mutableState12, mutableState2113, mutableState2115, stateAnimateFloat, mutableState13), composerStartRestartGroup, 54), composerStartRestartGroup, 3120, 4);
            b.m(f1110, companion, composerStartRestartGroup, 6);
            Modifier modifierFillMaxWidth$default111117 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy111 = ColumnKt.columnMeasurePolicy(arrangement12.getTop(), companion3.getCenterHorizontally(), composerStartRestartGroup, 48);
            currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap1111110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier1111110 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default111117);
            constructor6 = companion4.getConstructor();
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
            eVarG3 = p035i0.a.g(companion4, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy111, composerM3407constructorimpl6, currentCompositionLocalMap1111110);
            if (composerM3407constructorimpl6.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
            } else {
                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG3);
            }
            Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier1111110, companion4.getSetModifier());
            TextKt.m2432Text4IGK_g("Draw selections, click Apply to commit changes", (Modifier) null, j12, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme4.getTypography(composerStartRestartGroup, i14).getBodySmall(), composerStartRestartGroup, 390, 0, 65530);
            b.m(f1110, companion, composerStartRestartGroup, 6);
            Modifier modifierFillMaxWidth$default111118 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy11115 = RowKt.rowMeasurePolicy(arrangement12.m548spacedBy0680j_4(Dp.m6403constructorimpl(f1110)), companion3.getTop(), composerStartRestartGroup, 6);
            currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap1111111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier1111111 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default111118);
            constructor7 = companion4.getConstructor();
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
            eVarG4 = p035i0.a.g(companion4, composerM3407constructorimpl7, measurePolicyRowMeasurePolicy11115, composerM3407constructorimpl7, currentCompositionLocalMap1111111);
            if (composerM3407constructorimpl7.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG4);
            } else {
                p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG4);
            }
            Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier1111111, companion4.getSetModifier());
            composer2 = composerStartRestartGroup;
            ButtonKt.OutlinedButton(onCancel, SizeKt.m699height3ABfNKs(RowScope.weight$default(rowScopeInstance4, companion, 1.0f, false, 2, null), Dp.m6403constructorimpl(56)), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f116)), ButtonDefaults.INSTANCE.m1530outlinedButtonColorsro_MJ88(Color.Companion.m3962getTransparent0d7_KjU(), j11, 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 54, 12), null, BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(1), p107y3.a.f15991r), null, null, T.f14439b, composer2, i15 | 806879232, 420);
            composer2.startReplaceGroup(-1168621978);
            if ((i7 & 112) == 32) {
                z7 = true;
            } else {
                z7 = false;
            }
            objRememberedValue7 = composer2.rememberedValue();
            if (z7) {
                objRememberedValue7 = new C2290i(5, onSave, mutableState12);
                composer2.updateRememberedValue(objRememberedValue7);
            } else {
                objRememberedValue7 = new C2290i(5, onSave, mutableState12);
                composer2.updateRememberedValue(objRememberedValue7);
            }
            composer2.endReplaceGroup();
            q.a("Save Edits", (a) objRememberedValue7, RowScope.weight$default(rowScopeInstance4, companion, 1.0f, false, 2, null), null, false, false, composer2, 6, 56);
            if (S2.b(composer2)) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2294k(gVar, onSave, onCancel, modifier2, i5));
        }
    }

    public static final void b(final String str, final ImageVector icon, final boolean z3, final a onClick, final Modifier modifier, Composer composer, final int i5) {
        int i6;
        Composer composer2;
        o.f(icon, "icon");
        o.f(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-855196327);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(icon) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changed(z3) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i5 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onClick) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i5 & 24576) == 0) {
            i6 |= composerStartRestartGroup.changed(modifier) ? Fields.Clip : Fields.Shape;
        }
        if ((i6 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-855196327, i6, -1, "com.notescrafter.ui.screens.HistoryButton (EditPageScreen.kt:715)");
            }
            RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(12));
            ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
            long j5 = p107y3.a.g;
            long j6 = p107y3.a.p;
            ButtonColors buttonColorsM1520buttonColorsro_MJ88 = buttonDefaults.m1520buttonColorsro_MJ88(j5, j6, Color.m3926copywmQWz5c$default(j5, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(j6, 0.3f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 3510, 0);
            composer2 = composerStartRestartGroup;
            ButtonKt.Button(onClick, SizeKt.m699height3ABfNKs(modifier, Dp.m6403constructorimpl(48)), z3, roundedCornerShapeM955RoundedCornerShape0680j_4, buttonColorsM1520buttonColorsro_MJ88, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1134905673, true, new C2540k4(icon, str), composerStartRestartGroup, 54), composerStartRestartGroup, ((i6 >> 9) & 14) | 805306368 | (i6 & 896), 480);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: x3.d4
                @Override // O3.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                    String str2 = str;
                    a aVar = onClick;
                    Modifier modifier2 = modifier;
                    AbstractC2588n4.b(str2, icon, z3, aVar, modifier2, (Composer) obj, iUpdateChangedFlags);
                    return B3.o.f154a;
                }
            });
        }
    }

    public static final void c(final RectF rectF, final long j5, final EnumC2604o4 tool, final EnumC2380a4 action, final float f5, final a onApply, final a onCancel, Composer composer, final int i5) {
        int i6;
        Composer composer2;
        o.f(tool, "tool");
        o.f(action, "action");
        o.f(onApply, "onApply");
        o.f(onCancel, "onCancel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1995195630);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changedInstance(rectF) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changed(tool) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i5 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changed(action) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i5 & 24576) == 0) {
            i6 |= composerStartRestartGroup.changed(f5) ? Fields.Clip : Fields.Shape;
        }
        if ((196608 & i5) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onApply) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i5) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onCancel) ? 1048576 : 524288;
        }
        if ((599171 & i6) == 599170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1995195630, i6, -1, "com.notescrafter.ui.screens.SelectionOverlay (EditPageScreen.kt:518)");
            }
            composer2 = composerStartRestartGroup;
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(1810639720, true, new C2572m4(rectF, action, tool, f5, onApply, onCancel), composerStartRestartGroup, 54), composer2, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: x3.b4
                @Override // O3.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    AbstractC2588n4.c(rectF, j5, tool, action, f5, onApply, onCancel, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i5 | 1));
                    return B3.o.f154a;
                }
            });
        }
    }

    public static final void d(String str, boolean z3, a onClick, Modifier modifier, Composer composer, int i5) {
        int i6;
        Composer composer2;
        o.f(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1648090130);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onClick) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i5 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changed(modifier) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i7 = i6;
        if ((i7 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1648090130, i7, -1, "com.notescrafter.ui.screens.ToolOption (EditPageScreen.kt:663)");
            }
            float f5 = 12;
            Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(ClickableKt.m242clickableXHw0xAI$default(b.e(f5, BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.m699height3ABfNKs(z3 ? ShadowKt.m3585shadows4CzXII$default(modifier, Dp.m6403constructorimpl(15), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(12)), false, 0L, p107y3.a.f15978a, 12, null) : modifier, Dp.m6403constructorimpl(56)), f5), z3 ? ColorKt.m3972compositeOverOWjLjI(Color.m3926copywmQWz5c$default(p107y3.a.f15978a, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), p107y3.a.g) : Color.m3926copywmQWz5c$default(p107y3.a.g, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(1), z3 ? p107y3.a.f15978a : p107y3.a.f15991r), false, null, null, onClick, 7, null), Dp.m6403constructorimpl(f5), 0.0f, 2, null);
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM670paddingVpY3zN4$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            a constructor = companion2.getConstructor();
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
            e eVarG = p035i0.a.g(companion2, composerM3407constructorimpl, measurePolicyRowMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m206backgroundbw27NRU(SizeKt.m713size3ABfNKs(companion3, Dp.m6403constructorimpl(20)), z3 ? p107y3.a.f15978a : Color.Companion.m3962getTransparent0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), Dp.m6403constructorimpl(2), z3 ? p107y3.a.f15978a : p107y3.a.p, RoundedCornerShapeKt.getCircleShape());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM220borderxT4_qwU);
            a constructor2 = companion2.getConstructor();
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
            e eVarG2 = p035i0.a.g(companion2, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(293508483);
            if (z3) {
                BoxKt.Box(BackgroundKt.m206backgroundbw27NRU(SizeKt.m713size3ABfNKs(companion3, Dp.m6403constructorimpl(8)), Color.Companion.m3964getWhite0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion3, Dp.m6403constructorimpl(f5)), composerStartRestartGroup, 6);
            TextStyle bodyMedium = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodyMedium();
            long jM3964getWhite0d7_KjU = z3 ? Color.Companion.m3964getWhite0d7_KjU() : p107y3.a.p;
            FontWeight.Companion companion4 = FontWeight.Companion;
            FontWeight bold = z3 ? companion4.getBold() : companion4.getMedium();
            composer2 = composerStartRestartGroup;
            TextKt.m2432Text4IGK_g(str, (Modifier) null, jM3964getWhite0d7_KjU, 0L, (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (c) null, bodyMedium, composer2, i7 & 14, 3072, 57306);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2444e4(str, z3, onClick, modifier, i5, 0));
        }
    }

    public static final boolean e(float f5, float f6, float f7, float f8) {
        return f5 >= f7 - 0.05f && f5 <= f7 + 0.05f && f6 >= f8 - 0.05f && f6 <= f8 + 0.05f;
    }
}
