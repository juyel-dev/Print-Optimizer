package p102x3;

import B3.o;
import O3.c;
import O3.e;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import p107y3.a;

/* JADX INFO: renamed from: x3.x4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2747x4 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15709o;
    public final /* synthetic */ int p;

    public C2747x4(int i5, int i6) {
        this.f15709o = i5;
        this.p = i6;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1944773627, iIntValue, -1, "com.notescrafter.ui.screens.DropdownSelector.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EnhanceScreen.kt:659)");
            }
            int i5 = this.f15709o;
            TextKt.m2432Text4IGK_g(String.valueOf(i5), (Modifier) null, i5 == this.p ? a.f15978a : a.f15990o, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 0, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
