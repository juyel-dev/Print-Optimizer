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

/* JADX INFO: loaded from: classes2.dex */
public final class K9 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MutableState f14135o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f14136r;

    public K9(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4) {
        this.f14135o = mutableState;
        this.p = mutableState2;
        this.q = mutableState3;
        this.f14136r = mutableState4;
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
                ComposerKt.traceEventStart(-760050365, iIntValue, -1, "com.notescrafter.ui.screens.PdfToJpgScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfToJpgScreen.kt:591)");
            }
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(Modifier.Companion, Dp.m6403constructorimpl(32)), composer, 6);
            composer.startReplaceGroup(1184506106);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new C2527j7(this.f14135o, this.p, this.q, this.f14136r, 4);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            ButtonKt.TextButton((a) objRememberedValue, null, false, null, null, null, null, null, null, W1.e, composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
