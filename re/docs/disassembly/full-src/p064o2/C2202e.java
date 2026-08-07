package p064o2;

import androidx.compose.foundation.text.modifiers.a;
import p028g2.C2155x;

/* JADX INFO: renamed from: o2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2202e extends AbstractC2201d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C2155x f12130o;

    public C2202e(C2155x c2155x) {
        this.f12130o = c2155x;
    }

    @Override // p064o2.AbstractC2201d
    public final Object a() {
        return this.f12130o;
    }

    @Override // p064o2.AbstractC2201d
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2202e) {
            return this.f12130o.equals(((C2202e) obj).f12130o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12130o.hashCode() + 1502476572;
    }

    public final String toString() {
        return a.z("Optional.of(", this.f12130o.toString(), ")");
    }
}
