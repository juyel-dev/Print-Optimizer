package p102x3;

import O3.a;
import O3.e;
import O3.f;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.outlined.CallMergeKt;
import androidx.compose.material.icons.automirrored.outlined.SortKt;
import androidx.compose.material.icons.outlined.DescriptionKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: x3.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2569m1 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2569m1 f15303o = new C2569m1();

    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LazyItemScope item = (LazyItemScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(item, "$this$item");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1416519329, iIntValue, -1, "com.notescrafter.ui.screens.ComposableSingletons$PdfMergeScreenKt.lambda-5.<anonymous> (PdfMergeScreen.kt:563)");
            }
            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_4 = Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(10));
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_4, Alignment.Companion.getStart(), composer, 6);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            a constructor = companion.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM3407constructorimpl = Updater.m3407constructorimpl(composer);
            e eVarG = p035i0.a.g(companion, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Q8.a("01", DescriptionKt.getDescription(Icons.Outlined.INSTANCE), "Select PDF Documents", "Tap the select card above to choose multiple PDF files from your device storage.", composer, 3462);
            Icons.AutoMirrored.Outlined outlined = Icons.AutoMirrored.Outlined.INSTANCE;
            Q8.a("02", SortKt.getSort(outlined), "Arrange & Reorder", "Use the Up/Down arrows to organize files into your preferred compilation order.", composer, 3462);
            Q8.a("03", CallMergeKt.getCallMerge(outlined), "Combine & Save", "Tap 'Merge PDFs' to combine all files into a single, high-quality document.", composer, 3462);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
