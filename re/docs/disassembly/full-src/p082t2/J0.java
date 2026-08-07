package p082t2;

import B0.d;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.F3;
import java.io.IOException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class J0 implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ d f12455o;
    public /* synthetic */ int p;
    public /* synthetic */ IOException q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ byte[] f12456r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Map f12457s;

    @Override // java.lang.Runnable
    public final void run() {
        C2236g0 c2236g0 = ((X) this.f12455o.q).f12578a;
        L l5 = c2236g0.f12681i;
        int i5 = this.p;
        IOException iOException = this.q;
        if ((i5 != 200 && i5 != 204 && i5 != 304) || iOException != null) {
            C2236g0.d(l5);
            l5.f12474i.h("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i5), iOException);
            return;
        }
        U u = c2236g0.f12680h;
        C2236g0.f(u);
        u.u.a(true);
        byte[] bArr = this.f12456r;
        if (bArr == null || bArr.length == 0) {
            C2236g0.d(l5);
            l5.f12478m.g("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String strOptString = jSONObject.optString("deeplink", "");
            String strOptString2 = jSONObject.optString("gclid", "");
            String strOptString3 = jSONObject.optString("gbraid", "");
            double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
            if (TextUtils.isEmpty(strOptString)) {
                C2236g0.d(l5);
                l5.f12478m.g("Deferred Deep Link is empty.");
                return;
            }
            Bundle bundle = new Bundle();
            F3.a();
            boolean zT = c2236g0.g.t(null, AbstractC2268x.f12919Q0);
            n1 n1Var = c2236g0.f12684l;
            if (zT) {
                C2236g0.f(n1Var);
                if (!n1Var.r0(strOptString)) {
                    C2236g0.d(l5);
                    l5.f12474i.i("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                    return;
                }
                bundle.putString("gbraid", strOptString3);
            } else {
                C2236g0.f(n1Var);
                if (!n1Var.r0(strOptString)) {
                    C2236g0.d(l5);
                    l5.f12474i.h("Deferred Deep Link validation failed. gclid, deep link", strOptString2, strOptString);
                    return;
                }
            }
            bundle.putString("gclid", strOptString2);
            bundle.putString("_cis", "ddp");
            c2236g0.p.O("auto", "_cmp", bundle);
            C2236g0.f(n1Var);
            if (TextUtils.isEmpty(strOptString) || !n1Var.T(strOptString, dOptDouble)) {
                return;
            }
            ((C2236g0) n1Var.f12783a).f12675a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
        } catch (JSONException e) {
            C2236g0.d(l5);
            l5.f12472f.f(e, "Failed to parse the Deferred Deep Link response. exception");
        }
    }
}
