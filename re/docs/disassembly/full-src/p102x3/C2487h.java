package p102x3;

import androidx.compose.ui.graphics.Color;
import java.util.List;
import kotlin.jvm.internal.o;
import p035i0.a;

/* JADX INFO: renamed from: x3.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2487h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f15126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f15127d;
    public final List e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f15128f;
    public final long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f15129h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f15130i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f15131j;

    public /* synthetic */ C2487h(String str, String str2, double d4, double d5, List list, long j5, long j6, long j7, int i5) {
        this(str, str2, d4, d5, list, j5, j6, j7, false, i5);
    }

    public final String a() {
        return this.f15125b;
    }

    public final long b() {
        return this.g;
    }

    public final List c() {
        return this.e;
    }

    public final String d() {
        return this.f15124a;
    }

    public final int e() {
        return this.f15131j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2487h)) {
            return false;
        }
        C2487h c2487h = (C2487h) obj;
        return o.b(this.f15124a, c2487h.f15124a) && o.b(this.f15125b, c2487h.f15125b) && Double.compare(this.f15126c, c2487h.f15126c) == 0 && Double.compare(this.f15127d, c2487h.f15127d) == 0 && o.b(this.e, c2487h.e) && Color.m3928equalsimpl0(this.f15128f, c2487h.f15128f) && Color.m3928equalsimpl0(this.g, c2487h.g) && Color.m3928equalsimpl0(this.f15129h, c2487h.f15129h) && this.f15130i == c2487h.f15130i && this.f15131j == c2487h.f15131j;
    }

    public final long f() {
        return this.f15128f;
    }

    public final boolean g() {
        return this.f15130i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15131j) + a.d(a.e(this.f15129h, a.e(this.g, a.e(this.f15128f, (this.e.hashCode() + ((Double.hashCode(this.f15127d) + ((Double.hashCode(this.f15126c) + androidx.compose.foundation.text.modifiers.a.c(this.f15124a.hashCode() * 31, 31, this.f15125b)) * 31)) * 31)) * 31, 31), 31), 31), 31, this.f15130i);
    }

    public final String toString() {
        String strM3935toStringimpl = Color.m3935toStringimpl(this.f15128f);
        String strM3935toStringimpl2 = Color.m3935toStringimpl(this.g);
        String strM3935toStringimpl3 = Color.m3935toStringimpl(this.f15129h);
        StringBuilder sb = new StringBuilder("CalculatorTierConfig(name=");
        sb.append(this.f15124a);
        sb.append(", badge=");
        sb.append(this.f15125b);
        sb.append(", bwRate=");
        sb.append(this.f15126c);
        sb.append(", colorRate=");
        sb.append(this.f15127d);
        sb.append(", gradientColors=");
        sb.append(this.e);
        sb.append(", textColor=");
        sb.append(strM3935toStringimpl);
        sb.append(", borderColor=");
        p061o.a.g(sb, strM3935toStringimpl2, ", glowColor=", strM3935toStringimpl3, ", isRecommended=");
        sb.append(this.f15130i);
        sb.append(", rank=");
        return androidx.compose.foundation.text.modifiers.a.o(sb, this.f15131j, ")");
    }

    public C2487h(String str, String str2, double d4, double d5, List list, long j5, long j6, long j7, boolean z3, int i5) {
        this.f15124a = str;
        this.f15125b = str2;
        this.f15126c = d4;
        this.f15127d = d5;
        this.e = list;
        this.f15128f = j5;
        this.g = j6;
        this.f15129h = j7;
        this.f15130i = z3;
        this.f15131j = i5;
    }
}
