package p102x3;

import C3.E;
import O3.a;
import O3.c;
import O3.e;
import W.A;
import android.content.Context;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ListKt;
import androidx.compose.material.icons.outlined.AutoFixHighKt;
import androidx.compose.material.icons.outlined.CallMergeKt;
import androidx.compose.material.icons.outlined.CleaningServicesKt;
import androidx.compose.material.icons.outlined.ContrastKt;
import androidx.compose.material.icons.outlined.DeleteSweepKt;
import androidx.compose.material.icons.outlined.DescriptionKt;
import androidx.compose.material.icons.outlined.EditKt;
import androidx.compose.material.icons.outlined.FavoriteBorderKt;
import androidx.compose.material.icons.outlined.FilterBAndWKt;
import androidx.compose.material.icons.outlined.FormatListNumberedKt;
import androidx.compose.material.icons.outlined.GridViewKt;
import androidx.compose.material.icons.outlined.InvertColorsKt;
import androidx.compose.material.icons.outlined.SchoolKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
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
import java.util.List;
import kotlin.jvm.internal.o;
import p015d.l;
import p076s.b;
import p097w3.j;
import p097w3.t;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ef {
    public static final void a(ImageVector icon, String str, String str2, Modifier modifier, Composer composer, int i5) {
        int i6;
        o.f(icon, "icon");
        Composer composerStartRestartGroup = composer.startRestartGroup(-601406208);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(icon) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changed(str2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i5 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changed(modifier) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i6 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-601406208, i6, -1, "com.notescrafter.ui.screens.FeatureTile (UploadScreen.kt:344)");
            }
            j.a(modifier, 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(996136315, true, new bf(icon, str, str2), composerStartRestartGroup, 54), composerStartRestartGroup, ((i6 >> 9) & 14) | 196608, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2509i5(icon, str, str2, modifier, i5, 1));
        }
    }

    public static final void b(int i5, Composer composer, ImageVector icon, String str, String str2) {
        int i6;
        Composer composer2;
        String str3;
        String str4;
        o.f(icon, "icon");
        Composer composerStartRestartGroup = composer.startRestartGroup(58392909);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changed(icon) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i7 = i6;
        if ((i7 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            str3 = str;
            str4 = str2;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(58392909, i7, -1, "com.notescrafter.ui.screens.StatItemCompact (UploadScreen.kt:364)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            e eVarG = p035i0.a.g(companion2, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            IconKt.m1877Iconww6aTOc(icon, (String) null, PaddingKt.m672paddingqDBjuR0$default(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(20)), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(4), 7, null), p107y3.a.f15978a, composerStartRestartGroup, ((i7 >> 6) & 14) | 3504, 0);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i8 = MaterialTheme.$stable;
            composer2 = composerStartRestartGroup;
            str3 = str;
            str4 = str2;
            TextKt.m2432Text4IGK_g(str, (Modifier) null, p107y3.a.f15990o, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i8).getTitleLarge(), composer2, (i7 & 14) | 196992, 0, 65498);
            TextKt.m2432Text4IGK_g(str2, (Modifier) null, p107y3.a.q, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer2, i8).getBodySmall(), composer2, ((i7 >> 3) & 14) | 384, 0, 65530);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2391b(str3, str4, icon, i5));
        }
    }

    public static final void c(final List selectedPdfs, final c onFilesSelected, final c onFileRemoved, final a onClearAll, final a onContinue, final boolean z3, Modifier modifier, Composer composer, final int i5) {
        int i6;
        Composer composer2;
        final Modifier modifier2;
        o.f(selectedPdfs, "selectedPdfs");
        o.f(onFilesSelected, "onFilesSelected");
        o.f(onFileRemoved, "onFileRemoved");
        o.f(onClearAll, "onClearAll");
        o.f(onContinue, "onContinue");
        Composer composerStartRestartGroup = composer.startRestartGroup(672561971);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changedInstance(selectedPdfs) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onFilesSelected) ? 32 : 16;
        }
        if ((i5 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onClearAll) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i5 & 24576) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onContinue) ? Fields.Clip : Fields.Shape;
        }
        if ((196608 & i5) == 0) {
            i6 |= composerStartRestartGroup.changed(z3) ? Fields.RenderEffect : 65536;
        }
        int i7 = i6 | 1572864;
        if ((599059 & i7) == 599058 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            composer2 = composerStartRestartGroup;
        } else {
            Modifier.Companion companion = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(672561971, i7, -1, "com.notescrafter.ui.screens.UploadScreen (UploadScreen.kt:56)");
            }
            A a5 = new A(4);
            composerStartRestartGroup.startReplaceGroup(512256885);
            boolean z4 = (i7 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Wd(onFilesSelected, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            l lVarV = p000a.a.v(a5, (c) objRememberedValue, composerStartRestartGroup);
            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            float f5 = 24;
            Modifier modifierM669paddingVpY3zN4 = PaddingKt.m669paddingVpY3zN4(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), scrollStateRememberScrollState, false, null, false, 14, null), Dp.m6403constructorimpl(f5), Dp.m6403constructorimpl(f5));
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN4);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            a constructor = companion3.getConstructor();
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
            e eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f6 = 32;
            b.m(f6, companion, composerStartRestartGroup, 6);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i8 = MaterialTheme.$stable;
            TextKt.m2432Text4IGK_g("Upload Files", (Modifier) null, p107y3.a.f15990o, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i8).getHeadlineMedium(), composerStartRestartGroup, 196998, 0, 65498);
            b.m(8, companion, composerStartRestartGroup, 6);
            TextKt.m2432Text4IGK_g("Select PDF files from your device to begin processing.", (Modifier) null, p107y3.a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 2, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i8).getBodyMedium(), composerStartRestartGroup, 390, 3072, 56826);
            t.a(6, 1, E.f169o, null, composerStartRestartGroup, 438);
            b.m(f5, companion, composerStartRestartGroup, 6);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(1967819018);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(lVarV);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new P5(lVarV, 21);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            j.a(modifierFillMaxWidth$default, 0L, 0L, 0.0f, (a) objRememberedValue2, ComposableLambdaKt.rememberComposableLambda(1534415224, true, new cf(selectedPdfs, lVarV, z3, onClearAll, onContinue), composer2, 54), composer2, 196614, 14);
            b.m(f6, companion, composer2, 6);
            j.a(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(638948001, true, new df(context), composer2, 54), composer2, 196614, 30);
            composer2.startReplaceGroup(1968081813);
            if (selectedPdfs.isEmpty()) {
                b.m(48, companion, composer2, 6);
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceEvenly(), companion2.getTop(), composer2, 6);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default2);
                a constructor2 = companion3.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer2);
                e eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyRowMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
                if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                Icons.Outlined outlined = Icons.Outlined.INSTANCE;
                b(54, composer2, DescriptionKt.getDescription(outlined), "300k+", "Files Processed");
                b(54, composer2, SchoolKt.getSchool(outlined), "50k+", "Students Helped");
                b(54, composer2, FavoriteBorderKt.getFavoriteBorder(outlined), "5k+", "Thank You");
                composer2.endNode();
            }
            composer2.endReplaceGroup();
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(48)), composer2, 6);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 0);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, companion);
            a constructor3 = companion3.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            Composer composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer2);
            e eVarG3 = p035i0.a.g(companion3, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl3, currentCompositionLocalMap3);
            if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
            }
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            float f7 = 12;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f7)), companion2.getTop(), composer2, 6);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default3);
            a constructor4 = companion3.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor4);
            } else {
                composer2.useNode();
            }
            Composer composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer2);
            e eVarG4 = p035i0.a.g(companion3, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl4, currentCompositionLocalMap4);
            if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
            }
            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            a(ListKt.getList(Icons.INSTANCE.getDefault()), "Reorder", "Organize pages", RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composer2, 432);
            Icons.Outlined outlined2 = Icons.Outlined.INSTANCE;
            a(EditKt.getEdit(outlined2), "Edit Pages", "Modify content", RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composer2, 432);
            b.n(composer2, f7, companion, composer2, 6);
            Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f7)), companion2.getTop(), composer2, 6);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default4);
            a constructor5 = companion3.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor5);
            } else {
                composer2.useNode();
            }
            Composer composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer2);
            e eVarG5 = p035i0.a.g(companion3, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy3, composerM3407constructorimpl5, currentCompositionLocalMap5);
            if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
            }
            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier5, companion3.getSetModifier());
            a(AutoFixHighKt.getAutoFixHigh(outlined2), "Remove Logo", "Clean pages", RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composer2, 432);
            a(ContrastKt.getContrast(outlined2), "Grayscale", "Save ink", RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composer2, 432);
            b.n(composer2, f7, companion, composer2, 6);
            Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f7)), companion2.getTop(), composer2, 6);
            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default5);
            a constructor6 = companion3.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor6);
            } else {
                composer2.useNode();
            }
            Composer composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer2);
            e eVarG6 = p035i0.a.g(companion3, composerM3407constructorimpl6, measurePolicyRowMeasurePolicy4, composerM3407constructorimpl6, currentCompositionLocalMap6);
            if (composerM3407constructorimpl6.getInserting() || !o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG6);
            }
            Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier6, companion3.getSetModifier());
            a(androidx.compose.material.icons.outlined.ListKt.getList(outlined2), "Separators", "Add lines", RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composer2, 432);
            a(FormatListNumberedKt.getFormatListNumbered(outlined2), "Page No", "Add numbering", RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composer2, 432);
            b.n(composer2, f7, companion, composer2, 6);
            Modifier modifierFillMaxWidth$default6 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f7)), companion2.getTop(), composer2, 6);
            int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default6);
            a constructor7 = companion3.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor7);
            } else {
                composer2.useNode();
            }
            Composer composerM3407constructorimpl7 = Updater.m3407constructorimpl(composer2);
            e eVarG7 = p035i0.a.g(companion3, composerM3407constructorimpl7, measurePolicyRowMeasurePolicy5, composerM3407constructorimpl7, currentCompositionLocalMap7);
            if (composerM3407constructorimpl7.getInserting() || !o.b(composerM3407constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG7);
            }
            Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier7, companion3.getSetModifier());
            a(CallMergeKt.getCallMerge(outlined2), "Merge PDFs", "Combine files", RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composer2, 432);
            a(InvertColorsKt.getInvertColors(outlined2), "Invert Colors", "Dark to Light", RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composer2, 432);
            b.n(composer2, f7, companion, composer2, 6);
            Modifier modifierFillMaxWidth$default7 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f7)), companion2.getTop(), composer2, 6);
            int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap8 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default7);
            a constructor8 = companion3.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor8);
            } else {
                composer2.useNode();
            }
            Composer composerM3407constructorimpl8 = Updater.m3407constructorimpl(composer2);
            e eVarG8 = p035i0.a.g(companion3, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy6, composerM3407constructorimpl8, currentCompositionLocalMap8);
            if (composerM3407constructorimpl8.getInserting() || !o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG8);
            }
            Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier8, companion3.getSetModifier());
            a(CleaningServicesKt.getCleaningServices(outlined2), "Clear Background", "Remove noise", RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composer2, 432);
            a(GridViewKt.getGridView(outlined2), "Multiple Slides", "Grid layout", RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composer2, 432);
            b.n(composer2, f7, companion, composer2, 6);
            Modifier modifierFillMaxWidth$default8 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy7 = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f7)), companion2.getTop(), composer2, 6);
            int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap9 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default8);
            a constructor9 = companion3.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor9);
            } else {
                composer2.useNode();
            }
            Composer composerM3407constructorimpl9 = Updater.m3407constructorimpl(composer2);
            e eVarG9 = p035i0.a.g(companion3, composerM3407constructorimpl9, measurePolicyRowMeasurePolicy7, composerM3407constructorimpl9, currentCompositionLocalMap9);
            if (composerM3407constructorimpl9.getInserting() || !o.b(composerM3407constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG9);
            }
            Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier9, companion3.getSetModifier());
            a(DeleteSweepKt.getDeleteSweep(outlined2), "Remove Slides", "Delete pages", RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composer2, 432);
            a(FilterBAndWKt.getFilterBAndW(outlined2), "Black & White", "High contrast", RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composer2, 432);
            composer2.endNode();
            composer2.endNode();
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(64)), composer2, 6);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: x3.af
                @Override // O3.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                    boolean z5 = z3;
                    Modifier modifier3 = modifier2;
                    ef.c(selectedPdfs, onFilesSelected, onFileRemoved, onClearAll, onContinue, z5, modifier3, (Composer) obj, iUpdateChangedFlags);
                    return B3.o.f154a;
                }
            });
        }
    }
}
