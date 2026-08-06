package p087u3;

import android.net.Uri;
import kotlin.jvm.internal.AbstractC2168g;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u {
    public static final int $stable = 0;

    public static final class a extends u {
        public static final int $stable = 8;
        private final long originalSize;
        private final Uri outputUri;
        private final long processedSize;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a(long j5, long j6, Uri uri) {
            super(null);
            this.originalSize = j5;
            this.processedSize = j6;
            this.outputUri = uri;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ a copy$default(a aVar, long j5, long j6, Uri uri, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                j5 = aVar.originalSize;
            }
            long j7 = j5;
            if ((i5 & 2) != 0) {
                j6 = aVar.processedSize;
            }
            long j8 = j6;
            if ((i5 & 4) != 0) {
                uri = aVar.outputUri;
            }
            return aVar.copy(j7, j8, uri);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final long component1() {
            return this.originalSize;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final long component2() {
            return this.processedSize;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Uri component3() {
            return this.outputUri;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final a copy(long j5, long j6, Uri uri) {
            return new a(j5, j6, uri);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.originalSize == aVar.originalSize && this.processedSize == aVar.processedSize && o.b(this.outputUri, aVar.outputUri);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final long getOriginalSize() {
            return this.originalSize;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Uri getOutputUri() {
            return this.outputUri;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final long getProcessedSize() {
            return this.processedSize;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int hashCode() {
            int iHashCode = (Long.hashCode(this.processedSize) + (Long.hashCode(this.originalSize) * 31)) * 31;
            Uri uri = this.outputUri;
            return iHashCode + (uri == null ? 0 : uri.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String toString() {
            return "Complete(originalSize=" + this.originalSize + ", processedSize=" + this.processedSize + ", outputUri=" + this.outputUri + ")";
        }
    }

    public static final class b extends u {
        public static final int $stable = 0;
        private final String message;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String message) {
            super(null);
            o.f(message, "message");
            this.message = message;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ b copy$default(b bVar, String str, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                str = bVar.message;
            }
            return bVar.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String component1() {
            return this.message;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final b copy(String message) {
            o.f(message, "message");
            return new b(message);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && o.b(this.message, ((b) obj).message);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String getMessage() {
            return this.message;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int hashCode() {
            return this.message.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String toString() {
            return androidx.compose.foundation.text.modifiers.a.z("Error(message=", this.message, ")");
        }
    }

    public static final class c extends u {
        public static final int $stable = 0;
        public static final c INSTANCE = new c();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private c() {
            super(null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int hashCode() {
            return 745118526;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String toString() {
            return "Idle";
        }
    }

    public static final class d extends u {
        public static final int $stable = 0;
        private final int currentBatch;
        private final int currentPage;
        private final float progress;
        private final String status;
        private final int totalBatches;
        private final int totalPages;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i5, int i6, int i7, int i8, float f5, String status) {
            super(null);
            o.f(status, "status");
            this.currentPage = i5;
            this.totalPages = i6;
            this.currentBatch = i7;
            this.totalBatches = i8;
            this.progress = f5;
            this.status = status;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ d copy$default(d dVar, int i5, int i6, int i7, int i8, float f5, String str, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                i5 = dVar.currentPage;
            }
            if ((i9 & 2) != 0) {
                i6 = dVar.totalPages;
            }
            int i10 = i6;
            if ((i9 & 4) != 0) {
                i7 = dVar.currentBatch;
            }
            int i11 = i7;
            if ((i9 & 8) != 0) {
                i8 = dVar.totalBatches;
            }
            int i12 = i8;
            if ((i9 & 16) != 0) {
                f5 = dVar.progress;
            }
            float f6 = f5;
            if ((i9 & 32) != 0) {
                str = dVar.status;
            }
            return dVar.copy(i5, i10, i11, i12, f6, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int component1() {
            return this.currentPage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int component2() {
            return this.totalPages;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int component3() {
            return this.currentBatch;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int component4() {
            return this.totalBatches;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final float component5() {
            return this.progress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String component6() {
            return this.status;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final d copy(int i5, int i6, int i7, int i8, float f5, String status) {
            o.f(status, "status");
            return new d(i5, i6, i7, i8, f5, status);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.currentPage == dVar.currentPage && this.totalPages == dVar.totalPages && this.currentBatch == dVar.currentBatch && this.totalBatches == dVar.totalBatches && Float.compare(this.progress, dVar.progress) == 0 && o.b(this.status, dVar.status);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int getCurrentBatch() {
            return this.currentBatch;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int getCurrentPage() {
            return this.currentPage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final float getProgress() {
            return this.progress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String getStatus() {
            return this.status;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int getTotalBatches() {
            return this.totalBatches;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int getTotalPages() {
            return this.totalPages;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int hashCode() {
            return this.status.hashCode() + p035i0.a.b(p035i0.a.c(this.totalBatches, p035i0.a.c(this.currentBatch, p035i0.a.c(this.totalPages, Integer.hashCode(this.currentPage) * 31, 31), 31), 31), 31, this.progress);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String toString() {
            int i5 = this.currentPage;
            int i6 = this.totalPages;
            int i7 = this.currentBatch;
            int i8 = this.totalBatches;
            float f5 = this.progress;
            String str = this.status;
            StringBuilder sbQ = p035i0.a.q("Processing(currentPage=", i5, ", totalPages=", i6, ", currentBatch=");
            sbQ.append(i7);
            sbQ.append(", totalBatches=");
            sbQ.append(i8);
            sbQ.append(", progress=");
            sbQ.append(f5);
            sbQ.append(", status=");
            sbQ.append(str);
            sbQ.append(")");
            return sbQ.toString();
        }
    }

    public static final class e extends u {
        public static final int $stable = 0;
        private final long originalSize;
        private final int pageCount;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public e(long j5, int i5) {
            super(null);
            this.originalSize = j5;
            this.pageCount = i5;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ e copy$default(e eVar, long j5, int i5, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                j5 = eVar.originalSize;
            }
            if ((i6 & 2) != 0) {
                i5 = eVar.pageCount;
            }
            return eVar.copy(j5, i5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final long component1() {
            return this.originalSize;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int component2() {
            return this.pageCount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final e copy(long j5, int i5) {
            return new e(j5, i5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.originalSize == eVar.originalSize && this.pageCount == eVar.pageCount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final long getOriginalSize() {
            return this.originalSize;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int getPageCount() {
            return this.pageCount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int hashCode() {
            return Integer.hashCode(this.pageCount) + (Long.hashCode(this.originalSize) * 31);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String toString() {
            return "ReadyToDownload(originalSize=" + this.originalSize + ", pageCount=" + this.pageCount + ")";
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: u3.u.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ u(AbstractC2168g abstractC2168g) {
        this();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private u() {
    }
}
