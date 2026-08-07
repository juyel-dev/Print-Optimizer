package p102x3;

import androidx.compose.foundation.text.modifiers.a;
import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final class Ld {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageVector f14181d;

    public Ld(ImageVector icon, String str, String str2, String str3) {
        o.f(icon, "icon");
        this.f14178a = str;
        this.f14179b = str2;
        this.f14180c = str3;
        this.f14181d = icon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ld)) {
            return false;
        }
        Ld ld = (Ld) obj;
        return o.b(this.f14178a, ld.f14178a) && o.b(this.f14179b, ld.f14179b) && o.b(this.f14180c, ld.f14180c) && o.b(this.f14181d, ld.f14181d);
    }

    public final int hashCode() {
        return this.f14181d.hashCode() + a.c(a.c(this.f14178a.hashCode() * 31, 31, this.f14179b), 31, this.f14180c);
    }

    public final String toString() {
        return "PrintStepData(number=" + this.f14178a + ", title=" + this.f14179b + ", desc=" + this.f14180c + ", icon=" + this.f14181d + ")";
    }
}
