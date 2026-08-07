package p102x3;

import androidx.compose.foundation.text.modifiers.a;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: x3.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2662s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f15512d;
    public final String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f15513f;
    public final String g;

    public C2662s(String str, long j5, String str2, String str3, String str4, String str5, String str6) {
        this.f15509a = str;
        this.f15510b = j5;
        this.f15511c = str2;
        this.f15512d = str3;
        this.e = str4;
        this.f15513f = str5;
        this.g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2662s)) {
            return false;
        }
        C2662s c2662s = (C2662s) obj;
        return o.b(this.f15509a, c2662s.f15509a) && Color.m3928equalsimpl0(this.f15510b, c2662s.f15510b) && o.b(this.f15511c, c2662s.f15511c) && o.b(this.f15512d, c2662s.f15512d) && o.b(this.e, c2662s.e) && o.b(this.f15513f, c2662s.f15513f) && o.b(this.g, c2662s.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + a.c(a.c(a.c(a.c(p035i0.a.e(this.f15510b, this.f15509a.hashCode() * 31, 31), 31, this.f15511c), 31, this.f15512d), 31, this.e), 31, this.f15513f);
    }

    public final String toString() {
        String strM3935toStringimpl = Color.m3935toStringimpl(this.f15510b);
        StringBuilder sb = new StringBuilder("CompRow(product=");
        p061o.a.g(sb, this.f15509a, ", accentColor=", strM3935toStringimpl, ", guest=");
        sb.append(this.f15511c);
        sb.append(", silver=");
        sb.append(this.f15512d);
        sb.append(", gold=");
        sb.append(this.e);
        sb.append(", platinum=");
        sb.append(this.f15513f);
        sb.append(", diamond=");
        return p035i0.a.p(sb, this.g, ")");
    }
}
