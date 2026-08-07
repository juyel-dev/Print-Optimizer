package p083t3;

import B3.o;
import O3.a;
import O3.c;
import O3.e;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.notescrafter.PrintOrderViewModel;
import com.notescrafter.service.PDFProcessor;
import java.util.List;
import p087u3.b;
import p087u3.g;
import p087u3.m;
import p087u3.v;
import p092v3.h;
import p102x3.AbstractC2588n4;
import p102x3.AbstractC2595nb;
import p102x3.AbstractC2684t5;
import p102x3.Gd;
import p102x3.Z4;

/* JADX INFO: renamed from: t3.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2294k implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13187o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f13188r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f13189s;
    public final /* synthetic */ Object t;

    public /* synthetic */ C2294k(a aVar, a aVar2, a aVar3, Modifier modifier, int i5) {
        this.f13187o = 4;
        this.p = aVar;
        this.f13188r = aVar2;
        this.f13189s = aVar3;
        this.t = modifier;
        this.q = i5;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13187o) {
            case 0:
                ((Integer) obj2).intValue();
                S.d((String) this.f13188r, (String) this.f13189s, (h) this.t, (a) this.p, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.q | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.q | 1);
                a aVar = (a) this.p;
                Modifier modifier = (Modifier) this.t;
                AbstractC2588n4.a((g) this.f13188r, (c) this.f13189s, aVar, modifier, (Composer) obj, iUpdateChangedFlags);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.q | 1);
                List list = (List) this.f13189s;
                c cVar = (c) this.t;
                Modifier modifier2 = (Modifier) this.p;
                Z4.j(list, (String) this.f13188r, cVar, modifier2, (Composer) obj, iUpdateChangedFlags2);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(this.q | 1);
                g gVar = (g) this.f13188r;
                PDFProcessor pDFProcessor = (PDFProcessor) this.t;
                Modifier modifier3 = (Modifier) this.p;
                Z4.e(gVar, (b) this.f13189s, pDFProcessor, modifier3, (Composer) obj, iUpdateChangedFlags3);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags4 = RecomposeScopeImplKt.updateChangedFlags(this.q | 1);
                a aVar2 = (a) this.f13189s;
                Modifier modifier4 = (Modifier) this.t;
                AbstractC2684t5.b((a) this.p, (a) this.f13188r, aVar2, modifier4, (Composer) obj, iUpdateChangedFlags4);
                break;
            case 5:
                ((Integer) obj2).intValue();
                AbstractC2595nb.a((v) this.f13188r, (a) this.p, (a) this.f13189s, (a) this.t, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.q | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                Gd.g((m) this.f13189s, (PrintOrderViewModel) this.t, (String) this.f13188r, (a) this.p, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.q | 1));
                break;
        }
        return o.f154a;
    }

    public /* synthetic */ C2294k(Object obj, Object obj2, Object obj3, Object obj4, int i5, int i6) {
        this.f13187o = i6;
        this.f13188r = obj;
        this.f13189s = obj2;
        this.t = obj3;
        this.p = obj4;
        this.q = i5;
    }

    public /* synthetic */ C2294k(List list, String str, c cVar, Modifier modifier, int i5) {
        this.f13187o = 2;
        this.f13189s = list;
        this.f13188r = str;
        this.t = cVar;
        this.p = modifier;
        this.q = i5;
    }

    public /* synthetic */ C2294k(g gVar, c cVar, a aVar, Modifier modifier, int i5) {
        this.f13187o = 1;
        this.f13188r = gVar;
        this.f13189s = cVar;
        this.p = aVar;
        this.t = modifier;
        this.q = i5;
    }

    public /* synthetic */ C2294k(m mVar, PrintOrderViewModel printOrderViewModel, String str, a aVar, int i5) {
        this.f13187o = 6;
        this.f13189s = mVar;
        this.t = printOrderViewModel;
        this.f13188r = str;
        this.p = aVar;
        this.q = i5;
    }

    public /* synthetic */ C2294k(v vVar, a aVar, a aVar2, a aVar3, int i5) {
        this.f13187o = 5;
        this.f13188r = vVar;
        this.p = aVar;
        this.f13189s = aVar2;
        this.t = aVar3;
        this.q = i5;
    }
}
