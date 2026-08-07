package p102x3;

import androidx.compose.foundation.text.modifiers.a;

/* JADX INFO: renamed from: x3.pe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2630pe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15426a;

    public C2630pe(int i5) {
        this.f15426a = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2630pe) && this.f15426a == ((C2630pe) obj).f15426a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15426a);
    }

    public final String toString() {
        return a.o(new StringBuilder("Resource(resId="), this.f15426a, ")");
    }
}
