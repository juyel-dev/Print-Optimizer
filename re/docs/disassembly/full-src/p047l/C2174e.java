package p047l;

import com.google.android.gms.internal.ads.Wt;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2174e extends Y implements Map {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Wt f11775r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C2171b f11776s;
    public C2173d t;

    @Override // java.util.Map
    public final Set entrySet() {
        Wt wt = this.f11775r;
        if (wt != null) {
            return wt;
        }
        Wt wt2 = new Wt(2, this);
        this.f11775r = wt2;
        return wt2;
    }

    public final boolean k(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C2171b c2171b = this.f11776s;
        if (c2171b != null) {
            return c2171b;
        }
        C2171b c2171b2 = new C2171b(this);
        this.f11776s = c2171b2;
        return c2171b2;
    }

    public final boolean l(Collection collection) {
        int i5 = this.q;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i5 != this.q;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.q);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C2173d c2173d = this.t;
        if (c2173d != null) {
            return c2173d;
        }
        C2173d c2173d2 = new C2173d(this);
        this.t = c2173d2;
        return c2173d2;
    }
}
