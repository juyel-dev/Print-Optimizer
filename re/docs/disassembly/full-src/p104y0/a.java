package p104y0;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f15832a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15833b;

    public a(boolean z3) {
        this.f15833b = z3;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, (this.f15833b ? "WM.task-" : "androidx.work-") + this.f15832a.incrementAndGet());
    }
}
