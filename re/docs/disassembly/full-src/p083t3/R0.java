package p083t3;

import B3.k;
import B3.o;
import C3.w;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import a4.T;
import androidx.compose.ui.graphics.Fields;
import com.notescrafter.PrintOrderViewModel;
import java.util.ArrayList;
import p087u3.v;

/* JADX INFO: loaded from: classes2.dex */
public final class R0 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f13098o;
    public final /* synthetic */ PrintOrderViewModel p;
    public final /* synthetic */ J q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f13099r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ D f13100s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(k kVar, PrintOrderViewModel printOrderViewModel, J j5, String str, D d4, d dVar) {
        super(2, dVar);
        this.f13098o = kVar;
        this.p = printOrderViewModel;
        this.q = j5;
        this.f13099r = str;
        this.f13100s = d4;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        String str = this.f13099r;
        D d4 = this.f13100s;
        return new R0(this.f13098o, this.p, this.q, str, d4, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        R0 r1 = (R0) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        r1.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        Object obj2 = this.f13098o.f150o;
        if (!(obj2 instanceof B3.j)) {
            T t = this.p.f10900k;
            Iterable<v> iterable = (Iterable) t.getValue();
            ArrayList arrayList = new ArrayList(w.Y(iterable));
            for (v vVar : iterable) {
                arrayList.add(vVar.copy((16382 & 1) != 0 ? vVar.id : null, (16382 & 2) != 0 ? vVar.firstName : null, (16382 & 4) != 0 ? vVar.lastName : null, (16382 & 8) != 0 ? vVar.fullName : null, (16382 & 16) != 0 ? vVar.phone : null, (16382 & 32) != 0 ? vVar.flatHouse : null, (16382 & 64) != 0 ? vVar.areaStreet : null, (16382 & Fields.SpotShadowColor) != 0 ? vVar.landmark : null, (16382 & Fields.RotationX) != 0 ? vVar.city : null, (16382 & Fields.RotationY) != 0 ? vVar.state : null, (16382 & Fields.RotationZ) != 0 ? vVar.pincode : null, (16382 & Fields.CameraDistance) != 0 ? vVar.addressType : null, (16382 & Fields.TransformOrigin) != 0 ? vVar.isVerified : null, (16382 & Fields.Shape) != 0 ? vVar.isDefault : new Integer(kotlin.jvm.internal.o.b(vVar.getId(), this.f13099r) ? 1 : 0)));
            }
            t.getClass();
            t.j(null, arrayList);
            this.q.invoke();
        }
        Throwable thA = k.a(obj2);
        if (thA != null) {
            String message = thA.getMessage();
            if (message == null) {
                message = "Failed to set default address";
            }
            this.f13100s.invoke(message);
        }
        return o.f154a;
    }
}
