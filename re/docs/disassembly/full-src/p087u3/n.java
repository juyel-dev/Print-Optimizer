package p087u3;

import androidx.compose.foundation.text.modifiers.a;
import java.util.List;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final class n {
    public static final int $stable = 8;
    private final String address;
    private final String createdAt;
    private final String id;
    private final int isRefundApplicable;
    private final List<o> notebooks;
    private final String refundStatus;
    private final String status;
    private final double total;
    private final p tracking;

    public n(String id, String status, double d4, String createdAt, List<o> notebooks, String str, p pVar, int i5, String str2) {
        o.f(id, "id");
        o.f(status, "status");
        o.f(createdAt, "createdAt");
        o.f(notebooks, "notebooks");
        this.id = id;
        this.status = status;
        this.total = d4;
        this.createdAt = createdAt;
        this.notebooks = notebooks;
        this.address = str;
        this.tracking = pVar;
        this.isRefundApplicable = i5;
        this.refundStatus = str2;
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.status;
    }

    public final double component3() {
        return this.total;
    }

    public final String component4() {
        return this.createdAt;
    }

    public final List<o> component5() {
        return this.notebooks;
    }

    public final String component6() {
        return this.address;
    }

    public final p component7() {
        return this.tracking;
    }

    public final int component8() {
        return this.isRefundApplicable;
    }

    public final String component9() {
        return this.refundStatus;
    }

    public final n copy(String id, String status, double d4, String createdAt, List<o> notebooks, String str, p pVar, int i5, String str2) {
        o.f(id, "id");
        o.f(status, "status");
        o.f(createdAt, "createdAt");
        o.f(notebooks, "notebooks");
        return new n(id, status, d4, createdAt, notebooks, str, pVar, i5, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return o.b(this.id, nVar.id) && o.b(this.status, nVar.status) && Double.compare(this.total, nVar.total) == 0 && o.b(this.createdAt, nVar.createdAt) && o.b(this.notebooks, nVar.notebooks) && o.b(this.address, nVar.address) && o.b(this.tracking, nVar.tracking) && this.isRefundApplicable == nVar.isRefundApplicable && o.b(this.refundStatus, nVar.refundStatus);
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getId() {
        return this.id;
    }

    public final List<o> getNotebooks() {
        return this.notebooks;
    }

    public final String getRefundStatus() {
        return this.refundStatus;
    }

    public final String getStatus() {
        return this.status;
    }

    public final double getTotal() {
        return this.total;
    }

    public final p getTracking() {
        return this.tracking;
    }

    public int hashCode() {
        int iHashCode = (this.notebooks.hashCode() + a.c((Double.hashCode(this.total) + a.c(this.id.hashCode() * 31, 31, this.status)) * 31, 31, this.createdAt)) * 31;
        String str = this.address;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        p pVar = this.tracking;
        int iC = p035i0.a.c(this.isRefundApplicable, (iHashCode2 + (pVar == null ? 0 : pVar.hashCode())) * 31, 31);
        String str2 = this.refundStatus;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }

    public final int isRefundApplicable() {
        return this.isRefundApplicable;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.status;
        double d4 = this.total;
        String str3 = this.createdAt;
        List<o> list = this.notebooks;
        String str4 = this.address;
        p pVar = this.tracking;
        int i5 = this.isRefundApplicable;
        String str5 = this.refundStatus;
        StringBuilder sbR = p035i0.a.r("PrintOrderHistoryItem(id=", str, ", status=", str2, ", total=");
        sbR.append(d4);
        sbR.append(", createdAt=");
        sbR.append(str3);
        sbR.append(", notebooks=");
        sbR.append(list);
        sbR.append(", address=");
        sbR.append(str4);
        sbR.append(", tracking=");
        sbR.append(pVar);
        sbR.append(", isRefundApplicable=");
        sbR.append(i5);
        sbR.append(", refundStatus=");
        sbR.append(str5);
        sbR.append(")");
        return sbR.toString();
    }
}
