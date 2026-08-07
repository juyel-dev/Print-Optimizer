package p102x3;

import B3.o;
import O3.a;
import O3.e;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import java.util.List;

/* JADX INFO: renamed from: x3.w5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2732w5 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15671o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ Object q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f15672r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f15673s;

    public /* synthetic */ C2732w5(Object obj, boolean z3, a aVar, int i5, int i6) {
        this.f15671o = i6;
        this.f15673s = obj;
        this.p = z3;
        this.q = aVar;
        this.f15672r = i5;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        int i5 = this.f15671o;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i5) {
            case 0:
                D5.a((C2413c5) this.f15673s, this.p, (a) this.q, composer, RecomposeScopeImplKt.updateChangedFlags(this.f15672r | 1));
                break;
            case 1:
                Rb.c((C2611ob) this.f15673s, this.p, (a) this.q, composer, RecomposeScopeImplKt.updateChangedFlags(this.f15672r | 1));
                break;
            default:
                Gd.a((String) this.f15673s, (List) this.q, this.p, composer, RecomposeScopeImplKt.updateChangedFlags(this.f15672r | 1));
                break;
        }
        return o.f154a;
    }

    public /* synthetic */ C2732w5(String str, List list, boolean z3, int i5) {
        this.f15671o = 2;
        this.f15673s = str;
        this.q = list;
        this.p = z3;
        this.f15672r = i5;
    }
}
