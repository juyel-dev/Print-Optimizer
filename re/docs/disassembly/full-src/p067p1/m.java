package p067p1;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC1223ib;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p090v1.C2362o;
import p090v1.InterfaceC2357l0;
import p090v1.O0;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2357l0 f12276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f12277b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f12278c;

    public m(InterfaceC2357l0 interfaceC2357l0) {
        this.f12276a = interfaceC2357l0;
        if (interfaceC2357l0 != null) {
            try {
                List<O0> listJ = interfaceC2357l0.j();
                if (listJ != null) {
                    for (O0 o5 : listJ) {
                        g gVar = o5 != null ? new g(o5) : null;
                        if (gVar != null) {
                            this.f12277b.add(gVar);
                        }
                    }
                }
            } catch (RemoteException e) {
                AbstractC1223ib.q("Could not forward getAdapterResponseInfo to ResponseInfo.", e);
            }
        }
        InterfaceC2357l0 interfaceC2357l1 = this.f12276a;
        if (interfaceC2357l1 == null) {
            return;
        }
        try {
            O0 o0C = interfaceC2357l1.c();
            if (o0C != null) {
                this.f12278c = new g(o0C);
            }
        } catch (RemoteException e3) {
            AbstractC1223ib.q("Could not forward getLoadedAdapterResponse to ResponseInfo.", e3);
        }
    }

    public final JSONObject a() throws JSONException {
        String strF;
        Bundle bundleB;
        JSONObject jSONObject = new JSONObject();
        InterfaceC2357l0 interfaceC2357l0 = this.f12276a;
        String strH = null;
        if (interfaceC2357l0 != null) {
            try {
                strF = interfaceC2357l0.f();
            } catch (RemoteException e) {
                AbstractC1223ib.q("Could not forward getResponseId to ResponseInfo.", e);
                strF = null;
            }
        } else {
            strF = null;
        }
        if (strF == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", strF);
        }
        if (interfaceC2357l0 != null) {
            try {
                strH = interfaceC2357l0.h();
            } catch (RemoteException e3) {
                AbstractC1223ib.q("Could not forward getMediationAdapterClassName to ResponseInfo.", e3);
            }
        }
        if (strH == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", strH);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f12277b.iterator();
        while (it.hasNext()) {
            jSONArray.put(((g) it.next()).a());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        g gVar = this.f12278c;
        if (gVar != null) {
            jSONObject.put("Loaded Adapter Response", gVar.a());
        }
        if (interfaceC2357l0 != null) {
            try {
                bundleB = interfaceC2357l0.b();
            } catch (RemoteException e5) {
                AbstractC1223ib.q("Could not forward getResponseExtras to ResponseInfo.", e5);
                bundleB = new Bundle();
            }
        } else {
            bundleB = new Bundle();
        }
        if (bundleB != null) {
            jSONObject.put("Response Extras", C2362o.f13474f.f13475a.f(bundleB));
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
