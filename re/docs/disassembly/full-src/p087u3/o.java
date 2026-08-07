package p087u3;

import androidx.compose.foundation.text.modifiers.a;

/* JADX INFO: loaded from: classes2.dex */
public final class o {
    public static final int $stable = 0;
    private final String name;

    public o(String name) {
        kotlin.jvm.internal.o.f(name, "name");
        this.name = name;
    }

    public static /* synthetic */ o copy$default(o oVar, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = oVar.name;
        }
        return oVar.copy(str);
    }

    public final String component1() {
        return this.name;
    }

    public final o copy(String name) {
        kotlin.jvm.internal.o.f(name, "name");
        return new o(name);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && kotlin.jvm.internal.o.b(this.name, ((o) obj).name);
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public String toString() {
        return a.z("PrintOrderNotebook(name=", this.name, ")");
    }
}
