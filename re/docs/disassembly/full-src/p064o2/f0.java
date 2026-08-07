package p064o2;

import java.util.Arrays;
import p035i0.a;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 extends h0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f12133o;

    public f0(String str) {
        this.f12133o = str;
    }

    @Override // p064o2.h0
    public final int a() {
        return h0.d((byte) 96);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        h0 h0Var = (h0) obj;
        int iA = h0Var.a();
        int iD = h0.d((byte) 96);
        if (iD != iA) {
            return iD - h0Var.a();
        }
        String str = ((f0) h0Var).f12133o;
        int length = str.length();
        String str2 = this.f12133o;
        if (str2.length() == length) {
            return str2.compareTo(str);
        }
        return str2.length() - str.length();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f0.class == obj.getClass()) {
            return this.f12133o.equals(((f0) obj).f12133o);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(h0.d((byte) 96)), this.f12133o});
    }

    public final String toString() {
        return a.p(new StringBuilder("\""), this.f12133o, "\"");
    }
}
