package p102x3;

import B3.o;
import F3.d;
import a4.InterfaceC0208g;
import androidx.compose.runtime.MutableState;
import p087u3.t;

/* JADX INFO: renamed from: x3.x7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2750x7 implements InterfaceC0208g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15712o;
    public final /* synthetic */ MutableState p;

    public /* synthetic */ C2750x7(int i5, MutableState mutableState) {
        this.f15712o = i5;
        this.p = mutableState;
    }

    @Override // a4.InterfaceC0208g
    public final Object emit(Object obj, d dVar) {
        switch (this.f15712o) {
            case 0:
                this.p.setValue(Float.valueOf(((t) obj).getProgress()));
                break;
            case 1:
                this.p.setValue(Float.valueOf(((t) obj).getProgress()));
                break;
            case 2:
                C9.f(((t) obj).getProgress(), this.p);
                break;
            case 3:
                C9.f(((t) obj).getProgress(), this.p);
                break;
            default:
                C9.f(((t) obj).getProgress(), this.p);
                break;
        }
        return o.f154a;
    }
}
