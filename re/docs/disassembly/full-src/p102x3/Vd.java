package p102x3;

import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.o;
import p035i0.a;

/* JADX INFO: loaded from: classes2.dex */
public final class Vd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f14541d;
    public final long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f14542f;

    public Vd(String str, String str2, String bw, String color, long j5, long j6) {
        o.f(bw, "bw");
        o.f(color, "color");
        this.f14538a = str;
        this.f14539b = str2;
        this.f14540c = bw;
        this.f14541d = color;
        this.e = j5;
        this.f14542f = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vd)) {
            return false;
        }
        Vd vd = (Vd) obj;
        return o.b(this.f14538a, vd.f14538a) && o.b(this.f14539b, vd.f14539b) && o.b(this.f14540c, vd.f14540c) && o.b(this.f14541d, vd.f14541d) && Color.m3928equalsimpl0(this.e, vd.e) && Color.m3928equalsimpl0(this.f14542f, vd.f14542f);
    }

    public final int hashCode() {
        String str = this.f14538a;
        return Color.m3934hashCodeimpl(this.f14542f) + a.e(this.e, androidx.compose.foundation.text.modifiers.a.c(androidx.compose.foundation.text.modifiers.a.c(androidx.compose.foundation.text.modifiers.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f14539b), 31, this.f14540c), 31, this.f14541d), 31);
    }

    public final String toString() {
        String strM3935toStringimpl = Color.m3935toStringimpl(this.e);
        String strM3935toStringimpl2 = Color.m3935toStringimpl(this.f14542f);
        StringBuilder sb = new StringBuilder("RateTierData(key=");
        sb.append(this.f14538a);
        sb.append(", name=");
        sb.append(this.f14539b);
        sb.append(", bw=");
        sb.append(this.f14540c);
        sb.append(", color=");
        p061o.a.g(sb, this.f14541d, ", colorRes=", strM3935toStringimpl, ", glowColor=");
        return a.p(sb, strM3935toStringimpl2, ")");
    }
}
