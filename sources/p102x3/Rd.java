package p102x3;

import androidx.compose.foundation.text.modifiers.a;
import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final class Rd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageVector f14392d;
    public final String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f14393f;

    public Rd(String str, String str2, String str3, ImageVector icon, String str4, String str5) {
        o.f(icon, "icon");
        this.f14389a = str;
        this.f14390b = str2;
        this.f14391c = str3;
        this.f14392d = icon;
        this.e = str4;
        this.f14393f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rd)) {
            return false;
        }
        Rd rd = (Rd) obj;
        return o.b(this.f14389a, rd.f14389a) && o.b(this.f14390b, rd.f14390b) && o.b(this.f14391c, rd.f14391c) && o.b(this.f14392d, rd.f14392d) && o.b(this.e, rd.e) && o.b(this.f14393f, rd.f14393f);
    }

    public final int hashCode() {
        int iC = a.c((this.f14392d.hashCode() + a.c(a.c(this.f14389a.hashCode() * 31, 31, this.f14390b), 31, this.f14391c)) * 31, 31, this.e);
        String str = this.f14393f;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuickTool(id=");
        sb.append(this.f14389a);
        sb.append(", title=");
        sb.append(this.f14390b);
        sb.append(", description=");
        sb.append(this.f14391c);
        sb.append(", icon=");
        sb.append(this.f14392d);
        sb.append(", category=");
        sb.append(this.e);
        sb.append(", route=");
        return p035i0.a.p(sb, this.f14393f, ")");
    }
}
