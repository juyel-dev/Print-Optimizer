package p081t1;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12379b;

    public a(String str, boolean z3) {
        this.f12378a = str;
        this.f12379b = z3;
    }

    public final String toString() {
        String str = this.f12378a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
        sb.append("{");
        sb.append(str);
        sb.append("}");
        sb.append(this.f12379b);
        return sb.toString();
    }
}
