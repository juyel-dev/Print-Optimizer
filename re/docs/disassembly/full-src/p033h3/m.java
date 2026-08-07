package p033h3;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import h1.d;
import h1.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000a.a;
import p020e1.i;
import p020e1.j;
import p020e1.l;
import p042j3.c;
import p049l1.f;
import p049l1.h;
import p054m1.b;
import p101x2.g;
import p101x2.o;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m implements g, b, f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f11480o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f11481r;

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, int i5) {
        this.f11480o = i5;
        this.p = obj;
        this.q = obj2;
        this.f11481r = obj3;
    }

    @Override // p101x2.g
    public o a(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.p;
        String str = (String) this.q;
        s sVar = (s) this.f11481r;
        String str2 = (String) obj;
        c cVarC = FirebaseMessaging.c(firebaseMessaging.f10846b);
        K2.g gVar = firebaseMessaging.f10845a;
        gVar.a();
        String strC = "[DEFAULT]".equals(gVar.f608b) ? "" : gVar.c();
        String strF = firebaseMessaging.f10851i.f();
        synchronized (cVarC) {
            String strA = s.a(str2, strF, System.currentTimeMillis());
            if (strA != null) {
                SharedPreferences.Editor editorEdit = ((SharedPreferences) cVarC.p).edit();
                editorEdit.putString(strC + "|T|" + str + "|*", strA);
                editorEdit.commit();
            }
        }
        if (sVar == null || !str2.equals(sVar.f11490a)) {
            K2.g gVar2 = firebaseMessaging.f10845a;
            gVar2.a();
            if ("[DEFAULT]".equals(gVar2.f608b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                    gVar2.a();
                    sb.append(gVar2.f608b);
                    Log.d("FirebaseMessaging", sb.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new j(firebaseMessaging.f10846b).b(intent);
            }
        }
        return a.o(str2);
    }

    @Override // p049l1.f
    public Object apply(Object obj) {
        int i5;
        int i6;
        long jInsert;
        h1.c cVar;
        h1.c cVar2;
        String str = "bytes";
        int i7 = 5;
        int i8 = 4;
        int i9 = 3;
        h1.c cVar3 = h1.c.CACHE_FULL;
        int i10 = 2;
        Object obj2 = this.f11481r;
        int i11 = 0;
        Object obj3 = this.q;
        Object obj4 = this.p;
        int i12 = 1;
        switch (this.f11480o) {
            case 2:
                Cursor cursor = (Cursor) obj;
                h hVar = (h) obj4;
                hVar.getClass();
                while (cursor.moveToNext()) {
                    long j5 = cursor.getLong(0);
                    int i13 = cursor.getInt(7) != 0 ? i12 : 0;
                    p020e1.h hVar2 = new p020e1.h();
                    hVar2.g = new HashMap();
                    String string = cursor.getString(i12);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    hVar2.f11066b = string;
                    hVar2.e = Long.valueOf(cursor.getLong(i10));
                    hVar2.f11069f = Long.valueOf(cursor.getLong(3));
                    if (i13 != 0) {
                        String string2 = cursor.getString(4);
                        hVar2.f11068d = new l(string2 == null ? h.t : new p007b1.c(string2), cursor.getBlob(5));
                        i5 = i12;
                        i6 = 6;
                    } else {
                        String string3 = cursor.getString(4);
                        p007b1.c cVar4 = string3 == null ? h.t : new p007b1.c(string3);
                        Cursor cursorQuery = hVar.c().query("event_payloads", new String[]{str}, "event_id = ?", new String[]{String.valueOf(j5)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList = new ArrayList();
                            int length = 0;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList.add(blob);
                                length += blob.length;
                            }
                            byte[] bArr = new byte[length];
                            int i14 = 0;
                            int length2 = 0;
                            while (i14 < arrayList.size()) {
                                byte[] bArr2 = (byte[]) arrayList.get(i14);
                                ArrayList arrayList2 = arrayList;
                                System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
                                length2 += bArr2.length;
                                i14++;
                                arrayList = arrayList2;
                            }
                            i5 = 1;
                            cursorQuery.close();
                            hVar2.f11068d = new l(cVar4, bArr);
                            i6 = 6;
                        } catch (Throwable th) {
                            cursorQuery.close();
                            throw th;
                        }
                    }
                    if (!cursor.isNull(i6)) {
                        hVar2.f11067c = Integer.valueOf(cursor.getInt(i6));
                    }
                    ((ArrayList) obj3).add(new p049l1.b(j5, (j) obj2, hVar2.b()));
                    i12 = i5;
                    str = str;
                    i10 = 2;
                }
                return null;
            case 3:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                h hVar3 = (h) obj4;
                long jSimpleQueryForLong = hVar3.c().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar3.c().compileStatement("PRAGMA page_count").simpleQueryForLong();
                p049l1.a aVar = hVar3.f11831r;
                long j6 = aVar.f11820a;
                i iVar = (i) obj3;
                String str2 = iVar.f11070a;
                if (jSimpleQueryForLong >= j6) {
                    hVar3.j(1L, cVar3, str2);
                    return -1L;
                }
                j jVar = (j) obj2;
                Long lG = h.g(sQLiteDatabase, jVar);
                if (lG != null) {
                    jInsert = lG.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", jVar.f11075a);
                    contentValues.put("priority", Integer.valueOf(p063o1.a.a(jVar.f11077c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr3 = jVar.f11076b;
                    if (bArr3 != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr3, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                l lVar = iVar.f11072c;
                byte[] bArr4 = lVar.f11082b;
                int length3 = bArr4.length;
                int i15 = aVar.e;
                boolean z3 = length3 <= i15;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str2);
                contentValues2.put("timestamp_ms", Long.valueOf(iVar.f11073d));
                contentValues2.put("uptime_ms", Long.valueOf(iVar.e));
                contentValues2.put("payload_encoding", lVar.f11081a.f2407a);
                contentValues2.put("code", iVar.f11071b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z3));
                contentValues2.put("payload", z3 ? bArr4 : new byte[0]);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z3) {
                    int iCeil = (int) Math.ceil(((double) bArr4.length) / ((double) i15));
                    for (int i16 = 1; i16 <= iCeil; i16++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr4, (i16 - 1) * i15, Math.min(i16 * i15, bArr4.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i16));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(iVar.f11074f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            default:
                Cursor cursor2 = (Cursor) obj;
                h hVar4 = (h) obj4;
                hVar4.getClass();
                while (true) {
                    HashMap map = (HashMap) obj3;
                    if (cursor2.moveToNext()) {
                        String string4 = cursor2.getString(i11);
                        int i17 = cursor2.getInt(1);
                        h1.c cVar5 = h1.c.REASON_UNKNOWN;
                        if (i17 != 0) {
                            if (i17 == 1) {
                                cVar5 = h1.c.MESSAGE_TOO_OLD;
                            } else if (i17 == 2) {
                                cVar = cVar3;
                                cVar2 = cVar;
                            } else if (i17 == i9) {
                                cVar5 = h1.c.PAYLOAD_TOO_BIG;
                            } else if (i17 == i8) {
                                cVar5 = h1.c.MAX_RETRIES_REACHED;
                            } else if (i17 == i7) {
                                cVar5 = h1.c.INVALID_PAYLOD;
                            } else if (i17 == 6) {
                                cVar5 = h1.c.SERVER_ERROR;
                            } else {
                                p003a2.a.q("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i17));
                            }
                            cVar2 = cVar3;
                            cVar = cVar5;
                        } else {
                            cVar2 = cVar3;
                            cVar = cVar5;
                        }
                        long j7 = cursor2.getLong(2);
                        if (!map.containsKey(string4)) {
                            map.put(string4, new ArrayList());
                        }
                        ((List) map.get(string4)).add(new d(j7, cVar));
                        cVar3 = cVar2;
                        i7 = 5;
                        i8 = 4;
                        i9 = 3;
                        i11 = 0;
                    } else {
                        Iterator it = map.entrySet().iterator();
                        while (true) {
                            r rVar = (r) obj2;
                            if (!it.hasNext()) {
                                long jQ = hVar4.p.q();
                                SQLiteDatabase sQLiteDatabaseC = hVar4.c();
                                sQLiteDatabaseC.beginTransaction();
                                try {
                                    Cursor cursorRawQuery = sQLiteDatabaseC.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                                    try {
                                        cursorRawQuery.moveToNext();
                                        h1.g gVar = new h1.g(cursorRawQuery.getLong(0), jQ);
                                        cursorRawQuery.close();
                                        sQLiteDatabaseC.setTransactionSuccessful();
                                        sQLiteDatabaseC.endTransaction();
                                        rVar.p = gVar;
                                        rVar.f11488r = new h1.b(new h1.f(hVar4.c().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar4.c().compileStatement("PRAGMA page_count").simpleQueryForLong(), p049l1.a.f11819f.f11820a));
                                        rVar.f11487o = (String) hVar4.f11832s.get();
                                        return new h1.a((h1.g) rVar.p, Collections.unmodifiableList((ArrayList) rVar.q), (h1.b) rVar.f11488r, (String) rVar.f11487o);
                                    } catch (Throwable th2) {
                                        cursorRawQuery.close();
                                        throw th2;
                                    }
                                } catch (Throwable th3) {
                                    sQLiteDatabaseC.endTransaction();
                                    throw th3;
                                }
                            }
                            Map.Entry entry2 = (Map.Entry) it.next();
                            int i18 = e.f11433c;
                            new ArrayList();
                            ((ArrayList) rVar.q).add(new e((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                        }
                    }
                }
                break;
        }
    }

    @Override // p054m1.b
    public Object b() {
        p040j1.a aVar = (p040j1.a) this.p;
        h hVar = (h) aVar.f11570d;
        hVar.getClass();
        j jVar = (j) this.q;
        i iVar = (i) this.f11481r;
        String strX = p003a2.a.x("SQLiteEventStore");
        if (Log.isLoggable(strX, 3)) {
            Log.d(strX, "Storing event with priority=" + jVar.f11077c + ", name=" + iVar.f11070a + " for destination " + jVar.f11075a);
        }
        ((Long) hVar.h(new m(hVar, iVar, jVar, 3))).getClass();
        aVar.f11567a.a(jVar, 1, false);
        return null;
    }
}
