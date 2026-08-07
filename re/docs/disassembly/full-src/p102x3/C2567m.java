package p102x3;

import B3.o;
import O3.a;
import O3.c;
import O3.e;
import android.graphics.RectF;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.notescrafter.PrintOrderViewModel;
import java.util.List;
import p087u3.v;
import p092v3.h;

/* JADX INFO: renamed from: x3.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2567m implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15299o;
    public final /* synthetic */ a p;
    public final /* synthetic */ Object q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f15300r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f15301s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    public /* synthetic */ C2567m(a aVar, c cVar, c cVar2, c cVar3, Modifier modifier, int i5) {
        this.f15299o = 1;
        this.p = aVar;
        this.f15301s = cVar;
        this.t = cVar2;
        this.u = cVar3;
        this.q = modifier;
        this.f15300r = i5;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15299o) {
            case 0:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f15300r | 1);
                Integer num = (Integer) this.t;
                a aVar = this.p;
                Modifier modifier = (Modifier) this.q;
                AbstractC2583n.a((String) this.f15301s, num, (h) this.u, aVar, modifier, (Composer) obj, iUpdateChangedFlags);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.f15300r | 1);
                c cVar = (c) this.u;
                Modifier modifier2 = (Modifier) this.q;
                X3.b(this.p, (c) this.f15301s, (c) this.t, cVar, modifier2, (Composer) obj, iUpdateChangedFlags2);
                break;
            case 2:
                ((Integer) obj2).intValue();
                AbstractC2684t5.e((String) this.f15301s, (String) this.t, (String) this.u, (List) this.q, this.p, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f15300r | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(this.f15300r | 1);
                a aVar2 = this.p;
                Modifier modifier3 = (Modifier) this.q;
                A6.a((e) this.f15301s, (c) this.t, (EnumC2422ce) this.u, aVar2, modifier3, (Composer) obj, iUpdateChangedFlags3);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags4 = RecomposeScopeImplKt.updateChangedFlags(this.f15300r | 1);
                a aVar3 = this.p;
                Modifier modifier4 = (Modifier) this.q;
                A6.c((List) this.f15301s, (RectF) this.t, (e) this.u, aVar3, modifier4, (Composer) obj, iUpdateChangedFlags4);
                break;
            default:
                ((Integer) obj2).intValue();
                AbstractC2595nb.c((v) this.t, (PrintOrderViewModel) this.u, (String) this.f15301s, this.p, (a) this.q, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f15300r | 1));
                break;
        }
        return o.f154a;
    }

    public /* synthetic */ C2567m(Object obj, Object obj2, Object obj3, a aVar, Modifier modifier, int i5, int i6) {
        this.f15299o = i6;
        this.f15301s = obj;
        this.t = obj2;
        this.u = obj3;
        this.p = aVar;
        this.q = modifier;
        this.f15300r = i5;
    }

    public /* synthetic */ C2567m(String str, String str2, String str3, List list, a aVar, int i5) {
        this.f15299o = 2;
        this.f15301s = str;
        this.t = str2;
        this.u = str3;
        this.q = list;
        this.p = aVar;
        this.f15300r = i5;
    }

    public /* synthetic */ C2567m(v vVar, PrintOrderViewModel printOrderViewModel, String str, a aVar, a aVar2, int i5) {
        this.f15299o = 5;
        this.t = vVar;
        this.u = printOrderViewModel;
        this.f15301s = str;
        this.p = aVar;
        this.q = aVar2;
        this.f15300r = i5;
    }
}
