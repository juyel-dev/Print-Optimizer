package p010c;

import android.window.BackEvent;
import androidx.compose.foundation.text.modifiers.a;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: c.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0689b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f2485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f2486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f2487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2488d;

    public C0689b(BackEvent backEvent) {
        o.f(backEvent, "backEvent");
        C0688a c0688a = C0688a.f2484a;
        float fD = c0688a.d(backEvent);
        float fE = c0688a.e(backEvent);
        float fB = c0688a.b(backEvent);
        int iC = c0688a.c(backEvent);
        this.f2485a = fD;
        this.f2486b = fE;
        this.f2487c = fB;
        this.f2488d = iC;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.f2485a);
        sb.append(", touchY=");
        sb.append(this.f2486b);
        sb.append(", progress=");
        sb.append(this.f2487c);
        sb.append(", swipeEdge=");
        return a.n(sb, this.f2488d, '}');
    }
}
