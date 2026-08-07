package p097w3;

import N0.C0135c;
import O3.c;
import O3.e;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import p083t3.C2292j;
import p107y3.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h {
    public static final void a(Modifier modifier, ComposableLambda content, Composer composer, int i5) {
        Modifier modifier2;
        o.f(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(983926701);
        int i6 = i5 | 6;
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i6 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            modifier2 = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(983926701, i6, -1, "com.notescrafter.ui.components.CinematicBackground (CinematicBackground.kt:25)");
            }
            Modifier modifierM207backgroundbw27NRU$default = BackgroundKt.m207backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), a.e, null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM207backgroundbw27NRU$default);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            O3.a constructor = companion.getConstructor();
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
            e eVarG = p035i0.a.g(companion, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(-319827109);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.Companion;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = new C0135c(6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            CanvasKt.Canvas(modifierFillMaxSize$default, (c) objRememberedValue, composerStartRestartGroup, 54);
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(-319777416);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new C0135c(7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            CanvasKt.Canvas(modifierFillMaxSize$default2, (c) objRememberedValue2, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceGroup(-319727366);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            Object obj = objRememberedValue3;
            if (objRememberedValue3 == companion2.getEmpty()) {
                ArrayList arrayList = new ArrayList(10000);
                for (int i7 = 0; i7 < 10000; i7++) {
                    R3.e.f1082o.getClass();
                    R3.a aVar = R3.e.p;
                    arrayList.add(Offset.m3675boximpl(OffsetKt.Offset(aVar.a().nextFloat(), aVar.a().nextFloat())));
                }
                composerStartRestartGroup.updateRememberedValue(arrayList);
                obj = arrayList;
            }
            List list = (List) obj;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(-319704034);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(list);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new g(list, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            CanvasKt.Canvas(modifierFillMaxSize$default3, (c) objRememberedValue4, composerStartRestartGroup, 6);
            content.invoke(composerStartRestartGroup, Integer.valueOf((i6 >> 3) & 14));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2292j(i5, 1, modifier2, content));
        }
    }
}
