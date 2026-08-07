package p064o2;

import java.util.Objects;

/* JADX INFO: renamed from: o2.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2221y extends AbstractC2210m {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C2221y f12160s = new C2221y(new Object[0], 0);
    public final transient Object[] q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final transient int f12161r;

    public C2221y(Object[] objArr, int i5) {
        this.q = objArr;
        this.f12161r = i5;
    }

    @Override // p064o2.AbstractC2210m, p064o2.AbstractC2205h
    public final int c(Object[] objArr) {
        Object[] objArr2 = this.q;
        int i5 = this.f12161r;
        System.arraycopy(objArr2, 0, objArr, 0, i5);
        return i5;
    }

    @Override // p064o2.AbstractC2205h
    public final int g() {
        return this.f12161r;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        AbstractC2198a.e(i5, this.f12161r);
        Object obj = this.q[i5];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p064o2.AbstractC2205h
    public final int i() {
        return 0;
    }

    @Override // p064o2.AbstractC2205h
    public final Object[] l() {
        return this.q;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12161r;
    }
}
