package p087u3;

import C3.C;
import android.graphics.Bitmap;
import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.AbstractC2168g;
import kotlin.jvm.internal.o;
import p035i0.a;

/* JADX INFO: loaded from: classes2.dex */
public final class g {
    public static final int $stable = 8;
    private final Bitmap committedImageData;
    private final List<h> edits;
    private final int index;
    private final boolean isSelected;
    private final int originalPageIndex;
    private final Uri sourceUri;
    private final Bitmap thumbnail;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.List<? extends u3.h> */
    /* JADX WARN: Multi-variable type inference failed */
    public g(int i5, Bitmap bitmap, boolean z3, Uri sourceUri, int i6, List<? extends h> edits, Bitmap bitmap2) {
        o.f(sourceUri, "sourceUri");
        o.f(edits, "edits");
        this.index = i5;
        this.thumbnail = bitmap;
        this.isSelected = z3;
        this.sourceUri = sourceUri;
        this.originalPageIndex = i6;
        this.edits = edits;
        this.committedImageData = bitmap2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: u3.g */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ g copy$default(g gVar, int i5, Bitmap bitmap, boolean z3, Uri uri, int i6, List list, Bitmap bitmap2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = gVar.index;
        }
        if ((i7 & 2) != 0) {
            bitmap = gVar.thumbnail;
        }
        Bitmap bitmap3 = bitmap;
        if ((i7 & 4) != 0) {
            z3 = gVar.isSelected;
        }
        boolean z4 = z3;
        if ((i7 & 8) != 0) {
            uri = gVar.sourceUri;
        }
        Uri uri2 = uri;
        if ((i7 & 16) != 0) {
            i6 = gVar.originalPageIndex;
        }
        int i8 = i6;
        if ((i7 & 32) != 0) {
            list = gVar.edits;
        }
        List list2 = list;
        if ((i7 & 64) != 0) {
            bitmap2 = gVar.committedImageData;
        }
        return gVar.copy(i5, bitmap3, z4, uri2, i8, list2, bitmap2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int component1() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Bitmap component2() {
        return this.thumbnail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean component3() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Uri component4() {
        return this.sourceUri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int component5() {
        return this.originalPageIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<h> component6() {
        return this.edits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Bitmap component7() {
        return this.committedImageData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final g copy(int i5, Bitmap bitmap, boolean z3, Uri sourceUri, int i6, List<? extends h> edits, Bitmap bitmap2) {
        o.f(sourceUri, "sourceUri");
        o.f(edits, "edits");
        return new g(i5, bitmap, z3, sourceUri, i6, edits, bitmap2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.index == gVar.index && o.b(this.thumbnail, gVar.thumbnail) && this.isSelected == gVar.isSelected && o.b(this.sourceUri, gVar.sourceUri) && this.originalPageIndex == gVar.originalPageIndex && o.b(this.edits, gVar.edits) && o.b(this.committedImageData, gVar.committedImageData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Bitmap getCommittedImageData() {
        return this.committedImageData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<h> getEdits() {
        return this.edits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getIndex() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getOriginalPageIndex() {
        return this.originalPageIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Uri getSourceUri() {
        return this.sourceUri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Bitmap getThumbnail() {
        return this.thumbnail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.index) * 31;
        Bitmap bitmap = this.thumbnail;
        int iHashCode2 = (this.edits.hashCode() + a.c(this.originalPageIndex, (this.sourceUri.hashCode() + a.d((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31, 31, this.isSelected)) * 31, 31)) * 31;
        Bitmap bitmap2 = this.committedImageData;
        return iHashCode2 + (bitmap2 != null ? bitmap2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isSelected() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "PDFPage(index=" + this.index + ", thumbnail=" + this.thumbnail + ", isSelected=" + this.isSelected + ", sourceUri=" + this.sourceUri + ", originalPageIndex=" + this.originalPageIndex + ", edits=" + this.edits + ", committedImageData=" + this.committedImageData + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0035: CONSTRUCTOR 
  (r8v0 int)
  (wrap android.graphics.Bitmap:?: TERNARY null = ((wrap int:0x0000: ARITH (r15v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.Bitmap) : (r9v0 android.graphics.Bitmap))
  (wrap boolean:?: TERNARY null = ((wrap int:0x0008: ARITH (r15v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r10v0 boolean))
  (wrap android.net.Uri:?: TERNARY null = ((wrap int:0x000f: ARITH (r15v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0013: SGET  A[WRAPPED] (LINE:9) android.net.Uri.EMPTY android.net.Uri) : (r11v0 android.net.Uri))
  (wrap int:?: TERNARY null = ((wrap int:0x0017: ARITH (r15v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r12v0 int))
  (wrap java.util.List:?: TERNARY null = ((wrap int:0x001e: ARITH (r15v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0022: SGET  A[WRAPPED] (LINE:10) C3.C.o C3.C) : (r13v0 java.util.List))
  (wrap android.graphics.Bitmap:?: TERNARY null = ((wrap int:0x0026: ARITH (r15v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r14v0 android.graphics.Bitmap) : (null android.graphics.Bitmap))
 A[MD:(int, android.graphics.Bitmap, boolean, android.net.Uri, int, java.util.List<? extends u3.h>, android.graphics.Bitmap):void (m)] (LINE:11) call: u3.g.<init>(int, android.graphics.Bitmap, boolean, android.net.Uri, int, java.util.List, android.graphics.Bitmap):void type: THIS */
    public /* synthetic */ g(int i5, Bitmap bitmap, boolean z3, Uri uri, int i6, List list, Bitmap bitmap2, int i7, AbstractC2168g abstractC2168g) {
        this(i5, (i7 & 2) != 0 ? null : bitmap, (i7 & 4) != 0 ? true : z3, (i7 & 8) != 0 ? Uri.EMPTY : uri, (i7 & 16) != 0 ? 0 : i6, (i7 & 32) != 0 ? C.f167o : list, (i7 & 64) == 0 ? bitmap2 : null);
    }
}
