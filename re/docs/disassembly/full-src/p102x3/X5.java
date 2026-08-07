package p102x3;

import O3.c;
import O3.e;
import O3.f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.AddKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.internal.o;
import p015d.l;
import p076s.b;
import p107y3.a;

/* JADX INFO: loaded from: classes2.dex */
public final class X5 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f14645o;

    public X5(l lVar) {
        this.f14645o = lVar;
    }

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
                ComposerKt.traceEventStart(282920983, iIntValue, -1, "com.notescrafter.ui.screens.JpgToPdfScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (JpgToPdfScreen.kt:828)");
            }
            Modifier.Companion companion = Modifier.Companion;
            b.m(8, companion, composer, 6);
            float f5 = 12;
            Modifier modifierM207backgroundbw27NRU$default = BackgroundKt.m207backgroundbw27NRU$default(b.e(f5, b.g(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f5), Dp.m6403constructorimpl(1), Color.m3926copywmQWz5c$default(a.t, 0.2f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.02f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            composer.startReplaceGroup(-219818419);
            l lVar = this.f14645o;
            boolean zChangedInstance = composer.changedInstance(lVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new P5(lVar, 2);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(ClickableKt.m242clickableXHw0xAI$default(modifierM207backgroundbw27NRU$default, false, null, null, (O3.a) objRememberedValue, 7, null), 0.0f, Dp.m6403constructorimpl(f5), 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getCenterVertically(), composer, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM670paddingVpY3zN4$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            O3.a constructor = companion2.getConstructor();
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
            e eVarG = p035i0.a.g(companion2, composerM3407constructorimpl, measurePolicyRowMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageVector add = AddKt.getAdd(Icons.Outlined.INSTANCE);
            long j5 = a.f15980c;
            IconKt.m1877Iconww6aTOc(add, (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(16)), j5, composer, 3504, 0);
            androidx.compose.foundation.text.modifiers.a.q(6, companion, composer, 6);
            TextKt.m2432Text4IGK_g("Add More Images", (Modifier) null, j5, TextUnitKt.getSp(13), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 200070, 0, 131026);
            composer.endNode();
            if (b.q(28, companion, composer, 6)) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
