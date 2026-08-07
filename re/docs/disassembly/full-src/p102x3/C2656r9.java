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

/* JADX INFO: renamed from: x3.r9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2656r9 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f15493o;
    public final /* synthetic */ State p;
    public final /* synthetic */ State q;

    public C2656r9(l lVar, State state, State state2) {
        this.f15493o = lVar;
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
                ComposerKt.traceEventStart(-156989225, iIntValue, -1, "com.notescrafter.ui.screens.PdfSplitScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfSplitScreen.kt:579)");
            }
            Modifier modifierM699height3ABfNKs = SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m6403constructorimpl(280));
            long j5 = a.f15978a;
            State state = this.p;
            long jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(j5, ((Number) state.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
            composer.startReplaceGroup(-665468498);
            l lVar = this.f15493o;
            boolean zChangedInstance = composer.changedInstance(lVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new P5(lVar, 16);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            j.a(modifierM699height3ABfNKs, 0L, jM3926copywmQWz5c$default, 0.0f, (O3.a) objRememberedValue, ComposableLambdaKt.rememberComposableLambda(-1102673262, true, new C2641q9(lVar, state, this.q), composer, 54), composer, 196614, 10);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
