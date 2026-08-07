package p014c3;

import W.P;
import p035i0.a;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2576d;
    public final long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f2577f;
    public final String g;

    public b(String str, int i5, String str2, String str3, long j5, long j6, String str4) {
        this.f2573a = str;
        this.f2574b = i5;
        this.f2575c = str2;
        this.f2576d = str3;
        this.e = j5;
        this.f2577f = j6;
        this.g = str4;
    }

    public final a a() {
        a aVar = new a();
        aVar.f2568a = this.f2573a;
        aVar.f2569b = this.f2574b;
        aVar.f2570c = this.f2575c;
        aVar.f2571d = this.f2576d;
        aVar.f2572f = Long.valueOf(this.e);
        aVar.g = Long.valueOf(this.f2577f);
        aVar.e = this.g;
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
        String str = this.f2573a;
        if (str != null ? str.equals(bVar.f2573a) : bVar.f2573a == null) {
            if (P.a(this.f2574b, bVar.f2574b)) {
                String str2 = bVar.f2575c;
                String str3 = this.f2575c;
                if (str3 != null ? str3.equals(str2) : str2 == null) {
                    String str4 = bVar.f2576d;
                    String str5 = this.f2576d;
                    if (str5 != null ? str5.equals(str4) : str4 == null) {
                        if (this.e == bVar.e && this.f2577f == bVar.f2577f) {
                            String str6 = bVar.g;
                            String str7 = this.g;
                            if (str7 == null) {
                                if (str6 == null) {
                                    return true;
                                }
                            } else if (str7.equals(str6)) {
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
        String str = this.f2573a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ P.b(this.f2574b)) * 1000003;
        String str2 = this.f2575c;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f2576d;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j5 = this.e;
        int i5 = (iHashCode3 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        long j6 = this.f2577f;
        int i6 = (i5 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        String str4 = this.g;
        return (str4 != null ? str4.hashCode() : 0) ^ i6;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.f2573a);
        sb.append(", registrationStatus=");
        int i5 = this.f2574b;
        if (i5 == 1) {
            str = "ATTEMPT_MIGRATION";
        } else if (i5 == 2) {
            str = "NOT_GENERATED";
        } else if (i5 == 3) {
            str = "UNREGISTERED";
        } else if (i5 != 4) {
            str = i5 != 5 ? "null" : "REGISTER_ERROR";
        } else {
            str = "REGISTERED";
        }
        sb.append(str);
        sb.append(", authToken=");
        sb.append(this.f2575c);
        sb.append(", refreshToken=");
        sb.append(this.f2576d);
        sb.append(", expiresInSecs=");
        sb.append(this.e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f2577f);
        sb.append(", fisError=");
        return a.p(sb, this.g, "}");
    }
}
