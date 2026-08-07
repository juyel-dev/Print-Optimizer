package p015d;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import com.google.android.gms.internal.ads.N5;

/* JADX INFO: loaded from: classes.dex */
public final class p extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ o f10959o;
    public final /* synthetic */ boolean p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(o oVar, boolean z3, d dVar) {
        super(2, dVar);
        this.f10959o = oVar;
        this.p = z3;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new p(this.f10959o, this.p, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        p pVar = (p) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        pVar.invokeSuspend(oVar);
        return oVar;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [O3.a, kotlin.jvm.internal.l] */
    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        N5 n5;
        a aVar = a.f448o;
        o4.d.y(obj);
        o oVar = this.f10959o;
        boolean z3 = this.p;
        if (!z3 && oVar.f2524a && (n5 = oVar.f10958f) != null) {
            n5.a();
        }
        oVar.f2524a = z3;
        ?? r4 = oVar.f2526c;
        if (r4 != 0) {
            r4.invoke();
        }
        return o.f154a;
    }
}
