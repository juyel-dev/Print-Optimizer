package p080t0;

import android.database.sqlite.SQLiteStatement;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final SQLiteStatement f12377r;

    public f(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement, 1);
        this.f12377r = sQLiteStatement;
    }

    public final void A() {
        this.f12377r.executeUpdateDelete();
    }
}
