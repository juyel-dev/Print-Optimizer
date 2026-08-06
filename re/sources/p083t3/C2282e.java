package p083t3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import a4.T;
import android.util.Log;
import com.notescrafter.MainActivity;
import com.notescrafter.PrintOrderViewModel;
import com.notescrafter.app.R;
import com.razorpay.Checkout;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import p087u3.q;

/* JADX INFO: renamed from: t3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2282e extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f13161o;
    public final /* synthetic */ MainActivity p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2282e(MainActivity mainActivity, d dVar) {
        super(2, dVar);
        this.p = mainActivity;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        C2282e c2282e = new C2282e(this.p, dVar);
        c2282e.f13161o = obj;
        return c2282e;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        C2282e c2282e = (C2282e) create((C2285f0) obj, (d) obj2);
        o oVar = o.f154a;
        c2282e.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        MainActivity mainActivity;
        a aVar = a.f448o;
        o4.d.y(obj);
        C2285f0 c2285f0 = (C2285f0) this.f13161o;
        if (c2285f0 != null) {
            int i5 = MainActivity.f10854N;
            MainActivity mainActivity2 = this.p;
            mainActivity2.h().f10892c0.i(null);
            String str = "";
            try {
                Checkout checkout = new Checkout();
                String str2 = c2285f0.f13168c;
                String str3 = c2285f0.f13166a;
                checkout.setKeyID(str2);
                checkout.setImage(R.mipmap.ic_launcher);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", "NotesCrafter");
                jSONObject.put("description", "NotesCrafter Print Order");
                jSONObject.put("order_id", c2285f0.f13167b);
                jSONObject.put("amount", c2285f0.f13169d);
                jSONObject.put("currency", "INR");
                JSONObject jSONObject2 = new JSONObject();
                q qVar = (q) ((T) mainActivity2.h().f10899j.f1964o).getValue();
                jSONObject2.put("name", W3.j.I0(qVar.getFirstName() + " " + qVar.getLastName()).toString());
                String input = qVar.getPhone();
                Pattern patternCompile = Pattern.compile("\\D");
                kotlin.jvm.internal.o.e(patternCompile, "compile(...)");
                kotlin.jvm.internal.o.f(input, "input");
                String strReplaceAll = patternCompile.matcher(input).replaceAll("");
                kotlin.jvm.internal.o.e(strReplaceAll, "replaceAll(...)");
                jSONObject2.put("contact", "+91".concat(W3.j.G0(strReplaceAll)));
                String string = mainActivity2.getSharedPreferences("auth_prefs", 0).getString("user_email", "");
                if (string != null) {
                    str = string;
                }
                if (!W3.j.m0(str)) {
                    jSONObject2.put("email", str);
                }
                jSONObject.put("prefill", jSONObject2);
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                JSONObject jSONObject5 = new JSONObject();
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("name", "Pay via UPI");
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject7 = new JSONObject();
                try {
                    jSONObject7.put("method", "upi");
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put("intent");
                    jSONArray2.put("collect");
                    jSONArray2.put("qr");
                    jSONObject7.put("flows", jSONArray2);
                    jSONArray.put(jSONObject7);
                    jSONObject6.put("instruments", jSONArray);
                    jSONObject5.put("upi_block", jSONObject6);
                    JSONObject jSONObject8 = new JSONObject();
                    jSONObject8.put("name", "Other Payment Methods");
                    JSONArray jSONArray3 = new JSONArray();
                    JSONObject jSONObject9 = new JSONObject();
                    jSONObject9.put("method", "card");
                    jSONArray3.put(jSONObject9);
                    JSONObject jSONObject10 = new JSONObject();
                    jSONObject10.put("method", "netbanking");
                    jSONArray3.put(jSONObject10);
                    JSONObject jSONObject11 = new JSONObject();
                    jSONObject11.put("method", "wallet");
                    jSONArray3.put(jSONObject11);
                    JSONObject jSONObject12 = new JSONObject();
                    jSONObject12.put("method", "emi");
                    jSONArray3.put(jSONObject12);
                    jSONObject8.put("instruments", jSONArray3);
                    jSONObject5.put("other_block", jSONObject8);
                    jSONObject4.put("blocks", jSONObject5);
                    JSONArray jSONArray4 = new JSONArray();
                    jSONArray4.put("block.upi_block");
                    jSONArray4.put("block.other_block");
                    jSONObject4.put("sequence", jSONArray4);
                    JSONObject jSONObject13 = new JSONObject();
                    jSONObject13.put("show_default_blocks", false);
                    jSONObject4.put("preferences", jSONObject13);
                    jSONObject3.put("display", jSONObject4);
                    jSONObject.put("config", jSONObject3);
                    JSONObject jSONObject14 = new JSONObject();
                    jSONObject14.put("color", "#7C3AED");
                    jSONObject14.put("backdrop_color", "#0A0A0F");
                    jSONObject14.put("hide_topbar", false);
                    jSONObject.put("theme", jSONObject14);
                    JSONObject jSONObject15 = new JSONObject();
                    jSONObject15.put("notescrafter_order_id", str3);
                    jSONObject.put("notes", jSONObject15);
                    mainActivity = mainActivity2;
                    try {
                        mainActivity.f10860M = str3;
                        checkout.open(mainActivity, jSONObject);
                    } catch (Exception e) {
                        e = e;
                        Log.e("MainActivity", "Razorpay checkout failed to open", e);
                        PrintOrderViewModel printOrderViewModelH = mainActivity.h();
                        String message = e.getMessage();
                        if (message == null) {
                            message = "Failed to open payment gateway";
                        }
                        printOrderViewModelH.onPaymentFailed(message);
                    }
                } catch (Exception e3) {
                    e = e3;
                    mainActivity = mainActivity2;
                }
            } catch (Exception e5) {
                e = e5;
                mainActivity = mainActivity2;
            }
        }
        return o.f154a;
    }
}
