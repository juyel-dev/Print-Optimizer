package p064o2;

/* JADX INFO: renamed from: o2.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2209l extends AbstractC2210m {
    public final transient int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final transient int f12144r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AbstractC2210m f12145s;

    public C2209l(AbstractC2210m abstractC2210m, int i5, int i6) {
        this.f12145s = abstractC2210m;
        this.q = i5;
        this.f12144r = i6;
    }

    @Override // p064o2.AbstractC2205h
    public final int g() {
        return this.f12145s.i() + this.q + this.f12144r;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        AbstractC2198a.e(i5, this.f12144r);
        return this.f12145s.get(i5 + this.q);
    }

    @Override // p064o2.AbstractC2205h
    public final int i() {
        return this.f12145s.i() + this.q;
    }

    @Override // p064o2.AbstractC2205h
    public final Object[] l() {
        return this.f12145s.l();
    }

    @Override // p064o2.AbstractC2210m, java.util.List
    /* JADX INFO: renamed from: r */
    public final AbstractC2210m subList(int i5, int i6) {
        AbstractC2198a.m(i5, i6, this.f12144r);
        int i7 = this.q;
        return this.f12145s.subList(i5 + i7, i6 + i7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12144r;
    }
}
