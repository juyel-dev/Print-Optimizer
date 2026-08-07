package p064o2;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: o2.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2217u extends F {
    public static final Object p = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f12158o;

    public C2217u(Object obj) {
        this.f12158o = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12158o != p;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f12158o;
        Object obj2 = p;
        if (obj == obj2) {
            throw new NoSuchElementException();
        }
        this.f12158o = obj2;
        return obj;
    }
}
