package p102x3;

import B3.o;
import C3.v;
import C3.w;
import O3.a;
import O3.c;
import androidx.compose.runtime.MutableState;
import java.util.ArrayList;
import java.util.List;
import p087u3.g;

/* JADX INFO: loaded from: classes2.dex */
public final class Ta implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14456o = 1;
    public final /* synthetic */ int p;
    public final /* synthetic */ Object q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f14457r;

    public Ta(int i5, MutableState mutableState, MutableState mutableState2) {
        this.p = i5;
        this.q = mutableState;
        this.f14457r = mutableState2;
    }

    @Override // O3.a
    public final Object invoke() {
        switch (this.f14456o) {
            case 0:
                List list = (List) this.q;
                ArrayList arrayList = new ArrayList(w.Y(list));
                int i5 = 0;
                for (Object obj : list) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        v.X();
                        throw null;
                    }
                    g gVarCopy$default = (g) obj;
                    if (i5 == this.p) {
                        gVarCopy$default = g.copy$default(gVarCopy$default, 0, null, !gVarCopy$default.isSelected(), null, 0, null, null, 123, null);
                    }
                    arrayList.add(gVarCopy$default);
                    i5 = i6;
                }
                ((c) this.f14457r).invoke(arrayList);
                return o.f154a;
            default:
                ((MutableState) this.q).setValue(Integer.valueOf(this.p));
                ((MutableState) this.f14457r).setValue(Boolean.TRUE);
                return o.f154a;
        }
    }

    public Ta(List list, c cVar, int i5) {
        this.q = list;
        this.f14457r = cVar;
        this.p = i5;
    }
}
