package p102x3;

import C3.C;
import C3.u;
import C3.v;
import C3.w;
import O3.a;
import O3.c;
import T3.e;
import W3.j;
import W3.q;
import androidx.compose.material3.MenuKt;
import androidx.compose.runtime.MutableState;
import com.notescrafter.utils.ExamItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import p087u3.g;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Na implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14227o;
    public final /* synthetic */ List p;
    public final /* synthetic */ c q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f14228r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f14229s;

    public /* synthetic */ Na(c cVar, MutableState mutableState, MutableState mutableState2, List list) {
        this.f14227o = 3;
        this.q = cVar;
        this.p = list;
        this.f14228r = mutableState;
        this.f14229s = mutableState2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.a
    public final Object invoke() {
        switch (this.f14227o) {
            case 0:
                MutableState mutableState = this.f14228r;
                Integer num = (Integer) mutableState.getValue();
                o.c(num);
                int iIntValue = num.intValue();
                MutableState mutableState2 = this.f14229s;
                Integer num2 = (Integer) mutableState2.getValue();
                o.c(num2);
                int iIntValue2 = num2.intValue();
                ArrayList arrayListJ0 = u.J0(this.p);
                arrayListJ0.add(iIntValue2, (g) arrayListJ0.remove(iIntValue));
                ArrayList arrayList = new ArrayList(w.Y(arrayListJ0));
                int i5 = 0;
                for (Object obj : arrayListJ0) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        v.X();
                        throw null;
                    }
                    arrayList.add(g.copy$default((g) obj, i5, null, false, null, 0, null, null, 126, null));
                    i5 = i6;
                }
                this.q.invoke(arrayList);
                mutableState.setValue(null);
                mutableState2.setValue(null);
                return B3.o.f154a;
            case 1:
                MutableState mutableState3 = this.f14228r;
                Integer numZ = q.Z((String) mutableState3.getValue());
                if (numZ != null) {
                    List list = this.p;
                    if (new e(1, list.size() + 1, 1).i(numZ.intValue())) {
                        g gVar = new g(numZ.intValue() - 1, null, true, null, 0, null, null, MenuKt.InTransitionDuration, null);
                        ArrayList arrayListJ1 = u.J0(list);
                        arrayListJ1.add(numZ.intValue() - 1, gVar);
                        ArrayList arrayList2 = new ArrayList(w.Y(arrayListJ1));
                        int i7 = 0;
                        for (Object obj2 : arrayListJ1) {
                            int i8 = i7 + 1;
                            if (i7 < 0) {
                                v.X();
                                throw null;
                            }
                            arrayList2.add(g.copy$default((g) obj2, i7, null, false, null, 0, null, null, 126, null));
                            i7 = i8;
                        }
                        this.q.invoke(arrayList2);
                    }
                }
                this.f14229s.setValue(Boolean.FALSE);
                mutableState3.setValue("");
                return B3.o.f154a;
            case 2:
                MutableState mutableState4 = this.f14228r;
                Integer num3 = (Integer) mutableState4.getValue();
                o.c(num3);
                int iIntValue3 = num3.intValue();
                List list2 = this.p;
                ArrayList arrayList3 = new ArrayList(w.Y(list2));
                int i9 = 0;
                for (Object obj3 : list2) {
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        v.X();
                        throw null;
                    }
                    g gVarCopy$default = (g) obj3;
                    if (i9 == iIntValue3) {
                        gVarCopy$default = g.copy$default(gVarCopy$default, 0, null, false, null, 0, C.f167o, null, 95, null);
                    }
                    arrayList3.add(gVarCopy$default);
                    i9 = i10;
                }
                this.q.invoke(arrayList3);
                this.f14229s.setValue(Boolean.FALSE);
                mutableState4.setValue(null);
                return B3.o.f154a;
            default:
                MutableState mutableState5 = this.f14228r;
                if (!j.m0((String) mutableState5.getValue())) {
                    this.q.invoke(u.A0(this.p, new ExamItem(0L, (String) mutableState5.getValue(), ((Number) this.f14229s.getValue()).longValue(), 1, null)));
                    mutableState5.setValue("");
                }
                return B3.o.f154a;
        }
    }

    public /* synthetic */ Na(List list, c cVar, MutableState mutableState, MutableState mutableState2, int i5) {
        this.f14227o = i5;
        this.p = list;
        this.q = cVar;
        this.f14228r = mutableState;
        this.f14229s = mutableState2;
    }
}
