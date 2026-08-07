package p102x3;

import B3.o;
import O3.a;
import O3.e;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;

/* JADX INFO: renamed from: x3.w4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2731w4 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15668o = 1;
    public final /* synthetic */ String p;
    public final /* synthetic */ boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Modifier f15669r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f15670s;
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ C2731w4(String str, String str2, boolean z3, Modifier modifier, int i5, int i6) {
        this.p = str;
        this.u = str2;
        this.q = z3;
        this.f15669r = modifier;
        this.f15670s = i5;
        this.t = i6;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15668o) {
            case 0:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f15670s | 1);
                Modifier modifier = this.f15669r;
                Z4.h(this.p, this.q, (a) this.u, modifier, (Composer) obj, iUpdateChangedFlags, this.t);
                break;
            default:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.f15670s | 1);
                String str = this.p;
                Modifier modifier2 = this.f15669r;
                Ee.a(str, (String) this.u, this.q, modifier2, (Composer) obj, iUpdateChangedFlags2, this.t);
                break;
        }
        return o.f154a;
    }

    public /* synthetic */ C2731w4(String str, boolean z3, a aVar, Modifier modifier, int i5, int i6) {
        this.p = str;
        this.q = z3;
        this.u = aVar;
        this.f15669r = modifier;
        this.f15670s = i5;
        this.t = i6;
    }
}
