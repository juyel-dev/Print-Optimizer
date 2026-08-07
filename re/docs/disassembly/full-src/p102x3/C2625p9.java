package p102x3;

import O3.a;
import O3.f;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: x3.p9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2625p9 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MutableState f15414o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;

    public C2625p9(MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        this.f15414o = mutableState;
        this.p = mutableState2;
        this.q = mutableState3;
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
                ComposerKt.traceEventStart(-649361564, iIntValue, -1, "com.notescrafter.ui.screens.PdfSplitScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfSplitScreen.kt:565)");
            }
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(Modifier.Companion, Dp.m6403constructorimpl(28)), composer, 6);
            composer.startReplaceGroup(-665492192);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new P3(6, this.f15414o, this.p, this.q);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            ButtonKt.TextButton((a) objRememberedValue, null, false, null, null, null, null, null, null, L1.f14148b, composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
