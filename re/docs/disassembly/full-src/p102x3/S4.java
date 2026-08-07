package p102x3;

import O3.a;
import O3.c;
import O3.e;
import O3.f;
import android.graphics.RectF;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.jvm.internal.o;
import p083t3.I;
import p087u3.b;

/* JADX INFO: loaded from: classes2.dex */
public final class S4 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List f14399o;
    public final /* synthetic */ b p;
    public final /* synthetic */ c q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f14400r;

    public S4(List list, b bVar, c cVar, MutableState mutableState) {
        this.f14399o = list;
        this.p = bVar;
        this.q = cVar;
        this.f14400r = mutableState;
    }

    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1312047967, iIntValue, -1, "com.notescrafter.ui.screens.EnhanceScreen.<anonymous> (EnhanceScreen.kt:503)");
        }
        b bVar = this.p;
        RectF logoBox = bVar.getLogoBox();
        composer.startReplaceGroup(337495965);
        c cVar = this.q;
        boolean zChanged = composer.changed(cVar) | composer.changedInstance(bVar);
        Object objRememberedValue = composer.rememberedValue();
        MutableState mutableState = this.f14400r;
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new R4(cVar, mutableState, bVar);
            composer.updateRememberedValue(objRememberedValue);
        }
        e eVar = (e) objRememberedValue;
        Object objK = p076s.b.k(composer, 337502278);
        if (objK == Composer.Companion.getEmpty()) {
            objK = new I(24, mutableState);
            composer.updateRememberedValue(objK);
        }
        composer.endReplaceGroup();
        A6.c(this.f14399o, logoBox, eVar, (a) objK, null, composer, 3072);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return B3.o.f154a;
    }
}
