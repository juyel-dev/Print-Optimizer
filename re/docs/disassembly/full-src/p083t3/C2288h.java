package p083t3;

import B3.o;
import M0.b;
import O3.a;
import O3.e;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.notescrafter.PrintOrderViewModel;
import p092v3.h;
import p102x3.Gd;
import p102x3.H3;
import p102x3.Kd;
import p102x3.X3;

/* JADX INFO: renamed from: t3.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2288h implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13172o;
    public final /* synthetic */ int p;
    public final /* synthetic */ Object q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f13173r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f13174s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f13175v;

    public /* synthetic */ C2288h(PrintOrderViewModel printOrderViewModel, String str, a aVar, a aVar2, a aVar3, Modifier modifier, int i5) {
        this.f13172o = 2;
        this.f13175v = printOrderViewModel;
        this.q = str;
        this.f13173r = aVar;
        this.f13174s = aVar2;
        this.t = aVar3;
        this.u = modifier;
        this.p = i5;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13172o) {
            case 0:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.p | 1);
                h hVar = (h) this.u;
                PrintOrderViewModel printOrderViewModel = (PrintOrderViewModel) this.f13175v;
                S.b((SnackbarHostState) this.q, (p036i2.e) this.f13173r, (b) this.f13174s, (b) this.t, hVar, printOrderViewModel, (Composer) obj, iUpdateChangedFlags);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.p | 1);
                a aVar = (a) this.u;
                Modifier modifier = (Modifier) this.f13175v;
                X3.a((H3) this.q, (a) this.f13173r, (a) this.f13174s, (a) this.t, aVar, modifier, (Composer) obj, iUpdateChangedFlags2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(this.p | 1);
                a aVar2 = (a) this.t;
                Modifier modifier2 = (Modifier) this.u;
                Gd.k((PrintOrderViewModel) this.f13175v, (String) this.q, (a) this.f13173r, (a) this.f13174s, aVar2, modifier2, (Composer) obj, iUpdateChangedFlags3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags4 = RecomposeScopeImplKt.updateChangedFlags(this.p | 1);
                a aVar3 = (a) this.t;
                Modifier modifier3 = (Modifier) this.f13175v;
                Kd.a((String) this.q, (h) this.u, (a) this.f13173r, (a) this.f13174s, aVar3, modifier3, (Composer) obj, iUpdateChangedFlags4);
                break;
        }
        return o.f154a;
    }

    public /* synthetic */ C2288h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i5, int i6) {
        this.f13172o = i6;
        this.q = obj;
        this.f13173r = obj2;
        this.f13174s = obj3;
        this.t = obj4;
        this.u = obj5;
        this.f13175v = obj6;
        this.p = i5;
    }

    public /* synthetic */ C2288h(String str, h hVar, a aVar, a aVar2, a aVar3, Modifier modifier, int i5) {
        this.f13172o = 3;
        this.q = str;
        this.u = hVar;
        this.f13173r = aVar;
        this.f13174s = aVar2;
        this.t = aVar3;
        this.f13175v = modifier;
        this.p = i5;
    }
}
