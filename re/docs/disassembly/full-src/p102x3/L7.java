package p102x3;

import B3.o;
import O3.a;
import X3.A;
import X3.InterfaceC0200y;
import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.MutableState;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class L7 implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14163o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f14164r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0200y f14165s;
    public final /* synthetic */ Context t;
    public final /* synthetic */ MutableState u;

    public /* synthetic */ L7(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, InterfaceC0200y interfaceC0200y, Context context, MutableState mutableState4, int i5) {
        this.f14163o = i5;
        this.p = mutableState;
        this.q = mutableState2;
        this.f14164r = mutableState3;
        this.f14165s = interfaceC0200y;
        this.t = context;
        this.u = mutableState4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.a
    public final Object invoke() {
        switch (this.f14163o) {
            case 0:
                MutableState mutableState = this.p;
                int iIntValue = ((Number) mutableState.getValue()).intValue();
                int i5 = iIntValue - 1;
                Uri uri = (Uri) this.q.getValue();
                if (uri != null && i5 >= 1 && i5 <= AbstractC2416c8.b(this.f14164r)) {
                    mutableState.setValue(Integer.valueOf(i5));
                    A.t(this.f14165s, null, null, new V7(this.t, uri, iIntValue - 2, this.u, null), 3);
                }
                break;
            case 1:
                MutableState mutableState2 = this.p;
                int iIntValue2 = ((Number) mutableState2.getValue()).intValue();
                int i6 = iIntValue2 + 1;
                Uri uri2 = (Uri) this.q.getValue();
                if (uri2 != null && i6 >= 1 && i6 <= AbstractC2416c8.b(this.f14164r)) {
                    mutableState2.setValue(Integer.valueOf(i6));
                    A.t(this.f14165s, null, null, new V7(this.t, uri2, iIntValue2, this.u, null), 3);
                }
                break;
            case 2:
                MutableState mutableState3 = this.p;
                int iIntValue3 = ((Number) mutableState3.getValue()).intValue();
                int i7 = iIntValue3 - 1;
                Uri uri3 = (Uri) this.q.getValue();
                if (uri3 != null && i7 >= 1 && i7 <= AbstractC2783z8.b(this.f14164r)) {
                    mutableState3.setValue(Integer.valueOf(i7));
                    A.t(this.f14165s, null, null, new C2687t8(this.t, uri3, iIntValue3 - 2, this.u, null), 3);
                }
                break;
            default:
                MutableState mutableState4 = this.p;
                int iIntValue4 = ((Number) mutableState4.getValue()).intValue();
                int i8 = iIntValue4 + 1;
                Uri uri4 = (Uri) this.q.getValue();
                if (uri4 != null && i8 >= 1 && i8 <= AbstractC2783z8.b(this.f14164r)) {
                    mutableState4.setValue(Integer.valueOf(i8));
                    A.t(this.f14165s, null, null, new C2687t8(this.t, uri4, iIntValue4, this.u, null), 3);
                }
                break;
        }
        return o.f154a;
    }
}
