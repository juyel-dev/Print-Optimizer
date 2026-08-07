package p102x3;

import B3.o;
import C3.u;
import C3.v;
import C3.w;
import O3.a;
import O3.c;
import T3.e;
import W3.q;
import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import java.util.ArrayList;
import java.util.List;
import p087u3.g;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Pa implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14293o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f14294r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f14295s;
    public final /* synthetic */ Object t;

    public /* synthetic */ Pa(Object obj, Object obj2, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, int i5) {
        this.f14293o = i5;
        this.f14295s = obj;
        this.t = obj2;
        this.p = mutableState;
        this.q = mutableState2;
        this.f14294r = mutableState3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.a
    public final Object invoke() {
        switch (this.f14293o) {
            case 0:
                MutableState mutableState = this.p;
                Integer numZ = q.Z((String) mutableState.getValue());
                MutableState mutableState2 = this.q;
                Integer numZ2 = q.Z((String) mutableState2.getValue());
                if (numZ != null && numZ2 != null) {
                    List list = (List) this.f14295s;
                    if (new e(1, list.size(), 1).i(numZ.intValue()) && new e(1, list.size(), 1).i(numZ2.intValue()) && !numZ.equals(numZ2)) {
                        ArrayList arrayListJ0 = u.J0(list);
                        arrayListJ0.add(numZ2.intValue() - 1, (g) arrayListJ0.remove(numZ.intValue() - 1));
                        ArrayList arrayList = new ArrayList(w.Y(arrayListJ0));
                        int i5 = 0;
                        for (Object obj : arrayListJ0) {
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                v.X();
                                throw null;
                            }
                            arrayList.add(g.copy$default((g) obj, i5, null, false, null, 0, null, null, 126, null));
                            i5 = i6;
                        }
                        ((c) this.t).invoke(arrayList);
                    }
                }
                this.f14294r.setValue(Boolean.FALSE);
                mutableState.setValue("");
                mutableState2.setValue("");
                return o.f154a;
            default:
                AbstractC2595nb.e(this.p, false);
                this.q.setValue(Boolean.FALSE);
                this.f14294r.setValue("");
                ((a) this.f14295s).invoke();
                Toast.makeText((Context) this.t, "Phone verified successfully!", 0).show();
                return o.f154a;
        }
    }
}
