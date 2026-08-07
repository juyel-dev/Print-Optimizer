package p102x3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.A;
import X3.H;
import X3.InterfaceC0200y;
import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.MutableState;

/* JADX INFO: renamed from: x3.t8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2687t8 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15563o;
    public final /* synthetic */ Context p;
    public final /* synthetic */ Uri q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f15564r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f15565s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2687t8(Context context, Uri uri, int i5, MutableState mutableState, d dVar) {
        super(2, dVar);
        this.p = context;
        this.q = uri;
        this.f15564r = i5;
        this.f15565s = mutableState;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2687t8(this.p, this.q, this.f15564r, this.f15565s, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2687t8) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        int i5 = this.f15563o;
        if (i5 == 0) {
            o4.d.y(obj);
            e4.e eVar = H.f1766a;
            e4.d dVar = e4.d.f11107o;
            C2671s8 c2671s8 = new C2671s8(this.p, this.q, this.f15564r, this.f15565s, null);
            this.f15563o = 1;
            if (A.C(dVar, c2671s8, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o4.d.y(obj);
        }
        return o.f154a;
    }
}
