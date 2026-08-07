package p064o2;

/* JADX INFO: renamed from: o2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2199b extends AbstractC2201d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2199b f12127o = new C2199b();

    @Override // p064o2.AbstractC2201d
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // p064o2.AbstractC2201d
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
