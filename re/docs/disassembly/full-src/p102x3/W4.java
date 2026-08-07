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
import p087u3.g;

/* JADX INFO: loaded from: classes2.dex */
public final class W4 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14567o;
    public final /* synthetic */ g p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Context f14568r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f14569s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W4(g gVar, MutableState mutableState, Context context, MutableState mutableState2, d dVar) {
        super(2, dVar);
        this.p = gVar;
        this.q = mutableState;
        this.f14568r = context;
        this.f14569s = mutableState2;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new W4(this.p, this.q, this.f14568r, this.f14569s, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((W4) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        int i5 = this.f14567o;
        MutableState mutableState = this.q;
        if (i5 == 0) {
            o4.d.y(obj);
            MutableState mutableState2 = this.f14569s;
            g gVar = this.p;
            if (gVar == null || kotlin.jvm.internal.o.b(gVar.getSourceUri(), Uri.EMPTY)) {
                mutableState2.setValue(null);
            } else {
                mutableState.setValue(Boolean.TRUE);
                e4.e eVar = H.f1766a;
                e4.d dVar = e4.d.f11107o;
                V4 v4 = new V4(this.f14568r, gVar, mutableState2, null);
                this.f14567o = 1;
                if (A.C(dVar, v4, this) == aVar) {
                    return aVar;
                }
            }
            return o.f154a;
        }
        if (i5 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o4.d.y(obj);
        mutableState.setValue(Boolean.FALSE);
        return o.f154a;
    }
}
