package p064o2;

import androidx.compose.foundation.text.modifiers.a;
import com.google.android.gms.internal.ads.AbstractC1421mz;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class D extends AbstractC2212o {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final transient Object f12094r;

    public D(Object obj) {
        this.f12094r = obj;
    }

    @Override // p064o2.AbstractC2205h
    public final int c(Object[] objArr) {
        objArr[0] = this.f12094r;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f12094r.equals(obj);
    }

    @Override // p064o2.AbstractC2212o, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f12094r.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new C2217u(this.f12094r);
    }

    @Override // p064o2.AbstractC2205h
    public final F k() {
        return new C2217u(this.f12094r);
    }

    @Override // p064o2.AbstractC2212o
    public final AbstractC2210m s() {
        Object[] objArr = {this.f12094r};
        for (int i5 = 0; i5 < 1; i5++) {
            C2206i c2206i = AbstractC2210m.p;
            if (objArr[i5] == null) {
                throw new NullPointerException(AbstractC1421mz.h(i5, "at index "));
            }
        }
        return AbstractC2210m.s(1, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return a.z("[", this.f12094r.toString(), "]");
    }
}
