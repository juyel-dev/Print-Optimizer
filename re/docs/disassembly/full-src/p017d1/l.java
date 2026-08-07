package p017d1;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f11012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f11013d;
    public final String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f11014f;

    public l(long j5, long j6, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f11021o;
        this.f11010a = j5;
        this.f11011b = j6;
        this.f11012c = jVar;
        this.f11013d = num;
        this.e = str;
        this.f11014f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        l lVar = (l) ((s) obj);
        if (this.f11010a == lVar.f11010a) {
            if (this.f11011b == lVar.f11011b) {
                if (this.f11012c.equals(lVar.f11012c)) {
                    Integer num = lVar.f11013d;
                    Integer num2 = this.f11013d;
                    if (num2 != null ? num2.equals(num) : num == null) {
                        String str = lVar.e;
                        String str2 = this.e;
                        if (str2 != null ? str2.equals(str) : str == null) {
                            if (this.f11014f.equals(lVar.f11014f)) {
                                Object obj2 = w.f11021o;
                                if (obj2.equals(obj2)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.f11010a;
        long j6 = this.f11011b;
        int iHashCode = (((((((int) (j5 ^ (j5 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j6 >>> 32) ^ j6))) * 1000003) ^ this.f11012c.hashCode()) * 1000003;
        Integer num = this.f11013d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        return ((((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f11014f.hashCode()) * 1000003) ^ w.f11021o.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f11010a + ", requestUptimeMs=" + this.f11011b + ", clientInfo=" + this.f11012c + ", logSource=" + this.f11013d + ", logSourceName=" + this.e + ", logEvents=" + this.f11014f + ", qosTier=" + w.f11021o + "}";
    }
}
