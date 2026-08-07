package p018d3;

import W.P;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f11027d;
    public final int e;

    public a(String str, String str2, String str3, b bVar, int i5) {
        this.f11024a = str;
        this.f11025b = str2;
        this.f11026c = str3;
        this.f11027d = bVar;
        this.e = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f11024a;
        if (str != null ? str.equals(aVar.f11024a) : aVar.f11024a == null) {
            String str2 = this.f11025b;
            if (str2 != null ? str2.equals(aVar.f11025b) : aVar.f11025b == null) {
                String str3 = this.f11026c;
                if (str3 != null ? str3.equals(aVar.f11026c) : aVar.f11026c == null) {
                    b bVar = this.f11027d;
                    if (bVar != null ? bVar.equals(aVar.f11027d) : aVar.f11027d == null) {
                        int i5 = this.e;
                        if (i5 == 0) {
                            if (aVar.e == 0) {
                                return true;
                            }
                        } else if (P.a(i5, aVar.e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f11024a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f11025b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f11026c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        b bVar = this.f11027d;
        int iHashCode4 = (iHashCode3 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        int i5 = this.e;
        return (i5 != 0 ? P.b(i5) : 0) ^ iHashCode4;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.f11024a);
        sb.append(", fid=");
        sb.append(this.f11025b);
        sb.append(", refreshToken=");
        sb.append(this.f11026c);
        sb.append(", authToken=");
        sb.append(this.f11027d);
        sb.append(", responseCode=");
        int i5 = this.e;
        if (i5 != 1) {
            str = i5 != 2 ? "null" : "BAD_CONFIG";
        } else {
            str = "OK";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
