package p102x3;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.jvm.internal.o;
import p035i0.a;

/* JADX INFO: loaded from: classes2.dex */
public final class G6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13987d;
    public final String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f13988f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f13989h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f13990i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageVector f13991j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f13992k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f13993l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f13994m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f13995n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f13996o;

    public G6(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z3, boolean z4, ImageVector icon, long j5, long j6, long j7, boolean z5, boolean z6, int i5) {
        boolean z7 = (i5 & Fields.SpotShadowColor) != 0 ? false : z3;
        boolean z8 = (i5 & Fields.RotationX) != 0 ? false : z4;
        boolean z9 = (i5 & Fields.Shape) != 0 ? false : z5;
        boolean z10 = (i5 & Fields.Clip) == 0 ? z6 : false;
        o.f(icon, "icon");
        this.f13984a = str;
        this.f13985b = str2;
        this.f13986c = str3;
        this.f13987d = str4;
        this.e = str5;
        this.f13988f = str6;
        this.g = str7;
        this.f13989h = z7;
        this.f13990i = z8;
        this.f13991j = icon;
        this.f13992k = j5;
        this.f13993l = j6;
        this.f13994m = j7;
        this.f13995n = z9;
        this.f13996o = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G6)) {
            return false;
        }
        G6 g6 = (G6) obj;
        return o.b(this.f13984a, g6.f13984a) && o.b(this.f13985b, g6.f13985b) && o.b(this.f13986c, g6.f13986c) && o.b(this.f13987d, g6.f13987d) && o.b(this.e, g6.e) && o.b(this.f13988f, g6.f13988f) && o.b(this.g, g6.g) && this.f13989h == g6.f13989h && this.f13990i == g6.f13990i && o.b(this.f13991j, g6.f13991j) && Color.m3928equalsimpl0(this.f13992k, g6.f13992k) && Color.m3928equalsimpl0(this.f13993l, g6.f13993l) && Color.m3928equalsimpl0(this.f13994m, g6.f13994m) && this.f13995n == g6.f13995n && this.f13996o == g6.f13996o;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13996o) + a.d(a.e(this.f13994m, a.e(this.f13993l, a.e(this.f13992k, (this.f13991j.hashCode() + a.d(a.d(androidx.compose.foundation.text.modifiers.a.c(androidx.compose.foundation.text.modifiers.a.c(androidx.compose.foundation.text.modifiers.a.c(androidx.compose.foundation.text.modifiers.a.c(androidx.compose.foundation.text.modifiers.a.c(androidx.compose.foundation.text.modifiers.a.c(this.f13984a.hashCode() * 31, 31, this.f13985b), 31, this.f13986c), 31, this.f13987d), 31, this.e), 31, this.f13988f), 31, this.g), 31, this.f13989h), 31, this.f13990i)) * 31, 31), 31), 31), 31, this.f13995n);
    }

    public final String toString() {
        String strM3935toStringimpl = Color.m3935toStringimpl(this.f13992k);
        String strM3935toStringimpl2 = Color.m3935toStringimpl(this.f13993l);
        String strM3935toStringimpl3 = Color.m3935toStringimpl(this.f13994m);
        StringBuilder sb = new StringBuilder("PassTier(id=");
        sb.append(this.f13984a);
        sb.append(", name=");
        sb.append(this.f13985b);
        sb.append(", duration=");
        sb.append(this.f13986c);
        sb.append(", durationLabel=");
        sb.append(this.f13987d);
        sb.append(", perDay=");
        sb.append(this.e);
        sb.append(", price=");
        sb.append(this.f13988f);
        sb.append(", badge=");
        sb.append(this.g);
        sb.append(", isPopular=");
        sb.append(this.f13989h);
        sb.append(", isRecommended=");
        sb.append(this.f13990i);
        sb.append(", icon=");
        sb.append(this.f13991j);
        sb.append(", accentColor=");
        sb.append(strM3935toStringimpl);
        sb.append(", borderColor=");
        p061o.a.g(sb, strM3935toStringimpl2, ", cardBg=", strM3935toStringimpl3, ", badgeIsWhite=");
        sb.append(this.f13995n);
        sb.append(", badgeIsGradient=");
        sb.append(this.f13996o);
        sb.append(")");
        return sb.toString();
    }
}
