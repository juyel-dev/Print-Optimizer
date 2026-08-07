package p102x3;

import O3.c;
import O3.f;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: x3.kb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2547kb implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MutableState f15252o;

    public C2547kb(MutableState mutableState) {
        this.f15252o = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
                ComposerKt.traceEventStart(-1502350203, iIntValue, -1, "com.notescrafter.ui.screens.PrintAddressesScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintAddressesScreen.kt:379)");
            }
            TextKt.m2432Text4IGK_g(((Boolean) this.f15252o.getValue()).booleanValue() ? "CONFIRMING" : "CONFIRM", (Modifier) null, Color.Companion.m3964getWhite0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, FontWeight.Companion.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 200064, 0, 131026);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
