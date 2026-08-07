package p102x3;

import androidx.compose.foundation.text.modifiers.a;
import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: x3.te, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2693te {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageVector f15576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f15578d;

    public C2693te(ImageVector icon, String str, String str2, int i5) {
        o.f(icon, "icon");
        this.f15575a = i5;
        this.f15576b = icon;
        this.f15577c = str;
        this.f15578d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2693te)) {
            return false;
        }
        C2693te c2693te = (C2693te) obj;
        return this.f15575a == c2693te.f15575a && o.b(this.f15576b, c2693te.f15576b) && this.f15577c.equals(c2693te.f15577c) && this.f15578d.equals(c2693te.f15578d);
    }

    public final int hashCode() {
        return this.f15578d.hashCode() + a.c((this.f15576b.hashCode() + (Integer.hashCode(this.f15575a) * 31)) * 31, 31, this.f15577c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StepData(num=");
        sb.append(this.f15575a);
        sb.append(", icon=");
        sb.append(this.f15576b);
        sb.append(", title=");
        sb.append(this.f15577c);
        sb.append(", desc=");
        return p035i0.a.p(sb, this.f15578d, ")");
    }
}
