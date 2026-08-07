package p101x2;

import com.google.android.gms.internal.ads.Gp;
import com.google.android.gms.internal.ads.RunnableC1805vo;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements m, e, d, b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13718o;
    public final Object p;
    public final Executor q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f13719r;

    public l(Executor executor, c cVar) {
        this.f13718o = 1;
        this.p = new Object();
        this.q = executor;
        this.f13719r = cVar;
    }

    private final void b(h hVar) {
        if (hVar.g()) {
            synchronized (this.p) {
                try {
                    if (((e) this.f13719r) == null) {
                        return;
                    }
                    this.q.execute(new RunnableC1805vo(22, this, false, hVar));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // p101x2.d
    public void B(Exception exc) {
        ((o) this.f13719r).l(exc);
    }

    @Override // p101x2.m
    public final void a(h hVar) {
        switch (this.f13718o) {
            case 0:
                if (((o) hVar).f13723d) {
                    synchronized (this.p) {
                        try {
                            if (((b) this.f13719r) != null) {
                                ((n) this.q).getClass();
                                synchronized (this.p) {
                                    try {
                                        b bVar = (b) this.f13719r;
                                        if (bVar != null) {
                                            bVar.e();
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                    break;
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
                return;
            case 1:
                synchronized (this.p) {
                    break;
                }
                this.q.execute(new RunnableC1805vo(21, this, false, hVar));
                return;
            case 2:
                if (hVar.g() || ((o) hVar).f13723d) {
                    return;
                }
                synchronized (this.p) {
                    try {
                        if (((d) this.f13719r) != null) {
                            this.q.execute(new Gp(22, (Object) this, false, (Object) hVar));
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
            case 3:
                b(hVar);
                return;
            default:
                this.q.execute(new Gp(23, (Object) this, false, (Object) hVar));
                return;
        }
    }

    @Override // p101x2.b
    public void e() {
        ((o) this.f13719r).n();
    }

    @Override // p101x2.e
    public void onSuccess(Object obj) {
        ((o) this.f13719r).m(obj);
    }

    public l(Executor executor, d dVar) {
        this.f13718o = 2;
        this.p = new Object();
        this.q = executor;
        this.f13719r = dVar;
    }

    public l(Executor executor, e eVar) {
        this.f13718o = 3;
        this.p = new Object();
        this.q = executor;
        this.f13719r = eVar;
    }

    public l(Executor executor, g gVar, o oVar) {
        this.f13718o = 4;
        this.q = executor;
        this.p = gVar;
        this.f13719r = oVar;
    }

    public l(n nVar, b bVar) {
        this.f13718o = 0;
        this.p = new Object();
        this.q = nVar;
        this.f13719r = bVar;
    }
}
