package p102x3;

import O3.a;
import O3.e;
import O3.f;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.ArchiveKt;
import androidx.compose.material.icons.outlined.CheckCircleKt;
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
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.jvm.internal.o;
import p076s.b;

/* JADX INFO: renamed from: x3.ac, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2388ac implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List f14798o;
    public final /* synthetic */ List p;
    public final /* synthetic */ MutableState q;

    public C2388ac(List list, List list2, MutableState mutableState) {
        this.f14798o = list;
        this.p = list2;
        this.q = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
                ComposerKt.traceEventStart(435243173, iIntValue, -1, "com.notescrafter.ui.screens.PrintMyOrdersScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintMyOrdersScreen.kt:326)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Color.Companion companion2 = Color.Companion;
            float f5 = 16;
            Modifier modifierE = b.e(f5, b.f(f5, modifierFillMaxWidth$default, Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(1), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null));
            float f6 = 4;
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(modifierE, Dp.m6403constructorimpl(f6));
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(f6)), Alignment.Companion.getTop(), composer, 6);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM668padding3ABfNKs);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            a constructor = companion3.getConstructor();
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
            e eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyRowMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            List list = AbstractC2452ec.f14975a;
            MutableState mutableState = this.q;
            boolean zB = o.b((String) mutableState.getValue(), "confirmed");
            int size = this.f14798o.size();
            Icons.Outlined outlined = Icons.Outlined.INSTANCE;
            ImageVector checkCircle = CheckCircleKt.getCheckCircle(outlined);
            composer.startReplaceGroup(-1447441260);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion4 = Composer.Companion;
            if (objRememberedValue == companion4.getEmpty()) {
                objRememberedValue = new Bb(2, mutableState);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            AbstractC2452ec.c("Confirmed", zB, size, checkCircle, (a) objRememberedValue, RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composer, 24582);
            boolean zB2 = o.b((String) mutableState.getValue(), "drafts");
            int size2 = this.p.size();
            ImageVector archive = ArchiveKt.getArchive(outlined);
            composer.startReplaceGroup(-1447428175);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion4.getEmpty()) {
                objRememberedValue2 = new Bb(3, mutableState);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            AbstractC2452ec.c("Pending", zB2, size2, archive, (a) objRememberedValue2, RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composer, 24582);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
