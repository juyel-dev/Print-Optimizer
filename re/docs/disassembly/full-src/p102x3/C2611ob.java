package p102x3;

import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: x3.ob, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2611ob {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15377b;

    public C2611ob(String str, String str2) {
        this.f15376a = str;
        this.f15377b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2611ob)) {
            return false;
        }
        C2611ob c2611ob = (C2611ob) obj;
        return o.b(this.f15376a, c2611ob.f15376a) && o.b(this.f15377b, c2611ob.f15377b);
    }

    public final int hashCode() {
        return this.f15377b.hashCode() + (this.f15376a.hashCode() * 31);
    }

    public final String toString() {
        return "PrintFaqData(question=" + this.f15376a + ", answer=" + this.f15377b + ")";
    }
}
