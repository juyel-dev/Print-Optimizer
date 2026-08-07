package p015d;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import a4.C0203b;
import a4.C0214m;
import com.google.android.gms.internal.ads.N5;
import kotlin.jvm.internal.A;

/* JADX INFO: loaded from: classes.dex */
public final class n extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public A f10954o;
    public int p;
    public final /* synthetic */ o q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f10955r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ N5 f10956s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, e eVar, N5 n5, d dVar) {
        super(2, dVar);
        this.q = oVar;
        this.f10955r = eVar;
        this.f10956s = n5;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new n(this.q, this.f10955r, this.f10956s, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        A a5;
        a aVar = a.f448o;
        int i5 = this.p;
        boolean z3 = true;
        if (i5 == 0) {
            o4.d.y(obj);
            if (this.q.f2524a) {
                A a6 = new A();
                C0214m c0214m = new C0214m(new C0203b((Z3.e) this.f10956s.p, z3), new m(a6, null));
                this.f10954o = a6;
                this.p = 1;
                if (this.f10955r.invoke(c0214m, this) == aVar) {
                    return aVar;
                }
                a5 = a6;
            }
            return o.f154a;
        }
        if (i5 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a5 = this.f10954o;
        o4.d.y(obj);
        if (!a5.f11690o) {
            throw new IllegalStateException("You must collect the progress flow");
        }
        return o.f154a;
    }
}
