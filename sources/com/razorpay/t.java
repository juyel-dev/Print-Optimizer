package com.razorpay;

import C3.z;
import O0.n;
import Q3.a;
import X3.A;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.Q;
import com.google.android.gms.internal.measurement.C2117x;
import com.notescrafter.PrintOrderViewModel;
import g4.p;
import g4.t;
import g4.v;
import g4.x;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.regex.Pattern;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;
import p036i2.e;
import p083t3.C2275a0;
import p083t3.X0;
import p083t3.Y0;
import p111z2.b;
import t4.j;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f10931o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f10932r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f10933s;

    public /* synthetic */ t(Object obj, Object obj2, Object obj3, Object obj4, int i5) {
        this.f10931o = i5;
        this.p = obj;
        this.q = obj2;
        this.f10932r = obj3;
        this.f10933s = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:133:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x03ae  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        PrintOrderViewModel printOrderViewModel;
        Object obj;
        String str;
        Throwable thA;
        C2117x c2117x;
        final C2117x c2117x2;
        Object obj2 = this.f10933s;
        Object obj3 = this.f10932r;
        Object obj4 = this.q;
        Object obj5 = this.p;
        switch (this.f10931o) {
            case 0:
                RazorpayInitializer$O$$$__o0Oo.m6711onActivityResumed$lambda2((Context) obj5, (Application) obj4, (RazorpayInitializer$O$$$__o0Oo) obj3, (Handler) obj2);
                break;
            default:
                File file = (File) obj5;
                final C2275a0 c2275a0 = (C2275a0) obj4;
                C2117x c2117x3 = (C2117x) obj3;
                C2275a0 c2275a1 = (C2275a0) obj2;
                String str2 = c2275a1.q;
                PrintOrderViewModel printOrderViewModel2 = c2275a1.p;
                String str3 = "data";
                String str4 = "success";
                try {
                    long length = file.length();
                    final int iCeil = (int) Math.ceil(length / 10485760);
                    c2275a0.invoke(2);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("filename", file.getName());
                    jSONObject.put("fileSize", length);
                    String string = jSONObject.toString();
                    kotlin.jvm.internal.o.e(string, "toString(...)");
                    Pattern pattern = g4.p.f11330d;
                    v vVarG = p003a2.a.g(string, p111z2.b.k("application/json"));
                    c2117x3.getClass();
                    g4.t tVar = (g4.t) c2117x3.q;
                    M0.b bVarC = c2117x3.c("https://notescrafter.com/api/print/upload-pdf/init");
                    bVarC.i("POST", vVarG);
                    x xVarF = tVar.a(bVarC.d()).f();
                    O0.n nVar = xVarF.u;
                    String strJ = nVar != null ? nVar.j() : "";
                    int i5 = xVarF.f11402r;
                    xVarF.close();
                    String str5 = "toString(...)";
                    if (!xVarF.g()) {
                        B3.j jVarD = o4.d.d(new Exception(C2117x.i(strJ, i5, "Initialisation failed")));
                        p011c0.d dVar = PrintOrderViewModel.f10861f0;
                        Throwable thA2 = B3.k.a(jVarD);
                        if (thA2 != null) {
                            A.t(Q.h(printOrderViewModel2), null, null, new Y0(printOrderViewModel2, str2, thA2, null), 3);
                        }
                    } else {
                        JSONObject jSONObject2 = new JSONObject(strJ);
                        if (jSONObject2.optBoolean("success", false)) {
                            JSONObject jSONObject3 = jSONObject2.getJSONObject("data");
                            String str6 = "uploadId";
                            final String string2 = jSONObject3.getString(str6);
                            g4.t tVar2 = tVar;
                            String str7 = "fileKey";
                            final String string3 = jSONObject3.getString(str7);
                            c2275a0.invoke(5);
                            ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(3);
                            try {
                                ArrayList arrayList = new ArrayList();
                                final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                ArrayList arrayList2 = arrayList;
                                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                                ExecutorService executorService = executorServiceNewFixedThreadPool;
                                final kotlin.jvm.internal.A a5 = new kotlin.jvm.internal.A();
                                final E e = new E();
                                int i6 = 0;
                                while (i6 < iCeil) {
                                    final int i7 = i6 + 1;
                                    String str8 = str3;
                                    final CopyOnWriteArrayList copyOnWriteArrayList2 = copyOnWriteArrayList;
                                    c2117x2 = c2117x3;
                                    final long j5 = ((long) i6) * 10485760;
                                    try {
                                        final long jMin = Math.min(10485760L, length - j5);
                                        final long j6 = length;
                                        String str9 = str5;
                                        final File file2 = file;
                                        String str10 = str4;
                                        File file3 = file;
                                        String str11 = str7;
                                        String str12 = str6;
                                        g4.t tVar3 = tVar2;
                                        str = str2;
                                        final int i8 = i6;
                                        try {
                                            Runnable runnable = new Runnable() { // from class: v3.r
                                                /* JADX WARN: Code duplicated, block: B:64:0x01c5 A[Catch: all -> 0x01ca, TRY_LEAVE, TryCatch #7 {, blocks: (B:62:0x01c1, B:64:0x01c5), top: B:86:0x01c1 }] */
                                                /* JADX WARN: Code duplicated, block: B:86:0x01c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                /* JADX WARN: Type inference failed for: r1v18 */
                                                /* JADX WARN: Type inference failed for: r1v21 */
                                                /* JADX WARN: Type inference failed for: r1v22 */
                                                /* JADX WARN: Type inference failed for: r1v3 */
                                                /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
                                                /* JADX WARN: Type inference failed for: r1v6 */
                                                /* JADX WARN: Type inference failed for: r1v7, types: [i2.e] */
                                                /* JADX WARN: Type inference failed for: r1v8 */
                                                /* JADX WARN: Type inference failed for: r3v14, types: [java.util.ArrayList, java.util.List] */
                                                /* JADX WARN: Type inference failed for: r3v15 */
                                                /* JADX WARN: Type inference failed for: r3v18, types: [com.google.android.gms.internal.measurement.x] */
                                                /* JADX WARN: Type inference failed for: r3v19 */
                                                /* JADX WARN: Type inference failed for: r3v20 */
                                                /* JADX WARN: Type inference failed for: r3v3 */
                                                /* JADX WARN: Type inference failed for: r3v4 */
                                                /* JADX WARN: Type inference failed for: r3v6 */
                                                /* JADX WARN: Type inference failed for: r3v7 */
                                                /* JADX WARN: Type inference failed for: r5v1 */
                                                /* JADX WARN: Type inference failed for: r5v13, types: [kotlin.jvm.internal.E] */
                                                /* JADX WARN: Type inference failed for: r5v14 */
                                                /* JADX WARN: Type inference failed for: r5v2, types: [kotlin.jvm.internal.E] */
                                                /* JADX WARN: Type inference failed for: r5v4 */
                                                /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.String] */
                                                /* JADX WARN: Type inference failed for: r5v7 */
                                                @Override // java.lang.Runnable
                                                public final void run() throws Throwable {
                                                    ?? r1;
                                                    ?? r4;
                                                    ?? r5;
                                                    ?? r6;
                                                    kotlin.jvm.internal.A a6 = a5;
                                                    File file4 = file2;
                                                    long j7 = j5;
                                                    long j8 = jMin;
                                                    int i9 = i7;
                                                    String str13 = string2;
                                                    String str14 = string3;
                                                    C2117x c2117x4 = c2117x2;
                                                    CopyOnWriteArrayList copyOnWriteArrayList3 = copyOnWriteArrayList2;
                                                    ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
                                                    int i10 = i8;
                                                    int i11 = iCeil;
                                                    long j9 = j6;
                                                    C2275a0 c2275a2 = c2275a0;
                                                    E e3 = e;
                                                    if (a6.f11690o) {
                                                        return;
                                                    }
                                                    try {
                                                        Pattern pattern2 = p.f11330d;
                                                        try {
                                                            u uVar = new u(new v(file4, b.k("application/pdf"), j7, j8), new s(concurrentHashMap2, i10, i11, j9, c2275a2));
                                                            ?? eVar = new e(17);
                                                            eVar.z(g4.r.f11336h);
                                                            ?? r7 = "chunk-" + i9;
                                                            ((ArrayList) eVar.f11537r).add(a.x("chunk", r7, uVar));
                                                            eVar.k("partNumber", String.valueOf(i9));
                                                            o.c(str13);
                                                            eVar.k("uploadId", str13);
                                                            o.c(str14);
                                                            eVar.k("fileKey", str14);
                                                            r6 = (ArrayList) eVar.f11537r;
                                                            try {
                                                                if (r6.isEmpty()) {
                                                                    throw new IllegalStateException("Multipart body must have at least one part.");
                                                                }
                                                                g4.r rVar = new g4.r((j) eVar.p, (p) eVar.q, h4.b.x(r6));
                                                                c2117x4.getClass();
                                                                r6 = c2117x4;
                                                                try {
                                                                    M0.b bVarC2 = r6.c("https://notescrafter.com/api/print/upload-pdf/chunk");
                                                                    bVarC2.i("POST", rVar);
                                                                    x xVarF2 = ((t) r6.q).a(bVarC2.d()).f();
                                                                    n nVar2 = xVarF2.u;
                                                                    String strJ2 = nVar2 != null ? nVar2.j() : "";
                                                                    int i12 = xVarF2.f11402r;
                                                                    xVarF2.close();
                                                                    if (xVarF2.g()) {
                                                                        r7 = e3;
                                                                        eVar = 1;
                                                                        eVar = 1;
                                                                        JSONObject jSONObject4 = new JSONObject(strJ2);
                                                                        if (jSONObject4.optBoolean("success", false)) {
                                                                            String string4 = jSONObject4.getJSONObject("data").getString("etag");
                                                                            JSONObject jSONObject5 = new JSONObject();
                                                                            jSONObject5.put("partNumber", i9);
                                                                            jSONObject5.put("etag", string4);
                                                                            copyOnWriteArrayList3.add(jSONObject5);
                                                                            concurrentHashMap2.put(Integer.valueOf(i10), Long.valueOf(j8));
                                                                            return;
                                                                        }
                                                                        synchronized (r6) {
                                                                            if (!a6.f11690o) {
                                                                                a6.f11690o = true;
                                                                                r7.f11694o = new Exception(jSONObject4.optString("error", "Chunk " + i9 + " failed"));
                                                                            }
                                                                        }
                                                                        return;
                                                                    }
                                                                    synchronized (r6) {
                                                                        try {
                                                                            if (!a6.f11690o) {
                                                                                try {
                                                                                    a6.f11690o = true;
                                                                                    try {
                                                                                        e3.f11694o = new Exception(C2117x.i(strJ2, i12, "Chunk " + i9 + " failed"));
                                                                                    } catch (Throwable th) {
                                                                                        th = th;
                                                                                        throw th;
                                                                                    }
                                                                                } catch (Throwable th2) {
                                                                                    th = th2;
                                                                                }
                                                                            }
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                        }
                                                                    }
                                                                } catch (Exception e5) {
                                                                    e = e5;
                                                                    r5 = e3;
                                                                    r1 = 1;
                                                                    r4 = r6;
                                                                    synchronized (r4) {
                                                                        if (!a6.f11690o) {
                                                                            a6.f11690o = r1;
                                                                            r5.f11694o = e;
                                                                        }
                                                                    }
                                                                }
                                                            } catch (Exception e6) {
                                                                e = e6;
                                                                r1 = eVar;
                                                                r4 = r6;
                                                                r5 = r7;
                                                                synchronized (r4) {
                                                                    if (!a6.f11690o) {
                                                                        a6.f11690o = r1;
                                                                        r5.f11694o = e;
                                                                    }
                                                                }
                                                            }
                                                        } catch (Exception e7) {
                                                            e = e7;
                                                            r6 = c2117x4;
                                                        }
                                                    } catch (Exception e8) {
                                                        e = e8;
                                                        r1 = 1;
                                                        r4 = c2117x4;
                                                        r5 = e3;
                                                    }
                                                }
                                            };
                                            ExecutorService executorService2 = executorService;
                                            Future<?> futureSubmit = executorService2.submit(runnable);
                                            kotlin.jvm.internal.o.c(futureSubmit);
                                            ArrayList arrayList3 = arrayList2;
                                            arrayList3.add(futureSubmit);
                                            str6 = str12;
                                            executorService = executorService2;
                                            str2 = str;
                                            arrayList2 = arrayList3;
                                            length = j6;
                                            i6 = i7;
                                            c2117x3 = c2117x2;
                                            copyOnWriteArrayList = copyOnWriteArrayList2;
                                            str3 = str8;
                                            str4 = str10;
                                            file = file3;
                                            str5 = str9;
                                            tVar2 = tVar3;
                                            str7 = str11;
                                        } catch (Exception e3) {
                                            e = e3;
                                            printOrderViewModel = printOrderViewModel2;
                                            obj = c2117x2;
                                            obj.getClass();
                                            B3.j jVarD2 = o4.d.d(new Exception(C2117x.h(e)));
                                            p011c0.d dVar2 = PrintOrderViewModel.f10861f0;
                                            thA = B3.k.a(jVarD2);
                                            if (thA != null) {
                                                A.t(Q.h(printOrderViewModel), null, null, new Y0(printOrderViewModel, str, thA, null), 3);
                                            }
                                            return;
                                        }
                                    } catch (Exception e5) {
                                        e = e5;
                                        str = str2;
                                        printOrderViewModel = printOrderViewModel2;
                                        obj = c2117x2;
                                        obj.getClass();
                                        B3.j jVarD3 = o4.d.d(new Exception(C2117x.h(e)));
                                        p011c0.d dVar3 = PrintOrderViewModel.f10861f0;
                                        thA = B3.k.a(jVarD3);
                                        if (thA != null) {
                                            A.t(Q.h(printOrderViewModel), null, null, new Y0(printOrderViewModel, str, thA, null), 3);
                                        }
                                        return;
                                    }
                                }
                                CopyOnWriteArrayList copyOnWriteArrayList3 = copyOnWriteArrayList;
                                c2117x2 = c2117x3;
                                String str13 = str3;
                                String str14 = str4;
                                String str15 = str7;
                                String str16 = str6;
                                str = str2;
                                g4.t tVar4 = tVar2;
                                String str17 = str5;
                                ExecutorService executorService3 = executorService;
                                Iterator it = arrayList2.iterator();
                                while (it.hasNext()) {
                                    try {
                                        ((Future) it.next()).get();
                                    } catch (Exception unused) {
                                    }
                                }
                                executorService3.shutdown();
                                try {
                                    if (!a5.f11690o) {
                                        ArrayList arrayList4 = new ArrayList();
                                        int size = copyOnWriteArrayList3.size();
                                        int i9 = 0;
                                        while (i9 < size) {
                                            CopyOnWriteArrayList copyOnWriteArrayList4 = copyOnWriteArrayList3;
                                            Object obj6 = copyOnWriteArrayList4.get(i9);
                                            kotlin.jvm.internal.o.e(obj6, "get(...)");
                                            arrayList4.add(obj6);
                                            i9++;
                                            copyOnWriteArrayList3 = copyOnWriteArrayList4;
                                        }
                                        if (arrayList4.size() > 1) {
                                            z.a0(arrayList4, new p060n3.i(2));
                                        }
                                        JSONArray jSONArray = new JSONArray();
                                        Iterator it2 = arrayList4.iterator();
                                        while (it2.hasNext()) {
                                            jSONArray.put((JSONObject) it2.next());
                                        }
                                        JSONObject jSONObject4 = new JSONObject();
                                        jSONObject4.put(str16, string2);
                                        jSONObject4.put(str15, string3);
                                        jSONObject4.put("parts", jSONArray);
                                        String string4 = jSONObject4.toString();
                                        kotlin.jvm.internal.o.e(string4, str17);
                                        Pattern pattern2 = g4.p.f11330d;
                                        v vVarG2 = p003a2.a.g(string4, p111z2.b.k("application/json"));
                                        M0.b bVarC2 = c2117x2.c("https://notescrafter.com/api/print/upload-pdf/complete");
                                        bVarC2.i("POST", vVarG2);
                                        x xVarF2 = tVar4.a(bVarC2.d()).f();
                                        O0.n nVar2 = xVarF2.u;
                                        String strJ2 = nVar2 != null ? nVar2.j() : "";
                                        int i10 = xVarF2.f11402r;
                                        xVarF2.close();
                                        if (!xVarF2.g()) {
                                            B3.j jVarD4 = o4.d.d(new Exception(C2117x.i(strJ2, i10, "Completing upload failed")));
                                            p011c0.d dVar4 = PrintOrderViewModel.f10861f0;
                                            Throwable thA3 = B3.k.a(jVarD4);
                                            if (thA3 != null) {
                                                A.t(Q.h(printOrderViewModel2), null, null, new Y0(printOrderViewModel2, str, thA3, null), 3);
                                            }
                                        } else {
                                            JSONObject jSONObject5 = new JSONObject(strJ2);
                                            if (!jSONObject5.optBoolean(str14, false)) {
                                                B3.j jVarD5 = o4.d.d(new Exception(jSONObject5.optString("error", "Completing upload failed")));
                                                p011c0.d dVar5 = PrintOrderViewModel.f10861f0;
                                                Throwable thA4 = B3.k.a(jVarD5);
                                                if (thA4 != null) {
                                                    A.t(Q.h(printOrderViewModel2), null, null, new Y0(printOrderViewModel2, str, thA4, null), 3);
                                                }
                                            } else {
                                                String string5 = jSONObject5.getJSONObject(str13).getString("r2_file_key");
                                                c2275a0.invoke(100);
                                                p011c0.d dVar6 = PrintOrderViewModel.f10861f0;
                                                A.t(Q.h(printOrderViewModel2), null, null, new X0(printOrderViewModel2, str, string5, null), 3);
                                                Throwable thA5 = B3.k.a(string5);
                                                if (thA5 != null) {
                                                    A.t(Q.h(printOrderViewModel2), null, null, new Y0(printOrderViewModel2, str, thA5, null), 3);
                                                }
                                            }
                                        }
                                    } else {
                                        kotlin.jvm.internal.o.c(string2);
                                        kotlin.jvm.internal.o.c(string3);
                                        c2117x = c2117x2;
                                        try {
                                            c2117x.a(string2, string3);
                                            Exception exc = (Exception) e.f11694o;
                                            if (exc == null) {
                                                exc = new Exception("Chunk upload failed");
                                            }
                                            B3.j jVarD6 = o4.d.d(new Exception(C2117x.h(exc)));
                                            p011c0.d dVar7 = PrintOrderViewModel.f10861f0;
                                            Throwable thA6 = B3.k.a(jVarD6);
                                            if (thA6 != null) {
                                                A.t(Q.h(printOrderViewModel2), null, null, new Y0(printOrderViewModel2, str, thA6, null), 3);
                                            }
                                        } catch (Exception e6) {
                                            e = e6;
                                            printOrderViewModel = printOrderViewModel2;
                                            obj = c2117x;
                                            obj.getClass();
                                            B3.j jVarD7 = o4.d.d(new Exception(C2117x.h(e)));
                                            p011c0.d dVar8 = PrintOrderViewModel.f10861f0;
                                            thA = B3.k.a(jVarD7);
                                            if (thA != null) {
                                                A.t(Q.h(printOrderViewModel), null, null, new Y0(printOrderViewModel, str, thA, null), 3);
                                            }
                                            return;
                                        }
                                    }
                                } catch (Exception e7) {
                                    e = e7;
                                    obj = it;
                                    printOrderViewModel = executorService3;
                                    obj.getClass();
                                    B3.j jVarD8 = o4.d.d(new Exception(C2117x.h(e)));
                                    p011c0.d dVar9 = PrintOrderViewModel.f10861f0;
                                    thA = B3.k.a(jVarD8);
                                    if (thA != null) {
                                        A.t(Q.h(printOrderViewModel), null, null, new Y0(printOrderViewModel, str, thA, null), 3);
                                    }
                                    return;
                                }
                            } catch (Exception e8) {
                                e = e8;
                                c2117x = c2117x3;
                                str = str2;
                            }
                        } else {
                            try {
                                B3.j jVarD9 = o4.d.d(new Exception(jSONObject2.optString("error", "Initialisation failed")));
                                p011c0.d dVar10 = PrintOrderViewModel.f10861f0;
                                Throwable thA7 = B3.k.a(jVarD9);
                                if (thA7 != null) {
                                    A.t(Q.h(printOrderViewModel2), null, null, new Y0(printOrderViewModel2, str2, thA7, null), 3);
                                }
                            } catch (Exception e9) {
                                e = e9;
                                printOrderViewModel = printOrderViewModel2;
                                obj = c2117x3;
                                str = str2;
                                obj.getClass();
                                B3.j jVarD10 = o4.d.d(new Exception(C2117x.h(e)));
                                p011c0.d dVar11 = PrintOrderViewModel.f10861f0;
                                thA = B3.k.a(jVarD10);
                                if (thA != null) {
                                    A.t(Q.h(printOrderViewModel), null, null, new Y0(printOrderViewModel, str, thA, null), 3);
                                }
                                return;
                            }
                        }
                    }
                } catch (Exception e10) {
                    e = e10;
                }
                break;
        }
    }
}
