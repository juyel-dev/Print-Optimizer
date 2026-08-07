package p102x3;

import androidx.compose.foundation.text.modifiers.a;
import java.io.File;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final class G3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f13975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13977c;

    public G3(File file, String str, long j5) {
        this.f13975a = file;
        this.f13976b = str;
        this.f13977c = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G3)) {
            return false;
        }
        G3 g5 = (G3) obj;
        return o.b(this.f13975a, g5.f13975a) && o.b(this.f13976b, g5.f13976b) && this.f13977c == g5.f13977c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13977c) + a.c(this.f13975a.hashCode() * 31, 31, this.f13976b);
    }

    public final String toString() {
        return "ConvertedImageItem(file=" + this.f13975a + ", name=" + this.f13976b + ", size=" + this.f13977c + ")";
    }
}
