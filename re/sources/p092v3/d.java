package p092v3;

import B3.k;
import B3.o;
import G3.a;
import H3.j;
import K2.g;
import M0.b;
import N.h;
import O0.n;
import O3.e;
import X3.InterfaceC0200y;
import a4.T;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import g4.p;
import g4.x;
import java.util.regex.Pattern;
import org.json.JSONObject;
import p042j3.c;
import p101x2.i;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h f13514o;
    public final /* synthetic */ String p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, String str, F3.d dVar) {
        super(2, dVar);
        this.f13514o = hVar;
        this.p = str;
    }

    @Override // H3.a
    public final F3.d create(Object obj, F3.d dVar) {
        return new d(this.f13514o, this.p, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((InterfaceC0200y) obj, (F3.d) obj2)).invokeSuspend(o.f154a);
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        FirebaseMessaging firebaseMessaging;
        a aVar = a.f448o;
        o4.d.y(obj);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("idToken", this.p);
            String string = jSONObject.toString();
            kotlin.jvm.internal.o.e(string, "toString(...)");
            b bVar = new b();
            this.f13514o.getClass();
            bVar.k("https://notescrafter.com/api/auth/mobile");
            Pattern pattern = p.f11330d;
            bVar.i("POST", p003a2.a.g(string, p111z2.b.k("application/json")));
            x xVarF = this.f13514o.f13523c.a(bVar.d()).f();
            n nVar = xVarF.u;
            String strJ = nVar != null ? nVar.j() : "";
            if (!xVarF.g()) {
                this.f13514o.getClass();
                Log.e("AuthManager", "Backend auth failed: ".concat(strJ));
                return new k(o4.d.d(new Exception("Authentication failed")));
            }
            JSONObject jSONObject2 = new JSONObject(strJ);
            if (!jSONObject2.getBoolean("success")) {
                return new k(o4.d.d(new Exception(jSONObject2.optString("error", "Unknown error"))));
            }
            JSONObject jSONObject3 = jSONObject2.getJSONObject("data");
            String string2 = jSONObject3.getString("jwt");
            JSONObject jSONObject4 = jSONObject3.getJSONObject("user");
            boolean z3 = jSONObject3.getBoolean("has_active_subscription");
            SharedPreferences.Editor editorEdit = this.f13514o.f13522b.edit();
            editorEdit.putBoolean("is_logged_in", true);
            editorEdit.putString("jwt", string2);
            editorEdit.putString("user_name", jSONObject4.getString("name"));
            editorEdit.putString("user_email", jSONObject4.getString("email"));
            editorEdit.putString("user_photo", jSONObject4.optString("profile_picture", null));
            editorEdit.putBoolean("is_premium", z3);
            editorEdit.putBoolean("first_order_diamond_deal_eligible", jSONObject3.optBoolean("first_order_diamond_deal_eligible", false));
            if (!z3 || jSONObject3.isNull("subscription")) {
                editorEdit.remove("subscription_plan");
                editorEdit.putInt("remaining_days", 0);
            } else {
                JSONObject jSONObject5 = jSONObject3.getJSONObject("subscription");
                editorEdit.putString("subscription_plan", jSONObject5.getString("plan_type"));
                editorEdit.putInt("remaining_days", jSONObject5.getInt("remaining_days"));
            }
            if (jSONObject4.isNull("phone")) {
                editorEdit.remove("user_phone");
            } else {
                editorEdit.putString("user_phone", jSONObject4.getString("phone"));
            }
            if (jSONObject4.isNull("phone_verified")) {
                editorEdit.remove("user_phone_verified");
            } else {
                editorEdit.putBoolean("user_phone_verified", jSONObject4.getBoolean("phone_verified"));
            }
            if (jSONObject4.isNull("print_first_login_at")) {
                editorEdit.remove("print_first_login_at");
            } else {
                editorEdit.putString("print_first_login_at", jSONObject4.getString("print_first_login_at"));
            }
            editorEdit.apply();
            T t = this.f13514o.f13524d;
            Boolean bool = Boolean.TRUE;
            t.getClass();
            t.j(null, bool);
            T t5 = this.f13514o.f13525f;
            Boolean boolValueOf = Boolean.valueOf(z3);
            t5.getClass();
            t5.j(null, boolValueOf);
            this.f13514o.f13526h.i(jSONObject4.getString("name"));
            this.f13514o.f13528j.i(jSONObject4.getString("email"));
            this.f13514o.f13530l.i(jSONObject4.optString("profile_picture", null));
            this.f13514o.f13534r.i(!jSONObject4.isNull("print_first_login_at") ? jSONObject4.getString("print_first_login_at") : null);
            T t6 = this.f13514o.f13535s;
            Boolean boolValueOf2 = Boolean.valueOf(jSONObject3.optBoolean("first_order_diamond_deal_eligible", false));
            t6.getClass();
            t6.j(null, boolValueOf2);
            if (!z3 || jSONObject3.isNull("subscription")) {
                this.f13514o.f13532n.i(null);
                T t7 = this.f13514o.p;
                Integer num = new Integer(0);
                t7.getClass();
                t7.j(null, num);
            } else {
                JSONObject jSONObject6 = jSONObject3.getJSONObject("subscription");
                this.f13514o.f13532n.i(jSONObject6.getString("plan_type"));
                T t8 = this.f13514o.p;
                Integer num2 = new Integer(jSONObject6.getInt("remaining_days"));
                t8.getClass();
                t8.j(null, num2);
            }
            this.f13514o.getClass();
            Log.d("AuthManager", "Auth success: " + jSONObject4.getString("name") + ", premium=" + z3);
            c cVar = FirebaseMessaging.f10842l;
            synchronized (FirebaseMessaging.class) {
                firebaseMessaging = FirebaseMessaging.getInstance(g.b());
            }
            firebaseMessaging.getClass();
            i iVar = new i();
            firebaseMessaging.f10849f.execute(new h(11, firebaseMessaging, iVar));
            iVar.f13713a.h(new N.b(this.f13514o, 18));
            objD = jSONObject4.getString("name");
        } catch (Exception e) {
            this.f13514o.getClass();
            Log.e("AuthManager", "Backend auth error", e);
            objD = o4.d.d(e);
        }
        return new k(objD);
    }
}
