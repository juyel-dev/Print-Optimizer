package p082t2;

import Y1.a;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.E0;
import com.google.android.gms.internal.measurement.C2010c4;
import com.google.android.gms.internal.measurement.C2072n3;

/* JADX INFO: renamed from: t2.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2247m extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12765o = 1;
    public final /* synthetic */ AbstractC2252o0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2247m(J j5, Context context) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.p = j5;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        switch (this.f12765o) {
            case 0:
                C2243k c2243k = (C2243k) this.p;
                E0 e3 = c2243k.e;
                if (e3.f3226o != 0) {
                    ((a) e3.p).getClass();
                    if (SystemClock.elapsedRealtime() - e3.f3226o < 3600000) {
                        throw new SQLiteException("Database open failed");
                    }
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException unused) {
                    E0 e5 = c2243k.e;
                    ((a) e5.p).getClass();
                    e5.f3226o = SystemClock.elapsedRealtime();
                    c2243k.j().f12472f.g("Opening the database failed, dropping and recreating it");
                    if (!((C2236g0) c2243k.f12783a).f12675a.getDatabasePath("google_app_measurement.db").delete()) {
                        c2243k.j().f12472f.f("google_app_measurement.db", "Failed to delete corrupted db file");
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        e5.f3226o = 0L;
                        return writableDatabase;
                    } catch (SQLiteException e) {
                        c2243k.j().f12472f.f(e, "Failed to open freshly created database");
                        throw e;
                    }
                }
            default:
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e6) {
                    throw e6;
                } catch (SQLiteException unused2) {
                    J j5 = (J) this.p;
                    j5.j().f12472f.g("Opening the local database failed, dropping and recreating it");
                    if (!((C2236g0) j5.f12783a).f12675a.getDatabasePath("google_app_measurement_local.db").delete()) {
                        j5.j().f12472f.f("google_app_measurement_local.db", "Failed to delete corrupted local db file");
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e7) {
                        j5.j().f12472f.f(e7, "Failed to open local database. Events will bypass local storage");
                        return null;
                    }
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        switch (this.f12765o) {
            case 0:
                AbstractC2261t0.g(((C2243k) this.p).j(), sQLiteDatabase);
                break;
            default:
                AbstractC2261t0.g(((J) this.p).j(), sQLiteDatabase);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i5, int i6) {
        int i7 = this.f12765o;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        switch (this.f12765o) {
            case 0:
                C2243k c2243k = (C2243k) this.p;
                AbstractC2261t0.h(c2243k.j(), sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", C2243k.f12737f);
                AbstractC2261t0.h(c2243k.j(), sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
                AbstractC2261t0.h(c2243k.j(), sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", C2243k.g);
                AbstractC2261t0.h(c2243k.j(), sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", C2243k.f12738h);
                AbstractC2261t0.h(c2243k.j(), sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", C2243k.f12740j);
                AbstractC2261t0.h(c2243k.j(), sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
                AbstractC2261t0.h(c2243k.j(), sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", C2243k.f12739i);
                AbstractC2261t0.h(c2243k.j(), sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", C2243k.f12741k);
                AbstractC2261t0.h(c2243k.j(), sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", C2243k.f12742l);
                AbstractC2261t0.h(c2243k.j(), sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
                AbstractC2261t0.h(c2243k.j(), sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", C2243k.f12743m);
                AbstractC2261t0.h(c2243k.j(), sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
                AbstractC2261t0.h(c2243k.j(), sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
                L lJ = c2243k.j();
                C2072n3.a();
                AbstractC2261t0.h(lJ, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", C2243k.f12744n);
                C2010c4.a();
                AbstractC2261t0.h(c2243k.j(), sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", C2243k.f12745o);
                break;
            default:
                AbstractC2261t0.h(((J) this.p).j(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i5, int i6) {
        int i7 = this.f12765o;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2247m(C2243k c2243k, Context context) {
        super(context, "google_app_measurement.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.p = c2243k;
    }

    private final void c(SQLiteDatabase sQLiteDatabase, int i5, int i6) {
    }

    private final void g(SQLiteDatabase sQLiteDatabase, int i5, int i6) {
    }

    private final void h(SQLiteDatabase sQLiteDatabase, int i5, int i6) {
    }

    private final void i(SQLiteDatabase sQLiteDatabase, int i5, int i6) {
    }
}
