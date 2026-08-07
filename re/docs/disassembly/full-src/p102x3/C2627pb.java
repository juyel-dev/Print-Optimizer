package p102x3;

import androidx.compose.foundation.text.modifiers.a;
import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: x3.pb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2627pb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageVector f15419c;

    public C2627pb(ImageVector icon, String str, String str2) {
        o.f(icon, "icon");
        this.f15417a = str;
        this.f15418b = str2;
        this.f15419c = icon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2627pb)) {
            return false;
        }
        C2627pb c2627pb = (C2627pb) obj;
        return o.b(this.f15417a, c2627pb.f15417a) && o.b(this.f15418b, c2627pb.f15418b) && o.b(this.f15419c, c2627pb.f15419c);
    }

    public final int hashCode() {
        return this.f15419c.hashCode() + a.c(this.f15417a.hashCode() * 31, 31, this.f15418b);
    }

    public final String toString() {
        return "PrintFeatureItem(title=" + this.f15417a + ", desc=" + this.f15418b + ", icon=" + this.f15419c + ")";
    }
}
