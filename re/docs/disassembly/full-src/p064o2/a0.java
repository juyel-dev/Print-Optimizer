package p064o2;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends h0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f12126o;

    public a0(boolean z3) {
        this.f12126o = z3;
    }

    @Override // p064o2.h0
    public final int a() {
        return h0.d((byte) -32);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        h0 h0Var = (h0) obj;
        int iA = h0Var.a();
        int iD = h0.d((byte) -32);
        if (iD != iA) {
            return iD - h0Var.a();
        }
        return (true != this.f12126o ? 20 : 21) - (true != ((a0) h0Var).f12126o ? 20 : 21);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && a0.class == obj.getClass() && this.f12126o == ((a0) obj).f12126o;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(h0.d((byte) -32)), Boolean.valueOf(this.f12126o)});
    }

    public final String toString() {
        return Boolean.toString(this.f12126o);
    }
}
