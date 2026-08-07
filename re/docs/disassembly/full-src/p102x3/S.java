package p102x3;

import O3.f;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final class S implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final S f14395o = new S();

    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RowScope Button = (RowScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(Button, "$this$Button");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1532000656, iIntValue, -1, "com.notescrafter.ui.screens.ComposableSingletons$EditPageScreenKt.lambda-4.<anonymous> (EditPageScreen.kt:648)");
            }
            IconKt.m1877Iconww6aTOc(CloseKt.getClose(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m713size3ABfNKs(Modifier.Companion, Dp.m6403constructorimpl(14)), Color.Companion.m3964getWhite0d7_KjU(), composer, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
