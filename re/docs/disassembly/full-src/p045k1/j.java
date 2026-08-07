package p045k1;

import T1.C0149f;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import f1.a;
import f1.f;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p017d1.k;
import p017d1.t;
import p017d1.u;
import p017d1.w;
import p020e1.i;
import p020e1.j;
import p020e1.l;
import p020e1.n;
import p036i2.e;
import p046k2.h;
import p049l1.d;
import p054m1.b;
import p054m1.c;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f11629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f11630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f11631d;
    public final Executor e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f11632f;
    public final h g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f11633h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p049l1.c f11634i;

    public j(Context context, f fVar, d dVar, d dVar2, Executor executor, c cVar, h hVar, h hVar2, p049l1.c cVar2) {
        this.f11628a = context;
        this.f11629b = fVar;
        this.f11630c = dVar;
        this.f11631d = dVar2;
        this.e = executor;
        this.f11632f = cVar;
        this.g = hVar;
        this.f11633h = hVar2;
        this.f11634i = cVar2;
    }

    public final void a(p020e1.j jVar, int i5) {
        f1.h hVar;
        a aVar;
        String str;
        int i6;
        p012c1.c cVarC;
        String str2;
        Integer numValueOf;
        String str3;
        C0149f c0149f;
        int i7;
        final j jVar2 = this;
        final p020e1.j jVar3 = jVar;
        int i8 = 3;
        final int i9 = 1;
        final int i10 = 0;
        f1.h hVarA = jVar2.f11629b.a(jVar3.f11075a);
        long jMax = 0;
        while (true) {
            b bVar = new b(jVar2) { // from class: k1.h
                public final /* synthetic */ j p;

                {
                    this.p = jVar2;
                }

                @Override // p054m1.b
                public final Object b() {
                    Boolean bool;
                    switch (i10) {
                        case 0:
                            j jVar4 = jVar3;
                            p049l1.h hVar2 = (p049l1.h) this.p.f11630c;
                            SQLiteDatabase sQLiteDatabaseC = hVar2.c();
                            sQLiteDatabaseC.beginTransaction();
                            try {
                                Long lG = p049l1.h.g(sQLiteDatabaseC, jVar4);
                                if (lG == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = hVar2.c().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lG.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseC.setTransactionSuccessful();
                                sQLiteDatabaseC.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseC.endTransaction();
                                throw th2;
                            }
                        default:
                            p049l1.h hVar3 = (p049l1.h) this.p.f11630c;
                            hVar3.getClass();
                            return (Iterable) hVar3.h(new p033h3.f(6, hVar3, jVar3));
                    }
                }
            };
            p049l1.h hVar2 = (p049l1.h) jVar2.f11632f;
            if (!((Boolean) hVar2.n(bVar)).booleanValue()) {
                hVar2.n(new i(jVar2, jVar3, jMax));
                return;
            }
            Iterable iterable = (Iterable) hVar2.n(new b(jVar2) { // from class: k1.h
                public final /* synthetic */ j p;

                {
                    this.p = jVar2;
                }

                @Override // p054m1.b
                public final Object b() {
                    Boolean bool;
                    switch (i9) {
                        case 0:
                            j jVar4 = jVar3;
                            p049l1.h hVar3 = (p049l1.h) this.p.f11630c;
                            SQLiteDatabase sQLiteDatabaseC = hVar3.c();
                            sQLiteDatabaseC.beginTransaction();
                            try {
                                Long lG = p049l1.h.g(sQLiteDatabaseC, jVar4);
                                if (lG == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = hVar3.c().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lG.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseC.setTransactionSuccessful();
                                sQLiteDatabaseC.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseC.endTransaction();
                                throw th2;
                            }
                        default:
                            p049l1.h hVar4 = (p049l1.h) this.p.f11630c;
                            hVar4.getClass();
                            return (Iterable) hVar4.h(new p033h3.f(6, hVar4, jVar3));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            byte[] bArr = jVar3.f11076b;
            if (hVarA == null) {
                p003a2.a.q("Uploader", "Unknown backend for %s, deleting event batch for it...", jVar3);
                aVar = new a(i8, -1L);
                hVar = hVarA;
            } else {
                ArrayList<i> arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((p049l1.b) it.next()).f11826c);
                }
                String str4 = "proto";
                if ((bArr != null ? i9 : i10) != 0) {
                    p049l1.c cVar = jVar2.f11634i;
                    Objects.requireNonNull(cVar);
                    h1.a aVar2 = (h1.a) hVar2.n(new N.b(cVar, 14));
                    p020e1.h hVar3 = new p020e1.h();
                    hVar3.g = new HashMap();
                    hVar3.e = Long.valueOf(jVar2.g.q());
                    hVar3.f11069f = Long.valueOf(jVar2.f11633h.q());
                    hVar3.f11066b = "GDT_CLIENT_METRICS";
                    p007b1.c cVar2 = new p007b1.c("proto");
                    aVar2.getClass();
                    e eVar = n.f11084a;
                    eVar.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        eVar.n(aVar2, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    hVar3.f11068d = new l(cVar2, byteArrayOutputStream.toByteArray());
                    arrayList.add(((p012c1.d) hVarA).a(hVar3.b()));
                }
                p012c1.d dVar = (p012c1.d) hVarA;
                HashMap map = new HashMap();
                for (i iVar : arrayList) {
                    String str5 = iVar.f11070a;
                    if (map.containsKey(str5)) {
                        ((List) map.get(str5)).add(iVar);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(iVar);
                        map.put(str5, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    i iVar2 = (i) ((List) entry.getValue()).get(0);
                    w wVar = w.f11021o;
                    long jQ = dVar.f2548f.q();
                    long jQ2 = dVar.e.q();
                    p017d1.j jVar4 = new p017d1.j(new p017d1.h(Integer.valueOf(iVar2.b("sdk-version")), iVar2.a("model"), iVar2.a("hardware"), iVar2.a("device"), iVar2.a("product"), iVar2.a("os-uild"), iVar2.a("manufacturer"), iVar2.a("fingerprint"), iVar2.a("locale"), iVar2.a("country"), iVar2.a("mcc_mnc"), iVar2.a("application_build")));
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        numValueOf = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it3 = ((List) entry.getValue()).iterator();
                    while (it3.hasNext()) {
                        Iterator it4 = it2;
                        i iVar3 = (i) it3.next();
                        Iterator it5 = it3;
                        l lVar = iVar3.f11072c;
                        f1.h hVar4 = hVarA;
                        p007b1.c cVar3 = lVar.f11081a;
                        boolean zEquals = cVar3.equals(new p007b1.c(str4));
                        byte[] bArr2 = lVar.f11082b;
                        if (zEquals) {
                            c0149f = new C0149f();
                            c0149f.f1257s = bArr2;
                            str3 = str4;
                        } else {
                            str3 = str4;
                            if (cVar3.equals(new p007b1.c("json"))) {
                                String str6 = new String(bArr2, Charset.forName("UTF-8"));
                                C0149f c0149f2 = new C0149f();
                                c0149f2.p = str6;
                                c0149f = c0149f2;
                            } else {
                                String strX = p003a2.a.x("CctTransportBackend");
                                if (Log.isLoggable(strX, 5)) {
                                    Log.w(strX, "Received event of unsupported encoding " + cVar3 + ". Skipping...");
                                }
                            }
                            it3 = it5;
                            it2 = it4;
                            hVarA = hVar4;
                            str4 = str3;
                        }
                        c0149f.q = Long.valueOf(iVar3.f11073d);
                        c0149f.f1256r = Long.valueOf(iVar3.e);
                        String str7 = (String) iVar3.f11074f.get("tz-offset");
                        c0149f.t = Long.valueOf(str7 == null ? 0L : Long.valueOf(str7).longValue());
                        c0149f.u = new p017d1.n((u) u.f11020o.get(iVar3.b("net-type")), (t) t.f11019o.get(iVar3.b("mobile-subtype")));
                        Integer num = iVar3.f11071b;
                        if (num != null) {
                            c0149f.f1255o = num;
                        }
                        String strL = ((Long) c0149f.q) == null ? " eventTimeMs" : "";
                        if (((Long) c0149f.f1256r) == null) {
                            strL = strL.concat(" eventUptimeMs");
                        }
                        if (((Long) c0149f.t) == null) {
                            strL = androidx.compose.foundation.text.modifiers.a.l(strL, " timezoneOffsetSeconds");
                        }
                        if (!strL.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(strL));
                        }
                        arrayList4.add(new k(((Long) c0149f.q).longValue(), (Integer) c0149f.f1255o, ((Long) c0149f.f1256r).longValue(), (byte[]) c0149f.f1257s, (String) c0149f.p, ((Long) c0149f.t).longValue(), (p017d1.n) c0149f.u));
                        it3 = it5;
                        it2 = it4;
                        hVarA = hVar4;
                        str4 = str3;
                    }
                    arrayList3.add(new p017d1.l(jQ, jQ2, jVar4, numValueOf, str2, arrayList4));
                    it2 = it2;
                    hVarA = hVarA;
                    str4 = str4;
                }
                hVar = hVarA;
                p017d1.i iVar4 = new p017d1.i(arrayList3);
                URL urlB = dVar.f2547d;
                if (bArr != null) {
                    try {
                        p012c1.a aVarA = p012c1.a.a(bArr);
                        str = aVarA.f2539b;
                        if (str == null) {
                            str = null;
                        }
                        String str8 = aVarA.f2538a;
                        if (str8 != null) {
                            urlB = p012c1.d.b(str8);
                        }
                    } catch (IllegalArgumentException unused3) {
                        aVar = new a(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    p012c1.b bVar2 = new p012c1.b(urlB, iVar4, str);
                    N.b bVar3 = new N.b(dVar, 7);
                    int i11 = 5;
                    do {
                        cVarC = bVar3.c(bVar2);
                        URL url = (URL) cVarC.q;
                        if (url != null) {
                            p003a2.a.q("CctTransportBackend", "Following redirect to: %s", url);
                            bVar2 = new p012c1.b(url, bVar2.f2541b, bVar2.f2542c);
                        } else {
                            bVar2 = null;
                        }
                        if (bVar2 == null) {
                            break;
                        } else {
                            i11--;
                        }
                    } while (i11 >= 1);
                    int i12 = cVarC.p;
                    if (i12 == 200) {
                        aVar = new a(1, cVarC.f2543o);
                    } else if (i12 >= 500 || i12 == 404) {
                        aVar = new a(2, -1L);
                    } else if (i12 == 400) {
                        try {
                            aVar = new a(4, -1L);
                        } catch (IOException e) {
                            e = e;
                            p003a2.a.s("CctTransportBackend", "Could not make request to the backend", e);
                            i6 = 2;
                            aVar = new a(2, -1L);
                        }
                    } else {
                        aVar = new a(3, -1L);
                    }
                } catch (IOException e3) {
                    e = e3;
                }
            }
            i6 = 2;
            int i13 = aVar.f11135a;
            if (i13 == i6) {
                hVar2.n(new Q2.b(this, iterable, jVar, jMax));
                this.f11631d.a(jVar, i5 + 1, true);
                return;
            }
            hVar2.n(new p033h3.f(3, this, iterable));
            if (i13 == 1) {
                jMax = Math.max(jMax, aVar.f11136b);
                if (bArr != null) {
                    hVar2.n(new N.b(this, 16));
                }
            } else {
                if (i13 == 4) {
                    HashMap map2 = new HashMap();
                    Iterator it6 = iterable.iterator();
                    while (it6.hasNext()) {
                        String str9 = ((p049l1.b) it6.next()).f11826c.f11070a;
                        if (map2.containsKey(str9)) {
                            map2.put(str9, Integer.valueOf(((Integer) map2.get(str9)).intValue() + 1));
                        } else {
                            map2.put(str9, 1);
                        }
                    }
                    i7 = 1;
                    hVar2.n(new p033h3.f(4, this, map2));
                }
                jVar2 = this;
                jVar3 = jVar;
                i9 = i7;
                i8 = 3;
                hVarA = hVar;
                i10 = 0;
            }
            i7 = 1;
            jVar2 = this;
            jVar3 = jVar;
            i9 = i7;
            i8 = 3;
            hVarA = hVar;
            i10 = 0;
        }
    }
}
