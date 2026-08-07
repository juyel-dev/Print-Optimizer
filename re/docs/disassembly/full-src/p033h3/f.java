package p033h3;

import K2.i;
import P2.e;
import P2.t;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Trace;
import com.google.android.gms.internal.measurement.H1;
import com.google.firebase.FirebaseCommonRegistrar;
import com.notescrafter.utils.ReviewHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import p007b1.d;
import p020e1.j;
import p047l.C2174e;
import p049l1.g;
import p049l1.h;
import p054m1.b;
import p101x2.a;
import p101x2.c;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements c, a, e, b, p049l1.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f11467o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ f(int i5, Object obj, Object obj2) {
        this.f11467o = i5;
        this.p = obj;
        this.q = obj2;
    }

    @Override // P2.e
    public Object a(t tVar) {
        String strValueOf;
        switch (this.f11467o) {
            case 2:
                Context context = (Context) tVar.a(Context.class);
                switch (((i) this.q).f617o) {
                    case 0:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        strValueOf = applicationInfo == null ? "" : String.valueOf(applicationInfo.targetSdkVersion);
                        break;
                    case 1:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        strValueOf = applicationInfo2 == null ? "" : String.valueOf(applicationInfo2.minSdkVersion);
                        break;
                    case 2:
                        int i5 = Build.VERSION.SDK_INT;
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            strValueOf = "tv";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            strValueOf = "watch";
                        } else if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            strValueOf = (i5 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "embedded" : "";
                        } else {
                            strValueOf = "auto";
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        strValueOf = installerPackageName == null ? "" : FirebaseCommonRegistrar.a(installerPackageName);
                        break;
                }
                return new p042j3.a((String) this.p, strValueOf);
            default:
                String str = (String) this.p;
                P2.b bVar = (P2.b) this.q;
                try {
                    Trace.beginSection(str);
                    return bVar.f895f.a(tVar);
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override // p049l1.f
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        h hVar = (h) this.p;
        p049l1.a aVar = hVar.f11831r;
        int i5 = aVar.f11821b;
        j jVar = (j) this.q;
        ArrayList arrayListI = hVar.i(sQLiteDatabase, jVar, i5);
        for (d dVar : d.values()) {
            if (dVar != jVar.f11077c) {
                int size = aVar.f11821b - arrayListI.size();
                if (size <= 0) {
                    break;
                }
                p036i2.e eVarA = j.a();
                eVarA.y(jVar.f11075a);
                if (dVar == null) {
                    throw new NullPointerException("Null priority");
                }
                eVarA.f11537r = dVar;
                eVarA.q = jVar.f11076b;
                arrayListI.addAll(hVar.i(sQLiteDatabase, eVarA.l(), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i6 = 0; i6 < arrayListI.size(); i6++) {
            sb.append(((p049l1.b) arrayListI.get(i6)).f11824a);
            if (i6 < arrayListI.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                long j5 = cursorQuery.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j5));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j5), hashSet);
                }
                hashSet.add(new g(cursorQuery.getString(1), cursorQuery.getString(2)));
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        ListIterator listIterator = arrayListI.listIterator();
        while (listIterator.hasNext()) {
            p049l1.b bVar = (p049l1.b) listIterator.next();
            if (map.containsKey(Long.valueOf(bVar.f11824a))) {
                p020e1.h hVarC = bVar.f11826c.c();
                long j6 = bVar.f11824a;
                for (g gVar : (Set) map.get(Long.valueOf(j6))) {
                    hVarC.a(gVar.f11828a, gVar.f11829b);
                }
                listIterator.set(new p049l1.b(j6, bVar.f11825b, hVarC.b()));
            }
        }
        return arrayListI;
    }

    @Override // p054m1.b
    public Object b() {
        switch (this.f11467o) {
            case 3:
                h hVar = (h) ((p045k1.j) this.p).f11630c;
                hVar.getClass();
                Iterable iterable = (Iterable) this.q;
                if (iterable.iterator().hasNext()) {
                    hVar.c().compileStatement("DELETE FROM events WHERE _id in " + h.p(iterable)).execute();
                    break;
                }
                break;
            default:
                p045k1.j jVar = (p045k1.j) this.p;
                jVar.getClass();
                for (Map.Entry entry : ((HashMap) this.q).entrySet()) {
                    ((h) jVar.f11634i).j(((Integer) entry.getValue()).intValue(), h1.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // p101x2.a
    public Object f(p101x2.h hVar) {
        j jVar = (j) this.p;
        String str = (String) this.q;
        synchronized (jVar) {
            ((C2174e) jVar.f11477b).remove(str);
        }
        return hVar;
    }

    @Override // p101x2.c
    public void h(p101x2.h hVar) {
        switch (this.f11467o) {
            case 0:
                ((g) this.p).a((Intent) this.q);
                break;
            default:
                ReviewHelper.triggerPlayStoreReview$lambda$1((Context) this.p, (H1) this.q, hVar);
                break;
        }
    }
}
