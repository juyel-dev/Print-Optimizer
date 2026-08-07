package p102x3;

import B3.o;
import O3.a;
import O3.e;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.notescrafter.PrintOrderViewModel;

/* JADX INFO: renamed from: x3.ic, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2516ic implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15192o;
    public final /* synthetic */ PrintOrderViewModel p;
    public final /* synthetic */ String q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f15193r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f15194s;
    public final /* synthetic */ Modifier t;
    public final /* synthetic */ int u;

    public /* synthetic */ C2516ic(PrintOrderViewModel printOrderViewModel, String str, a aVar, a aVar2, Modifier modifier, int i5, int i6) {
        this.f15192o = i6;
        this.p = printOrderViewModel;
        this.q = str;
        this.f15193r = aVar;
        this.f15194s = aVar2;
        this.t = modifier;
        this.u = i5;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15192o) {
            case 0:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.u | 1);
                a aVar = this.f15194s;
                Modifier modifier = this.t;
                Gd.j(this.p, this.q, this.f15193r, aVar, modifier, (Composer) obj, iUpdateChangedFlags);
                break;
            default:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.u | 1);
                a aVar2 = this.f15194s;
                Modifier modifier2 = this.t;
                Gd.l(this.p, this.q, this.f15193r, aVar2, modifier2, (Composer) obj, iUpdateChangedFlags2);
                break;
        }
        return o.f154a;
    }
}
