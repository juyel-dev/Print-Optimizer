package p047l;

import P3.a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2170a implements Iterator, a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11768o;
    public int p;
    public boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f11769r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f11770s;

    public C2170a(int i5) {
        this.f11768o = i5;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.p < this.f11768o;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objG;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i5 = this.p;
        switch (this.f11769r) {
            case 0:
                objG = ((C2174e) this.f11770s).g(i5);
                break;
            case 1:
                objG = ((C2174e) this.f11770s).j(i5);
                break;
            default:
                objG = ((C2175f) this.f11770s).p[i5];
                break;
        }
        this.p++;
        this.q = true;
        return objG;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.q) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i5 = this.p - 1;
        this.p = i5;
        switch (this.f11769r) {
            case 0:
                ((C2174e) this.f11770s).h(i5);
                break;
            case 1:
                ((C2174e) this.f11770s).h(i5);
                break;
            default:
                ((C2175f) this.f11770s).g(i5);
                break;
        }
        this.f11768o--;
        this.q = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2170a(C2175f c2175f) {
        this(c2175f.q);
        this.f11769r = 2;
        this.f11770s = c2175f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2170a(C2174e c2174e, int i5) {
        this(c2174e.q);
        this.f11769r = i5;
        switch (i5) {
            case 1:
                this.f11770s = c2174e;
                this(c2174e.q);
                break;
            default:
                this.f11770s = c2174e;
                break;
        }
    }
}
