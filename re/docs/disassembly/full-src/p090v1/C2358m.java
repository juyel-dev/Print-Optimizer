package p090v1;

import B3.e;
import D.j;
import F0.h;
import M0.f;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonWriter;
import android.view.MotionEvent;
import androidx.lifecycle.X;
import androidx.lifecycle.b0;
import com.google.android.gms.internal.ads.AbstractC1223ib;
import com.google.android.gms.internal.ads.AbstractC1257jA;
import com.google.android.gms.internal.ads.AbstractC1683sy;
import com.google.android.gms.internal.ads.AbstractC1869x7;
import com.google.android.gms.internal.ads.C0715Cf;
import com.google.android.gms.internal.ads.C0743Hd;
import com.google.android.gms.internal.ads.C0761Kd;
import com.google.android.gms.internal.ads.C0841Xf;
import com.google.android.gms.internal.ads.C1171hA;
import com.google.android.gms.internal.ads.C1412mq;
import com.google.android.gms.internal.ads.C1453nn;
import com.google.android.gms.internal.ads.C1500oq;
import com.google.android.gms.internal.ads.C1631rq;
import com.google.android.gms.internal.ads.C1665sg;
import com.google.android.gms.internal.ads.C1682sx;
import com.google.android.gms.internal.ads.C1693t7;
import com.google.android.gms.internal.ads.C1695t9;
import com.google.android.gms.internal.ads.C1739u9;
import com.google.android.gms.internal.ads.C1770ux;
import com.google.android.gms.internal.ads.C1783v9;
import com.google.android.gms.internal.ads.C1866x4;
import com.google.android.gms.internal.ads.C1910y4;
import com.google.android.gms.internal.ads.C1962zC;
import com.google.android.gms.internal.ads.C1974zh;
import com.google.android.gms.internal.ads.CC;
import com.google.android.gms.internal.ads.EnumC0889ar;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.FC;
import com.google.android.gms.internal.ads.Fs;
import com.google.android.gms.internal.ads.Fv;
import com.google.android.gms.internal.ads.Gq;
import com.google.android.gms.internal.ads.InterfaceC0755Jd;
import com.google.android.gms.internal.ads.InterfaceC0828Ve;
import com.google.android.gms.internal.ads.Jm;
import com.google.android.gms.internal.ads.Jx;
import com.google.android.gms.internal.ads.Lo;
import com.google.android.gms.internal.ads.Lx;
import com.google.android.gms.internal.ads.Rx;
import com.google.android.gms.internal.ads.S6;
import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC1781v7;
import com.google.android.gms.internal.ads.Sk;
import com.google.android.gms.internal.ads.Sx;
import com.google.android.gms.internal.ads.U9;
import com.google.android.gms.internal.ads.Um;
import com.google.android.gms.internal.ads.Vx;
import com.google.android.gms.internal.ads.Wx;
import com.google.android.gms.internal.ads.Xm;
import com.google.android.gms.internal.ads.Xx;
import com.google.android.gms.internal.ads.Yq;
import com.google.android.gms.internal.measurement.C2035h;
import com.google.android.gms.internal.measurement.C2078p;
import com.google.android.gms.internal.measurement.C2097t;
import com.google.android.gms.internal.measurement.C2109v1;
import com.google.android.gms.internal.measurement.C2115w2;
import com.google.android.gms.internal.measurement.C2117x;
import com.google.android.gms.internal.measurement.CallableC2074o0;
import com.google.android.gms.internal.measurement.H;
import com.google.android.gms.internal.measurement.InterfaceC2073o;
import com.google.android.gms.internal.measurement.J1;
import com.google.android.gms.internal.measurement.J4;
import com.google.android.gms.internal.measurement.r;
import com.notescrafter.MainActivity;
import com.notescrafter.PrintOrderViewModel;
import com.razorpay.AppSignatureHelper;
import java.io.IOException;
import java.net.URISyntaxException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.C2167f;
import kotlin.jvm.internal.o;
import p005b.a;
import p005b.c;
import p011c0.d;
import p083t3.C2286g;
import p085u1.k;
import p105y1.B;
import p111z2.b;

/* JADX INFO: renamed from: v1.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2358m implements e, Fv, InterfaceC0755Jd, Yq {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f13471o;
    public final Object p;
    public final Object q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f13472r;

    public C2358m(C1783v9 c1783v9, InterfaceC2334a interfaceC2334a, Map map, String str) {
        this.f13471o = interfaceC2334a;
        this.p = map;
        this.q = str;
        this.f13472r = c1783v9;
    }

    public static String n(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        C1866x4 c1866x4V = C1910y4.v();
        c1866x4V.d();
        C1910y4.y((C1910y4) c1866x4V.p);
        C1171hA c1171hAD = AbstractC1257jA.D(bArr, 0, bArr.length);
        c1866x4V.d();
        C1910y4.w((C1910y4) c1866x4V.p, c1171hAD);
        return Base64.encodeToString(((C1910y4) c1866x4V.b()).e(), 11);
    }

    public static void q(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        C2362o c2362o = C2362o.f13474f;
        C0743Hd c0743Hd = c2362o.f13475a;
        String str2 = c2362o.f13478d.f5227o;
        c0743Hd.getClass();
        C0743Hd.k(context, str2, bundle, new S6(c0743Hd));
    }

    @Override // com.google.android.gms.internal.ads.Yq
    /* JADX INFO: renamed from: a */
    public void mo6691a() {
        ((Xm) ((C1453nn) this.f13471o).f8448c).a((C1631rq) this.p, (C1412mq) this.q, (Um) this.f13472r);
    }

    public void b(String str) {
        Bundle bundle = new Bundle();
        synchronized (this.f13471o) {
            try {
                try {
                    ((a) ((c) this.p)).c0((p043k.c) this.q, str, bundle);
                } catch (RemoteException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public InterfaceC2073o c(h hVar, C2109v1... c2109v1Arr) {
        InterfaceC2073o interfaceC2073oB = InterfaceC2073o.e;
        for (C2109v1 c2109v1 : c2109v1Arr) {
            interfaceC2073oB = J1.b(c2109v1);
            J1.g((h) this.q);
            if ((interfaceC2073oB instanceof r) || (interfaceC2073oB instanceof C2078p)) {
                interfaceC2073oB = ((C2117x) this.f13471o).p(hVar, interfaceC2073oB);
            }
        }
        return interfaceC2073oB;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0755Jd
    public void d(JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value((String) this.f13471o);
        jsonWriter.name("verb").value((String) this.p);
        jsonWriter.endObject();
        C0761Kd.e(jsonWriter, (Map) this.q);
        byte[] bArr = (byte[]) this.f13472r;
        if (bArr != null) {
            jsonWriter.name("body").value(Base64.encodeToString(bArr, 0));
        }
        jsonWriter.endObject();
    }

    public void e(C1682sx c1682sx) throws GeneralSecurityException {
        c1682sx.getClass();
        Vx vx = new Vx(Rx.class, c1682sx.f9153a);
        HashMap map = (HashMap) this.p;
        if (!map.containsKey(vx)) {
            map.put(vx, c1682sx);
            return;
        }
        C1682sx c1682sx2 = (C1682sx) map.get(vx);
        if (!c1682sx2.equals(c1682sx) || !c1682sx.equals(c1682sx2)) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(vx.toString()));
        }
    }

    public void f(C1770ux c1770ux) throws GeneralSecurityException {
        Wx wx = new Wx(c1770ux.f9386a, Rx.class);
        HashMap map = (HashMap) this.f13471o;
        if (!map.containsKey(wx)) {
            map.put(wx, c1770ux);
            return;
        }
        C1770ux c1770ux2 = (C1770ux) map.get(wx);
        if (!c1770ux2.equals(c1770ux) || !c1770ux.equals(c1770ux2)) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(wx.toString()));
        }
    }

    public void g(Jx jx) throws GeneralSecurityException {
        jx.getClass();
        Vx vx = new Vx(Sx.class, jx.f4402a);
        HashMap map = (HashMap) this.f13472r;
        if (!map.containsKey(vx)) {
            map.put(vx, jx);
            return;
        }
        Jx jx2 = (Jx) map.get(vx);
        if (!jx2.equals(jx) || !jx.equals(jx2)) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(vx.toString()));
        }
    }

    @Override // B3.e
    public Object getValue() {
        X x4 = (X) this.f13472r;
        if (x4 != null) {
            return x4;
        }
        b0 b0VarE = ((C2286g) this.p).p.e();
        int i5 = MainActivity.f10854N;
        d factory = PrintOrderViewModel.f10861f0;
        p011c0.e eVarC = ((C2286g) this.q).p.c();
        o.f(factory, "factory");
        p036i2.e eVar = new p036i2.e(b0VarE, factory, eVarC);
        C2167f c2167f = (C2167f) this.f13471o;
        String strL = b.l(c2167f);
        if (strL == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        X xQ = eVar.q(c2167f, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strL));
        this.f13472r = xQ;
        return xQ;
    }

    public synchronized void h(MotionEvent motionEvent) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            HashMap map = new HashMap();
            map.put("t", new Throwable());
            map.put("aid", null);
            map.put("evt", motionEvent);
            this.f13471o.getClass().getDeclaredMethod("he", Map.class).invoke(this.f13471o, map);
            ((P0.c) this.f13472r).n(3003, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e) {
            throw new Fs(2005, e);
        }
    }

    public void i(Lx lx) throws GeneralSecurityException {
        Wx wx = new Wx(lx.f4786a, Sx.class);
        HashMap map = (HashMap) this.q;
        if (!map.containsKey(wx)) {
            map.put(wx, lx);
            return;
        }
        Lx lx2 = (Lx) map.get(wx);
        if (!lx2.equals(lx) || !lx.equals(lx2)) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(wx.toString()));
        }
    }

    public synchronized int j() {
        try {
        } catch (Exception e) {
            throw new Fs(2006, e);
        }
        return ((Integer) this.f13471o.getClass().getDeclaredMethod("lcs", null).invoke(this.f13471o, null)).intValue();
    }

    public synchronized void k() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f13471o.getClass().getDeclaredMethod("close", null).invoke(this.f13471o, null);
            ((P0.c) this.f13472r).n(3001, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e) {
            throw new Fs(2003, e);
        }
    }

    public synchronized boolean l() {
        try {
        } catch (Exception e) {
            throw new Fs(2001, e);
        }
        return ((Boolean) this.f13471o.getClass().getDeclaredMethod("init", null).invoke(this.f13471o, null)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:95:0x02b8  */
    @Override // com.google.android.gms.internal.ads.Fv
    /* JADX INFO: renamed from: m */
    public void mo6681m(Object obj) {
        boolean z3;
        String str;
        String string = (String) obj;
        C1783v9 c1783v9 = (C1783v9) this.f13472r;
        c1783v9.getClass();
        InterfaceC2334a interfaceC2334a = (InterfaceC2334a) this.f13471o;
        InterfaceC0828Ve interfaceC0828Ve = (InterfaceC0828Ve) interfaceC2334a;
        C1412mq c1412mqV = interfaceC0828Ve.v();
        C1500oq c1500oqG0 = interfaceC0828Ve.g0();
        boolean z4 = false;
        if (c1412mqV == null || c1500oqG0 == null) {
            z3 = false;
            str = "";
        } else {
            String str2 = c1500oqG0.f8652b;
            z3 = c1412mqV.f8331i0;
            str = str2;
        }
        C1693t7 c1693t7 = AbstractC1869x7.o9;
        C2366q c2366q = C2366q.f13480d;
        boolean zBooleanValue = ((Boolean) c2366q.f13483c.a(c1693t7)).booleanValue();
        Map map = (Map) this.p;
        boolean z5 = (zBooleanValue && map.containsKey("sc") && ((String) map.get("sc")).equals("0")) ? false : true;
        String str3 = (String) this.q;
        if ("expand".equalsIgnoreCase(str3)) {
            if (interfaceC0828Ve.D0()) {
                AbstractC1223ib.s("Cannot expand WebView that is already expanded.");
                return;
            } else {
                c1783v9.f(false);
                interfaceC0828Ve.N0(C1783v9.a(map), "1".equals(map.get("custom_close")), z5);
                return;
            }
        }
        boolean zEqualsIgnoreCase = "webapp".equalsIgnoreCase(str3);
        SharedPreferencesOnSharedPreferenceChangeListenerC1781v7 sharedPreferencesOnSharedPreferenceChangeListenerC1781v7 = c2366q.f13483c;
        if (zEqualsIgnoreCase) {
            c1783v9.f(false);
            boolean z6 = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1781v7.a(AbstractC1869x7.pa)).booleanValue() && Objects.equals(map.get("is_allowed_for_lock_screen"), "1");
            if (string != null) {
                interfaceC0828Ve.M0("1".equals(map.get("custom_close")), C1783v9.a(map), string, z5, z6);
                return;
            } else {
                interfaceC0828Ve.T0("1".equals(map.get("custom_close")), C1783v9.a(map), (String) map.get("html"), (String) map.get("baseurl"), z5);
                return;
            }
        }
        boolean zEqualsIgnoreCase2 = "chrome_custom_tab".equalsIgnoreCase(str3);
        Jm jm = c1783v9.t;
        if (zEqualsIgnoreCase2) {
            interfaceC0828Ve.getContext();
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1781v7.a(AbstractC1869x7.f9770U3)).booleanValue()) {
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1781v7.a(AbstractC1869x7.f9790Y3)).booleanValue()) {
                    B.w("User opt out chrome custom tab.");
                } else {
                    z4 = true;
                }
            }
            boolean zA = F7.a(interfaceC0828Ve.getContext());
            if (z4) {
                if (zA) {
                    c1783v9.f(true);
                    if (TextUtils.isEmpty(string)) {
                        AbstractC1223ib.s("Cannot open browser with null or empty url");
                        c1783v9.h(7);
                        return;
                    }
                    Uri uriC = C1783v9.c(C1783v9.b(interfaceC0828Ve.getContext(), interfaceC0828Ve.n0(), Uri.parse(string), interfaceC0828Ve.M(), interfaceC0828Ve.f(), interfaceC0828Ve.m0()));
                    if (z3 && jm != null && c1783v9.g(interfaceC2334a, interfaceC0828Ve.getContext(), uriC.toString(), str)) {
                        return;
                    }
                    c1783v9.f9415v = new C1695t9(c1783v9);
                    interfaceC0828Ve.H0(new p100x1.d(null, uriC.toString(), null, null, null, null, null, null, new p008b2.b(c1783v9.f9415v), true), z5);
                    return;
                }
                c1783v9.h(4);
            }
            map.put("use_first_package", "true");
            map.put("use_running_process", "true");
            c1783v9.e(interfaceC2334a, map, z3, str, z5);
            return;
        }
        if ("app".equalsIgnoreCase(str3) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            c1783v9.e(interfaceC2334a, map, z3, str, z5);
            return;
        }
        if ("open_app".equalsIgnoreCase(str3)) {
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1781v7.a(AbstractC1869x7.j7)).booleanValue()) {
                c1783v9.f(true);
                String str4 = (String) map.get("p");
                if (str4 == null) {
                    AbstractC1223ib.s("Package name missing from open app action.");
                    return;
                }
                if (z3 && jm != null && c1783v9.g(interfaceC2334a, interfaceC0828Ve.getContext(), str4, str)) {
                    return;
                }
                PackageManager packageManager = interfaceC0828Ve.getContext().getPackageManager();
                if (packageManager == null) {
                    AbstractC1223ib.s("Cannot get package manager from open app action.");
                    return;
                }
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str4);
                if (launchIntentForPackage != null) {
                    interfaceC0828Ve.H0(new p100x1.d(launchIntentForPackage, c1783v9.f9415v), z5);
                    return;
                }
                return;
            }
            return;
        }
        c1783v9.f(true);
        String str5 = (String) map.get("intent_url");
        Intent uri = null;
        if (!TextUtils.isEmpty(str5)) {
            try {
                uri = Intent.parseUri(str5, 0);
            } catch (URISyntaxException e) {
                AbstractC1223ib.q("Error parsing the url: ".concat(String.valueOf(str5)), e);
            }
        }
        Intent intent = uri;
        if (intent != null && intent.getData() != null) {
            Uri data = intent.getData();
            if (!Uri.EMPTY.equals(data)) {
                Uri uriC2 = C1783v9.c(C1783v9.b(interfaceC0828Ve.getContext(), interfaceC0828Ve.n0(), data, interfaceC0828Ve.M(), interfaceC0828Ve.f(), interfaceC0828Ve.m0()));
                if (TextUtils.isEmpty(intent.getType())) {
                    intent.setData(uriC2);
                } else {
                    if (((Boolean) C2366q.f13480d.f13483c.a(AbstractC1869x7.k7)).booleanValue()) {
                        intent.setDataAndType(uriC2, intent.getType());
                    } else {
                        intent.setData(uriC2);
                    }
                }
            }
        }
        boolean z7 = ((Boolean) C2366q.f13480d.f13483c.a(AbstractC1869x7.B7)).booleanValue() && "intent_async".equalsIgnoreCase(str3) && map.containsKey("event_id");
        HashMap map2 = new HashMap();
        if (z7) {
            c1783v9.f9415v = new C1739u9(z5, interfaceC2334a, map2, map);
            z5 = false;
        }
        if (intent != null) {
            if (!z3 || jm == null || !c1783v9.g(interfaceC2334a, interfaceC0828Ve.getContext(), intent.getData().toString(), str)) {
                interfaceC0828Ve.H0(new p100x1.d(intent, c1783v9.f9415v), z5);
                return;
            } else {
                if (z7) {
                    map2.put((String) map.get("event_id"), Boolean.TRUE);
                    ((U9) interfaceC2334a).i("openIntentAsync", map2);
                    return;
                }
                return;
            }
        }
        if (!TextUtils.isEmpty(string)) {
            string = C1783v9.c(C1783v9.b(interfaceC0828Ve.getContext(), interfaceC0828Ve.n0(), Uri.parse(string), interfaceC0828Ve.M(), interfaceC0828Ve.f(), interfaceC0828Ve.m0())).toString();
        }
        if (!z3 || jm == null || !c1783v9.g(interfaceC2334a, interfaceC0828Ve.getContext(), string, str)) {
            interfaceC0828Ve.H0(new p100x1.d((String) map.get("i"), string, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e"), c1783v9.f9415v), z5);
        } else if (z7) {
            map2.put((String) map.get("event_id"), Boolean.TRUE);
            ((U9) interfaceC2334a).i("openIntentAsync", map2);
        }
    }

    @Override // com.google.android.gms.internal.ads.Fv
    public void o(Throwable th) {
        k.f13311A.g.g("OpenGmsgHandler.attributionReportingManager", th);
    }

    public synchronized byte[] p(HashMap map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            ((P0.c) this.f13472r).m(2007, System.currentTimeMillis() - jCurrentTimeMillis, e);
            return null;
        }
        return (byte[]) this.f13471o.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.f13471o, null, map);
    }

    public C2358m(C0715Cf c0715Cf, j jVar) {
        this.p = c0715Cf;
        this.f13471o = jVar;
        this.q = C1962zC.b(new Lo(c0715Cf.q, 2));
        C0841Xf c0841Xf = new C0841Xf(jVar, 22);
        C1962zC c1962zCB = C1962zC.b(Sk.f5683d);
        C1962zC c1962zCB2 = C1962zC.b(Sk.f5682c);
        C1962zC c1962zCB3 = C1962zC.b(Sk.e);
        C1962zC c1962zCB4 = C1962zC.b(Sk.f5684f);
        int i5 = CC.f2997b;
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
        C1962zC c1962zCB5 = C1962zC.b(new C1665sg(c0841Xf, c0715Cf.f3045c, new CC(linkedHashMapP)));
        int i6 = FC.f3545c;
        List listEmptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(c1962zCB5);
        C1974zh c1974zh = new C1974zh(new FC(listEmptyList, arrayList), 23);
        this.f13472r = C1962zC.b(new Gq(c0715Cf.e, c1974zh, 1));
    }

    public /* synthetic */ C2358m(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f13471o = obj;
        this.p = obj2;
        this.q = obj3;
        this.f13472r = obj4;
    }

    public C2358m(int i5) {
        switch (i5) {
            case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                C2117x c2117x = new C2117x(0);
                c2117x.p = new HashMap();
                c2117x.q = new C2097t(6);
                C2097t c2097t = new C2097t(0);
                ArrayList arrayList = c2097t.f10785a;
                arrayList.add(H.BITWISE_AND);
                arrayList.add(H.BITWISE_LEFT_SHIFT);
                arrayList.add(H.BITWISE_NOT);
                arrayList.add(H.BITWISE_OR);
                arrayList.add(H.BITWISE_RIGHT_SHIFT);
                arrayList.add(H.BITWISE_UNSIGNED_RIGHT_SHIFT);
                arrayList.add(H.BITWISE_XOR);
                c2117x.r(c2097t);
                C2097t c2097t2 = new C2097t(1);
                ArrayList arrayList2 = c2097t2.f10785a;
                arrayList2.add(H.EQUALS);
                arrayList2.add(H.GREATER_THAN);
                arrayList2.add(H.GREATER_THAN_EQUALS);
                arrayList2.add(H.IDENTITY_EQUALS);
                arrayList2.add(H.IDENTITY_NOT_EQUALS);
                arrayList2.add(H.LESS_THAN);
                arrayList2.add(H.LESS_THAN_EQUALS);
                arrayList2.add(H.NOT_EQUALS);
                c2117x.r(c2097t2);
                C2097t c2097t3 = new C2097t(2);
                ArrayList arrayList3 = c2097t3.f10785a;
                arrayList3.add(H.APPLY);
                arrayList3.add(H.BLOCK);
                arrayList3.add(H.BREAK);
                arrayList3.add(H.CASE);
                arrayList3.add(H.DEFAULT);
                arrayList3.add(H.CONTINUE);
                arrayList3.add(H.DEFINE_FUNCTION);
                arrayList3.add(H.FN);
                arrayList3.add(H.IF);
                arrayList3.add(H.QUOTE);
                arrayList3.add(H.RETURN);
                arrayList3.add(H.SWITCH);
                arrayList3.add(H.TERNARY);
                c2117x.r(c2097t3);
                C2097t c2097t4 = new C2097t(3);
                ArrayList arrayList4 = c2097t4.f10785a;
                arrayList4.add(H.AND);
                arrayList4.add(H.NOT);
                arrayList4.add(H.OR);
                c2117x.r(c2097t4);
                C2097t c2097t5 = new C2097t(4);
                ArrayList arrayList5 = c2097t5.f10785a;
                arrayList5.add(H.FOR_IN);
                arrayList5.add(H.FOR_IN_CONST);
                arrayList5.add(H.FOR_IN_LET);
                arrayList5.add(H.FOR_LET);
                arrayList5.add(H.FOR_OF);
                arrayList5.add(H.FOR_OF_CONST);
                arrayList5.add(H.FOR_OF_LET);
                arrayList5.add(H.WHILE);
                c2117x.r(c2097t5);
                C2097t c2097t6 = new C2097t(5);
                ArrayList arrayList6 = c2097t6.f10785a;
                arrayList6.add(H.ADD);
                arrayList6.add(H.DIVIDE);
                arrayList6.add(H.MODULUS);
                arrayList6.add(H.MULTIPLY);
                arrayList6.add(H.NEGATE);
                arrayList6.add(H.POST_DECREMENT);
                arrayList6.add(H.POST_INCREMENT);
                arrayList6.add(H.PRE_DECREMENT);
                arrayList6.add(H.PRE_INCREMENT);
                arrayList6.add(H.SUBTRACT);
                c2117x.r(c2097t6);
                C2097t c2097t7 = new C2097t(7);
                ArrayList arrayList7 = c2097t7.f10785a;
                arrayList7.add(H.ASSIGN);
                arrayList7.add(H.CONST);
                arrayList7.add(H.CREATE_ARRAY);
                arrayList7.add(H.CREATE_OBJECT);
                arrayList7.add(H.EXPRESSION_LIST);
                arrayList7.add(H.GET);
                arrayList7.add(H.GET_INDEX);
                arrayList7.add(H.GET_PROPERTY);
                arrayList7.add(H.NULL);
                arrayList7.add(H.SET_PROPERTY);
                arrayList7.add(H.TYPEOF);
                arrayList7.add(H.UNDEFINED);
                arrayList7.add(H.VAR);
                c2117x.r(c2097t7);
                this.f13471o = c2117x;
                h hVar = new h(null, c2117x);
                this.q = hVar;
                this.p = hVar.b();
                C2115w2 c2115w2 = new C2115w2();
                c2115w2.f10802o = new HashMap();
                this.f13472r = c2115w2;
                hVar.n("require", new J4(c2115w2));
                ((HashMap) c2115w2.f10802o).put("internal.platform", CallableC2074o0.f10752a);
                hVar.n("runtime.counter", new C2035h(Double.valueOf(0.0d)));
                break;
            default:
                this.f13471o = new HashMap();
                this.p = new HashMap();
                this.q = new HashMap();
                this.f13472r = new HashMap();
                break;
        }
    }

    public C2358m(Xx xx) {
        this.f13471o = new HashMap(xx.f6223a);
        this.p = new HashMap(xx.f6224b);
        this.q = new HashMap(xx.f6225c);
        this.f13472r = new HashMap(xx.f6226d);
    }

    public C2358m(C2167f c2167f, C2286g c2286g, f fVar, C2286g c2286g2) {
        this.f13471o = c2167f;
        this.p = c2286g;
        this.q = c2286g2;
    }

    public C2358m(c cVar, p043k.c cVar2, ComponentName componentName) {
        this.f13471o = new Object();
        this.p = cVar;
        this.q = cVar2;
        this.f13472r = componentName;
    }
}
