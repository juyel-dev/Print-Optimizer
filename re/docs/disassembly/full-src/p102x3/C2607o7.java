package p102x3;

import O3.f;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.o;
import p015d.l;
import p097w3.j;
import p107y3.a;

/* JADX INFO: renamed from: x3.o7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2607o7 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f15370o;
    public final /* synthetic */ State p;
    public final /* synthetic */ State q;

    public C2607o7(l lVar, State state, State state2) {
        this.f15370o = lVar;
        this.p = state;
        this.q = state2;
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
                ComposerKt.traceEventStart(-593779807, iIntValue, -1, "com.notescrafter.ui.screens.PdfCompressScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfCompressScreen.kt:595)");
            }
            Modifier modifierM699height3ABfNKs = SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m6403constructorimpl(280));
            long j5 = a.f15978a;
            State state = this.p;
            long jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(j5, ((Number) state.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
            composer.startReplaceGroup(-52512606);
            l lVar = this.f15370o;
            boolean zChangedInstance = composer.changedInstance(lVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new P5(lVar, 5);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            j.a(modifierM699height3ABfNKs, 0L, jM3926copywmQWz5c$default, 0.0f, (O3.a) objRememberedValue, ComposableLambdaKt.rememberComposableLambda(1831218460, true, new C2591n7(lVar, state, this.q), composer, 54), composer, 196614, 10);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
