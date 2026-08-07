package p064o2;

import com.google.android.gms.internal.ads.AbstractC1421mz;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: renamed from: o2.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2211n implements Map, Serializable {
    public static final Map.Entry[] p = new Map.Entry[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public transient AbstractC2212o f12147o;

    @Override // java.util.Map
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AbstractC2212o entrySet() {
        AbstractC2212o rVar = this.f12147o;
        if (rVar == null) {
            C2215s c2215s = (C2215s) this;
            rVar = c2215s.isEmpty() ? C2222z.f12163x : new r(c2215s);
            this.f12147o = rVar;
        }
        return rVar;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return ((C2215s) this).f12154r.contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return ((C2215s) this).entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return AbstractC2198a.b(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((C2215s) this).size() == 0;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        C2215s c2215s = (C2215s) this;
        int size = c2215s.size();
        if (size < 0) {
            throw new IllegalArgumentException(AbstractC1421mz.h(size, "size cannot be negative but was: "));
        }
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z3 = true;
        for (Map.Entry entry : c2215s.entrySet()) {
            if (!z3) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z3 = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
