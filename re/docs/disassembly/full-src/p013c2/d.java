package p013c2;

import p090v1.M0;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2551c;

    public d() {
        this.f2549a = 0;
        this.f2550b = 0;
        this.f2551c = 0;
    }

    public static d a(M0 m5) {
        if (m5.f13424r) {
            return new d(3, 0, 0);
        }
        if (m5.f13427w) {
            return new d(2, 0, 0);
        }
        return m5.f13426v ? new d(0, 0, 0) : new d(1, m5.t, m5.q);
    }

    public boolean b() {
        return this.f2549a == 3;
    }

    public d(int i5, int i6, int i7) {
        this.f2549a = i5;
        this.f2551c = i6;
        this.f2550b = i7;
    }

    public /* synthetic */ d(int i5, int i6, int i7, boolean z3) {
        this.f2549a = i5;
        this.f2550b = i6;
        this.f2551c = i7;
    }
}
