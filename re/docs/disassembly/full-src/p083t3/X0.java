package p083t3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import M0.b;
import N0.C;
import O3.e;
import X3.InterfaceC0200y;
import android.util.Log;
import com.google.android.gms.internal.measurement.C2117x;
import com.notescrafter.PrintOrderViewModel;
import g4.p;
import g4.t;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import p042j3.c;
import p087u3.k;
import p087u3.m;

/* JADX INFO: loaded from: classes2.dex */
public final class X0 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PrintOrderViewModel f13121o;
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X0(PrintOrderViewModel printOrderViewModel, String str, String str2, d dVar) {
        super(2, dVar);
        this.f13121o = printOrderViewModel;
        this.p = str;
        this.q = str2;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new X0(this.f13121o, this.p, this.q, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        X0 x4 = (X0) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        x4.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        C c5 = new C(this.q, 2);
        String str = this.p;
        PrintOrderViewModel printOrderViewModel = this.f13121o;
        printOrderViewModel.r(str, c5);
        printOrderViewModel.q();
        List<m> list = (List) printOrderViewModel.g.getValue();
        if (!list.isEmpty()) {
            C2277b0 c2277b0 = new C2277b0(printOrderViewModel, 1);
            C2117x c2117x = printOrderViewModel.f10891c;
            c2117x.getClass();
            try {
                JSONArray jSONArray = new JSONArray();
                for (m mVar : list) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("color_mode", mVar.getColor() == p087u3.j.COLOR ? "color" : "bw");
                    jSONObject.put("duplex_mode", mVar.getDuplex() == k.SINGLE ? "single" : "double");
                    jSONObject.put("paper_size", mVar.getSize());
                    jSONObject.put("binding_type", mVar.getBinding());
                    jSONObject.put("pages", mVar.getPages());
                    jSONObject.put("copies", mVar.getCopies());
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("items", jSONArray);
                String string = jSONObject2.toString();
                kotlin.jvm.internal.o.e(string, "toString(...)");
                b bVarC = c2117x.c("https://notescrafter.com/api/print/calculate-price");
                Pattern pattern = p.f11330d;
                bVarC.i("POST", p003a2.a.g(string, p111z2.b.k("application/json")));
                ((t) c2117x.q).a(bVarC.d()).e(new c(c2277b0, 27));
            } catch (Exception e) {
                Throwable thA = B3.k.a(o4.d.d(e));
                if (thA != null) {
                    Log.e("PrintOrderViewModel", "Failed to calculate server rates", thA);
                }
            }
        }
        return o.f154a;
    }
}
