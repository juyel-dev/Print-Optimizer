package p105y1;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC1223ib;
import com.google.android.gms.internal.ads.AbstractC1869x7;
import com.google.android.gms.internal.ads.C1693t7;
import org.json.JSONException;
import org.json.JSONObject;
import p085u1.k;
import p090v1.C2366q;

/* JADX INFO: renamed from: y1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2791b implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15913o;
    public final /* synthetic */ C2796g p;

    public /* synthetic */ RunnableC2791b(C2796g c2796g, int i5) {
        this.f15913o = i5;
        this.p = c2796g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15913o) {
            case 0:
                C2796g c2796g = this.p;
                c2796g.c(c2796g.f15926a);
                return;
            case 1:
                C2796g c2796g2 = this.p;
                c2796g2.getClass();
                C2799j c2799j = k.f13311A.f13322m;
                String str = c2796g2.f15929d;
                String str2 = c2796g2.e;
                String str3 = c2796g2.f15930f;
                boolean zH = c2799j.h();
                Context context = c2796g2.f15926a;
                boolean zF = c2799j.f(context, str, str2);
                synchronized (c2799j.f15939a) {
                    c2799j.f15942d = zF;
                    break;
                }
                if (!c2799j.h()) {
                    c2799j.b(context, str, str2);
                    return;
                }
                if (!zH && !TextUtils.isEmpty(str3)) {
                    c2799j.c(context, str2, str3, str);
                }
                AbstractC1223ib.m("Device is linked for debug signals.");
                C2799j.e(context, "The device is successfully linked for troubleshooting.", false, true);
                return;
            case 2:
                C2796g c2796g3 = this.p;
                c2796g3.g = 4;
                c2796g3.b();
                return;
            case 3:
                C2796g c2796g4 = this.p;
                c2796g4.getClass();
                k kVar = k.f13311A;
                C2799j c2799j2 = kVar.f13322m;
                Context context2 = c2796g4.f15926a;
                String str4 = c2796g4.f15929d;
                String str5 = c2796g4.e;
                c2799j2.getClass();
                C1693t7 c1693t7 = AbstractC1869x7.f9807b4;
                C2366q c2366q = C2366q.f13480d;
                String strJ = C2799j.j(context2, c2799j2.k(context2, (String) c2366q.f13483c.a(c1693t7), str4, str5).toString(), str5);
                if (!TextUtils.isEmpty(strJ)) {
                    try {
                        JSONObject jSONObject = new JSONObject(strJ.trim());
                        String strOptString = jSONObject.optString("gct");
                        c2799j2.f15943f = jSONObject.optString("status");
                        if (((Boolean) c2366q.f13483c.a(AbstractC1869x7.i8)).booleanValue()) {
                            boolean z3 = "0".equals(c2799j2.f15943f) || "2".equals(c2799j2.f15943f);
                            c2799j2.d(z3);
                            kVar.g.c().a(!z3 ? "" : str4);
                        }
                        synchronized (c2799j2.f15939a) {
                            c2799j2.f15941c = strOptString;
                            break;
                        }
                        if ("2".equals(c2799j2.f15943f)) {
                            AbstractC1223ib.m("Creative is not pushed for this device.");
                            C2799j.e(context2, "There was no creative pushed from DFP to the device.", false, false);
                            return;
                        } else if ("1".equals(c2799j2.f15943f)) {
                            AbstractC1223ib.m("The app is not linked for creative preview.");
                            c2799j2.b(context2, str4, str5);
                            return;
                        } else {
                            if ("0".equals(c2799j2.f15943f)) {
                                AbstractC1223ib.m("Device is linked for in app preview.");
                                C2799j.e(context2, "The device is successfully linked for creative preview.", false, true);
                                return;
                            }
                            return;
                        }
                    } catch (JSONException e) {
                        AbstractC1223ib.t("Fail to get in app preview response json.", e);
                    }
                    break;
                } else {
                    AbstractC1223ib.m("Not linked for in app preview.");
                }
                C2799j.e(context2, "In-app preview failed to load because of a system error. Please try again later.", true, true);
                return;
            case 4:
                C2796g c2796g5 = this.p;
                c2796g5.getClass();
                k.f13311A.f13322m.a(c2796g5.f15926a);
                return;
            case 5:
                C2796g c2796g6 = this.p;
                c2796g6.c(c2796g6.f15926a);
                return;
            default:
                C2796g c2796g7 = this.p;
                c2796g7.getClass();
                k.f13311A.f13322m.a(c2796g7.f15926a);
                return;
        }
    }
}
