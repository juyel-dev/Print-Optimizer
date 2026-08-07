package p102x3;

import androidx.compose.foundation.text.modifiers.a;
import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: x3.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2503i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageVector f15169c;

    public C2503i(ImageVector icon, String str, String str2) {
        o.f(icon, "icon");
        this.f15167a = str;
        this.f15168b = str2;
        this.f15169c = icon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2503i)) {
            return false;
        }
        C2503i c2503i = (C2503i) obj;
        return o.b(this.f15167a, c2503i.f15167a) && o.b(this.f15168b, c2503i.f15168b) && o.b(this.f15169c, c2503i.f15169c);
    }

    public final int hashCode() {
        return this.f15169c.hashCode() + a.c(this.f15167a.hashCode() * 31, 31, this.f15168b);
    }

    public final String toString() {
        return "Category(id=" + this.f15167a + ", name=" + this.f15168b + ", icon=" + this.f15169c + ")";
    }
}
