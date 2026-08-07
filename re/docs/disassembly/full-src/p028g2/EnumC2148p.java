package p028g2;

/* JADX INFO: renamed from: g2.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC2148p implements InterfaceC2133a {
    /* JADX INFO: Fake field, exist only in values array */
    ED256(-260),
    /* JADX INFO: Fake field, exist only in values array */
    ED512(-261),
    /* JADX INFO: Fake field, exist only in values array */
    ED25519(-8),
    /* JADX INFO: Fake field, exist only in values array */
    ES256(-7),
    /* JADX INFO: Fake field, exist only in values array */
    ECDH_HKDF_256(-25),
    /* JADX INFO: Fake field, exist only in values array */
    ES384(-35),
    /* JADX INFO: Fake field, exist only in values array */
    ES512(-36);


    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f11220o;

    EnumC2148p(int i5) {
        this.f11220o = i5;
    }

    @Override // p028g2.InterfaceC2133a
    public final int a() {
        return this.f11220o;
    }
}
