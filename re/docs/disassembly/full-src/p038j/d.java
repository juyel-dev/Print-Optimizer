package p038j;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c f11558o;
    public boolean p = true;
    public final /* synthetic */ f q;

    public d(f fVar) {
        this.q = fVar;
    }

    @Override // p038j.e
    public final void a(c cVar) {
        c cVar2 = this.f11558o;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f11557r;
            this.f11558o = cVar3;
            this.p = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.p) {
            return this.q.f11559o != null;
        }
        c cVar = this.f11558o;
        return (cVar == null || cVar.q == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.p) {
            this.p = false;
            this.f11558o = this.q.f11559o;
        } else {
            c cVar = this.f11558o;
            this.f11558o = cVar != null ? cVar.q : null;
        }
        return this.f11558o;
    }
}
