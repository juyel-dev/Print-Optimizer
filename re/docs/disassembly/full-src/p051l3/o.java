package p051l3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class o {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final k f11857o;
    public static final /* synthetic */ o[] p;

    static {
        k kVar = new k();
        f11857o = kVar;
        p = new o[]{kVar, new o() { // from class: l3.l
        }, new o() { // from class: l3.m
        }, new o() { // from class: l3.n
        }};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) p.clone();
    }
}
