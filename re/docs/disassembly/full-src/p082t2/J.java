package p082t2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class J extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2247m f12453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12454d;

    public J(C2236g0 c2236g0) {
        super(c2236g0);
        this.f12453c = new C2247m(this, ((C2236g0) this.f12783a).f12675a);
    }

    public static long r(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
            if (!cursorQuery.moveToFirst()) {
                cursorQuery.close();
                return -1L;
            }
            long j5 = cursorQuery.getLong(0);
            cursorQuery.close();
            return j5;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    @Override // p082t2.B
    public final boolean q() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:77:0x011b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0120  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    public final boolean s(byte[] bArr, int i5) {
        SQLiteDatabase sQLiteDatabaseV;
        ?? RawQuery;
        long j5;
        h();
        ?? r4 = 0;
        if (this.f12454d) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", Integer.valueOf(i5));
        contentValues.put("entry", bArr);
        int i6 = 0;
        int i7 = 5;
        for (int i8 = 5; i6 < i8; i8 = 5) {
            ?? r8 = 0;
             = 0;
            r8 = 0;
            ?? r9 = 0;
            r8 = 0;
            SQLiteDatabase sQLiteDatabase = null;
            try {
                sQLiteDatabaseV = v();
                try {
                    if (sQLiteDatabaseV == null) {
                        this.f12454d = true;
                        if (sQLiteDatabaseV != null) {
                            sQLiteDatabaseV.close();
                        }
                        return r4;
                    }
                    sQLiteDatabaseV.beginTransaction();
                    RawQuery = sQLiteDatabaseV.rawQuery("select count(1) from messages", null);
                    if (RawQuery != 0) {
                        try {
                            if (RawQuery.moveToFirst()) {
                                j5 = RawQuery.getLong(r4);
                            } else {
                                j5 = 0;
                            }
                        } catch (SQLiteDatabaseLockedException unused) {
                            r9 = RawQuery;
                            SystemClock.sleep(i7);
                            i7 += 20;
                            if (r9 != 0) {
                                r9.close();
                            }
                            if (sQLiteDatabaseV != null) {
                                sQLiteDatabaseV.close();
                            }
                            i6++;
                            r4 = 0;
                        } catch (SQLiteFullException e) {
                            e = e;
                            r8 = RawQuery;
                            try {
                                j().f12472f.f(e, "Error writing entry; local database full");
                                this.f12454d = true;
                                if (r8 != 0) {
                                    r8.close();
                                }
                                if (sQLiteDatabaseV != null) {
                                    sQLiteDatabaseV.close();
                                }
                                i6++;
                                r4 = 0;
                            } catch (Throwable th) {
                                th = th;
                                if (r8 != 0) {
                                    r8.close();
                                }
                                if (sQLiteDatabaseV != null) {
                                    sQLiteDatabaseV.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e3) {
                            e = e3;
                            sQLiteDatabase = sQLiteDatabaseV;
                            RawQuery = RawQuery;
                            if (sQLiteDatabase != null) {
                                try {
                                    if (sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    sQLiteDatabaseV = sQLiteDatabase;
                                    r8 = RawQuery;
                                    if (r8 != 0) {
                                        r8.close();
                                    }
                                    if (sQLiteDatabaseV != null) {
                                        sQLiteDatabaseV.close();
                                    }
                                    throw th;
                                }
                            }
                            j().f12472f.f(e, "Error writing entry to local database");
                            this.f12454d = true;
                            if (RawQuery != 0) {
                                RawQuery.close();
                            }
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                            }
                            i6++;
                            r4 = 0;
                        } catch (Throwable th3) {
                            th = th3;
                            r8 = RawQuery;
                            if (r8 != 0) {
                                r8.close();
                            }
                            if (sQLiteDatabaseV != null) {
                                sQLiteDatabaseV.close();
                            }
                            throw th;
                        }
                    } else {
                        j5 = 0;
                    }
                    if (j5 >= 100000) {
                        j().f12472f.g("Data loss, local db full");
                        long j6 = 100001 - j5;
                        long jDelete = sQLiteDatabaseV.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j6)});
                        if (jDelete != j6) {
                            j().f12472f.i("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j6), Long.valueOf(jDelete), Long.valueOf(j6 - jDelete));
                        }
                    }
                    sQLiteDatabaseV.insertOrThrow("messages", null, contentValues);
                    sQLiteDatabaseV.setTransactionSuccessful();
                    sQLiteDatabaseV.endTransaction();
                    if (RawQuery != 0) {
                        RawQuery.close();
                    }
                    sQLiteDatabaseV.close();
                    return true;
                } catch (SQLiteDatabaseLockedException unused2) {
                } catch (SQLiteFullException e5) {
                    e = e5;
                } catch (SQLiteException e6) {
                    e = e6;
                    RawQuery = 0;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                sQLiteDatabaseV = null;
            } catch (SQLiteFullException e7) {
                e = e7;
                sQLiteDatabaseV = null;
            } catch (SQLiteException e8) {
                e = e8;
                RawQuery = 0;
            } catch (Throwable th4) {
                th = th4;
                sQLiteDatabaseV = null;
                if (r8 != 0) {
                    r8.close();
                }
                if (sQLiteDatabaseV != null) {
                    sQLiteDatabaseV.close();
                }
                throw th;
            }
        }
        j().f12479n.g("Failed to write entry to local database");
        return false;
    }

    public final void t() {
        int iDelete;
        h();
        try {
            SQLiteDatabase sQLiteDatabaseV = v();
            if (sQLiteDatabaseV == null || (iDelete = sQLiteDatabaseV.delete("messages", null, null)) <= 0) {
                return;
            }
            j().f12479n.f(Integer.valueOf(iDelete), "Reset local analytics data. records");
        } catch (SQLiteException e) {
            j().f12472f.f(e, "Error resetting local analytics data. error");
        }
    }

    public final boolean u() {
        h();
        if (this.f12454d || !((C2236g0) this.f12783a).f12675a.getDatabasePath("google_app_measurement_local.db").exists()) {
            return false;
        }
        int i5 = 5;
        for (int i6 = 0; i6 < 5; i6++) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                try {
                    try {
                        SQLiteDatabase sQLiteDatabaseV = v();
                        if (sQLiteDatabaseV == null) {
                            this.f12454d = true;
                            if (sQLiteDatabaseV != null) {
                                sQLiteDatabaseV.close();
                            }
                            return false;
                        }
                        sQLiteDatabaseV.beginTransaction();
                        sQLiteDatabaseV.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        sQLiteDatabaseV.setTransactionSuccessful();
                        sQLiteDatabaseV.endTransaction();
                        sQLiteDatabaseV.close();
                        return true;
                    } catch (SQLiteException e) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        }
                        j().f12472f.f(e, "Error deleting app launch break from local database");
                        this.f12454d = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i5);
                    i5 += 20;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            } catch (SQLiteFullException e3) {
                j().f12472f.f(e3, "Error deleting app launch break from local database");
                this.f12454d = true;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            }
        }
        j().f12474i.g("Error deleting app launch break from local database in reasonable time");
        return false;
    }

    public final SQLiteDatabase v() {
        if (this.f12454d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f12453c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f12454d = true;
        return null;
    }
}
