package p015d;

import B3.o;
import K2.b;
import androidx.compose.runtime.State;
import java.io.Serializable;
import p022f.e;

/* JADX INFO: loaded from: classes.dex */
public final class l extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f10951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final State f10952d;

    public l(a aVar, State state) {
        this.f10951c = aVar;
        this.f10952d = state;
    }

    public final void J(Object obj) {
        o oVar;
        Serializable serializable = (Serializable) obj;
        e eVar = this.f10951c.f10934a;
        if (eVar != null) {
            eVar.J(serializable);
            oVar = o.f154a;
        } else {
            oVar = null;
        }
        if (oVar == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }
}
