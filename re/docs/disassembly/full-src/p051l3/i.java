package p051l3;

import p060n3.m;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final m f11855o = new m(false);

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof i) && ((i) obj).f11855o.equals(this.f11855o));
    }

    public final int hashCode() {
        return this.f11855o.hashCode();
    }
}
