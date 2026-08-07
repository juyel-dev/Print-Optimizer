package p082t2;

import A.e;
import B0.d;
import T1.z;
import android.os.Bundle;
import java.util.Iterator;
import java.util.TreeSet;

/* JADX INFO: renamed from: t2.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2273z0 implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13007o = 0;
    public /* synthetic */ Bundle p;
    public /* synthetic */ C2267w0 q;

    public /* synthetic */ RunnableC2273z0() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13007o) {
            case 0:
                C2267w0 c2267w0 = this.q;
                Bundle bundle = this.p;
                if (bundle == null) {
                    c2267w0.f().f12560z.k(new Bundle());
                    break;
                } else {
                    Bundle bundleH = c2267w0.f().f12560z.h();
                    Iterator<String> it = bundle.keySet().iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        e eVar = c2267w0.f12885s;
                        C2236g0 c2236g0 = (C2236g0) c2267w0.f12783a;
                        if (!zHasNext) {
                            c2267w0.g();
                            int i5 = c2236g0.g.g().b0(201500000) ? 100 : 25;
                            if (bundleH.size() > i5) {
                                int i6 = 0;
                                for (String str : new TreeSet(bundleH.keySet())) {
                                    i6++;
                                    if (i6 > i5) {
                                        bundleH.remove(str);
                                    }
                                }
                                c2267w0.g();
                                n1.O(eVar, null, 26, null, null, 0);
                                c2267w0.j().f12476k.g("Too many default event parameters set. Discarding beyond event parameter limit");
                            }
                            c2267w0.f().f12560z.k(bundleH);
                            O0 o0S = c2236g0.s();
                            o0S.h();
                            o0S.o();
                            o0S.r(new d(14, o0S, o0S.D(false), bundleH, false));
                            break;
                        } else {
                            String next = it.next();
                            Object obj = bundle.get(next);
                            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                                c2267w0.g();
                                if (n1.S(obj)) {
                                    c2267w0.g();
                                    n1.O(eVar, null, 27, null, null, 0);
                                }
                                c2267w0.j().f12476k.h("Invalid default event parameter type. Name, value", next, obj);
                            } else if (n1.o0(next)) {
                                c2267w0.j().f12476k.f(next, "Invalid default event parameter name. Name");
                            } else if (obj == null) {
                                bundleH.remove(next);
                            } else if (c2267w0.g().W("param", next, c2236g0.g.l(null, false), obj)) {
                                c2267w0.g().D(bundleH, next, obj);
                            }
                        }
                    }
                }
                break;
            default:
                C2267w0 c2267w1 = this.q;
                c2267w1.h();
                c2267w1.o();
                Bundle bundle2 = this.p;
                String string = bundle2.getString("name");
                z.e(string);
                C2236g0 c2236g1 = (C2236g0) c2267w1.f12783a;
                if (!c2236g1.g()) {
                    c2267w1.j().f12479n.g("Conditional property not cleared since app measurement is disabled");
                } else {
                    k1 k1Var = new k1(0L, null, string, "");
                    try {
                        n1 n1VarG = c2267w1.g();
                        bundle2.getString("app_id");
                        c2236g1.s().t(new C2231e(bundle2.getString("app_id"), "", k1Var, bundle2.getLong("creation_timestamp"), bundle2.getBoolean("active"), bundle2.getString("trigger_event_name"), null, bundle2.getLong("trigger_timeout"), null, bundle2.getLong("time_to_live"), n1VarG.z(bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), "", bundle2.getLong("creation_timestamp"), true)));
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
                break;
        }
    }

    public RunnableC2273z0(C2267w0 c2267w0, Bundle bundle) {
        this.p = bundle;
        this.q = c2267w0;
    }
}
