package p070q0;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f12300d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f12301f;
    public final int g;

    public a(int i5, int i6, String str, String str2, String str3, boolean z3) {
        this.f12297a = str;
        this.f12298b = str2;
        this.f12300d = z3;
        this.e = i5;
        int i7 = 5;
        if (str2 != null) {
            String upperCase = str2.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                i7 = 3;
            } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                i7 = 2;
            } else if (!upperCase.contains("BLOB")) {
                i7 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
            }
        }
        this.f12299c = i7;
        this.f12301f = str3;
        this.g = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.e != aVar.e || !this.f12297a.equals(aVar.f12297a) || this.f12300d != aVar.f12300d) {
            return false;
        }
        String str = this.f12301f;
        int i5 = this.g;
        int i6 = aVar.g;
        String str2 = aVar.f12301f;
        if (i5 == 1 && i6 == 2 && str != null && !str.equals(str2)) {
            return false;
        }
        if (i5 != 2 || i6 != 1 || str2 == null || str2.equals(str)) {
            return (i5 == 0 || i5 != i6 || (str == null ? str2 == null : str.equals(str2))) && this.f12299c == aVar.f12299c;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f12297a.hashCode() * 31) + this.f12299c) * 31) + (this.f12300d ? 1231 : 1237)) * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.f12297a);
        sb.append("', type='");
        sb.append(this.f12298b);
        sb.append("', affinity='");
        sb.append(this.f12299c);
        sb.append("', notNull=");
        sb.append(this.f12300d);
        sb.append(", primaryKeyPosition=");
        sb.append(this.e);
        sb.append(", defaultValue='");
        return p035i0.a.p(sb, this.f12301f, "'}");
    }
}
