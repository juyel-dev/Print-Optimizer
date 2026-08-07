package p096w2;

import A2.t;
import T1.z;
import Y1.c;
import Y1.d;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p103y.b;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f13594n = TimeUnit.DAYS.toMillis(366);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static volatile ScheduledExecutorService f13595o = null;
    public static final Object p = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f13597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ScheduledFuture f13599d;
    public long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f13600f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p068p2.a f13601h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Y1.a f13602i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f13603j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f13604k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicInteger f13605l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ScheduledExecutorService f13606m;

    public a(Context context) {
        boolean zBooleanValue;
        String packageName = context.getPackageName();
        this.f13596a = new Object();
        this.f13598c = 0;
        this.f13600f = new HashSet();
        this.g = true;
        this.f13602i = Y1.a.f1848a;
        this.f13604k = new HashMap();
        this.f13605l = new AtomicInteger(0);
        z.f("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f13601h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f13603j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.f13603j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new t(sb.toString());
        }
        this.f13597b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = d.f1858a;
        synchronized (d.class) {
            Boolean bool = d.f1860c;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = b.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
                d.f1860c = Boolean.valueOf(zBooleanValue);
            }
        }
        if (zBooleanValue) {
            int i5 = c.f1857a;
            packageName = packageName == null || packageName.trim().isEmpty() ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfoA = p003a2.c.a(context).a(0, packageName);
                    if (applicationInfoA == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i6 = applicationInfoA.uid;
                        workSource = new WorkSource();
                        Method method2 = d.f1859b;
                        if (method2 != null) {
                            try {
                                method2.invoke(workSource, Integer.valueOf(i6), packageName);
                            } catch (Exception e) {
                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                            }
                        } else {
                            Method method3 = d.f1858a;
                            if (method3 != null) {
                                try {
                                    method3.invoke(workSource, Integer.valueOf(i6));
                                } catch (Exception e3) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e3);
                                }
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                }
            }
            if (workSource != null) {
                try {
                    this.f13597b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e5) {
                    Log.wtf("WakeLock", e5.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f13595o;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (p) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f13595o;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f13595o = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f13606m = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public final void a(long j5) {
        this.f13605l.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f13594n), 1L);
        if (j5 > 0) {
            jMax = Math.min(j5, jMax);
        }
        synchronized (this.f13596a) {
            try {
                if (!b()) {
                    this.f13601h = p068p2.a.f12282o;
                    this.f13597b.acquire();
                    this.f13602i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f13598c++;
                if (this.g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f13604k.get(null);
                if (bVar == null) {
                    bVar = new b();
                    this.f13604k.put(null, bVar);
                }
                bVar.f13607a++;
                this.f13602i.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j6 = Long.MAX_VALUE - jElapsedRealtime > jMax ? jElapsedRealtime + jMax : Long.MAX_VALUE;
                if (j6 > this.e) {
                    this.e = j6;
                    ScheduledFuture scheduledFuture = this.f13599d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f13599d = this.f13606m.schedule(new L0.a(this, 19), jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z3;
        synchronized (this.f13596a) {
            z3 = this.f13598c > 0;
        }
        return z3;
    }

    public final void c() {
        if (this.f13605l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f13603j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f13596a) {
            try {
                if (this.g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f13604k.containsKey(null)) {
                    b bVar = (b) this.f13604k.get(null);
                    if (bVar != null) {
                        int i5 = bVar.f13607a - 1;
                        bVar.f13607a = i5;
                        if (i5 == 0) {
                            this.f13604k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f13603j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f13600f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public final void e() {
        synchronized (this.f13596a) {
            try {
                if (b()) {
                    if (this.g) {
                        int i5 = this.f13598c - 1;
                        this.f13598c = i5;
                        if (i5 > 0) {
                            return;
                        }
                    } else {
                        this.f13598c = 0;
                    }
                    d();
                    Iterator it = this.f13604k.values().iterator();
                    while (it.hasNext()) {
                        ((b) it.next()).f13607a = 0;
                    }
                    this.f13604k.clear();
                    ScheduledFuture scheduledFuture = this.f13599d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f13599d = null;
                        this.e = 0L;
                    }
                    if (this.f13597b.isHeld()) {
                        try {
                            try {
                                this.f13597b.release();
                                if (this.f13601h != null) {
                                    this.f13601h = null;
                                }
                            } catch (RuntimeException e) {
                                if (!e.getClass().equals(RuntimeException.class)) {
                                    throw e;
                                }
                                Log.e("WakeLock", String.valueOf(this.f13603j).concat(" failed to release!"), e);
                                if (this.f13601h != null) {
                                    this.f13601h = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.f13601h != null) {
                                this.f13601h = null;
                            }
                            throw th;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f13603j).concat(" should be held!"));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
