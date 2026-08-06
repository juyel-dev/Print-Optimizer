package p083t3;

import B3.k;
import B3.o;
import C3.u;
import F3.d;
import G3.a;
import H3.j;
import M0.b;
import O3.e;
import X3.InterfaceC0200y;
import a4.T;
import com.google.android.gms.internal.measurement.C2117x;
import com.notescrafter.PrintOrderViewModel;
import g4.t;
import java.util.Iterator;
import java.util.List;
import p087u3.v;

/* JADX INFO: renamed from: t3.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2316v0 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f13220o;
    public final /* synthetic */ PrintOrderViewModel p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2316v0(k kVar, d dVar, PrintOrderViewModel printOrderViewModel) {
        super(2, dVar);
        this.f13220o = kVar;
        this.p = printOrderViewModel;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2316v0(this.f13220o, dVar, this.p);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        C2316v0 c2316v0 = (C2316v0) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        c2316v0.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        Object next;
        a aVar = a.f448o;
        o4.d.y(obj);
        Object obj2 = this.f13220o.f150o;
        boolean z3 = obj2 instanceof B3.j;
        o oVar = o.f154a;
        PrintOrderViewModel printOrderViewModel = this.p;
        if (!z3) {
            List list = (List) obj2;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Integer numIsDefault = ((v) next).isDefault();
                if (numIsDefault != null && numIsDefault.intValue() == 1) {
                    break;
                }
            }
            v vVar = (v) next;
            if (vVar == null) {
                vVar = (v) u.r0(list);
            }
            if ((vVar != null ? vVar.getPincode() : null) == null || W3.j.m0(vVar.getPincode())) {
                T t = printOrderViewModel.f10866E;
                Boolean bool = Boolean.TRUE;
                t.getClass();
                t.j(null, bool);
                Boolean bool2 = Boolean.FALSE;
                T t5 = printOrderViewModel.f10868G;
                t5.getClass();
                t5.j(null, bool2);
                return oVar;
            }
            String pincode = vVar.getPincode();
            printOrderViewModel.f10862A.i(pincode);
            printOrderViewModel.f10864C.i(vVar.getCity());
            C2277b0 c2277b0 = new C2277b0(printOrderViewModel, 8);
            C2117x c2117x = printOrderViewModel.f10891c;
            c2117x.getClass();
            kotlin.jvm.internal.o.f(pincode, "pincode");
            b bVarC = c2117x.c("https://notescrafter.com/api/print/check-edd?pincode=".concat(pincode));
            bVarC.g();
            ((t) c2117x.q).a(bVarC.d()).e(new A.e(c2277b0, 22));
        }
        if (k.a(obj2) != null) {
            T t6 = printOrderViewModel.f10866E;
            Boolean bool3 = Boolean.TRUE;
            t6.getClass();
            t6.j(null, bool3);
            Boolean bool4 = Boolean.FALSE;
            T t7 = printOrderViewModel.f10868G;
            t7.getClass();
            t7.j(null, bool4);
        }
        return oVar;
    }
}
