package p104y0;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f15847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15848b;

    public d(boolean z3, Uri uri) {
        this.f15847a = uri;
        this.f15848b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f15848b == dVar.f15848b && this.f15847a.equals(dVar.f15847a);
    }

    public final int hashCode() {
        return (this.f15847a.hashCode() * 31) + (this.f15848b ? 1 : 0);
    }
}
