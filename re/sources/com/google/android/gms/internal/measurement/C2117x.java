package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import com.google.android.gms.internal.ads.Pn;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.gson.reflect.TypeToken;
import com.notescrafter.PrintOrderViewModel;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import p083t3.C2277b0;
import p083t3.C2310s0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2117x implements J1.a, g4.e, p104y0.r {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f10805o;
    public Object p;
    public Object q;

    public /* synthetic */ C2117x(int i5) {
        this.f10805o = i5;
    }

    public static String d(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ".concat(cls.getName());
        }
        return null;
    }

    public static String h(Exception exc) {
        Log.e("PrintApiClient", "Upload exception encountered", exc);
        String message = exc.getMessage();
        if (message == null) {
            message = "";
        }
        if ((exc instanceof UnknownHostException) || W3.j.c0(message, "UnknownHostException", true) || W3.j.c0(message, "resolve", true)) {
            return "No internet connection. Please check your network status and try again.";
        }
        if ((exc instanceof SocketTimeoutException) || W3.j.c0(message, "SocketTimeoutException", true) || W3.j.c0(message, "timeout", true)) {
            return "Upload timed out. Your connection might be too slow for this file. Please check your network.";
        }
        if (exc instanceof FileNotFoundException) {
            return "The selected PDF file could not be found or read. Please select it again.";
        }
        if (exc instanceof IOException) {
            return "Network transmission error occurred. Please check your signal and try again.";
        }
        String localizedMessage = exc.getLocalizedMessage();
        return localizedMessage == null ? "Failed to securely upload file. Please try again." : localizedMessage;
    }

    public static String i(String str, int i5, String str2) {
        try {
            String strOptString = new JSONObject(str).optString("error", "");
            kotlin.jvm.internal.o.c(strOptString);
            if (strOptString.length() > 0) {
                return strOptString;
            }
        } catch (Exception unused) {
        }
        if (i5 == 401) {
            return "Session expired. Please log out and sign back in.";
        }
        if (i5 == 413) {
            return "This PDF file is too large to upload. Maximum size is 1 GB.";
        }
        if (i5 == 503) {
            return "File uploads are temporarily disabled. The print shop is not accepting orders right now.";
        }
        return (500 > i5 || i5 >= 600) ? str2 : "Server encountered an error while processing the PDF. Please try again.";
    }

    public void a(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uploadId", str);
            jSONObject.put("fileKey", str2);
            String string = jSONObject.toString();
            kotlin.jvm.internal.o.e(string, "toString(...)");
            Pattern pattern = g4.p.f11330d;
            g4.v vVarG = p003a2.a.g(string, p111z2.b.k("application/json"));
            M0.b bVarC = c("https://notescrafter.com/api/print/upload-pdf/abort");
            bVarC.i("POST", vVarG);
            ((g4.t) this.q).a(bVarC.d()).f().close();
        } catch (Exception e) {
            Log.e("PrintApiClient", "Failed to abort multipart upload", e);
        }
    }

    @Override // J1.a
    public p101x2.o b() {
        p101x2.o oVarB = ((p036i2.f) this.p).b();
        A.e eVar = new A.e(this, 11);
        oVarB.getClass();
        return oVarB.j(p101x2.j.f13714a, eVar);
    }

    public M0.b c(String str) {
        M0.b bVar = new M0.b();
        bVar.k(str);
        String string = ((Application) this.p).getSharedPreferences("auth_prefs", 0).getString("jwt", null);
        if (string != null) {
            bVar.c("Authorization", "Bearer ".concat(string));
        }
        return bVar;
    }

    public void e(O3.c cVar) {
        M0.b bVarC = c("https://notescrafter.com/api/print/shipping-addresses");
        bVarC.g();
        ((g4.t) this.q).a(bVarC.d()).e(new p092v3.w(cVar, 0));
    }

    public p060n3.n f(TypeToken typeToken) {
        p060n3.n eVar;
        String str;
        p060n3.n mVar;
        int i5 = 14;
        int i6 = 15;
        int i7 = 18;
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        Map map = (Map) this.p;
        if (map.get(type) != null) {
            throw new ClassCastException();
        }
        if (map.get(rawType) != null) {
            throw new ClassCastException();
        }
        p046k2.h hVar = null;
        if (EnumSet.class.isAssignableFrom(rawType)) {
            eVar = new p042j3.c(type, i7);
        } else {
            eVar = rawType == EnumMap.class ? new A.e(type, i6) : null;
        }
        if (eVar != null) {
            return eVar;
        }
        p060n3.d.e((List) this.q);
        if (Modifier.isAbstract(rawType.getModifiers())) {
            mVar = null;
        } else {
            try {
                Constructor declaredConstructor = rawType.getDeclaredConstructor(null);
                Q3.a aVar = p072q3.c.f12317a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e) {
                    str = "Failed making constructor '" + p072q3.c.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e.getMessage();
                }
                mVar = str != null ? new A2.m(str, 4) : new p042j3.c(declaredConstructor, 19);
            } catch (NoSuchMethodException unused) {
                mVar = null;
            }
        }
        if (mVar != null) {
            return mVar;
        }
        if (Collection.class.isAssignableFrom(rawType)) {
            if (SortedSet.class.isAssignableFrom(rawType)) {
                hVar = new p046k2.h(10);
            } else if (Set.class.isAssignableFrom(rawType)) {
                hVar = new p046k2.h(11);
            } else {
                hVar = Queue.class.isAssignableFrom(rawType) ? new p046k2.h(12) : new p046k2.h(13);
            }
        } else if (Map.class.isAssignableFrom(rawType)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(rawType)) {
                hVar = new p046k2.h(i5);
            } else if (ConcurrentMap.class.isAssignableFrom(rawType)) {
                hVar = new p046k2.h(i6);
            } else if (SortedMap.class.isAssignableFrom(rawType)) {
                hVar = new p046k2.h(16);
            } else {
                hVar = (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(TypeToken.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) ? new p046k2.h(i7) : new p046k2.h(17);
            }
        }
        if (hVar != null) {
            return hVar;
        }
        String strD = d(rawType);
        return strD != null ? new A2.m(strD, 3) : new A.e(rawType, i5);
    }

    public void g(String pincode, O3.c cVar) {
        kotlin.jvm.internal.o.f(pincode, "pincode");
        M0.b bVarC = c("https://notescrafter.com/api/print/pincode/".concat(pincode));
        bVarC.g();
        ((g4.t) this.q).a(bVarC.d()).e(new p092v3.w(cVar, 1));
    }

    @Override // g4.e
    public void j(k4.i call, IOException iOException) {
        kotlin.jvm.internal.o.f(call, "call");
        Throwable thA = B3.k.a(o4.d.d(iOException));
        if (thA != null) {
            Log.e("PrintOrderViewModel", "Failed to fetch cloud drafts", thA);
        }
    }

    public void k(p087u3.v vVar, O3.c cVar) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("first_name", vVar.getFirstName());
            jSONObject.put("last_name", vVar.getLastName());
            jSONObject.put("phone", vVar.getPhone());
            jSONObject.put("flat_house", vVar.getFlatHouse());
            jSONObject.put("area_street", vVar.getAreaStreet());
            jSONObject.put("landmark", vVar.getLandmark());
            jSONObject.put("city", vVar.getCity());
            jSONObject.put("state", vVar.getState());
            jSONObject.put("pincode", vVar.getPincode());
            String addressType = vVar.getAddressType();
            if (addressType == null) {
                addressType = "HOME";
            }
            jSONObject.put("address_type", addressType);
            String string = jSONObject.toString();
            kotlin.jvm.internal.o.e(string, "toString(...)");
            if (vVar.getId().length() > 0) {
                str = "https://notescrafter.com/api/print/shipping-addresses/" + vVar.getId();
            } else {
                str = "https://notescrafter.com/api/print/shipping-addresses";
            }
            M0.b bVarC = c(str);
            Pattern pattern = g4.p.f11330d;
            bVarC.i("POST", p003a2.a.g(string, p111z2.b.k("application/json")));
            ((g4.t) this.q).a(bVarC.d()).e(new C(6, cVar, vVar));
        } catch (Exception e) {
            cVar.invoke(new B3.k(o4.d.d(e)));
        }
    }

    @Override // g4.e
    public void l(k4.i call, g4.x xVar) {
        C2117x c2117x = this;
        String str = "optString(...)";
        kotlin.jvm.internal.o.f(call, "call");
        String str2 = "";
        O0.n nVar = xVar.u;
        String strJ = nVar != null ? nVar.j() : "";
        boolean zG = xVar.g();
        C2277b0 c2277b0 = (C2277b0) c2117x.p;
        if (!zG) {
            Throwable thA = B3.k.a(o4.d.d(new Exception("HTTP Error: " + xVar.f11402r)));
            if (thA != null) {
                Log.e("PrintOrderViewModel", "Failed to fetch cloud drafts", thA);
                return;
            }
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(strJ);
            int i5 = 0;
            if (!jSONObject.optBoolean("success", false)) {
                Throwable thA2 = B3.k.a(o4.d.d(new Exception(jSONObject.optString("error", "Unknown error"))));
                if (thA2 != null) {
                    Log.e("PrintOrderViewModel", "Failed to fetch cloud drafts", thA2);
                    return;
                }
                return;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            while (i5 < length) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i5);
                String strOptString = jSONObject2.optString("r2_file_key");
                kotlin.jvm.internal.o.e(strOptString, str);
                String strOptString2 = jSONObject2.optString("notebook_name", str2);
                kotlin.jvm.internal.o.e(strOptString2, str);
                JSONArray jSONArray = jSONArrayOptJSONArray;
                String str3 = str2;
                int iOptInt = jSONObject2.optInt("pages", 1);
                p087u3.j jVar = kotlin.jvm.internal.o.b(jSONObject2.optString("color_mode"), "color") ? p087u3.j.COLOR : p087u3.j.BW;
                p087u3.k kVar = kotlin.jvm.internal.o.b(jSONObject2.optString("duplex_mode"), "single") ? p087u3.k.SINGLE : p087u3.k.DOUBLE;
                String strOptString3 = jSONObject2.optString("paper_size", "A4");
                kotlin.jvm.internal.o.e(strOptString3, str);
                int i6 = length;
                String strOptString4 = jSONObject2.optString("binding_type", "Wiro");
                kotlin.jvm.internal.o.e(strOptString4, str);
                String str4 = str;
                int iOptInt2 = jSONObject2.optInt("copies", 1);
                String strOptString5 = jSONObject2.optString("name", null);
                ((C2117x) c2117x.q).getClass();
                arrayList.add(new p087u3.m(strOptString, strOptString2, iOptInt, jVar, kVar, strOptString3, strOptString4, iOptInt2, strOptString5, "https://notescrafter.com/api/print/preview-pdf/" + jSONObject2.optString("r2_file_key"), jSONObject2.optString("r2_file_key"), "success", 0, null, (!jSONObject2.has("price_paise") || jSONObject2.isNull("price_paise")) ? null : Long.valueOf(jSONObject2.getLong("price_paise")), null, 45056, null));
                i5++;
                c2117x = this;
                jSONArrayOptJSONArray = jSONArray;
                str2 = str3;
                length = i6;
                str = str4;
            }
            PrintOrderViewModel printOrderViewModel = c2277b0.p;
            X3.A.t(androidx.lifecycle.Q.h(printOrderViewModel), null, null, new C2310s0(printOrderViewModel, arrayList, null), 3);
            Throwable thA3 = B3.k.a(arrayList);
            if (thA3 != null) {
                Log.e("PrintOrderViewModel", "Failed to fetch cloud drafts", thA3);
            }
        } catch (Exception e) {
            Throwable thA4 = B3.k.a(o4.d.d(e));
            if (thA4 != null) {
                Log.e("PrintOrderViewModel", "Failed to fetch cloud drafts", thA4);
            }
        }
    }

    public void m(String str, O3.c cVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("phone", str);
            String string = jSONObject.toString();
            kotlin.jvm.internal.o.e(string, "toString(...)");
            M0.b bVarC = c("https://notescrafter.com/api/print/send-otp");
            Pattern pattern = g4.p.f11330d;
            bVarC.i("POST", p003a2.a.g(string, p111z2.b.k("application/json")));
            ((g4.t) this.q).a(bVarC.d()).e(new p092v3.x(cVar, 0));
        } catch (Exception e) {
            cVar.invoke(new B3.k(o4.d.d(e)));
        }
    }

    public void n(p013c2.g gVar) {
        ((androidx.lifecycle.E) this.p).g(gVar);
        boolean z3 = gVar instanceof p104y0.q;
        J0.k kVar = (J0.k) this.q;
        if (z3) {
            kVar.j((p104y0.q) gVar);
        } else if (gVar instanceof p104y0.o) {
            kVar.k(((p104y0.o) gVar).f15863c);
        }
    }

    public void o(String str, String str2, O3.c cVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("phone", str);
            jSONObject.put("code", str2);
            String string = jSONObject.toString();
            kotlin.jvm.internal.o.e(string, "toString(...)");
            M0.b bVarC = c("https://notescrafter.com/api/print/verify-otp");
            Pattern pattern = g4.p.f11330d;
            bVarC.i("POST", p003a2.a.g(string, p111z2.b.k("application/json")));
            ((g4.t) this.q).a(bVarC.d()).e(new p092v3.x(cVar, 1));
        } catch (Exception e) {
            cVar.invoke(new B3.k(o4.d.d(e)));
        }
    }

    public InterfaceC2073o p(F0.h hVar, InterfaceC2073o interfaceC2073o) {
        J1.g(hVar);
        if (!(interfaceC2073o instanceof r)) {
            return interfaceC2073o;
        }
        r rVar = (r) interfaceC2073o;
        ArrayList arrayList = rVar.p;
        HashMap map = (HashMap) this.p;
        String str = rVar.f10778o;
        return (map.containsKey(str) ? (C2097t) map.get(str) : (C2097t) this.q).b(str, hVar, arrayList);
    }

    public Object q() {
        String string;
        H1 h5 = (H1) this.p;
        String str = (String) this.q;
        ContentResolver contentResolver = ((Context) h5.p).getContentResolver();
        Pn pn = AbstractC2114w1.f10801a;
        if (contentResolver == null) {
            pn.getClass();
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (pn) {
            try {
                if (((HashMap) pn.q) == null) {
                    ((AtomicBoolean) pn.p).set(false);
                    pn.q = new HashMap(16, 1.0f);
                    pn.f5393v = new Object();
                    contentResolver.registerContentObserver(AbstractC2124y1.f10812a, true, new C2129z1(pn, 0));
                } else if (((AtomicBoolean) pn.p).getAndSet(false)) {
                    ((HashMap) pn.q).clear();
                    ((HashMap) pn.f5391r).clear();
                    ((HashMap) pn.f5392s).clear();
                    ((HashMap) pn.t).clear();
                    ((HashMap) pn.u).clear();
                    pn.f5393v = new Object();
                    pn.f5390o = false;
                }
                Object obj = pn.f5393v;
                if (((HashMap) pn.q).containsKey(str)) {
                    String str2 = (String) ((HashMap) pn.q).get(str);
                    return str2 != null ? str2 : null;
                }
                for (String str3 : (String[]) pn.f5394w) {
                    if (str.startsWith(str3)) {
                        if (!pn.f5390o) {
                            String[] strArr = (String[]) pn.f5394w;
                            try {
                                ((A1) pn.f5395x).getClass();
                                HashMap mapA = A1.a(contentResolver, strArr);
                                if (!mapA.isEmpty()) {
                                    Set setKeySet = mapA.keySet();
                                    setKeySet.removeAll(((HashMap) pn.f5391r).keySet());
                                    setKeySet.removeAll(((HashMap) pn.f5392s).keySet());
                                    setKeySet.removeAll(((HashMap) pn.t).keySet());
                                    setKeySet.removeAll(((HashMap) pn.u).keySet());
                                }
                                if (!mapA.isEmpty()) {
                                    if (((HashMap) pn.q).isEmpty()) {
                                        pn.q = mapA;
                                    } else {
                                        ((HashMap) pn.q).putAll(mapA);
                                    }
                                }
                                pn.f5390o = true;
                            } catch (B1 unused) {
                            }
                            if (((HashMap) pn.q).containsKey(str)) {
                                String str4 = (String) ((HashMap) pn.q).get(str);
                                return str4 != null ? str4 : null;
                            }
                        }
                        return null;
                    }
                }
                try {
                    ((A1) pn.f5395x).getClass();
                    Cursor cursorQuery = contentResolver.query(AbstractC2124y1.f10812a, null, null, new String[]{str}, null);
                    try {
                        if (cursorQuery == null) {
                            throw new B1("Failed to connect to GservicesProvider");
                        }
                        if (cursorQuery.moveToFirst()) {
                            string = cursorQuery.getString(1);
                            cursorQuery.close();
                        } else {
                            cursorQuery.close();
                            string = null;
                        }
                        if (string != null && string.equals(null)) {
                            string = null;
                        }
                        synchronized (pn) {
                            try {
                                if (obj == pn.f5393v) {
                                    ((HashMap) pn.q).put(str, string);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (string != null) {
                            return string;
                        }
                        return null;
                    } catch (Throwable th2) {
                        if (cursorQuery != null) {
                            try {
                                cursorQuery.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                } catch (B1 unused2) {
                    return null;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public void r(C2097t c2097t) {
        Iterator it = c2097t.f10785a.iterator();
        while (it.hasNext()) {
            ((HashMap) this.p).put(((H) it.next()).toString(), c2097t);
        }
    }

    public String toString() {
        switch (this.f10805o) {
            case 3:
                return ((Map) this.p).toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C2117x(int i5, Object obj, Object obj2) {
        this.f10805o = i5;
        this.p = obj;
        this.q = obj2;
    }

    public C2117x(Context context) {
        p036i2.e eVar;
        this.f10805o = 2;
        this.p = new p036i2.f(context, Q1.f.f969b);
        synchronized (p036i2.e.class) {
            try {
                if (p036i2.e.f11535s == null) {
                    p036i2.e.f11535s = new p036i2.e(context.getApplicationContext(), 0);
                }
                eVar = p036i2.e.f11535s;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.q = eVar;
    }

    public C2117x(AppMeasurementDynamiteService appMeasurementDynamiteService, Y y4) {
        this.f10805o = 4;
        this.q = appMeasurementDynamiteService;
        this.p = y4;
    }

    public C2117x(String str) {
        this.f10805o = 5;
        this.q = str;
    }

    public C2117x(Application application) {
        this.f10805o = 7;
        this.p = application;
        g4.s sVar = new g4.s();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        sVar.a(30L, timeUnit);
        sVar.f11357s = h4.b.b(30L, timeUnit);
        sVar.t = h4.b.b(30L, timeUnit);
        this.q = new g4.t(sVar);
    }

    public C2117x() {
        this.f10805o = 8;
        this.p = new androidx.lifecycle.E();
        this.q = new J0.k();
        n(p104y0.r.f15865n);
    }
}
