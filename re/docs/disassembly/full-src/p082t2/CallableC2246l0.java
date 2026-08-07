package p082t2;

import E1.p;
import F0.h;
import J2.b;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC0773Md;
import com.google.android.gms.internal.ads.AbstractC1528pa;
import com.google.android.gms.internal.ads.AbstractC1678st;
import com.google.android.gms.internal.ads.C0785Od;
import com.google.android.gms.internal.ads.C0789Pb;
import com.google.android.gms.internal.ads.C0797Qd;
import com.google.android.gms.internal.ads.C0880ai;
import com.google.android.gms.internal.ads.C1010dh;
import com.google.android.gms.internal.ads.C1019dr;
import com.google.android.gms.internal.ads.C1310kc;
import com.google.android.gms.internal.ads.C1354lc;
import com.google.android.gms.internal.ads.C1362lk;
import com.google.android.gms.internal.ads.C1452nm;
import com.google.android.gms.internal.ads.C1505ov;
import com.google.android.gms.internal.ads.C1715tm;
import com.google.android.gms.internal.ads.C1759um;
import com.google.android.gms.internal.ads.C1957z7;
import com.google.android.gms.internal.ads.E9;
import com.google.android.gms.internal.ads.EnumC0889ar;
import com.google.android.gms.internal.ads.Gv;
import com.google.android.gms.internal.ads.Iv;
import com.google.android.gms.internal.ads.RunnableC1676sr;
import com.google.android.gms.internal.ads.RunnableC1764ur;
import com.google.android.gms.internal.ads.Zq;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p085u1.k;

/* JADX INFO: renamed from: t2.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class CallableC2246l0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12760d;
    public final /* synthetic */ Object e;

    public /* synthetic */ CallableC2246l0(C1010dh c1010dh, b bVar, C1505ov c1505ov, Zq zq) {
        this.f12757a = 4;
        this.f12758b = c1010dh;
        this.f12759c = bVar;
        this.f12760d = c1505ov;
        this.e = zq;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f12757a) {
            case 0:
                BinderC2238h0 binderC2238h0 = (BinderC2238h0) this.e;
                binderC2238h0.f12695o.V();
                C2243k c2243k = binderC2238h0.f12695o.f12719c;
                j1.w(c2243k);
                return c2243k.T((String) this.f12758b, (String) this.f12759c, (String) this.f12760d);
            case 1:
                BinderC2238h0 binderC2238h1 = (BinderC2238h0) this.e;
                binderC2238h1.f12695o.V();
                C2243k c2243k2 = binderC2238h1.f12695o.f12719c;
                j1.w(c2243k2);
                return c2243k2.A((String) this.f12758b, (String) this.f12759c, (String) this.f12760d);
            case 2:
                BinderC2238h0 binderC2238h2 = (BinderC2238h0) this.e;
                binderC2238h2.f12695o.V();
                C2243k c2243k3 = binderC2238h2.f12695o.f12719c;
                j1.w(c2243k3);
                return c2243k3.T((String) this.f12758b, (String) this.f12759c, (String) this.f12760d);
            case 3:
                BinderC2238h0 binderC2238h3 = (BinderC2238h0) this.e;
                binderC2238h3.f12695o.V();
                C2243k c2243k4 = binderC2238h3.f12695o.f12719c;
                j1.w(c2243k4);
                return c2243k4.A((String) this.f12758b, (String) this.f12759c, (String) this.f12760d);
            default:
                C1010dh c1010dh = (C1010dh) this.f12758b;
                c1010dh.getClass();
                C1310kc c1310kc = (C1310kc) ((b) this.f12759c).get();
                JSONObject jSONObject = (JSONObject) ((C1505ov) this.f12760d).get();
                C1354lc c1354lc = (C1354lc) ((Zq) this.e).q.get();
                C1957z7 c1957z7 = c1010dh.f6975n;
                ((C0880ai) c1957z7.f10261a).L(c1310kc);
                Context context = (Context) c1957z7.f10265f;
                C1759um c1759um = new C1759um(c1310kc.u, (RunnableC1676sr) c1957z7.f10266h, AbstractC0773Md.d(context, 9));
                EnumC0889ar enumC0889ar = EnumC0889ar.PREPARE_HTTP_REQUEST;
                Iv ivM0 = AbstractC1678st.m0(new C1715tm(jSONObject, c1354lc));
                C1019dr c1019dr = (C1019dr) c1957z7.f10263c;
                Zq zqA = c1019dr.b(ivM0, enumC0889ar).m(c1759um).a();
                p pVar = new p(3, c1957z7, c1310kc);
                C0797Qd c0797Qd = (C0797Qd) c1957z7.f10267i;
                Zq zqA2 = c1019dr.b(AbstractC1678st.r0(zqA, pVar, c0797Qd), EnumC0889ar.PROXY).o(new E9((h) c1957z7.f10262b, 15)).a();
                C1505ov c1505ovS0 = AbstractC1678st.s0(c1019dr.b(zqA2, EnumC0889ar.PRE_PROCESS).m(new C0789Pb(21, jSONObject, c1354lc)).o(k.f13311A.p.c(context, (C0785Od) c1957z7.e, (RunnableC1764ur) c1957z7.g).a("google.afma.response.normalize", C1452nm.f8442d, AbstractC1528pa.f8714c)).a(), new E9(c1957z7, 16), c0797Qd);
                c1505ovS0.a(new Gv(0, c1505ovS0, new C1362lk(c1957z7, 7)), c0797Qd);
                return c1505ovS0;
        }
    }

    public /* synthetic */ CallableC2246l0(BinderC2238h0 binderC2238h0, String str, String str2, String str3, int i5) {
        this.f12757a = i5;
        this.f12758b = str;
        this.f12759c = str2;
        this.f12760d = str3;
        this.e = binderC2238h0;
    }
}
