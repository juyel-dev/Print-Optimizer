package p017d1;

import p035i0.a;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f10993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10996d;
    public final String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f10997f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f10998h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f10999i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f11000j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f11001k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f11002l;

    public h(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f10993a = num;
        this.f10994b = str;
        this.f10995c = str2;
        this.f10996d = str3;
        this.e = str4;
        this.f10997f = str5;
        this.g = str6;
        this.f10998h = str7;
        this.f10999i = str8;
        this.f11000j = str9;
        this.f11001k = str10;
        this.f11002l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        Integer num = this.f10993a;
        if (num != null ? num.equals(((h) aVar).f10993a) : ((h) aVar).f10993a == null) {
            String str = this.f10994b;
            if (str != null ? str.equals(((h) aVar).f10994b) : ((h) aVar).f10994b == null) {
                String str2 = this.f10995c;
                if (str2 != null ? str2.equals(((h) aVar).f10995c) : ((h) aVar).f10995c == null) {
                    String str3 = this.f10996d;
                    if (str3 != null ? str3.equals(((h) aVar).f10996d) : ((h) aVar).f10996d == null) {
                        String str4 = this.e;
                        if (str4 != null ? str4.equals(((h) aVar).e) : ((h) aVar).e == null) {
                            String str5 = this.f10997f;
                            if (str5 != null ? str5.equals(((h) aVar).f10997f) : ((h) aVar).f10997f == null) {
                                String str6 = this.g;
                                if (str6 != null ? str6.equals(((h) aVar).g) : ((h) aVar).g == null) {
                                    String str7 = this.f10998h;
                                    if (str7 != null ? str7.equals(((h) aVar).f10998h) : ((h) aVar).f10998h == null) {
                                        String str8 = this.f10999i;
                                        if (str8 != null ? str8.equals(((h) aVar).f10999i) : ((h) aVar).f10999i == null) {
                                            String str9 = this.f11000j;
                                            if (str9 != null ? str9.equals(((h) aVar).f11000j) : ((h) aVar).f11000j == null) {
                                                String str10 = this.f11001k;
                                                if (str10 != null ? str10.equals(((h) aVar).f11001k) : ((h) aVar).f11001k == null) {
                                                    String str11 = this.f11002l;
                                                    if (str11 == null) {
                                                        if (((h) aVar).f11002l == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(((h) aVar).f11002l)) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
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
        Integer num = this.f10993a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f10994b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f10995c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f10996d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f10997f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f10998h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f10999i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f11000j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f11001k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f11002l;
        return (str11 != null ? str11.hashCode() : 0) ^ iHashCode11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f10993a);
        sb.append(", model=");
        sb.append(this.f10994b);
        sb.append(", hardware=");
        sb.append(this.f10995c);
        sb.append(", device=");
        sb.append(this.f10996d);
        sb.append(", product=");
        sb.append(this.e);
        sb.append(", osBuild=");
        sb.append(this.f10997f);
        sb.append(", manufacturer=");
        sb.append(this.g);
        sb.append(", fingerprint=");
        sb.append(this.f10998h);
        sb.append(", locale=");
        sb.append(this.f10999i);
        sb.append(", country=");
        sb.append(this.f11000j);
        sb.append(", mccMnc=");
        sb.append(this.f11001k);
        sb.append(", applicationBuild=");
        return a.p(sb, this.f11002l, "}");
    }
}
