package p102x3;

import A2.t;
import B3.o;
import O3.a;
import W3.j;
import X3.A;
import X3.H;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.Q;
import com.notescrafter.PrintOrderViewModel;
import e4.d;
import e4.e;
import p083t3.C2306q;
import p083t3.N0;
import p083t3.P0;
import p087u3.q;
import p087u3.v;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Za implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14750o;
    public final /* synthetic */ PrintOrderViewModel p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f14751r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f14752s;
    public final /* synthetic */ MutableState t;

    public /* synthetic */ Za(PrintOrderViewModel printOrderViewModel, MutableState mutableState, MutableState mutableState2, Context context, MutableState mutableState3, int i5) {
        this.f14750o = i5;
        this.p = printOrderViewModel;
        this.q = mutableState;
        this.f14751r = mutableState2;
        this.f14752s = context;
        this.t = mutableState3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.a
    public final Object invoke() {
        String string;
        String str;
        o oVar = o.f154a;
        MutableState mutableState = this.t;
        Context context = this.f14752s;
        MutableState mutableState2 = this.f14751r;
        MutableState mutableState3 = this.q;
        switch (this.f14750o) {
            case 0:
                if (((String) mutableState3.getValue()).length() == 10) {
                    AbstractC2595nb.e(mutableState2, true);
                    String phone = (String) mutableState3.getValue();
                    C2306q c2306q = new C2306q(context, mutableState2, mutableState, 5);
                    Va va = new Va(context, mutableState2, 1);
                    PrintOrderViewModel printOrderViewModel = this.p;
                    printOrderViewModel.getClass();
                    kotlin.jvm.internal.o.f(phone, "phone");
                    p019e0.a aVarH = Q.h(printOrderViewModel);
                    e eVar = H.f1766a;
                    A.t(aVarH, d.f11107o, null, new P0(printOrderViewModel, phone, c2306q, va, null), 2);
                }
                return oVar;
            default:
                mutableState3.setValue(Boolean.TRUE);
                Integer shippingAddressId = ((q) mutableState2.getValue()).getShippingAddressId();
                if (shippingAddressId == null || (string = shippingAddressId.toString()) == null) {
                    string = "";
                }
                String str2 = string;
                String firstName = ((q) mutableState2.getValue()).getFirstName();
                String lastName = ((q) mutableState2.getValue()).getLastName();
                String string2 = j.I0(((q) mutableState2.getValue()).getFirstName() + " " + ((q) mutableState2.getValue()).getLastName()).toString();
                String phone2 = ((q) mutableState2.getValue()).getPhone();
                String flatHouse = ((q) mutableState2.getValue()).getFlatHouse();
                String areaStreet = ((q) mutableState2.getValue()).getAreaStreet();
                String landmark = ((q) mutableState2.getValue()).getLandmark();
                String city = ((q) mutableState2.getValue()).getCity();
                String state = ((q) mutableState2.getValue()).getState();
                String postalCode = ((q) mutableState2.getValue()).getPostalCode();
                int i5 = AbstractC2565ld.f15297a[((q) mutableState2.getValue()).getAddressType().ordinal()];
                if (i5 == 1) {
                    str = "Home";
                } else if (i5 == 2) {
                    str = "Work";
                } else {
                    if (i5 != 3) {
                        throw new t();
                    }
                    str = "Temporary";
                }
                v vVar = new v(str2, firstName, lastName, string2, phone2, flatHouse, areaStreet, landmark, city, state, postalCode, str, 1, 0);
                R4 r4 = new R4(context, mutableState3, mutableState);
                PrintOrderViewModel printOrderViewModel2 = this.p;
                printOrderViewModel2.getClass();
                p019e0.a aVarH2 = Q.h(printOrderViewModel2);
                e eVar2 = H.f1766a;
                A.t(aVarH2, d.f11107o, null, new N0(printOrderViewModel2, vVar, r4, null), 2);
                return oVar;
        }
    }
}
