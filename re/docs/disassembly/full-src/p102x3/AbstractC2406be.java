package p102x3;

import O3.a;
import O3.c;
import O3.e;
import W.A;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
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
import o4.d;
import p015d.l;
import p076s.b;
import p083t3.C2306q;
import p083t3.F;
import p087u3.f;
import p097w3.j;
import p097w3.n;
import p097w3.q;
import p097w3.t;

/* JADX INFO: renamed from: x3.be, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2406be {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(List documents, c onReorder, c onAddMoreFiles, a onBack, a onContinue, Modifier modifier, Composer composer, int i5) {
        int i6;
        Composer composer2;
        Modifier modifier2;
        o.f(documents, "documents");
        o.f(onReorder, "onReorder");
        o.f(onAddMoreFiles, "onAddMoreFiles");
        o.f(onBack, "onBack");
        o.f(onContinue, "onContinue");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1904052979);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changedInstance(documents) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onReorder) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onAddMoreFiles) ? 256 : Fields.SpotShadowColor;
        }
        if ((i5 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onBack) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i5 & 24576) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onContinue) ? Fields.Clip : Fields.Shape;
        }
        int i7 = i6 | 196608;
        if ((74899 & i7) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            composer2 = composerStartRestartGroup;
        } else {
            Modifier.Companion companion = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1904052979, i7, -1, "com.notescrafter.ui.screens.ReorderScreen (ReorderScreen.kt:50)");
            }
            composerStartRestartGroup.startReplaceGroup(-121449460);
            boolean zChanged = composerStartRestartGroup.changed(documents);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(documents, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Object objK = b.k(composerStartRestartGroup, -121446966);
            Composer.Companion companion2 = Composer.Companion;
            if (objK == companion2.getEmpty()) {
                objK = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK);
            }
            MutableState mutableState2 = (MutableState) objK;
            composerStartRestartGroup.endReplaceGroup();
            A a5 = new A(4);
            composerStartRestartGroup.startReplaceGroup(-121440170);
            boolean z3 = (i7 & 896) == 256;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new Wd(onAddMoreFiles, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            l lVarV = p000a.a.v(a5, (c) objRememberedValue2, composerStartRestartGroup);
            composerStartRestartGroup.startReplaceGroup(-121435265);
            if (((f) mutableState2.getValue()) != null) {
                composerStartRestartGroup.startReplaceGroup(-121434314);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion2.getEmpty()) {
                    objRememberedValue3 = new Bb(9, mutableState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                n.a((a) objRememberedValue3, null, 0L, null, ComposableLambdaKt.rememberComposableLambda(220968829, true, new Yd(onReorder, mutableState2, mutableState), composerStartRestartGroup, 54), composerStartRestartGroup, 24582, 14);
            }
            composerStartRestartGroup.endReplaceGroup();
            float f5 = 24;
            Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(f5), 0.0f, 2, null);
            Alignment.Companion companion3 = Alignment.Companion;
            Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM670paddingVpY3zN4$default);
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
            e eVarG = p035i0.a.g(companion4, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            b.m(32, companion, composerStartRestartGroup, 6);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i8 = MaterialTheme.$stable;
            TextKt.m2432Text4IGK_g("Reorder & Merge", (Modifier) null, p107y3.a.f15990o, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i8).getHeadlineMedium(), composerStartRestartGroup, 196998, 0, 65498);
            float f6 = 8;
            b.m(f6, companion, composerStartRestartGroup, 6);
            TextStyle bodyMedium = materialTheme.getTypography(composerStartRestartGroup, i8).getBodyMedium();
            long j5 = p107y3.a.p;
            TextKt.m2432Text4IGK_g("Rearrange your documents in the desired order before merging.", (Modifier) null, j5, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 2, 0, (c) null, bodyMedium, composerStartRestartGroup, 390, 3072, 56826);
            t.a(6, 2, d.r(1), null, composerStartRestartGroup, 438);
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f6)), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceGroup(282775308);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(lVarV);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == companion2.getEmpty()) {
                objRememberedValue4 = new P5(lVarV, 20);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            ButtonKt.TextButton((a) objRememberedValue4, columnScopeInstance.align(companion, companion3.getEnd()), false, null, null, null, null, null, null, AbstractC2539k3.f15241c, composerStartRestartGroup, 805306368, 508);
            b.m(f6, companion, composerStartRestartGroup, 6);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance, companion, 1.0f, false, 2, null), 0.0f, 1, null);
            float f7 = 12;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_4 = arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f7));
            composerStartRestartGroup.startReplaceGroup(282804185);
            int i9 = i7 & 112;
            boolean zChanged2 = composerStartRestartGroup.changed(mutableState) | (i9 == 32);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue5 == companion2.getEmpty()) {
                objRememberedValue5 = new F(11, mutableState, mutableState2, onReorder);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierFillMaxWidth$default, null, null, false, horizontalOrVerticalM548spacedBy0680j_4, null, null, false, (c) objRememberedValue5, composerStartRestartGroup, 24576, 238);
            b.m(f5, companion, composerStartRestartGroup, 6);
            Modifier modifierM672paddingqDBjuR0$default = PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f5), 7, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f7)), companion3.getTop(), composerStartRestartGroup, 6);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM672paddingqDBjuR0$default);
            a constructor2 = companion4.getConstructor();
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
            e eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl2, measurePolicyRowMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ButtonKt.OutlinedButton(onBack, SizeKt.m699height3ABfNKs(RowScope.weight$default(rowScopeInstance, companion, 0.35f, false, 2, null), Dp.m6403constructorimpl(56)), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(16)), ButtonDefaults.INSTANCE.m1530outlinedButtonColorsro_MJ88(Color.Companion.m3962getTransparent0d7_KjU(), j5, 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 54, 12), null, BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(1), p107y3.a.f15991r), null, null, AbstractC2539k3.f15242d, composerStartRestartGroup, ((i7 >> 9) & 14) | 806879232, 420);
            composerStartRestartGroup.startReplaceGroup(-1335267333);
            boolean zChanged3 = composerStartRestartGroup.changed(mutableState) | (i9 == 32) | ((i7 & 57344) == 16384);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue6 == companion2.getEmpty()) {
                objRememberedValue6 = new C2306q(onReorder, onContinue, mutableState, 11);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion, 0.65f, false, 2, null);
            composer2 = composerStartRestartGroup;
            q.a("Continue", (a) objRememberedValue6, modifierWeight$default, null, false, false, composerStartRestartGroup, 6, 56);
            if (androidx.compose.foundation.text.modifiers.a.w(composer2)) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Ka(documents, onReorder, onAddMoreFiles, onBack, onContinue, modifier2, i5, 1));
        }
    }

    public static final void b(final f fVar, final int i5, final boolean z3, final boolean z4, final a aVar, final a aVar2, final a aVar3, final Modifier modifier, Composer composer, final int i6) {
        int i7;
        Composer composerStartRestartGroup = composer.startRestartGroup(-259328276);
        if ((i6 & 6) == 0) {
            i7 = (composerStartRestartGroup.changedInstance(fVar) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= composerStartRestartGroup.changed(i5) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= composerStartRestartGroup.changed(z3) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i6 & 3072) == 0) {
            i7 |= composerStartRestartGroup.changed(z4) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i6 & 24576) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(aVar) ? Fields.Clip : Fields.Shape;
        }
        if ((196608 & i6) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(aVar2) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i6) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(aVar3) ? 1048576 : 524288;
        }
        if ((12582912 & i6) == 0) {
            i7 |= composerStartRestartGroup.changed(modifier) ? 8388608 : 4194304;
        }
        if ((4793491 & i7) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-259328276, i7, -1, "com.notescrafter.ui.screens.ReorderableItem (ReorderScreen.kt:248)");
            }
            j.a(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1948980015, true, new C2390ae(aVar3, i5, fVar, z4, aVar2, z3, aVar), composerStartRestartGroup, 54), composerStartRestartGroup, 196608, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: x3.Xd
                @Override // O3.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i6 | 1);
                    a aVar4 = aVar3;
                    Modifier modifier2 = modifier;
                    AbstractC2406be.b(fVar, i5, z3, z4, aVar, aVar2, aVar4, modifier2, (Composer) obj, iUpdateChangedFlags);
                    return B3.o.f154a;
                }
            });
        }
    }
}
