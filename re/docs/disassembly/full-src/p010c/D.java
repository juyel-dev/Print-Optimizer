package p010c;

import C3.q;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes.dex */
public final class D implements InterfaceC0690c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final v f2474o;
    public final /* synthetic */ F p;

    public D(F f5, v onBackPressedCallback) {
        o.f(onBackPressedCallback, "onBackPressedCallback");
        this.p = f5;
        this.f2474o = onBackPressedCallback;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [O3.a, kotlin.jvm.internal.l] */
    @Override // p010c.InterfaceC0690c
    public final void cancel() {
        F f5 = this.p;
        q qVar = f5.f2477b;
        v vVar = this.f2474o;
        qVar.remove(vVar);
        if (o.b(f5.f2478c, vVar)) {
            vVar.a();
            f5.f2478c = null;
        }
        vVar.f2525b.remove(this);
        ?? r1 = vVar.f2526c;
        if (r1 != 0) {
            r1.invoke();
        }
        vVar.f2526c = null;
    }
}
