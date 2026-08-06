package p102x3;

import A2.t;
import B3.o;
import C3.C;
import C3.u;
import O3.a;
import O3.h;
import X3.A;
import X3.InterfaceC0200y;
import android.content.Context;
import android.graphics.RectF;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import com.notescrafter.PrintOrderViewModel;
import java.util.List;

/* JADX INFO: renamed from: x3.f4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2460f4 implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14987o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ State f14988r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ State f14989s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    public /* synthetic */ C2460f4(h hVar, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5) {
        this.f14987o = 1;
        this.u = hVar;
        this.p = mutableState;
        this.q = mutableState2;
        this.f14988r = mutableState3;
        this.f14989s = mutableState4;
        this.t = mutableState5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.a
    public final Object invoke() {
        Object bVar;
        switch (this.f14987o) {
            case 0:
                int iOrdinal = ((EnumC2604o4) ((MutableState) this.p).getValue()).ordinal();
                MutableState mutableState = (MutableState) this.q;
                MutableState mutableState2 = (MutableState) this.f14988r;
                if (iOrdinal == 0) {
                    bVar = ((EnumC2380a4) mutableState.getValue()) == EnumC2380a4.f14770o ? new u3.h.b(new RectF((RectF) mutableState2.getValue())) : new u3.h.d(new RectF((RectF) mutableState2.getValue()), -16777216);
                } else {
                    if (iOrdinal != 1) {
                        throw new t();
                    }
                    bVar = ((EnumC2380a4) mutableState.getValue()) == EnumC2380a4.f14770o ? new u3.h.a(new RectF((RectF) mutableState2.getValue())) : new u3.h.c(new RectF((RectF) mutableState2.getValue()), -16777216);
                }
                MutableState mutableState3 = (MutableState) this.f14989s;
                mutableState3.setValue(u.A0((List) mutableState3.getValue(), bVar));
                ((MutableState) this.t).setValue(C.f167o);
                ((MutableState) this.u).setValue(Boolean.FALSE);
                mutableState2.setValue(null);
                return o.f154a;
            case 1:
                ((h) this.u).invoke(Integer.valueOf(((Number) ((MutableState) this.p).getValue()).intValue()), Integer.valueOf(((Number) ((MutableState) this.q).getValue()).intValue()), Integer.valueOf(((Number) ((MutableState) this.f14988r).getValue()).intValue()), Integer.valueOf(((Number) ((MutableState) this.f14989s).getValue()).intValue()), Color.m3917boximpl(((Color) ((MutableState) this.t).getValue()).m3937unboximpl()));
                return o.f154a;
            case 2:
                if (!((Boolean) this.f14988r.getValue()).booleanValue()) {
                    A.t((InterfaceC0200y) this.q, null, null, new Hb((p092v3.h) this.t, (Context) this.u, null), 3);
                } else if (((Boolean) this.f14989s.getValue()).booleanValue()) {
                    ((a) this.p).invoke();
                }
                return o.f154a;
            default:
                Boolean bool = Boolean.TRUE;
                MutableState mutableState4 = (MutableState) this.p;
                mutableState4.setValue(bool);
                MutableState mutableState5 = (MutableState) this.q;
                mutableState5.setValue(1);
                A.t((InterfaceC0200y) this.t, null, null, new Ec((PrintOrderViewModel) this.u, mutableState5, mutableState4, (MutableState) this.f14988r, (MutableState) this.f14989s, null), 3);
                return o.f154a;
        }
    }

    public /* synthetic */ C2460f4(InterfaceC0200y interfaceC0200y, MutableState mutableState, MutableState mutableState2, PrintOrderViewModel printOrderViewModel, MutableState mutableState3, MutableState mutableState4) {
        this.f14987o = 3;
        this.t = interfaceC0200y;
        this.p = mutableState;
        this.q = mutableState2;
        this.u = printOrderViewModel;
        this.f14988r = mutableState3;
        this.f14989s = mutableState4;
    }

    public /* synthetic */ C2460f4(Object obj, Object obj2, State state, State state2, Object obj3, Object obj4, int i5) {
        this.f14987o = i5;
        this.p = obj;
        this.q = obj2;
        this.f14988r = state;
        this.f14989s = state2;
        this.t = obj3;
        this.u = obj4;
    }
}
