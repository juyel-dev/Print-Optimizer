package p102x3;

import B3.o;
import O3.c;
import O3.e;
import android.graphics.RectF;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;

/* JADX INFO: renamed from: x3.r6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2653r6 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15487o = 0;
    public final /* synthetic */ Modifier p;
    public final /* synthetic */ long q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f15488r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f15489s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    public /* synthetic */ C2653r6(long j5, RectF rectF, B6 b6, c cVar, Modifier modifier, int i5) {
        this.q = j5;
        this.f15489s = rectF;
        this.t = b6;
        this.u = cVar;
        this.p = modifier;
        this.f15488r = i5;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15487o) {
            case 0:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f15488r | 1);
                c cVar = (c) this.u;
                Modifier modifier = this.p;
                A6.b(this.q, (RectF) this.f15489s, (B6) this.t, cVar, modifier, (Composer) obj, iUpdateChangedFlags);
                break;
            default:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.f15488r | 1);
                String str = (String) this.t;
                String str2 = (String) this.u;
                Gd.n(this.p, (ImageVector) this.f15489s, this.q, str, str2, (Composer) obj, iUpdateChangedFlags2);
                break;
        }
        return o.f154a;
    }

    public /* synthetic */ C2653r6(Modifier modifier, ImageVector imageVector, long j5, String str, String str2, int i5) {
        this.p = modifier;
        this.f15489s = imageVector;
        this.q = j5;
        this.t = str;
        this.u = str2;
        this.f15488r = i5;
    }
}
