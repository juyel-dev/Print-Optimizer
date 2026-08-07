package p097w3;

import B3.o;
import O3.e;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Modifier f13625o;
    public final /* synthetic */ long p;
    public final /* synthetic */ ComposableLambda q;

    public m(Modifier modifier, long j5, ComposableLambda composableLambda) {
        this.f13625o = modifier;
        this.p = j5;
        this.q = composableLambda;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(904865500, iIntValue, -1, "com.notescrafter.ui.components.GlassDialog.<anonymous> (GlassDialog.kt:26)");
            }
            j.a(SizeKt.wrapContentSize$default(this.f13625o, null, false, 3, null), this.p, 0L, Dp.m6403constructorimpl(8), null, ComposableLambdaKt.rememberComposableLambda(-471923903, true, new l(this.q), composer, 54), composer, 199680, 20);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
