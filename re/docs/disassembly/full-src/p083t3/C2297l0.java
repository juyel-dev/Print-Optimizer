package p083t3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import com.notescrafter.PrintOrderViewModel;
import java.io.File;
import p087u3.m;

/* JADX INFO: renamed from: t3.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2297l0 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PrintOrderViewModel f13195o;
    public final /* synthetic */ m p;
    public final /* synthetic */ File q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2297l0(PrintOrderViewModel printOrderViewModel, m mVar, File file, d dVar) {
        super(2, dVar);
        this.f13195o = printOrderViewModel;
        this.p = mVar;
        this.q = file;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2297l0(this.f13195o, this.p, this.q, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        C2297l0 c2297l0 = (C2297l0) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        c2297l0.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        this.f13195o.r(this.p.getId(), new C2279c0(this.q, 2));
        return o.f154a;
    }
}
