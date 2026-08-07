package p102x3;

import android.net.Uri;
import androidx.compose.foundation.text.modifiers.a;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: x3.re, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2661re {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f15506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f15508c;

    public C2661re(Uri uri, String str, long j5) {
        this.f15506a = uri;
        this.f15507b = str;
        this.f15508c = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2661re)) {
            return false;
        }
        C2661re c2661re = (C2661re) obj;
        return o.b(this.f15506a, c2661re.f15506a) && o.b(this.f15507b, c2661re.f15507b) && this.f15508c == c2661re.f15508c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15508c) + a.c(this.f15506a.hashCode() * 31, 31, this.f15507b);
    }

    public final String toString() {
        return "SplitFileItem(uri=" + this.f15506a + ", name=" + this.f15507b + ", size=" + this.f15508c + ")";
    }
}
