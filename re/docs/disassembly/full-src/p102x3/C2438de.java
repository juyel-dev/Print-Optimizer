package p102x3;

import android.net.Uri;
import androidx.compose.foundation.text.modifiers.a;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: x3.de, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2438de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f14944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14946c;

    public C2438de(Uri uri, String name, long j5) {
        o.f(uri, "uri");
        o.f(name, "name");
        this.f14944a = uri;
        this.f14945b = name;
        this.f14946c = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2438de)) {
            return false;
        }
        C2438de c2438de = (C2438de) obj;
        return o.b(this.f14944a, c2438de.f14944a) && o.b(this.f14945b, c2438de.f14945b) && this.f14946c == c2438de.f14946c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14946c) + a.c(this.f14944a.hashCode() * 31, 31, this.f14945b);
    }

    public final String toString() {
        return "SelectedImageItem(uri=" + this.f14944a + ", name=" + this.f14945b + ", size=" + this.f14946c + ")";
    }
}
