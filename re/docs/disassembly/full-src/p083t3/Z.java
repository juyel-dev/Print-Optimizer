package p083t3;

import java.util.List;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f13141c;

    public Z(String str, List list, boolean z3) {
        this.f13139a = list;
        this.f13140b = str;
        this.f13141c = z3;
    }

    public final List a() {
        return this.f13139a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z3 = (Z) obj;
        return o.b(this.f13139a, z3.f13139a) && o.b(this.f13140b, z3.f13140b) && this.f13141c == z3.f13141c;
    }

    public final int hashCode() {
        int iHashCode = this.f13139a.hashCode() * 31;
        String str = this.f13140b;
        return Boolean.hashCode(this.f13141c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "NamePreviewResult(lines=" + this.f13139a + ", error=" + this.f13140b + ", tooManyWords=" + this.f13141c + ")";
    }
}
