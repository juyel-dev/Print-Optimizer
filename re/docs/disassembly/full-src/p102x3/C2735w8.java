package p102x3;

import B3.o;
import F3.d;
import a4.InterfaceC0208g;
import androidx.compose.runtime.MutableState;
import p035i0.a;
import p087u3.t;

/* JADX INFO: renamed from: x3.w8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2735w8 implements InterfaceC0208g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15682o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;

    public /* synthetic */ C2735w8(int i5, MutableState mutableState, MutableState mutableState2) {
        this.f15682o = i5;
        this.p = mutableState;
        this.q = mutableState2;
    }

    @Override // a4.InterfaceC0208g
    public final Object emit(Object obj, d dVar) {
        switch (this.f15682o) {
            case 0:
                t tVar = (t) obj;
                this.p.setValue(Float.valueOf(tVar.getProgress()));
                this.q.setValue(a.l("Inverting page ", tVar.getCurrentPage(), " of ", tVar.getTotalPages(), "..."));
                break;
            default:
                t tVar2 = (t) obj;
                this.p.setValue(Float.valueOf(tVar2.getProgress()));
                this.q.setValue(tVar2.getStatus());
                break;
        }
        return o.f154a;
    }
}
