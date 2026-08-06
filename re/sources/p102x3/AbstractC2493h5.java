package p102x3;

import C3.v;
import O3.a;
import O3.c;
import O3.e;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ListKt;
import androidx.compose.material.icons.outlined.AutoFixHighKt;
import androidx.compose.material.icons.outlined.CallMergeKt;
import androidx.compose.material.icons.outlined.CleaningServicesKt;
import androidx.compose.material.icons.outlined.ContrastKt;
import androidx.compose.material.icons.outlined.DeleteSweepKt;
import androidx.compose.material.icons.outlined.EditKt;
import androidx.compose.material.icons.outlined.FilterBAndWKt;
import androidx.compose.material.icons.outlined.FormatListNumberedKt;
import androidx.compose.material.icons.outlined.GridViewKt;
import androidx.compose.material.icons.outlined.InvertColorsKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
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
import p097w3.g;
import p097w3.j;

/* JADX INFO: renamed from: x3.h5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2493h5 {
    public static final void a(C2429d5 feature, Composer composer, int i5) {
        int i6;
        o.f(feature, "feature");
        Composer composerStartRestartGroup = composer.startRestartGroup(-254484826);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(feature) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i6 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-254484826, i6, -1, "com.notescrafter.ui.screens.FeatureCard (FeaturesScreen.kt:83)");
            }
            j.a(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m6403constructorimpl(180)), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(2127599435, true, new C2461f5(feature), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2445e5(feature, i5, 0));
        }
    }

    public static final void b(Modifier modifier, Composer composer, int i5) {
        Composer composer2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1782952875);
        int i6 = i5 | 6;
        if ((i6 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            composer2 = composerStartRestartGroup;
        } else {
            Modifier.Companion companion = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1782952875, i6, -1, "com.notescrafter.ui.screens.FeaturesScreen (FeaturesScreen.kt:31)");
            }
            C2429d5 c2429d5 = new C2429d5(ListKt.getList(Icons.INSTANCE.getDefault()), "Reorder", "Organize pages");
            Icons.Outlined outlined = Icons.Outlined.INSTANCE;
            List listS = v.S(c2429d5, new C2429d5(EditKt.getEdit(outlined), "Edit Pages", "Modify content"), new C2429d5(AutoFixHighKt.getAutoFixHigh(outlined), "Remove Logo", "Clean pages"), new C2429d5(ContrastKt.getContrast(outlined), "Grayscale", "Save ink"), new C2429d5(androidx.compose.material.icons.outlined.ListKt.getList(outlined), "Separators", "Add lines"), new C2429d5(FormatListNumberedKt.getFormatListNumbered(outlined), "Page No", "Add numbering"), new C2429d5(CallMergeKt.getCallMerge(outlined), "Merge PDFs", "Combine files"), new C2429d5(InvertColorsKt.getInvertColors(outlined), "Invert Colors", "Dark to Light"), new C2429d5(CleaningServicesKt.getCleaningServices(outlined), "Clear Background", "Remove noise"), new C2429d5(GridViewKt.getGridView(outlined), "Multiple Slides", "Grid layout"), new C2429d5(DeleteSweepKt.getDeleteSweep(outlined), "Remove Slides", "Delete pages"), new C2429d5(FilterBAndWKt.getFilterBAndW(outlined), "Black & White", "High contrast"));
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(SizeKt.fillMaxSize$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), 0.0f, 1, null), Dp.m6403constructorimpl(16));
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM668padding3ABfNKs);
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
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i7 = MaterialTheme.$stable;
            TextStyle displaySmall = materialTheme.getTypography(composerStartRestartGroup, i7).getDisplaySmall();
            TextKt.m2432Text4IGK_g("Features", PaddingKt.m672paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(8), 7, null), p107y3.a.f15990o, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, displaySmall, composerStartRestartGroup, 197046, 0, 65496);
            TextStyle bodyLarge = materialTheme.getTypography(composerStartRestartGroup, i7).getBodyLarge();
            composer2 = composerStartRestartGroup;
            TextKt.m2432Text4IGK_g("Everything you need to master your documents", PaddingKt.m672paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(24), 7, null), p107y3.a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyLarge, composer2, 438, 0, 65528);
            GridCells.Fixed fixed = new GridCells.Fixed(2);
            float f5 = 12;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_4 = arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f5));
            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_5 = arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f5));
            PaddingValues paddingValuesM665PaddingValuesa9UjIt4$default = PaddingKt.m665PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(100), 7, null);
            composer2.startReplaceGroup(519211739);
            boolean zChanged = composer2.changed(listS);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new g(listS, 1);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceGroup();
            LazyGridDslKt.LazyVerticalGrid(fixed, null, null, paddingValuesM665PaddingValuesa9UjIt4$default, false, horizontalOrVerticalM548spacedBy0680j_5, horizontalOrVerticalM548spacedBy0680j_4, null, false, (c) objRememberedValue, composer2, 1772544, 406);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2375a(modifier2, i5, 1));
        }
    }
}
