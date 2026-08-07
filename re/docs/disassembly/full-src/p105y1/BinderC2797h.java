package p105y1;

import android.content.Context;
import p090v1.AbstractBinderC2337b0;
import p090v1.t0;

/* JADX INFO: renamed from: y1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class BinderC2797h extends AbstractBinderC2337b0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Context f15936o;
    public final /* synthetic */ C2799j p;

    public BinderC2797h(C2799j c2799j, Context context) {
        this.f15936o = context;
        this.p = c2799j;
    }

    @Override // p090v1.InterfaceC2341d0
    public final void y0(t0 t0Var) {
        if (t0Var == null) {
            return;
        }
        this.p.getClass();
        C2799j.e(this.f15936o, t0Var.p, true, true);
    }
}
