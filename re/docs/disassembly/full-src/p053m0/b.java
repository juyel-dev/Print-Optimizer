package p053m0;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractCollection f11874a;

    /* JADX WARN: Multi-variable type inference failed */
    public b(List topics) {
        o.f(topics, "topics");
        this.f11874a = (AbstractCollection) topics;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.AbstractCollection, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.AbstractCollection, java.util.List] */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        ?? r1 = this.f11874a;
        b bVar = (b) obj;
        if (r1.size() != bVar.f11874a.size()) {
            return false;
        }
        return new HashSet((Collection) r1).equals(new HashSet(bVar.f11874a));
    }

    public final int hashCode() {
        return Objects.hash(this.f11874a);
    }

    public final String toString() {
        return "Topics=" + this.f11874a;
    }
}
