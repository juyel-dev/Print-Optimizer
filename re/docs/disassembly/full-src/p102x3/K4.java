package p102x3;

import B3.o;
import C3.u;
import O3.a;
import O3.c;
import W3.j;
import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import java.util.ArrayList;
import p087u3.e;
import p087u3.q;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class K4 implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14121o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ Object q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f14122r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f14123s;

    public /* synthetic */ K4(int i5, Object obj, Object obj2, Object obj3, boolean z3) {
        this.f14121o = i5;
        this.p = z3;
        this.q = obj;
        this.f14122r = obj2;
        this.f14123s = obj3;
    }

    @Override // O3.a
    public final Object invoke() {
        switch (this.f14121o) {
            case 0:
                if (!this.p) {
                    ((c) this.q).invoke(e.copy$default((e) this.f14122r, null, null, (p087u3.c) this.f14123s, 0, 0, false, false, 123, null));
                }
                break;
            case 1:
                if (this.p) {
                    ((MutableState) this.f14122r).setValue(null);
                    ((MutableState) this.f14123s).setValue(Boolean.TRUE);
                } else {
                    Toast.makeText((Context) this.q, "Please verify your mobile number first.", 1).show();
                }
                break;
            default:
                if (this.p) {
                    ((a) this.q).invoke();
                } else {
                    ArrayList arrayList = new ArrayList();
                    q qVar = (q) this.f14122r;
                    if (j.m0(qVar.getFirstName()) || j.m0(qVar.getLastName())) {
                        arrayList.add("Name");
                    }
                    if (j.m0(qVar.getPhone())) {
                        arrayList.add("Phone Verification");
                    }
                    if (j.m0(qVar.getFlatHouse())) {
                        arrayList.add("Flat/House");
                    }
                    if (j.m0(qVar.getAreaStreet())) {
                        arrayList.add("Area/Street");
                    }
                    if (j.m0(qVar.getCity())) {
                        arrayList.add("City");
                    }
                    if (j.m0(qVar.getState())) {
                        arrayList.add("State");
                    }
                    if (qVar.getPostalCode().length() != 6) {
                        arrayList.add("Valid Pincode");
                    }
                    Toast.makeText((Context) this.f14123s, "Please provide: ".concat(u.v0(arrayList, ", ", null, null, null, 62)), 0).show();
                }
                break;
        }
        return o.f154a;
    }
}
