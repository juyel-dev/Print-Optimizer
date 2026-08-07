package p087u3;

import kotlin.jvm.internal.o;
import p035i0.a;

/* JADX INFO: loaded from: classes2.dex */
public final class t {
    public static final int $stable = 0;
    private final int currentBatch;
    private final int currentPage;
    private final String status;
    private final int totalBatches;
    private final int totalPages;

    public t(int i5, int i6, int i7, int i8, String status) {
        o.f(status, "status");
        this.currentPage = i5;
        this.totalPages = i6;
        this.currentBatch = i7;
        this.totalBatches = i8;
        this.status = status;
    }

    public static /* synthetic */ t copy$default(t tVar, int i5, int i6, int i7, int i8, String str, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i5 = tVar.currentPage;
        }
        if ((i9 & 2) != 0) {
            i6 = tVar.totalPages;
        }
        int i10 = i6;
        if ((i9 & 4) != 0) {
            i7 = tVar.currentBatch;
        }
        int i11 = i7;
        if ((i9 & 8) != 0) {
            i8 = tVar.totalBatches;
        }
        int i12 = i8;
        if ((i9 & 16) != 0) {
            str = tVar.status;
        }
        return tVar.copy(i5, i10, i11, i12, str);
    }

    public final int component1() {
        return this.currentPage;
    }

    public final int component2() {
        return this.totalPages;
    }

    public final int component3() {
        return this.currentBatch;
    }

    public final int component4() {
        return this.totalBatches;
    }

    public final String component5() {
        return this.status;
    }

    public final t copy(int i5, int i6, int i7, int i8, String status) {
        o.f(status, "status");
        return new t(i5, i6, i7, i8, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.currentPage == tVar.currentPage && this.totalPages == tVar.totalPages && this.currentBatch == tVar.currentBatch && this.totalBatches == tVar.totalBatches && o.b(this.status, tVar.status);
    }

    public final int getCurrentBatch() {
        return this.currentBatch;
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final int getPercentComplete() {
        return (int) (getProgress() * 100);
    }

    public final float getProgress() {
        int i5 = this.totalPages;
        if (i5 > 0) {
            return this.currentPage / i5;
        }
        return 0.0f;
    }

    public final String getStatus() {
        return this.status;
    }

    public final int getTotalBatches() {
        return this.totalBatches;
    }

    public final int getTotalPages() {
        return this.totalPages;
    }

    public int hashCode() {
        return this.status.hashCode() + a.c(this.totalBatches, a.c(this.currentBatch, a.c(this.totalPages, Integer.hashCode(this.currentPage) * 31, 31), 31), 31);
    }

    public String toString() {
        int i5 = this.currentPage;
        int i6 = this.totalPages;
        int i7 = this.currentBatch;
        int i8 = this.totalBatches;
        String str = this.status;
        StringBuilder sbQ = a.q("ProcessingProgress(currentPage=", i5, ", totalPages=", i6, ", currentBatch=");
        sbQ.append(i7);
        sbQ.append(", totalBatches=");
        sbQ.append(i8);
        sbQ.append(", status=");
        return a.p(sbQ, str, ")");
    }
}
