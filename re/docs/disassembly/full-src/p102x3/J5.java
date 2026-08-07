package p102x3;

import B3.o;
import O3.a;
import O3.e;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class J5 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14105o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f14106r;

    public /* synthetic */ J5(int i5, boolean z3, int i6, Object obj) {
        this.f14105o = i6;
        this.p = obj;
        this.q = z3;
        this.f14106r = i5;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.f14105o) {
            case 0:
                num.getClass();
                AbstractC2494h6.a(RecomposeScopeImplKt.updateChangedFlags(this.f14106r | 1), (a) this.p, composer, this.q);
                break;
            case 1:
                num.getClass();
                AbstractC2447e7.a(RecomposeScopeImplKt.updateChangedFlags(this.f14106r | 1), (a) this.p, composer, this.q);
                break;
            case 2:
                num.getClass();
                AbstractC2782z7.b(RecomposeScopeImplKt.updateChangedFlags(this.f14106r | 1), (a) this.p, composer, this.q);
                break;
            case 3:
                num.getClass();
                AbstractC2416c8.a(RecomposeScopeImplKt.updateChangedFlags(this.f14106r | 1), (a) this.p, composer, this.q);
                break;
            case 4:
                num.getClass();
                AbstractC2783z8.a(RecomposeScopeImplKt.updateChangedFlags(this.f14106r | 1), (a) this.p, composer, this.q);
                break;
            case 5:
                num.getClass();
                Q8.b(RecomposeScopeImplKt.updateChangedFlags(this.f14106r | 1), (a) this.p, composer, this.q);
                break;
            case 6:
                num.getClass();
                AbstractC2545k9.a(RecomposeScopeImplKt.updateChangedFlags(this.f14106r | 1), (a) this.p, composer, this.q);
                break;
            case 7:
                num.getClass();
                C9.a(RecomposeScopeImplKt.updateChangedFlags(this.f14106r | 1), (a) this.p, composer, this.q);
                break;
            case 8:
                num.getClass();
                Z9.a(RecomposeScopeImplKt.updateChangedFlags(this.f14106r | 1), (a) this.p, composer, this.q);
                break;
            default:
                num.intValue();
                AbstractC2583n.c((G6) this.p, this.q, composer, RecomposeScopeImplKt.updateChangedFlags(this.f14106r | 1));
                break;
        }
        return o.f154a;
    }
}
