package p101x2;

import T1.z;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f13713a = new o();

    public final void a(Exception exc) {
        this.f13713a.l(exc);
    }

    public final void b(Object obj) {
        this.f13713a.m(obj);
    }

    public final boolean c(Exception exc) {
        o oVar = this.f13713a;
        oVar.getClass();
        z.j(exc, "Exception must not be null");
        synchronized (oVar.f13720a) {
            try {
                if (oVar.f13722c) {
                    return false;
                }
                oVar.f13722c = true;
                oVar.f13724f = exc;
                oVar.f13721b.e(oVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Object obj) {
        o oVar = this.f13713a;
        synchronized (oVar.f13720a) {
            try {
                if (oVar.f13722c) {
                    return;
                }
                oVar.f13722c = true;
                oVar.e = obj;
                oVar.f13721b.e(oVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
