package p080t0;

import A2.m;
import android.database.Cursor;
import android.database.sqlite.SQLiteClosable;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;
import p077s0.c;

/* JADX INFO: loaded from: classes2.dex */
public class b implements Closeable {
    public static final String[] q = new String[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12370o;
    public final SQLiteClosable p;

    public /* synthetic */ b(SQLiteClosable sQLiteClosable, int i5) {
        this.f12370o = i5;
        this.p = sQLiteClosable;
    }

    public void c() {
        ((SQLiteDatabase) this.p).beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f12370o) {
            case 0:
                ((SQLiteDatabase) this.p).close();
                break;
            default:
                ((SQLiteProgram) this.p).close();
                break;
        }
    }

    public void g(byte[] bArr, int i5) {
        ((SQLiteProgram) this.p).bindBlob(i5, bArr);
    }

    public void h(int i5, long j5) {
        ((SQLiteProgram) this.p).bindLong(i5, j5);
    }

    public void i(int i5) {
        ((SQLiteProgram) this.p).bindNull(i5);
    }

    public void j(int i5, String str) {
        ((SQLiteProgram) this.p).bindString(i5, str);
    }

    public void n() {
        ((SQLiteDatabase) this.p).endTransaction();
    }

    public void p(String str) {
        ((SQLiteDatabase) this.p).execSQL(str);
    }

    public Cursor u(String str) {
        return y(new m(str, 5));
    }

    public Cursor y(c cVar) {
        return ((SQLiteDatabase) this.p).rawQueryWithFactory(new a(cVar), cVar.g(), q, null);
    }

    public void z() {
        ((SQLiteDatabase) this.p).setTransactionSuccessful();
    }
}
