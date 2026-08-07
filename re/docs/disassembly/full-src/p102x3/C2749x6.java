package p102x3;

import B3.o;
import O3.e;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.KeyboardArrowRightKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.Modifier;
import java.util.List;
import p107y3.a;

/* JADX INFO: renamed from: x3.x6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2749x6 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List f15711o;
    public final /* synthetic */ MutableIntState p;

    public C2749x6(List list, MutableIntState mutableIntState) {
        this.f15711o = list;
        this.p = mutableIntState;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(838453285, iIntValue, -1, "com.notescrafter.ui.screens.LogoSelectionScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LogoSelectionScreen.kt:203)");
            }
            IconKt.m1877Iconww6aTOc(KeyboardArrowRightKt.getKeyboardArrowRight(Icons.INSTANCE.getDefault()), "Next", (Modifier) null, this.p.getIntValue() < this.f15711o.size() + (-1) ? a.f15990o : a.q, composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
