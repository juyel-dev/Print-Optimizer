package p028g2;

/* JADX INFO: loaded from: classes2.dex */
public enum C implements InterfaceC2133a {
    /* JADX INFO: Fake field, exist only in values array */
    RS256(-257),
    /* JADX INFO: Fake field, exist only in values array */
    RS384(-258),
    /* JADX INFO: Fake field, exist only in values array */
    RS512(-259),
    /* JADX INFO: Fake field, exist only in values array */
    LEGACY_RS1(-262),
    /* JADX INFO: Fake field, exist only in values array */
    PS256(-37),
    /* JADX INFO: Fake field, exist only in values array */
    PS384(-38),
    /* JADX INFO: Fake field, exist only in values array */
    PS512(-39),
    RS1(-65535);


    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f11175o;

    C(int i5) {
        this.f11175o = i5;
    }

    @Override // p028g2.InterfaceC2133a
    public final int a() {
        return this.f11175o;
    }
}
