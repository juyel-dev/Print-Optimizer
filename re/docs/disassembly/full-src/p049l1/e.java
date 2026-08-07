package p049l1;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import p007b1.d;
import p020e1.j;
import p063o1.a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f11827o;
    public final /* synthetic */ j p;

    public /* synthetic */ e(long j5, j jVar) {
        this.f11827o = j5;
        this.p = jVar;
    }

    @Override // p049l1.f
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f11827o));
        j jVar = this.p;
        String str = jVar.f11075a;
        d dVar = jVar.f11077c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(a.a(dVar))}) < 1) {
            contentValues.put("backend_name", jVar.f11075a);
            contentValues.put("priority", Integer.valueOf(a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
