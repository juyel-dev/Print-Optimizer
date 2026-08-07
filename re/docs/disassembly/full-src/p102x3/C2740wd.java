package p102x3;

import O3.f;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.o;
import p076s.b;
import p097w3.j;
import p107y3.a;

/* JADX INFO: renamed from: x3.wd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2740wd implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MutableState f15698o;
    public final /* synthetic */ MutableState p;

    public C2740wd(MutableState mutableState, MutableState mutableState2) {
        this.f15698o = mutableState;
        this.p = mutableState2;
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
                ComposerKt.traceEventStart(252949908, iIntValue, -1, "com.notescrafter.ui.screens.PrintOrderUploadScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:578)");
            }
            Modifier.Companion companion = Modifier.Companion;
            b.m(8, companion, composer, 6);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            long j5 = a.f15978a;
            long jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(j5, 0.08f, 0.0f, 0.0f, 0.0f, 14, null);
            long jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(j5, 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
            composer.startReplaceGroup(-553447840);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new C2412c4(13, this.f15698o, this.p);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            j.a(modifierFillMaxWidth$default, jM3926copywmQWz5c$default, jM3926copywmQWz5c$default2, 0.0f, (O3.a) objRememberedValue, X2.f14626b, composer, 221622, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
