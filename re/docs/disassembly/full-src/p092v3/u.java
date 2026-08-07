package p092v3;

import g4.p;
import o4.d;
import p013c2.g;
import t4.InterfaceC2332h;
import t4.y;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f13581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f13582d;

    public u(v vVar, s sVar) {
        this.f13581c = vVar;
        this.f13582d = sVar;
    }

    @Override // p013c2.g
    public final void B(InterfaceC2332h interfaceC2332h) throws Throwable {
        y yVarB = d.b(new t(this, interfaceC2332h));
        this.f13581c.B(yVarB);
        yVarB.flush();
    }

    @Override // p013c2.g
    public final long f() {
        return this.f13581c.f13585f;
    }

    @Override // p013c2.g
    public final p g() {
        return this.f13581c.f13584d;
    }
}
