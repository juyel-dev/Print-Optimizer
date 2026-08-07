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
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.CoffeeKt;
import androidx.compose.material.icons.outlined.RepeatKt;
import androidx.compose.material.icons.outlined.TimerKt;
import androidx.compose.material.icons.outlined.WeekendKt;
import androidx.compose.material3.DividerKt;
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
import p083t3.C2321y;

/* JADX INFO: renamed from: x3.fa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2466fa implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MutableState f15015o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f15016r;

    public C2466fa(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4) {
        this.f15015o = mutableState;
        this.p = mutableState2;
        this.q = mutableState3;
        this.f15016r = mutableState4;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
                ComposerKt.traceEventStart(-275666369, iIntValue, -1, "com.notescrafter.ui.screens.PomodoroSetupScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PomodoroSetupScreen.kt:185)");
            }
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
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
            Icons.Outlined outlined = Icons.Outlined.INSTANCE;
            ImageVector timer = TimerKt.getTimer(outlined);
            List list = AbstractC2642qa.f15449c;
            MutableState mutableState = this.f15015o;
            int iIntValue2 = ((Number) mutableState.getValue()).intValue();
            composer.startReplaceGroup(-991377086);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion3 = Composer.Companion;
            if (objRememberedValue == companion3.getEmpty()) {
                objRememberedValue = new C2321y(13, mutableState);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            AbstractC2642qa.c(timer, "Focus Duration", null, iIntValue2, "min", 15, 60, 5, (c) objRememberedValue, composer, 115040304, 4);
            Color.Companion companion4 = Color.Companion;
            float f5 = 20;
            DividerKt.m1794HorizontalDivider9IZ8Weo(PaddingKt.m670paddingVpY3zN4$default(companion, Dp.m6403constructorimpl(f5), 0.0f, 2, null), 0.0f, Color.m3926copywmQWz5c$default(companion4.m3964getWhite0d7_KjU(), 0.06f, 0.0f, 0.0f, 0.0f, 14, null), composer, 390, 2);
            ImageVector coffee = CoffeeKt.getCoffee(outlined);
            MutableState mutableState2 = this.p;
            int iIntValue3 = ((Number) mutableState2.getValue()).intValue();
            composer.startReplaceGroup(-991357081);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion3.getEmpty()) {
                objRememberedValue2 = new C2321y(14, mutableState2);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            AbstractC2642qa.c(coffee, "Short Break", null, iIntValue3, "min", 3, 15, 1, (c) objRememberedValue2, composer, 115040304, 4);
            DividerKt.m1794HorizontalDivider9IZ8Weo(PaddingKt.m670paddingVpY3zN4$default(companion, Dp.m6403constructorimpl(f5), 0.0f, 2, null), 0.0f, Color.m3926copywmQWz5c$default(companion4.m3964getWhite0d7_KjU(), 0.06f, 0.0f, 0.0f, 0.0f, 14, null), composer, 390, 2);
            ImageVector weekend = WeekendKt.getWeekend(outlined);
            MutableState mutableState3 = this.q;
            int iIntValue4 = ((Number) mutableState3.getValue()).intValue();
            composer.startReplaceGroup(-991336922);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion3.getEmpty()) {
                objRememberedValue3 = new C2321y(15, mutableState3);
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            AbstractC2642qa.c(weekend, "Long Break", null, iIntValue4, "min", 10, 30, 5, (c) objRememberedValue3, composer, 115040304, 4);
            DividerKt.m1794HorizontalDivider9IZ8Weo(PaddingKt.m670paddingVpY3zN4$default(companion, Dp.m6403constructorimpl(f5), 0.0f, 2, null), 0.0f, Color.m3926copywmQWz5c$default(companion4.m3964getWhite0d7_KjU(), 0.06f, 0.0f, 0.0f, 0.0f, 14, null), composer, 390, 2);
            ImageVector repeat = RepeatKt.getRepeat(outlined);
            MutableState mutableState4 = this.f15016r;
            int iIntValue5 = ((Number) mutableState4.getValue()).intValue();
            composer.startReplaceGroup(-991314579);
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == companion3.getEmpty()) {
                objRememberedValue4 = new C2321y(16, mutableState4);
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            AbstractC2642qa.c(repeat, "Sessions Cycle", "Before Long break", iIntValue5, "", 2, 6, 1, (c) objRememberedValue4, composer, 115040688, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
