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

    public final int component1() {
        return this.index;
    }

    public final Bitmap component2() {
        return this.thumbnail;
    }

    public final boolean component3() {
        return this.isSelected;
    }

    public final Uri component4() {
        return this.sourceUri;
    }

    public final int component5() {
        return this.originalPageIndex;
    }

    public final List<h> component6() {
        return this.edits;
    }

    public final Bitmap component7() {
        return this.committedImageData;
    }

    public final g copy(int i5, Bitmap bitmap, boolean z3, Uri sourceUri, int i6, List<? extends h> edits, Bitmap bitmap2) {
        o.f(sourceUri, "sourceUri");
        o.f(edits, "edits");
        return new g(i5, bitmap, z3, sourceUri, i6, edits, bitmap2);
    }

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

    public final Bitmap getCommittedImageData() {
        return this.committedImageData;
    }

    public final List<h> getEdits() {
        return this.edits;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getOriginalPageIndex() {
        return this.originalPageIndex;
    }

    public final Uri getSourceUri() {
        return this.sourceUri;
    }

    public final Bitmap getThumbnail() {
        return this.thumbnail;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.index) * 31;
        Bitmap bitmap = this.thumbnail;
        int iHashCode2 = (this.edits.hashCode() + a.c(this.originalPageIndex, (this.sourceUri.hashCode() + a.d((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31, 31, this.isSelected)) * 31, 31)) * 31;
        Bitmap bitmap2 = this.committedImageData;
        return iHashCode2 + (bitmap2 != null ? bitmap2.hashCode() : 0);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public String toString() {
        return "PDFPage(index=" + this.index + ", thumbnail=" + this.thumbnail + ", isSelected=" + this.isSelected + ", sourceUri=" + this.sourceUri + ", originalPageIndex=" + this.originalPageIndex + ", edits=" + this.edits + ", committedImageData=" + this.committedImageData + ")";
    }

    public /* synthetic */ g(int i5, Bitmap bitmap, boolean z3, Uri uri, int i6, List list, Bitmap bitmap2, int i7, AbstractC2168g abstractC2168g) {
        this(i5, (i7 & 2) != 0 ? null : bitmap, (i7 & 4) != 0 ? true : z3, (i7 & 8) != 0 ? Uri.EMPTY : uri, (i7 & 16) != 0 ? 0 : i6, (i7 & 32) != 0 ? C.f167o : list, (i7 & 64) == 0 ? bitmap2 : null);
    }
}
