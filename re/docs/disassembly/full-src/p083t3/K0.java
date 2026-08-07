package p083t3;

import B3.o;
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
import p087u3.v;
import p102x3.R4;

/* JADX INFO: loaded from: classes2.dex */
public final class K0 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PrintOrderViewModel f13036o;
    public final /* synthetic */ List p;
    public final /* synthetic */ v q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ R4 f13037r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(PrintOrderViewModel printOrderViewModel, List list, v vVar, R4 r4, d dVar) {
        super(2, dVar);
        this.f13036o = printOrderViewModel;
        this.p = list;
        this.q = vVar;
        this.f13037r = r4;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new K0(this.f13036o, this.p, this.q, this.f13037r, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        K0 k3 = (K0) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        k3.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        Object next;
        a aVar = a.f448o;
        o4.d.y(obj);
        PrintOrderViewModel printOrderViewModel = this.f13036o;
        T t = printOrderViewModel.f10900k;
        List list = this.p;
        t.i(list);
        v vVar = this.q;
        String id = vVar.getId();
        if (id.length() == 0 && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                v vVar2 = (v) next;
                if (kotlin.jvm.internal.o.b(vVar2.getPincode(), vVar.getPincode()) && kotlin.jvm.internal.o.b(vVar2.getFlatHouse(), vVar.getFlatHouse()) && kotlin.jvm.internal.o.b(vVar2.getPhone(), vVar.getPhone())) {
                    break;
                }
            }
            v vVar3 = (v) next;
            if (vVar3 != null) {
                id = vVar3.getId();
            }
        }
        v vVar4 = this.q;
        printOrderViewModel.n(vVar4.copy((16382 & 1) != 0 ? vVar4.id : id, (16382 & 2) != 0 ? vVar4.firstName : null, (16382 & 4) != 0 ? vVar4.lastName : null, (16382 & 8) != 0 ? vVar4.fullName : null, (16382 & 16) != 0 ? vVar4.phone : null, (16382 & 32) != 0 ? vVar4.flatHouse : null, (16382 & 64) != 0 ? vVar4.areaStreet : null, (16382 & Fields.SpotShadowColor) != 0 ? vVar4.landmark : null, (16382 & Fields.RotationX) != 0 ? vVar4.city : null, (16382 & Fields.RotationY) != 0 ? vVar4.state : null, (16382 & Fields.RotationZ) != 0 ? vVar4.pincode : null, (16382 & Fields.CameraDistance) != 0 ? vVar4.addressType : null, (16382 & Fields.TransformOrigin) != 0 ? vVar4.isVerified : null, (16382 & Fields.Shape) != 0 ? vVar4.isDefault : null));
        this.f13037r.invoke(Boolean.TRUE, null);
        return o.f154a;
    }
}
