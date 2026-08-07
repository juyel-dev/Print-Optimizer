package p087u3;

import kotlin.jvm.internal.o;
import p035i0.a;

/* JADX INFO: loaded from: classes2.dex */
public final class p {
    public static final int $stable = 0;
    private final String awb;
    private final String courier;
    private final String estimatedDelivery;

    public p(String str, String str2, String str3) {
        this.awb = str;
        this.courier = str2;
        this.estimatedDelivery = str3;
    }

    public static /* synthetic */ p copy$default(p pVar, String str, String str2, String str3, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = pVar.awb;
        }
        if ((i5 & 2) != 0) {
            str2 = pVar.courier;
        }
        if ((i5 & 4) != 0) {
            str3 = pVar.estimatedDelivery;
        }
        return pVar.copy(str, str2, str3);
    }

    public final String component1() {
        return this.awb;
    }

    public final String component2() {
        return this.courier;
    }

    public final String component3() {
        return this.estimatedDelivery;
    }

    public final p copy(String str, String str2, String str3) {
        return new p(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return o.b(this.awb, pVar.awb) && o.b(this.courier, pVar.courier) && o.b(this.estimatedDelivery, pVar.estimatedDelivery);
    }

    public final String getAwb() {
        return this.awb;
    }

    public final String getCourier() {
        return this.courier;
    }

    public final String getEstimatedDelivery() {
        return this.estimatedDelivery;
    }

    public int hashCode() {
        String str = this.awb;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.courier;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.estimatedDelivery;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.awb;
        String str2 = this.courier;
        return a.p(a.r("PrintOrderTracking(awb=", str, ", courier=", str2, ", estimatedDelivery="), this.estimatedDelivery, ")");
    }
}
