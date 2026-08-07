package p102x3;

import O3.a;
import O3.c;
import O3.e;
import O3.f;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
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
import kotlin.jvm.internal.o;
import p083t3.F;
import p083t3.I;
import p087u3.b;

/* JADX INFO: loaded from: classes2.dex */
public final class H4 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ b f14018o;
    public final /* synthetic */ c p;
    public final /* synthetic */ MutableState q;

    public H4(c cVar, MutableState mutableState, b bVar) {
        this.f14018o = bVar;
        this.p = cVar;
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
                ComposerKt.traceEventStart(-1504820424, iIntValue, -1, "com.notescrafter.ui.screens.EnhanceScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EnhanceScreen.kt:289)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(companion, Dp.m6403constructorimpl(16));
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM668padding3ABfNKs);
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
            Z4.i("Remove Logo", composer, 6);
            p076s.b.m(12, companion, composer, 6);
            b bVar = this.f14018o;
            boolean removeLogo = bVar.getRemoveLogo();
            composer.startReplaceGroup(-2088996985);
            c cVar = this.p;
            boolean zChanged = composer.changed(cVar) | composer.changedInstance(bVar);
            Object objRememberedValue = composer.rememberedValue();
            MutableState mutableState = this.q;
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new F(cVar, bVar, mutableState, 7);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Z4.d("Enable Logo Removal", "Select region to remove", removeLogo, (c) objRememberedValue, composer, 54);
            composer.startReplaceGroup(-2088984092);
            if (bVar.getRemoveLogo() && bVar.getLogoBox() != null) {
                p076s.b.m(8, companion, composer, 6);
                ButtonColors buttonColorsM1520buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1520buttonColorsro_MJ88(Color.m3926copywmQWz5c$default(p107y3.a.f15978a, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, composer, (ButtonDefaults.$stable << 12) | 6, 14);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                composer.startReplaceGroup(-2088977723);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new I(23, mutableState);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                ButtonKt.Button((a) objRememberedValue2, modifierFillMaxWidth$default, false, null, buttonColorsM1520buttonColorsro_MJ88, null, null, null, null, V.f14504a, composer, 805306422, 492);
            }
            if (p035i0.a.z(composer)) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
