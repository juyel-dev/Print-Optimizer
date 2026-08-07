package p102x3;

import B3.o;
import O3.a;
import O3.e;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.notescrafter.PrintOrderViewModel;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Xa implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14670o;
    public final /* synthetic */ PrintOrderViewModel p;
    public final /* synthetic */ a q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Modifier f14671r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f14672s;

    public /* synthetic */ Xa(PrintOrderViewModel printOrderViewModel, a aVar, Modifier modifier, int i5, int i6) {
        this.f14670o = i6;
        this.p = printOrderViewModel;
        this.q = aVar;
        this.f14671r = modifier;
        this.f14672s = i5;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        int i5 = this.f14670o;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i5) {
            case 0:
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f14672s | 1);
                AbstractC2595nb.d(this.p, this.q, this.f14671r, composer, iUpdateChangedFlags);
                break;
            default:
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.f14672s | 1);
                AbstractC2452ec.b(this.p, this.q, this.f14671r, composer, iUpdateChangedFlags2);
                break;
        }
        return o.f154a;
    }
}
