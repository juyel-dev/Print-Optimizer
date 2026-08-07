package p101x2;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
