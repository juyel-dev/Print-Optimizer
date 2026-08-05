package p087u3;

import android.graphics.RectF;
import kotlin.jvm.internal.AbstractC2168g;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h {
    public static final int $stable = 0;

    public static final class a extends h {
        public static final int $stable = 8;
        private final RectF rect;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(RectF rect) {
            super(null);
            o.f(rect, "rect");
            this.rect = rect;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ a copy$default(a aVar, RectF rectF, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                rectF = aVar.rect;
            }
            return aVar.copy(rectF);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final RectF component1() {
            return this.rect;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final a copy(RectF rect) {
            o.f(rect, "rect");
            return new a(rect);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && o.b(this.rect, ((a) obj).rect);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final RectF getRect() {
            return this.rect;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int hashCode() {
            return this.rect.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String toString() {
            return "InvertOval(rect=" + this.rect + ")";
        }
    }

    public static final class b extends h {
        public static final int $stable = 8;
        private final RectF rect;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(RectF rect) {
            super(null);
            o.f(rect, "rect");
            this.rect = rect;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ b copy$default(b bVar, RectF rectF, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                rectF = bVar.rect;
            }
            return bVar.copy(rectF);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final RectF component1() {
            return this.rect;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final b copy(RectF rect) {
            o.f(rect, "rect");
            return new b(rect);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && o.b(this.rect, ((b) obj).rect);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final RectF getRect() {
            return this.rect;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int hashCode() {
            return this.rect.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String toString() {
            return "InvertRect(rect=" + this.rect + ")";
        }
    }

    public static final class c extends h {
        public static final int $stable = 8;
        private final int color;
        private final RectF rect;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RectF rect, int i5) {
            super(null);
            o.f(rect, "rect");
            this.rect = rect;
            this.color = i5;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ c copy$default(c cVar, RectF rectF, int i5, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                rectF = cVar.rect;
            }
            if ((i6 & 2) != 0) {
                i5 = cVar.color;
            }
            return cVar.copy(rectF, i5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final RectF component1() {
            return this.rect;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int component2() {
            return this.color;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final c copy(RectF rect, int i5) {
            o.f(rect, "rect");
            return new c(rect, i5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return o.b(this.rect, cVar.rect) && this.color == cVar.color;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int getColor() {
            return this.color;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final RectF getRect() {
            return this.rect;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int hashCode() {
            return Integer.hashCode(this.color) + (this.rect.hashCode() * 31);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String toString() {
            return "MaskOval(rect=" + this.rect + ", color=" + this.color + ")";
        }
    }

    public static final class d extends h {
        public static final int $stable = 8;
        private final int color;
        private final RectF rect;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(RectF rect, int i5) {
            super(null);
            o.f(rect, "rect");
            this.rect = rect;
            this.color = i5;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ d copy$default(d dVar, RectF rectF, int i5, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                rectF = dVar.rect;
            }
            if ((i6 & 2) != 0) {
                i5 = dVar.color;
            }
            return dVar.copy(rectF, i5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final RectF component1() {
            return this.rect;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int component2() {
            return this.color;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final d copy(RectF rect, int i5) {
            o.f(rect, "rect");
            return new d(rect, i5);
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
            return o.b(this.rect, dVar.rect) && this.color == dVar.color;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int getColor() {
            return this.color;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final RectF getRect() {
            return this.rect;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int hashCode() {
            return Integer.hashCode(this.color) + (this.rect.hashCode() * 31);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String toString() {
            return "MaskRect(rect=" + this.rect + ", color=" + this.color + ")";
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: u3.h.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ h(AbstractC2168g abstractC2168g) {
        this();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private h() {
    }
}
