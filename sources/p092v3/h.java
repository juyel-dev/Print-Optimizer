package p092v3;

import B3.k;
import C3.I;
import C3.u;
import G3.a;
import H3.c;
import I.m;
import I.n;
import X3.A;
import X3.H;
import a4.AbstractC0211j;
import a4.F;
import a4.T;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import com.notescrafter.service.NotesCrafterFCMService;
import e4.d;
import e4.e;
import g4.s;
import g4.t;
import h4.b;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final p046k2.h f13519y = new p046k2.h(28);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static volatile h f13520z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f13522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f13523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T f13524d;
    public final F e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final T f13525f;
    public final F g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final T f13526h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final F f13527i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final T f13528j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final F f13529k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final T f13530l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final F f13531m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final T f13532n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final F f13533o;
    public final T p;
    public final F q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final T f13534r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final T f13535s;
    public final F t;
    public final T u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final F f13536v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final T f13537w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final F f13538x;

    public h(Context context) {
        this.f13521a = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("auth_prefs", 0);
        o.e(sharedPreferences, "getSharedPreferences(...)");
        this.f13522b = sharedPreferences;
        s sVar = new s();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        sVar.a(15L, timeUnit);
        sVar.f11357s = b.b(15L, timeUnit);
        this.f13523c = new t(sVar);
        T tB = AbstractC0211j.b(Boolean.valueOf(sharedPreferences.getBoolean("is_logged_in", false)));
        this.f13524d = tB;
        this.e = new F(tB);
        T tB2 = AbstractC0211j.b(Boolean.valueOf(sharedPreferences.getBoolean("is_premium", false)));
        this.f13525f = tB2;
        this.g = new F(tB2);
        T tB3 = AbstractC0211j.b(sharedPreferences.getString("user_name", null));
        this.f13526h = tB3;
        this.f13527i = new F(tB3);
        T tB4 = AbstractC0211j.b(sharedPreferences.getString("user_email", null));
        this.f13528j = tB4;
        this.f13529k = new F(tB4);
        T tB5 = AbstractC0211j.b(sharedPreferences.getString("user_photo", null));
        this.f13530l = tB5;
        this.f13531m = new F(tB5);
        T tB6 = AbstractC0211j.b(sharedPreferences.getString("subscription_plan", null));
        this.f13532n = tB6;
        this.f13533o = new F(tB6);
        T tB7 = AbstractC0211j.b(Integer.valueOf(sharedPreferences.getInt("remaining_days", 0)));
        this.p = tB7;
        this.q = new F(tB7);
        this.f13534r = AbstractC0211j.b(sharedPreferences.getString("print_first_login_at", null));
        T tB8 = AbstractC0211j.b(Boolean.valueOf(sharedPreferences.getBoolean("first_order_diamond_deal_eligible", false)));
        this.f13535s = tB8;
        this.t = new F(tB8);
        T tB9 = AbstractC0211j.b(Boolean.FALSE);
        this.u = tB9;
        this.f13536v = new F(tB9);
        T tB10 = AbstractC0211j.b(I.L(new B3.h("guest", new B3.h(Double.valueOf(1.25d), Double.valueOf(3.35d))), new B3.h("monthly", new B3.h(Double.valueOf(1.15d), Double.valueOf(3.0d))), new B3.h("half_yearly", new B3.h(Double.valueOf(1.05d), Double.valueOf(2.75d))), new B3.h("annual", new B3.h(Double.valueOf(0.99d), Double.valueOf(2.35d))), new B3.h("lifetime", new B3.h(Double.valueOf(0.89d), Double.valueOf(1.99d)))));
        this.f13537w = tB10;
        this.f13538x = new F(tB10);
        e eVar = H.f1766a;
        d dVar = d.f11107o;
        A.t(A.a(dVar), null, null, new a(this, null), 3);
        if (((Boolean) tB.getValue()).booleanValue()) {
            A.t(A.a(dVar), null, null, new b(this, null), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, c cVar) throws Throwable {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i5 = cVar2.q;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                cVar2.q = i5 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objC = cVar2.f13513o;
        a aVar = a.f448o;
        int i6 = cVar2.q;
        if (i6 == 0) {
            o4.d.y(objC);
            e eVar = H.f1766a;
            d dVar = d.f11107o;
            d dVar2 = new d(this, str, null);
            cVar2.q = 1;
            objC = A.C(dVar, dVar2, cVar2);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o4.d.y(objC);
        }
        return ((k) objC).f150o;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v17 */
    public final Object b(Context context, c cVar) throws Throwable {
        g gVar;
        h hVar;
        Object objA;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i5 = gVar.f13518r;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                gVar.f13518r = i5 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objA2 = gVar.p;
        a aVar = a.f448o;
        int i6 = gVar.f13518r;
        try {
            if (i6 != 0) {
                if (i6 == 1) {
                    hVar = gVar.f13517o;
                    o4.d.y(objA2);
                } else {
                    if (i6 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hVar = gVar.f13517o;
                    o4.d.y(objA2);
                    objA = ((k) objA2).f150o;
                }
                T t = hVar.u;
                Boolean bool = Boolean.FALSE;
                t.getClass();
                t.j(null, bool);
                return objA;
            }
            o4.d.y(objA2);
            Boolean bool2 = Boolean.TRUE;
            T t5 = this.u;
            t5.getClass();
            t5.j(null, bool2);
            try {
                try {
                    o.f(context, "context");
                    try {
                        p106y2.a aVar2 = new p106y2.a();
                        try {
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(aVar2);
                                try {
                                    n nVar = new n(u.I0(arrayList));
                                    gVar.f13517o = this;
                                    gVar.f13518r = 1;
                                    objA2 = I.e.a(context, nVar, gVar);
                                    if (objA2 == aVar) {
                                        return aVar;
                                    }
                                    hVar = this;
                                } catch (J.e e) {
                                    e = e;
                                    e = e;
                                    context = this;
                                    T t6 = context.u;
                                    Boolean bool3 = Boolean.FALSE;
                                    t6.getClass();
                                    t6.j(null, bool3);
                                    Log.e("AuthManager", "Sign-in failed", e);
                                    return o4.d.d(new Exception(androidx.compose.foundation.text.modifiers.a.y("Sign-in failed: ", e.getMessage())));
                                } catch (Exception e3) {
                                    e = e3;
                                    e = e;
                                    context = this;
                                    T t7 = context.u;
                                    Boolean bool4 = Boolean.FALSE;
                                    t7.getClass();
                                    t7.j(null, bool4);
                                    Log.e("AuthManager", "Unexpected error during sign-in", e);
                                    return o4.d.d(e);
                                }
                            } catch (J.e e5) {
                                e = e5;
                                context = this;
                                T t8 = context.u;
                                Boolean bool5 = Boolean.FALSE;
                                t8.getClass();
                                t8.j(null, bool5);
                                Log.e("AuthManager", "Sign-in failed", e);
                                return o4.d.d(new Exception(androidx.compose.foundation.text.modifiers.a.y("Sign-in failed: ", e.getMessage())));
                            } catch (Exception e6) {
                                e = e6;
                                context = this;
                                T t9 = context.u;
                                Boolean bool6 = Boolean.FALSE;
                                t9.getClass();
                                t9.j(null, bool6);
                                Log.e("AuthManager", "Unexpected error during sign-in", e);
                                return o4.d.d(e);
                            }
                        } catch (J.e e7) {
                            e = e7;
                        } catch (Exception e8) {
                            e = e8;
                        }
                    } catch (J.e e9) {
                        e = e9;
                    } catch (Exception e10) {
                        e = e10;
                    }
                } catch (J.c unused) {
                    context = this;
                    T t10 = context.u;
                    Boolean bool7 = Boolean.FALSE;
                    t10.getClass();
                    t10.j(null, bool7);
                    Log.d("AuthManager", "Sign-in cancelled by user");
                    return o4.d.d(new Exception("Sign-in cancelled"));
                }
            } catch (J.e e11) {
                e = e11;
            } catch (Exception e12) {
                e = e12;
            }
            I.c cVar2 = ((I.o) objA2).f512a;
            if (!(cVar2 instanceof m) || !((String) cVar2.f504a).equals("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL")) {
                T t11 = hVar.u;
                Boolean bool8 = Boolean.FALSE;
                t11.getClass();
                t11.j(null, bool8);
                return o4.d.d(new Exception("Unexpected credential type"));
            }
            String str = o4.d.f((Bundle) cVar2.f505b).f15977c;
            hVar.getClass();
            Log.d("AuthManager", "Got Google idToken, sending to backend...");
            gVar.f13517o = hVar;
            gVar.f13518r = 2;
            objA = hVar.a(str, gVar);
            if (objA == aVar) {
                return aVar;
            }
            T t12 = hVar.u;
            Boolean bool9 = Boolean.FALSE;
            t12.getClass();
            t12.j(null, bool9);
            return objA;
        } catch (J.c unused2) {
        } catch (J.e e13) {
            e = e13;
        } catch (Exception e14) {
            e = e14;
        }
    }

    public final void c() {
        String string;
        int i5 = NotesCrafterFCMService.f10915v;
        SharedPreferences sharedPreferences = this.f13521a.getSharedPreferences("auth_prefs", 0);
        String string2 = sharedPreferences.getString("jwt", null);
        if (string2 != null && (string = sharedPreferences.getString("fcm_token", null)) != null) {
            e eVar = H.f1766a;
            A.t(A.a(d.f11107o), null, null, new k(string2, sharedPreferences, string, null), 3);
        }
        this.f13522b.edit().clear().apply();
        Boolean bool = Boolean.FALSE;
        T t = this.f13524d;
        t.getClass();
        t.j(null, bool);
        T t5 = this.f13525f;
        t5.getClass();
        t5.j(null, bool);
        this.f13526h.i(null);
        this.f13528j.i(null);
        this.f13530l.i(null);
        this.f13532n.i(null);
        T t6 = this.p;
        t6.getClass();
        t6.j(null, 0);
        this.f13534r.i(null);
        T t7 = this.f13535s;
        t7.getClass();
        t7.j(null, bool);
        Log.d("AuthManager", "Signed out");
    }
}
