package p060n3;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends AbstractSet {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f11934o;
    public final /* synthetic */ m p;

    public /* synthetic */ k(m mVar, int i5) {
        this.f11934o = i5;
        this.p = mVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f11934o) {
            case 0:
                this.p.clear();
                break;
            default:
                this.p.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        l lVarA;
        switch (this.f11934o) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                m mVar = this.p;
                mVar.getClass();
                Object key = entry.getKey();
                l lVar = null;
                if (key != null) {
                    try {
                        lVarA = mVar.a(key, false);
                    } catch (ClassCastException unused) {
                        lVarA = null;
                    }
                    break;
                } else {
                    lVarA = null;
                }
                if (lVarA != null && Objects.equals(lVarA.f11938v, entry.getValue())) {
                    lVar = lVarA;
                }
                return lVar != null;
            default:
                return this.p.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f11934o) {
            case 0:
                return new j(this.p, 0);
            default:
                return new j(this.p, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        l lVarA;
        switch (this.f11934o) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                m mVar = this.p;
                mVar.getClass();
                Object key = entry.getKey();
                l lVar = null;
                if (key != null) {
                    try {
                        lVarA = mVar.a(key, false);
                    } catch (ClassCastException unused) {
                        lVarA = null;
                    }
                    break;
                } else {
                    lVarA = null;
                }
                if (lVarA != null && Objects.equals(lVarA.f11938v, entry.getValue())) {
                    lVar = lVarA;
                }
                if (lVar == null) {
                    return false;
                }
                mVar.d(lVar, true);
                return true;
            default:
                m mVar2 = this.p;
                mVar2.getClass();
                l lVarA2 = null;
                if (obj != null) {
                    try {
                        lVarA2 = mVar2.a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (lVarA2 != null) {
                    mVar2.d(lVarA2, true);
                }
                return lVarA2 != null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f11934o) {
            case 0:
                break;
        }
        return this.p.f11942r;
    }
}
