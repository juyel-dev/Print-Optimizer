package p064o2;

import androidx.compose.foundation.text.modifiers.a;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: renamed from: o2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2203f implements Serializable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f12132o;

    public C2203f(Object obj) {
        this.f12132o = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2203f) {
            return AbstractC2198a.h(this.f12132o, ((C2203f) obj).f12132o);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12132o});
    }

    public final String toString() {
        return a.z("Suppliers.ofInstance(", this.f12132o.toString(), ")");
    }
}
