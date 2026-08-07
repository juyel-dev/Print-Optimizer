package p102x3;

import B3.h;
import O3.e;
import androidx.compose.runtime.State;
import java.util.Map;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: x3.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2551l implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15269o;
    public final /* synthetic */ State p;

    public /* synthetic */ C2551l(State state, int i5) {
        this.f15269o = i5;
        this.p = state;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        String key = (String) obj;
        Double d4 = (Double) obj2;
        switch (this.f15269o) {
            case 0:
                double dDoubleValue = d4.doubleValue();
                o.f(key, "key");
                h hVar = (h) ((Map) this.p.getValue()).get(key);
                if (hVar != null) {
                    dDoubleValue = ((Number) hVar.f148o).doubleValue();
                }
                return Double.valueOf(dDoubleValue);
            case 1:
                double dDoubleValue2 = d4.doubleValue();
                o.f(key, "key");
                h hVar2 = (h) ((Map) this.p.getValue()).get(key);
                if (hVar2 != null) {
                    dDoubleValue2 = ((Number) hVar2.p).doubleValue();
                }
                return Double.valueOf(dDoubleValue2);
            case 2:
                double dDoubleValue3 = d4.doubleValue();
                o.f(key, "key");
                h hVar3 = (h) ((Map) this.p.getValue()).get(key);
                if (hVar3 != null) {
                    dDoubleValue3 = ((Number) hVar3.f148o).doubleValue();
                }
                return Double.valueOf(dDoubleValue3);
            case 3:
                double dDoubleValue4 = d4.doubleValue();
                o.f(key, "key");
                h hVar4 = (h) ((Map) this.p.getValue()).get(key);
                if (hVar4 != null) {
                    dDoubleValue4 = ((Number) hVar4.p).doubleValue();
                }
                return Double.valueOf(dDoubleValue4);
            case 4:
                double dDoubleValue5 = d4.doubleValue();
                o.f(key, "key");
                h hVar5 = (h) ((Map) this.p.getValue()).get(key);
                if (hVar5 != null) {
                    dDoubleValue5 = ((Number) hVar5.f148o).doubleValue();
                }
                return Double.valueOf(dDoubleValue5);
            default:
                double dDoubleValue6 = d4.doubleValue();
                o.f(key, "key");
                h hVar6 = (h) ((Map) this.p.getValue()).get(key);
                if (hVar6 != null) {
                    dDoubleValue6 = ((Number) hVar6.p).doubleValue();
                }
                return Double.valueOf(dDoubleValue6);
        }
    }
}
