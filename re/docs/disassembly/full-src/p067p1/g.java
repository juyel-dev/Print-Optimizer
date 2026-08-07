package p067p1;

import P1.l;
import org.json.JSONException;
import org.json.JSONObject;
import p090v1.O0;
import p090v1.t0;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O0 f12271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f12272b;

    public g(O0 o5) {
        this.f12271a = o5;
        t0 t0Var = o5.q;
        this.f12272b = t0Var == null ? null : t0Var.g();
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        O0 o5 = this.f12271a;
        jSONObject.put("Adapter", o5.f13433o);
        jSONObject.put("Latency", o5.p);
        String str = o5.f13435s;
        if (str == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", str);
        }
        String str2 = o5.t;
        if (str2 == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", str2);
        }
        String str3 = o5.u;
        if (str3 == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", str3);
        }
        String str4 = o5.f13436v;
        if (str4 == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", str4);
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str5 : o5.f13434r.keySet()) {
            jSONObject2.put(str5, o5.f13434r.get(str5));
        }
        jSONObject.put("Credentials", jSONObject2);
        l lVar = this.f12272b;
        if (lVar == null) {
            jSONObject.put("Ad Error", "null");
        } else {
            jSONObject.put("Ad Error", lVar.d());
        }
        return jSONObject;
    }

    public final String toString() {
        try {
            return a().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
