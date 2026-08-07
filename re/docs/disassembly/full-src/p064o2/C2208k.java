package p064o2;

/* JADX INFO: renamed from: o2.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2208k extends AbstractC2210m {
    public final transient AbstractC2210m q;

    public C2208k(AbstractC2210m abstractC2210m) {
        this.q = abstractC2210m;
    }

    @Override // p064o2.AbstractC2210m, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.q.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i5) {
        AbstractC2210m abstractC2210m = this.q;
        AbstractC2198a.e(i5, abstractC2210m.size());
        return abstractC2210m.get((abstractC2210m.size() - 1) - i5);
    }

    @Override // p064o2.AbstractC2210m, java.util.List
    public final int indexOf(Object obj) {
        AbstractC2210m abstractC2210m = this.q;
        int iLastIndexOf = abstractC2210m.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (abstractC2210m.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // p064o2.AbstractC2210m, java.util.List
    public final int lastIndexOf(Object obj) {
        AbstractC2210m abstractC2210m = this.q;
        int iIndexOf = abstractC2210m.indexOf(obj);
        if (iIndexOf >= 0) {
            return (abstractC2210m.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // p064o2.AbstractC2210m
    public final AbstractC2210m o() {
        return this.q;
    }

    @Override // p064o2.AbstractC2210m, java.util.List
    /* JADX INFO: renamed from: r */
    public final AbstractC2210m subList(int i5, int i6) {
        AbstractC2210m abstractC2210m = this.q;
        AbstractC2198a.m(i5, i6, abstractC2210m.size());
        return abstractC2210m.subList(abstractC2210m.size() - i6, abstractC2210m.size() - i5).o();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.q.size();
    }
}
