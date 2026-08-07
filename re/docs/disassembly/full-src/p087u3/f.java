package p087u3;

import C3.C;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.compose.animation.core.AnimationKt;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC2168g;
import kotlin.jvm.internal.o;
import p035i0.a;

/* JADX INFO: loaded from: classes2.dex */
public final class f {
    public static final int $stable = 8;
    private final String id;
    private final String name;
    private final int pageCount;
    private final long size;
    private final List<Bitmap> thumbnails;
    private final Uri uri;

    public f(Uri uri, String name, long j5, int i5, List<Bitmap> thumbnails, String id) {
        o.f(uri, "uri");
        o.f(name, "name");
        o.f(thumbnails, "thumbnails");
        o.f(id, "id");
        this.uri = uri;
        this.name = name;
        this.size = j5;
        this.pageCount = i5;
        this.thumbnails = thumbnails;
        this.id = id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ f copy$default(f fVar, Uri uri, String str, long j5, int i5, List list, String str2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            uri = fVar.uri;
        }
        if ((i6 & 2) != 0) {
            str = fVar.name;
        }
        String str3 = str;
        if ((i6 & 4) != 0) {
            j5 = fVar.size;
        }
        long j6 = j5;
        if ((i6 & 8) != 0) {
            i5 = fVar.pageCount;
        }
        int i7 = i5;
        if ((i6 & 16) != 0) {
            list = fVar.thumbnails;
        }
        List list2 = list;
        if ((i6 & 32) != 0) {
            str2 = fVar.id;
        }
        return fVar.copy(uri, str3, j6, i7, list2, str2);
    }

    public final Uri component1() {
        return this.uri;
    }

    public final String component2() {
        return this.name;
    }

    public final long component3() {
        return this.size;
    }

    public final int component4() {
        return this.pageCount;
    }

    public final List<Bitmap> component5() {
        return this.thumbnails;
    }

    public final String component6() {
        return this.id;
    }

    public final f copy(Uri uri, String name, long j5, int i5, List<Bitmap> thumbnails, String id) {
        o.f(uri, "uri");
        o.f(name, "name");
        o.f(thumbnails, "thumbnails");
        o.f(id, "id");
        return new f(uri, name, j5, i5, thumbnails, id);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return o.b(this.uri, fVar.uri) && o.b(this.name, fVar.name) && this.size == fVar.size && this.pageCount == fVar.pageCount && o.b(this.thumbnails, fVar.thumbnails) && o.b(this.id, fVar.id);
    }

    public final String getFormattedSize() {
        long j5 = this.size;
        if (j5 >= 1000000000) {
            return String.format("%.2f GB", Arrays.copyOf(new Object[]{Double.valueOf(j5 / 1.0E9d)}, 1));
        }
        if (j5 >= AnimationKt.MillisToNanos) {
            return String.format("%.2f MB", Arrays.copyOf(new Object[]{Double.valueOf(j5 / 1000000.0d)}, 1));
        }
        if (j5 >= 1000) {
            return String.format("%.2f KB", Arrays.copyOf(new Object[]{Double.valueOf(j5 / 1000.0d)}, 1));
        }
        return j5 + " B";
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final int getPageCount() {
        return this.pageCount;
    }

    public final long getSize() {
        return this.size;
    }

    public final List<Bitmap> getThumbnails() {
        return this.thumbnails;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public int hashCode() {
        return this.id.hashCode() + ((this.thumbnails.hashCode() + a.c(this.pageCount, (Long.hashCode(this.size) + androidx.compose.foundation.text.modifiers.a.c(this.uri.hashCode() * 31, 31, this.name)) * 31, 31)) * 31);
    }

    public String toString() {
        return "PDFDocument(uri=" + this.uri + ", name=" + this.name + ", size=" + this.size + ", pageCount=" + this.pageCount + ", thumbnails=" + this.thumbnails + ", id=" + this.id + ")";
    }

    public /* synthetic */ f(Uri uri, String str, long j5, int i5, List list, String str2, int i6, AbstractC2168g abstractC2168g) {
        this(uri, str, j5, (i6 & 8) != 0 ? 0 : i5, (i6 & 16) != 0 ? C.f167o : list, (i6 & 32) != 0 ? UUID.randomUUID().toString() : str2);
    }
}
