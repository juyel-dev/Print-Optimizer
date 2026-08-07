package p105y1;

import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC1223ib;
import com.google.android.gms.internal.ads.AbstractC1869x7;
import com.google.android.gms.internal.ads.C0761Kd;
import com.google.android.gms.internal.ads.C1865x3;
import com.google.android.gms.internal.ads.J3;
import com.google.android.gms.internal.ads.P4;
import com.google.android.gms.internal.ads.T3;
import com.google.android.gms.internal.measurement.C;
import com.google.android.gms.internal.measurement.H1;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import p090v1.C2358m;
import p090v1.C2366q;

/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static J3 f15962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f15963b = new Object();

    public t(Context context) {
        J3 j5;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f15963b) {
            try {
                if (f15962a == null) {
                    AbstractC1869x7.a(context);
                    if (((Boolean) C2366q.f13480d.f13483c.a(AbstractC1869x7.f9747P3)).booleanValue()) {
                        j5 = new J3(new T3(new File(context.getCacheDir(), "admob_volley")), new C2800k(context));
                        j5.d();
                    } else {
                        j5 = new J3(new T3(new H1(context.getApplicationContext(), 10)), new P4(6));
                        j5.d();
                    }
                    f15962a = j5;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static r a(int i5, String str, HashMap map, byte[] bArr) {
        r rVar = new r();
        C c5 = new C(7, str, false, rVar);
        C0761Kd c0761Kd = new C0761Kd();
        q qVar = new q(i5, str, rVar, c5, bArr, map, c0761Kd);
        if (C0761Kd.c()) {
            try {
                Map mapC = qVar.c();
                if (bArr == null) {
                    bArr = null;
                }
                if (C0761Kd.c()) {
                    c0761Kd.d("onNetworkRequest", new C2358m(str, "GET", mapC, bArr));
                }
            } catch (C1865x3 e) {
                AbstractC1223ib.s(e.getMessage());
            }
        }
        f15962a.b(qVar);
        return rVar;
    }
}
