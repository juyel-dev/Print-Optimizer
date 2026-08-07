package p080t0;

import A2.m;
import T1.K;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.measurement.C;
import java.util.ArrayList;
import p100x1.l;
import p109z0.f;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b[] f12373o;
    public final C p;
    public boolean q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, String str, b[] bVarArr, C c5) {
        super(context, str, null, 12, new c(c5, bVarArr));
        c5.getClass();
        this.p = c5;
        this.f12373o = bVarArr;
    }

    public static b c(b[] bVarArr, SQLiteDatabase sQLiteDatabase) {
        b bVar = bVarArr[0];
        if (bVar == null || ((SQLiteDatabase) bVar.p) != sQLiteDatabase) {
            bVarArr[0] = new b(sQLiteDatabase, 0);
        }
        return bVarArr[0];
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final synchronized void close() {
        super.close();
        this.f12373o[0] = null;
    }

    public final synchronized b g() {
        this.q = false;
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (!this.q) {
            return c(this.f12373o, writableDatabase);
        }
        close();
        return g();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        c(this.f12373o, sQLiteDatabase);
        this.p.getClass();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        b bVarC = c(this.f12373o, sQLiteDatabase);
        C c5 = this.p;
        c5.getClass();
        Cursor cursorU = bVarC.u("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z3 = cursorU.moveToFirst() && cursorU.getInt(0) == 0;
            cursorU.close();
            l lVar = (l) c5.q;
            l.a(bVarC);
            if (!z3) {
                K kB = l.b(bVarC);
                if (!kB.f1233a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + kB.f1234b);
                }
            }
            c5.g(bVarC);
            int i5 = WorkDatabase_Impl.f2382s;
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) lVar.f13710o;
            ArrayList arrayList = workDatabase_Impl.g;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ((f) workDatabase_Impl.g.get(i6)).getClass();
                }
            }
        } catch (Throwable th) {
            cursorU.close();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i5, int i6) {
        this.q = true;
        this.p.f(c(this.f12373o, sQLiteDatabase), i5, i6);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (this.q) {
            return;
        }
        C c5 = this.p;
        b bVarC = c(this.f12373o, sQLiteDatabase);
        c5.getClass();
        Cursor cursorU = bVarC.u("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z3 = cursorU.moveToFirst() && cursorU.getInt(0) != 0;
            cursorU.close();
            if (z3) {
                Cursor cursorY = bVarC.y(new m("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1", 5));
                try {
                    String string = cursorY.moveToFirst() ? cursorY.getString(0) : null;
                    cursorY.close();
                    if (!"c103703e120ae8cc73c9248622f3cd1e".equals(string) && !"49f946663a8deb7054212b8adda248c6".equals(string)) {
                        throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                    }
                } catch (Throwable th) {
                    cursorY.close();
                    throw th;
                }
            } else {
                K kB = l.b(bVarC);
                if (!kB.f1233a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + kB.f1234b);
                }
                c5.g(bVarC);
            }
            l lVar = (l) c5.q;
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) lVar.f13710o;
            int i5 = WorkDatabase_Impl.f2382s;
            workDatabase_Impl.f12075a = bVarC;
            bVarC.p("PRAGMA foreign_keys = ON");
            p062o0.d dVar = ((WorkDatabase_Impl) lVar.f13710o).f12078d;
            synchronized (dVar) {
                try {
                    if (dVar.e) {
                        Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                    } else {
                        bVarC.p("PRAGMA temp_store = MEMORY;");
                        bVarC.p("PRAGMA recursive_triggers='ON';");
                        bVarC.p("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                        dVar.c(bVarC);
                        dVar.f12062f = new f(((SQLiteDatabase) bVarC.p).compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 "));
                        dVar.e = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            ArrayList arrayList = ((WorkDatabase_Impl) lVar.f13710o).g;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ((f) ((WorkDatabase_Impl) lVar.f13710o).g.get(i6)).getClass();
                    bVarC.c();
                    try {
                        int i7 = WorkDatabase.f2381k;
                        bVarC.p("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - WorkDatabase.f2380j) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                        bVarC.z();
                        bVarC.n();
                    } catch (Throwable th3) {
                        bVarC.n();
                        throw th3;
                    }
                }
            }
            c5.p = null;
        } catch (Throwable th4) {
            cursorU.close();
            throw th4;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i5, int i6) {
        this.q = true;
        this.p.f(c(this.f12373o, sQLiteDatabase), i5, i6);
    }
}
