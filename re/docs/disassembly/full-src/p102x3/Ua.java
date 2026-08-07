package p102x3;

import C3.v;
import O3.a;
import O3.c;
import O3.e;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
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
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
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
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import o4.d;
import p076s.b;
import p087u3.g;
import p097w3.j;
import p097w3.n;
import p097w3.q;
import p097w3.t;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Ua {
    public static final void a(g gVar, int i5, a aVar, a aVar2, a aVar3, Modifier modifier, Composer composer, int i6) {
        int i7;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2065820112);
        if ((i6 & 6) == 0) {
            i7 = (composerStartRestartGroup.changedInstance(gVar) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= composerStartRestartGroup.changed(i5) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(aVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i6 & 3072) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(aVar2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i6 & 24576) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(aVar3) ? Fields.Clip : Fields.Shape;
        }
        int i8 = i7 | 196608;
        if ((74899 & i8) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            Modifier.Companion companion = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2065820112, i8, -1, "com.notescrafter.ui.screens.PageThumbnail (PreviewScreen.kt:607)");
            }
            int i9 = ((i8 << 6) & 57344) | 196608;
            modifier2 = companion;
            j.a(AspectRatioKt.aspectRatio$default(companion, 1.7777778f, false, 2, null), 0L, gVar.isSelected() ? p107y3.a.f15978a : p107y3.a.f15991r, 0.0f, aVar, ComposableLambdaKt.rememberComposableLambda(-197043851, true, new Ma(gVar, aVar3, aVar2, i5), composerStartRestartGroup, 54), composerStartRestartGroup, i9, 10);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2699u4(gVar, i5, aVar, aVar2, aVar3, modifier2, i6));
        }
    }

    /* JADX WARN: Code duplicated, block: B:153:0x0543  */
    /* JADX WARN: Code duplicated, block: B:156:0x058e  */
    /* JADX WARN: Code duplicated, block: B:159:0x0601  */
    /* JADX WARN: Code duplicated, block: B:160:0x0603  */
    /* JADX WARN: Code duplicated, block: B:163:0x060d  */
    /* JADX WARN: Code duplicated, block: B:164:0x060f  */
    /* JADX WARN: Code duplicated, block: B:171:0x0626  */
    /* JADX WARN: Code duplicated, block: B:174:0x06fd  */
    /* JADX WARN: Code duplicated, block: B:177:0x0709  */
    /* JADX WARN: Code duplicated, block: B:178:0x070d  */
    /* JADX WARN: Code duplicated, block: B:183:0x072e  */
    /* JADX WARN: Code duplicated, block: B:186:0x07aa  */
    /* JADX WARN: Code duplicated, block: B:187:0x07ac  */
    /* JADX WARN: Code duplicated, block: B:190:0x07e5  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(List pages, c onPagesUpdate, c onPageEdit, a onBack, a onContinue, Modifier modifier, Composer composer, int i5) {
        int i6;
        int i7;
        int i8;
        SnapshotMutationPolicy snapshotMutationPolicy;
        Modifier.Companion companion;
        MutableState mutableState;
        int i9;
        MutableState mutableState2;
        Object objRememberedValue;
        Object objRememberedValue2;
        boolean z3;
        boolean z4;
        boolean z5;
        Object objRememberedValue3;
        int currentCompositeKeyHash;
        a constructor;
        Composer composerM3407constructorimpl;
        e eVarG;
        Composer composer2;
        Modifier modifier2;
        boolean z6;
        o.f(pages, "pages");
        o.f(onPagesUpdate, "onPagesUpdate");
        o.f(onPageEdit, "onPageEdit");
        o.f(onBack, "onBack");
        o.f(onContinue, "onContinue");
        Composer composerStartRestartGroup = composer.startRestartGroup(785206131);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changedInstance(pages) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onPagesUpdate) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onPageEdit) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i5 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onBack) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i5 & 24576) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onContinue) ? Fields.Clip : Fields.Shape;
        }
        int i10 = i6 | 196608;
        if ((74899 & i10) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            composer2 = composerStartRestartGroup;
        } else {
            Modifier.Companion companion2 = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(785206131, i10, -1, "com.notescrafter.ui.screens.PreviewScreen (PreviewScreen.kt:88)");
            }
            composerStartRestartGroup.startReplaceGroup(1489376111);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion3 = Composer.Companion;
            if (objRememberedValue4 == companion3.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Object objK = b.k(composerStartRestartGroup, 1489378255);
            if (objK == companion3.getEmpty()) {
                objK = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK);
            }
            MutableState mutableState3 = (MutableState) objK;
            Object objK2 = b.k(composerStartRestartGroup, 1489380335);
            if (objK2 == companion3.getEmpty()) {
                objK2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK2);
            }
            MutableState mutableState4 = (MutableState) objK2;
            Object objK3 = b.k(composerStartRestartGroup, 1489382634);
            if (objK3 == companion3.getEmpty()) {
                objK3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK3);
            }
            MutableState mutableState5 = (MutableState) objK3;
            Object objK4 = b.k(composerStartRestartGroup, 1489384711);
            if (objK4 == companion3.getEmpty()) {
                objK4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK4);
            }
            MutableState mutableState6 = (MutableState) objK4;
            Object objK5 = b.k(composerStartRestartGroup, 1489386762);
            if (objK5 == companion3.getEmpty()) {
                i7 = 2;
                objK5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK5);
            } else {
                i7 = 2;
            }
            MutableState mutableState7 = (MutableState) objK5;
            Object objK6 = b.k(composerStartRestartGroup, 1489388623);
            if (objK6 == companion3.getEmpty()) {
                objK6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i7, null);
                composerStartRestartGroup.updateRememberedValue(objK6);
            }
            MutableState mutableState8 = (MutableState) objK6;
            composerStartRestartGroup.endReplaceGroup();
            List list = pages;
            if ((list instanceof Collection) && list.isEmpty()) {
                i8 = 0;
            } else {
                Iterator it = list.iterator();
                i8 = 0;
                while (it.hasNext()) {
                    if (((g) it.next()).isSelected() && (i8 = i8 + 1) < 0) {
                        v.W();
                        throw null;
                    }
                }
            }
            int size = pages.size();
            composerStartRestartGroup.startReplaceGroup(1489396427);
            if (((Integer) mutableState3.getValue()) != null && ((Integer) mutableState4.getValue()) != null) {
                composerStartRestartGroup.startReplaceGroup(1489398724);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                    objRememberedValue5 = new C2412c4(6, mutableState3, mutableState4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                n.a((a) objRememberedValue5, null, 0L, null, ComposableLambdaKt.rememberComposableLambda(-1384739357, true, new Oa(onPagesUpdate, mutableState3, mutableState4, pages), composerStartRestartGroup, 54), composerStartRestartGroup, 24582, 14);
            }
            Object objK7 = b.k(composerStartRestartGroup, 1489467114);
            Composer.Companion companion4 = Composer.Companion;
            if (objK7 == companion4.getEmpty()) {
                snapshotMutationPolicy = null;
                objK7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK7);
            } else {
                snapshotMutationPolicy = null;
            }
            MutableState mutableState9 = (MutableState) objK7;
            Object objK8 = b.k(composerStartRestartGroup, 1489469223);
            if (objK8 == companion4.getEmpty()) {
                objK8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", snapshotMutationPolicy, 2, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(objK8);
            }
            MutableState mutableState10 = (MutableState) objK8;
            Object objK9 = b.k(composerStartRestartGroup, 1489471175);
            int i11 = i8;
            if (objK9 == companion4.getEmpty()) {
                objK9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", snapshotMutationPolicy, 2, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(objK9);
            }
            MutableState mutableState11 = (MutableState) objK9;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1489479143);
            if (((Boolean) mutableState9.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(1489476997);
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion4.getEmpty()) {
                    objRememberedValue6 = new O6(18, mutableState9);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceGroup();
                mutableState = mutableState9;
                i9 = size;
                companion = companion2;
                n.a((a) objRememberedValue6, null, 0L, null, ComposableLambdaKt.rememberComposableLambda(-907666676, true, new Qa(mutableState10, mutableState11, pages, onPagesUpdate, mutableState), composerStartRestartGroup, 54), composerStartRestartGroup, 24582, 14);
            } else {
                companion = companion2;
                mutableState = mutableState9;
                i9 = size;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1489659056);
            if (((Boolean) mutableState5.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(1489658600);
                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion4.getEmpty()) {
                    objRememberedValue7 = new O6(19, mutableState5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceGroup();
                n.a((a) objRememberedValue7, null, 0L, null, ComposableLambdaKt.rememberComposableLambda(-763256981, true, new Ra(onPagesUpdate, mutableState6, mutableState5, pages), composerStartRestartGroup, 54), composerStartRestartGroup, 24582, 14);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1489787554);
            if (((Boolean) mutableState7.getValue()).booleanValue() && ((Integer) mutableState8.getValue()) != null) {
                composerStartRestartGroup.startReplaceGroup(1489789764);
                Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == companion4.getEmpty()) {
                    objRememberedValue8 = new C2412c4(7, mutableState7, mutableState8);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceGroup();
                n.a((a) objRememberedValue8, null, 0L, null, ComposableLambdaKt.rememberComposableLambda(-618847286, true, new Sa(onPagesUpdate, mutableState7, mutableState8, pages), composerStartRestartGroup, 54), composerStartRestartGroup, 24582, 14);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion5 = companion;
            float f5 = 24;
            Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxSize$default(companion5, 0.0f, 1, null), Dp.m6403constructorimpl(f5), 0.0f, 2, null);
            Alignment.Companion companion6 = Alignment.Companion;
            Alignment.Horizontal centerHorizontally = companion6.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM670paddingVpY3zN4$default);
            ComposeUiNode.Companion companion7 = ComposeUiNode.Companion;
            a constructor2 = companion7.getConstructor();
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
            e eVarG2 = p035i0.a.g(companion7, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier, companion7.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion8 = Modifier.Companion;
            b.m(32, companion8, composerStartRestartGroup, 6);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i12 = MaterialTheme.$stable;
            TextStyle headlineMedium = materialTheme.getTypography(composerStartRestartGroup, i12).getHeadlineMedium();
            FontWeight.Companion companion9 = FontWeight.Companion;
            TextKt.m2432Text4IGK_g("Preview and Edit Pages", (Modifier) null, p107y3.a.f15990o, 0L, (FontStyle) null, companion9.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, headlineMedium, composerStartRestartGroup, 196998, 0, 65498);
            float f6 = 8;
            b.m(f6, companion8, composerStartRestartGroup, 6);
            TextStyle bodyMedium = materialTheme.getTypography(composerStartRestartGroup, i12).getBodyMedium();
            long j5 = p107y3.a.p;
            TextKt.m2432Text4IGK_g("Tap a page to select or deselect. Deselected pages will be removed from final PDF.", (Modifier) null, j5, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 2, 0, (c) null, bodyMedium, composerStartRestartGroup, 390, 3072, 56826);
            t.a(6, 3, d.s(1, 2), null, composerStartRestartGroup, 438);
            float f7 = 16;
            b.m(f7, companion8, composerStartRestartGroup, 6);
            j.a(SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null), 0L, 0L, 0.0f, null, AbstractC2474g2.f15052n, composerStartRestartGroup, 196614, 30);
            b.m(f7, companion8, composerStartRestartGroup, 6);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getEnd(), companion6.getCenterVertically(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            a constructor3 = companion7.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3407constructorimpl3 = Updater.m3407constructorimpl(composerStartRestartGroup);
            e eVarG3 = p035i0.a.g(companion7, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy, composerM3407constructorimpl3, currentCompositionLocalMap2);
            if (composerM3407constructorimpl3.getInserting()) {
                mutableState2 = mutableState8;
            } else {
                mutableState2 = mutableState8;
                if (!o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                }
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier2, companion7.getSetModifier());
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1820294782);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == companion4.getEmpty()) {
                    objRememberedValue = new O6(20, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                ButtonKt.TextButton((a) objRememberedValue, null, false, null, null, null, null, null, null, AbstractC2474g2.f15053o, composerStartRestartGroup, 805306374, 510);
                SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion8, Dp.m6403constructorimpl(f7)), composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceGroup(-1820272539);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion4.getEmpty()) {
                    objRememberedValue2 = new O6(21, mutableState5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                ButtonKt.TextButton((a) objRememberedValue2, null, false, null, null, null, null, null, null, AbstractC2474g2.p, composerStartRestartGroup, 805306374, 510);
                composerStartRestartGroup.endNode();
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion8, Dp.m6403constructorimpl(f6)), composerStartRestartGroup, 6);
                GridCells.Fixed fixed = new GridCells.Fixed(2);
                Modifier modifierWeight$default = ColumnScope.weight$default(columnScopeInstance, companion8, 1.0f, false, 2, null);
                float f8 = 12;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_4 = arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f8));
                Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_5 = arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f8));
                composerStartRestartGroup.startReplaceGroup(778190600);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(pages);
                if ((i10 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z7 = zChangedInstance | z3;
                if ((i10 & 896) == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = z7 | z4;
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z5 || objRememberedValue3 == companion4.getEmpty()) {
                    C2476g4 c2476g4 = new C2476g4(pages, onPagesUpdate, onPageEdit, mutableState2, mutableState7);
                    composerStartRestartGroup.updateRememberedValue(c2476g4);
                    objRememberedValue3 = c2476g4;
                }
                composerStartRestartGroup.endReplaceGroup();
                LazyGridDslKt.LazyVerticalGrid(fixed, modifierWeight$default, null, null, false, horizontalOrVerticalM548spacedBy0680j_5, horizontalOrVerticalM548spacedBy0680j_4, null, false, (c) objRememberedValue3, composerStartRestartGroup, 1769472, 412);
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion8, Dp.m6403constructorimpl(f7)), composerStartRestartGroup, 6);
                TextKt.m2432Text4IGK_g(i11 + " of " + i9 + " pages selected", PaddingKt.m672paddingqDBjuR0$default(companion8, 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f8), 7, null), j5, 0L, (FontStyle) null, companion9.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i12).getBodyMedium(), composerStartRestartGroup, 197040, 0, 65496);
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f8)), companion6.getCenterVertically(), composerStartRestartGroup, 54);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                constructor = companion7.getConstructor();
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
                eVarG = p035i0.a.g(companion7, composerM3407constructorimpl, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl, currentCompositionLocalMap3);
                if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier3, companion7.getSetModifier());
                int i13 = i10 >> 9;
                composer2 = composerStartRestartGroup;
                modifier2 = companion5;
                ButtonKt.OutlinedButton(onBack, SizeKt.m699height3ABfNKs(RowScope.weight$default(rowScopeInstance, companion8, 0.35f, false, 2, null), Dp.m6403constructorimpl(56)), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f7)), ButtonDefaults.INSTANCE.m1530outlinedButtonColorsro_MJ88(Color.Companion.m3962getTransparent0d7_KjU(), j5, 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 54, 12), null, BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(1), p107y3.a.f15991r), null, null, AbstractC2474g2.q, composer2, (i13 & 14) | 806879232, 420);
                if (i11 > 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                q.a("Continue", onContinue, RowScope.weight$default(rowScopeInstance, companion8, 0.65f, false, 2, null), null, z6, false, composer2, (i13 & 112) | 6, 40);
                composer2.endNode();
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion8, Dp.m6403constructorimpl(f5)), composer2, 6);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier2, companion7.getSetModifier());
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1820294782);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == companion4.getEmpty()) {
                objRememberedValue = new O6(20, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            ButtonKt.TextButton((a) objRememberedValue, null, false, null, null, null, null, null, null, AbstractC2474g2.f15053o, composerStartRestartGroup, 805306374, 510);
            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion8, Dp.m6403constructorimpl(f7)), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceGroup(-1820272539);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion4.getEmpty()) {
                objRememberedValue2 = new O6(21, mutableState5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            ButtonKt.TextButton((a) objRememberedValue2, null, false, null, null, null, null, null, null, AbstractC2474g2.p, composerStartRestartGroup, 805306374, 510);
            composerStartRestartGroup.endNode();
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion8, Dp.m6403constructorimpl(f6)), composerStartRestartGroup, 6);
            GridCells.Fixed fixed2 = new GridCells.Fixed(2);
            Modifier modifierWeight$default2 = ColumnScope.weight$default(columnScopeInstance, companion8, 1.0f, false, 2, null);
            float f9 = 12;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_6 = arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f9));
            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_7 = arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f9));
            composerStartRestartGroup.startReplaceGroup(778190600);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(pages);
            if ((i10 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z8 = zChangedInstance2 | z3;
            if ((i10 & 896) == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            z5 = z8 | z4;
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z5) {
                C2476g4 c2476g5 = new C2476g4(pages, onPagesUpdate, onPageEdit, mutableState2, mutableState7);
                composerStartRestartGroup.updateRememberedValue(c2476g5);
                objRememberedValue3 = c2476g5;
            } else {
                C2476g4 c2476g6 = new C2476g4(pages, onPagesUpdate, onPageEdit, mutableState2, mutableState7);
                composerStartRestartGroup.updateRememberedValue(c2476g6);
                objRememberedValue3 = c2476g6;
            }
            composerStartRestartGroup.endReplaceGroup();
            LazyGridDslKt.LazyVerticalGrid(fixed2, modifierWeight$default2, null, null, false, horizontalOrVerticalM548spacedBy0680j_7, horizontalOrVerticalM548spacedBy0680j_6, null, false, (c) objRememberedValue3, composerStartRestartGroup, 1769472, 412);
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion8, Dp.m6403constructorimpl(f7)), composerStartRestartGroup, 6);
            TextKt.m2432Text4IGK_g(i11 + " of " + i9 + " pages selected", PaddingKt.m672paddingqDBjuR0$default(companion8, 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f9), 7, null), j5, 0L, (FontStyle) null, companion9.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i12).getBodyMedium(), composerStartRestartGroup, 197040, 0, 65496);
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f9)), companion6.getCenterVertically(), composerStartRestartGroup, 54);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default3);
            constructor = companion7.getConstructor();
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
            eVarG = p035i0.a.g(companion7, composerM3407constructorimpl, measurePolicyRowMeasurePolicy3, composerM3407constructorimpl, currentCompositionLocalMap4);
            if (composerM3407constructorimpl.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            } else {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier4, companion7.getSetModifier());
            int i14 = i10 >> 9;
            composer2 = composerStartRestartGroup;
            modifier2 = companion5;
            ButtonKt.OutlinedButton(onBack, SizeKt.m699height3ABfNKs(RowScope.weight$default(rowScopeInstance2, companion8, 0.35f, false, 2, null), Dp.m6403constructorimpl(56)), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f7)), ButtonDefaults.INSTANCE.m1530outlinedButtonColorsro_MJ88(Color.Companion.m3962getTransparent0d7_KjU(), j5, 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 54, 12), null, BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(1), p107y3.a.f15991r), null, null, AbstractC2474g2.q, composer2, (i14 & 14) | 806879232, 420);
            if (i11 > 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            q.a("Continue", onContinue, RowScope.weight$default(rowScopeInstance2, companion8, 0.65f, false, 2, null), null, z6, false, composer2, (i14 & 112) | 6, 40);
            composer2.endNode();
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion8, Dp.m6403constructorimpl(f5)), composer2, 6);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Ka(pages, onPagesUpdate, onPageEdit, onBack, onContinue, modifier2, i5, 0));
        }
    }
}
