package p049l1;

import A3.a;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import p020e1.j;
import p033h3.m;
import p045k1.i;
import p054m1.b;
import p054m1.c;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements d, c, c {
    public static final p007b1.c t = new p007b1.c("proto");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j f11830o;
    public final p046k2.h p;
    public final p046k2.h q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a f11831r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a f11832s;

    public h(p046k2.h hVar, p046k2.h hVar2, a aVar, j jVar, a aVar2) {
        this.f11830o = jVar;
        this.p = hVar;
        this.q = hVar2;
        this.f11831r = aVar;
        this.f11832s = aVar2;
    }

    public static Long g(SQLiteDatabase sQLiteDatabase, j jVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(jVar.f11075a, String.valueOf(p063o1.a.a(jVar.f11077c))));
        byte[] bArr = jVar.f11076b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public static String p(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((b) it.next()).f11824a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object u(Cursor cursor, f fVar) {
        try {
            return fVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase c() {
        j jVar = this.f11830o;
        Objects.requireNonNull(jVar);
        p046k2.h hVar = this.q;
        long jQ = hVar.q();
        while (true) {
            try {
                return jVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (hVar.q() >= ((long) this.f11831r.f11822c) + jQ) {
                    throw new p054m1.a("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f11830o.close();
    }

    public final Object h(f fVar) {
        SQLiteDatabase sQLiteDatabaseC = c();
        sQLiteDatabaseC.beginTransaction();
        try {
            Object objApply = fVar.apply(sQLiteDatabaseC);
            sQLiteDatabaseC.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseC.endTransaction();
        }
    }

    public final ArrayList i(SQLiteDatabase sQLiteDatabase, j jVar, int i5) {
        ArrayList arrayList = new ArrayList();
        Long lG = g(sQLiteDatabase, jVar);
        if (lG == null) {
            return arrayList;
        }
        u(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lG.toString()}, null, null, null, String.valueOf(i5)), new m(this, arrayList, jVar, 2));
        return arrayList;
    }

    public final void j(long j5, h1.c cVar, String str) {
        h(new i(str, cVar, j5));
    }

    public final Object n(b bVar) {
        SQLiteDatabase sQLiteDatabaseC = c();
        p046k2.h hVar = this.q;
        long jQ = hVar.q();
        while (true) {
            try {
                sQLiteDatabaseC.beginTransaction();
                try {
                    Object objB = bVar.b();
                    sQLiteDatabaseC.setTransactionSuccessful();
                    return objB;
                } finally {
                    sQLiteDatabaseC.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (hVar.q() >= ((long) this.f11831r.f11822c) + jQ) {
                    throw new p054m1.a("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
