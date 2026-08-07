package p102x3;

import B3.o;
import O3.e;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.KeyboardArrowLeftKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.Modifier;
import p107y3.a;

/* JADX INFO: renamed from: x3.w6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2733w6 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MutableIntState f15674o;

    public C2733w6(MutableIntState mutableIntState) {
        this.f15674o = mutableIntState;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1677427396, iIntValue, -1, "com.notescrafter.ui.screens.LogoSelectionScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LogoSelectionScreen.kt:189)");
            }
            IconKt.m1877Iconww6aTOc(KeyboardArrowLeftKt.getKeyboardArrowLeft(Icons.INSTANCE.getDefault()), "Prev", (Modifier) null, this.f15674o.getIntValue() > 0 ? a.f15990o : a.q, composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
