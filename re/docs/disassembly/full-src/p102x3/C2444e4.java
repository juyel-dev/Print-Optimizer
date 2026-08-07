package p102x3;

import B3.o;
import O3.a;
import O3.e;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;

/* JADX INFO: renamed from: x3.e4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2444e4 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14954o;
    public final /* synthetic */ String p;
    public final /* synthetic */ boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f14955r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Modifier f14956s;
    public final /* synthetic */ int t;

    public /* synthetic */ C2444e4(String str, boolean z3, a aVar, Modifier modifier, int i5, int i6) {
        this.f14954o = i6;
        this.p = str;
        this.q = z3;
        this.f14955r = aVar;
        this.f14956s = modifier;
        this.t = i5;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14954o) {
            case 0:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.t | 1);
                String str = this.p;
                a aVar = this.f14955r;
                Modifier modifier = this.f14956s;
                AbstractC2588n4.d(str, this.q, aVar, modifier, (Composer) obj, iUpdateChangedFlags);
                break;
            default:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.t | 1);
                String str2 = this.p;
                a aVar2 = this.f14955r;
                Modifier modifier2 = this.f14956s;
                A6.d(str2, this.q, aVar2, modifier2, (Composer) obj, iUpdateChangedFlags2);
                break;
        }
        return o.f154a;
    }
}
