package p070q0;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements Comparable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f12306o;
    public final int p;
    public final String q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f12307r;

    public c(String str, String str2, int i5, int i6) {
        this.f12306o = i5;
        this.p = i6;
        this.q = str;
        this.f12307r = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c cVar = (c) obj;
        int i5 = this.f12306o - cVar.f12306o;
        return i5 == 0 ? this.p - cVar.p : i5;
    }
}
