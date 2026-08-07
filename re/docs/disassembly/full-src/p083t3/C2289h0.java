package p083t3;

import B3.k;
import B3.o;
import F3.d;
import G3.a;
import H3.j;
import M0.b;
import O3.e;
import X3.A;
import X3.InterfaceC0200y;
import com.google.android.gms.internal.measurement.C2117x;
import com.notescrafter.PrintOrderViewModel;
import g4.p;
import g4.t;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import p087u3.m;

/* JADX INFO: renamed from: t3.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2289h0 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13176o;
    public final /* synthetic */ PrintOrderViewModel p;
    public final /* synthetic */ String q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ List f13177r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2289h0(PrintOrderViewModel printOrderViewModel, String str, List list, d dVar) {
        super(2, dVar);
        this.p = printOrderViewModel;
        this.q = str;
        this.f13177r = list;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2289h0(this.p, this.q, this.f13177r, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2289h0) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        int i5 = this.f13176o;
        if (i5 == 0) {
            o4.d.y(obj);
            this.f13176o = 1;
            if (A.g(1000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o4.d.y(obj);
        }
        PrintOrderViewModel printOrderViewModel = this.p;
        C2117x c2117x = printOrderViewModel.f10891c;
        C2277b0 c2277b0 = new C2277b0(printOrderViewModel, 4);
        c2117x.getClass();
        String str = this.q;
        List<m> list = this.f13177r;
        try {
            JSONArray jSONArray = new JSONArray();
            for (m mVar : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pages", mVar.getPages());
                jSONObject.put("copies", mVar.getCopies());
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("pincode", str);
            jSONObject2.put("items", jSONArray);
            String string = jSONObject2.toString();
            kotlin.jvm.internal.o.e(string, "toString(...)");
            b bVarC = c2117x.c("https://notescrafter.com/api/print/shipping-cost");
            Pattern pattern = p.f11330d;
            bVarC.i("POST", p003a2.a.g(string, p111z2.b.k("application/json")));
            ((t) c2117x.q).a(bVarC.d()).e(new A.e(c2277b0, 24));
        } catch (Exception e) {
            c2277b0.invoke(new k(o4.d.d(e)));
        }
        return o.f154a;
    }
}
