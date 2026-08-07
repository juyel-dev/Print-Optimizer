package p102x3;

import B3.c;
import B3.o;
import O3.a;
import O3.e;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.notescrafter.service.PDFProcessor;
import java.util.List;
import p087u3.b;
import p087u3.g;

/* JADX INFO: renamed from: x3.u4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2699u4 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15584o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f15585r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f15586s;
    public final /* synthetic */ c t;
    public final /* synthetic */ Modifier u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f15587v;

    public /* synthetic */ C2699u4(List list, b bVar, PDFProcessor pDFProcessor, int i5, O3.c cVar, Modifier modifier, int i6, int i7) {
        this.f15584o = i7;
        this.p = list;
        this.q = bVar;
        this.f15585r = pDFProcessor;
        this.f15586s = i5;
        this.t = cVar;
        this.u = modifier;
        this.f15587v = i6;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15584o) {
            case 0:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f15587v | 1);
                O3.c cVar = (O3.c) this.t;
                Modifier modifier = this.u;
                Z4.g((List) this.p, (b) this.q, (PDFProcessor) this.f15585r, this.f15586s, cVar, modifier, (Composer) obj, iUpdateChangedFlags);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.f15587v | 1);
                O3.c cVar2 = (O3.c) this.t;
                Modifier modifier2 = this.u;
                Z4.g((List) this.p, (b) this.q, (PDFProcessor) this.f15585r, this.f15586s, cVar2, modifier2, (Composer) obj, iUpdateChangedFlags2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(this.f15587v | 1);
                a aVar = (a) this.t;
                Modifier modifier3 = this.u;
                Ua.a((g) this.p, this.f15586s, (a) this.q, (a) this.f15585r, aVar, modifier3, (Composer) obj, iUpdateChangedFlags3);
                break;
        }
        return o.f154a;
    }

    public /* synthetic */ C2699u4(g gVar, int i5, a aVar, a aVar2, a aVar3, Modifier modifier, int i6) {
        this.f15584o = 2;
        this.p = gVar;
        this.f15586s = i5;
        this.q = aVar;
        this.f15585r = aVar2;
        this.t = aVar3;
        this.u = modifier;
        this.f15587v = i6;
    }
}
