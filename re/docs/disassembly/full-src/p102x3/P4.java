package p102x3;

import O3.a;
import O3.c;
import O3.f;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import p087u3.e;

/* JADX INFO: loaded from: classes2.dex */
public final class P4 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ e f14281o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ c q;

    public P4(e eVar, boolean z3, c cVar) {
        this.f14281o = eVar;
        this.p = z3;
        this.q = cVar;
    }

    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        final int i5 = 1;
        final int i6 = 0;
        BoxScope GlassCard = (BoxScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(GlassCard, "$this$GlassCard");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1795901349, iIntValue, -1, "com.notescrafter.ui.screens.EnhanceScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EnhanceScreen.kt:414)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(companion, Dp.m6403constructorimpl(16));
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
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
            O3.e eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Z4.i("Add Separation Lines", composer, 6);
            float f5 = 8;
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f5)), composer, 6);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f5)), companion2.getTop(), composer, 6);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, companion);
            a constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer);
            O3.e eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyRowMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            final e eVar = this.f14281o;
            boolean z3 = !eVar.getAddSeparationLines();
            composer.startReplaceGroup(-473467360);
            final boolean z4 = this.p;
            boolean zChanged = composer.changed(z4);
            final c cVar = this.q;
            boolean zChanged2 = zChanged | composer.changed(cVar) | composer.changed(eVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged2 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new a() { // from class: x3.O4
                    @Override // O3.a
                    public final Object invoke() {
                        switch (i6) {
                            case 0:
                                if (!z4) {
                                    cVar.invoke(e.copy$default(eVar, null, null, null, 0, 0, false, false, 95, null));
                                }
                                break;
                            default:
                                if (!z4) {
                                    cVar.invoke(e.copy$default(eVar, null, null, null, 0, 0, true, false, 95, null));
                                }
                                break;
                        }
                        return B3.o.f154a;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Z4.h("No", z3, (a) objRememberedValue, RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composer, 6, 0);
            boolean addSeparationLines = eVar.getAddSeparationLines();
            composer.startReplaceGroup(-473460865);
            boolean zChanged3 = composer.changed(z4) | composer.changed(cVar) | composer.changed(eVar);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new a() { // from class: x3.O4
                    @Override // O3.a
                    public final Object invoke() {
                        switch (i5) {
                            case 0:
                                if (!z4) {
                                    cVar.invoke(e.copy$default(eVar, null, null, null, 0, 0, false, false, 95, null));
                                }
                                break;
                            default:
                                if (!z4) {
                                    cVar.invoke(e.copy$default(eVar, null, null, null, 0, 0, true, false, 95, null));
                                }
                                break;
                        }
                        return B3.o.f154a;
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Z4.h("Yes", addSeparationLines, (a) objRememberedValue2, RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composer, 6, 0);
            if (androidx.compose.foundation.text.modifiers.a.w(composer)) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
