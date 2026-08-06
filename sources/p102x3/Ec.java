package p102x3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import M0.b;
import O3.e;
import X3.InterfaceC0200y;
import androidx.compose.runtime.MutableState;
import com.google.android.gms.internal.ads.ZF;
import com.google.android.gms.internal.measurement.C2117x;
import com.notescrafter.PrintOrderViewModel;
import g4.p;
import g4.t;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import p083t3.C2283e0;
import p083t3.C2291i0;
import p083t3.F;
import p087u3.k;
import p087u3.m;
import p087u3.q;

/* JADX INFO: loaded from: classes2.dex */
public final class Ec extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PrintOrderViewModel f13937o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f13938r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f13939s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ec(PrintOrderViewModel printOrderViewModel, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, d dVar) {
        super(2, dVar);
        this.f13937o = printOrderViewModel;
        this.p = mutableState;
        this.q = mutableState2;
        this.f13938r = mutableState3;
        this.f13939s = mutableState4;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new Ec(this.f13937o, this.p, this.q, this.f13938r, this.f13939s, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Ec ec = (Ec) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        ec.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        this.f13937o.f10889b.getSharedPreferences("auth_prefs", 0).getString("user_email", "guest_user@notescrafter.com");
        PrintOrderViewModel printOrderViewModel = this.f13937o;
        C2435db c2435db = new C2435db(3, this.p);
        C2291i0 c2291i0 = new C2291i0(this.q, this.f13938r, this.f13939s, printOrderViewModel);
        printOrderViewModel.getClass();
        List<m> notebooks = (List) printOrderViewModel.g.getValue();
        q shipping = (q) printOrderViewModel.f10898i.getValue();
        C2283e0 c2283e0 = (C2283e0) printOrderViewModel.f10884W.getValue();
        String str = c2283e0 != null ? c2283e0.f13162a : null;
        printOrderViewModel.f10895e0 = c2291i0;
        C2117x c2117x = printOrderViewModel.f10891c;
        F f5 = new F(printOrderViewModel, c2435db, c2291i0, 1);
        c2117x.getClass();
        kotlin.jvm.internal.o.f(notebooks, "notebooks");
        kotlin.jvm.internal.o.f(shipping, "shipping");
        try {
            JSONArray jSONArray = new JSONArray();
            for (m mVar : notebooks) {
                JSONObject jSONObject = new JSONObject();
                String r2FileKey = mVar.getR2FileKey();
                if (r2FileKey == null) {
                    r2FileKey = "";
                }
                jSONObject.put("r2_file_key", r2FileKey);
                jSONObject.put("name", mVar.getName());
                jSONObject.put("pages", mVar.getPages());
                jSONObject.put("copies", mVar.getCopies());
                jSONObject.put("color_mode", mVar.getColor() == p087u3.j.COLOR ? "color" : "bw");
                jSONObject.put("duplex_mode", mVar.getDuplex() == k.SINGLE ? "single" : "double");
                jSONObject.put("paper_size", mVar.getSize());
                jSONObject.put("binding_type", mVar.getBinding());
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("firstName", shipping.getFirstName());
            jSONObject2.put("lastName", shipping.getLastName());
            jSONObject2.put("phone", shipping.getPhone());
            jSONObject2.put("flatHouse", shipping.getFlatHouse());
            jSONObject2.put("areaStreet", shipping.getAreaStreet());
            jSONObject2.put("landmark", shipping.getLandmark());
            jSONObject2.put("city", shipping.getCity());
            jSONObject2.put("state", shipping.getState());
            jSONObject2.put("postalCode", shipping.getPostalCode());
            String strName = shipping.getAddressType().name();
            Locale locale = Locale.ROOT;
            String lowerCase = strName.toLowerCase(locale);
            kotlin.jvm.internal.o.e(lowerCase, "toLowerCase(...)");
            if (lowerCase.length() > 0) {
                StringBuilder sb = new StringBuilder();
                String strValueOf = String.valueOf(lowerCase.charAt(0));
                kotlin.jvm.internal.o.d(strValueOf, "null cannot be cast to non-null type java.lang.String");
                String upperCase = strValueOf.toUpperCase(locale);
                kotlin.jvm.internal.o.e(upperCase, "toUpperCase(...)");
                sb.append((Object) upperCase);
                String strSubstring = lowerCase.substring(1);
                kotlin.jvm.internal.o.e(strSubstring, "substring(...)");
                sb.append(strSubstring);
                lowerCase = sb.toString();
            }
            jSONObject2.put("addressType", lowerCase);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("items", jSONArray);
            if (shipping.getShippingAddressId() != null) {
                jSONObject3.put("shippingAddressId", shipping.getShippingAddressId().intValue());
            } else {
                jSONObject3.put("shipping", jSONObject2);
            }
            if (str != null && !W3.j.m0(str)) {
                jSONObject3.put("couponCode", str);
            }
            b bVarC = c2117x.c("https://notescrafter.com/api/print/orders");
            String string = jSONObject3.toString();
            kotlin.jvm.internal.o.e(string, "toString(...)");
            Pattern pattern = p.f11330d;
            bVarC.i("POST", p003a2.a.g(string, p111z2.b.k("application/json")));
            ((t) c2117x.q).a(bVarC.d()).e(new ZF(6, f5, c2117x));
        } catch (Exception e) {
            f5.invoke(new B3.k(o4.d.d(e)));
        }
        return o.f154a;
    }
}
