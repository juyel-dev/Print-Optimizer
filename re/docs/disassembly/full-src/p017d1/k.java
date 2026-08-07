package p017d1;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f11006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f11008d;
    public final String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f11009f;
    public final n g;

    public k(long j5, Integer num, long j6, byte[] bArr, String str, long j7, n nVar) {
        this.f11005a = j5;
        this.f11006b = num;
        this.f11007c = j6;
        this.f11008d = bArr;
        this.e = str;
        this.f11009f = j7;
        this.g = nVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        k kVar = (k) rVar;
        if (this.f11005a == kVar.f11005a && ((num = this.f11006b) != null ? num.equals(kVar.f11006b) : kVar.f11006b == null)) {
            if (this.f11007c == kVar.f11007c) {
                if (Arrays.equals(this.f11008d, rVar instanceof k ? ((k) rVar).f11008d : kVar.f11008d)) {
                    String str = kVar.e;
                    String str2 = this.e;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        if (this.f11009f == kVar.f11009f) {
                            n nVar = kVar.g;
                            n nVar2 = this.g;
                            if (nVar2 == null) {
                                if (nVar == null) {
                                    return true;
                                }
                            } else if (nVar2.equals(nVar)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.f11005a;
        int i5 = (((int) (j5 ^ (j5 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f11006b;
        int iHashCode = (i5 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j6 = this.f11007c;
        int iHashCode2 = (((iHashCode ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f11008d)) * 1000003;
        String str = this.e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j7 = this.f11009f;
        int i6 = (iHashCode3 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        n nVar = this.g;
        return i6 ^ (nVar != null ? nVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f11005a + ", eventCode=" + this.f11006b + ", eventUptimeMs=" + this.f11007c + ", sourceExtension=" + Arrays.toString(this.f11008d) + ", sourceExtensionJsonProto3=" + this.e + ", timezoneOffsetSeconds=" + this.f11009f + ", networkConnectionInfo=" + this.g + "}";
    }
}
