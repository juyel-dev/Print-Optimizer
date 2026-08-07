package p007b1;

import p035i0.a;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2407a;

    public c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f2407a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f2407a.equals(((c) obj).f2407a);
    }

    public final int hashCode() {
        return this.f2407a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a.p(new StringBuilder("Encoding{name=\""), this.f2407a, "\"}");
    }
}
