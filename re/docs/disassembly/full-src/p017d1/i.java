package p017d1;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f11003a;

    public i(ArrayList arrayList) {
        this.f11003a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        return this.f11003a.equals(((i) ((o) obj)).f11003a);
    }

    public final int hashCode() {
        return this.f11003a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f11003a + "}";
    }
}
