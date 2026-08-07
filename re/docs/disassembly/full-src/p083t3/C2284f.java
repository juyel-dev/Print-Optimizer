package p083t3;

import M0.b;
import O3.e;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.notescrafter.MainActivity;
import kotlin.jvm.internal.o;
import p092v3.h;

/* JADX INFO: renamed from: t3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2284f implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13165o;
    public final /* synthetic */ MainActivity p;

    public /* synthetic */ C2284f(MainActivity mainActivity, int i5) {
        this.f13165o = i5;
        this.p = mainActivity;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13165o) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                if ((iIntValue & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1051166725, iIntValue, -1, "com.notescrafter.MainActivity.onCreate.<anonymous>.<anonymous> (MainActivity.kt:192)");
                    }
                    composer.startReplaceGroup(552744650);
                    Object objRememberedValue = composer.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new SnackbarHostState();
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    SnackbarHostState snackbarHostState = (SnackbarHostState) objRememberedValue;
                    composer.endReplaceGroup();
                    MainActivity mainActivity = this.p;
                    p036i2.e eVar = mainActivity.f10855H;
                    if (eVar == null) {
                        o.k("updateManager");
                        throw null;
                    }
                    b bVar = mainActivity.f10856I;
                    if (bVar == null) {
                        o.k("pdfAdMobManager");
                        throw null;
                    }
                    b bVar2 = mainActivity.f10857J;
                    if (bVar2 == null) {
                        o.k("quickToolAdMobManager");
                        throw null;
                    }
                    h hVar = mainActivity.f10858K;
                    if (hVar == null) {
                        o.k("authManager");
                        throw null;
                    }
                    S.b(snackbarHostState, eVar, bVar, bVar2, hVar, mainActivity.h(), composer, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                return B3.o.f154a;
            default:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if ((iIntValue2 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-546050999, iIntValue2, -1, "com.notescrafter.MainActivity.onCreate.<anonymous> (MainActivity.kt:191)");
                    }
                    p107y3.b.a(ComposableLambdaKt.rememberComposableLambda(-1051166725, true, new C2284f(this.p, 0), composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                return B3.o.f154a;
        }
    }
}
