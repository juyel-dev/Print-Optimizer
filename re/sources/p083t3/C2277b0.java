package p083t3;

import B3.h;
import B3.j;
import B3.k;
import B3.o;
import O3.c;
import X3.A;
import a4.T;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.Q;
import com.notescrafter.PrintOrderViewModel;
import com.razorpay.AppSignatureHelper;
import java.util.List;
import java.util.regex.Pattern;
import p011c0.d;
import p087u3.m;
import p087u3.q;

/* JADX INFO: renamed from: t3.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2277b0 implements c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13149o;
    public final /* synthetic */ PrintOrderViewModel p;

    public /* synthetic */ C2277b0(PrintOrderViewModel printOrderViewModel, int i5) {
        this.f13149o = i5;
        this.p = printOrderViewModel;
    }

    @Override // O3.c
    public final Object invoke(Object obj) {
        boolean z3 = true;
        o oVar = o.f154a;
        PrintOrderViewModel printOrderViewModel = this.p;
        switch (this.f13149o) {
            case 0:
                d dVar = PrintOrderViewModel.f10861f0;
                A.t(Q.h(printOrderViewModel), null, null, new Q0((k) obj, null, printOrderViewModel), 3);
                return oVar;
            case 1:
                d dVar2 = PrintOrderViewModel.f10861f0;
                Object obj2 = ((k) obj).f150o;
                if (!(obj2 instanceof j)) {
                    A.t(Q.h(printOrderViewModel), null, null, new T0(printOrderViewModel, (List) obj2, null), 3);
                }
                Throwable thA = k.a(obj2);
                if (thA != null) {
                    Log.e("PrintOrderViewModel", "Failed to calculate server rates", thA);
                }
                return oVar;
            case 2:
                d dVar3 = PrintOrderViewModel.f10861f0;
                Object obj3 = ((k) obj).f150o;
                if (!(obj3 instanceof j)) {
                    A.t(Q.h(printOrderViewModel), null, null, new A0(printOrderViewModel, (h) obj3, null), 3);
                }
                Throwable thA2 = k.a(obj3);
                if (thA2 != null) {
                    A.t(Q.h(printOrderViewModel), null, null, new B0(printOrderViewModel, thA2, null), 3);
                }
                return oVar;
            case 3:
                d dVar4 = PrintOrderViewModel.f10861f0;
                A.t(Q.h(printOrderViewModel), null, null, new C2316v0((k) obj, null, printOrderViewModel), 3);
                return oVar;
            case 4:
                A.t(Q.h(printOrderViewModel), null, null, new C2287g0((k) obj, null, printOrderViewModel), 3);
                return oVar;
            case 5:
                A.t(Q.h(printOrderViewModel), null, null, new C2299m0((k) obj, null, printOrderViewModel), 3);
                return oVar;
            case 6:
                A.t(Q.h(printOrderViewModel), null, null, new C2307q0((k) obj, null, printOrderViewModel), 3);
                return oVar;
            case 7:
                Object obj4 = ((k) obj).f150o;
                if (!(obj4 instanceof j)) {
                    A.t(Q.h(printOrderViewModel), null, null, new C2310s0(printOrderViewModel, (List) obj4, null), 3);
                }
                Throwable thA3 = k.a(obj4);
                if (thA3 != null) {
                    Log.e("PrintOrderViewModel", "Failed to fetch cloud drafts", thA3);
                }
                return oVar;
            case 8:
                A.t(Q.h(printOrderViewModel), null, null, new C2314u0((k) obj, null, printOrderViewModel), 3);
                return oVar;
            case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                m n5 = (m) obj;
                kotlin.jvm.internal.o.f(n5, "n");
                String name = n5.getName();
                printOrderViewModel.getClass();
                Z zI = PrintOrderViewModel.i(name);
                if (W3.j.I0(n5.getName()).toString().length() != 0 && zI.f13140b == null && !zI.f13141c && kotlin.jvm.internal.o.b(n5.getUploadStatus(), "success")) {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            case 10:
                String it = (String) obj;
                kotlin.jvm.internal.o.f(it, "it");
                printOrderViewModel.getClass();
                SharedPreferences sharedPreferences = printOrderViewModel.f10889b.getSharedPreferences("auth_prefs", 0);
                String string = sharedPreferences.getString("user_phone", "");
                if (string == null) {
                    string = "";
                }
                boolean z4 = sharedPreferences.getBoolean("user_phone_verified", false);
                T t = printOrderViewModel.f10898i;
                q prev = (q) t.getValue();
                kotlin.jvm.internal.o.f(prev, "prev");
                q qVarCopy = prev.copy((12287 & 1) != 0 ? prev.firstName : null, (12287 & 2) != 0 ? prev.lastName : null, (12287 & 4) != 0 ? prev.fullName : null, (12287 & 8) != 0 ? prev.flatHouse : null, (12287 & 16) != 0 ? prev.areaStreet : null, (12287 & 32) != 0 ? prev.landmark : null, (12287 & 64) != 0 ? prev.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? prev.city : null, (12287 & Fields.RotationX) != 0 ? prev.state : null, (12287 & Fields.RotationY) != 0 ? prev.postalCode : null, (12287 & Fields.RotationZ) != 0 ? prev.country : null, (12287 & Fields.CameraDistance) != 0 ? prev.phone : W3.j.F0(10, it), (12287 & Fields.TransformOrigin) != 0 ? prev.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? prev.shippingAddressId : null);
                Pattern patternCompile = Pattern.compile("\\D");
                kotlin.jvm.internal.o.e(patternCompile, "compile(...)");
                String strReplaceAll = patternCompile.matcher(string).replaceAll("");
                kotlin.jvm.internal.o.e(strReplaceAll, "replaceAll(...)");
                String strG0 = W3.j.G0(strReplaceAll);
                String input = qVarCopy.getPhone();
                Pattern patternCompile2 = Pattern.compile("\\D");
                kotlin.jvm.internal.o.e(patternCompile2, "compile(...)");
                kotlin.jvm.internal.o.f(input, "input");
                String strReplaceAll2 = patternCompile2.matcher(input).replaceAll("");
                kotlin.jvm.internal.o.e(strReplaceAll2, "replaceAll(...)");
                String strG1 = W3.j.G0(strReplaceAll2);
                q qVarCopy2 = qVarCopy.copy((12287 & 1) != 0 ? qVarCopy.firstName : null, (12287 & 2) != 0 ? qVarCopy.lastName : null, (12287 & 4) != 0 ? qVarCopy.fullName : null, (12287 & 8) != 0 ? qVarCopy.flatHouse : null, (12287 & 16) != 0 ? qVarCopy.areaStreet : null, (12287 & 32) != 0 ? qVarCopy.landmark : null, (12287 & 64) != 0 ? qVarCopy.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVarCopy.city : null, (12287 & Fields.RotationX) != 0 ? qVarCopy.state : null, (12287 & Fields.RotationY) != 0 ? qVarCopy.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVarCopy.country : null, (12287 & Fields.CameraDistance) != 0 ? qVarCopy.phone : strG1, (12287 & Fields.TransformOrigin) != 0 ? qVarCopy.isPhoneVerified : (z4 && !W3.j.m0(strG0) && strG0.equals(strG1)) ? true : qVarCopy.isPhoneVerified(), (12287 & Fields.Shape) != 0 ? qVarCopy.shippingAddressId : null);
                t.i(qVarCopy2);
                if (!kotlin.jvm.internal.o.b(qVarCopy2.getPostalCode(), prev.getPostalCode())) {
                    if (qVarCopy2.getPostalCode().length() == 6) {
                        String postalCode = qVarCopy2.getPostalCode();
                        printOrderViewModel.f10908w.i(null);
                        printOrderViewModel.f10891c.g(postalCode, new C2277b0(printOrderViewModel, 2));
                    } else {
                        Double dValueOf = Double.valueOf(0.0d);
                        T t5 = printOrderViewModel.f10902m;
                        t5.getClass();
                        t5.j(null, dValueOf);
                        Double dValueOf2 = Double.valueOf(0.0d);
                        T t6 = printOrderViewModel.f10904o;
                        t6.getClass();
                        t6.j(null, dValueOf2);
                    }
                }
                return oVar;
            default:
                String it2 = (String) obj;
                kotlin.jvm.internal.o.f(it2, "it");
                String strF0 = W3.j.F0(6, it2);
                printOrderViewModel.getClass();
                T t7 = printOrderViewModel.u;
                t7.getClass();
                t7.j(null, strF0);
                return oVar;
        }
    }
}
