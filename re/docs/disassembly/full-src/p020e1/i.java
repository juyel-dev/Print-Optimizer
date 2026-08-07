package p020e1;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f11071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f11072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11073d;
    public final long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f11074f;

    public i(String str, Integer num, l lVar, long j5, long j6, HashMap map) {
        this.f11070a = str;
        this.f11071b = num;
        this.f11072c = lVar;
        this.f11073d = j5;
        this.e = j6;
        this.f11074f = map;
    }

    public final String a(String str) {
        String str2 = (String) this.f11074f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f11074f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final h c() {
        h hVar = new h();
        String str = this.f11070a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        hVar.f11066b = str;
        hVar.f11067c = this.f11071b;
        l lVar = this.f11072c;
        if (lVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        hVar.f11068d = lVar;
        hVar.e = Long.valueOf(this.f11073d);
        hVar.f11069f = Long.valueOf(this.e);
        hVar.g = new HashMap(this.f11074f);
        return hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f11070a.equals(iVar.f11070a)) {
            Integer num = iVar.f11071b;
            Integer num2 = this.f11071b;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f11072c.equals(iVar.f11072c) && this.f11073d == iVar.f11073d && this.e == iVar.e && this.f11074f.equals(iVar.f11074f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f11070a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f11071b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f11072c.hashCode()) * 1000003;
        long j5 = this.f11073d;
        int i5 = (iHashCode2 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        long j6 = this.e;
        return ((i5 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ this.f11074f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f11070a + ", code=" + this.f11071b + ", encodedPayload=" + this.f11072c + ", eventMillis=" + this.f11073d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f11074f + "}";
    }
}
