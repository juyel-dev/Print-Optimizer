package p023f0;

import O1.d;
import androidx.lifecycle.E;
import androidx.lifecycle.F;
import androidx.lifecycle.InterfaceC0683w;
import com.google.android.gms.internal.ads.C1730u0;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends E {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f11129l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public InterfaceC0683w f11130m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C1730u0 f11131n;

    public a(d dVar) {
        this.f11129l = dVar;
        if (dVar.f800a != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        dVar.f800a = this;
    }

    @Override // androidx.lifecycle.E
    public final void e() {
        d dVar = this.f11129l;
        dVar.f801b = true;
        dVar.f803d = false;
        dVar.f802c = false;
        dVar.f806i.drainPermits();
        dVar.c();
    }

    @Override // androidx.lifecycle.E
    public final void f() {
        this.f11129l.f801b = false;
    }

    @Override // androidx.lifecycle.E
    public final void h(F f5) {
        super.h(f5);
        this.f11130m = null;
        this.f11131n = null;
    }

    public final void j() {
        InterfaceC0683w interfaceC0683w = this.f11130m;
        C1730u0 c1730u0 = this.f11131n;
        if (interfaceC0683w == null || c1730u0 == null) {
            return;
        }
        super.h(c1730u0);
        d(interfaceC0683w, c1730u0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #0 : ");
        Class<?> cls = this.f11129l.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
