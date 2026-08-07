package p087u3;

import androidx.compose.foundation.text.modifiers.a;
import java.util.List;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final class l {
    public static final int $stable = 8;
    private final List<s> activities;
    private final String awb;
    private final String courier;
    private final String lastTrackedAt;
    private final String status;

    public l(String awb, String courier, String status, String str, List<s> activities) {
        o.f(awb, "awb");
        o.f(courier, "courier");
        o.f(status, "status");
        o.f(activities, "activities");
        this.awb = awb;
        this.courier = courier;
        this.status = status;
        this.lastTrackedAt = str;
        this.activities = activities;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ l copy$default(l lVar, String str, String str2, String str3, String str4, List list, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = lVar.awb;
        }
        if ((i5 & 2) != 0) {
            str2 = lVar.courier;
        }
        String str5 = str2;
        if ((i5 & 4) != 0) {
            str3 = lVar.status;
        }
        String str6 = str3;
        if ((i5 & 8) != 0) {
            str4 = lVar.lastTrackedAt;
        }
        String str7 = str4;
        if ((i5 & 16) != 0) {
            list = lVar.activities;
        }
        return lVar.copy(str, str5, str6, str7, list);
    }

    public final String component1() {
        return this.awb;
    }

    public final String component2() {
        return this.courier;
    }

    public final String component3() {
        return this.status;
    }

    public final String component4() {
        return this.lastTrackedAt;
    }

    public final List<s> component5() {
        return this.activities;
    }

    public final l copy(String awb, String courier, String status, String str, List<s> activities) {
        o.f(awb, "awb");
        o.f(courier, "courier");
        o.f(status, "status");
        o.f(activities, "activities");
        return new l(awb, courier, status, str, activities);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return o.b(this.awb, lVar.awb) && o.b(this.courier, lVar.courier) && o.b(this.status, lVar.status) && o.b(this.lastTrackedAt, lVar.lastTrackedAt) && o.b(this.activities, lVar.activities);
    }

    public final List<s> getActivities() {
        return this.activities;
    }

    public final String getAwb() {
        return this.awb;
    }

    public final String getCourier() {
        return this.courier;
    }

    public final String getLastTrackedAt() {
        return this.lastTrackedAt;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iC = a.c(a.c(this.awb.hashCode() * 31, 31, this.courier), 31, this.status);
        String str = this.lastTrackedAt;
        return this.activities.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.awb;
        String str2 = this.courier;
        String str3 = this.status;
        String str4 = this.lastTrackedAt;
        List<s> list = this.activities;
        StringBuilder sbR = p035i0.a.r("PrintLiveTracking(awb=", str, ", courier=", str2, ", status=");
        p061o.a.g(sbR, str3, ", lastTrackedAt=", str4, ", activities=");
        sbR.append(list);
        sbR.append(")");
        return sbR.toString();
    }
}
