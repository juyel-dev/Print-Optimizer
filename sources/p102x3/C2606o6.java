package p102x3;

import B3.o;
import O3.a;
import O3.e;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;

/* JADX INFO: renamed from: x3.o6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2606o6 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15369o;
    public final /* synthetic */ a p;

    public /* synthetic */ C2606o6(int i5, a aVar) {
        this.f15369o = i5;
        this.p = aVar;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15369o) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                if ((iIntValue & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(56395510, iIntValue, -1, "com.notescrafter.ui.screens.LiveChatScreen.<anonymous>.<anonymous> (LiveChatScreen.kt:35)");
                    }
                    IconButtonKt.IconButton(this.p, null, false, null, null, AbstractC2616p0.f15391b, composer, 196608, 30);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if ((iIntValue2 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(853877936, iIntValue2, -1, "com.notescrafter.ui.screens.LiveChatScreen.<anonymous> (LiveChatScreen.kt:26)");
                    }
                    AppBarKt.m1483TopAppBarGHTll3U(AbstractC2616p0.f15390a, null, ComposableLambdaKt.rememberComposableLambda(56395510, true, new C2606o6(0, this.p), composer2, 54), null, 0.0f, null, TopAppBarDefaults.INSTANCE.m2606topAppBarColorszjMxDiM(p107y3.a.e, 0L, 0L, 0L, 0L, composer2, (TopAppBarDefaults.$stable << 15) | 6, 30), null, composer2, 390, 186);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
        }
        return o.f154a;
    }
}
