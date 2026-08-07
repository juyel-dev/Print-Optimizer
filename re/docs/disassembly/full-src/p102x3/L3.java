package p102x3;

import O3.a;
import O3.f;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.o;
import p097w3.j;

/* JADX INFO: loaded from: classes2.dex */
public final class L3 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a f14154o;
    public final /* synthetic */ a p;
    public final /* synthetic */ MutableState q;

    public L3(a aVar, a aVar2, MutableState mutableState) {
        this.f14154o = aVar;
        this.p = aVar2;
        this.q = mutableState;
    }

    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ColumnScope DropdownMenu = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(DropdownMenu, "$this$DropdownMenu");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1950545600, iIntValue, -1, "com.notescrafter.ui.screens.DownloadedFileItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DownloadsScreen.kt:395)");
            }
            j.a(SizeKt.m718width3ABfNKs(Modifier.Companion, Dp.m6403constructorimpl(180)), p107y3.a.f15993v, Color.m3926copywmQWz5c$default(p107y3.a.f15991r, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), Dp.m6403constructorimpl(8), null, ComposableLambdaKt.rememberComposableLambda(448186299, true, new K3(this.f14154o, this.p, this.q), composer, 54), composer, 200118, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
