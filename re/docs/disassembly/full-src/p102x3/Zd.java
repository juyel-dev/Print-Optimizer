package p102x3;

import B3.o;
import C3.u;
import O3.a;
import O3.c;
import androidx.compose.runtime.MutableState;
import java.util.ArrayList;
import java.util.List;
import p087u3.f;

/* JADX INFO: loaded from: classes2.dex */
public final class Zd implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14755o;
    public final /* synthetic */ int p;
    public final /* synthetic */ c q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f14756r;

    public /* synthetic */ Zd(int i5, c cVar, MutableState mutableState, int i6) {
        this.f14755o = i6;
        this.p = i5;
        this.q = cVar;
        this.f14756r = mutableState;
    }

    @Override // O3.a
    public final Object invoke() {
        switch (this.f14755o) {
            case 0:
                int i5 = this.p;
                if (i5 > 0) {
                    MutableState mutableState = this.f14756r;
                    ArrayList arrayListJ0 = u.J0((List) mutableState.getValue());
                    arrayListJ0.add(i5 - 1, (f) arrayListJ0.remove(i5));
                    mutableState.setValue(arrayListJ0);
                    this.q.invoke(arrayListJ0);
                }
                break;
            default:
                MutableState mutableState2 = this.f14756r;
                int size = ((List) mutableState2.getValue()).size() - 1;
                int i6 = this.p;
                if (i6 < size) {
                    ArrayList arrayListJ1 = u.J0((List) mutableState2.getValue());
                    arrayListJ1.add(i6 + 1, (f) arrayListJ1.remove(i6));
                    mutableState2.setValue(arrayListJ1);
                    this.q.invoke(arrayListJ1);
                }
                break;
        }
        return o.f154a;
    }
}
