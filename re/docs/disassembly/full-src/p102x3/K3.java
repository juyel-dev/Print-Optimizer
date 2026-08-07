package p102x3;

import O3.a;
import O3.e;
import O3.f;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final class K3 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a f14120o;
    public final /* synthetic */ a p;
    public final /* synthetic */ MutableState q;

    public K3(a aVar, a aVar2, MutableState mutableState) {
        this.f14120o = aVar;
        this.p = aVar2;
        this.q = mutableState;
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
                ComposerKt.traceEventStart(448186299, iIntValue, -1, "com.notescrafter.ui.screens.DownloadedFileItem.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DownloadsScreen.kt:401)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            a constructor = companion2.getConstructor();
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
            e eVarG = p035i0.a.g(companion2, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposableLambda composableLambda = O.f14242h;
            composer.startReplaceGroup(63211523);
            a aVar = this.f14120o;
            boolean zChanged = composer.changed(aVar);
            Object objRememberedValue = composer.rememberedValue();
            MutableState mutableState = this.q;
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new J3(aVar, mutableState, 0);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            AndroidMenu_androidKt.DropdownMenuItem(composableLambda, (a) objRememberedValue, null, O.f14243i, null, false, null, null, null, composer, 3078, 500);
            DividerKt.m1794HorizontalDivider9IZ8Weo(PaddingKt.m670paddingVpY3zN4$default(companion, Dp.m6403constructorimpl(8), 0.0f, 2, null), 0.0f, Color.m3926copywmQWz5c$default(p107y3.a.f15991r, 0.3f, 0.0f, 0.0f, 0.0f, 14, null), composer, 390, 2);
            ComposableLambda composableLambda2 = O.f14244j;
            composer.startReplaceGroup(63246531);
            a aVar2 = this.p;
            boolean zChanged2 = composer.changed(aVar2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new J3(aVar2, mutableState, 1);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            AndroidMenu_androidKt.DropdownMenuItem(composableLambda2, (a) objRememberedValue2, null, O.f14245k, null, false, null, null, null, composer, 3078, 500);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
