package p092v3;

import B3.k;
import G3.a;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends H3.c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f13513o;
    public final /* synthetic */ h p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar, H3.c cVar) {
        super(cVar);
        this.p = hVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f13513o = obj;
        this.q |= Integer.MIN_VALUE;
        Object objA = this.p.a(null, this);
        return objA == a.f448o ? objA : new k(objA);
    }
}
