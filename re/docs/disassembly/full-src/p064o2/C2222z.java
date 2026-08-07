package p064o2;

import java.util.Iterator;

/* JADX INFO: renamed from: o2.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2222z extends AbstractC2212o {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Object[] f12162w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C2222z f12163x;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final transient Object[] f12164r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final transient int f12165s;
    public final transient Object[] t;
    public final transient int u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient int f12166v;

    static {
        Object[] objArr = new Object[0];
        f12162w = objArr;
        f12163x = new C2222z(objArr, objArr, 0, 0, 0);
    }

    public C2222z(Object[] objArr, Object[] objArr2, int i5, int i6, int i7) {
        this.f12164r = objArr;
        this.f12165s = i5;
        this.t = objArr2;
        this.u = i6;
        this.f12166v = i7;
    }

    @Override // p064o2.AbstractC2205h
    public final int c(Object[] objArr) {
        Object[] objArr2 = this.f12164r;
        int i5 = this.f12166v;
        System.arraycopy(objArr2, 0, objArr, 0, i5);
        return i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.t;
            if (objArr.length != 0) {
                int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) obj.hashCode()) * (-862048943)), 15)) * 461845907);
                while (true) {
                    int i5 = iRotateLeft & this.u;
                    Object obj2 = objArr[i5];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iRotateLeft = i5 + 1;
                }
            }
        }
        return false;
    }

    @Override // p064o2.AbstractC2205h
    public final int g() {
        return this.f12166v;
    }

    @Override // p064o2.AbstractC2212o, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f12165s;
    }

    @Override // p064o2.AbstractC2205h
    public final int i() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return s().listIterator(0);
    }

    @Override // p064o2.AbstractC2205h
    public final F k() {
        return s().listIterator(0);
    }

    @Override // p064o2.AbstractC2205h
    public final Object[] l() {
        return this.f12164r;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f12166v;
    }

    @Override // p064o2.AbstractC2212o
    public final AbstractC2210m t() {
        return AbstractC2210m.s(this.f12166v, this.f12164r);
    }
}
