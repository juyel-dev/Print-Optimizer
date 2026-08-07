package p092v3;

import B3.k;
import G3.a;
import H3.c;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public h f13517o;
    public /* synthetic */ Object p;
    public final /* synthetic */ h q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13518r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, c cVar) {
        super(cVar);
        this.q = hVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.p = obj;
        this.f13518r |= Integer.MIN_VALUE;
        Object objB = this.q.b(null, this);
        return objB == a.f448o ? objB : new k(objB);
    }
}
