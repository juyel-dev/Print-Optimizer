package p015d;

import O3.e;
import X3.InterfaceC0200y;
import com.google.android.gms.internal.ads.N5;
import p010c.C0689b;
import p010c.v;

/* JADX INFO: loaded from: classes.dex */
public final class o extends v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC0200y f10957d;
    public e e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public N5 f10958f;

    @Override // p010c.v
    public final void a() {
        N5 n5 = this.f10958f;
        if (n5 != null) {
            n5.a();
        }
        N5 n6 = this.f10958f;
        if (n6 == null) {
            return;
        }
        n6.f5035o = false;
    }

    @Override // p010c.v
    public final void b() {
        N5 n5 = this.f10958f;
        if (n5 != null && !n5.f5035o) {
            n5.a();
            this.f10958f = null;
        }
        if (this.f10958f == null) {
            this.f10958f = new N5(this.f10957d, false, this.e, this);
        }
        N5 n6 = this.f10958f;
        if (n6 != null) {
            ((Z3.e) n6.p).h(null, false);
        }
        N5 n7 = this.f10958f;
        if (n7 == null) {
            return;
        }
        n7.f5035o = false;
    }

    @Override // p010c.v
    public final void c(C0689b c0689b) {
        super.c(c0689b);
        N5 n5 = this.f10958f;
        if (n5 != null) {
            ((Z3.e) n5.p).m(c0689b);
        }
    }

    @Override // p010c.v
    public final void d(C0689b c0689b) {
        super.d(c0689b);
        N5 n5 = this.f10958f;
        if (n5 != null) {
            n5.a();
        }
        if (this.f2524a) {
            this.f10958f = new N5(this.f10957d, true, this.e, this);
        }
    }
}
