package p080t0;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.measurement.C;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements DatabaseErrorHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C f12371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b[] f12372b;

    public c(C c5, b[] bVarArr) {
        this.f12371a = c5;
        this.f12372b = bVarArr;
    }

    @Override // android.database.DatabaseErrorHandler
    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        b bVarC = d.c(this.f12372b, sQLiteDatabase);
        this.f12371a.getClass();
        Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + ((SQLiteDatabase) bVarC.p).getPath());
        SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) bVarC.p;
        if (!sQLiteDatabase2.isOpen()) {
            C.d(sQLiteDatabase2.getPath());
            return;
        }
        List<Pair<String, String>> attachedDbs = null;
        try {
            try {
                attachedDbs = sQLiteDatabase2.getAttachedDbs();
            } catch (SQLiteException unused) {
            }
            try {
                bVarC.close();
            } catch (IOException unused2) {
            }
        } finally {
            if (attachedDbs != null) {
                Iterator<Pair<String, String>> it = attachedDbs.iterator();
                while (it.hasNext()) {
                    C.d((String) it.next().second);
                }
            } else {
                C.d(sQLiteDatabase2.getPath());
            }
        }
    }
}
