package p083t3;

import B3.o;
import C3.w;
import F3.d;
import G3.a;
import H3.j;
import O3.c;
import O3.e;
import X3.InterfaceC0200y;
import a4.T;
import com.notescrafter.PrintOrderViewModel;
import java.util.ArrayList;
import p087u3.m;

/* JADX INFO: loaded from: classes2.dex */
public final class W0 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PrintOrderViewModel f13119o;
    public final /* synthetic */ String p;
    public final /* synthetic */ c q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W0(PrintOrderViewModel printOrderViewModel, String str, c cVar, d dVar) {
        super(2, dVar);
        this.f13119o = printOrderViewModel;
        this.p = str;
        this.q = cVar;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new W0(this.f13119o, this.p, this.q, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        W0 w4 = (W0) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        w4.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        PrintOrderViewModel printOrderViewModel = this.f13119o;
        T t = printOrderViewModel.g;
        Iterable<m> iterable = (Iterable) t.getValue();
        ArrayList arrayList = new ArrayList(w.Y(iterable));
        for (m mVar : iterable) {
            if (kotlin.jvm.internal.o.b(mVar.getId(), this.p)) {
                mVar = (m) this.q.invoke(mVar);
            }
            arrayList.add(mVar);
        }
        t.getClass();
        t.j(null, arrayList);
        printOrderViewModel.q();
        printOrderViewModel.e();
        return o.f154a;
    }
}
