package p067p1;

import P1.l;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends l {
    public final m g;

    public i(int i5, String str, String str2, l lVar, m mVar) {
        super(i5, str, str2, lVar);
        this.g = mVar;
    }

    @Override // P1.l
    public final JSONObject d() throws JSONException {
        JSONObject jSONObjectD = super.d();
        m mVar = this.g;
        if (mVar == null) {
            jSONObjectD.put("Response Info", "null");
        } else {
            jSONObjectD.put("Response Info", mVar.a());
        }
        return jSONObjectD;
    }

    @Override // P1.l
    public final String toString() {
        try {
            return d().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
