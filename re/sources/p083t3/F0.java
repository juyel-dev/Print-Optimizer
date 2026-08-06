package p083t3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import a4.T;
import com.notescrafter.PrintOrderViewModel;
import p102x3.C2435db;

/* JADX INFO: loaded from: classes2.dex */
public final class F0 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2435db f13020o;
    public final /* synthetic */ PrintOrderViewModel p;
    public final /* synthetic */ String q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f13021r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f13022s;
    public final /* synthetic */ long t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F0(C2435db c2435db, PrintOrderViewModel printOrderViewModel, String str, String str2, String str3, long j5, d dVar) {
        super(2, dVar);
        this.f13020o = c2435db;
        this.p = printOrderViewModel;
        this.q = str;
        this.f13021r = str2;
        this.f13022s = str3;
        this.t = j5;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new F0(this.f13020o, this.p, this.q, this.f13021r, this.f13022s, this.t, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        F0 f5 = (F0) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        f5.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        this.f13020o.invoke(new Integer(2));
        T t = this.p.f10892c0;
        String str = this.f13021r;
        kotlin.jvm.internal.o.c(str);
        String str2 = this.f13022s;
        kotlin.jvm.internal.o.c(str2);
        C2285f0 c2285f0 = new C2285f0(this.t, this.q, str, str2);
        t.getClass();
        t.j(null, c2285f0);
        return o.f154a;
    }
}
