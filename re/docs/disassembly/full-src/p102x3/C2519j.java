package p102x3;

import B3.o;
import M0.b;
import O3.a;
import O3.c;
import O3.e;
import O3.h;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import java.util.List;
import p087u3.l;
import p087u3.n;

/* JADX INFO: renamed from: x3.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2519j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15201o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f15202r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f15203s;
    public final /* synthetic */ Object t;

    public /* synthetic */ C2519j(a aVar, h hVar, b bVar, boolean z3, int i5) {
        this.f15201o = 2;
        this.f15203s = aVar;
        this.f15202r = hVar;
        this.t = bVar;
        this.p = z3;
        this.q = i5;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15201o) {
            case 0:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.q | 1);
                C2503i c2503i = (C2503i) this.f15202r;
                a aVar = (a) this.f15203s;
                Modifier modifier = (Modifier) this.t;
                AbstractC2535k.a(c2503i, this.p, aVar, modifier, (Composer) obj, iUpdateChangedFlags);
                break;
            case 1:
                ((Integer) obj2).intValue();
                Z4.d((String) this.f15202r, (String) this.f15203s, this.p, (c) this.t, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.q | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.q | 1);
                b bVar = (b) this.t;
                boolean z3 = this.p;
                AbstractC2642qa.a((a) this.f15203s, (h) this.f15202r, bVar, z3, (Composer) obj, iUpdateChangedFlags2);
                break;
            case 3:
                ((Integer) obj2).intValue();
                AbstractC2452ec.a((n) this.f15202r, (l) this.t, this.p, (a) this.f15203s, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.q | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(this.q | 1);
                String str = (String) this.f15203s;
                Modifier modifier2 = (Modifier) this.t;
                Gd.e((List) this.f15202r, this.p, str, modifier2, (Composer) obj, iUpdateChangedFlags3);
                break;
        }
        return o.f154a;
    }

    public /* synthetic */ C2519j(Object obj, boolean z3, Object obj2, Modifier modifier, int i5, int i6) {
        this.f15201o = i6;
        this.f15202r = obj;
        this.p = z3;
        this.f15203s = obj2;
        this.t = modifier;
        this.q = i5;
    }

    public /* synthetic */ C2519j(String str, String str2, boolean z3, c cVar, int i5) {
        this.f15201o = 1;
        this.f15202r = str;
        this.f15203s = str2;
        this.p = z3;
        this.t = cVar;
        this.q = i5;
    }

    public /* synthetic */ C2519j(n nVar, l lVar, boolean z3, a aVar, int i5) {
        this.f15201o = 3;
        this.f15202r = nVar;
        this.t = lVar;
        this.p = z3;
        this.f15203s = aVar;
        this.q = i5;
    }
}
