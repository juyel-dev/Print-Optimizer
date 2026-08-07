package p104y0;

import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f15849a = new HashSet();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        return this.f15849a.equals(((e) obj).f15849a);
    }

    public final int hashCode() {
        return this.f15849a.hashCode();
    }
}
