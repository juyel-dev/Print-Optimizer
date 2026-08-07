package p083t3;

import B3.o;
import O3.a;
import X3.A;
import X3.InterfaceC0200y;
import android.content.Context;
import p092v3.h;
import p102x3.C2502he;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class N implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13086o;
    public final /* synthetic */ InterfaceC0200y p;
    public final /* synthetic */ h q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Context f13087r;

    public /* synthetic */ N(InterfaceC0200y interfaceC0200y, h hVar, Context context, int i5) {
        this.f13086o = i5;
        this.p = interfaceC0200y;
        this.q = hVar;
        this.f13087r = context;
    }

    @Override // O3.a
    public final Object invoke() {
        switch (this.f13086o) {
            case 0:
                A.t(this.p, null, null, new P(this.q, this.f13087r, null), 3);
                break;
            default:
                A.t(this.p, null, null, new C2502he(this.q, this.f13087r, null), 3);
                break;
        }
        return o.f154a;
    }
}
