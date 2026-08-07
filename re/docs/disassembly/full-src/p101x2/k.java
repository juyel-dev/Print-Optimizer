package p101x2;

import com.google.android.gms.internal.ads.Gp;
import com.google.android.gms.internal.ads.RunnableC1805vo;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements m, e, d, b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13716o;
    public final Executor p;
    public final a q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o f13717r;

    public /* synthetic */ k(Executor executor, a aVar, o oVar, int i5) {
        this.f13716o = i5;
        this.p = executor;
        this.q = aVar;
        this.f13717r = oVar;
    }

    @Override // p101x2.d
    public void B(Exception exc) {
        this.f13717r.l(exc);
    }

    @Override // p101x2.m
    public final void a(h hVar) {
        switch (this.f13716o) {
            case 0:
                this.p.execute(new RunnableC1805vo(20, this, false, hVar));
                break;
            default:
                this.p.execute(new Gp(21, (Object) this, false, (Object) hVar));
                break;
        }
    }

    @Override // p101x2.b
    public void e() {
        this.f13717r.n();
    }

    @Override // p101x2.e
    public void onSuccess(Object obj) {
        this.f13717r.m(obj);
    }
}
