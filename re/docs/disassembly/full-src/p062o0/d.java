package p062o0;

import L0.a;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.ads.C1458ns;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p080t0.b;
import p080t0.f;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f12057j = {"UPDATE", "DELETE", "INSERT"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f12059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WorkDatabase_Impl f12060c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile f f12062f;
    public final C1458ns g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f12061d = new AtomicBoolean(false);
    public volatile boolean e = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p038j.f f12063h = new p038j.f();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f12064i = new a(this, 11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f12058a = new HashMap();

    public d(WorkDatabase_Impl workDatabase_Impl, HashMap map, HashMap map2, String... strArr) {
        this.f12060c = workDatabase_Impl;
        this.g = new C1458ns(strArr.length);
        Collections.newSetFromMap(new IdentityHashMap());
        int length = strArr.length;
        this.f12059b = new String[length];
        for (int i5 = 0; i5 < length; i5++) {
            String str = strArr[i5];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f12058a.put(lowerCase, Integer.valueOf(i5));
            String str2 = (String) map.get(strArr[i5]);
            if (str2 != null) {
                this.f12059b[i5] = str2.toLowerCase(locale);
            } else {
                this.f12059b[i5] = lowerCase;
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = str3.toLowerCase(locale2);
            if (this.f12058a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                HashMap map3 = this.f12058a;
                map3.put(lowerCase3, map3.get(lowerCase2));
            }
        }
    }

    public final boolean a() {
        b bVar = this.f12060c.f12075a;
        if (!(bVar != null && ((SQLiteDatabase) bVar.p).isOpen())) {
            return false;
        }
        if (!this.e) {
            this.f12060c.f12077c.l();
        }
        if (this.e) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void b(b bVar, int i5) {
        bVar.p(p035i0.a.k("INSERT OR IGNORE INTO room_table_modification_log VALUES(", i5, ", 0)"));
        String str = this.f12059b[i5];
        StringBuilder sb = new StringBuilder();
        String[] strArr = f12057j;
        for (int i6 = 0; i6 < 3; i6++) {
            String str2 = strArr[i6];
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            p061o.a.g(sb, str, "_", str2, "`");
            p061o.a.g(sb, " AFTER ", str2, " ON `", str);
            p061o.a.g(sb, "` BEGIN UPDATE ", "room_table_modification_log", " SET ", "invalidated");
            p061o.a.g(sb, " = 1", " WHERE ", "table_id", " = ");
            androidx.compose.foundation.text.modifiers.a.v(sb, i5, " AND ", "invalidated", " = 0");
            sb.append("; END");
            bVar.p(sb.toString());
        }
    }

    public final void c(b bVar) {
        if (((SQLiteDatabase) bVar.p).inTransaction()) {
            return;
        }
        while (true) {
            try {
                ReentrantReadWriteLock.ReadLock lock = this.f12060c.f12080h.readLock();
                lock.lock();
                try {
                    int[] iArrA = this.g.a();
                    if (iArrA == null) {
                        lock.unlock();
                        return;
                    }
                    int length = iArrA.length;
                    bVar.c();
                    for (int i5 = 0; i5 < length; i5++) {
                        try {
                            int i6 = iArrA[i5];
                            if (i6 == 1) {
                                b(bVar, i5);
                            } else if (i6 == 2) {
                                String str = this.f12059b[i5];
                                StringBuilder sb = new StringBuilder();
                                String[] strArr = f12057j;
                                for (int i7 = 0; i7 < 3; i7++) {
                                    String str2 = strArr[i7];
                                    sb.setLength(0);
                                    sb.append("DROP TRIGGER IF EXISTS ");
                                    sb.append("`");
                                    sb.append("room_table_modification_trigger_");
                                    sb.append(str);
                                    sb.append("_");
                                    sb.append(str2);
                                    sb.append("`");
                                    bVar.p(sb.toString());
                                }
                            }
                        } catch (Throwable th) {
                            bVar.n();
                            throw th;
                        }
                    }
                    bVar.z();
                    bVar.n();
                    C1458ns c1458ns = this.g;
                    synchronized (c1458ns) {
                        c1458ns.p = false;
                    }
                    lock.unlock();
                } catch (Throwable th2) {
                    lock.unlock();
                    throw th2;
                }
            } catch (SQLiteException | IllegalStateException e) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                return;
            }
        }
    }
}
