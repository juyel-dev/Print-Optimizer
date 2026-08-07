package p015d;

import B3.c;
import B3.o;
import O3.e;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.p;
import p003a2.a;

/* JADX INFO: loaded from: classes.dex */
public final class g extends p implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f10945o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f10946r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(boolean z3, c cVar, int i5, int i6) {
        super(2);
        this.f10945o = i6;
        this.p = z3;
        this.f10946r = cVar;
        this.q = i5;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        int i5 = this.f10945o;
        Composer composer = (Composer) obj;
        ((Number) obj2).intValue();
        switch (i5) {
            case 0:
                a.a(this.q | 1, (O3.a) this.f10946r, composer, this.p);
                break;
            default:
                p013c2.g.a(this.p, (e) this.f10946r, composer, this.q | 1);
                break;
        }
        return o.f154a;
    }
}
