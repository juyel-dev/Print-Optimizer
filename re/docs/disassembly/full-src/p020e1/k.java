package p020e1;

import A.e;
import A3.a;
import java.io.Closeable;
import p049l1.d;
import p049l1.h;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements Closeable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f11078o;
    public e p;
    public a q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public f1.e f11079r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a f11080s;
    public a t;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((h) ((d) this.f11080s.get())).close();
    }
}
