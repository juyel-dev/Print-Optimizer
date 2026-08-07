package p102x3;

import androidx.compose.foundation.text.modifiers.a;
import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final class Ze {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageVector f14759c;

    public Ze(ImageVector icon, String str, String str2) {
        o.f(icon, "icon");
        this.f14757a = str;
        this.f14758b = str2;
        this.f14759c = icon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ze)) {
            return false;
        }
        Ze ze = (Ze) obj;
        return o.b(this.f14757a, ze.f14757a) && o.b(this.f14758b, ze.f14758b) && o.b(this.f14759c, ze.f14759c);
    }

    public final int hashCode() {
        return this.f14759c.hashCode() + a.c(this.f14757a.hashCode() * 31, 31, this.f14758b);
    }

    public final String toString() {
        return "ToggleOption(value=" + this.f14757a + ", label=" + this.f14758b + ", icon=" + this.f14759c + ")";
    }
}
