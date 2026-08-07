package p109z0;

import B0.d;
import H0.i;
import H0.j;
import I0.g;
import I0.n;
import I0.o;
import J0.k;
import J2.b;
import android.content.Context;
import android.database.Cursor;
import androidx.compose.foundation.text.modifiers.a;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.google.android.gms.internal.ads.AbstractC1421mz;
import com.google.android.gms.internal.ads.C0789Pb;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import p036i2.e;
import p062o0.h;
import p080t0.f;
import p090v1.u0;
import p102x3.S2;
import p104y0.m;
import p104y0.s;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final String f16065H = m.h("WorkerWrapper");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public C0789Pb f16066A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public u0 f16067B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ArrayList f16068C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public String f16069D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public k f16070E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public b f16071F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public volatile boolean f16072G;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Context f16073o;
    public String p;
    public List q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public e f16074r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public i f16075s;
    public ListenableWorker t;
    public e u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p104y0.l f16076v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p104y0.b f16077w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public b f16078x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public WorkDatabase f16079y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public j f16080z;

    public final void a(p104y0.l lVar) {
        boolean z3 = lVar instanceof p104y0.k;
        String str = f16065H;
        if (!z3) {
            if (lVar instanceof p104y0.j) {
                m.f().g(str, a.y("Worker result RETRY for ", this.f16069D), new Throwable[0]);
                c();
                return;
            }
            m.f().g(str, a.y("Worker result FAILURE for ", this.f16069D), new Throwable[0]);
            if (this.f16075s.c()) {
                d();
                return;
            } else {
                g();
                return;
            }
        }
        m.f().g(str, a.y("Worker result SUCCESS for ", this.f16069D), new Throwable[0]);
        if (this.f16075s.c()) {
            d();
            return;
        }
        C0789Pb c0789Pb = this.f16066A;
        String str2 = this.p;
        j jVar = this.f16080z;
        WorkDatabase workDatabase = this.f16079y;
        workDatabase.c();
        try {
            jVar.n(3, str2);
            jVar.l(str2, ((p104y0.k) this.f16076v).f15858a);
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str3 : c0789Pb.d(str2)) {
                if (jVar.e(str3) == 5) {
                    h hVarH = h.h(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                    if (str3 == null) {
                        hVarH.j(1);
                    } else {
                        hVarH.n(1, str3);
                    }
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c0789Pb.p;
                    workDatabase_Impl.b();
                    Cursor cursorG = workDatabase_Impl.g(hVarH);
                    try {
                        boolean z4 = cursorG.moveToFirst() && cursorG.getInt(0) != 0;
                        cursorG.close();
                        hVarH.p();
                        if (z4) {
                            m.f().g(str, "Setting status to enqueued for " + str3, new Throwable[0]);
                            jVar.n(1, str3);
                            jVar.m(str3, jCurrentTimeMillis);
                        }
                    } catch (Throwable th) {
                        cursorG.close();
                        hVarH.p();
                        throw th;
                    }
                }
            }
            workDatabase.h();
            workDatabase.f();
            e(false);
        } catch (Throwable th2) {
            workDatabase.f();
            e(false);
            throw th2;
        }
    }

    public final void b() {
        boolean zH = h();
        String str = this.p;
        WorkDatabase workDatabase = this.f16079y;
        if (!zH) {
            workDatabase.c();
            try {
                int iE = this.f16080z.e(str);
                F0.h hVarM = workDatabase.m();
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) hVarM.f395o;
                workDatabase_Impl.b();
                H0.e eVar = (H0.e) hVarM.q;
                f fVarA = eVar.a();
                if (str == null) {
                    fVarA.i(1);
                } else {
                    fVarA.j(1, str);
                }
                workDatabase_Impl.c();
                try {
                    fVarA.A();
                    workDatabase_Impl.h();
                    workDatabase_Impl.f();
                    eVar.c(fVarA);
                    if (iE == 0) {
                        e(false);
                    } else if (iE == 2) {
                        a(this.f16076v);
                    } else if (!S2.a(iE)) {
                        c();
                    }
                    workDatabase.h();
                    workDatabase.f();
                } catch (Throwable th) {
                    workDatabase_Impl.f();
                    eVar.c(fVarA);
                    throw th;
                }
            } catch (Throwable th2) {
                workDatabase.f();
                throw th2;
            }
        }
        List list = this.q;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((c) it.next()).d(str);
            }
            d.a(this.f16077w, workDatabase, list);
        }
    }

    public final void c() {
        String str = this.p;
        j jVar = this.f16080z;
        WorkDatabase workDatabase = this.f16079y;
        workDatabase.c();
        try {
            jVar.n(1, str);
            jVar.m(str, System.currentTimeMillis());
            jVar.j(str, -1L);
            workDatabase.h();
        } finally {
            workDatabase.f();
            e(true);
        }
    }

    public final void d() {
        String str = this.p;
        j jVar = this.f16080z;
        WorkDatabase workDatabase = this.f16079y;
        workDatabase.c();
        try {
            jVar.m(str, System.currentTimeMillis());
            jVar.n(1, str);
            jVar.k(str);
            jVar.j(str, -1L);
            workDatabase.h();
        } finally {
            workDatabase.f();
            e(false);
        }
    }

    public final void e(boolean z3) {
        ListenableWorker listenableWorker;
        this.f16079y.c();
        try {
            j jVarN = this.f16079y.n();
            jVarN.getClass();
            h hVarH = h.h(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
            WorkDatabase_Impl workDatabase_Impl = jVarN.f484a;
            workDatabase_Impl.b();
            Cursor cursorG = workDatabase_Impl.g(hVarH);
            try {
                boolean z4 = cursorG.moveToFirst() && cursorG.getInt(0) != 0;
                cursorG.close();
                hVarH.p();
                if (!z4) {
                    g.a(this.f16073o, RescheduleReceiver.class, false);
                }
                if (z3) {
                    this.f16080z.n(1, this.p);
                    this.f16080z.j(this.p, -1L);
                }
                if (this.f16075s != null && (listenableWorker = this.t) != null && listenableWorker.isRunInForeground()) {
                    b bVar = this.f16078x;
                    String str = this.p;
                    synchronized (bVar.f16038y) {
                        bVar.t.remove(str);
                        bVar.h();
                    }
                }
                this.f16079y.h();
                this.f16079y.f();
                this.f16070E.j(Boolean.valueOf(z3));
            } catch (Throwable th) {
                cursorG.close();
                hVarH.p();
                throw th;
            }
        } catch (Throwable th2) {
            this.f16079y.f();
            throw th2;
        }
    }

    public final void f() {
        j jVar = this.f16080z;
        String str = this.p;
        int iE = jVar.e(str);
        String str2 = f16065H;
        if (iE == 2) {
            m.f().c(str2, a.z("Status for ", str, " is RUNNING;not doing any work and rescheduling for later execution"), new Throwable[0]);
            e(true);
            return;
        }
        m mVarF = m.f();
        StringBuilder sbK = AbstractC1421mz.k("Status for ", str, " is ");
        sbK.append(S2.d(iE));
        sbK.append("; not doing any work");
        mVarF.c(str2, sbK.toString(), new Throwable[0]);
        e(false);
    }

    public final void g() {
        String str = this.p;
        WorkDatabase workDatabase = this.f16079y;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (!linkedList.isEmpty()) {
                String str2 = (String) linkedList.remove();
                j jVar = this.f16080z;
                if (jVar.e(str2) != 6) {
                    jVar.n(4, str2);
                }
                linkedList.addAll(this.f16066A.d(str2));
            }
            this.f16080z.l(str, ((p104y0.i) this.f16076v).f15857a);
            workDatabase.h();
        } finally {
            workDatabase.f();
            e(false);
        }
    }

    public final boolean h() {
        if (!this.f16072G) {
            return false;
        }
        m.f().c(f16065H, a.y("Work interrupted for ", this.f16069D), new Throwable[0]);
        int iE = this.f16080z.e(this.p);
        if (iE == 0) {
            e(false);
        } else {
            e(!S2.a(iE));
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00bd A[Catch: all -> 0x007c, TryCatch #3 {all -> 0x007c, blocks: (B:14:0x0052, B:17:0x005c, B:21:0x007f, B:23:0x0083, B:24:0x00a8, B:26:0x00ae, B:28:0x00b4, B:39:0x00fa, B:33:0x00bd, B:36:0x00cc, B:38:0x00d4), top: B:100:0x0052 }] */
    @Override // java.lang.Runnable
    public final void run() {
        i iVar;
        p104y0.h hVar;
        p104y0.f fVarA;
        u0 u0Var = this.f16067B;
        String str = this.p;
        ArrayList<String> arrayListB = u0Var.b(str);
        this.f16068C = arrayListB;
        StringBuilder sbK = AbstractC1421mz.k("Work [ id=", str, ", tags={ ");
        boolean z3 = true;
        for (String str2 : arrayListB) {
            if (z3) {
                z3 = false;
            } else {
                sbK.append(", ");
            }
            sbK.append(str2);
        }
        sbK.append(" } ]");
        this.f16069D = sbK.toString();
        j jVar = this.f16080z;
        if (h()) {
            return;
        }
        WorkDatabase workDatabase = this.f16079y;
        workDatabase.c();
        try {
            i iVarH = jVar.h(str);
            this.f16075s = iVarH;
            String str3 = f16065H;
            if (iVarH == null) {
                m.f().e(str3, "Didn't find WorkSpec for id " + str, new Throwable[0]);
                e(false);
                workDatabase.h();
            } else {
                if (iVarH.f471b == 1) {
                    if (iVarH.c()) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        iVar = this.f16075s;
                        if (iVar.f481n != 0) {
                            m.f().c(str3, "Delaying execution for " + this.f16075s.f472c + " because it is being executed before schedule.", new Throwable[0]);
                            e(true);
                            workDatabase.h();
                        }
                    } else {
                        i iVar2 = this.f16075s;
                        if (iVar2.f471b == 1 && iVar2.f478k > 0) {
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            iVar = this.f16075s;
                            if (iVar.f481n != 0 && jCurrentTimeMillis2 < iVar.a()) {
                                m.f().c(str3, "Delaying execution for " + this.f16075s.f472c + " because it is being executed before schedule.", new Throwable[0]);
                                e(true);
                                workDatabase.h();
                            }
                        }
                    }
                    workDatabase.h();
                    workDatabase.f();
                    boolean zC = this.f16075s.c();
                    p104y0.b bVar = this.f16077w;
                    if (zC) {
                        fVarA = this.f16075s.e;
                    } else {
                        p100x1.b bVar2 = bVar.f15837d;
                        String str4 = this.f16075s.f473d;
                        bVar2.getClass();
                        String str5 = p104y0.h.f15856a;
                        try {
                            hVar = (p104y0.h) Class.forName(str4).newInstance();
                        } catch (Exception e) {
                            m.f().e(p104y0.h.f15856a, a.y("Trouble instantiating + ", str4), e);
                            hVar = null;
                        }
                        if (hVar == null) {
                            m.f().e(str3, a.y("Could not create Input Merger ", this.f16075s.f473d), new Throwable[0]);
                            g();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.f16075s.e);
                        h hVarH = h.h(1, "SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                        if (str == null) {
                            hVarH.j(1);
                        } else {
                            hVarH.n(1, str);
                        }
                        WorkDatabase_Impl workDatabase_Impl = jVar.f484a;
                        workDatabase_Impl.b();
                        Cursor cursorG = workDatabase_Impl.g(hVarH);
                        try {
                            ArrayList arrayList2 = new ArrayList(cursorG.getCount());
                            while (cursorG.moveToNext()) {
                                arrayList2.add(p104y0.f.a(cursorG.getBlob(0)));
                            }
                            cursorG.close();
                            hVarH.p();
                            arrayList.addAll(arrayList2);
                            fVarA = hVar.a(arrayList);
                        } catch (Throwable th) {
                            cursorG.close();
                            hVarH.p();
                            throw th;
                        }
                    }
                    UUID uuidFromString = UUID.fromString(str);
                    ArrayList arrayList3 = this.f16068C;
                    int i5 = this.f16075s.f478k;
                    ExecutorService executorService = bVar.f15834a;
                    e eVar = this.u;
                    o oVar = new o(workDatabase, eVar);
                    n nVar = new n(workDatabase, this.f16078x, eVar);
                    WorkerParameters workerParameters = new WorkerParameters();
                    workerParameters.f2372a = uuidFromString;
                    workerParameters.f2373b = fVarA;
                    workerParameters.f2374c = new HashSet(arrayList3);
                    workerParameters.f2375d = this.f16074r;
                    workerParameters.e = i5;
                    workerParameters.f2376f = executorService;
                    workerParameters.g = eVar;
                    s sVar = bVar.f15836c;
                    workerParameters.f2377h = sVar;
                    workerParameters.f2378i = oVar;
                    workerParameters.f2379j = nVar;
                    if (this.t == null) {
                        this.t = sVar.a(this.f16073o, this.f16075s.f472c, workerParameters);
                    }
                    ListenableWorker listenableWorker = this.t;
                    if (listenableWorker == null) {
                        m.f().e(str3, a.y("Could not create Worker ", this.f16075s.f472c), new Throwable[0]);
                        g();
                        return;
                    }
                    if (listenableWorker.isUsed()) {
                        m.f().e(str3, a.z("Received an already-used Worker ", this.f16075s.f472c, "; WorkerFactory should return new instances"), new Throwable[0]);
                        g();
                        return;
                    }
                    this.t.setUsed();
                    workDatabase.c();
                    try {
                        boolean z4 = true;
                        if (jVar.e(str) == 1) {
                            jVar.n(2, str);
                            jVar.i(str);
                        } else {
                            z4 = false;
                        }
                        workDatabase.h();
                        workDatabase.f();
                        if (!z4) {
                            f();
                            return;
                        }
                        if (h()) {
                            return;
                        }
                        k kVar = new k();
                        I0.l lVar = new I0.l(this.f16073o, this.f16075s, this.t, nVar, this.u);
                        ((D.n) eVar.f11537r).execute(lVar);
                        k kVar2 = lVar.f527o;
                        kVar2.a(new d(18, this, kVar2, kVar, false), (D.n) eVar.f11537r);
                        kVar.a(new d(19, this, kVar, this.f16069D, false), (I0.i) eVar.p);
                        return;
                    } catch (Throwable th2) {
                        workDatabase.f();
                        throw th2;
                    }
                }
                f();
                workDatabase.h();
                m.f().c(str3, this.f16075s.f472c + " is not in ENQUEUED state. Nothing more to do.", new Throwable[0]);
            }
            workDatabase.f();
        } catch (Throwable th3) {
            workDatabase.f();
            throw th3;
        }
    }
}
