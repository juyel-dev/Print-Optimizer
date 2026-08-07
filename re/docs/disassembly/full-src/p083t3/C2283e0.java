package p083t3;

import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: t3.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2283e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13164c;

    public C2283e0(String str, String str2, long j5) {
        this.f13162a = str;
        this.f13163b = j5;
        this.f13164c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2283e0)) {
            return false;
        }
        C2283e0 c2283e0 = (C2283e0) obj;
        return o.b(this.f13162a, c2283e0.f13162a) && this.f13163b == c2283e0.f13163b && o.b(this.f13164c, c2283e0.f13164c);
    }

    public final int hashCode() {
        return this.f13164c.hashCode() + ((Long.hashCode(this.f13163b) + (this.f13162a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AppliedCoupon(code=" + this.f13162a + ", discountPaise=" + this.f13163b + ", description=" + this.f13164c + ")";
    }
}
