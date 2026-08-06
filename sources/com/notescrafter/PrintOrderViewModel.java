package com.notescrafter;

import C3.C;
import C3.u;
import C3.v;
import K2.b;
import N0.C0135c;
import Q3.a;
import W3.j;
import X3.A;
import X3.D;
import X3.H;
import a4.AbstractC0211j;
import a4.F;
import a4.T;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.Q;
import androidx.lifecycle.X;
import c4.n;
import com.google.android.gms.internal.measurement.C2117x;
import com.razorpay.t;
import e4.e;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;
import p011c0.d;
import p042j3.c;
import p083t3.C2275a0;
import p083t3.C2277b0;
import p083t3.C2279c0;
import p083t3.C2289h0;
import p083t3.C2291i0;
import p083t3.C2305p0;
import p083t3.E0;
import p083t3.V0;
import p083t3.W0;
import p083t3.Z;
import p087u3.i;
import p087u3.m;
import p087u3.q;
import p092v3.h;

/* JADX INFO: loaded from: classes2.dex */
public final class PrintOrderViewModel extends X {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final d f10861f0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final T f10862A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final F f10863B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final T f10864C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final F f10865D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final T f10866E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final F f10867F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final T f10868G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final F f10869H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final T f10870I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final F f10871J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final T f10872K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final F f10873L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final T f10874M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final F f10875N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final T f10876O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final F f10877P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final T f10878Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final F f10879R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final T f10880S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final F f10881T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final T f10882U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final F f10883V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final T f10884W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final F f10885X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final T f10886Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final F f10887Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final T f10888a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Application f10889b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final F f10890b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2117x f10891c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final T f10892c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f10893d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final F f10894d0;
    public D e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public volatile C2291i0 f10895e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public D f10896f;
    public final T g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final F f10897h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final T f10898i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final F f10899j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final T f10900k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final F f10901l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final T f10902m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final F f10903n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final T f10904o;
    public final F p;
    public final T q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final F f10905r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final T f10906s;
    public final F t;
    public final T u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final F f10907v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final T f10908w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final F f10909x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final T f10910y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final F f10911z;

    static {
        c cVar = new c(10);
        cVar.k(kotlin.jvm.internal.F.a(PrintOrderViewModel.class), new C0135c(5));
        f10861f0 = cVar.o();
    }

    public PrintOrderViewModel(Application application) {
        this.f10889b = application;
        this.f10891c = new C2117x(application);
        this.f10893d = h.f13519y.p(application);
        C c5 = C.f167o;
        T tB = AbstractC0211j.b(c5);
        this.g = tB;
        this.f10897h = new F(tB);
        T tB2 = AbstractC0211j.b(new q(null, null, null, null, null, null, null, null, null, null, null, null, false, null, 16383, null));
        this.f10898i = tB2;
        this.f10899j = new F(tB2);
        T tB3 = AbstractC0211j.b(c5);
        this.f10900k = tB3;
        this.f10901l = new F(tB3);
        Double dValueOf = Double.valueOf(0.0d);
        T tB4 = AbstractC0211j.b(dValueOf);
        this.f10902m = tB4;
        this.f10903n = new F(tB4);
        T tB5 = AbstractC0211j.b(dValueOf);
        this.f10904o = tB5;
        this.p = new F(tB5);
        Boolean bool = Boolean.FALSE;
        T tB6 = AbstractC0211j.b(bool);
        this.q = tB6;
        this.f10905r = new F(tB6);
        T tB7 = AbstractC0211j.b(bool);
        this.f10906s = tB7;
        this.t = new F(tB7);
        T tB8 = AbstractC0211j.b("");
        this.u = tB8;
        this.f10907v = new F(tB8);
        T tB9 = AbstractC0211j.b(null);
        this.f10908w = tB9;
        this.f10909x = new F(tB9);
        T tB10 = AbstractC0211j.b(null);
        this.f10910y = tB10;
        this.f10911z = new F(tB10);
        T tB11 = AbstractC0211j.b(null);
        this.f10862A = tB11;
        this.f10863B = new F(tB11);
        T tB12 = AbstractC0211j.b(null);
        this.f10864C = tB12;
        this.f10865D = new F(tB12);
        T tB13 = AbstractC0211j.b(bool);
        this.f10866E = tB13;
        this.f10867F = new F(tB13);
        T tB14 = AbstractC0211j.b(bool);
        this.f10868G = tB14;
        this.f10869H = new F(tB14);
        T tB15 = AbstractC0211j.b(null);
        this.f10870I = tB15;
        this.f10871J = new F(tB15);
        T tB16 = AbstractC0211j.b(c5);
        this.f10872K = tB16;
        this.f10873L = new F(tB16);
        Boolean bool2 = Boolean.TRUE;
        T tB17 = AbstractC0211j.b(bool2);
        this.f10874M = tB17;
        this.f10875N = new F(tB17);
        T tB18 = AbstractC0211j.b(bool2);
        this.f10876O = tB18;
        this.f10877P = new F(tB18);
        T tB19 = AbstractC0211j.b("Store is temporarily paused for new print jobs.");
        this.f10878Q = tB19;
        this.f10879R = new F(tB19);
        C3.D d4 = C3.D.f168o;
        T tB20 = AbstractC0211j.b(d4);
        this.f10880S = tB20;
        this.f10881T = new F(tB20);
        T tB21 = AbstractC0211j.b(d4);
        this.f10882U = tB21;
        this.f10883V = new F(tB21);
        T tB22 = AbstractC0211j.b(null);
        this.f10884W = tB22;
        this.f10885X = new F(tB22);
        T tB23 = AbstractC0211j.b(null);
        this.f10886Y = tB23;
        this.f10887Z = new F(tB23);
        T tB24 = AbstractC0211j.b(bool);
        this.f10888a0 = tB24;
        this.f10890b0 = new F(tB24);
        T tB25 = AbstractC0211j.b(null);
        this.f10892c0 = tB25;
        this.f10894d0 = new F(tB25);
    }

    public static File f(Context context, Uri uri) {
        o.f(context, "context");
        o.f(uri, "uri");
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                return null;
            }
            File fileCreateTempFile = File.createTempFile("print_upload_", ".pdf", context.getCacheDir());
            fileCreateTempFile.deleteOnExit();
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            try {
                try {
                    b.d(inputStreamOpenInputStream, fileOutputStream);
                    a.l(fileOutputStream, null);
                    a.l(inputStreamOpenInputStream, null);
                    return fileCreateTempFile;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        a.l(fileOutputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    a.l(inputStreamOpenInputStream, th3);
                    throw th4;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Z i(String name) {
        List listZ;
        List listS;
        List listZ2;
        o.f(name, "name");
        String upperCase = name.toUpperCase();
        o.e(upperCase, "toUpperCase(...)");
        String input = j.I0(upperCase).toString();
        Pattern patternCompile = Pattern.compile("\\s+");
        o.e(patternCompile, "compile(...)");
        o.f(input, "input");
        j.v0(0);
        Matcher matcher = patternCompile.matcher(input);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
            } while (matcher.find());
            arrayList.add(input.subSequence(iEnd, input.length()).toString());
            listZ = arrayList;
        } else {
            listZ = p003a2.a.z(input.toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listZ) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        boolean z3 = arrayList2.size() > 4;
        String str = null;
        if (arrayList2.isEmpty()) {
            return new Z(null, C.f167o, false);
        }
        List listE0 = u.E0(arrayList2, 4);
        if (listE0.size() <= 2) {
            String strV0 = u.v0(listE0, " ", null, null, null, 62);
            if (strV0.length() <= 17) {
                listZ2 = p003a2.a.z(strV0);
            } else {
                String[] strArr = new String[2];
                strArr[0] = listE0.get(0);
                String str2 = (String) u.s0(1, listE0);
                if (str2 == null) {
                    str2 = "";
                }
                strArr[1] = str2;
                listS = v.S(strArr);
                if (((String) listE0.get(0)).length() > 17 || (listE0.size() > 1 && ((String) listE0.get(1)).length() > 17)) {
                    str = "Word exceeds 17 chars";
                }
            }
            return new Z(str, listZ2, z3);
        }
        List list = listE0;
        String strV1 = u.v0(u.E0(list, 2), " ", null, null, null, 62);
        String strV2 = u.v0(u.n0(list, 2), " ", null, null, null, 62);
        listS = v.S(strV1, strV2);
        if (strV1.length() > 17 || strV2.length() > 17) {
            str = "Line exceeds 17 chars";
        }
        listZ2 = listS;
        return new Z(str, listZ2, z3);
    }

    public final void e() {
        List list = (List) this.g.getValue();
        String postalCode = ((q) this.f10898i.getValue()).getPostalCode();
        if (!list.isEmpty() && postalCode.length() == 6) {
            D d4 = this.f10896f;
            if (d4 != null) {
                d4.cancel(null);
            }
            p019e0.a aVarH = Q.h(this);
            e eVar = H.f1766a;
            this.f10896f = A.t(aVarH, e4.d.f11107o, null, new C2289h0(this, postalCode, list, null), 2);
            return;
        }
        Double dValueOf = Double.valueOf(0.0d);
        T t = this.f10902m;
        t.getClass();
        t.j(null, dValueOf);
        Double dValueOf2 = Double.valueOf(0.0d);
        T t5 = this.f10904o;
        t5.getClass();
        t5.j(null, dValueOf2);
    }

    public final void g() {
        SharedPreferences sharedPreferences = this.f10889b.getSharedPreferences("auth_prefs", 0);
        String string = sharedPreferences.getString("user_phone", "");
        if (string == null) {
            string = "";
        }
        boolean z3 = sharedPreferences.getBoolean("user_phone_verified", false);
        Pattern patternCompile = Pattern.compile("\\D");
        o.e(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(string).replaceAll("");
        o.e(strReplaceAll, "replaceAll(...)");
        String strG0 = j.G0(strReplaceAll);
        p019e0.a aVarH = Q.h(this);
        e eVar = H.f1766a;
        A.t(aVarH, e4.d.f11107o, null, new C2305p0(this, z3, strG0, null), 2);
    }

    public final double h(String str) {
        double dJ = j(str);
        double dDoubleValue = k() >= 5 ? 0.0d : ((Number) this.f10902m.getValue()).doubleValue();
        if (dJ > 0.0d) {
            return dJ + dDoubleValue;
        }
        return 0.0d;
    }

    public final double j(String str) {
        Iterator it = ((Iterable) this.g.getValue()).iterator();
        double dL = 0.0d;
        while (it.hasNext()) {
            dL += l((m) it.next(), str);
        }
        return dL;
    }

    public final int k() {
        Iterator it = ((Iterable) this.g.getValue()).iterator();
        int copies = 0;
        while (it.hasNext()) {
            copies += ((m) it.next()).getCopies();
        }
        return copies;
    }

    public final double l(m item, String str) {
        long jRound;
        o.f(item, "item");
        if (o.b(item.getUploadStatus(), "uploading")) {
            return 0.0d;
        }
        if (item.getPricePaise() != null) {
            jRound = item.getPricePaise().longValue();
        } else {
            int pages = item.getPages();
            int copies = item.getCopies();
            boolean z3 = item.getColor() == p087u3.j.COLOR;
            Map map = (Map) ((T) this.f10893d.f13538x.f1964o).getValue();
            if (str == null) {
                str = "guest";
            }
            B3.h hVar = (B3.h) map.get(str);
            if (hVar == null) {
                hVar = new B3.h(Double.valueOf(1.25d), Double.valueOf(3.35d));
            }
            jRound = Math.round(((((double) pages) * ((Number) (z3 ? hVar.p : hVar.f148o)).doubleValue()) + 65.0d) * ((double) copies) * 100.0d);
        }
        return jRound / 100.0d;
    }

    public final void m() {
        T t = this.g;
        C c5 = C.f167o;
        t.getClass();
        t.j(null, c5);
        T t5 = this.f10898i;
        q qVar = new q(null, null, null, null, null, null, null, null, null, null, null, null, false, null, 16383, null);
        t5.getClass();
        t5.j(null, qVar);
        T t6 = this.f10902m;
        Double dValueOf = Double.valueOf(0.0d);
        t6.getClass();
        t6.j(null, dValueOf);
        T t7 = this.f10904o;
        Double dValueOf2 = Double.valueOf(0.0d);
        t7.getClass();
        t7.j(null, dValueOf2);
        T t8 = this.q;
        Boolean bool = Boolean.FALSE;
        t8.getClass();
        t8.j(null, bool);
        T t9 = this.f10906s;
        t9.getClass();
        t9.j(null, bool);
        T t10 = this.u;
        t10.getClass();
        t10.j(null, "");
        this.f10908w.i(null);
        this.f10870I.i(null);
        this.f10892c0.i(null);
        this.f10895e0 = null;
        this.f10884W.i(null);
        this.f10886Y.i(null);
        T t11 = this.f10888a0;
        t11.getClass();
        t11.j(null, bool);
        g();
    }

    public final void n(p087u3.v addr) {
        i iVarValueOf;
        String upperCase;
        o.f(addr, "addr");
        SharedPreferences sharedPreferences = this.f10889b.getSharedPreferences("auth_prefs", 0);
        String string = sharedPreferences.getString("user_phone", "");
        if (string == null) {
            string = "";
        }
        boolean z3 = sharedPreferences.getBoolean("user_phone_verified", false);
        T t = this.f10898i;
        q qVar = (q) t.getValue();
        String input = addr.getPhone();
        if (input == null) {
            input = qVar.getPhone();
        }
        Pattern patternCompile = Pattern.compile("\\D");
        o.e(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(string).replaceAll("");
        o.e(strReplaceAll, "replaceAll(...)");
        String strG0 = j.G0(strReplaceAll);
        Pattern patternCompile2 = Pattern.compile("\\D");
        o.e(patternCompile2, "compile(...)");
        o.f(input, "input");
        String strReplaceAll2 = patternCompile2.matcher(input).replaceAll("");
        o.e(strReplaceAll2, "replaceAll(...)");
        String strG1 = j.G0(strReplaceAll2);
        Integer numIsVerified = addr.isVerified();
        boolean z4 = (numIsVerified != null && numIsVerified.intValue() == 1) || (z3 && !j.m0(strG0) && strG0.equals(strG1));
        String firstName = addr.getFirstName();
        String str = firstName == null ? "" : firstName;
        String lastName = addr.getLastName();
        String str2 = lastName == null ? "" : lastName;
        String flatHouse = addr.getFlatHouse();
        String str3 = flatHouse == null ? "" : flatHouse;
        String areaStreet = addr.getAreaStreet();
        String str4 = areaStreet == null ? "" : areaStreet;
        String landmark = addr.getLandmark();
        String str5 = landmark == null ? "" : landmark;
        String city = addr.getCity();
        String str6 = city == null ? "" : city;
        String state = addr.getState();
        String str7 = state == null ? "" : state;
        String pincode = addr.getPincode();
        String str8 = pincode == null ? "" : pincode;
        try {
            String addressType = addr.getAddressType();
            if (addressType != null) {
                upperCase = addressType.toUpperCase(Locale.ROOT);
                o.e(upperCase, "toUpperCase(...)");
            } else {
                upperCase = "HOME";
            }
            iVarValueOf = i.valueOf(upperCase);
        } catch (Exception unused) {
            iVarValueOf = i.HOME;
        }
        q qVarCopy = qVar.copy((12287 & 1) != 0 ? qVar.firstName : str, (12287 & 2) != 0 ? qVar.lastName : str2, (12287 & 4) != 0 ? qVar.fullName : null, (12287 & 8) != 0 ? qVar.flatHouse : str3, (12287 & 16) != 0 ? qVar.areaStreet : str4, (12287 & 32) != 0 ? qVar.landmark : str5, (12287 & 64) != 0 ? qVar.addressType : iVarValueOf, (12287 & Fields.SpotShadowColor) != 0 ? qVar.city : str6, (12287 & Fields.RotationX) != 0 ? qVar.state : str7, (12287 & Fields.RotationY) != 0 ? qVar.postalCode : str8, (12287 & Fields.RotationZ) != 0 ? qVar.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar.phone : strG1, (12287 & Fields.TransformOrigin) != 0 ? qVar.isPhoneVerified : z4, (12287 & Fields.Shape) != 0 ? qVar.shippingAddressId : W3.q.Z(addr.getId()));
        t.i(qVarCopy);
        if (qVarCopy.getPostalCode().length() == 6) {
            String postalCode = qVarCopy.getPostalCode();
            this.f10908w.i(null);
            this.f10891c.g(postalCode, new C2277b0(this, 2));
        }
    }

    public final void o(String phone) {
        o.f(phone, "phone");
        if (phone.length() < 10) {
            return;
        }
        Boolean bool = Boolean.TRUE;
        T t = this.f10906s;
        t.getClass();
        t.j(null, bool);
        this.f10870I.i(null);
        Pattern patternCompile = Pattern.compile("\\D");
        o.e(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(phone).replaceAll("");
        o.e(strReplaceAll, "replaceAll(...)");
        this.f10891c.m(j.G0(strReplaceAll), new C2277b0(this, 0));
    }

    public final void onPaymentFailed(String reason) {
        o.f(reason, "reason");
        C2291i0 c2291i0 = this.f10895e0;
        this.f10895e0 = null;
        this.f10892c0.i(null);
        A.t(Q.h(this), null, null, new E0(c2291i0, reason, null), 3);
    }

    public final void p(String str) {
        this.f10908w.i(str);
    }

    public final void q() {
        p019e0.a aVarH = Q.h(this);
        e eVar = H.f1766a;
        A.t(aVarH, n.f2606a, null, new V0(this, null), 2);
    }

    public final void r(String id, O3.c cVar) {
        o.f(id, "id");
        p019e0.a aVarH = Q.h(this);
        e eVar = H.f1766a;
        A.t(aVarH, n.f2606a, null, new W0(this, id, cVar, null), 2);
    }

    public final void s(File file, String notebookId) {
        o.f(notebookId, "notebookId");
        r(notebookId, new C2279c0(file, 1));
        C2275a0 c2275a0 = new C2275a0(this, notebookId, 2);
        C2275a0 c2275a1 = new C2275a0(this, notebookId, 3);
        C2117x c2117x = this.f10891c;
        c2117x.getClass();
        new Thread(new t(file, c2275a0, c2117x, c2275a1, 1)).start();
    }
}
