package p092v3;

import B3.h;
import B3.o;
import C3.v;
import F3.d;
import G3.a;
import H3.j;
import M0.b;
import O0.n;
import X3.InterfaceC0200y;
import a4.T;
import android.util.Log;
import g4.x;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends j implements O3.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h f13515o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, d dVar) {
        super(2, dVar);
        this.f13515o = hVar;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new e(this.f13515o, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        h hVar = this.f13515o;
        a aVar = a.f448o;
        o4.d.y(obj);
        try {
            b bVar = new b();
            hVar.getClass();
            bVar.k("https://notescrafter.com/api/print/rates");
            bVar.g();
            x xVarF = hVar.f13523c.a(bVar.d()).f();
            n nVar = xVarF.u;
            String strJ = nVar != null ? nVar.j() : "";
            if (xVarF.g()) {
                JSONObject jSONObject = new JSONObject(strJ);
                if (jSONObject.getBoolean("success")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (String str : v.S("guest", "monthly", "half_yearly", "annual", "lifetime")) {
                        if (jSONObject2.has(str)) {
                            JSONObject jSONObject3 = jSONObject2.getJSONObject(str);
                            linkedHashMap.put(str, new h(new Double(jSONObject3.getDouble("bw")), new Double(jSONObject3.getDouble("color"))));
                        }
                    }
                    if (!linkedHashMap.isEmpty()) {
                        T t = hVar.f13537w;
                        t.getClass();
                        t.j(null, linkedHashMap);
                        Log.d("AuthManager", "Printing rates refreshed successfully: " + linkedHashMap);
                    }
                }
            }
            return o.f154a;
        } catch (Exception e) {
            hVar.getClass();
            return new Integer(Log.e("AuthManager", "Failed to fetch printing rates", e));
        }
    }
}
