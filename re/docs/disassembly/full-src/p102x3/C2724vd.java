package p102x3;

import O3.a;
import O3.f;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: x3.vd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2724vd implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MutableState f15655o;
    public final /* synthetic */ MutableState p;

    public C2724vd(MutableState mutableState, MutableState mutableState2) {
        this.f15655o = mutableState;
        this.p = mutableState2;
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
                ComposerKt.traceEventStart(1082598901, iIntValue, -1, "com.notescrafter.ui.screens.PrintOrderUploadScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:553)");
            }
            composer.startReplaceGroup(-553481056);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new C2412c4(12, this.f15655o, this.p);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Gd.c((a) objRememberedValue, composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
