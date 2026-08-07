package p102x3;

import O3.a;
import O3.f;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.o;
import p097w3.j;

/* JADX INFO: loaded from: classes2.dex */
public final class Re implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MutableState f14394o;

    public Re(MutableState mutableState) {
        this.f14394o = mutableState;
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
                ComposerKt.traceEventStart(-1363900705, iIntValue, -1, "com.notescrafter.ui.screens.ToDoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ToDoScreen.kt:172)");
            }
            Modifier modifierM699height3ABfNKs = SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m6403constructorimpl(60));
            composer.startReplaceGroup(1127925242);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Bb(15, this.f14394o);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            j.a(ClickableKt.m242clickableXHw0xAI$default(modifierM699height3ABfNKs, false, null, null, (a) objRememberedValue, 7, null), 0L, 0L, 0.0f, null, AbstractC2730w3.f15663c, composer, 196608, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
