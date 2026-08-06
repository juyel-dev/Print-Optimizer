package p097w3;

import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.jvm.internal.o;
import p035i0.a;

/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageVector f13633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13634c;

    public r(ImageVector icon, String str, String str2) {
        o.f(icon, "icon");
        this.f13632a = str;
        this.f13633b = icon;
        this.f13634c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return o.b(this.f13632a, rVar.f13632a) && o.b(this.f13633b, rVar.f13633b) && o.b(this.f13634c, rVar.f13634c);
    }

    public final int hashCode() {
        return this.f13634c.hashCode() + ((this.f13633b.hashCode() + (this.f13632a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavItem(label=");
        sb.append(this.f13632a);
        sb.append(", icon=");
        sb.append(this.f13633b);
        sb.append(", route=");
        return a.p(sb, this.f13634c, ")");
    }
}
