package p102x3;

import B3.j;
import B3.k;
import B3.o;
import O3.c;
import X3.A;
import android.util.Log;
import androidx.lifecycle.Q;
import com.notescrafter.PrintOrderViewModel;
import java.util.List;
import p083t3.C2303o0;
import p087u3.e;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class M4 implements c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14191o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ Object q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f14192r;

    public /* synthetic */ M4(PrintOrderViewModel printOrderViewModel, boolean z3, String str) {
        this.f14191o = 2;
        this.q = printOrderViewModel;
        this.p = z3;
        this.f14192r = str;
    }

    @Override // O3.c
    public final Object invoke(Object obj) {
        switch (this.f14191o) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                if (!this.p) {
                    ((c) this.q).invoke(e.copy$default((e) this.f14192r, null, null, null, iIntValue, 0, false, false, 119, null));
                }
                break;
            case 1:
                int iIntValue2 = ((Integer) obj).intValue();
                if (!this.p) {
                    ((c) this.q).invoke(e.copy$default((e) this.f14192r, null, null, null, 0, iIntValue2, false, false, 111, null));
                }
                break;
            default:
                Object obj2 = ((k) obj).f150o;
                if (!(obj2 instanceof j)) {
                    PrintOrderViewModel printOrderViewModel = (PrintOrderViewModel) this.q;
                    A.t(Q.h(printOrderViewModel), null, null, new C2303o0(printOrderViewModel, (List) obj2, this.p, (String) this.f14192r, null), 3);
                }
                Throwable thA = k.a(obj2);
                if (thA != null) {
                    Log.e("PrintOrderViewModel", "Failed to fetch saved addresses", thA);
                }
                break;
        }
        return o.f154a;
    }

    public /* synthetic */ M4(boolean z3, c cVar, e eVar, int i5) {
        this.f14191o = i5;
        this.p = z3;
        this.q = cVar;
        this.f14192r = eVar;
    }
}
