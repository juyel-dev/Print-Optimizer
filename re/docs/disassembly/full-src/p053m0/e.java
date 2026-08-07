package p053m0;

import F3.d;
import H3.c;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public f f11879o;
    public /* synthetic */ Object p;
    public final /* synthetic */ f q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11880r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, d dVar) {
        super(dVar);
        this.q = fVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.f11880r |= Integer.MIN_VALUE;
        return f.c(this.q, null, this);
    }
}
