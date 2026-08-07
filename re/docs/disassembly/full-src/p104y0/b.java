package p104y0;

import A.e;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f15834a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(false));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f15835b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(true));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f15836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p100x1.b f15837d;
    public final e e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15838f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f15839h;

    public b(p100x1.b bVar) {
        String str = t.f15866a;
        this.f15836c = new s();
        this.f15837d = new p100x1.b();
        this.e = new e(27);
        this.f15838f = 4;
        this.g = Integer.MAX_VALUE;
        this.f15839h = 20;
    }
}
