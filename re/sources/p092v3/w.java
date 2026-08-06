package p092v3;

import B3.h;
import B3.k;
import O0.n;
import O3.c;
import g4.e;
import g4.x;
import java.io.IOException;
import java.util.ArrayList;
import k4.i;
import kotlin.jvm.internal.o;
import o4.d;
import org.json.JSONArray;
import org.json.JSONObject;
import p087u3.v;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13586o;
    public final /* synthetic */ c p;

    public /* synthetic */ w(c cVar, int i5) {
        this.f13586o = i5;
        this.p = cVar;
    }

    @Override // g4.e
    public final void j(i call, IOException iOException) {
        switch (this.f13586o) {
            case 0:
                o.f(call, "call");
                this.p.invoke(new k(d.d(iOException)));
                break;
            default:
                o.f(call, "call");
                this.p.invoke(new k(d.d(iOException)));
                break;
        }
    }

    @Override // g4.e
    public final void l(i call, x xVar) {
        switch (this.f13586o) {
            case 0:
                o.f(call, "call");
                n nVar = xVar.u;
                String strJ = nVar != null ? nVar.j() : "";
                boolean zG = xVar.g();
                c cVar = this.p;
                if (!zG) {
                    cVar.invoke(new k(d.d(new Exception("HTTP Error: " + xVar.f11402r))));
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(strJ);
                        int i5 = 0;
                        if (!jSONObject.optBoolean("success", false)) {
                            cVar.invoke(new k(d.d(new Exception(jSONObject.optString("error", "Failed to fetch addresses")))));
                        } else {
                            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
                            if (jSONArrayOptJSONArray == null) {
                                jSONArrayOptJSONArray = new JSONArray();
                            }
                            ArrayList arrayList = new ArrayList();
                            int length = jSONArrayOptJSONArray.length();
                            int i6 = 0;
                            while (i6 < length) {
                                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i6);
                                String strOptString = jSONObject2.optString("id");
                                o.e(strOptString, "optString(...)");
                                arrayList.add(new v(strOptString, jSONObject2.optString("first_name", null), jSONObject2.optString("last_name", null), jSONObject2.optString("full_name", null), jSONObject2.optString("phone", null), jSONObject2.optString("flat_house", null), jSONObject2.optString("area_street", null), jSONObject2.optString("landmark", null), jSONObject2.optString("city", null), jSONObject2.optString("state", null), jSONObject2.optString("pincode", null), jSONObject2.optString("address_type", null), Integer.valueOf((!jSONObject2.has("is_verified") || jSONObject2.isNull("is_verified")) ? i5 : jSONObject2.optInt("is_verified")), Integer.valueOf((!jSONObject2.has("is_default") || jSONObject2.isNull("is_default")) ? i5 : jSONObject2.optInt("is_default"))));
                                i6++;
                                i5 = 0;
                            }
                            cVar.invoke(new k(arrayList));
                        }
                    } catch (Exception e) {
                        cVar.invoke(new k(d.d(e)));
                        return;
                    }
                }
                break;
            default:
                o.f(call, "call");
                n nVar2 = xVar.u;
                String strJ2 = nVar2 != null ? nVar2.j() : "";
                boolean zG2 = xVar.g();
                c cVar2 = this.p;
                if (!zG2) {
                    cVar2.invoke(new k(d.d(new Exception("HTTP Error: " + xVar.f11402r))));
                } else {
                    try {
                        JSONObject jSONObject3 = new JSONObject(strJ2);
                        if (jSONObject3.optBoolean("success", false) && jSONObject3.has("data")) {
                            JSONObject jSONObject4 = jSONObject3.getJSONObject("data");
                            cVar2.invoke(new k(new h(jSONObject4.optString("city", ""), jSONObject4.optString("state", ""))));
                        } else {
                            cVar2.invoke(new k(d.d(new Exception(jSONObject3.optString("error", "Pincode not serviceable")))));
                        }
                    } catch (Exception e3) {
                        cVar2.invoke(new k(d.d(e3)));
                        return;
                    }
                }
                break;
        }
    }
}
