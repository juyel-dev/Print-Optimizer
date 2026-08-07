package p102x3;

import O3.c;
import O3.f;
import Q3.a;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final class Ba implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13818o;
    public final /* synthetic */ long p;

    public /* synthetic */ Ba(long j5, int i5) {
        this.f13818o = i5;
        this.p = j5;
    }

    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f13818o) {
            case 0:
                RowScope TextButton = (RowScope) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                o.f(TextButton, "$this$TextButton");
                if ((iIntValue & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1722473795, iIntValue, -1, "com.notescrafter.ui.screens.PomodoroTimerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PomodoroTimerScreen.kt:430)");
                    }
                    TextKt.m2432Text4IGK_g("Clear All", (Modifier) null, this.p, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 3078, 0, 131058);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case 1:
                BoxScope GlassCard = (BoxScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                o.f(GlassCard, "$this$GlassCard");
                if ((iIntValue2 & 17) == 16 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-48474749, iIntValue2, -1, "com.notescrafter.ui.screens.ToDoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ToDoScreen.kt:144)");
                    }
                    Ye.b(this.p, composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            default:
                LazyItemScope item = (LazyItemScope) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                o.f(item, "$this$item");
                if ((iIntValue3 & 17) == 16 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1668083843, iIntValue3, -1, "com.notescrafter.ui.screens.ToDoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ToDoScreen.kt:108)");
                    }
                    Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                    composer3.startReplaceGroup(1127835214);
                    boolean zChanged = composer3.changed(density);
                    Object objRememberedValue = composer3.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = DensityKt.Density(density.getDensity(), a.o(density.getFontScale(), 1.1f));
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    composer3.endReplaceGroup();
                    CompositionLocalKt.CompositionLocalProvider(CompositionLocalsKt.getLocalDensity().provides((Density) objRememberedValue), ComposableLambdaKt.rememberComposableLambda(1741779907, true, new Pe(this.p), composer3, 54), composer3, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
        }
        return B3.o.f154a;
    }
}
