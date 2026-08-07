package p083t3;

import B3.o;
import F3.d;
import a4.InterfaceC0208g;
import a4.T;
import p087u3.t;
import p087u3.u;

/* JADX INFO: loaded from: classes2.dex */
public final class W implements InterfaceC0208g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y f13118o;

    public W(Y y4) {
        this.f13118o = y4;
    }

    @Override // a4.InterfaceC0208g
    public final Object emit(Object obj, d dVar) {
        t tVar = (t) obj;
        Y y4 = this.f13118o;
        y4.f13134o.i(tVar);
        u.d dVar2 = new u.d(tVar.getCurrentPage(), tVar.getTotalPages(), tVar.getCurrentBatch(), tVar.getTotalBatches(), tVar.getProgress(), tVar.getStatus());
        T t = y4.q;
        t.getClass();
        t.j(null, dVar2);
        return o.f154a;
    }
}
