package p083t3;

import B3.o;
import O3.a;
import O3.c;
import O3.e;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import p097w3.h;
import p102x3.A6;
import p102x3.AbstractC2574m6;
import p102x3.AbstractC2583n;
import p102x3.C2627pb;
import p102x3.C2646qe;
import p102x3.D5;
import p102x3.Rb;
import p102x3.Rd;
import p102x3.Ud;
import p102x3.r;

/* JADX INFO: renamed from: t3.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2292j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13182o;
    public final /* synthetic */ int p;
    public final /* synthetic */ Object q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f13183r;

    public /* synthetic */ C2292j(int i5, int i6, Object obj, Object obj2) {
        this.f13182o = i6;
        this.q = obj;
        this.f13183r = obj2;
        this.p = i5;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.f13182o) {
            case 0:
                num.intValue();
                S.e((String) this.q, (c) this.f13183r, composer, RecomposeScopeImplKt.updateChangedFlags(this.p | 1));
                break;
            case 1:
                num.getClass();
                h.a((Modifier) this.q, (ComposableLambda) this.f13183r, composer, RecomposeScopeImplKt.updateChangedFlags(this.p | 1));
                break;
            case 2:
                num.intValue();
                AbstractC2583n.b((String) this.q, (p092v3.h) this.f13183r, composer, RecomposeScopeImplKt.updateChangedFlags(this.p | 1));
                break;
            case 3:
                num.intValue();
                r.c((C2646qe) this.q, (a) this.f13183r, composer, RecomposeScopeImplKt.updateChangedFlags(this.p | 1));
                break;
            case 4:
                num.getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.p | 1);
                D5.b((Modifier) this.q, (c) this.f13183r, composer, iUpdateChangedFlags);
                break;
            case 5:
                num.getClass();
                AbstractC2574m6.b((String) this.q, (Modifier) this.f13183r, composer, RecomposeScopeImplKt.updateChangedFlags(this.p | 1));
                break;
            case 6:
                num.intValue();
                A6.e((ImageVector) this.q, (a) this.f13183r, composer, RecomposeScopeImplKt.updateChangedFlags(this.p | 1));
                break;
            case 7:
                num.getClass();
                Rb.e((C2627pb) this.q, (Modifier) this.f13183r, composer, RecomposeScopeImplKt.updateChangedFlags(this.p | 1));
                break;
            default:
                num.intValue();
                Ud.b((Rd) this.q, (a) this.f13183r, composer, RecomposeScopeImplKt.updateChangedFlags(this.p | 1));
                break;
        }
        return o.f154a;
    }

    public /* synthetic */ C2292j(Modifier modifier, c cVar, int i5) {
        this.f13182o = 4;
        this.f13183r = cVar;
        this.q = modifier;
        this.p = i5;
    }
}
