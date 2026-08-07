package p102x3;

import B3.o;
import C3.u;
import C3.v;
import O3.a;
import O3.c;
import androidx.compose.runtime.MutableState;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class J8 implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14110o;
    public final /* synthetic */ int p;
    public final /* synthetic */ Object q;

    public /* synthetic */ J8(int i5, int i6, MutableState mutableState) {
        this.f14110o = i6;
        this.p = i5;
        this.q = mutableState;
    }

    @Override // O3.a
    public final Object invoke() {
        switch (this.f14110o) {
            case 0:
                MutableState mutableState = (MutableState) this.q;
                ArrayList arrayListJ0 = u.J0((List) mutableState.getValue());
                int i5 = this.p;
                C6 c6 = (C6) arrayListJ0.get(i5);
                int i6 = i5 - 1;
                arrayListJ0.set(i5, arrayListJ0.get(i6));
                arrayListJ0.set(i6, c6);
                mutableState.setValue(arrayListJ0);
                return o.f154a;
            case 1:
                MutableState mutableState2 = (MutableState) this.q;
                ArrayList arrayListJ1 = u.J0((List) mutableState2.getValue());
                int i7 = this.p;
                C6 c7 = (C6) arrayListJ1.get(i7);
                int i8 = i7 + 1;
                arrayListJ1.set(i7, arrayListJ1.get(i8));
                arrayListJ1.set(i8, c7);
                mutableState2.setValue(arrayListJ1);
                return o.f154a;
            case 2:
                MutableState mutableState3 = (MutableState) this.q;
                List list = (List) mutableState3.getValue();
                ArrayList arrayList = new ArrayList();
                int i9 = 0;
                for (Object obj : list) {
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        v.X();
                        throw null;
                    }
                    if (i9 != this.p) {
                        arrayList.add(obj);
                    }
                    i9 = i10;
                }
                mutableState3.setValue(arrayList);
                return o.f154a;
            case 3:
                MutableState mutableState4 = (MutableState) this.q;
                ArrayList arrayListJ2 = u.J0((List) mutableState4.getValue());
                int i11 = this.p;
                D6 d6 = (D6) arrayListJ2.get(i11);
                arrayListJ2.set(i11, D6.a(d6, null, 0, !d6.f13862d, 23));
                mutableState4.setValue(arrayListJ2);
                return o.f154a;
            default:
                ((c) this.q).invoke(Integer.valueOf(this.p));
                return o.f154a;
        }
    }

    public /* synthetic */ J8(Object obj, int i5, int i6) {
        this.f14110o = i6;
        this.q = obj;
        this.p = i5;
    }
}
