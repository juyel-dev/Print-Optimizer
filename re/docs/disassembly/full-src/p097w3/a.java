package p097w3;

import B3.o;
import M0.b;
import O3.c;
import O3.e;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import com.notescrafter.PrintOrderViewModel;
import com.razorpay.AppSignatureHelper;
import java.util.List;
import p087u3.m;
import p087u3.t;
import p092v3.h;
import p102x3.AbstractC2397b5;
import p102x3.AbstractC2598ne;
import p102x3.AbstractC2684t5;
import p102x3.F3;
import p102x3.Gd;
import p102x3.Qd;
import p102x3.Rb;
import p102x3.Ye;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13608o;
    public final /* synthetic */ int p;
    public final /* synthetic */ Object q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f13609r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f13610s;

    public /* synthetic */ a(c cVar, h hVar, Modifier modifier, int i5) {
        this.f13608o = 8;
        this.f13609r = cVar;
        this.q = hVar;
        this.f13610s = modifier;
        this.p = i5;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.f13608o) {
            case 0:
                num.getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.p | 1);
                f.a((Modifier) this.f13610s, (String) this.q, (c) this.f13609r, composer, iUpdateChangedFlags);
                break;
            case 1:
                num.intValue();
                F3.b((O3.a) this.q, (O3.a) this.f13609r, (O3.a) this.f13610s, composer, RecomposeScopeImplKt.updateChangedFlags(this.p | 1));
                break;
            case 2:
                num.getClass();
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.p | 1);
                AbstractC2397b5.a((String) this.q, (O3.a) this.f13609r, (Modifier) this.f13610s, composer, iUpdateChangedFlags2);
                break;
            case 3:
                num.getClass();
                int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(this.p | 1);
                AbstractC2684t5.d((String) this.q, (ImageVector) this.f13609r, (Modifier) this.f13610s, composer, iUpdateChangedFlags3);
                break;
            case 4:
                num.getClass();
                int iUpdateChangedFlags4 = RecomposeScopeImplKt.updateChangedFlags(this.p | 1);
                Rb.o((String) this.q, (h) this.f13609r, (Modifier) this.f13610s, composer, iUpdateChangedFlags4);
                break;
            case 5:
                num.getClass();
                int iUpdateChangedFlags5 = RecomposeScopeImplKt.updateChangedFlags(this.p | 1);
                Gd.f((m) this.q, (PrintOrderViewModel) this.f13609r, (Modifier) this.f13610s, composer, iUpdateChangedFlags5);
                break;
            case 6:
                num.intValue();
                Gd.h((O3.a) this.q, (c) this.f13609r, (O3.a) this.f13610s, composer, RecomposeScopeImplKt.updateChangedFlags(this.p | 1));
                break;
            case 7:
                num.getClass();
                int iUpdateChangedFlags6 = RecomposeScopeImplKt.updateChangedFlags(this.p | 1);
                Qd.c((t) this.q, (b) this.f13609r, (Modifier) this.f13610s, composer, iUpdateChangedFlags6);
                break;
            case 8:
                num.getClass();
                int iUpdateChangedFlags7 = RecomposeScopeImplKt.updateChangedFlags(this.p | 1);
                AbstractC2598ne.b((c) this.f13609r, (h) this.q, (Modifier) this.f13610s, composer, iUpdateChangedFlags7);
                break;
            case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                num.getClass();
                AbstractC2598ne.c((String) this.q, (Modifier) this.f13610s, (ComposableLambda) this.f13609r, composer, RecomposeScopeImplKt.updateChangedFlags(this.p | 1));
                break;
            default:
                num.intValue();
                Ye.d((List) this.q, (O3.a) this.f13610s, (c) this.f13609r, composer, RecomposeScopeImplKt.updateChangedFlags(this.p | 1));
                break;
        }
        return o.f154a;
    }

    public /* synthetic */ a(Object obj, Object obj2, B3.c cVar, int i5, int i6) {
        this.f13608o = i6;
        this.q = obj;
        this.f13610s = obj2;
        this.f13609r = cVar;
        this.p = i5;
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i5, int i6) {
        this.f13608o = i6;
        this.q = obj;
        this.f13609r = obj2;
        this.f13610s = obj3;
        this.p = i5;
    }
}
