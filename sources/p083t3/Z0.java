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
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Z0 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PrintOrderViewModel f13142o;
    public final /* synthetic */ k p;
    public final /* synthetic */ String q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z0(k kVar, d dVar, PrintOrderViewModel printOrderViewModel, String str) {
        super(2, dVar);
        this.f13142o = printOrderViewModel;
        this.p = kVar;
        this.q = str;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new Z0(this.p, dVar, this.f13142o, this.q);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Z0 z3 = (Z0) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        z3.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        PrintOrderViewModel printOrderViewModel = this.f13142o;
        T t = printOrderViewModel.f10888a0;
        Boolean bool = Boolean.FALSE;
        t.getClass();
        t.j(null, bool);
        Object obj2 = this.p.f150o;
        boolean z3 = obj2 instanceof B3.j;
        T t5 = printOrderViewModel.f10886Y;
        if (!z3) {
            JSONObject jSONObject = (JSONObject) obj2;
            if (jSONObject.optBoolean("valid", false)) {
                String strOptString = jSONObject.optString("code", this.q);
                kotlin.jvm.internal.o.e(strOptString, "optString(...)");
                long jOptLong = jSONObject.optLong("discountPaise", 0L);
                String strOptString2 = jSONObject.optString("description", "");
                kotlin.jvm.internal.o.e(strOptString2, "optString(...)");
                C2283e0 c2283e0 = new C2283e0(strOptString, strOptString2, jOptLong);
                T t6 = printOrderViewModel.f10884W;
                t6.getClass();
                t6.j(null, c2283e0);
                t5.i(null);
            } else {
                t5.i(jSONObject.optString("error", "Invalid coupon code."));
            }
        }
        Throwable thA = k.a(obj2);
        if (thA != null) {
            String message = thA.getMessage();
            if (message == null) {
                message = "Could not validate coupon. Please try again.";
            }
            t5.getClass();
            t5.j(null, message);
        }
        return o.f154a;
    }
}
