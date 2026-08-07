package p082t2;

import java.util.Iterator;

/* JADX INFO: renamed from: t2.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2262u implements Iterator {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Iterator f12860o;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12860o.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return (String) this.f12860o.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
