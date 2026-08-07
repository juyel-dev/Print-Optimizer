package p015d;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.f;
import kotlin.jvm.internal.A;

/* JADX INFO: loaded from: classes.dex */
public final class m extends j implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ A f10953o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(A a5, d dVar) {
        super(3, dVar);
        this.f10953o = a5;
    }

    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        m mVar = new m(this.f10953o, (d) obj3);
        o oVar = o.f154a;
        mVar.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        this.f10953o.f11690o = true;
        return o.f154a;
    }
}
