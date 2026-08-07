package p047l;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: l.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2172c implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11772o;
    public int p = -1;
    public boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C2174e f11773r;

    public C2172c(C2174e c2174e) {
        this.f11773r = c2174e;
        this.f11772o = c2174e.q - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.q) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i5 = this.p;
        C2174e c2174e = this.f11773r;
        return o.b(key, c2174e.g(i5)) && o.b(entry.getValue(), c2174e.j(this.p));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.q) {
            return this.f11773r.g(this.p);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.q) {
            return this.f11773r.j(this.p);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.p < this.f11772o;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.q) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i5 = this.p;
        C2174e c2174e = this.f11773r;
        Object objG = c2174e.g(i5);
        Object objJ = c2174e.j(this.p);
        return (objG == null ? 0 : objG.hashCode()) ^ (objJ != null ? objJ.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.p++;
        this.q = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.q) {
            throw new IllegalStateException();
        }
        this.f11773r.h(this.p);
        this.p--;
        this.f11772o--;
        this.q = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.q) {
            return this.f11773r.i(this.p, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
