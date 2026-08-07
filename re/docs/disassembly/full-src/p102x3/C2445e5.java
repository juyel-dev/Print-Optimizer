package p102x3;

import B3.o;
import O3.c;
import O3.e;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambda;
import com.notescrafter.utils.ExamItem;
import p107y3.b;

/* JADX INFO: renamed from: x3.e5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2445e5 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14957o;
    public final /* synthetic */ int p;
    public final /* synthetic */ Object q;

    public /* synthetic */ C2445e5(Object obj, int i5, int i6) {
        this.f14957o = i6;
        this.q = obj;
        this.p = i5;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.f14957o) {
            case 0:
                num.intValue();
                AbstractC2493h5.a((C2429d5) this.q, composer, RecomposeScopeImplKt.updateChangedFlags(this.p | 1));
                break;
            case 1:
                num.intValue();
                AbstractC2574m6.f((C2693te) this.q, composer, RecomposeScopeImplKt.updateChangedFlags(this.p | 1));
                break;
            case 2:
                num.intValue();
                Rb.m((Ld) this.q, composer, RecomposeScopeImplKt.updateChangedFlags(this.p | 1));
                break;
            case 3:
                num.intValue();
                Ud.a((c) this.q, composer, RecomposeScopeImplKt.updateChangedFlags(this.p | 1));
                break;
            case 4:
                num.intValue();
                Ye.c((ExamItem) this.q, composer, RecomposeScopeImplKt.updateChangedFlags(this.p | 1));
                break;
            default:
                num.getClass();
                b.a((ComposableLambda) this.q, composer, RecomposeScopeImplKt.updateChangedFlags(this.p | 1));
                break;
        }
        return o.f154a;
    }
}
