package p092v3;

import kotlin.jvm.internal.o;
import t4.C2331g;
import t4.InterfaceC2332h;
import t4.m;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends m {
    public long p;
    public final /* synthetic */ u q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, InterfaceC2332h interfaceC2332h) {
        super(interfaceC2332h);
        this.q = uVar;
    }

    @Override // t4.m, t4.D
    public final void d(C2331g source, long j5) {
        o.f(source, "source");
        super.d(source, j5);
        long j6 = this.p + j5;
        this.p = j6;
        this.q.f13582d.invoke(Long.valueOf(j6));
    }
}
