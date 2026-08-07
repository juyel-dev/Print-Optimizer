package p060n3;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements Iterator {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public l f11931o;
    public l p = null;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ m f11932r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f11933s;

    public j(m mVar, int i5) {
        this.f11933s = i5;
        this.f11932r = mVar;
        this.f11931o = mVar.t.f11936r;
        this.q = mVar.f11943s;
    }

    public final Object a() {
        return b();
    }

    public final l b() {
        l lVar = this.f11931o;
        m mVar = this.f11932r;
        if (lVar == mVar.t) {
            throw new NoSuchElementException();
        }
        if (mVar.f11943s != this.q) {
            throw new ConcurrentModificationException();
        }
        this.f11931o = lVar.f11936r;
        this.p = lVar;
        return lVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11931o != this.f11932r.t;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f11933s) {
            case 1:
                return b().t;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        l lVar = this.p;
        if (lVar == null) {
            throw new IllegalStateException();
        }
        m mVar = this.f11932r;
        mVar.d(lVar, true);
        this.p = null;
        this.q = mVar.f11943s;
    }
}
