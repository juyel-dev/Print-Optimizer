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
import androidx.compose.material.icons.outlined.DescriptionKt;
import androidx.compose.material.icons.outlined.InvertColorsKt;
import androidx.compose.material.icons.outlined.VisibilityKt;
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

/* JADX INFO: renamed from: x3.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2425d1 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2425d1 f14902o = new C2425d1();

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
                ComposerKt.traceEventStart(1344735297, iIntValue, -1, "com.notescrafter.ui.screens.ComposableSingletons$PdfInvertScreenKt.lambda-6.<anonymous> (PdfInvertScreen.kt:643)");
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
            Icons.Outlined outlined = Icons.Outlined.INSTANCE;
            AbstractC2783z8.c("01", DescriptionKt.getDescription(outlined), "Select Document", "Choose the PDF file whose color palette you want to invert.", composer, 3462);
            AbstractC2783z8.c("02", VisibilityKt.getVisibility(outlined), "Preview Inversion", "Preview pages in high-contrast dark mode to inspect readability.", composer, 3462);
            AbstractC2783z8.c("03", InvertColorsKt.getInvertColors(outlined), "Process PDF", "Compile and export the fully color-inverted PDF document instantly.", composer, 3462);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
