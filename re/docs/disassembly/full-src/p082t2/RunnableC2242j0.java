package p082t2;

import T1.z;

/* JADX INFO: renamed from: t2.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC2242j0 implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12708o;
    public final /* synthetic */ o1 p;
    public final /* synthetic */ BinderC2238h0 q;

    public /* synthetic */ RunnableC2242j0(BinderC2238h0 binderC2238h0, o1 o1Var, int i5) {
        this.f12708o = i5;
        this.p = o1Var;
        this.q = binderC2238h0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12708o) {
            case 0:
                BinderC2238h0 binderC2238h0 = this.q;
                binderC2238h0.f12695o.V();
                j1 j1Var = binderC2238h0.f12695o;
                j1Var.m().h();
                j1Var.W();
                o1 o1Var = this.p;
                z.e(o1Var.f12803o);
                j1Var.f(o1Var);
                break;
            default:
                BinderC2238h0 binderC2238h1 = this.q;
                binderC2238h1.f12695o.V();
                binderC2238h1.f12695o.O(this.p);
                break;
        }
    }
}
