package p033h3;

import D.j;
import W.AbstractComponentCallbacksC0170o;
import W.H;
import W.K;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.AC;
import com.google.android.gms.internal.ads.AbstractC1683sy;
import com.google.android.gms.internal.ads.C0715Cf;
import com.google.android.gms.internal.ads.C0785Od;
import com.google.android.gms.internal.ads.C0841Xf;
import com.google.android.gms.internal.ads.C0938bw;
import com.google.android.gms.internal.ads.C1036e7;
import com.google.android.gms.internal.ads.C1311kd;
import com.google.android.gms.internal.ads.C1578qg;
import com.google.android.gms.internal.ads.C1604r6;
import com.google.android.gms.internal.ads.C1648s6;
import com.google.android.gms.internal.ads.C1665sg;
import com.google.android.gms.internal.ads.C1708tf;
import com.google.android.gms.internal.ads.C1752uf;
import com.google.android.gms.internal.ads.C1840wf;
import com.google.android.gms.internal.ads.C1841wg;
import com.google.android.gms.internal.ads.C1962zC;
import com.google.android.gms.internal.ads.C1974zh;
import com.google.android.gms.internal.ads.CC;
import com.google.android.gms.internal.ads.Dp;
import com.google.android.gms.internal.ads.EC;
import com.google.android.gms.internal.ads.EnumC0889ar;
import com.google.android.gms.internal.ads.EnumC1561q6;
import com.google.android.gms.internal.ads.FC;
import com.google.android.gms.internal.ads.Gq;
import com.google.android.gms.internal.ads.H6;
import com.google.android.gms.internal.ads.I6;
import com.google.android.gms.internal.ads.InterfaceC1473o6;
import com.google.android.gms.internal.ads.Jr;
import com.google.android.gms.internal.ads.K6;
import com.google.android.gms.internal.ads.Kw;
import com.google.android.gms.internal.ads.L6;
import com.google.android.gms.internal.ads.Lo;
import com.google.android.gms.internal.ads.Lr;
import com.google.android.gms.internal.ads.Mr;
import com.google.android.gms.internal.ads.Sk;
import com.google.android.gms.internal.ads.X7;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p013c2.e;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements InterfaceC1473o6 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static r f11486s;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f11487o;
    public Object p;
    public Object q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f11488r;

    public r(C0715Cf c0715Cf, j jVar) {
        int i5 = 23;
        int i6 = 2;
        int i7 = 1;
        this.p = c0715Cf;
        this.f11487o = jVar;
        this.q = C1962zC.b(new Lo(c0715Cf.q, i6));
        Dp dp = new Dp(i7, jVar);
        Dp dp2 = new Dp(i6, jVar);
        Dp dp3 = new Dp(4, jVar);
        C1708tf c1708tf = c0715Cf.f3045c;
        C1962zC c1962zC = c0715Cf.e;
        new C1578qg(c1708tf, c1962zC, dp, dp2, dp3);
        Dp dp4 = new Dp(0, jVar);
        new C1311kd(c1708tf, dp4, 29);
        C1962zC c1962zC2 = c0715Cf.f3025K;
        new C1841wg(dp, c1708tf, c1962zC2, c1962zC, dp4);
        new C1752uf(c1708tf, 22);
        new C0841Xf(dp4, i5);
        new C1840wf(c1962zC, c1708tf, 7);
        new C1578qg(c1962zC2, (AC) new Dp(3, jVar), (AC) dp3, (AC) dp4, c1962zC, 19);
        new C1665sg((EC) dp4, (EC) c1962zC2, (EC) c1962zC, 25);
        Dp dp5 = new Dp(5, jVar);
        C1962zC c1962zCB = C1962zC.b(Sk.f5683d);
        C1962zC c1962zCB2 = C1962zC.b(Sk.f5682c);
        C1962zC c1962zCB3 = C1962zC.b(Sk.e);
        C1962zC c1962zCB4 = C1962zC.b(Sk.f5684f);
        int i8 = CC.f2997b;
        LinkedHashMap linkedHashMapP = AbstractC1683sy.p(4);
        EnumC0889ar enumC0889ar = EnumC0889ar.GMS_SIGNALS;
        AbstractC1683sy.h(c1962zCB, "provider");
        linkedHashMapP.put(enumC0889ar, c1962zCB);
        EnumC0889ar enumC0889ar2 = EnumC0889ar.BUILD_URL;
        AbstractC1683sy.h(c1962zCB2, "provider");
        linkedHashMapP.put(enumC0889ar2, c1962zCB2);
        EnumC0889ar enumC0889ar3 = EnumC0889ar.HTTP;
        AbstractC1683sy.h(c1962zCB3, "provider");
        linkedHashMapP.put(enumC0889ar3, c1962zCB3);
        EnumC0889ar enumC0889ar4 = EnumC0889ar.PRE_PROCESS;
        AbstractC1683sy.h(c1962zCB4, "provider");
        linkedHashMapP.put(enumC0889ar4, c1962zCB4);
        C1962zC c1962zCB5 = C1962zC.b(new C1665sg(dp5, c0715Cf.f3045c, new CC(linkedHashMapP)));
        int i9 = FC.f3545c;
        List listEmptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(c1962zCB5);
        this.f11488r = C1962zC.b(new Gq(c0715Cf.e, new C1974zh(new FC(listEmptyList, arrayList), i5), i7));
    }

    public static synchronized r h() {
        try {
            if (f11486s == null) {
                f11486s = new r(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f11486s;
    }

    public static r m(Jr jr, Lr lr, Mr mr, Mr mr2) {
        if (mr == Mr.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        Jr jr2 = Jr.DEFINED_BY_JAVASCRIPT;
        Mr mr3 = Mr.NATIVE;
        if (jr == jr2 && mr == mr3) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (lr == Lr.DEFINED_BY_JAVASCRIPT && mr == mr3) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        r rVar = new r();
        rVar.q = jr;
        rVar.f11488r = lr;
        rVar.f11487o = mr;
        rVar.p = mr2;
        return rVar;
    }

    public static JSONObject p(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", C0785Od.g().f5227o);
            jSONObject.put("mf", X7.f6166a.p());
            jSONObject.put("cl", "610756093");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", e.d(context, ModuleDescriptor.MODULE_ID, false));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public void a(AbstractComponentCallbacksC0170o abstractComponentCallbacksC0170o) {
        if (((ArrayList) this.f11487o).contains(abstractComponentCallbacksC0170o)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0170o);
        }
        synchronized (((ArrayList) this.f11487o)) {
            ((ArrayList) this.f11487o).add(abstractComponentCallbacksC0170o);
        }
        abstractComponentCallbacksC0170o.f1594y = true;
    }

    public AbstractComponentCallbacksC0170o b(String str) {
        K k3 = (K) ((HashMap) this.p).get(str);
        if (k3 != null) {
            return k3.f1489c;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1473o6
    public void c(K6 k6) {
        C1604r6 c1604r6 = (C1604r6) ((L6) k6.p).v().h();
        c1604r6.d();
        C1648s6.x((C1648s6) c1604r6.p, (EnumC1561q6) this.p);
        k6.d();
        L6.D((L6) k6.p, (C1648s6) c1604r6.b());
        H6 h6 = (H6) ((L6) k6.p).w().h();
        h6.d();
        I6.w((I6) h6.p, (String) this.f11487o);
        C1036e7 c1036e7 = (C1036e7) this.q;
        h6.d();
        I6.x((I6) h6.p, c1036e7);
        k6.d();
        L6.C((L6) k6.p, (I6) h6.b());
        k6.d();
        L6.z((L6) k6.p, (String) this.f11488r);
    }

    public AbstractComponentCallbacksC0170o d(String str) {
        for (K k3 : ((HashMap) this.p).values()) {
            if (k3 != null) {
                AbstractComponentCallbacksC0170o abstractComponentCallbacksC0170oD = k3.f1489c;
                if (!str.equals(abstractComponentCallbacksC0170oD.f1590s)) {
                    abstractComponentCallbacksC0170oD = abstractComponentCallbacksC0170oD.f1564H.f1450c.d(str);
                }
                if (abstractComponentCallbacksC0170oD != null) {
                    return abstractComponentCallbacksC0170oD;
                }
            }
        }
        return null;
    }

    public ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (K k3 : ((HashMap) this.p).values()) {
            if (k3 != null) {
                arrayList.add(k3);
            }
        }
        return arrayList;
    }

    public ArrayList f() {
        ArrayList arrayList = new ArrayList();
        for (K k3 : ((HashMap) this.p).values()) {
            if (k3 != null) {
                arrayList.add(k3.f1489c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List g() {
        ArrayList arrayList;
        if (((ArrayList) this.f11487o).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f11487o)) {
            arrayList = new ArrayList((ArrayList) this.f11487o);
        }
        return arrayList;
    }

    public boolean i(Context context) {
        if (((Boolean) this.q) == null) {
            this.q = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.p).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.q).booleanValue();
    }

    public boolean j(Context context) {
        if (((Boolean) this.p) == null) {
            this.p = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.p).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.p).booleanValue();
    }

    public void k(K k3) {
        AbstractComponentCallbacksC0170o abstractComponentCallbacksC0170o = k3.f1489c;
        String str = abstractComponentCallbacksC0170o.f1590s;
        HashMap map = (HashMap) this.p;
        if (map.get(str) != null) {
            return;
        }
        map.put(abstractComponentCallbacksC0170o.f1590s, k3);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0170o);
        }
    }

    public void l(K k3) {
        AbstractComponentCallbacksC0170o abstractComponentCallbacksC0170o = k3.f1489c;
        if (abstractComponentCallbacksC0170o.f1571O) {
            ((H) this.f11488r).g(abstractComponentCallbacksC0170o);
        }
        if (((K) ((HashMap) this.p).put(abstractComponentCallbacksC0170o.f1590s, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0170o);
        }
    }

    public void n() {
        this.p = 12;
    }

    public void o(int i5) throws InvalidAlgorithmParameterException {
        if (i5 != 16 && i5 != 24 && i5 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i5)));
        }
        this.f11487o = Integer.valueOf(i5);
    }

    public void q() {
        this.q = 16;
    }

    public Kw r() throws GeneralSecurityException {
        Integer num = (Integer) this.f11487o;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (((Integer) this.p) == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (((Integer) this.q) == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        ((Integer) this.p).getClass();
        ((Integer) this.q).getClass();
        return new Kw(iIntValue, (C0938bw) this.f11488r);
    }

    public r(int i5) {
        switch (i5) {
            case 1:
                this.f11487o = new ArrayList();
                this.p = new HashMap();
                this.q = new HashMap();
                break;
            case 8:
                this.f11487o = null;
                this.p = null;
                this.q = null;
                this.f11488r = C0938bw.f6790y;
                break;
            default:
                this.f11487o = null;
                this.p = null;
                this.q = null;
                this.f11488r = new ArrayDeque();
                break;
        }
    }
}
