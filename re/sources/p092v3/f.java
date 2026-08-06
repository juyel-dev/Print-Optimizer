package p092v3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import M0.b;
import O0.n;
import O3.e;
import X3.InterfaceC0200y;
import a4.T;
import android.content.SharedPreferences;
import android.util.Log;
import g4.x;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h f13516o;
    public final /* synthetic */ String p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, String str, d dVar) {
        super(2, dVar);
        this.f13516o = hVar;
        this.p = str;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new f(this.f13516o, this.p, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        f fVar = (f) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        fVar.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        o oVar = o.f154a;
        h hVar = this.f13516o;
        a aVar = a.f448o;
        o4.d.y(obj);
        try {
            b bVar = new b();
            hVar.getClass();
            bVar.k("https://notescrafter.com/api/subscription/status");
            bVar.c("Authorization", "Bearer ".concat(this.p));
            bVar.g();
            x xVarF = hVar.f13523c.a(bVar.d()).f();
            n nVar = xVarF.u;
            String strJ = nVar != null ? nVar.j() : "";
            if (xVarF.f11402r == 401) {
                Log.d("AuthManager", "JWT expired, signing out");
                hVar.c();
                return oVar;
            }
            if (!xVarF.g()) {
                return oVar;
            }
            JSONObject jSONObject = new JSONObject(strJ);
            if (!jSONObject.getBoolean("success")) {
                return oVar;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            boolean z3 = jSONObject2.getBoolean("has_active_subscription");
            SharedPreferences.Editor editorEdit = hVar.f13522b.edit();
            editorEdit.putBoolean("is_premium", z3);
            if (!z3 || jSONObject2.isNull("subscription")) {
                editorEdit.remove("subscription_plan");
                editorEdit.putInt("remaining_days", 0);
            } else {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("subscription");
                editorEdit.putString("subscription_plan", jSONObject3.getString("plan_type"));
                editorEdit.putInt("remaining_days", jSONObject3.getInt("remaining_days"));
            }
            editorEdit.apply();
            T t = hVar.f13525f;
            Boolean boolValueOf = Boolean.valueOf(z3);
            t.getClass();
            t.j(null, boolValueOf);
            T t5 = hVar.p;
            T t6 = hVar.f13532n;
            if (!z3 || jSONObject2.isNull("subscription")) {
                t6.i(null);
                Integer num = new Integer(0);
                t5.getClass();
                t5.j(null, num);
            } else {
                JSONObject jSONObject4 = jSONObject2.getJSONObject("subscription");
                t6.i(jSONObject4.getString("plan_type"));
                Integer num2 = new Integer(jSONObject4.getInt("remaining_days"));
                t5.getClass();
                t5.j(null, num2);
            }
            Log.d("AuthManager", "Subscription refresh: premium=" + z3);
            return oVar;
        } catch (Exception e) {
            hVar.getClass();
            Log.e("AuthManager", "Subscription refresh failed", e);
        }
    }
}
