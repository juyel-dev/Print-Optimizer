package p018d3;

import W.P;
import W1.a;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11030c;

    public b(String str, long j5, int i5) {
        this.f11028a = str;
        this.f11029b = j5;
        this.f11030c = i5;
    }

    public static a a() {
        a aVar = new a();
        aVar.f1698d = 0L;
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.f11028a;
        if (str != null ? str.equals(bVar.f11028a) : bVar.f11028a == null) {
            if (this.f11029b == bVar.f11029b) {
                int i5 = bVar.f11030c;
                int i6 = this.f11030c;
                if (i6 == 0) {
                    if (i5 == 0) {
                        return true;
                    }
                } else if (P.a(i6, i5)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f11028a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j5 = this.f11029b;
        int i5 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        int i6 = this.f11030c;
        return (i6 != 0 ? P.b(i6) : 0) ^ i5;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.f11028a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f11029b);
        sb.append(", responseCode=");
        int i5 = this.f11030c;
        if (i5 == 1) {
            str = "OK";
        } else if (i5 != 2) {
            str = i5 != 3 ? "null" : "AUTH_ERROR";
        } else {
            str = "BAD_CONFIG";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
