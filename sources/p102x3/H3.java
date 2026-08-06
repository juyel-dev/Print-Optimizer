package p102x3;

import androidx.compose.foundation.text.modifiers.a;
import java.io.File;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final class H3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f14014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f14017d;

    public H3(File file, String str, long j5, long j6) {
        this.f14014a = file;
        this.f14015b = str;
        this.f14016c = j5;
        this.f14017d = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H3)) {
            return false;
        }
        H3 h5 = (H3) obj;
        return o.b(this.f14014a, h5.f14014a) && o.b(this.f14015b, h5.f14015b) && this.f14016c == h5.f14016c && this.f14017d == h5.f14017d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14017d) + ((Long.hashCode(this.f14016c) + a.c(this.f14014a.hashCode() * 31, 31, this.f14015b)) * 31);
    }

    public final String toString() {
        return "DownloadedFile(file=" + this.f14014a + ", name=" + this.f14015b + ", size=" + this.f14016c + ", lastModified=" + this.f14017d + ")";
    }
}
