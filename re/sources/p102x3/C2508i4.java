package p102x3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.pointer.PointerInputScope;

/* JADX INFO: renamed from: x3.i4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2508i4 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15174o;
    public /* synthetic */ Object p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f15175r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f15176s;
    public final /* synthetic */ MutableState t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2508i4(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, d dVar) {
        super(2, dVar);
        this.q = mutableState;
        this.f15175r = mutableState2;
        this.f15176s = mutableState3;
        this.t = mutableState4;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        C2508i4 c2508i4 = new C2508i4(this.q, this.f15175r, this.f15176s, this.t, dVar);
        c2508i4.p = obj;
        return c2508i4;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2508i4) create((PointerInputScope) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        int i5 = this.f15174o;
        if (i5 == 0) {
            o4.d.y(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.p;
            MutableState mutableState = this.t;
            MutableState mutableState2 = this.q;
            MutableState mutableState3 = this.f15175r;
            MutableState mutableState4 = this.f15176s;
            C2476g4 c2476g4 = new C2476g4(pointerInputScope, mutableState2, mutableState3, mutableState4, mutableState, 0);
            C2412c4 c2412c4 = new C2412c4(3, mutableState3, mutableState4);
            C2492h4 c2492h4 = new C2492h4(pointerInputScope, mutableState3, mutableState2, mutableState4);
            this.f15174o = 1;
            if (DragGestureDetectorKt.detectDragGestures$default(pointerInputScope, c2476g4, c2412c4, null, c2492h4, this, 4, null) == aVar) {
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
