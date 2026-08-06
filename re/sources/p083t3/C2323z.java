package p083t3;

import O3.c;
import O3.e;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.o;
import p097w3.f;

/* JADX INFO: renamed from: t3.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2323z implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MutableState f13228o;
    public final /* synthetic */ State p;

    public C2323z(MutableState mutableState, State state) {
        this.f13228o = mutableState;
        this.p = state;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007e  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        boolean z3;
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2139099852, iIntValue, -1, "com.notescrafter.NotesCrafterContent.<anonymous>.<anonymous> (MainActivity.kt:514)");
            }
            MutableState mutableState = this.f13228o;
            if (o.b((String) mutableState.getValue(), "home")) {
                z3 = true;
            } else {
                if (o.b((String) mutableState.getValue(), "flow")) {
                    State state = this.p;
                    if (((Number) state.getValue()).intValue() == 0 || ((Number) state.getValue()).intValue() == 1 || ((Number) state.getValue()).intValue() == 6 || ((Number) state.getValue()).intValue() == -1) {
                        z3 = true;
                    }
                }
                z3 = false;
            }
            boolean z4 = (o.b((String) mutableState.getValue(), "home") || o.b((String) mutableState.getValue(), "flow")) ? false : true;
            boolean z5 = o.b((String) mutableState.getValue(), "print-order-upload") || o.b((String) mutableState.getValue(), "print-order-shipping") || o.b((String) mutableState.getValue(), "print-order-checkout");
            boolean z6 = o.b((String) mutableState.getValue(), "pomodoro-timer") || o.b((String) mutableState.getValue(), "pomodoro-setup") || o.b((String) mutableState.getValue(), "pdf-merge") || o.b((String) mutableState.getValue(), "pdf-split") || o.b((String) mutableState.getValue(), "pdf-compress") || o.b((String) mutableState.getValue(), "pdf-to-jpg") || o.b((String) mutableState.getValue(), "jpg-to-pdf") || o.b((String) mutableState.getValue(), "pdf-add-page-numbers") || o.b((String) mutableState.getValue(), "pdf-organize") || o.b((String) mutableState.getValue(), "pdf-crop") || o.b((String) mutableState.getValue(), "pdf-invert");
            if ((z3 || z4) && !z6 && !z5) {
                String str = (String) mutableState.getValue();
                composer.startReplaceGroup(2086664043);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new C2321y(0, mutableState);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                f.a(null, str, (c) objRememberedValue, composer, 48);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
