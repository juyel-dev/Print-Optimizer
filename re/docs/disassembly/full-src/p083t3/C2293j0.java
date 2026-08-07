package p083t3;

import B3.k;
import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import a4.T;
import com.notescrafter.PrintOrderViewModel;
import java.util.ArrayList;
import p087u3.v;

/* JADX INFO: renamed from: t3.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2293j0 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f13184o;
    public final /* synthetic */ PrintOrderViewModel p;
    public final /* synthetic */ J q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f13185r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ D f13186s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2293j0(k kVar, PrintOrderViewModel printOrderViewModel, J j5, String str, D d4, d dVar) {
        super(2, dVar);
        this.f13184o = kVar;
        this.p = printOrderViewModel;
        this.q = j5;
        this.f13185r = str;
        this.f13186s = d4;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        String str = this.f13185r;
        D d4 = this.f13186s;
        return new C2293j0(this.f13184o, this.p, this.q, str, d4, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        C2293j0 c2293j0 = (C2293j0) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        c2293j0.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        Object obj2 = this.f13184o.f150o;
        if (!(obj2 instanceof B3.j)) {
            T t = this.p.f10900k;
            Iterable iterable = (Iterable) t.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : iterable) {
                if (!kotlin.jvm.internal.o.b(((v) obj3).getId(), this.f13185r)) {
                    arrayList.add(obj3);
                }
            }
            t.getClass();
            t.j(null, arrayList);
            this.q.invoke();
        }
        Throwable thA = k.a(obj2);
        if (thA != null) {
            String message = thA.getMessage();
            if (message == null) {
                message = "Failed to delete address";
            }
            this.f13186s.invoke(message);
        }
        return o.f154a;
    }
}
