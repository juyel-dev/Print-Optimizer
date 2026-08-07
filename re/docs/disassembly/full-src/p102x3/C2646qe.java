package p102x3;

import androidx.compose.ui.graphics.Color;
import p035i0.a;

/* JADX INFO: renamed from: x3.qe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2646qe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2630pe f15459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f15460d;
    public final String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f15461f;
    public final long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f15462h;

    public C2646qe(String str, String str2, C2630pe c2630pe, String str3, String str4, long j5, long j6, long j7) {
        this.f15457a = str;
        this.f15458b = str2;
        this.f15459c = c2630pe;
        this.f15460d = str3;
        this.e = str4;
        this.f15461f = j5;
        this.g = j6;
        this.f15462h = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2646qe)) {
            return false;
        }
        C2646qe c2646qe = (C2646qe) obj;
        return this.f15457a.equals(c2646qe.f15457a) && this.f15458b.equals(c2646qe.f15458b) && this.f15459c.equals(c2646qe.f15459c) && this.f15460d.equals(c2646qe.f15460d) && this.e.equals(c2646qe.e) && Color.m3928equalsimpl0(this.f15461f, c2646qe.f15461f) && Color.m3928equalsimpl0(this.g, c2646qe.g) && Color.m3928equalsimpl0(this.f15462h, c2646qe.f15462h);
    }

    public final int hashCode() {
        return Color.m3934hashCodeimpl(this.f15462h) + a.e(this.g, a.e(this.f15461f, androidx.compose.foundation.text.modifiers.a.c(androidx.compose.foundation.text.modifiers.a.c(a.c(this.f15459c.f15426a, androidx.compose.foundation.text.modifiers.a.c(this.f15457a.hashCode() * 31, 31, this.f15458b), 31), 31, this.f15460d), 31, this.e), 31), 31);
    }

    public final String toString() {
        String strM3935toStringimpl = Color.m3935toStringimpl(this.f15461f);
        String strM3935toStringimpl2 = Color.m3935toStringimpl(this.g);
        String strM3935toStringimpl3 = Color.m3935toStringimpl(this.f15462h);
        StringBuilder sb = new StringBuilder("SocialLink(name=");
        sb.append(this.f15457a);
        sb.append(", description=");
        sb.append(this.f15458b);
        sb.append(", icon=");
        sb.append(this.f15459c);
        sb.append(", url=");
        sb.append(this.f15460d);
        sb.append(", packageName=");
        p061o.a.g(sb, this.e, ", colorStart=", strM3935toStringimpl, ", colorEnd=");
        sb.append(strM3935toStringimpl2);
        sb.append(", bgTint=");
        sb.append(strM3935toStringimpl3);
        sb.append(")");
        return sb.toString();
    }
}
