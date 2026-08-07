package p102x3;

import O3.f;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.text.modifiers.a;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.WarningKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: x3.ud, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2708ud implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15614o;

    public C2708ud(int i5) {
        this.f15614o = i5;
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
                ComposerKt.traceEventStart(1912247894, iIntValue, -1, "com.notescrafter.ui.screens.PrintOrderUploadScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:539)");
            }
            Gd.o("Order Limit Exceeded", a.o(new StringBuilder("Maximum of 10 notebooks allowed per order. You currently have "), this.f15614o, " notebooks."), WarningKt.getWarning(Icons.Outlined.INSTANCE), p107y3.a.f15986k, composer, 3078);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
