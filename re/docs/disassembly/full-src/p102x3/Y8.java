package p102x3;

import B3.o;
import C3.u;
import O3.a;
import androidx.compose.runtime.MutableState;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Y8 implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14709o;
    public final /* synthetic */ int p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f14710r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f14711s;

    public /* synthetic */ Y8(int i5, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, int i6) {
        this.f14709o = i6;
        this.p = i5;
        this.q = mutableState;
        this.f14710r = mutableState2;
        this.f14711s = mutableState3;
    }

    @Override // O3.a
    public final Object invoke() {
        switch (this.f14709o) {
            case 0:
                MutableState mutableState = this.q;
                ArrayList arrayListJ0 = u.J0((List) mutableState.getValue());
                int i5 = this.p;
                D6 d6 = (D6) arrayListJ0.get(i5);
                arrayListJ0.set(i5, D6.a(d6, null, (d6.f13861c + 90) % 360, false, 27));
                mutableState.setValue(arrayListJ0);
                this.f14710r.setValue(null);
                this.f14711s.setValue(null);
                break;
            case 1:
                int i6 = this.p;
                if (i6 > 0) {
                    MutableState mutableState2 = this.q;
                    ArrayList arrayListJ1 = u.J0((List) mutableState2.getValue());
                    arrayListJ1.add(i6 - 1, (D6) arrayListJ1.remove(i6));
                    mutableState2.setValue(arrayListJ1);
                    this.f14710r.setValue(null);
                    this.f14711s.setValue(null);
                }
                break;
            case 2:
                MutableState mutableState3 = this.q;
                int size = ((List) mutableState3.getValue()).size() - 1;
                int i7 = this.p;
                if (i7 < size) {
                    ArrayList arrayListJ2 = u.J0((List) mutableState3.getValue());
                    arrayListJ2.add(i7 + 1, (D6) arrayListJ2.remove(i7));
                    mutableState3.setValue(arrayListJ2);
                    this.f14710r.setValue(null);
                    this.f14711s.setValue(null);
                }
                break;
            default:
                MutableState mutableState4 = this.q;
                ArrayList arrayListJ3 = u.J0((List) mutableState4.getValue());
                arrayListJ3.remove(this.p);
                mutableState4.setValue(arrayListJ3);
                this.f14710r.setValue(null);
                this.f14711s.setValue(null);
                break;
        }
        return o.f154a;
    }
}
