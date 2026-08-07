package p105y1;

/* JADX INFO: renamed from: y1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2790a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f15912b;

    public final synchronized float a() {
        synchronized (this) {
            float f5 = this.f15912b;
            if (f5 >= 0.0f) {
                return f5;
            }
            return 1.0f;
        }
    }
}
