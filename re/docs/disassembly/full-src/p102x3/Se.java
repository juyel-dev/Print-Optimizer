package p102x3;

import C3.v;
import O3.a;
import O3.e;
import O3.f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.notescrafter.utils.ExamItem;
import java.util.List;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final class Se implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MutableState f14437o;

    public Se(MutableState mutableState) {
        this.f14437o = mutableState;
    }

    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BoxScope GlassCard = (BoxScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(GlassCard, "$this$GlassCard");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(934036273, iIntValue, -1, "com.notescrafter.ui.screens.ToDoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ToDoScreen.kt:186)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
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
            composer.startReplaceGroup(-1889388632);
            MutableState mutableState = this.f14437o;
            int i5 = 0;
            for (Object obj4 : (List) mutableState.getValue()) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    v.X();
                    throw null;
                }
                Ye.c((ExamItem) obj4, composer, 0);
                composer.startReplaceGroup(-1889384880);
                if (i5 < ((List) mutableState.getValue()).size() - 1) {
                    BoxKt.Box(BackgroundKt.m207backgroundbw27NRU$default(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m6403constructorimpl(1)), Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer, 6);
                }
                composer.endReplaceGroup();
                i5 = i6;
            }
            if (p035i0.a.z(composer)) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
