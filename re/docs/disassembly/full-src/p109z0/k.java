package p109z0;

import H0.j;
import I.d;
import I0.f;
import I0.i;
import android.app.ActivityManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.notescrafter.app.R;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import o4.l;
import p034i.a;
import p036i2.e;
import p046k2.h;
import p062o0.g;
import p104y0.b;
import p104y0.m;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends l {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static k f16055j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static k f16056k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Object f16057l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f16059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WorkDatabase f16060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f16061d;
    public final List e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f16062f;
    public final f g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16063h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f16064i;

    static {
        m.h("WorkManagerImpl");
        f16055j = null;
        f16056k = null;
        f16057l = new Object();
    }

    public k(Context context, b bVar, e eVar) {
        p062o0.f fVar;
        Executor executor;
        String str;
        boolean z3 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        i iVar = (i) eVar.p;
        int i5 = WorkDatabase.f2381k;
        if (z3) {
            fVar = new p062o0.f(applicationContext, null);
            fVar.g = true;
        } else {
            String str2 = j.f16053a;
            fVar = new p062o0.f(applicationContext, "androidx.work.workdb");
            fVar.f12070f = new p003a2.b(applicationContext);
        }
        fVar.f12069d = iVar;
        f fVar2 = new f();
        if (fVar.f12068c == null) {
            fVar.f12068c = new ArrayList();
        }
        fVar.f12068c.add(fVar2);
        fVar.a(i.f16048a);
        fVar.a(new h(applicationContext, 2, 3));
        fVar.a(i.f16049b);
        fVar.a(i.f16050c);
        fVar.a(new h(applicationContext, 5, 6));
        fVar.a(i.f16051d);
        fVar.a(i.e);
        fVar.a(i.f16052f);
        fVar.a(new h(applicationContext));
        fVar.a(new h(applicationContext, 10, 11));
        fVar.a(i.g);
        fVar.f12071h = false;
        fVar.f12072i = true;
        Context context2 = fVar.f12067b;
        if (context2 == null) {
            throw new IllegalArgumentException("Cannot provide null context for the database.");
        }
        Executor executor2 = fVar.f12069d;
        if (executor2 == null && fVar.e == null) {
            d dVar = a.q;
            fVar.e = dVar;
            fVar.f12069d = dVar;
        } else if (executor2 != null && fVar.e == null) {
            fVar.e = executor2;
        } else if (executor2 == null && (executor = fVar.e) != null) {
            fVar.f12069d = executor;
        }
        if (fVar.f12070f == null) {
            fVar.f12070f = new h(23);
        }
        p077s0.a aVar = fVar.f12070f;
        ArrayList arrayList = fVar.f12068c;
        boolean z4 = fVar.g;
        ActivityManager activityManager = (ActivityManager) context2.getSystemService("activity");
        int i6 = (activityManager == null || activityManager.isLowRamDevice()) ? 2 : 3;
        Executor executor3 = fVar.f12069d;
        int i7 = i6;
        p062o0.a aVar2 = new p062o0.a(context2, fVar.f12066a, aVar, fVar.f12073j, arrayList, z4, i7, executor3, fVar.e, fVar.f12071h, fVar.f12072i);
        String name = WorkDatabase.class.getPackage().getName();
        String canonicalName = WorkDatabase.class.getCanonicalName();
        String str3 = (name.isEmpty() ? canonicalName : canonicalName.substring(name.length() + 1)).replace('.', '_') + "_Impl";
        try {
            if (name.isEmpty()) {
                str = str3;
            } else {
                str = name + "." + str3;
            }
            g gVar = (g) Class.forName(str).newInstance();
            p077s0.b bVarE = gVar.e(aVar2);
            gVar.f12077c = bVarE;
            if (bVarE instanceof p062o0.i) {
                ((p062o0.i) bVarE).getClass();
            }
            boolean z5 = i7 == 3;
            bVarE.setWriteAheadLoggingEnabled(z5);
            gVar.g = arrayList;
            gVar.f12076b = executor3;
            new ArrayDeque();
            gVar.e = z4;
            gVar.f12079f = z5;
            WorkDatabase workDatabase = (WorkDatabase) gVar;
            Context applicationContext2 = context.getApplicationContext();
            m mVar = new m(bVar.f15838f, 0);
            synchronized (m.class) {
                m.q = mVar;
            }
            String str4 = d.f16039a;
            C0.d dVar2 = new C0.d(applicationContext2, this);
            I0.g.a(applicationContext2, SystemJobService.class, true);
            m.f().c(d.f16039a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            List listAsList = Arrays.asList(dVar2, new A0.b(applicationContext2, bVar, eVar, this));
            b bVar2 = new b(context, bVar, eVar, workDatabase, listAsList);
            Context applicationContext3 = context.getApplicationContext();
            this.f16058a = applicationContext3;
            this.f16059b = bVar;
            this.f16061d = eVar;
            this.f16060c = workDatabase;
            this.e = listAsList;
            this.f16062f = bVar2;
            this.g = new f(workDatabase);
            this.f16063h = false;
            if (applicationContext3.isDeviceProtectedStorage()) {
                throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
            }
            this.f16061d.o(new I0.e(applicationContext3, this));
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("cannot find implementation for " + WorkDatabase.class.getCanonicalName() + ". " + str3 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor" + WorkDatabase.class.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + WorkDatabase.class.getCanonicalName());
        }
    }

    public static k y(Context context) {
        k kVar;
        Object obj = f16057l;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    try {
                        kVar = f16055j;
                        if (kVar == null) {
                            kVar = f16056k;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return kVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (kVar != null) {
            return kVar;
        }
        context.getApplicationContext();
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    public static void z(Context context, b bVar) {
        synchronized (f16057l) {
            try {
                k kVar = f16055j;
                if (kVar != null && f16056k != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (kVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f16056k == null) {
                        f16056k = new k(applicationContext, bVar, new e(bVar.f15835b));
                    }
                    f16055j = f16056k;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void A() {
        synchronized (f16057l) {
            try {
                this.f16063h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f16064i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f16064i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void B() {
        ArrayList arrayListE;
        WorkDatabase workDatabase = this.f16060c;
        Context context = this.f16058a;
        String str = C0.d.f161s;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (arrayListE = C0.d.e(context, jobScheduler)) != null && !arrayListE.isEmpty()) {
            Iterator it = arrayListE.iterator();
            while (it.hasNext()) {
                C0.d.c(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        j jVarN = workDatabase.n();
        WorkDatabase_Impl workDatabase_Impl = jVarN.f484a;
        workDatabase_Impl.b();
        H0.e eVar = jVarN.f490i;
        p080t0.f fVarA = eVar.a();
        workDatabase_Impl.c();
        try {
            fVarA.f12377r.executeUpdateDelete();
            workDatabase_Impl.h();
            workDatabase_Impl.f();
            eVar.c(fVarA);
            d.a(this.f16059b, workDatabase, this.e);
        } catch (Throwable th) {
            workDatabase_Impl.f();
            eVar.c(fVarA);
            throw th;
        }
    }

    public final void C(String str, e eVar) {
        e eVar2 = this.f16061d;
        B0.d dVar = new B0.d(5);
        dVar.p = this;
        dVar.q = str;
        dVar.f124r = eVar;
        eVar2.o(dVar);
    }

    public final void D(String str) {
        this.f16061d.o(new I0.j(this, str, false));
    }
}
