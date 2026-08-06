package p083t3;

import B3.k;
import B3.o;
import F3.d;
import G3.a;
import H3.j;
import M0.b;
import N0.C;
import O1.i;
import O3.e;
import X3.InterfaceC0200y;
import android.util.Log;
import com.google.android.gms.internal.measurement.C2117x;
import com.notescrafter.PrintOrderViewModel;
import g4.p;
import g4.t;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class H0 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PrintOrderViewModel f13026o;
    public final /* synthetic */ String p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(PrintOrderViewModel printOrderViewModel, String str, d dVar) {
        super(2, dVar);
        this.f13026o = printOrderViewModel;
        this.p = str;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new H0(this.f13026o, this.p, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        H0 h5 = (H0) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        h5.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        C2117x c2117x = this.f13026o.f10891c;
        String str = this.p;
        C c5 = new C(str, 1);
        c2117x.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("r2_file_key", str);
            String string = jSONObject.toString();
            kotlin.jvm.internal.o.e(string, "toString(...)");
            b bVarC = c2117x.c("https://notescrafter.com/api/print/drafts/delete");
            Pattern pattern = p.f11330d;
            bVarC.i("POST", p003a2.a.g(string, p111z2.b.k("application/json")));
            ((t) c2117x.q).a(bVarC.d()).e(new i(c5, 20));
        } catch (Exception e) {
            Throwable thA = k.a(o4.d.d(e));
            if (thA != null) {
                Log.e("PrintOrderViewModel", "Failed to delete cloud draft ".concat(c5.p), thA);
            }
        }
        return o.f154a;
    }
}
