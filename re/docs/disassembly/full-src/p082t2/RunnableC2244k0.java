package p082t2;

import android.os.Bundle;

/* JADX INFO: renamed from: t2.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC2244k0 implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12747o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f12748r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f12749s;
    public final /* synthetic */ Object t;

    public /* synthetic */ RunnableC2244k0(Object obj, Object obj2, Object obj3, Object obj4, long j5, int i5) {
        this.f12747o = i5;
        this.p = obj2;
        this.q = obj3;
        this.f12749s = obj4;
        this.f12748r = j5;
        this.t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12747o) {
            case 0:
                String str = (String) this.q;
                BinderC2238h0 binderC2238h0 = (BinderC2238h0) this.t;
                String str2 = (String) this.p;
                if (str2 != null) {
                    L0 l5 = new L0((String) this.f12749s, str2, this.f12748r);
                    j1 j1Var = binderC2238h0.f12695o;
                    j1Var.m().h();
                    String str3 = j1Var.f12715F;
                    if (str3 != null) {
                        str3.equals(str);
                    }
                    j1Var.f12715F = str;
                    j1Var.f12714E = l5;
                } else {
                    j1 j1Var2 = binderC2238h0.f12695o;
                    j1Var2.m().h();
                    String str4 = j1Var2.f12715F;
                    if (str4 == null || str4.equals(str)) {
                        j1Var2.f12715F = str;
                        j1Var2.f12714E = null;
                    }
                }
                break;
            case 1:
                Object obj = this.f12749s;
                ((C2267w0) this.t).r(this.f12748r, obj, (String) this.p, (String) this.q);
                break;
            default:
                Bundle bundle = (Bundle) this.p;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                K0 k3 = (K0) this.t;
                k3.v((L0) this.q, (L0) this.f12749s, this.f12748r, true, k3.g().v("screen_view", bundle, null, false));
                break;
        }
    }
}
