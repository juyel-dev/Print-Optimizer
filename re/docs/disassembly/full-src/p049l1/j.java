package p049l1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;
import p035i0.a;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends SQLiteOpenHelper {
    public static final String q = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f11834r = 5;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final List f11835s = Arrays.asList(new i(0), new i(1), new i(2), new i(3), new i(4));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f11836o;
    public boolean p;

    public j(int i5, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i5);
        this.p = false;
        this.f11836o = i5;
    }

    public static void c(SQLiteDatabase sQLiteDatabase, int i5, int i6) {
        List list = f11835s;
        if (i6 > list.size()) {
            StringBuilder sbQ = a.q("Migration from ", i5, " to ", i6, " was requested, but cannot be performed. Only ");
            sbQ.append(list.size());
            sbQ.append(" migrations are provided");
            throw new IllegalArgumentException(sbQ.toString());
        }
        while (i5 < i6) {
            switch (((i) list.get(i5)).f11833a) {
                case 0:
                    sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
                    sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
                    sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
                    sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
                    sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
                    break;
                case 1:
                    sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
                    sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
                    sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
                    break;
                case 2:
                    sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
                    break;
                case 3:
                    sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
                    sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
                    break;
                default:
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
                    sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
                    sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
                    sQLiteDatabase.execSQL(q);
                    break;
            }
            i5++;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.p = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!this.p) {
            onConfigure(sQLiteDatabase);
        }
        c(sQLiteDatabase, 0, this.f11836o);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i5, int i6) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.p) {
            onConfigure(sQLiteDatabase);
        }
        c(sQLiteDatabase, 0, i6);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (this.p) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i5, int i6) {
        if (!this.p) {
            onConfigure(sQLiteDatabase);
        }
        c(sQLiteDatabase, i5, i6);
    }
}
