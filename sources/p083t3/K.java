package p083t3;

import B3.o;
import O3.h;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.Color;

/* JADX INFO: loaded from: classes2.dex */
public final class K implements h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MutableState f13033o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f13034r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f13035s;
    public final /* synthetic */ MutableState t;

    public K(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6) {
        this.f13033o = mutableState;
        this.p = mutableState2;
        this.q = mutableState3;
        this.f13034r = mutableState4;
        this.f13035s = mutableState5;
        this.t = mutableState6;
    }

    @Override // O3.h
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        long jM3937unboximpl = ((Color) obj5).m3937unboximpl();
        this.f13033o.setValue(Integer.valueOf(iIntValue));
        this.p.setValue(Integer.valueOf(iIntValue2));
        this.q.setValue(Integer.valueOf(iIntValue3));
        this.f13034r.setValue(Integer.valueOf(iIntValue4));
        this.f13035s.setValue(Color.m3917boximpl(jM3937unboximpl));
        this.t.setValue("pomodoro-timer");
        return o.f154a;
    }
}
