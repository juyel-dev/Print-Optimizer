package p102x3;

import O3.c;
import O3.f;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.modifiers.a;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: x3.k4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2540k4 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ImageVector f15243o;
    public final /* synthetic */ String p;

    public C2540k4(ImageVector imageVector, String str) {
        this.f15243o = imageVector;
        this.p = str;
    }

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
                ComposerKt.traceEventStart(1134905673, iIntValue, -1, "com.notescrafter.ui.screens.HistoryButton.<anonymous> (EditPageScreen.kt:728)");
            }
            Modifier.Companion companion = Modifier.Companion;
            IconKt.m1877Iconww6aTOc(this.f15243o, (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(16)), 0L, composer, 432, 8);
            a.q(8, companion, composer, 6);
            TextKt.m2432Text4IGK_g(this.p, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
