package p045k1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final e f11621o;
    public static final e p;
    public static final e q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ e[] f11622r;

    static {
        e eVar = new e("NETWORK_UNMETERED", 0);
        f11621o = eVar;
        e eVar2 = new e("DEVICE_IDLE", 1);
        p = eVar2;
        e eVar3 = new e("DEVICE_CHARGING", 2);
        q = eVar3;
        f11622r = new e[]{eVar, eVar2, eVar3};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f11622r.clone();
    }
}
