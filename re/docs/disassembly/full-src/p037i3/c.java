package p037i3;

/* JADX INFO: loaded from: classes2.dex */
public enum c implements W2.c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_OS(0),
    ANDROID(1),
    /* JADX INFO: Fake field, exist only in values array */
    IOS(2),
    /* JADX INFO: Fake field, exist only in values array */
    WEB(3);


    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f11544o;

    c(int i5) {
        this.f11544o = i5;
    }

    @Override // W2.c
    public final int a() {
        return this.f11544o;
    }
}
