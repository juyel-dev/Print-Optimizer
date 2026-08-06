package p083t3;

import B3.o;
import O3.e;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.ShoppingCartKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import p107y3.a;

/* JADX INFO: renamed from: t3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2274a implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2274a f13143o = new C2274a();

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1238178063, iIntValue, -1, "com.notescrafter.ComposableSingletons$MainActivityKt.lambda-1.<anonymous> (MainActivity.kt:1107)");
            }
            IconKt.m1877Iconww6aTOc(ShoppingCartKt.getShoppingCart(Icons.Outlined.INSTANCE), "Cart", SizeKt.m713size3ABfNKs(Modifier.Companion, Dp.m6403constructorimpl(24)), a.f15990o, composer, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
