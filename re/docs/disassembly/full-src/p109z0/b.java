package p109z0;

import B0.d;
import D.n;
import I0.k;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.compose.foundation.text.modifiers.a;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p036i2.e;
import p104y0.g;
import p104y0.i;
import p104y0.m;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements a {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f16031z = m.h("Processor");
    public final Context p;
    public final p104y0.b q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f16033r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final WorkDatabase f16034s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List f16035v;
    public final HashMap u = new HashMap();
    public final HashMap t = new HashMap();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final HashSet f16036w = new HashSet();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f16037x = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PowerManager.WakeLock f16032o = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f16038y = new Object();

    public b(Context context, p104y0.b bVar, e eVar, WorkDatabase workDatabase, List list) {
        this.p = context;
        this.q = bVar;
        this.f16033r = eVar;
        this.f16034s = workDatabase;
        this.f16035v = list;
    }

    public static boolean b(String str, l lVar) {
        boolean zIsDone;
        if (lVar == null) {
            m.f().c(f16031z, a.y("WorkerWrapper could not be found for ", str), new Throwable[0]);
            return false;
        }
        lVar.f16072G = true;
        lVar.h();
        J2.b bVar = lVar.f16071F;
        if (bVar != null) {
            zIsDone = bVar.isDone();
            lVar.f16071F.cancel(true);
        } else {
            zIsDone = false;
        }
        ListenableWorker listenableWorker = lVar.t;
        if (listenableWorker == null || zIsDone) {
            m.f().c(l.f16065H, "WorkSpec " + lVar.f16075s + " is already done. Not interrupting.", new Throwable[0]);
        } else {
            listenableWorker.stop();
        }
        m.f().c(f16031z, a.y("WorkerWrapper interrupted for ", str), new Throwable[0]);
        return true;
    }

    public final void a(a aVar) {
        synchronized (this.f16038y) {
            this.f16037x.add(aVar);
        }
    }

    @Override // p109z0.a
    public final void c(String str, boolean z3) {
        synchronized (this.f16038y) {
            try {
                this.u.remove(str);
                m.f().c(f16031z, b.class.getSimpleName() + " " + str + " executed; reschedule = " + z3, new Throwable[0]);
                Iterator it = this.f16037x.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).c(str, z3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(String str) {
        boolean z3;
        synchronized (this.f16038y) {
            try {
                z3 = this.u.containsKey(str) || this.t.containsKey(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    public final void e(a aVar) {
        synchronized (this.f16038y) {
            this.f16037x.remove(aVar);
        }
    }

    public final void f(String str, g gVar) {
        synchronized (this.f16038y) {
            try {
                m.f().g(f16031z, "Moving WorkSpec (" + str + ") to the foreground", new Throwable[0]);
                l lVar = (l) this.u.remove(str);
                if (lVar != null) {
                    if (this.f16032o == null) {
                        PowerManager.WakeLock wakeLockA = k.a(this.p, "ProcessorForegroundLck");
                        this.f16032o = wakeLockA;
                        wakeLockA.acquire();
                    }
                    this.t.put(str, lVar);
                    Intent intentB = G0.a.b(this.p, str, gVar);
                    Context context = this.p;
                    if (Build.VERSION.SDK_INT >= 26) {
                        p103y.a.c(context, intentB);
                    } else {
                        context.startService(intentB);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean g(String str, e eVar) {
        synchronized (this.f16038y) {
            try {
                if (d(str)) {
                    m.f().c(f16031z, "Work " + str + " is already enqueued for processing", new Throwable[0]);
                    return false;
                }
                Context context = this.p;
                p104y0.b bVar = this.q;
                e eVar2 = this.f16033r;
                WorkDatabase workDatabase = this.f16034s;
                e eVar3 = new e(26);
                Context applicationContext = context.getApplicationContext();
                List list = this.f16035v;
                if (eVar == null) {
                    eVar = eVar3;
                }
                l lVar = new l();
                lVar.f16076v = new i();
                lVar.f16070E = new J0.k();
                lVar.f16071F = null;
                lVar.f16073o = applicationContext;
                lVar.u = eVar2;
                lVar.f16078x = this;
                lVar.p = str;
                lVar.q = list;
                lVar.f16074r = eVar;
                lVar.t = null;
                lVar.f16077w = bVar;
                lVar.f16079y = workDatabase;
                lVar.f16080z = workDatabase.n();
                lVar.f16066A = workDatabase.i();
                lVar.f16067B = workDatabase.o();
                J0.k kVar = lVar.f16070E;
                d dVar = new d(17);
                dVar.p = this;
                dVar.q = str;
                dVar.f124r = kVar;
                kVar.a(dVar, (n) this.f16033r.f11537r);
                this.u.put(str, lVar);
                ((I0.i) this.f16033r.p).execute(lVar);
                m.f().c(f16031z, a.m(b.class.getSimpleName(), ": processing ", str), new Throwable[0]);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (this.f16038y) {
            try {
                if (this.t.isEmpty()) {
                    Context context = this.p;
                    String str = G0.a.f438x;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.p.startService(intent);
                    } catch (Throwable th) {
                        m.f().e(f16031z, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f16032o;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f16032o = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean i(String str) {
        boolean zB;
        synchronized (this.f16038y) {
            m.f().c(f16031z, "Processor stopping foreground work " + str, new Throwable[0]);
            zB = b(str, (l) this.t.remove(str));
        }
        return zB;
    }

    public final boolean j(String str) {
        boolean zB;
        synchronized (this.f16038y) {
            m.f().c(f16031z, "Processor stopping background work " + str, new Throwable[0]);
            zB = b(str, (l) this.u.remove(str));
        }
        return zB;
    }
}
