package p102x3;

import C3.v;
import O3.f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import com.notescrafter.PrintOrderViewModel;
import kotlin.jvm.internal.o;
import p097w3.j;
import p107y3.a;

/* JADX INFO: loaded from: classes2.dex */
public final class Lc implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ State f14177o;
    public final /* synthetic */ PrintOrderViewModel p;
    public final /* synthetic */ String q;

    public Lc(State state, PrintOrderViewModel printOrderViewModel, String str) {
        this.f14177o = state;
        this.p = printOrderViewModel;
        this.q = str;
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
                ComposerKt.traceEventStart(1907025610, iIntValue, -1, "com.notescrafter.ui.screens.PrintOrderCheckoutScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:3680)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f5 = 20;
            Modifier modifierClip = ClipKt.clip(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), RoundedCornerShapeKt.m957RoundedCornerShapea9UjIt4$default(Dp.m6403constructorimpl(f5), Dp.m6403constructorimpl(f5), 0.0f, 0.0f, 12, null));
            Brush.Companion companion2 = Brush.Companion;
            Color.Companion companion3 = Color.Companion;
            BoxKt.Box(SizeKt.m699height3ABfNKs(BackgroundKt.background$default(modifierClip, Brush.Companion.m3876horizontalGradient8A3gB4$default(companion2, v.S(Color.m3917boximpl(companion3.m3962getTransparent0d7_KjU()), Color.m3917boximpl(Color.m3926copywmQWz5c$default(a.f15978a, 0.3f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3917boximpl(companion3.m3962getTransparent0d7_KjU())), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), Dp.m6403constructorimpl(1)), composer, 0);
            j.a(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-86072827, true, new Kc(this.f14177o, this.p, this.q), composer, 54), composer, 196614, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
