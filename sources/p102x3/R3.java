package p102x3;

import C3.u;
import O3.a;
import O3.c;
import androidx.compose.runtime.MutableState;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.o;
import p087u3.f;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class R3 implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14348o;
    public final /* synthetic */ c p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f14349r;

    public /* synthetic */ R3(c cVar, MutableState mutableState, MutableState mutableState2, int i5) {
        this.f14348o = i5;
        this.p = cVar;
        this.q = mutableState;
        this.f14349r = mutableState2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.a
    public final Object invoke() {
        switch (this.f14348o) {
            case 0:
                MutableState mutableState = this.q;
                File file = (File) mutableState.getValue();
                o.c(file);
                this.p.invoke(file);
                MutableState mutableState2 = this.f14349r;
                List list = (List) mutableState2.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!o.b(((H3) obj).f14014a, file)) {
                        arrayList.add(obj);
                    }
                }
                mutableState2.setValue(arrayList);
                mutableState.setValue(null);
                break;
            default:
                MutableState mutableState3 = this.q;
                ArrayList arrayListJ0 = u.J0((List) mutableState3.getValue());
                MutableState mutableState4 = this.f14349r;
                H.a(arrayListJ0).remove((f) mutableState4.getValue());
                mutableState3.setValue(arrayListJ0);
                this.p.invoke(arrayListJ0);
                mutableState4.setValue(null);
                break;
        }
        return B3.o.f154a;
    }
}
