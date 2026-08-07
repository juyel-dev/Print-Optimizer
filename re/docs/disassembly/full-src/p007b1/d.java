package p007b1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f2408o;
    public static final d p;
    public static final d q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ d[] f2409r;

    static {
        d dVar = new d("DEFAULT", 0);
        f2408o = dVar;
        d dVar2 = new d("VERY_LOW", 1);
        p = dVar2;
        d dVar3 = new d("HIGHEST", 2);
        q = dVar3;
        f2409r = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f2409r.clone();
    }
}
