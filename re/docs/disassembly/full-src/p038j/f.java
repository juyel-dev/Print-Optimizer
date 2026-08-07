package p038j;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class f implements Iterable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c f11559o;
    public c p;
    public final WeakHashMap q = new WeakHashMap();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11560r = 0;

    public c c(Object obj) {
        c cVar = this.f11559o;
        while (cVar != null && !cVar.f11556o.equals(obj)) {
            cVar = cVar.q;
        }
        return cVar;
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f11560r != fVar.f11560r) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = fVar.iterator();
        while (true) {
            bVar = (b) it;
            if (!bVar.hasNext()) {
                break;
            }
            b bVar2 = (b) it2;
            if (!bVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            Object next = bVar2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (bVar.hasNext() || ((b) it2).hasNext()) ? false : true;
    }

    public Object g(Object obj) {
        c cVarC = c(obj);
        if (cVarC == null) {
            return null;
        }
        this.f11560r--;
        WeakHashMap weakHashMap = this.q;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(cVarC);
            }
        }
        c cVar = cVarC.f11557r;
        if (cVar != null) {
            cVar.q = cVarC.q;
        } else {
            this.f11559o = cVarC.q;
        }
        c cVar2 = cVarC.q;
        if (cVar2 != null) {
            cVar2.f11557r = cVar;
        } else {
            this.p = cVar;
        }
        cVarC.q = null;
        cVarC.f11557r = null;
        return cVarC.p;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) bVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.f11559o, this.p, 0);
        this.q.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) bVar.next()).toString());
            if (bVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
