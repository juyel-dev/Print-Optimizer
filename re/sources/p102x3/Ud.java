package p102x3;

import C3.u;
import C3.v;
import O3.a;
import O3.c;
import O3.e;
import W3.j;
import Y3.d;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.CallMergeKt;
import androidx.compose.material.icons.outlined.CallSplitKt;
import androidx.compose.material.icons.outlined.CompressKt;
import androidx.compose.material.icons.outlined.CropKt;
import androidx.compose.material.icons.outlined.FormatListNumberedKt;
import androidx.compose.material.icons.outlined.GridViewKt;
import androidx.compose.material.icons.outlined.ImageKt;
import androidx.compose.material.icons.outlined.InvertColorsKt;
import androidx.compose.material.icons.outlined.PictureAsPdfKt;
import androidx.compose.material.icons.outlined.TimerKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import p083t3.C2292j;
import p083t3.O;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Ud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f14501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f14502b;

    static {
        Icons.Outlined outlined = Icons.Outlined.INSTANCE;
        f14501a = v.S(new Rd("merge-pdf", "Merge PDF", "Combine multiple PDFs into one document", CallMergeKt.getCallMerge(outlined), "PDF Tools", "pdf-merge"), new Rd("split-pdf", "Split PDF", "Extract pages or split into separate files", CallSplitKt.getCallSplit(outlined), "PDF Tools", "pdf-split"), new Rd("compress-pdf", "Compress PDF", "Reduce file size without losing quality", CompressKt.getCompress(outlined), "PDF Tools", "pdf-compress"), new Rd("add-page-numbers", "Add Page Numbers", "Add page numbers to your PDF", FormatListNumberedKt.getFormatListNumbered(outlined), "PDF Tools", "pdf-add-page-numbers"), new Rd("organize-pdf", "Organize PDF", "Reorder, rotate, and delete pages", GridViewKt.getGridView(outlined), "PDF Tools", "pdf-organize"), new Rd("crop-pdf", "Crop PDF", "Crop margins and resize PDF pages", CropKt.getCrop(outlined), "PDF Tools", "pdf-crop"), new Rd("invert-pdf", "Invert PDF", "Invert colors (dark to light/vice-versa)", InvertColorsKt.getInvertColors(outlined), "PDF Tools", "pdf-invert"), new Rd("pdf-to-jpg", "PDF to JPG", "Convert PDF pages to JPG images", ImageKt.getImage(outlined), "Image Tools", "pdf-to-jpg"), new Rd("jpg-to-pdf", "JPG to PDF", "Convert images to a PDF document", PictureAsPdfKt.getPictureAsPdf(outlined), "Image Tools", "jpg-to-pdf"), new Rd("pomodoro", "Pomodoro Timer", "25min focus tracker", TimerKt.getTimer(outlined), "Focus", "pomodoro-setup"));
        f14502b = v.S("All", "PDF Tools", "Image Tools", "Calculators", "Focus");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(c onNavigate, Composer composer, int i5) {
        Composer composer2;
        o.f(onNavigate, "onNavigate");
        Composer composerStartRestartGroup = composer.startRestartGroup(694253877);
        int i6 = (i5 & 6) == 0 ? (composerStartRestartGroup.changedInstance(onNavigate) ? 4 : 2) | i5 : i5;
        if ((i6 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(694253877, i6, -1, "com.notescrafter.ui.screens.QuickToolsScreen (QuickToolsScreen.kt:62)");
            }
            composerStartRestartGroup.startReplaceGroup(-650071931);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            List list = f14501a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                Rd rd = (Rd) obj;
                if (!j.c0(rd.f14390b, (String) mutableState.getValue(), true)) {
                    if (j.c0(rd.f14391c, (String) mutableState.getValue(), true)) {
                    }
                }
                arrayList.add(obj);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : arrayList) {
                String str = ((Rd) obj2).e;
                Object arrayList2 = linkedHashMap.get(str);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(str, arrayList2);
                }
                ((List) arrayList2).add(obj2);
            }
            List listD0 = u.D0(linkedHashMap.entrySet(), new N3(4));
            Modifier.Companion companion = Modifier.Companion;
            float f5 = 16;
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(f5));
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
            int i7 = i6;
            float f6 = 0;
            TextKt.m2432Text4IGK_g("Everything you need - One tap away", PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, Dp.m6403constructorimpl(f5), 0.0f, Dp.m6403constructorimpl(f6), 5, null), p107y3.a.f15990o, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getHeadlineSmall(), composerStartRestartGroup, 197046, 0, 64984);
            float f7 = 12;
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f7)), composerStartRestartGroup, 6);
            String str2 = (String) mutableState.getValue();
            composerStartRestartGroup.startReplaceGroup(1960485977);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion3 = Composer.Companion;
            if (objRememberedValue2 == companion3.getEmpty()) {
                objRememberedValue2 = new C2435db(7, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            c cVar = (c) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM672paddingqDBjuR0$default = PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f5), 7, null);
            ComposableLambda composableLambda = AbstractC2475g3.f15054a;
            ComposableLambda composableLambda2 = AbstractC2475g3.f15055b;
            RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f7));
            OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
            long j5 = p107y3.a.g;
            long jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(j5, 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
            long jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(j5, 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
            long jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(p107y3.a.f15978a, 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
            Color.Companion companion4 = Color.Companion;
            long jM3926copywmQWz5c$default4 = Color.m3926copywmQWz5c$default(companion4.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
            long jM3964getWhite0d7_KjU = companion4.m3964getWhite0d7_KjU();
            long jM3964getWhite0d7_KjU2 = companion4.m3964getWhite0d7_KjU();
            long j6 = p107y3.a.p;
            OutlinedTextFieldKt.OutlinedTextField(str2, cVar, modifierM672paddingqDBjuR0$default, false, false, (TextStyle) null, (e) null, (e) composableLambda, (e) composableLambda2, (e) null, (e) null, (e) null, (e) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM955RoundedCornerShape0680j_4, outlinedTextFieldDefaults.m2076colors0hiis_0(jM3964getWhite0d7_KjU, jM3964getWhite0d7_KjU2, 0L, 0L, jM3926copywmQWz5c$default, jM3926copywmQWz5c$default2, 0L, 0L, 0L, 0L, null, jM3926copywmQWz5c$default3, jM3926copywmQWz5c$default4, 0L, 0L, j6, j6, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, j6, j6, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 221238, 1769904, 113246208, 0, 3072, 1744725964, 4095), composerStartRestartGroup, 113246640, 12582912, 0, 1965688);
            GridCells.Fixed fixed = new GridCells.Fixed(1);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_4 = arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f6));
            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_5 = arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f7));
            PaddingValues paddingValuesM665PaddingValuesa9UjIt4$default = PaddingKt.m665PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(100), 7, null);
            composerStartRestartGroup.startReplaceGroup(1960533570);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(listD0) | ((i7 & 14) == 4);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion3.getEmpty()) {
                objRememberedValue3 = new d(10, listD0, onNavigate);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            LazyGridDslKt.LazyVerticalGrid(fixed, modifierFillMaxSize$default, null, paddingValuesM665PaddingValuesa9UjIt4$default, false, horizontalOrVerticalM548spacedBy0680j_5, horizontalOrVerticalM548spacedBy0680j_4, null, false, (c) objRememberedValue3, composerStartRestartGroup, 1772592, 404);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2445e5(onNavigate, i5, 3));
        }
    }

    public static final void b(Rd tool, a onClick, Composer composer, int i5) {
        int i6;
        o.f(tool, "tool");
        o.f(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1996274533);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(tool) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        if ((i6 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1996274533, i6, -1, "com.notescrafter.ui.screens.ToolCard (QuickToolsScreen.kt:156)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(-1615378143);
            boolean z3 = (i6 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new O(16, onClick);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            p097w3.j.a(ClickableKt.m242clickableXHw0xAI$default(modifierFillMaxWidth$default, false, null, null, (a) objRememberedValue, 7, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(654997590, true, new Td(onClick, tool), composerStartRestartGroup, 54), composerStartRestartGroup, 196608, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2292j(i5, 8, tool, onClick));
        }
    }
}
