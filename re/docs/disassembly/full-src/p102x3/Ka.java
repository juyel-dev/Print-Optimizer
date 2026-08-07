package p102x3;

import B3.o;
import O3.a;
import O3.c;
import O3.e;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Ka implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14137o;
    public final /* synthetic */ List p;
    public final /* synthetic */ c q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f14138r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f14139s;
    public final /* synthetic */ a t;
    public final /* synthetic */ Modifier u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f14140v;

    public /* synthetic */ Ka(List list, c cVar, c cVar2, a aVar, a aVar2, Modifier modifier, int i5, int i6) {
        this.f14137o = i6;
        this.p = list;
        this.q = cVar;
        this.f14138r = cVar2;
        this.f14139s = aVar;
        this.t = aVar2;
        this.u = modifier;
        this.f14140v = i5;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14137o) {
            case 0:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f14140v | 1);
                a aVar = this.t;
                Modifier modifier = this.u;
                Ua.b(this.p, this.q, this.f14138r, this.f14139s, aVar, modifier, (Composer) obj, iUpdateChangedFlags);
                break;
            default:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.f14140v | 1);
                a aVar2 = this.t;
                Modifier modifier2 = this.u;
                AbstractC2406be.a(this.p, this.q, this.f14138r, this.f14139s, aVar2, modifier2, (Composer) obj, iUpdateChangedFlags2);
                break;
        }
        return o.f154a;
    }
}
