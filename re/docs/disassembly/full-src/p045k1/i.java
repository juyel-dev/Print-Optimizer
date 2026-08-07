package p045k1;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import h1.c;
import p020e1.j;
import p049l1.e;
import p049l1.f;
import p049l1.h;
import p054m1.b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements b, f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f11627o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ i(Object obj, Object obj2, long j5) {
        this.p = obj;
        this.q = obj2;
        this.f11627o = j5;
    }

    @Override // p049l1.f
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i5 = ((c) this.q).f11430o;
        String string = Integer.toString(i5);
        String str = (String) this.p;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, string});
        try {
            boolean z3 = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j5 = this.f11627o;
            if (z3) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j5 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i5)});
            } else {
                ContentValues contentValues = new ContentValues();
                contentValues.put("log_source", str);
                contentValues.put("reason", Integer.valueOf(i5));
                contentValues.put("events_dropped_count", Long.valueOf(j5));
                sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            }
            return null;
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // p054m1.b
    public Object b() {
        j jVar = (j) this.p;
        long jQ = jVar.g.q() + this.f11627o;
        h hVar = (h) jVar.f11630c;
        j jVar2 = (j) this.q;
        hVar.getClass();
        hVar.h(new e(jQ, jVar2));
        return null;
    }
}
