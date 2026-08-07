package p085u1;

import P0.c;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.AbstractC0773Md;
import com.google.android.gms.internal.ads.AbstractC0803Rd;
import com.google.android.gms.internal.ads.AbstractC1223ib;
import com.google.android.gms.internal.ads.AbstractC1869x7;
import com.google.android.gms.internal.ads.C0743Hd;
import com.google.android.gms.internal.ads.C0785Od;
import com.google.android.gms.internal.ads.C1693t7;
import com.google.android.gms.internal.ads.C1823w5;
import com.google.android.gms.internal.ads.Es;
import com.google.android.gms.internal.ads.I4;
import com.google.android.gms.internal.ads.K4;
import com.google.android.gms.internal.ads.L4;
import com.google.android.gms.internal.ads.RunnableC1573qb;
import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC1781v7;
import java.io.File;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import p090v1.C2362o;
import p090v1.C2366q;
import p105y1.F;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements Runnable, K4 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f13287A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f13289C;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f13291r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f13292s;
    public final boolean t;
    public final ExecutorService u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c f13293v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Context f13294w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Context f13295x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C0785Od f13296y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C0785Od f13297z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Vector f13290o = new Vector();
    public final AtomicReference p = new AtomicReference();
    public final AtomicReference q = new AtomicReference();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final CountDownLatch f13288B = new CountDownLatch(1);

    public d(Context context, C0785Od c0785Od) {
        this.f13294w = context;
        this.f13295x = context;
        this.f13296y = c0785Od;
        this.f13297z = c0785Od;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.u = executorServiceNewCachedThreadPool;
        C1693t7 c1693t7 = AbstractC1869x7.f9778W1;
        C2366q c2366q = C2366q.f13480d;
        boolean zBooleanValue = ((Boolean) c2366q.f13483c.a(c1693t7)).booleanValue();
        this.f13287A = zBooleanValue;
        this.f13293v = c.f(context, executorServiceNewCachedThreadPool, zBooleanValue);
        C1693t7 c1693t8 = AbstractC1869x7.f9763T1;
        SharedPreferencesOnSharedPreferenceChangeListenerC1781v7 sharedPreferencesOnSharedPreferenceChangeListenerC1781v7 = c2366q.f13483c;
        this.f13292s = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1781v7.a(c1693t8)).booleanValue();
        this.t = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1781v7.a(AbstractC1869x7.f9783X1)).booleanValue();
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1781v7.a(AbstractC1869x7.f9773V1)).booleanValue()) {
            this.f13289C = 2;
        } else {
            this.f13289C = 1;
        }
        if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1781v7.a(AbstractC1869x7.f9769U2)).booleanValue()) {
            this.f13291r = i();
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1781v7.a(AbstractC1869x7.f9741O2)).booleanValue()) {
            AbstractC0803Rd.f5534a.execute(this);
            return;
        }
        C0743Hd c0743Hd = C2362o.f13474f.f13475a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            AbstractC0803Rd.f5534a.execute(this);
        } else {
            run();
        }
    }

    @Override // com.google.android.gms.internal.ads.K4
    public final void a(View view) {
        K4 k4K = k();
        if (k4K != null) {
            k4K.a(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.K4
    public final void b(StackTraceElement[] stackTraceElementArr) {
        K4 k4K;
        if (!j() || (k4K = k()) == null) {
            return;
        }
        k4K.b(stackTraceElementArr);
    }

    @Override // com.google.android.gms.internal.ads.K4
    public final String c(Context context) {
        K4 k4K;
        if (!j() || (k4K = k()) == null) {
            return "";
        }
        l();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return k4K.c(context);
    }

    @Override // com.google.android.gms.internal.ads.K4
    public final void d(int i5, int i6, int i7) {
        K4 k4K = k();
        if (k4K == null) {
            this.f13290o.add(new Object[]{Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7)});
        } else {
            l();
            k4K.d(i5, i6, i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.K4
    public final String e(Context context, String str, View view, Activity activity) {
        if (!j()) {
            return "";
        }
        K4 k4K = k();
        if (((Boolean) C2366q.f13480d.f13483c.a(AbstractC1869x7.l9)).booleanValue()) {
            F f5 = k.f13311A.f13314c;
            F.g(view, 4);
        }
        if (k4K == null) {
            return "";
        }
        l();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return k4K.e(context, str, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.K4
    public final void f(MotionEvent motionEvent) {
        K4 k4K = k();
        if (k4K == null) {
            this.f13290o.add(new Object[]{motionEvent});
        } else {
            l();
            k4K.f(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.K4
    public final String g(Context context, View view, Activity activity) {
        C1693t7 c1693t7 = AbstractC1869x7.k9;
        C2366q c2366q = C2366q.f13480d;
        boolean zBooleanValue = ((Boolean) c2366q.f13483c.a(c1693t7)).booleanValue();
        SharedPreferencesOnSharedPreferenceChangeListenerC1781v7 sharedPreferencesOnSharedPreferenceChangeListenerC1781v7 = c2366q.f13483c;
        if (!zBooleanValue) {
            K4 k4K = k();
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1781v7.a(AbstractC1869x7.l9)).booleanValue()) {
                F f5 = k.f13311A.f13314c;
                F.g(view, 2);
            }
            return k4K != null ? k4K.g(context, view, activity) : "";
        }
        if (!j()) {
            return "";
        }
        K4 k4K2 = k();
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1781v7.a(AbstractC1869x7.l9)).booleanValue()) {
            F f6 = k.f13311A.f13314c;
            F.g(view, 2);
        }
        return k4K2 != null ? k4K2.g(context, view, activity) : "";
    }

    @Override // com.google.android.gms.internal.ads.K4
    public final String h(Context context, String str, View view) {
        return e(context, str, view, null);
    }

    public final boolean i() {
        Context context = this.f13294w;
        p042j3.c cVar = new p042j3.c(this, 26);
        Es es = new Es(context, AbstractC0773Md.t(context, this.f13293v), cVar, ((Boolean) C2366q.f13480d.f13483c.a(AbstractC1869x7.f9768U1)).booleanValue());
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (Es.t) {
            try {
                C1823w5 c1823w5F = es.f(1);
                if (c1823w5F == null) {
                    es.e(4025, jCurrentTimeMillis);
                } else {
                    File fileC = es.c(c1823w5F.D());
                    if (!new File(fileC, "pcam.jar").exists()) {
                        es.e(4026, jCurrentTimeMillis);
                    } else {
                        if (new File(fileC, "pcbc").exists()) {
                            es.e(5019, jCurrentTimeMillis);
                            return true;
                        }
                        es.e(4027, jCurrentTimeMillis);
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean j() {
        try {
            this.f13288B.await();
            return true;
        } catch (InterruptedException e) {
            AbstractC1223ib.t("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    public final K4 k() {
        return ((!this.f13292s || this.f13291r) ? this.f13289C : 1) == 2 ? (K4) this.q.get() : (K4) this.p.get();
    }

    public final void l() {
        Vector<Object[]> vector = this.f13290o;
        K4 k4K = k();
        if (vector.isEmpty() || k4K == null) {
            return;
        }
        for (Object[] objArr : vector) {
            int length = objArr.length;
            if (length == 1) {
                k4K.f((MotionEvent) objArr[0]);
            } else if (length == 3) {
                k4K.d(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        vector.clear();
    }

    public final void m(boolean z3) {
        String str = this.f13296y.f5227o;
        Context context = this.f13294w;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        L4.t(context, z3);
        this.p.set(new L4(context, str, z3));
    }

    @Override // java.lang.Runnable
    public final void run() {
        I4 i4I;
        boolean z3;
        try {
            C1693t7 c1693t7 = AbstractC1869x7.f9769U2;
            C2366q c2366q = C2366q.f13480d;
            if (((Boolean) c2366q.f13483c.a(c1693t7)).booleanValue()) {
                this.f13291r = i();
            }
            boolean z4 = this.f13296y.f5228r;
            boolean z5 = false;
            if (!((Boolean) c2366q.f13483c.a(AbstractC1869x7.f9729M0)).booleanValue() && z4) {
                z5 = true;
            }
            if (((!this.f13292s || this.f13291r) ? this.f13289C : 1) == 1) {
                m(z5);
                if (this.f13289C == 2) {
                    this.u.execute(new RunnableC1573qb(4, z5, this));
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    String str = this.f13296y.f5227o;
                    Context context = this.f13294w;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    boolean z6 = this.f13287A;
                    synchronized (I4.class) {
                        i4I = I4.i(str, context, Executors.newCachedThreadPool(), z5, z6);
                    }
                    this.q.set(i4I);
                    if (this.t) {
                        synchronized (i4I) {
                            z3 = i4I.f4138D;
                        }
                        if (!z3) {
                            this.f13289C = 1;
                            m(z5);
                        }
                    }
                } catch (NullPointerException e) {
                    this.f13289C = 1;
                    m(z5);
                    this.f13293v.m(2031, System.currentTimeMillis() - jCurrentTimeMillis, e);
                }
            }
            this.f13288B.countDown();
            this.f13294w = null;
            this.f13296y = null;
        } catch (Throwable th) {
            this.f13288B.countDown();
            this.f13294w = null;
            this.f13296y = null;
            throw th;
        }
    }
}
