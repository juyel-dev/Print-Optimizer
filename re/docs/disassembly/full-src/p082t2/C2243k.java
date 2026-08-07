package p082t2;

import T1.z;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import androidx.compose.foundation.text.modifiers.a;
import com.google.android.gms.internal.ads.E0;
import com.google.android.gms.internal.measurement.A0;
import com.google.android.gms.internal.measurement.B0;
import com.google.android.gms.internal.measurement.C1995a1;
import com.google.android.gms.internal.measurement.C2001b1;
import com.google.android.gms.internal.measurement.C2010c4;
import com.google.android.gms.internal.measurement.C2013d1;
import com.google.android.gms.internal.measurement.C2019e1;
import com.google.android.gms.internal.measurement.C2039h3;
import com.google.android.gms.internal.measurement.C2043i1;
import com.google.android.gms.internal.measurement.C2049j1;
import com.google.android.gms.internal.measurement.C2072n3;
import com.google.android.gms.internal.measurement.C2085q1;
import com.google.android.gms.internal.measurement.C2096s3;
import com.google.android.gms.internal.measurement.C2103u0;
import com.google.android.gms.internal.measurement.C2108v0;
import com.google.android.gms.internal.measurement.o4;
import com.google.android.gms.internal.measurement.v4;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p047l.C2174e;

/* JADX INFO: renamed from: t2.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2243k extends h1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f12737f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f12738h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f12739i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f12740j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String[] f12741k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String[] f12742l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f12743m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String[] f12744n = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;"};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String[] f12745o = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2247m f12746d;
    public final E0 e;

    public C2243k(j1 j1Var) {
        super(j1Var);
        this.e = new E0(((C2236g0) this.f12783a).f12686n);
        this.f12746d = new C2247m(this, ((C2236g0) this.f12783a).f12675a);
    }

    public static void E(ContentValues contentValues, Object obj) {
        z.e("value");
        z.i(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    public final List A(String str, String str2, String str3) {
        z.e(str);
        h();
        o();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + "*");
            sb.append(" and name glob ?");
        }
        return B(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final List B(String str, String[] strArr) {
        h();
        o();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = r().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                while (arrayList.size() < 1000) {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    String string3 = cursorQuery.getString(2);
                    Object objW = w(cursorQuery, 3);
                    boolean z3 = cursorQuery.getInt(4) != 0;
                    String string4 = cursorQuery.getString(5);
                    long j5 = cursorQuery.getLong(6);
                    P pK = k();
                    byte[] blob = cursorQuery.getBlob(7);
                    Parcelable.Creator<C2264v> creator = C2264v.CREATOR;
                    C2264v c2264v = (C2264v) pK.v(blob, creator);
                    arrayList.add(new C2231e(string, string2, new k1(cursorQuery.getLong(10), objW, string3, string2), cursorQuery.getLong(8), z3, string4, c2264v, j5, (C2264v) k().v(cursorQuery.getBlob(9), creator), cursorQuery.getLong(11), (C2264v) k().v(cursorQuery.getBlob(12), creator)));
                    if (!cursorQuery.moveToNext()) {
                        cursorQuery.close();
                        return arrayList;
                    }
                }
                j().f12472f.f(1000, "Read more than the max allowed conditional properties, ignoring extra");
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e) {
                j().f12472f.f(e, "Error querying conditional user property value");
                List listEmptyList = Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public final C2245l C(long j5, String str, long j6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        z.e(str);
        h();
        o();
        String[] strArr = {str};
        C2245l c2245l = new C2245l();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseR = r();
                Cursor cursorQuery = sQLiteDatabaseR.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    j().f12474i.f(L.q(str), "Not updating daily counts, app is not known. appId");
                    cursorQuery.close();
                    return c2245l;
                }
                if (cursorQuery.getLong(0) == j5) {
                    c2245l.f12754b = cursorQuery.getLong(1);
                    c2245l.f12753a = cursorQuery.getLong(2);
                    c2245l.f12755c = cursorQuery.getLong(3);
                    c2245l.f12756d = cursorQuery.getLong(4);
                    c2245l.e = cursorQuery.getLong(5);
                }
                if (z3) {
                    c2245l.f12754b += j6;
                }
                if (z4) {
                    c2245l.f12753a += j6;
                }
                if (z5) {
                    c2245l.f12755c += j6;
                }
                if (z6) {
                    c2245l.f12756d += j6;
                }
                if (z7) {
                    c2245l.e += j6;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j5));
                contentValues.put("daily_public_events_count", Long.valueOf(c2245l.f12753a));
                contentValues.put("daily_events_count", Long.valueOf(c2245l.f12754b));
                contentValues.put("daily_conversions_count", Long.valueOf(c2245l.f12755c));
                contentValues.put("daily_error_events_count", Long.valueOf(c2245l.f12756d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(c2245l.e));
                sQLiteDatabaseR.update("apps", contentValues, "app_id=?", strArr);
                cursorQuery.close();
                return c2245l;
            } catch (SQLiteException e) {
                j().f12472f.h("Error updating daily counts. appId", L.q(str), e);
                if (0 != 0) {
                    cursor.close();
                }
                return c2245l;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void D(ContentValues contentValues) {
        try {
            SQLiteDatabase sQLiteDatabaseR = r();
            String asString = contentValues.getAsString("app_id");
            if (asString == null) {
                j().f12473h.f(L.q("app_id"), "Value of the primary key is not set.");
            } else if (sQLiteDatabaseR.update("consent_settings", contentValues, "app_id = ?", new String[]{asString}) == 0 && sQLiteDatabaseR.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                j().f12472f.h("Failed to insert/update table (got -1). key", L.q("consent_settings"), L.q("app_id"));
            }
        } catch (SQLiteException e) {
            j().f12472f.i("Error storing into table. key", L.q("consent_settings"), L.q("app_id"), e);
        }
    }

    public final void F(C2049j1 c2049j1, boolean z3) {
        h();
        o();
        z.e(c2049j1.U1());
        z.l(c2049j1.n0());
        g0();
        ((C2236g0) this.f12783a).f12686n.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c2049j1.y1() < jCurrentTimeMillis - C2235g.v() || c2049j1.y1() > C2235g.v() + jCurrentTimeMillis) {
            L lJ = j();
            lJ.f12474i.i("Storing bundle outside of the max uploading time span. appId, now, timestamp", L.q(c2049j1.U1()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(c2049j1.y1()));
        }
        try {
            byte[] bArrY = k().Y(c2049j1.c());
            L lJ2 = j();
            lJ2.f12479n.f(Integer.valueOf(bArrY.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", c2049j1.U1());
            contentValues.put("bundle_end_timestamp", Long.valueOf(c2049j1.y1()));
            contentValues.put("data", bArrY);
            contentValues.put("has_realtime", Integer.valueOf(z3 ? 1 : 0));
            if (c2049j1.u0()) {
                contentValues.put("retry_count", Integer.valueOf(c2049j1.X0()));
            }
            try {
                if (r().insert("queue", null, contentValues) == -1) {
                    j().f12472f.f(L.q(c2049j1.U1()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e) {
                L lJ3 = j();
                lJ3.f12472f.h("Error storing bundle. appId", L.q(c2049j1.U1()), e);
            }
        } catch (IOException e3) {
            L lJ4 = j();
            lJ4.f12472f.h("Data loss. Failed to serialize bundle. appId", L.q(c2049j1.U1()), e3);
        }
    }

    public final void G(String str, Long l5, long j5, C2001b1 c2001b1) {
        h();
        o();
        z.i(c2001b1);
        z.e(str);
        byte[] bArrC = c2001b1.c();
        L lJ = j();
        lJ.f12479n.h("Saving complex main event, appId, data size", ((C2236g0) this.f12783a).f12685m.b(str), Integer.valueOf(bArrC.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l5);
        contentValues.put("children_to_process", Long.valueOf(j5));
        contentValues.put("main_event", bArrC);
        try {
            if (r().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                j().f12472f.f(L.q(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e) {
            L lJ2 = j();
            lJ2.f12472f.h("Error storing complex main event. appId", L.q(str), e);
        }
    }

    public final void H(String str, String str2) {
        z.e(str);
        z.e(str2);
        h();
        o();
        try {
            r().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            L lJ = j();
            lJ.f12472f.i("Error deleting conditional property", L.q(str), ((C2236g0) this.f12783a).f12685m.g(str2), e);
        }
    }

    public final void I(String str, d1 d1Var) {
        h();
        o();
        z.e(str);
        ((C2236g0) this.f12783a).f12686n.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jV = jCurrentTimeMillis - C2235g.v();
        long j5 = d1Var.p;
        if (j5 < jV || j5 > C2235g.v() + jCurrentTimeMillis) {
            L lJ = j();
            lJ.f12474i.i("Storing trigger URI outside of the max retention time span. appId, now, timestamp", L.q(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j5));
        }
        j().f12479n.g("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", d1Var.f12624o);
        contentValues.put("source", Integer.valueOf(d1Var.q));
        contentValues.put("timestamp_millis", Long.valueOf(j5));
        try {
            if (r().insert("trigger_uris", null, contentValues) == -1) {
                j().f12472f.f(L.q(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e) {
            L lJ2 = j();
            lJ2.f12472f.h("Error storing trigger URI. appId", L.q(str), e);
        }
    }

    public final void J(List list) {
        h();
        o();
        z.i(list);
        if (((ArrayList) list).size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        if (((C2236g0) this.f12783a).f12675a.getDatabasePath("google_app_measurement.db").exists()) {
            String strZ = a.z("(", TextUtils.join(",", list), ")");
            if (S("SELECT COUNT(1) FROM queue WHERE rowid IN " + strZ + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                j().f12474i.g("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                r().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + strZ + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e) {
                j().f12472f.f(e, "Error incrementing retry count. error");
            }
        }
    }

    public final void K(C2260t c2260t) {
        z.i(c2260t);
        h();
        o();
        ContentValues contentValues = new ContentValues();
        String str = c2260t.f12842a;
        contentValues.put("app_id", str);
        contentValues.put("name", c2260t.f12843b);
        contentValues.put("lifetime_count", Long.valueOf(c2260t.f12844c));
        contentValues.put("current_bundle_count", Long.valueOf(c2260t.f12845d));
        contentValues.put("last_fire_timestamp", Long.valueOf(c2260t.f12846f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c2260t.g));
        contentValues.put("last_bundled_day", c2260t.f12847h);
        contentValues.put("last_sampled_complex_event_id", c2260t.f12848i);
        contentValues.put("last_sampling_rate", c2260t.f12849j);
        contentValues.put("current_session_count", Long.valueOf(c2260t.e));
        Boolean bool = c2260t.f12850k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (r().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                j().f12472f.f(L.q(str), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e) {
            j().f12472f.h("Error storing event aggregates. appId", L.q(str), e);
        }
    }

    public final void L(S s2) {
        h();
        o();
        String strN = s2.N();
        z.i(strN);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strN);
        contentValues.put("app_instance_id", s2.O());
        contentValues.put("gmp_app_id", s2.f());
        C2236g0 c2236g0 = s2.f12517a;
        C2226b0 c2226b0 = c2236g0.f12682j;
        C2236g0.d(c2226b0);
        c2226b0.h();
        contentValues.put("resettable_device_id_hash", s2.e);
        C2226b0 c2226b1 = c2236g0.f12682j;
        C2236g0.d(c2226b1);
        c2226b1.h();
        contentValues.put("last_bundle_index", Long.valueOf(s2.g));
        C2226b0 c2226b2 = c2236g0.f12682j;
        C2236g0.d(c2226b2);
        c2226b2.h();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(s2.f12522h));
        C2226b0 c2226b3 = c2236g0.f12682j;
        C2236g0.d(c2226b3);
        c2226b3.h();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(s2.f12523i));
        contentValues.put("app_version", s2.d());
        C2226b0 c2226b4 = c2236g0.f12682j;
        C2236g0.d(c2226b4);
        c2226b4.h();
        contentValues.put("app_store", s2.f12526l);
        C2226b0 c2226b5 = c2236g0.f12682j;
        C2236g0.d(c2226b5);
        c2226b5.h();
        contentValues.put("gmp_version", Long.valueOf(s2.f12527m));
        C2226b0 c2226b6 = c2236g0.f12682j;
        C2236g0.d(c2226b6);
        c2226b6.h();
        contentValues.put("dev_cert_hash", Long.valueOf(s2.f12528n));
        C2226b0 c2226b7 = c2236g0.f12682j;
        C2236g0.d(c2226b7);
        c2226b7.h();
        contentValues.put("measurement_enabled", Boolean.valueOf(s2.f12529o));
        C2226b0 c2226b8 = c2236g0.f12682j;
        C2236g0.d(c2226b8);
        c2226b8.h();
        contentValues.put("day", Long.valueOf(s2.f12507C));
        C2226b0 c2226b9 = c2236g0.f12682j;
        C2236g0.d(c2226b9);
        c2226b9.h();
        contentValues.put("daily_public_events_count", Long.valueOf(s2.f12508D));
        C2236g0.d(c2226b9);
        c2226b9.h();
        contentValues.put("daily_events_count", Long.valueOf(s2.f12509E));
        C2236g0.d(c2226b9);
        c2226b9.h();
        contentValues.put("daily_conversions_count", Long.valueOf(s2.f12510F));
        C2226b0 c2226b10 = c2236g0.f12682j;
        C2236g0.d(c2226b10);
        c2226b10.h();
        contentValues.put("config_fetched_time", Long.valueOf(s2.f12515K));
        C2226b0 c2226b11 = c2236g0.f12682j;
        C2236g0.d(c2226b11);
        c2226b11.h();
        contentValues.put("failed_config_fetch_time", Long.valueOf(s2.f12516L));
        contentValues.put("app_version_int", Long.valueOf(s2.m()));
        contentValues.put("firebase_instance_id", s2.e());
        C2236g0.d(c2226b9);
        c2226b9.h();
        contentValues.put("daily_error_events_count", Long.valueOf(s2.f12511G));
        C2236g0.d(c2226b9);
        c2226b9.h();
        contentValues.put("daily_realtime_events_count", Long.valueOf(s2.f12512H));
        C2236g0.d(c2226b9);
        c2226b9.h();
        contentValues.put("health_monitor_sample", s2.f12513I);
        C2226b0 c2226b12 = c2236g0.f12682j;
        C2236g0.d(c2226b12);
        c2226b12.h();
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(s2.h()));
        contentValues.put("admob_app_id", s2.L());
        contentValues.put("dynamite_version", Long.valueOf(s2.D()));
        C2226b0 c2226b13 = c2236g0.f12682j;
        C2236g0.d(c2226b13);
        c2226b13.h();
        contentValues.put("session_stitching_token", s2.u);
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(s2.i()));
        C2226b0 c2226b14 = c2236g0.f12682j;
        C2236g0.d(c2226b14);
        c2226b14.h();
        contentValues.put("target_os_version", Long.valueOf(s2.f12533w));
        C2226b0 c2226b15 = c2236g0.f12682j;
        C2236g0.d(c2226b15);
        c2226b15.h();
        contentValues.put("session_stitching_token_hash", Long.valueOf(s2.f12534x));
        C2010c4.a();
        C2236g0 c2236g1 = (C2236g0) this.f12783a;
        if (c2236g1.g.t(strN, AbstractC2268x.f12891C0)) {
            C2226b0 c2226b16 = c2236g0.f12682j;
            C2236g0.d(c2226b16);
            c2226b16.h();
            contentValues.put("ad_services_version", Integer.valueOf(s2.f12535y));
            C2226b0 c2226b17 = c2236g0.f12682j;
            C2236g0.d(c2226b17);
            c2226b17.h();
            contentValues.put("attribution_eligibility_status", Long.valueOf(s2.f12505A));
        }
        C2039h3.a();
        F f5 = AbstractC2268x.f12917P0;
        C2235g c2235g = c2236g1.g;
        if (c2235g.t(strN, f5)) {
            C2226b0 c2226b18 = c2236g0.f12682j;
            C2236g0.d(c2226b18);
            c2226b18.h();
            contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(s2.f12536z));
        }
        v4.p.get();
        if (c2235g.t(strN, AbstractC2268x.f12967t0)) {
            C2226b0 c2226b19 = c2236g0.f12682j;
            C2236g0.d(c2226b19);
            c2226b19.h();
            contentValues.put("sgtm_preview_key", s2.f12506B);
        }
        C2226b0 c2226b20 = c2236g0.f12682j;
        C2236g0.d(c2226b20);
        c2226b20.h();
        ArrayList arrayList = s2.t;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                j().f12474i.f(strN, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        C2096s3.p.get();
        if (c2235g.t(null, AbstractC2268x.f12958n0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        C2072n3.a();
        if (c2235g.t(strN, AbstractC2268x.f12907K0)) {
            contentValues.put("npa_metadata_value", s2.K());
        }
        try {
            SQLiteDatabase sQLiteDatabaseR = r();
            if (sQLiteDatabaseR.update("apps", contentValues, "app_id = ?", new String[]{strN}) == 0 && sQLiteDatabaseR.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                j().f12472f.f(L.q(strN), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e) {
            j().f12472f.h("Error storing app. appId", L.q(strN), e);
        }
    }

    public final boolean M(String str, int i5, C2108v0 c2108v0) {
        o();
        h();
        z.e(str);
        z.i(c2108v0);
        if (c2108v0.w().isEmpty()) {
            j().f12474i.i("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", L.q(str), Integer.valueOf(i5), String.valueOf(c2108v0.C() ? Integer.valueOf(c2108v0.t()) : null));
            return false;
        }
        byte[] bArrC = c2108v0.c();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i5));
        contentValues.put("filter_id", c2108v0.C() ? Integer.valueOf(c2108v0.t()) : null);
        contentValues.put("event_name", c2108v0.w());
        contentValues.put("session_scoped", c2108v0.D() ? Boolean.valueOf(c2108v0.A()) : null);
        contentValues.put("data", bArrC);
        try {
            if (r().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            j().f12472f.f(L.q(str), "Failed to insert event filter (got -1). appId");
            return true;
        } catch (SQLiteException e) {
            j().f12472f.h("Error storing event filter. appId", L.q(str), e);
            return false;
        }
    }

    public final boolean N(String str, int i5, B0 b5) {
        o();
        h();
        z.e(str);
        z.i(b5);
        if (b5.t().isEmpty()) {
            j().f12474i.i("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", L.q(str), Integer.valueOf(i5), String.valueOf(b5.x() ? Integer.valueOf(b5.p()) : null));
            return false;
        }
        byte[] bArrC = b5.c();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i5));
        contentValues.put("filter_id", b5.x() ? Integer.valueOf(b5.p()) : null);
        contentValues.put("property_name", b5.t());
        contentValues.put("session_scoped", b5.y() ? Boolean.valueOf(b5.w()) : null);
        contentValues.put("data", bArrC);
        try {
            if (r().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            j().f12472f.f(L.q(str), "Failed to insert property filter (got -1). appId");
            return false;
        } catch (SQLiteException e) {
            j().f12472f.h("Error storing property filter. appId", L.q(str), e);
            return false;
        }
    }

    public final boolean O(C2231e c2231e) {
        h();
        o();
        String str = c2231e.f12625o;
        z.i(str);
        if (Z(str, c2231e.q.p) == null && S("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", c2231e.p);
        contentValues.put("name", c2231e.q.p);
        Object objG = c2231e.q.g();
        z.i(objG);
        E(contentValues, objG);
        contentValues.put("active", Boolean.valueOf(c2231e.f12627s));
        contentValues.put("trigger_event_name", c2231e.t);
        contentValues.put("trigger_timeout", Long.valueOf(c2231e.f12628v));
        g();
        contentValues.put("timed_out_event", n1.a0(c2231e.u));
        contentValues.put("creation_timestamp", Long.valueOf(c2231e.f12626r));
        g();
        contentValues.put("triggered_event", n1.a0(c2231e.f12629w));
        contentValues.put("triggered_timestamp", Long.valueOf(c2231e.q.q));
        contentValues.put("time_to_live", Long.valueOf(c2231e.f12630x));
        g();
        contentValues.put("expired_event", n1.a0(c2231e.f12631y));
        try {
            if (r().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            j().f12472f.f(L.q(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e) {
            L lJ = j();
            lJ.f12472f.h("Error storing conditional user property", L.q(str), e);
            return true;
        }
    }

    public final boolean P(C2253p c2253p, long j5, boolean z3) {
        h();
        o();
        String str = c2253p.f12811a;
        z.e(str);
        P pK = k();
        C1995a1 c1995a1C = C2001b1.C();
        c1995a1C.c();
        C2001b1.z(c2253p.e, (C2001b1) c1995a1C.p);
        r rVar = c2253p.f12815f;
        rVar.getClass();
        Bundle bundle = rVar.f12826o;
        for (String str2 : bundle.keySet()) {
            C2013d1 c2013d1D = C2019e1.D();
            c2013d1D.f(str2);
            Object obj = bundle.get(str2);
            z.i(obj);
            pK.J(c2013d1D, obj);
            c1995a1C.e(c2013d1D);
        }
        byte[] bArrC = ((C2001b1) c1995a1C.a()).c();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("name", c2253p.f12812b);
        contentValues.put("timestamp", Long.valueOf(c2253p.f12814d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j5));
        contentValues.put("data", bArrC);
        contentValues.put("realtime", Integer.valueOf(z3 ? 1 : 0));
        try {
            if (r().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            j().f12472f.f(L.q(str), "Failed to insert raw event (got -1). appId");
            return false;
        } catch (SQLiteException e) {
            L lJ = j();
            lJ.f12472f.h("Error storing raw event. appId", L.q(str), e);
            return false;
        }
    }

    public final boolean Q(l1 l1Var) {
        h();
        o();
        String str = l1Var.f12761a;
        String str2 = l1Var.f12763c;
        l1 l1VarZ = Z(str, str2);
        String str3 = l1Var.f12762b;
        if (l1VarZ == null) {
            if (n1.q0(str2)) {
                if (S("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= Math.max(Math.min(((C2236g0) this.f12783a).g.p(str, AbstractC2268x.f12900H), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str2) && S("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, str3}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", str3);
        contentValues.put("name", str2);
        contentValues.put("set_timestamp", Long.valueOf(l1Var.f12764d));
        E(contentValues, l1Var.e);
        try {
            if (r().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            j().f12472f.f(L.q(str), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e) {
            j().f12472f.h("Error storing user property. appId", L.q(str), e);
            return true;
        }
    }

    public final long R(String str) {
        z.e(str);
        z.e("first_open_count");
        h();
        o();
        SQLiteDatabase sQLiteDatabaseR = r();
        sQLiteDatabaseR.beginTransaction();
        long j5 = 0;
        try {
            try {
                long jV = v("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (jV == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseR.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        j().f12472f.h("Failed to insert column (got -1). appId", L.q(str), "first_open_count");
                        return -1L;
                    }
                    jV = 0;
                    j().f12472f.i("Error inserting column. appId", L.q(str), "first_open_count", e);
                    return j5;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", Long.valueOf(1 + jV));
                    if (sQLiteDatabaseR.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        j().f12472f.h("Failed to update column (got 0). appId", L.q(str), "first_open_count");
                        return -1L;
                    }
                    sQLiteDatabaseR.setTransactionSuccessful();
                    return jV;
                } catch (SQLiteException e) {
                    long j6 = jV;
                    e = e;
                    j5 = j6;
                }
            } finally {
                sQLiteDatabaseR.endTransaction();
            }
        } catch (SQLiteException e3) {
            e = e3;
        }
    }

    public final long S(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = r().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j5 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j5;
            } catch (SQLiteException e) {
                j().f12472f.h("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x011a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0120  */
    public final List T(String str, String str2, String str3) throws Throwable {
        String str4;
        z.e(str);
        h();
        o();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                ArrayList arrayList2 = new ArrayList(3);
                try {
                    arrayList2.add(str);
                    StringBuilder sb = new StringBuilder("app_id=?");
                    if (TextUtils.isEmpty(str2)) {
                        str4 = str2;
                    } else {
                        str4 = str2;
                        try {
                            arrayList2.add(str4);
                            sb.append(" and origin=?");
                        } catch (SQLiteException e) {
                            e = e;
                            j().f12472f.i("(2)Error querying user properties", L.q(str), str4, e);
                            List listEmptyList = Collections.emptyList();
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return listEmptyList;
                        }
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        arrayList2.add(str3 + "*");
                        sb.append(" and name glob ?");
                    }
                    cursorQuery = r().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, sb.toString(), (String[]) arrayList2.toArray(new String[arrayList2.size()]), null, null, "rowid", "1001");
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return arrayList;
                    }
                    while (arrayList.size() < 1000) {
                        String string = cursorQuery.getString(0);
                        long j5 = cursorQuery.getLong(1);
                        try {
                            try {
                                Object objW = w(cursorQuery, 2);
                                String string2 = cursorQuery.getString(3);
                                if (objW == null) {
                                    try {
                                        j().f12472f.i("(2)Read invalid user property value, ignoring it", L.q(str), string2, str3);
                                    } catch (SQLiteException e3) {
                                        e = e3;
                                        str4 = string2;
                                        j().f12472f.i("(2)Error querying user properties", L.q(str), str4, e);
                                        List listEmptyList2 = Collections.emptyList();
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        return listEmptyList2;
                                    }
                                } else {
                                    arrayList.add(new l1(str, string2, string, j5, objW));
                                }
                                if (!cursorQuery.moveToNext()) {
                                    cursorQuery.close();
                                    return arrayList;
                                }
                                str4 = string2;
                            } catch (SQLiteException e5) {
                                e = e5;
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            throw th;
                        }
                    }
                    j().f12472f.f(1000, "Read more than the max allowed user properties, ignoring excess");
                    cursorQuery.close();
                    return arrayList;
                } catch (SQLiteException e6) {
                    e = e6;
                    str4 = str2;
                    j().f12472f.i("(2)Error querying user properties", L.q(str), str4, e);
                    List listEmptyList3 = Collections.emptyList();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return listEmptyList3;
                }
            } catch (Throwable th2) {
                th = th2;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
        } catch (SQLiteException e7) {
            e = e7;
        }
    }

    public final void U(String str, ArrayList arrayList) {
        z.e(str);
        o();
        h();
        SQLiteDatabase sQLiteDatabaseR = r();
        try {
            long jS = S("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int iMax = Math.max(0, Math.min(2000, ((C2236g0) this.f12783a).g.p(str, AbstractC2268x.f12898G)));
            if (jS <= iMax) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                Integer num = (Integer) arrayList.get(i5);
                if (num == null) {
                    return;
                }
                arrayList2.add(Integer.toString(num.intValue()));
            }
            sQLiteDatabaseR.delete("audience_filter_values", a.z("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ", a.z("(", TextUtils.join(",", arrayList2), ")"), " order by rowid desc limit -1 offset ?)"), new String[]{str, Integer.toString(iMax)});
        } catch (SQLiteException e) {
            j().f12472f.h("Database error querying filters. appId", L.q(str), e);
        }
    }

    public final long V(String str) {
        z.e(str);
        return v("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final C2231e W(String str, String str2) throws Throwable {
        Cursor cursorQuery;
        C2236g0 c2236g0 = (C2236g0) this.f12783a;
        z.e(str);
        z.e(str2);
        h();
        o();
        Cursor cursor = null;
        try {
            cursorQuery = r().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    String str3 = string;
                    Object objW = w(cursorQuery, 1);
                    boolean z3 = cursorQuery.getInt(2) != 0;
                    String string2 = cursorQuery.getString(3);
                    long j5 = cursorQuery.getLong(4);
                    P pK = k();
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator<C2264v> creator = C2264v.CREATOR;
                    C2231e c2231e = new C2231e(str, str3, new k1(cursorQuery.getLong(8), objW, str2, str3), cursorQuery.getLong(6), z3, string2, (C2264v) pK.v(blob, creator), j5, (C2264v) k().v(cursorQuery.getBlob(7), creator), cursorQuery.getLong(9), (C2264v) k().v(cursorQuery.getBlob(10), creator));
                    if (cursorQuery.moveToNext()) {
                        j().f12472f.h("Got multiple records for conditional property, expected one", L.q(str), c2236g0.f12685m.g(str2));
                    }
                    cursorQuery.close();
                    return c2231e;
                } catch (SQLiteException e) {
                    e = e;
                    j().f12472f.i("Error querying conditional property", L.q(str), c2236g0.f12685m.g(str2), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
        }
        th = th;
        cursor = cursorQuery;
        if (cursor != null) {
            cursor.close();
        }
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0135  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v7 */
    public final C2260t X(String str, String str2) throws Throwable {
        Boolean boolValueOf;
        z.e(str);
        z.e(str2);
        h();
        o();
        ?? r4 = "current_bundle_count";
        ?? r1 = 0;
        try {
            try {
                Cursor cursorQuery = r().query("events", (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    long j5 = cursorQuery.getLong(0);
                    long j6 = cursorQuery.getLong(1);
                    long j7 = cursorQuery.getLong(2);
                    long j8 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                    Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                    Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                    Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                    if (cursorQuery.isNull(7)) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                    }
                    C2260t c2260t = new C2260t(str, str2, j5, j6, cursorQuery.isNull(8) ? 0L : cursorQuery.getLong(8), j7, j8, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                    if (cursorQuery.moveToNext()) {
                        j().f12472f.f(L.q(str), "Got multiple records for event aggregates, expected one. appId");
                    }
                    cursorQuery.close();
                    return c2260t;
                } catch (SQLiteException e) {
                    e = e;
                    r4 = cursorQuery;
                    try {
                        try {
                            j().f12472f.i("Error querying events. appId", L.q(str), ((C2236g0) this.f12783a).f12685m.b(str2), e);
                            if (r4 != 0) {
                                r4.close();
                            }
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            r1 = r4;
                            if (r1 != 0) {
                                r1.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r1 = r4;
                        if (r1 != 0) {
                            r1.close();
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                r1 = r4;
                if (r1 != 0) {
                    r1.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            r4 = 0;
        } catch (Throwable th4) {
            th = th4;
            if (r1 != 0) {
                r1.close();
            }
            throw th;
        }
    }

    public final S Y(String str) {
        Cursor cursorQuery;
        Boolean boolValueOf;
        C2236g0 c2236g0 = (C2236g0) this.f12783a;
        z.e(str);
        h();
        o();
        Cursor cursor = null;
        try {
            cursorQuery = r().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    S s2 = new S(this.f12662b.f12726l, str);
                    C2236g0 c2236g1 = s2.f12517a;
                    s2.k(cursorQuery.getString(0));
                    s2.u(cursorQuery.getString(1));
                    s2.y(cursorQuery.getString(2));
                    s2.G(cursorQuery.getLong(3));
                    s2.H(cursorQuery.getLong(4));
                    s2.F(cursorQuery.getLong(5));
                    s2.q(cursorQuery.getString(6));
                    s2.o(cursorQuery.getString(7));
                    s2.E(cursorQuery.getLong(8));
                    s2.A(cursorQuery.getLong(9));
                    s2.l(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                    s2.z(cursorQuery.getLong(11));
                    s2.v(cursorQuery.getLong(12));
                    s2.t(cursorQuery.getLong(13));
                    s2.p(cursorQuery.getLong(14));
                    s2.n(cursorQuery.getLong(15));
                    s2.C(cursorQuery.getLong(16));
                    s2.a(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                    s2.s(cursorQuery.getString(18));
                    s2.r(cursorQuery.getLong(19));
                    s2.x(cursorQuery.getLong(20));
                    s2.w(cursorQuery.getString(21));
                    boolean z3 = cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0;
                    C2226b0 c2226b0 = c2236g1.f12682j;
                    C2236g0.d(c2226b0);
                    c2226b0.h();
                    s2.f12514J |= s2.p != z3;
                    s2.p = z3;
                    s2.b(cursorQuery.getString(24));
                    s2.B(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                    if (!cursorQuery.isNull(26)) {
                        s2.c(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                    }
                    o4.a();
                    boolean zT = c2236g0.g.t(str, AbstractC2268x.f12964r0);
                    C2235g c2235g = c2236g0.g;
                    if (zT || c2235g.t(null, AbstractC2268x.f12961p0)) {
                        String string = cursorQuery.getString(28);
                        C2226b0 c2226b1 = c2236g1.f12682j;
                        C2236g0.d(c2226b1);
                        c2226b1.h();
                        s2.f12514J |= !Objects.equals(s2.u, string);
                        s2.u = string;
                    }
                    v4.p.get();
                    if (c2235g.t(null, AbstractC2268x.f12966s0)) {
                        boolean z4 = (cursorQuery.isNull(29) || cursorQuery.getInt(29) == 0) ? false : true;
                        C2226b0 c2226b2 = c2236g1.f12682j;
                        C2236g0.d(c2226b2);
                        c2226b2.h();
                        s2.f12514J |= s2.f12532v != z4;
                        s2.f12532v = z4;
                        if (c2235g.t(null, AbstractC2268x.f12967t0)) {
                            String string2 = cursorQuery.getString(36);
                            C2226b0 c2226b3 = c2236g1.f12682j;
                            C2236g0.d(c2226b3);
                            c2226b3.h();
                            s2.f12514J |= s2.f12506B != string2;
                            s2.f12506B = string2;
                        }
                    }
                    s2.J(cursorQuery.getLong(30));
                    s2.I(cursorQuery.getLong(31));
                    C2010c4.a();
                    if (c2235g.t(str, AbstractC2268x.f12891C0)) {
                        int i5 = cursorQuery.getInt(32);
                        C2226b0 c2226b4 = c2236g1.f12682j;
                        C2236g0.d(c2226b4);
                        c2226b4.h();
                        s2.f12514J |= s2.f12535y != i5;
                        s2.f12535y = i5;
                        s2.j(cursorQuery.getLong(35));
                    }
                    C2039h3.a();
                    if (c2235g.t(str, AbstractC2268x.f12917P0)) {
                        boolean z5 = (cursorQuery.isNull(33) || cursorQuery.getInt(33) == 0) ? false : true;
                        C2226b0 c2226b5 = c2236g1.f12682j;
                        C2236g0.d(c2226b5);
                        c2226b5.h();
                        s2.f12514J |= s2.f12536z != z5;
                        s2.f12536z = z5;
                    }
                    C2072n3.a();
                    if (c2235g.t(str, AbstractC2268x.f12907K0)) {
                        if (cursorQuery.isNull(34)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getInt(34) != 0);
                        }
                        C2226b0 c2226b6 = c2236g1.f12682j;
                        C2236g0.d(c2226b6);
                        c2226b6.h();
                        s2.f12514J = (true ^ Objects.equals(s2.f12530r, boolValueOf)) | s2.f12514J;
                        s2.f12530r = boolValueOf;
                    }
                    C2226b0 c2226b7 = c2236g1.f12682j;
                    C2236g0.d(c2226b7);
                    c2226b7.h();
                    s2.f12514J = false;
                    if (cursorQuery.moveToNext()) {
                        j().f12472f.f(L.q(str), "Got multiple records for app, expected one. appId");
                    }
                    cursorQuery.close();
                    return s2;
                } catch (SQLiteException e) {
                    e = e;
                    j().f12472f.h("Error querying app. appId", L.q(str), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
        }
        th = th;
        cursor = cursorQuery;
        if (cursor != null) {
            cursor.close();
        }
        throw th;
    }

    public final l1 Z(String str, String str2) {
        Cursor cursorQuery;
        z.e(str);
        z.e(str2);
        h();
        o();
        Cursor cursor = null;
        try {
            cursorQuery = r().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    long j5 = cursorQuery.getLong(0);
                    Object objW = w(cursorQuery, 1);
                    if (objW == null) {
                        cursorQuery.close();
                        return null;
                    }
                    l1 l1Var = new l1(str, cursorQuery.getString(2), str2, j5, objW);
                    if (cursorQuery.moveToNext()) {
                        j().f12472f.f(L.q(str), "Got multiple records for user property, expected one. appId");
                    }
                    cursorQuery.close();
                    return l1Var;
                } catch (SQLiteException e) {
                    e = e;
                    j().f12472f.i("Error querying user property. appId", L.q(str), ((C2236g0) this.f12783a).f12685m.g(str2), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
        }
        th = th;
        cursor = cursorQuery;
        if (cursor != null) {
            cursor.close();
        }
        throw th;
    }

    public final Map a0(String str, String str2) {
        o();
        h();
        z.e(str);
        z.e(str2);
        C2174e c2174e = new C2174e(0);
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = r().query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{str, str2}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map mapEmptyMap = Collections.emptyMap();
                    cursorQuery.close();
                    return mapEmptyMap;
                }
                do {
                    try {
                        C2108v0 c2108v0 = (C2108v0) ((C2103u0) P.x(C2108v0.u(), cursorQuery.getBlob(1))).a();
                        int i5 = cursorQuery.getInt(0);
                        List arrayList = (List) c2174e.get(Integer.valueOf(i5));
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            c2174e.put(Integer.valueOf(i5), arrayList);
                        }
                        arrayList.add(c2108v0);
                    } catch (IOException e) {
                        j().f12472f.h("Failed to merge filter. appId", L.q(str), e);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return c2174e;
            } catch (SQLiteException e3) {
                j().f12472f.h("Database error querying filters. appId", L.q(str), e3);
                Map mapEmptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return mapEmptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final Map b0(String str, String str2) {
        o();
        h();
        z.e(str);
        z.e(str2);
        C2174e c2174e = new C2174e(0);
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = r().query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{str, str2}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map mapEmptyMap = Collections.emptyMap();
                    cursorQuery.close();
                    return mapEmptyMap;
                }
                do {
                    try {
                        B0 b5 = (B0) ((A0) P.x(B0.s(), cursorQuery.getBlob(1))).a();
                        int i5 = cursorQuery.getInt(0);
                        List arrayList = (List) c2174e.get(Integer.valueOf(i5));
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            c2174e.put(Integer.valueOf(i5), arrayList);
                        }
                        arrayList.add(b5);
                    } catch (IOException e) {
                        j().f12472f.h("Failed to merge filter", L.q(str), e);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return c2174e;
            } catch (SQLiteException e3) {
                j().f12472f.h("Database error querying filters. appId", L.q(str), e3);
                Map mapEmptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return mapEmptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void c0(String str, String str2) {
        z.e(str);
        z.e(str2);
        h();
        o();
        try {
            r().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            L lJ = j();
            lJ.f12472f.i("Error deleting user property. appId", L.q(str), ((C2236g0) this.f12783a).f12685m.g(str2), e);
        }
    }

    public final List d0(String str) {
        z.e(str);
        h();
        o();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = r().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                do {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j5 = cursorQuery.getLong(2);
                    Object objW = w(cursorQuery, 3);
                    if (objW == null) {
                        j().f12472f.f(L.q(str), "Read invalid user property value, ignoring it. appId");
                    } else {
                        arrayList.add(new l1(str, str2, string, j5, objW));
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e) {
                j().f12472f.h("Error querying user properties. appId", L.q(str), e);
                List listEmptyList = Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public final void e0() {
        o();
        r().beginTransaction();
    }

    public final void f0() {
        o();
        r().endTransaction();
    }

    public final void g0() {
        h();
        o();
        C2236g0 c2236g0 = (C2236g0) this.f12783a;
        if (c2236g0.f12675a.getDatabasePath("google_app_measurement.db").exists()) {
            j1 j1Var = this.f12662b;
            long jA = j1Var.f12723i.e.a();
            c2236g0.f12686n.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jA) > ((Long) AbstractC2268x.f12977z.a(null)).longValue()) {
                j1Var.f12723i.e.b(jElapsedRealtime);
                h();
                o();
                if (c2236g0.f12675a.getDatabasePath("google_app_measurement.db").exists()) {
                    SQLiteDatabase sQLiteDatabaseR = r();
                    c2236g0.f12686n.getClass();
                    int iDelete = sQLiteDatabaseR.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(C2235g.v())});
                    if (iDelete > 0) {
                        L lJ = j();
                        lJ.f12479n.f(Integer.valueOf(iDelete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final void h0() {
        o();
        r().setTransactionSuccessful();
    }

    @Override // p082t2.h1
    public final boolean q() {
        return false;
    }

    public final SQLiteDatabase r() {
        h();
        try {
            return this.f12746d.getWritableDatabase();
        } catch (SQLiteException e) {
            j().f12474i.f(e, "Error opening database");
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
    public final String s() throws Throwable {
        Throwable th;
        Cursor cursorRawQuery;
        ?? R2 = r();
        try {
            try {
                cursorRawQuery = R2.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (!cursorRawQuery.moveToFirst()) {
                        cursorRawQuery.close();
                        return null;
                    }
                    String string = cursorRawQuery.getString(0);
                    cursorRawQuery.close();
                    return string;
                } catch (SQLiteException e) {
                    e = e;
                    j().f12472f.f(e, "Database error getting next bundle app id");
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                if (R2 != 0) {
                    R2.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorRawQuery = null;
        } catch (Throwable th3) {
            th = th3;
            R2 = 0;
            if (R2 != 0) {
                R2.close();
            }
            throw th;
        }
    }

    public final long t(C2049j1 c2049j1) {
        h();
        o();
        z.e(c2049j1.U1());
        byte[] bArrC = c2049j1.c();
        long jS = k().s(bArrC);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c2049j1.U1());
        contentValues.put("metadata_fingerprint", Long.valueOf(jS));
        contentValues.put("metadata", bArrC);
        try {
            r().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return jS;
        } catch (SQLiteException e) {
            L lJ = j();
            lJ.f12472f.h("Error storing raw event metadata. appId", L.q(c2049j1.U1()), e);
            throw e;
        }
    }

    public final long u(String str) {
        z.e(str);
        h();
        o();
        try {
            return r().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, ((C2236g0) this.f12783a).g.p(str, AbstractC2268x.f12963r))))});
        } catch (SQLiteException e) {
            j().f12472f.h("Error deleting over the limit events. appId", L.q(str), e);
            return 0L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002e  */
    public final long v(String str, String[] strArr, long j5) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = r().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return j5;
                }
                long j6 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j6;
            } catch (SQLiteException e) {
                j().f12472f.h("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        throw th;
    }

    public final Object w(Cursor cursor, int i5) {
        int type = cursor.getType(i5);
        if (type == 0) {
            j().f12472f.g("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i5));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i5));
        }
        if (type == 3) {
            return cursor.getString(i5);
        }
        if (type == 4) {
            j().f12472f.g("Loaded invalid blob type value, ignoring it");
            return null;
        }
        L lJ = j();
        lJ.f12472f.f(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r4v0, types: [long] */
    public final String x(long j5) throws Throwable {
        Cursor cursorRawQuery;
        h();
        o();
        ?? r1 = 0;
        try {
            try {
                cursorRawQuery = r().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf((long) j5)});
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        String string = cursorRawQuery.getString(0);
                        cursorRawQuery.close();
                        return string;
                    }
                    j().f12479n.g("No expired configs for apps with pending events");
                    cursorRawQuery.close();
                    return null;
                } catch (SQLiteException e) {
                    e = e;
                    j().f12472f.f(e, "Error selecting expired configs");
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                r1 = j5;
                if (r1 != 0) {
                    r1.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r1 != 0) {
                r1.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002e  */
    public final String y(String str, String str2, String[] strArr) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = r().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return str2;
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e) {
                j().f12472f.h("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:94:0x01be  */
    public final List z(int i5, int i6, String str) throws Throwable {
        long jY;
        long jY2;
        h();
        o();
        int i7 = 1;
        z.b(i5 > 0);
        z.b(i6 > 0);
        z.e(str);
        Cursor cursor = null;
        try {
            Cursor cursorQuery = r().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i5));
            try {
                if (!cursorQuery.moveToFirst()) {
                    List listEmptyList = Collections.emptyList();
                    cursorQuery.close();
                    return listEmptyList;
                }
                ArrayList arrayList = new ArrayList();
                int length = 0;
                while (true) {
                    long j5 = cursorQuery.getLong(0);
                    try {
                        byte[] bArrB0 = k().b0(cursorQuery.getBlob(i7));
                        if (!arrayList.isEmpty() && bArrB0.length + length > i6) {
                            break;
                        }
                        try {
                            C2043i1 c2043i1 = (C2043i1) P.x(C2049j1.S1(), bArrB0);
                            C2072n3.a();
                            try {
                                if (((C2236g0) this.f12783a).g.t(null, AbstractC2268x.f12915O0) && !arrayList.isEmpty()) {
                                    C2049j1 c2049j1 = (C2049j1) ((Pair) arrayList.get(0)).first;
                                    C2049j1 c2049j2 = (C2049j1) c2043i1.a();
                                    if (!c2049j1.D().equals(c2049j2.D()) || !c2049j1.C().equals(c2049j2.C()) || c2049j1.T() != c2049j2.T() || !c2049j1.E().equals(c2049j2.E())) {
                                        break;
                                    }
                                    Iterator it = c2049j1.R().iterator();
                                    while (true) {
                                        jY = -1;
                                        if (!it.hasNext()) {
                                            jY2 = -1;
                                            break;
                                        }
                                        C2085q1 c2085q1 = (C2085q1) it.next();
                                        if ("_npa".equals(c2085q1.C())) {
                                            jY2 = c2085q1.y();
                                            break;
                                        }
                                    }
                                    for (C2085q1 c2085q2 : c2049j2.R()) {
                                        if ("_npa".equals(c2085q2.C())) {
                                            jY = c2085q2.y();
                                            break;
                                        }
                                    }
                                    if (jY2 != jY) {
                                        break;
                                    }
                                }
                                if (!cursorQuery.isNull(2)) {
                                    int i8 = cursorQuery.getInt(2);
                                    c2043i1.c();
                                    C2049j1.r((C2049j1) c2043i1.p, i8);
                                }
                                length += bArrB0.length;
                                arrayList.add(Pair.create((C2049j1) c2043i1.a(), Long.valueOf(j5)));
                                if (!cursorQuery.moveToNext() || length > i6) {
                                    break;
                                }
                                i7 = 1;
                            } catch (SQLiteException e) {
                                e = e;
                                cursor = cursorQuery;
                                try {
                                    j().f12472f.h("Error querying bundles. appId", L.q(str), e);
                                    List listEmptyList2 = Collections.emptyList();
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    return listEmptyList2;
                                } catch (Throwable th) {
                                    th = th;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                cursor = cursorQuery;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        } catch (IOException e3) {
                            j().f12472f.h("Failed to merge queued bundle. appId", L.q(str), e3);
                        }
                    } catch (IOException e5) {
                        j().f12472f.h("Failed to unzip queued bundle. appId", L.q(str), e5);
                    }
                }
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e6) {
                e = e6;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (SQLiteException e7) {
            e = e7;
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
