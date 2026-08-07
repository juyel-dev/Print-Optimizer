package p038j;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c f11555o;
    public c p;
    public final /* synthetic */ int q;

    public b(c cVar, c cVar2, int i5) {
        this.q = i5;
        this.f11555o = cVar2;
        this.p = cVar;
    }

    @Override // p038j.e
    public final void a(c cVar) {
        c cVar2;
        c cVarB = null;
        if (this.f11555o == cVar && cVar == this.p) {
            this.p = null;
            this.f11555o = null;
        }
        c cVar3 = this.f11555o;
        if (cVar3 == cVar) {
            switch (this.q) {
                case 0:
                    cVar2 = cVar3.f11557r;
                    break;
                default:
                    cVar2 = cVar3.q;
                    break;
            }
            this.f11555o = cVar2;
        }
        c cVar4 = this.p;
        if (cVar4 == cVar) {
            c cVar5 = this.f11555o;
            if (cVar4 != cVar5 && cVar5 != null) {
                cVarB = b(cVar4);
            }
            this.p = cVarB;
        }
    }

    public final c b(c cVar) {
        switch (this.q) {
            case 0:
                return cVar.q;
            default:
                return cVar.f11557r;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.p != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.p;
        c cVar2 = this.f11555o;
        this.p = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
