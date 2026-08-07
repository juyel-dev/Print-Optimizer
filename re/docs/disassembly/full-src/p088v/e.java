package p088v;

import p111z2.b;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends b {
    @Override // p111z2.b
    public final boolean e(g gVar, c cVar, c cVar2) {
        synchronized (gVar) {
            try {
                if (gVar.p != cVar) {
                    return false;
                }
                gVar.p = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p111z2.b
    public final boolean f(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f13383o != obj) {
                    return false;
                }
                gVar.f13383o = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p111z2.b
    public final boolean g(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.q != fVar) {
                    return false;
                }
                gVar.q = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p111z2.b
    public final void t(f fVar, f fVar2) {
        fVar.f13380b = fVar2;
    }

    @Override // p111z2.b
    public final void u(f fVar, Thread thread) {
        fVar.f13379a = thread;
    }
}
