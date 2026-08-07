package p087u3;

import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final class r {
    public static final int $stable = 0;
    private final boolean acceptingOrders;
    private final String message;

    public r(boolean z3, String str) {
        this.acceptingOrders = z3;
        this.message = str;
    }

    public static /* synthetic */ r copy$default(r rVar, boolean z3, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z3 = rVar.acceptingOrders;
        }
        if ((i5 & 2) != 0) {
            str = rVar.message;
        }
        return rVar.copy(z3, str);
    }

    public final boolean component1() {
        return this.acceptingOrders;
    }

    public final String component2() {
        return this.message;
    }

    public final r copy(boolean z3, String str) {
        return new r(z3, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.acceptingOrders == rVar.acceptingOrders && o.b(this.message, rVar.message);
    }

    public final boolean getAcceptingOrders() {
        return this.acceptingOrders;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.acceptingOrders) * 31;
        String str = this.message;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "PrintStoreStatus(acceptingOrders=" + this.acceptingOrders + ", message=" + this.message + ")";
    }
}
