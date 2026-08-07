package p102x3;

import androidx.compose.foundation.text.modifiers.a;
import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: x3.d5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2429d5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageVector f14910c;

    public C2429d5(ImageVector icon, String str, String str2) {
        o.f(icon, "icon");
        this.f14908a = str;
        this.f14909b = str2;
        this.f14910c = icon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2429d5)) {
            return false;
        }
        C2429d5 c2429d5 = (C2429d5) obj;
        return o.b(this.f14908a, c2429d5.f14908a) && o.b(this.f14909b, c2429d5.f14909b) && o.b(this.f14910c, c2429d5.f14910c);
    }

    public final int hashCode() {
        return this.f14910c.hashCode() + a.c(this.f14908a.hashCode() * 31, 31, this.f14909b);
    }

    public final String toString() {
        return "FeatureItem(title=" + this.f14908a + ", description=" + this.f14909b + ", icon=" + this.f14910c + ")";
    }
}
