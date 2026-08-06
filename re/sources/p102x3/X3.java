package p102x3;

import C3.C;
import O3.a;
import O3.c;
import O3.e;
import android.content.Context;
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
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.FolderOpenKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;
import p076s.b;
import p083t3.C2288h;
import p083t3.I;
import p097w3.j;
import p097w3.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class X3 {
    public static final void a(H3 h5, a aVar, a aVar2, a aVar3, a aVar4, Modifier modifier, Composer composer, int i5) {
        int i6;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1112267819);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changedInstance(h5) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(aVar) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(aVar2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i5 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(aVar3) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i5 & 24576) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(aVar4) ? Fields.Clip : Fields.Shape;
        }
        int i7 = i6 | 196608;
        if ((74899 & i7) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            Modifier.Companion companion = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1112267819, i7, -1, "com.notescrafter.ui.screens.DownloadedFileItem (DownloadsScreen.kt:309)");
            }
            composerStartRestartGroup.startReplaceGroup(1849797348);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            modifier2 = companion;
            j.a(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0L, 0L, 0.0f, aVar, ComposableLambdaKt.rememberComposableLambda(-497266950, true, new M3(aVar2, h5, (MutableState) objRememberedValue, aVar3, aVar4), composerStartRestartGroup, 54), composerStartRestartGroup, ((i7 << 9) & 57344) | 196608, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2288h(h5, aVar, aVar2, aVar3, aVar4, modifier2, i5, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:103:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:108:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:111:0x0416  */
    /* JADX WARN: Code duplicated, block: B:114:0x0422  */
    /* JADX WARN: Code duplicated, block: B:115:0x0426  */
    /* JADX WARN: Code duplicated, block: B:120:0x0445  */
    /* JADX WARN: Code duplicated, block: B:122:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:124:0x0530  */
    /* JADX WARN: Code duplicated, block: B:125:0x0532  */
    /* JADX WARN: Code duplicated, block: B:128:0x0539  */
    /* JADX WARN: Code duplicated, block: B:129:0x053b  */
    /* JADX WARN: Code duplicated, block: B:134:0x054a  */
    /* JADX WARN: Code duplicated, block: B:138:0x0587  */
    /* JADX WARN: Code duplicated, block: B:97:0x037d  */
    /* JADX WARN: Code duplicated, block: B:99:0x03b7  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(a onBack, c onFileClick, c onFileShare, c onFileDelete, Modifier modifier, Composer composer, int i5) {
        int i6;
        Arrangement arrangement;
        Arrangement arrangement2;
        Composer composer2;
        float f5;
        MaterialTheme materialTheme;
        int i7;
        Modifier.Companion companion;
        boolean z3;
        boolean z4;
        boolean z5;
        Object objRememberedValue;
        Modifier modifier2;
        int currentCompositeKeyHash;
        a constructor;
        Composer composerM3407constructorimpl;
        e eVarG;
        int currentCompositeKeyHash2;
        a constructor2;
        Composer composerM3407constructorimpl2;
        e eVarG2;
        o.f(onBack, "onBack");
        o.f(onFileClick, "onFileClick");
        o.f(onFileShare, "onFileShare");
        o.f(onFileDelete, "onFileDelete");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1467226178);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changedInstance(onBack) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onFileClick) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onFileShare) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i5 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onFileDelete) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i8 = i6 | 24576;
        if ((i8 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            composer2 = composerStartRestartGroup;
        } else {
            Modifier.Companion companion2 = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1467226178, i8, -1, "com.notescrafter.ui.screens.DownloadsScreen (DownloadsScreen.kt:58)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceGroup(-270937943);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion3 = Composer.Companion;
            if (objRememberedValue2 == companion3.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(C.f167o, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState = (MutableState) objRememberedValue2;
            Object objK = b.k(composerStartRestartGroup, -270934221);
            if (objK == companion3.getEmpty()) {
                objK = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK);
            }
            MutableState mutableState2 = (MutableState) objK;
            Object objK2 = b.k(composerStartRestartGroup, -270932141);
            if (objK2 == companion3.getEmpty()) {
                objK2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK2);
            }
            MutableState mutableState3 = (MutableState) objK2;
            Object objK3 = b.k(composerStartRestartGroup, -270930102);
            if (objK3 == companion3.getEmpty()) {
                objK3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK3);
            }
            MutableState mutableState4 = (MutableState) objK3;
            composerStartRestartGroup.endReplaceGroup();
            B3.o oVar = B3.o.f154a;
            composerStartRestartGroup.startReplaceGroup(-270926354);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion3.getEmpty()) {
                objRememberedValue3 = new O3(context, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(oVar, (e) objRememberedValue3, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceGroup(-270902419);
            if (((File) mutableState2.getValue()) != null) {
                composerStartRestartGroup.startReplaceGroup(-270901982);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion3.getEmpty()) {
                    objRememberedValue4 = new I(10, mutableState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                n.a((a) objRememberedValue4, null, 0L, null, ComposableLambdaKt.rememberComposableLambda(125343566, true, new Q3(mutableState4, mutableState2, mutableState), composerStartRestartGroup, 54), composerStartRestartGroup, 24582, 14);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-270802145);
            if (((File) mutableState3.getValue()) != null) {
                composerStartRestartGroup.startReplaceGroup(-270800286);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion3.getEmpty()) {
                    objRememberedValue5 = new I(11, mutableState3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                n.a((a) objRememberedValue5, null, 0L, null, ComposableLambdaKt.rememberComposableLambda(1941848325, true, new S3(onFileDelete, mutableState3, mutableState), composerStartRestartGroup, 54), composerStartRestartGroup, 24582, 14);
            }
            composerStartRestartGroup.endReplaceGroup();
            float f6 = 24;
            Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxSize$default(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), 0.0f, 1, null), Dp.m6403constructorimpl(f6), 0.0f, 2, null);
            Arrangement arrangement3 = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement3.getTop();
            Alignment.Companion companion4 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion4.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM670paddingVpY3zN4$default);
            ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
            a constructor3 = companion5.getConstructor();
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
            e eVarG3 = p035i0.a.g(companion5, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl3, currentCompositionLocalMap);
            if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
            }
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier, companion5.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f7 = 16;
            b.m(f7, companion2, composerStartRestartGroup, 6);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement3.getStart(), companion4.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            a constructor4 = companion5.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3407constructorimpl4 = Updater.m3407constructorimpl(composerStartRestartGroup);
            e eVarG4 = p035i0.a.g(companion5, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy, composerM3407constructorimpl4, currentCompositionLocalMap2);
            if (composerM3407constructorimpl4.getInserting()) {
                arrangement = arrangement3;
            } else {
                arrangement = arrangement3;
                if (!o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                }
                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier2, companion5.getSetModifier());
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                arrangement2 = arrangement;
                composer2 = composerStartRestartGroup;
                IconButtonKt.IconButton(onBack, null, false, null, null, O.e, composerStartRestartGroup, (i8 & 14) | 196608, 30);
                f5 = 8;
                androidx.compose.foundation.text.modifiers.a.q(f5, companion2, composer2, 6);
                materialTheme = MaterialTheme.INSTANCE;
                i7 = MaterialTheme.$stable;
                TextKt.m2432Text4IGK_g("My Downloads", (Modifier) null, p107y3.a.f15990o, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer2, i7).getHeadlineMedium(), composer2, 196998, 0, 65498);
                b.n(composer2, f5, companion2, composer2, 6);
                TextKt.m2432Text4IGK_g("All your processed PDFs are stored here", (Modifier) null, p107y3.a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer2, i7).getBodyMedium(), composer2, 390, 0, 65530);
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion2, Dp.m6403constructorimpl(f6)), composer2, 6);
                if (((List) mutableState.getValue()).isEmpty()) {
                    composer2.startReplaceGroup(-87007120);
                    Modifier modifierWeight$default = ColumnScope.weight$default(columnScopeInstance, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), false);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierWeight$default);
                    constructor = companion5.getConstructor();
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
                    eVarG = p035i0.a.g(companion5, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap3);
                    if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier3, companion5.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion4.getCenterHorizontally(), composer2, 48);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, companion2);
                    constructor2 = companion5.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer2);
                    eVarG2 = p035i0.a.g(companion5, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl2, currentCompositionLocalMap4);
                    if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier4, companion5.getSetModifier());
                    ImageVector folderOpen = FolderOpenKt.getFolderOpen(Icons.Outlined.INSTANCE);
                    long j5 = p107y3.a.q;
                    IconKt.m1877Iconww6aTOc(folderOpen, (String) null, SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(64)), j5, composer2, 3504, 0);
                    b.m(f7, companion2, composer2, 6);
                    TextKt.m2432Text4IGK_g("No downloads yet", (Modifier) null, j5, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer2, i7).getTitleMedium(), composer2, 390, 0, 65530);
                    b.m(f5, companion2, composer2, 6);
                    TextKt.m2432Text4IGK_g("Process your first PDF to see it here", (Modifier) null, j5, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer2, i7).getBodyMedium(), composer2, 390, 0, 65018);
                    composer2.endNode();
                    composer2.endNode();
                    composer2.endReplaceGroup();
                    companion = companion2;
                } else {
                    companion = companion2;
                    composer2.startReplaceGroup(-85768050);
                    Modifier modifierWeight$default2 = ColumnScope.weight$default(columnScopeInstance, companion, 1.0f, false, 2, null);
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_4 = arrangement2.m548spacedBy0680j_4(Dp.m6403constructorimpl(12));
                    composer2.startReplaceGroup(-695497833);
                    if ((i8 & 112) == 32) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((i8 & 896) == 256) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = z3 | z4;
                    objRememberedValue = composer2.rememberedValue();
                    if (z5 || objRememberedValue == companion3.getEmpty()) {
                        I3 i9 = new I3(mutableState, onFileClick, onFileShare, mutableState4, mutableState2, mutableState3);
                        composer2.updateRememberedValue(i9);
                        objRememberedValue = i9;
                    }
                    composer2.endReplaceGroup();
                    LazyDslKt.LazyColumn(modifierWeight$default2, null, null, false, horizontalOrVerticalM548spacedBy0680j_4, null, null, false, (c) objRememberedValue, composer2, 24576, 238);
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = companion;
            }
            p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier2, companion5.getSetModifier());
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            arrangement2 = arrangement;
            composer2 = composerStartRestartGroup;
            IconButtonKt.IconButton(onBack, null, false, null, null, O.e, composerStartRestartGroup, (i8 & 14) | 196608, 30);
            f5 = 8;
            androidx.compose.foundation.text.modifiers.a.q(f5, companion2, composer2, 6);
            materialTheme = MaterialTheme.INSTANCE;
            i7 = MaterialTheme.$stable;
            TextKt.m2432Text4IGK_g("My Downloads", (Modifier) null, p107y3.a.f15990o, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer2, i7).getHeadlineMedium(), composer2, 196998, 0, 65498);
            b.n(composer2, f5, companion2, composer2, 6);
            TextKt.m2432Text4IGK_g("All your processed PDFs are stored here", (Modifier) null, p107y3.a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer2, i7).getBodyMedium(), composer2, 390, 0, 65530);
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion2, Dp.m6403constructorimpl(f6)), composer2, 6);
            if (((List) mutableState.getValue()).isEmpty()) {
                composer2.startReplaceGroup(-87007120);
                Modifier modifierWeight$default3 = ColumnScope.weight$default(columnScopeInstance, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 1.0f, false, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), false);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifierWeight$default3);
                constructor = companion5.getConstructor();
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
                eVarG = p035i0.a.g(companion5, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl, currentCompositionLocalMap5);
                if (composerM3407constructorimpl.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                } else {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier5, companion5.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion4.getCenterHorizontally(), composer2, 48);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer2, companion2);
                constructor2 = companion5.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer2);
                eVarG2 = p035i0.a.g(companion5, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy3, composerM3407constructorimpl2, currentCompositionLocalMap6);
                if (composerM3407constructorimpl2.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                } else {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier6, companion5.getSetModifier());
                ImageVector folderOpen2 = FolderOpenKt.getFolderOpen(Icons.Outlined.INSTANCE);
                long j6 = p107y3.a.q;
                IconKt.m1877Iconww6aTOc(folderOpen2, (String) null, SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(64)), j6, composer2, 3504, 0);
                b.m(f7, companion2, composer2, 6);
                TextKt.m2432Text4IGK_g("No downloads yet", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer2, i7).getTitleMedium(), composer2, 390, 0, 65530);
                b.m(f5, companion2, composer2, 6);
                TextKt.m2432Text4IGK_g("Process your first PDF to see it here", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer2, i7).getBodyMedium(), composer2, 390, 0, 65018);
                composer2.endNode();
                composer2.endNode();
                composer2.endReplaceGroup();
                companion = companion2;
            } else {
                companion = companion2;
                composer2.startReplaceGroup(-85768050);
                Modifier modifierWeight$default4 = ColumnScope.weight$default(columnScopeInstance, companion, 1.0f, false, 2, null);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_5 = arrangement2.m548spacedBy0680j_4(Dp.m6403constructorimpl(12));
                composer2.startReplaceGroup(-695497833);
                if ((i8 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i8 & 896) == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = z3 | z4;
                objRememberedValue = composer2.rememberedValue();
                if (z5) {
                    I3 i10 = new I3(mutableState, onFileClick, onFileShare, mutableState4, mutableState2, mutableState3);
                    composer2.updateRememberedValue(i10);
                    objRememberedValue = i10;
                } else {
                    I3 i11 = new I3(mutableState, onFileClick, onFileShare, mutableState4, mutableState2, mutableState3);
                    composer2.updateRememberedValue(i11);
                    objRememberedValue = i11;
                }
                composer2.endReplaceGroup();
                LazyDslKt.LazyColumn(modifierWeight$default4, null, null, false, horizontalOrVerticalM548spacedBy0680j_5, null, null, false, (c) objRememberedValue, composer2, 24576, 238);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2567m(onBack, onFileClick, onFileShare, onFileDelete, modifier2, i5));
        }
    }
}
