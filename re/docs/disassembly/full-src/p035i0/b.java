package p035i0;

import B3.o;
import N0.C0135c;
import O3.c;
import X3.A;
import X3.C0194s;
import X3.D;
import X3.X;
import X3.l0;
import X3.r;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.p;
import p088v.h;
import p088v.j;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends p implements c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f11532o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i5, Object obj, Object obj2) {
        super(1);
        this.f11532o = i5;
        this.p = obj;
        this.q = obj2;
    }

    @Override // O3.c
    public final Object invoke(Object obj) throws Throwable {
        switch (this.f11532o) {
            case 0:
                Throwable th = (Throwable) obj;
                h hVar = (h) this.p;
                if (th == null) {
                    D d4 = (D) this.q;
                    d4.getClass();
                    Object obj2 = l0.f1806o.get(d4);
                    if (obj2 instanceof X) {
                        throw new IllegalStateException("This job has not completed yet");
                    }
                    if (obj2 instanceof r) {
                        throw ((r) obj2).f1816a;
                    }
                    Object objA = A.A(obj2);
                    hVar.f13387d = true;
                    j jVar = hVar.f13385b;
                    if (jVar != null && jVar.p.j(objA)) {
                        hVar.f13384a = null;
                        hVar.f13385b = null;
                        hVar.f13386c = null;
                    }
                } else if (th instanceof CancellationException) {
                    hVar.f13387d = true;
                    j jVar2 = hVar.f13385b;
                    if (jVar2 != null && jVar2.p.cancel(true)) {
                        hVar.f13384a = null;
                        hVar.f13385b = null;
                        hVar.f13386c = null;
                    }
                } else {
                    hVar.f13387d = true;
                    j jVar3 = hVar.f13385b;
                    if (jVar3 != null && jVar3.p.k(th)) {
                        hVar.f13384a = null;
                        hVar.f13385b = null;
                        hVar.f13386c = null;
                    }
                }
                return o.f154a;
            case 1:
                int iIntValue = ((Number) obj).intValue();
                return ((C0194s) this.p).invoke(Integer.valueOf(iIntValue), ((List) this.q).get(iIntValue));
            case 2:
                int iIntValue2 = ((Number) obj).intValue();
                return ((C0194s) this.p).invoke(Integer.valueOf(iIntValue2), ((List) this.q).get(iIntValue2));
            case 3:
                return ((C0135c) this.p).invoke(((List) this.q).get(((Number) obj).intValue()));
            default:
                int iIntValue3 = ((Number) obj).intValue();
                return ((C0194s) this.p).invoke(Integer.valueOf(iIntValue3), ((List) this.q).get(iIntValue3));
        }
    }
}
