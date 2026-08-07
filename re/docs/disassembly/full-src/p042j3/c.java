package p042j3;

import B3.k;
import N0.q;
import N0.r;
import S1.j;
import W.AbstractComponentCallbacksC0170o;
import W.B;
import W.E;
import W.s;
import X0.h;
import X3.A;
import a4.AbstractC0211j;
import android.R;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.lifecycle.Q;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.gms.internal.ads.AbstractC0725Ed;
import com.google.android.gms.internal.ads.AbstractC1869x7;
import com.google.android.gms.internal.ads.C0789Pb;
import com.google.android.gms.internal.ads.InterfaceC1809vs;
import com.google.android.gms.internal.ads.U7;
import com.google.android.gms.internal.measurement.o4;
import com.notescrafter.PrintOrderViewModel;
import com.razorpay.AppSignatureHelper;
import g4.e;
import g4.x;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C2167f;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;
import p003a2.a;
import p011c0.f;
import p022f.b;
import p041j2.l;
import p051l3.g;
import p060n3.n;
import p067p1.d;
import p082t2.AbstractC2268x;
import p082t2.C2236g0;
import p082t2.L;
import p082t2.U;
import p082t2.Z0;
import p082t2.j1;
import p082t2.m1;
import p083t3.C2277b0;
import p083t3.C2291i0;
import p083t3.T0;
import p087u3.m;
import p090v1.C2366q;
import p101x2.i;

/* JADX INFO: loaded from: classes2.dex */
public class c implements h, j, b, p027g1.b, p058n0.b, n, m1, InterfaceC1809vs, e {
    public static volatile c q;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f11587o;
    public final Object p;

    public /* synthetic */ c(Object obj, int i5) {
        this.f11587o = i5;
        this.p = obj;
    }

    public static void q(Context context, d dVar, a aVar) {
        AbstractC1869x7.a(context);
        if (((Boolean) U7.f5828h.p()).booleanValue()) {
            if (((Boolean) C2366q.f13480d.f13483c.a(AbstractC1869x7.K9)).booleanValue()) {
                AbstractC0725Ed.f3291b.execute(new B0.d(context, dVar, aVar));
                return;
            }
        }
        new C0789Pb(0, context, dVar.f12262a).z(aVar);
    }

    public void A(long j5) throws IOException {
        long jB = B();
        if (jB != j5) {
            if (jB != -1) {
                if (jB != -2) {
                    return;
                } else {
                    jB = -2;
                }
            }
            throw new IOException("expected non-string scope or scope " + j5 + " but found " + jB);
        }
    }

    public long B() {
        ArrayDeque arrayDeque = (ArrayDeque) this.p;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override // p058n0.b
    public void a(int i5, Serializable serializable) {
        String str;
        switch (i5) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case AppSignatureHelper.NUM_BASE64_CHAR /* 11 */:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i5 == 6 || i5 == 7 || i5 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.p).setResultCode(i5);
    }

    @Override // p082t2.m1
    public void b(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        j1 j1Var = (j1) this.p;
        if (!zIsEmpty) {
            j1Var.m().t(new E1.b(this, str, str2, bundle, 16, false));
            return;
        }
        C2236g0 c2236g0 = j1Var.f12726l;
        if (c2236g0 != null) {
            L l5 = c2236g0.f12681i;
            C2236g0.d(l5);
            l5.f12472f.f(str2, "AppId not known when logging event");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1809vs
    public void c(int i5, long j5) {
        ((p085u1.d) this.p).f13293v.n(i5, System.currentTimeMillis() - j5);
    }

    @Override // p022f.b
    public void d(Object obj) {
        p022f.a aVar = (p022f.a) obj;
        E e = (E) this.p;
        B b5 = (B) e.f1437D.pollFirst();
        if (b5 == null) {
            Log.w("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        String str = b5.f1431o;
        AbstractComponentCallbacksC0170o abstractComponentCallbacksC0170oD = e.f1450c.d(str);
        if (abstractComponentCallbacksC0170oD != null) {
            abstractComponentCallbacksC0170oD.s(b5.p, aVar.f11121o, aVar.p);
        } else {
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    @Override // p058n0.b
    public void e() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1809vs
    public void f(String str, long j5, int i5) {
        ((p085u1.d) this.p).f13293v.p(i5, System.currentTimeMillis() - j5, null, null, str);
    }

    @Override // X0.h
    public Object g(M0.h hVar) {
        return AbstractC0211j.g(new q(((r) this.p).p, 0), hVar);
    }

    @Override // A3.a
    public Object get() {
        String packageName = ((Context) ((A.e) this.p).p).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p060n3.n
    public Object h() {
        Object obj = this.p;
        switch (this.f11587o) {
            case 18:
                Type type = (Type) obj;
                if (!(type instanceof ParameterizedType)) {
                    throw new g("Invalid EnumSet type: " + type.toString());
                }
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new g("Invalid EnumSet type: " + type.toString());
            default:
                Constructor constructor = (Constructor) obj;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e) {
                    Q3.a aVar = p072q3.c.f12317a;
                    throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
                } catch (InstantiationException e3) {
                    throw new RuntimeException("Failed to invoke constructor '" + p072q3.c.b(constructor) + "' with no args", e3);
                } catch (InvocationTargetException e5) {
                    throw new RuntimeException("Failed to invoke constructor '" + p072q3.c.b(constructor) + "' with no args", e5.getCause());
                }
        }
    }

    @Override // S1.j
    public void i(Object obj, Object obj2) {
        Object obj3 = this.p;
        switch (this.f11587o) {
            case 6:
                i iVar = (i) obj2;
                V1.a aVar = (V1.a) ((V1.c) obj).t();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(aVar.q);
                int i5 = p050l2.a.f11837a;
                T1.n nVar = (T1.n) obj3;
                if (nVar == null) {
                    parcelObtain.writeInt(0);
                } else {
                    parcelObtain.writeInt(1);
                    nVar.writeToParcel(parcelObtain, 0);
                }
                try {
                    aVar.p.transact(1, parcelObtain, null, 1);
                    parcelObtain.recycle();
                    iVar.b(null);
                    return;
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            default:
                p041j2.c cVar = new p041j2.c((i) obj2);
                l lVar = (l) ((p041j2.d) obj).t();
                Parcel parcelC0 = lVar.c0();
                int i6 = p041j2.g.f11580a;
                parcelC0.writeStrongBinder(cVar);
                parcelC0.writeString(((p041j2.b) obj3).f11573y);
                lVar.i0(parcelC0, 2);
                return;
        }
    }

    @Override // g4.e
    public void j(k4.i call, IOException iOException) {
        Object obj = this.p;
        int i5 = this.f11587o;
        o.f(call, "call");
        switch (i5) {
            case 27:
                B3.j jVarD = o4.d.d(iOException);
                p011c0.d dVar = PrintOrderViewModel.f10861f0;
                Throwable thA = k.a(jVarD);
                if (thA != null) {
                    Log.e("PrintOrderViewModel", "Failed to calculate server rates", thA);
                }
                break;
            case 28:
                ((C2291i0) obj).invoke(new k(o4.d.d(iOException)));
                break;
            default:
                P0.b bVar = (P0.b) obj;
                Throwable thA2 = k.a(o4.d.d(iOException));
                if (thA2 != null) {
                    Log.e("PrintOrderViewModel", "Failed to sync draft " + ((m) bVar.p).getId() + " to cloud", thA2);
                }
                break;
        }
    }

    public void k(C2167f c2167f, O3.c cVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.p;
        if (!linkedHashMap.containsKey(c2167f)) {
            linkedHashMap.put(c2167f, new f(c2167f, cVar));
            return;
        }
        throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + p111z2.b.l(c2167f) + '.').toString());
    }

    @Override // g4.e
    public void l(k4.i call, x xVar) {
        String strJ;
        B3.o oVar = B3.o.f154a;
        Object obj = this.p;
        switch (this.f11587o) {
            case 27:
                o.f(call, "call");
                O0.n nVar = xVar.u;
                strJ = nVar != null ? nVar.j() : "";
                C2277b0 c2277b0 = (C2277b0) obj;
                if (!xVar.g()) {
                    B3.j jVarD = o4.d.d(new Exception("HTTP Error: " + xVar.f11402r));
                    p011c0.d dVar = PrintOrderViewModel.f10861f0;
                    Throwable thA = k.a(jVarD);
                    if (thA != null) {
                        Log.e("PrintOrderViewModel", "Failed to calculate server rates", thA);
                    }
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(strJ);
                        if (jSONObject.optBoolean("success", false) && jSONObject.has("data")) {
                            JSONArray jSONArrayOptJSONArray = jSONObject.getJSONObject("data").optJSONArray("items");
                            if (jSONArrayOptJSONArray == null) {
                                jSONArrayOptJSONArray = new JSONArray();
                            }
                            ArrayList arrayList = new ArrayList();
                            int length = jSONArrayOptJSONArray.length();
                            for (int i5 = 0; i5 < length; i5++) {
                                arrayList.add(Long.valueOf(jSONArrayOptJSONArray.getJSONObject(i5).optLong("price_paise", 0L)));
                            }
                            p011c0.d dVar2 = PrintOrderViewModel.f10861f0;
                            PrintOrderViewModel printOrderViewModel = c2277b0.p;
                            A.t(Q.h(printOrderViewModel), null, null, new T0(printOrderViewModel, arrayList, null), 3);
                            Throwable thA2 = k.a(arrayList);
                            if (thA2 != null) {
                                Log.e("PrintOrderViewModel", "Failed to calculate server rates", thA2);
                            }
                        } else {
                            B3.j jVarD2 = o4.d.d(new Exception("Failed to calculate price"));
                            p011c0.d dVar3 = PrintOrderViewModel.f10861f0;
                            Throwable thA3 = k.a(jVarD2);
                            if (thA3 != null) {
                                Log.e("PrintOrderViewModel", "Failed to calculate server rates", thA3);
                            }
                        }
                    } catch (Exception e) {
                        B3.j jVarD3 = o4.d.d(e);
                        p011c0.d dVar4 = PrintOrderViewModel.f10861f0;
                        Throwable thA4 = k.a(jVarD3);
                        if (thA4 != null) {
                            Log.e("PrintOrderViewModel", "Failed to calculate server rates", thA4);
                            return;
                        }
                        return;
                    }
                }
                break;
            case 28:
                o.f(call, "call");
                O0.n nVar2 = xVar.u;
                strJ = nVar2 != null ? nVar2.j() : "";
                C2291i0 c2291i0 = (C2291i0) obj;
                if (!xVar.g()) {
                    c2291i0.invoke(new k(o4.d.d(new Exception("HTTP Error: " + xVar.f11402r))));
                } else {
                    try {
                        JSONObject jSONObject2 = new JSONObject(strJ);
                        if (jSONObject2.optBoolean("success", false)) {
                            c2291i0.invoke(new k(oVar));
                        } else {
                            c2291i0.invoke(new k(o4.d.d(new Exception(jSONObject2.optString("error", "Failed to delete address")))));
                        }
                    } catch (Exception e3) {
                        c2291i0.invoke(new k(o4.d.d(e3)));
                        return;
                    }
                }
                break;
            default:
                o.f(call, "call");
                boolean zG = xVar.g();
                m mVar = (m) ((P0.b) obj).p;
                if (zG) {
                    Throwable thA5 = k.a(oVar);
                    if (thA5 != null) {
                        Log.e("PrintOrderViewModel", "Failed to sync draft " + mVar.getId() + " to cloud", thA5);
                    }
                } else {
                    O0.n nVar3 = xVar.u;
                    Throwable thA6 = k.a(o4.d.d(new Exception("Sync draft failed: ".concat(nVar3 != null ? nVar3.j() : ""))));
                    if (thA6 != null) {
                        Log.e("PrintOrderViewModel", "Failed to sync draft " + mVar.getId() + " to cloud", thA6);
                    }
                }
                break;
        }
    }

    public void m(String name, String value) {
        o.f(name, "name");
        o.f(value, "value");
        ArrayList arrayList = (ArrayList) this.p;
        arrayList.add(name);
        arrayList.add(W3.j.I0(value).toString());
    }

    public void n(String name, String value) {
        o.f(name, "name");
        o.f(value, "value");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = name.length();
        for (int i5 = 0; i5 < length; i5++) {
            char cCharAt = name.charAt(i5);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(h4.b.i("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i5), name).toString());
            }
        }
        m(name, value);
    }

    public p011c0.d o() {
        Collection initializers = ((LinkedHashMap) this.p).values();
        o.f(initializers, "initializers");
        f[] fVarArr = (f[]) initializers.toArray(new f[0]);
        return new p011c0.d((f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }

    public g4.m p() {
        return new g4.m((String[]) ((ArrayList) this.p).toArray(new String[0]));
    }

    public void r() {
        View view = (View) this.p;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void s() {
        ((s) this.p).f1603r.L();
    }

    public void t(String str) {
        int i5 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.p;
            if (i5 >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i5))) {
                arrayList.remove(i5);
                arrayList.remove(i5);
                i5 -= 2;
            }
            i5 += 2;
        }
    }

    public void u() {
        View viewFindViewById;
        View view = (View) this.p;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new N.e(viewFindViewById, 6));
    }

    public void v() {
        Z0 z3 = (Z0) this.p;
        z3.h();
        U uF = z3.f();
        C2236g0 c2236g0 = (C2236g0) z3.f12783a;
        c2236g0.f12686n.getClass();
        if (uF.p(System.currentTimeMillis())) {
            z3.f().f12551m.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                z3.j().f12479n.g("Detected application was in foreground");
                c2236g0.f12686n.getClass();
                z(System.currentTimeMillis());
            }
        }
    }

    public void w(long j5, boolean z3) {
        Z0 z4 = (Z0) this.p;
        z4.h();
        z4.r();
        if (z4.f().p(j5)) {
            z4.f().f12551m.a(true);
            o4.a();
            C2236g0 c2236g0 = (C2236g0) z4.f12783a;
            if (c2236g0.g.t(null, AbstractC2268x.f12962q0)) {
                c2236g0.p().t();
            }
        }
        z4.f().q.b(j5);
        if (z4.f().f12551m.b()) {
            z(j5);
        }
    }

    public boolean x() {
        C2236g0 c2236g0 = (C2236g0) this.p;
        if (!TextUtils.isEmpty(c2236g0.f12676b)) {
            return false;
        }
        L l5 = c2236g0.f12681i;
        C2236g0.d(l5);
        return l5.s(3);
    }

    public void y() throws IOException {
        ArrayDeque arrayDeque = (ArrayDeque) this.p;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + B());
    }

    public void z(long j5) {
        Z0 z3 = (Z0) this.p;
        z3.h();
        C2236g0 c2236g0 = (C2236g0) z3.f12783a;
        if (c2236g0.g()) {
            z3.f().q.b(j5);
            c2236g0.f12686n.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            L lJ = z3.j();
            lJ.f12479n.f(Long.valueOf(jElapsedRealtime), "Session started, time");
            long j6 = j5 / 1000;
            z3.k().r(j5, Long.valueOf(j6), "auto", "_sid");
            z3.f().f12554r.b(j6);
            z3.f().f12551m.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j6);
            z3.k().x("auto", "_s", j5, bundle);
            String strJ = z3.f().f12557w.j();
            if (TextUtils.isEmpty(strJ)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strJ);
            z3.k().x("auto", "_ssr", j5, bundle2);
        }
    }

    public c(int i5) {
        this.f11587o = i5;
        switch (i5) {
            case 10:
                this.p = new LinkedHashMap();
                break;
            case Matrix.TranslateX /* 12 */:
                this.p = new ArrayList(20);
                break;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                this.p = new ArrayDeque(16);
                break;
            default:
                this.p = new HashSet();
                break;
        }
    }

    public c(Context context) {
        boolean zIsEmpty;
        this.f11587o = 13;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.p = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
            }
        }
    }

    public c(h4.a aVar) {
        this.f11587o = 15;
        this.p = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
    }
}
