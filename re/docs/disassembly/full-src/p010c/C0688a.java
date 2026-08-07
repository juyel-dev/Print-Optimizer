package p010c;

import android.window.BackEvent;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: c.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0688a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0688a f2484a = new C0688a();

    public final BackEvent a(float f5, float f6, float f7, int i5) {
        return new BackEvent(f5, f6, f7, i5);
    }

    public final float b(BackEvent backEvent) {
        o.f(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        o.f(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        o.f(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        o.f(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
