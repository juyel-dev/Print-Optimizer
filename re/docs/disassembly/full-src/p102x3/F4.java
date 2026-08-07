package p102x3;

import O3.a;
import O3.c;
import O3.e;
import O3.f;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
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
import p087u3.b;

/* JADX INFO: loaded from: classes2.dex */
public final class F4 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ b f13948o;
    public final /* synthetic */ c p;

    public F4(b bVar, c cVar) {
        this.f13948o = bVar;
        this.p = cVar;
    }

    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1329995141, iIntValue, -1, "com.notescrafter.ui.screens.EnhanceScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EnhanceScreen.kt:243)");
        }
        Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_4 = Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(12));
        Modifier modifierM672paddingqDBjuR0$default = PaddingKt.m672paddingqDBjuR0$default(Modifier.Companion, 0.0f, Dp.m6403constructorimpl(8), 0.0f, 0.0f, 13, null);
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_4, Alignment.Companion.getStart(), composer, 6);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM672paddingqDBjuR0$default);
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
        b bVar = this.f13948o;
        boolean invertColors = bVar.getInvertColors();
        composer.startReplaceGroup(-843521918);
        c cVar = this.p;
        boolean zChanged = composer.changed(cVar) | composer.changedInstance(bVar);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new E4(cVar, bVar, 1);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Z4.d("Invert Colors", "Dark to light", invertColors, (c) objRememberedValue, composer, 54);
        boolean clearBackground = bVar.getClearBackground();
        composer.startReplaceGroup(-843502424);
        boolean zChanged2 = composer.changed(cVar) | composer.changedInstance(bVar);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new E4(cVar, bVar, 2);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        Z4.d("Clear PDF Background", "Remove background noise", clearBackground, (c) objRememberedValue2, composer, 54);
        boolean grayscale = bVar.getGrayscale();
        composer.startReplaceGroup(-843483589);
        boolean zChanged3 = composer.changed(cVar) | composer.changedInstance(bVar);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
            objRememberedValue3 = new E4(cVar, bVar, 3);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        Z4.d("Grayscale", "Shades of gray", grayscale, (c) objRememberedValue3, composer, 54);
        boolean blackAndWhite = bVar.getBlackAndWhite();
        composer.startReplaceGroup(-843464767);
        boolean zChanged4 = composer.changed(cVar) | composer.changedInstance(bVar);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChanged4 || objRememberedValue4 == Composer.Companion.getEmpty()) {
            objRememberedValue4 = new E4(cVar, bVar, 4);
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        Z4.d("Black & White", "Pure black & white", blackAndWhite, (c) objRememberedValue4, composer, 54);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return B3.o.f154a;
    }
}
