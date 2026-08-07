package p087u3;

import kotlin.jvm.internal.AbstractC2168g;
import kotlin.jvm.internal.o;
import p035i0.a;

/* JADX INFO: loaded from: classes2.dex */
public final class e {
    public static final int $stable = 0;
    private final boolean addPageNumbers;
    private final boolean addSeparationLines;
    private final a documentSize;
    private final int nupColumns;
    private final int nupRows;
    private final c orientation;
    private final d quality;

    public e() {
        this(null, null, null, 0, 0, false, false, 127, null);
    }

    public static /* synthetic */ e copy$default(e eVar, d dVar, a aVar, c cVar, int i5, int i6, boolean z3, boolean z4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            dVar = eVar.quality;
        }
        if ((i7 & 2) != 0) {
            aVar = eVar.documentSize;
        }
        a aVar2 = aVar;
        if ((i7 & 4) != 0) {
            cVar = eVar.orientation;
        }
        c cVar2 = cVar;
        if ((i7 & 8) != 0) {
            i5 = eVar.nupRows;
        }
        int i8 = i5;
        if ((i7 & 16) != 0) {
            i6 = eVar.nupColumns;
        }
        int i9 = i6;
        if ((i7 & 32) != 0) {
            z3 = eVar.addSeparationLines;
        }
        boolean z5 = z3;
        if ((i7 & 64) != 0) {
            z4 = eVar.addPageNumbers;
        }
        return eVar.copy(dVar, aVar2, cVar2, i8, i9, z5, z4);
    }

    public final d component1() {
        return this.quality;
    }

    public final a component2() {
        return this.documentSize;
    }

    public final c component3() {
        return this.orientation;
    }

    public final int component4() {
        return this.nupRows;
    }

    public final int component5() {
        return this.nupColumns;
    }

    public final boolean component6() {
        return this.addSeparationLines;
    }

    public final boolean component7() {
        return this.addPageNumbers;
    }

    public final e copy(d quality, a documentSize, c orientation, int i5, int i6, boolean z3, boolean z4) {
        o.f(quality, "quality");
        o.f(documentSize, "documentSize");
        o.f(orientation, "orientation");
        return new e(quality, documentSize, orientation, i5, i6, z3, z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.quality == eVar.quality && this.documentSize == eVar.documentSize && this.orientation == eVar.orientation && this.nupRows == eVar.nupRows && this.nupColumns == eVar.nupColumns && this.addSeparationLines == eVar.addSeparationLines && this.addPageNumbers == eVar.addPageNumbers;
    }

    public final boolean getAddPageNumbers() {
        return this.addPageNumbers;
    }

    public final boolean getAddSeparationLines() {
        return this.addSeparationLines;
    }

    public final a getDocumentSize() {
        return this.documentSize;
    }

    public final int getNupColumns() {
        return this.nupColumns;
    }

    public final int getNupRows() {
        return this.nupRows;
    }

    public final c getOrientation() {
        return this.orientation;
    }

    public final d getQuality() {
        return this.quality;
    }

    public int hashCode() {
        return Boolean.hashCode(this.addPageNumbers) + a.d(a.c(this.nupColumns, a.c(this.nupRows, (this.orientation.hashCode() + ((this.documentSize.hashCode() + (this.quality.hashCode() * 31)) * 31)) * 31, 31), 31), 31, this.addSeparationLines);
    }

    public String toString() {
        return "OutputSettings(quality=" + this.quality + ", documentSize=" + this.documentSize + ", orientation=" + this.orientation + ", nupRows=" + this.nupRows + ", nupColumns=" + this.nupColumns + ", addSeparationLines=" + this.addSeparationLines + ", addPageNumbers=" + this.addPageNumbers + ")";
    }

    public e(d quality, a documentSize, c orientation, int i5, int i6, boolean z3, boolean z4) {
        o.f(quality, "quality");
        o.f(documentSize, "documentSize");
        o.f(orientation, "orientation");
        this.quality = quality;
        this.documentSize = documentSize;
        this.orientation = orientation;
        this.nupRows = i5;
        this.nupColumns = i6;
        this.addSeparationLines = z3;
        this.addPageNumbers = z4;
    }

    public /* synthetic */ e(d dVar, a aVar, c cVar, int i5, int i6, boolean z3, boolean z4, int i7, AbstractC2168g abstractC2168g) {
        this((i7 & 1) != 0 ? d.HIGH : dVar, (i7 & 2) != 0 ? a.A4 : aVar, (i7 & 4) != 0 ? c.PORTRAIT : cVar, (i7 & 8) != 0 ? 3 : i5, (i7 & 16) != 0 ? 1 : i6, (i7 & 32) != 0 ? false : z3, (i7 & 64) != 0 ? true : z4);
    }
}
