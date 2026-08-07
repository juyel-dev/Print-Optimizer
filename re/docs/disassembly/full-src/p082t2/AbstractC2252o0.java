package p082t2;

import J2.b;
import L0.a;
import T1.z;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC0803Rd;

/* JADX INFO: renamed from: t2.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2252o0 implements InterfaceC2254p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12783a;

    public AbstractC2252o0() {
        this.f12783a = new a(this, 22);
    }

    @Override // p082t2.InterfaceC2254p0
    public Context a() {
        return ((C2236g0) this.f12783a).f12675a;
    }

    public abstract void c();

    public b d() {
        return AbstractC0803Rd.f5534a.c((a) this.f12783a);
    }

    @Override // p082t2.InterfaceC2254p0
    public Y1.a e() {
        return ((C2236g0) this.f12783a).f12686n;
    }

    public U f() {
        U u = ((C2236g0) this.f12783a).f12680h;
        C2236g0.f(u);
        return u;
    }

    public n1 g() {
        n1 n1Var = ((C2236g0) this.f12783a).f12684l;
        C2236g0.f(n1Var);
        return n1Var;
    }

    public void h() {
        C2226b0 c2226b0 = ((C2236g0) this.f12783a).f12682j;
        C2236g0.d(c2226b0);
        c2226b0.h();
    }

    @Override // p082t2.InterfaceC2254p0
    public C i() {
        return ((C2236g0) this.f12783a).f12679f;
    }

    @Override // p082t2.InterfaceC2254p0
    public L j() {
        L l5 = ((C2236g0) this.f12783a).f12681i;
        C2236g0.d(l5);
        return l5;
    }

    @Override // p082t2.InterfaceC2254p0
    public C2226b0 m() {
        C2226b0 c2226b0 = ((C2236g0) this.f12783a).f12682j;
        C2236g0.d(c2226b0);
        return c2226b0;
    }

    public AbstractC2252o0(C2236g0 c2236g0) {
        z.i(c2236g0);
        this.f12783a = c2236g0;
    }
}
