package p102x3;

import android.graphics.Bitmap;
import kotlin.jvm.internal.o;
import p035i0.a;

/* JADX INFO: loaded from: classes2.dex */
public final class D6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f13862d;
    public final Bitmap e;

    public D6(String str, int i5, int i6, boolean z3, Bitmap bitmap) {
        this.f13859a = str;
        this.f13860b = i5;
        this.f13861c = i6;
        this.f13862d = z3;
        this.e = bitmap;
    }

    public static D6 a(D6 d6, String str, int i5, boolean z3, int i6) {
        if ((i6 & 1) != 0) {
            str = d6.f13859a;
        }
        String id = str;
        if ((i6 & 4) != 0) {
            i5 = d6.f13861c;
        }
        int i7 = i5;
        if ((i6 & 8) != 0) {
            z3 = d6.f13862d;
        }
        Bitmap bitmap = d6.e;
        o.f(id, "id");
        return new D6(id, d6.f13860b, i7, z3, bitmap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D6)) {
            return false;
        }
        D6 d6 = (D6) obj;
        return o.b(this.f13859a, d6.f13859a) && this.f13860b == d6.f13860b && this.f13861c == d6.f13861c && this.f13862d == d6.f13862d && o.b(this.e, d6.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + a.d(a.c(this.f13861c, a.c(this.f13860b, this.f13859a.hashCode() * 31, 31), 31), 31, this.f13862d);
    }

    public final String toString() {
        return "OrganizePageItem(id=" + this.f13859a + ", originalIndex=" + this.f13860b + ", rotation=" + this.f13861c + ", isSelected=" + this.f13862d + ", thumbnail=" + this.e + ")";
    }
}
