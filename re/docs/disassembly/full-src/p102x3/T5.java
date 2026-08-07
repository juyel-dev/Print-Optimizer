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
public final /* synthetic */ class T5 implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14448o;
    public final /* synthetic */ int p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f14449r;

    public /* synthetic */ T5(int i5, MutableState mutableState, MutableState mutableState2, int i6) {
        this.f14448o = i6;
        this.p = i5;
        this.q = mutableState;
        this.f14449r = mutableState2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.a
    public final Object invoke() {
        switch (this.f14448o) {
            case 0:
                int i5 = this.p;
                if (i5 > 0) {
                    MutableState mutableState = this.q;
                    ArrayList arrayListJ0 = u.J0((List) mutableState.getValue());
                    arrayListJ0.add(i5 - 1, (C2438de) arrayListJ0.remove(i5));
                    mutableState.setValue(arrayListJ0);
                    ((MutableState) this.f14449r).setValue(null);
                }
                return o.f154a;
            case 1:
                MutableState mutableState2 = this.q;
                int size = ((List) mutableState2.getValue()).size() - 1;
                int i6 = this.p;
                if (i6 < size) {
                    ArrayList arrayListJ1 = u.J0((List) mutableState2.getValue());
                    arrayListJ1.add(i6 + 1, (C2438de) arrayListJ1.remove(i6));
                    mutableState2.setValue(arrayListJ1);
                    ((MutableState) this.f14449r).setValue(null);
                }
                return o.f154a;
            case 2:
                MutableState mutableState3 = this.q;
                List list = (List) mutableState3.getValue();
                ArrayList arrayList = new ArrayList();
                int i7 = 0;
                for (Object obj : list) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        v.X();
                        throw null;
                    }
                    if (i7 != this.p) {
                        arrayList.add(obj);
                    }
                    i7 = i8;
                }
                mutableState3.setValue(arrayList);
                ((MutableState) this.f14449r).setValue(null);
                return o.f154a;
            case 3:
                MutableState mutableState4 = this.q;
                EnumC2386aa enumC2386aa = (EnumC2386aa) mutableState4.getValue();
                MutableState mutableState5 = (MutableState) this.f14449r;
                Ja.g(enumC2386aa, ((Number) mutableState5.getValue()).intValue(), this.p, new C2721va(0, mutableState4, mutableState5));
                return o.f154a;
            default:
                ((c) this.f14449r).invoke(Integer.valueOf(this.p));
                this.q.setValue(Boolean.FALSE);
                return o.f154a;
        }
    }

    public /* synthetic */ T5(c cVar, int i5, MutableState mutableState) {
        this.f14448o = 4;
        this.f14449r = cVar;
        this.p = i5;
        this.q = mutableState;
    }
}
