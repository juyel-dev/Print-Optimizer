package p047l;

import androidx.compose.foundation.text.modifiers.a;

/* JADX INFO: renamed from: l.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2179j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11782a;

    public static long a(int i5, int i6) {
        return (((long) i6) & 4294967295L) | (((long) i5) << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2179j) {
            return this.f11782a == ((C2179j) obj).f11782a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f11782a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j5 = this.f11782a;
        sb.append((int) (j5 >> 32));
        sb.append(", ");
        return a.n(sb, (int) (j5 & 4294967295L), ')');
    }
}
