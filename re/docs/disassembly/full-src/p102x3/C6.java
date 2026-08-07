package p102x3;

import android.net.Uri;
import androidx.compose.foundation.text.modifiers.a;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final class C6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f13841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13844d;

    public C6(Uri uri, String name, long j5, int i5) {
        o.f(uri, "uri");
        o.f(name, "name");
        this.f13841a = uri;
        this.f13842b = name;
        this.f13843c = j5;
        this.f13844d = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6)) {
            return false;
        }
        C6 c6 = (C6) obj;
        return o.b(this.f13841a, c6.f13841a) && o.b(this.f13842b, c6.f13842b) && this.f13843c == c6.f13843c && this.f13844d == c6.f13844d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13844d) + ((Long.hashCode(this.f13843c) + a.c(this.f13841a.hashCode() * 31, 31, this.f13842b)) * 31);
    }

    public final String toString() {
        return "MergeFileItem(uri=" + this.f13841a + ", name=" + this.f13842b + ", size=" + this.f13843c + ", pageCount=" + this.f13844d + ")";
    }
}
