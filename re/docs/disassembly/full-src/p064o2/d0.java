package p064o2;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends h0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f12129o;

    public d0(long j5) {
        this.f12129o = j5;
    }

    @Override // p064o2.h0
    public final int a() {
        return h0.d(this.f12129o >= 0 ? (byte) 0 : (byte) 32);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        h0 h0Var = (h0) obj;
        if (a() != h0Var.a()) {
            return a() - h0Var.a();
        }
        long jAbs = Math.abs(this.f12129o);
        long jAbs2 = Math.abs(((d0) h0Var).f12129o);
        if (jAbs < jAbs2) {
            return -1;
        }
        return jAbs > jAbs2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && d0.class == obj.getClass() && this.f12129o == ((d0) obj).f12129o;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(a()), Long.valueOf(this.f12129o)});
    }

    public final String toString() {
        return Long.toString(this.f12129o);
    }
}
