package p083t3;

import B3.k;
import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import a4.T;
import android.content.SharedPreferences;
import androidx.compose.ui.graphics.Fields;
import com.notescrafter.PrintOrderViewModel;
import p087u3.q;

/* JADX INFO: loaded from: classes2.dex */
public final class c1 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PrintOrderViewModel f13156o;
    public final /* synthetic */ k p;
    public final /* synthetic */ String q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(k kVar, d dVar, PrintOrderViewModel printOrderViewModel, String str) {
        super(2, dVar);
        this.f13156o = printOrderViewModel;
        this.p = kVar;
        this.q = str;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new c1(this.p, dVar, this.f13156o, this.q);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        c1 c1Var = (c1) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        c1Var.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        PrintOrderViewModel printOrderViewModel = this.f13156o;
        T t = printOrderViewModel.f10906s;
        Boolean bool = Boolean.FALSE;
        t.getClass();
        t.j(null, bool);
        Object obj2 = this.p.f150o;
        if (!(obj2 instanceof B3.j)) {
            SharedPreferences.Editor editorEdit = printOrderViewModel.f10889b.getSharedPreferences("auth_prefs", 0).edit();
            editorEdit.putString("user_phone", this.q);
            editorEdit.putBoolean("user_phone_verified", true);
            editorEdit.apply();
            T t5 = printOrderViewModel.f10898i;
            q qVar = (q) t5.getValue();
            t5.i(qVar.copy((12287 & 1) != 0 ? qVar.firstName : null, (12287 & 2) != 0 ? qVar.lastName : null, (12287 & 4) != 0 ? qVar.fullName : null, (12287 & 8) != 0 ? qVar.flatHouse : null, (12287 & 16) != 0 ? qVar.areaStreet : null, (12287 & 32) != 0 ? qVar.landmark : null, (12287 & 64) != 0 ? qVar.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar.city : null, (12287 & Fields.RotationX) != 0 ? qVar.state : null, (12287 & Fields.RotationY) != 0 ? qVar.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar.isPhoneVerified : true, (12287 & Fields.Shape) != 0 ? qVar.shippingAddressId : null));
            T t6 = printOrderViewModel.q;
            t6.getClass();
            t6.j(null, bool);
            T t7 = printOrderViewModel.u;
            t7.getClass();
            t7.j(null, "");
        }
        Throwable thA = k.a(obj2);
        if (thA != null) {
            String message = thA.getMessage();
            if (message == null) {
                message = "Invalid OTP verification code. Please check and try again";
            }
            T t8 = printOrderViewModel.f10870I;
            t8.getClass();
            t8.j(null, message);
        }
        return o.f154a;
    }
}
