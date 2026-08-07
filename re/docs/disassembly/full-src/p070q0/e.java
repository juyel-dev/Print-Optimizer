package p070q0;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p080t0.b;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f12312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f12313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f12314d;

    public e(String str, HashMap map, HashSet hashSet, HashSet hashSet2) {
        this.f12311a = str;
        this.f12312b = Collections.unmodifiableMap(map);
        this.f12313c = Collections.unmodifiableSet(hashSet);
        this.f12314d = hashSet2 == null ? null : Collections.unmodifiableSet(hashSet2);
    }

    public static e a(b bVar, String str) {
        ArrayList arrayList;
        int i5;
        Cursor cursorU = bVar.u("PRAGMA table_info(`" + str + "`)");
        HashMap map = new HashMap();
        try {
            if (cursorU.getColumnCount() > 0) {
                int columnIndex = cursorU.getColumnIndex("name");
                int columnIndex2 = cursorU.getColumnIndex("type");
                int columnIndex3 = cursorU.getColumnIndex("notnull");
                int columnIndex4 = cursorU.getColumnIndex("pk");
                int columnIndex5 = cursorU.getColumnIndex("dflt_value");
                while (cursorU.moveToNext()) {
                    String string = cursorU.getString(columnIndex);
                    map.put(string, new a(cursorU.getInt(columnIndex4), 2, string, cursorU.getString(columnIndex2), cursorU.getString(columnIndex5), cursorU.getInt(columnIndex3) != 0));
                }
            }
            cursorU.close();
            HashSet hashSet = new HashSet();
            Cursor cursorU2 = bVar.u("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = cursorU2.getColumnIndex("id");
                int columnIndex7 = cursorU2.getColumnIndex("seq");
                int columnIndex8 = cursorU2.getColumnIndex("table");
                int columnIndex9 = cursorU2.getColumnIndex("on_delete");
                int columnIndex10 = cursorU2.getColumnIndex("on_update");
                ArrayList<c> arrayListB = b(cursorU2);
                int count = cursorU2.getCount();
                int i6 = 0;
                while (i6 < count) {
                    cursorU2.moveToPosition(i6);
                    if (cursorU2.getInt(columnIndex7) != 0) {
                        arrayList = arrayListB;
                        i5 = count;
                    } else {
                        int i7 = cursorU2.getInt(columnIndex6);
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        for (c cVar : arrayListB) {
                            ArrayList arrayList4 = arrayListB;
                            int i8 = count;
                            if (cVar.f12306o == i7) {
                                arrayList2.add(cVar.q);
                                arrayList3.add(cVar.f12307r);
                            }
                            arrayListB = arrayList4;
                            count = i8;
                        }
                        arrayList = arrayListB;
                        i5 = count;
                        hashSet.add(new b(cursorU2.getString(columnIndex8), cursorU2.getString(columnIndex9), cursorU2.getString(columnIndex10), arrayList2, arrayList3));
                    }
                    i6++;
                    columnIndex6 = columnIndex6;
                    columnIndex7 = columnIndex7;
                    arrayListB = arrayList;
                    count = i5;
                }
                cursorU2.close();
                Cursor cursorU3 = bVar.u("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = cursorU3.getColumnIndex("name");
                    int columnIndex12 = cursorU3.getColumnIndex("origin");
                    int columnIndex13 = cursorU3.getColumnIndex("unique");
                    HashSet hashSet2 = null;
                    if (columnIndex11 == -1 || columnIndex12 == -1 || columnIndex13 == -1) {
                        cursorU3.close();
                        break;
                    }
                    HashSet hashSet3 = new HashSet();
                    while (true) {
                        if (!cursorU3.moveToNext()) {
                            cursorU3.close();
                            hashSet2 = hashSet3;
                            break;
                        }
                        if ("c".equals(cursorU3.getString(columnIndex12))) {
                            d dVarC = c(bVar, cursorU3.getString(columnIndex11), cursorU3.getInt(columnIndex13) == 1);
                            if (dVarC == null) {
                                cursorU3.close();
                                break;
                            }
                            hashSet3.add(dVarC);
                        }
                    }
                    return new e(str, map, hashSet, hashSet2);
                } catch (Throwable th) {
                    cursorU3.close();
                    throw th;
                }
            } catch (Throwable th2) {
                cursorU2.close();
                throw th2;
            }
        } catch (Throwable th3) {
            cursorU.close();
            throw th3;
        }
    }

    public static ArrayList b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < count; i5++) {
            cursor.moveToPosition(i5);
            arrayList.add(new c(cursor.getString(columnIndex3), cursor.getString(columnIndex4), cursor.getInt(columnIndex), cursor.getInt(columnIndex2)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static d c(b bVar, String str, boolean z3) {
        Cursor cursorU = bVar.u("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorU.getColumnIndex("seqno");
            int columnIndex2 = cursorU.getColumnIndex("cid");
            int columnIndex3 = cursorU.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (cursorU.moveToNext()) {
                    if (cursorU.getInt(columnIndex2) >= 0) {
                        treeMap.put(Integer.valueOf(cursorU.getInt(columnIndex)), cursorU.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                return new d(str, arrayList, z3);
            }
            return null;
        } finally {
            cursorU.close();
        }
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        String str = eVar.f12311a;
        String str2 = this.f12311a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        Map map = eVar.f12312b;
        Map map2 = this.f12312b;
        if (map2 == null ? map != null : !map2.equals(map)) {
            return false;
        }
        Set set2 = eVar.f12313c;
        Set set3 = this.f12313c;
        if (set3 == null ? set2 != null : !set3.equals(set2)) {
            return false;
        }
        Set set4 = this.f12314d;
        if (set4 == null || (set = eVar.f12314d) == null) {
            return true;
        }
        return set4.equals(set);
    }

    public final int hashCode() {
        String str = this.f12311a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f12312b;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set set = this.f12313c;
        return iHashCode2 + (set != null ? set.hashCode() : 0);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f12311a + "', columns=" + this.f12312b + ", foreignKeys=" + this.f12313c + ", indices=" + this.f12314d + '}';
    }
}
