package p102x3;

import androidx.compose.foundation.text.modifiers.a;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: x3.c5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2413c5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f14863d;

    public C2413c5(String str, String str2, String str3, String str4) {
        this.f14860a = str;
        this.f14861b = str2;
        this.f14862c = str3;
        this.f14863d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2413c5)) {
            return false;
        }
        C2413c5 c2413c5 = (C2413c5) obj;
        return o.b(this.f14860a, c2413c5.f14860a) && o.b(this.f14861b, c2413c5.f14861b) && o.b(this.f14862c, c2413c5.f14862c) && o.b(this.f14863d, c2413c5.f14863d);
    }

    public final int hashCode() {
        return this.f14863d.hashCode() + a.c(a.c(this.f14860a.hashCode() * 31, 31, this.f14861b), 31, this.f14862c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FAQItem(id=");
        sb.append(this.f14860a);
        sb.append(", question=");
        sb.append(this.f14861b);
        sb.append(", answer=");
        sb.append(this.f14862c);
        sb.append(", category=");
        return p035i0.a.p(sb, this.f14863d, ")");
    }
}
