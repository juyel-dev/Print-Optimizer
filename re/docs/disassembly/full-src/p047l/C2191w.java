package p047l;

import O1.i;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;
import p046k2.h;
import p052m.a;

/* JADX INFO: renamed from: l.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2191w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f11809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f11810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11811d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11812f;

    public C2191w(int i5) {
        this.f11808a = i5;
        if (i5 <= 0) {
            a.c("maxSize <= 0");
            throw null;
        }
        this.f11809b = new i(16, (byte) 0);
        this.f11810c = new h(3);
    }

    public Object a(Object key) {
        o.f(key, "key");
        return null;
    }

    public void b(Object key, Object oldValue, Object obj) {
        o.f(key, "key");
        o.f(oldValue, "oldValue");
    }

    public final Object c(Object key) {
        Object objPut;
        o.f(key, "key");
        synchronized (this.f11810c) {
            i iVar = this.f11809b;
            iVar.getClass();
            Object obj = ((LinkedHashMap) iVar.p).get(key);
            if (obj != null) {
                this.e++;
                return obj;
            }
            this.f11812f++;
            Object objA = a(key);
            if (objA == null) {
                return null;
            }
            synchronized (this.f11810c) {
                try {
                    i iVar2 = this.f11809b;
                    iVar2.getClass();
                    objPut = ((LinkedHashMap) iVar2.p).put(key, objA);
                    if (objPut != null) {
                        i iVar3 = this.f11809b;
                        iVar3.getClass();
                        ((LinkedHashMap) iVar3.p).put(key, objPut);
                    } else {
                        this.f11811d += f(key, objA);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (objPut != null) {
                b(key, objA, objPut);
                return objPut;
            }
            h(this.f11808a);
            return objA;
        }
    }

    public final Object d(Object key, Object obj) {
        Object objPut;
        o.f(key, "key");
        synchronized (this.f11810c) {
            this.f11811d += f(key, obj);
            i iVar = this.f11809b;
            iVar.getClass();
            objPut = ((LinkedHashMap) iVar.p).put(key, obj);
            if (objPut != null) {
                this.f11811d -= f(key, objPut);
            }
        }
        if (objPut != null) {
            b(key, objPut, obj);
        }
        h(this.f11808a);
        return objPut;
    }

    public final void e(Object key) {
        Object objRemove;
        o.f(key, "key");
        synchronized (this.f11810c) {
            i iVar = this.f11809b;
            iVar.getClass();
            objRemove = ((LinkedHashMap) iVar.p).remove(key);
            if (objRemove != null) {
                this.f11811d -= f(key, objRemove);
            }
        }
        if (objRemove != null) {
            b(key, objRemove, null);
        }
    }

    public final int f(Object obj, Object obj2) {
        int iG = g(obj, obj2);
        if (iG >= 0) {
            return iG;
        }
        String message = "Negative size: " + obj + '=' + obj2;
        o.f(message, "message");
        throw new IllegalStateException(message);
    }

    public int g(Object key, Object value) {
        o.f(key, "key");
        o.f(value, "value");
        return 1;
    }

    public final void h(int i5) {
        Object next;
        Object key;
        Object value;
        while (true) {
            synchronized (this.f11810c) {
                try {
                    if (!(this.f11811d >= 0 && (!((LinkedHashMap) this.f11809b.p).isEmpty() || this.f11811d == 0))) {
                        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
                    }
                    if (this.f11811d > i5 && !((LinkedHashMap) this.f11809b.p).isEmpty()) {
                        Set setEntrySet = ((LinkedHashMap) this.f11809b.p).entrySet();
                        o.e(setEntrySet, "map.entries");
                        Set set = setEntrySet;
                        if (set instanceof List) {
                            List list = (List) set;
                            next = list.isEmpty() ? null : list.get(0);
                        } else {
                            Iterator it = set.iterator();
                            if (it.hasNext()) {
                                next = it.next();
                            }
                        }
                        Map.Entry entry = (Map.Entry) next;
                        if (entry == null) {
                            return;
                        }
                        key = entry.getKey();
                        value = entry.getValue();
                        i iVar = this.f11809b;
                        iVar.getClass();
                        o.f(key, "key");
                        ((LinkedHashMap) iVar.p).remove(key);
                        this.f11811d -= f(key, value);
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
            b(key, value, null);
        }
    }

    public final String toString() {
        String str;
        synchronized (this.f11810c) {
            try {
                int i5 = this.e;
                int i6 = this.f11812f + i5;
                str = "LruCache[maxSize=" + this.f11808a + ",hits=" + this.e + ",misses=" + this.f11812f + ",hitRate=" + (i6 != 0 ? (i5 * 100) / i6 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
