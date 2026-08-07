package p109z0;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import p066p0.a;
import p080t0.b;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16046c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f16047d;

    public h(Context context, int i5, int i6) {
        super(i5, i6);
        this.f16047d = context;
    }

    @Override // p066p0.a
    public final void a(b bVar) {
        switch (this.f16046c) {
            case 0:
                if (this.f12257b >= 10) {
                    ((SQLiteDatabase) bVar.p).execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    this.f16047d.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                bVar.p("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                Context context = this.f16047d;
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                boolean zContains = sharedPreferences.contains("reschedule_needed");
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) bVar.p;
                if (zContains || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j5 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j6 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    bVar.c();
                    try {
                        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j5)});
                        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j6)});
                        sharedPreferences.edit().clear().apply();
                        bVar.z();
                        bVar.n();
                    } catch (Throwable th) {
                        bVar.n();
                        throw th;
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i5 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i6 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    bVar.c();
                    try {
                        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i5)});
                        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i6)});
                        sharedPreferences2.edit().clear().apply();
                        bVar.z();
                        return;
                    } finally {
                        bVar.n();
                    }
                }
                return;
        }
    }

    public h(Context context) {
        super(9, 10);
        this.f16047d = context;
    }
}
