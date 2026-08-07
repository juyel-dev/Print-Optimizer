package p010c;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f2520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f2523d;

    public u(Executor executor, l lVar) {
        o.f(executor, "executor");
        this.f2520a = executor;
        this.f2521b = new Object();
        this.f2523d = new ArrayList();
    }
}
