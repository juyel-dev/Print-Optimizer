package p083t3;

import B3.o;
import C3.u;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import a4.T;
import androidx.compose.ui.graphics.Fields;
import com.notescrafter.PrintOrderViewModel;
import java.util.Iterator;
import java.util.List;
import p087u3.q;
import p087u3.v;

/* JADX INFO: renamed from: t3.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2303o0 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PrintOrderViewModel f13202o;
    public final /* synthetic */ List p;
    public final /* synthetic */ boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f13203r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2303o0(PrintOrderViewModel printOrderViewModel, List list, boolean z3, String str, d dVar) {
        super(2, dVar);
        this.f13202o = printOrderViewModel;
        this.p = list;
        this.q = z3;
        this.f13203r = str;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2303o0(this.f13202o, this.p, this.q, this.f13203r, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        C2303o0 c2303o0 = (C2303o0) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        c2303o0.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        Object next;
        a aVar = a.f448o;
        o4.d.y(obj);
        PrintOrderViewModel printOrderViewModel = this.f13202o;
        T t = printOrderViewModel.f10900k;
        List list = this.p;
        t.i(list);
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
        T t5 = printOrderViewModel.f10898i;
        if (vVar != null && W3.j.m0(((q) t5.getValue()).getFirstName())) {
            printOrderViewModel.n(vVar);
        } else if (W3.j.m0(((q) t5.getValue()).getPhone()) && this.q) {
            String str = this.f13203r;
            if (!W3.j.m0(str)) {
                q qVar = (q) t5.getValue();
                t5.i(qVar.copy((12287 & 1) != 0 ? qVar.firstName : null, (12287 & 2) != 0 ? qVar.lastName : null, (12287 & 4) != 0 ? qVar.fullName : null, (12287 & 8) != 0 ? qVar.flatHouse : null, (12287 & 16) != 0 ? qVar.areaStreet : null, (12287 & 32) != 0 ? qVar.landmark : null, (12287 & 64) != 0 ? qVar.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar.city : null, (12287 & Fields.RotationX) != 0 ? qVar.state : null, (12287 & Fields.RotationY) != 0 ? qVar.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar.phone : str, (12287 & Fields.TransformOrigin) != 0 ? qVar.isPhoneVerified : true, (12287 & Fields.Shape) != 0 ? qVar.shippingAddressId : null));
            }
        }
        return o.f154a;
    }
}
