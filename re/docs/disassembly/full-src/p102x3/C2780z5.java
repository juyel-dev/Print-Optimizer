package p102x3;

import B3.o;
import O3.a;
import O3.e;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import p083t3.I;

/* JADX INFO: renamed from: x3.z5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2780z5 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15799o;
    public final /* synthetic */ MutableState p;

    public /* synthetic */ C2780z5(int i5, MutableState mutableState) {
        this.f15799o = i5;
        this.p = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15799o) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                if ((iIntValue & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(331484009, iIntValue, -1, "com.notescrafter.ui.screens.HelpCenterScreen.<anonymous>.<anonymous>.<anonymous> (HelpCenterScreen.kt:149)");
                    }
                    MutableState mutableState = this.p;
                    if (((String) mutableState.getValue()).length() > 0) {
                        composer.startReplaceGroup(23559423);
                        Object objRememberedValue = composer.rememberedValue();
                        if (objRememberedValue == Composer.Companion.getEmpty()) {
                            objRememberedValue = new I(25, mutableState);
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        IconButtonKt.IconButton((a) objRememberedValue, null, false, null, null, AbstractC2376a0.f14763c, composer, 196614, 30);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if ((iIntValue2 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1826409450, iIntValue2, -1, "com.notescrafter.ui.screens.PrintAddressesScreen.<anonymous> (PrintAddressesScreen.kt:559)");
                    }
                    composer2.startReplaceGroup(-221446895);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = new O6(24, this.p);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    ButtonKt.TextButton((a) objRememberedValue2, null, false, null, null, null, null, null, null, AbstractC2649r2.f15476f, composer2, 805306374, 510);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
        }
        return o.f154a;
    }
}
