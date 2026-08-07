package p083t3;

import B3.h;
import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import a4.T;
import androidx.compose.ui.graphics.Fields;
import com.notescrafter.PrintOrderViewModel;
import p087u3.q;

/* JADX INFO: loaded from: classes2.dex */
public final class A0 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PrintOrderViewModel f13009o;
    public final /* synthetic */ h p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(PrintOrderViewModel printOrderViewModel, h hVar, d dVar) {
        super(2, dVar);
        this.f13009o = printOrderViewModel;
        this.p = hVar;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new A0(this.f13009o, this.p, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        A0 a5 = (A0) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        a5.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        PrintOrderViewModel printOrderViewModel = this.f13009o;
        T t = printOrderViewModel.f10898i;
        q qVar = (q) t.getValue();
        h hVar = this.p;
        t.i(qVar.copy((12287 & 1) != 0 ? qVar.firstName : null, (12287 & 2) != 0 ? qVar.lastName : null, (12287 & 4) != 0 ? qVar.fullName : null, (12287 & 8) != 0 ? qVar.flatHouse : null, (12287 & 16) != 0 ? qVar.areaStreet : null, (12287 & 32) != 0 ? qVar.landmark : null, (12287 & 64) != 0 ? qVar.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar.city : (String) hVar.f148o, (12287 & Fields.RotationX) != 0 ? qVar.state : (String) hVar.p, (12287 & Fields.RotationY) != 0 ? qVar.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar.shippingAddressId : null));
        printOrderViewModel.e();
        return o.f154a;
    }
}
