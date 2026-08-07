package p102x3;

import O3.f;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.ErrorOutlineKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.o;
import p107y3.a;

/* JADX INFO: renamed from: x3.td, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2692td implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ State f15574o;

    public C2692td(State state) {
        this.f15574o = state;
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
                ComposerKt.traceEventStart(850035565, iIntValue, -1, "com.notescrafter.ui.screens.PrintOrderUploadScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:528)");
            }
            String str = (String) this.f15574o.getValue();
            o.c(str);
            Gd.o("Validation Alert", str, ErrorOutlineKt.getErrorOutline(Icons.Outlined.INSTANCE), a.f15986k, composer, 3078);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
