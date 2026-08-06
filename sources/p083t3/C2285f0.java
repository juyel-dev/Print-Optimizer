package p083t3;

import androidx.compose.foundation.text.modifiers.a;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: t3.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2285f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f13169d;

    public C2285f0(long j5, String orderId, String rzpOrderId, String rzpKey) {
        o.f(orderId, "orderId");
        o.f(rzpOrderId, "rzpOrderId");
        o.f(rzpKey, "rzpKey");
        this.f13166a = orderId;
        this.f13167b = rzpOrderId;
        this.f13168c = rzpKey;
        this.f13169d = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2285f0)) {
            return false;
        }
        C2285f0 c2285f0 = (C2285f0) obj;
        return o.b(this.f13166a, c2285f0.f13166a) && o.b(this.f13167b, c2285f0.f13167b) && o.b(this.f13168c, c2285f0.f13168c) && this.f13169d == c2285f0.f13169d;
    }

    public final int hashCode() {
        return ((Long.hashCode(this.f13169d) + a.c(a.c(this.f13166a.hashCode() * 31, 31, this.f13167b), 31, this.f13168c)) * 31) - 1298181465;
    }

    public final String toString() {
        return "RazorpayCheckoutData(orderId=" + this.f13166a + ", rzpOrderId=" + this.f13167b + ", rzpKey=" + this.f13168c + ", amountPaise=" + this.f13169d + ", name=NotesCrafter Print Order)";
    }
}
