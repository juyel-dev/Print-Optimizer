package p053m0;

import androidx.compose.foundation.text.modifiers.a;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11877c;

    public c(long j5, long j6, int i5) {
        this.f11875a = j5;
        this.f11876b = j6;
        this.f11877c = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f11875a == cVar.f11875a && this.f11876b == cVar.f11876b && this.f11877c == cVar.f11877c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11877c) + ((Long.hashCode(this.f11876b) + (Long.hashCode(this.f11875a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaxonomyVersion=");
        sb.append(this.f11875a);
        sb.append(", ModelVersion=");
        sb.append(this.f11876b);
        sb.append(", TopicCode=");
        return a.y("Topic { ", a.o(sb, this.f11877c, " }"));
    }
}
