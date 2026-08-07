package p104y0;

import androidx.compose.foundation.text.modifiers.a;
import p013c2.g;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f15863c;

    public o(Throwable th) {
        this.f15863c = th;
    }

    public final String toString() {
        return a.z("FAILURE (", this.f15863c.getMessage(), ")");
    }
}
